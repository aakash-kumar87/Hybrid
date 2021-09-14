package com.lifecycle.testscripts.search;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.BrowsePage;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.library.SearchResults;
import com.lifecycle.locators.Locators;

public class FiltersAppliedFromFacultyPage extends BaseDriverUtil {

	@Test(groups = { "regression", "CUR-1308" })
	public void specializationFilter() throws IOException, AWTException, InterruptedException {

		setup(driver);

		compareResultTotals(Locators.BrowsePage.Undergraduate.SPECIALPROGRAMLISTVIEWMORE,
				Locators.BrowsePage.Undergraduate.SPECIALPROGRAMLIST,
				Locators.BrowsePage.Undergraduate.SPECIALPROGRAMLISTSEARCH, "undergraduate");

		compareResultTotals(Locators.BrowsePage.Postgraduate.SPECIALPROGRAMLISTVIEWMORE,
				Locators.BrowsePage.Postgraduate.SPECIALPROGRAMLIST,
				Locators.BrowsePage.Postgraduate.SPECIALPROGRAMLISTSEARCH, "postgraduate");
	}

	@Test(groups = { "regression", "CUR-1308" })
	public void programFilter() throws IOException, AWTException, InterruptedException {
		setup(driver);

		compareResultTotals(Locators.BrowsePage.Undergraduate.PROGRAMLISTVIEWMORE,
				Locators.BrowsePage.Undergraduate.PROGRAMLIST, Locators.BrowsePage.Undergraduate.PROGRAMLISTSEARCH,
				"undergraduate");

		compareResultTotals(Locators.BrowsePage.Postgraduate.PROGRAMLISTVIEWMORE,
				Locators.BrowsePage.Postgraduate.PROGRAMLIST, Locators.BrowsePage.Postgraduate.PROGRAMLISTSEARCH,
				"postgraduate");
	}

	@Test(groups = { "regression", "CUR-1308", "CUR-1342" })
	public void doubleDegreeFilter() throws IOException, AWTException, InterruptedException {
		setup(driver);

		compareResultTotals(Locators.BrowsePage.Undergraduate.DOUBLEDEGREEPROGRAMLISTVIEWMORE,
				Locators.BrowsePage.Undergraduate.DOUBLEDEGREEPROGRAMLIST,
				Locators.BrowsePage.Undergraduate.DOUBLEDEGREEPROGRAMLISTSEARCH, "undergraduate");
	}

	@Test(groups = { "regression", "CUR-1308" })
	public void courseFilter() throws IOException, AWTException, InterruptedException {
		setup(driver);

		compareResultTotals(Locators.BrowsePage.Undergraduate.COURSEPROGRAMLISTVIEWMORE,
				Locators.BrowsePage.Undergraduate.COURSEPROGRAMLIST,
				Locators.BrowsePage.Undergraduate.COURSEPROGRAMLISTSEARCH, "undergraduate");

		compareResultTotals(Locators.BrowsePage.Postgraduate.COURSEPROGRAMLISTVIEWMORE,
				Locators.BrowsePage.Postgraduate.COURSEPROGRAMLIST,
				Locators.BrowsePage.Postgraduate.COURSEPROGRAMLISTSEARCH, "postgraduate");
	}

	private void compareResultTotals(By viewMore, By programList, By searchButton, String educationLevel)
			throws IOException, InterruptedException, AWTException {

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage.selectByFacultyTab();
		BrowsePage browsePage = homePage.selectBrowseTypeByIndex(Locators.HomePage.FACULTYCONTAINERTABS, 4);

		browsePage.selectEducationLevel(educationLevel);
		browsePage.expandSection(viewMore);
		int numberOfItems = browsePage.getTabElements(programList).size();

		SearchResults searchResults = browsePage.selectGoToSearch(searchButton);
		searchResults.selectEducationLevel("undergraduate");

		searchResults.navigateHome();
	}
}
