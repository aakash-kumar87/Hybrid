package com.lifecycle.testscripts.browsepage;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.BrowsePage;
import com.lifecycle.reporting.Reporting;

public class VerifyHeaderAndDescriptionForAOIAndFaculty extends BaseDriverUtil {

	@Test(groups = { "regression", "FAI" })
	public void browsePageValidation() throws IOException, AWTException {
		Reporting.setReportingValues(this.getClass().getName());

		try {
			setup(driver);
			BrowsePage browse = new BrowsePage(driver);
			browse.areaOfInterst();
			browse.verifyAreadOfInterstValidation();
			browse.verifyByFacultyValidation();
		} catch (Exception e) {
			Reporting.logResults(driver, "Fail", "Browse page validation", "Browse page validation Failed");
		}
	}
}
