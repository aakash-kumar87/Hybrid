package com.lifecycle.testscripts.search;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.library.SearchResults;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class VerifyFiltersInSearchPage extends BaseDriverUtil {

	List<String> specialisationType = Arrays.asList("Major", "Minor", "Honours");

	@Test(groups = { "regression", "CUR-990" })
	public void programPostGradSwitcher() throws IOException, InterruptedException, AWTException {
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		SearchResults searchResults = homePage.performSearch("Engineering");
		searchResults.shortWait();
		searchResults.selectGrouping("program");
		searchResults.mediumWait();
		}

	@Test(groups = { "regression", "CUR-990" })
	public void specialPostGradSwitcher() throws InterruptedException, IOException, AWTException {
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		SearchResults searchResults = homePage.performSearch("Engineering");
		searchResults.mediumWait();
		searchResults.selectGrouping("specialisation");
		searchResults.mediumWait();
	
	}

	@Test(groups = { "regression", "CUR-990" })
	public void coursePostGradSwitcher() throws IOException, InterruptedException, AWTException {
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		SearchResults searchResults = homePage.performSearch("Engineering");
		searchResults.mediumWait();
		searchResults.selectGrouping("course");
		searchResults.mediumWait();
		searchResults.selectEducationLevel("undergraduate");

		}

}
