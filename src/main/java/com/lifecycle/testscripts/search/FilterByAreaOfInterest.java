package com.lifecycle.testscripts.search;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.library.SearchResults;
import com.lifecycle.locators.Locators;

public class FilterByAreaOfInterest extends BaseDriverUtil {

	@Test(groups = { "regression", "CUR-1389", "TSFS" })
	public void verifyAoIFilteringForSingleProgram() throws IOException, AWTException, InterruptedException {
		String code = "3061";
		String aoI = "Natural and Physical Sciences";

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		SearchResults searchResults = homePage.performSearch(code);
		openAoI(searchResults);


		assertTrue(searchResults.isItemWithCodeVisable(Integer.parseInt(code)));
	}

	@Test(groups = { "regression", "CUR-1389", "TSFS" })
	public void verifyAdditionalAoIfilteringForSingleProgram() throws IOException, AWTException, InterruptedException {
		String code = "4471";
		String additionalAoI = "";

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		SearchResults searchResults = homePage.performSearch(code);
		openAoI(searchResults);
	

		assertTrue(searchResults.isItemWithCodeVisable(Integer.parseInt(code)));
	}

	@Test(groups = { "regression", "CUR-1389", "TSFS" })
	public void verifySingleProgramDoesNotAppearInNonAoIFilter()
			throws IOException, AWTException, InterruptedException {
		String code = "3061";
		String aoI = "Natural and Physical Sciences";

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		SearchResults searchResults = homePage.performSearch(code);
		openAoI(searchResults);
		

		assertFalse(searchResults.isItemWithCodeVisable(Integer.parseInt(code)));
	}

	@Test(groups = { "regression", "CUR-1389", "TSFS" })
	public void verifyAoIFilteringForDAP() throws InterruptedException, IOException, AWTException {
		String code = "3061";
		String firstAoI = "Natural and Physical Sciences";
		String secondAoI = "assd";

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		SearchResults searchResults = homePage.performSearch(code);
		openAoI(searchResults);
	
		searchResults.longWait();
		assertTrue(searchResults.isItemWithCodeVisable(Integer.parseInt(code)));
	}

	@Test(groups = { "regression", "CUR-1389", "TSFS" })
	public void verifyAdditionalAoIfilteringForDAP() throws IOException, AWTException, InterruptedException {
		String code = "3961";
		String firstAoI = "Engineering and Related Technologies";
		String secondAoI = "Creative Arts";
		String additional = "Education";

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		SearchResults searchResults = homePage.performSearch(code);
		openAoI(searchResults);
	
		searchResults.longWait();
		assertTrue(searchResults.isItemWithCodeVisable(Integer.parseInt(code)));

	

		searchResults.longWait();
		assertTrue(searchResults.isItemWithCodeVisable(Integer.parseInt(code)));

		

		searchResults.longWait();
		assertTrue(searchResults.isItemWithCodeVisable(Integer.parseInt(code)));
	}

	private void selectOption(String firstAoI, SearchResults searchResults, List<WebElement> options)
			throws IOException, AWTException {
		for (WebElement webElement : options) {
			if (searchResults.getText(webElement).equalsIgnoreCase(firstAoI)) {
				searchResults.click(webElement, "element");
			}
		}
	}

	@Test(groups = { "regression", "CUR-1389", "TSFS" })
	public void verifyDAPDoesNotAppearInNonAoIFilter() throws InterruptedException, IOException, AWTException {
		String code = "3961";
		String firstAoI = "Engineering and Related Technologies";
		String secondAoI = "Creative Arts";
		String additional = "Education";

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		SearchResults searchResults = homePage.performSearch(code);
		openAoI(searchResults);
		
		searchResults.longWait();
		assertFalse(searchResults.isItemWithCodeVisable(Integer.parseInt(code)));
	}

	private void openAoI(SearchResults searchResults) throws InterruptedException, IOException, AWTException {
		searchResults.shortWait();
		searchResults.selectGrouping("program");
		searchResults.mediumWait();
	}
}
