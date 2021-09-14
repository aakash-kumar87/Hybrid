package com.lifecycle.testscripts.academicItems;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.library.ProgramPage;
import com.lifecycle.library.SearchResults;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class VerifyQuickLinks extends BaseDriverUtil {
	List<String> quickLinks = Arrays.asList("Fees and Payment | UNSW Current Students",
			"UNSW Academic Calendar | UNSW Current Students", "Welcome to UNSW");

	@Test(groups = { "regression", "AI" })
	public void verifyQuickLinks() throws IOException, InterruptedException, AWTException {
		String code = "4471";
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		SearchResults searchResults = homePage.performSearch(code);
		ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(code));
		List<WebElement> elements = programPage.getTabElements(Locators.ProgramPage.QUICKLINKS);
		programPage.shortWait();

		for (WebElement webElement : elements) {
			String title = programPage.newTabOpened(webElement);
			assertTrue(quickLinks.contains(title), title);
			Reporting.logResults(driver, "Pass",
					"Verify button opens link in new tab", "link opened in new tab with title that matches expected list: " + title);
		}
	}
}
