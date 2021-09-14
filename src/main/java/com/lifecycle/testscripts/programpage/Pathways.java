package com.lifecycle.testscripts.programpage;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.util.Strings;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.library.ProgramPage;
import com.lifecycle.library.SearchResults;
import com.lifecycle.locators.Locators;

public class Pathways extends BaseDriverUtil {

	@Test(groups = { "regression" })
	public void articulationPathways() throws IOException, AWTException, InterruptedException {
		List<String> codes = Arrays.asList("3261");
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		for (String code : codes) {
			SearchResults searchResults = homePage.performSearch(code);
			ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(code));
			List<WebElement> elements = programPage.getTabElements(Locators.ProgramPage.PATHWAYS);

			WebElement element = null;

			element = findAndSelect(elements, element);

			programPage.shortWait();

			WebElement inside = element.findElement(By.xpath("div/div/div/div/p"));

			verification(inside);

			programPage.navigateHome();
		}
	}

	@Test(groups = { "regression" })
	public void honorsPathways() throws IOException, AWTException, InterruptedException {
		List<String> codes = Arrays.asList("3261");
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		for (String code : codes) {
			SearchResults searchResults = homePage.performSearch(code);
			ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(code));
			List<WebElement> elements = programPage.getTabElements(Locators.ProgramPage.PATHWAYS);

			WebElement element = null;

			element = findAndSelect(elements, element);

			programPage.shortWait();

			WebElement inside = element.findElement(By.xpath("div/div/div/div/p"));

			verification(inside);

			programPage.navigateHome();
		}
	}

	@Test(groups = { "regression" })
	public void postgraduatePathways() throws IOException, AWTException, InterruptedException {
		List<String> codes = Arrays.asList("3261", "3362");
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		for (String code : codes) {
			SearchResults searchResults = homePage.performSearch(code);
			ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(code));
			List<WebElement> elements = programPage.getTabElements(Locators.ProgramPage.PATHWAYS);

			WebElement element = null;

			element = findAndSelect(elements, element);

			programPage.shortWait();

			WebElement inside = element.findElement(By.xpath("div/div/div/div/p"));

			verification(inside);

			programPage.navigateHome();
		}
	}

	private WebElement findAndSelect(List<WebElement> elements, WebElement element) {
		for (int i = 0; i < elements.size(); i++) {

			element = elements.get(i);

			if (element.findElement(By.xpath("div/div[1]/a")).getText().contains("Expand All")) {
				break;
			}
		}

		try {
			element.findElement(By.xpath("div/div[1]/a")).click();
		} catch (NullPointerException e) {
			throw new NullPointerException("Unable to find element");
		}
		return element;
	}

	private void verification(WebElement inside) {
		assertTrue(inside.isDisplayed());
		assertTrue(Strings.isNotNullAndNotEmpty(inside.getText()));
		assertTrue(inside.getText().contains("Faculty:"));
		assertTrue(inside.getText().contains("Campus:"));
		assertTrue(inside.getText().contains("Units of Credit:"));
		assertTrue(inside.getText().contains("Typical Duration:"));
	}
}
