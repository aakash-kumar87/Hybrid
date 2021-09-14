package com.lifecycle.testscripts.search;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.SearchPage;
import com.lifecycle.reporting.Reporting;

public class VerifySearchFunctionality extends BaseDriverUtil {

	// poorly written. hacked by instantiating the page so that it will run
	@Test(groups = { "regression", "TS " })
	public void verifyFilters() throws Throwable {
		Reporting.setReportingValues(this.getClass().getName());

		try {
			setup(driver);
			SearchPage search = new SearchPage(driver);
			search.verifySearchPageBySearchButton("3409");
			search.verifySearchPageBySearchButton("Applied Geology");
			search.verifySearchPageBySearchButton("computer");
			search.assertSearch("Information Technology");
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			SearchPage searchPage = new SearchPage(driver);
			searchPage.verifySearch("Program");
			searchPage.verifySearch("Specialisation");
			searchPage.verifySearch("Course");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
