package com.lifecycle.testscripts.search;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.SearchPage;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class VerifyResultsForProgramsBasedonFilterSelection extends BaseDriverUtil {

	static String program = "Program";

	@Test(groups = { "regression", "TSFS  " })
	public void verifyFilters() {
		Reporting.setReportingValues(this.getClass().getName());

		try {
			setup(driver);
			ActionDriver action = new ActionDriver(driver);
			action.enter(Locators.HomePage.SEARCH, "computer", "Search input text in home page");
			action.click(Locators.HomePage.SEARCHBUTTON, "Search button");
			Thread.sleep(500);
			SearchPage searchPage = new SearchPage(driver);
			searchPage.searchFilters("Program");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
