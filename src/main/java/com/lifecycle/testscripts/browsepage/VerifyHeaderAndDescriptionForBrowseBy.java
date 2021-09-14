package com.lifecycle.testscripts.browsepage;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.BrowsePage;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class VerifyHeaderAndDescriptionForBrowseBy extends BaseDriverUtil {

	@Test(groups = { "regression", "smoke" })
	public void browsePageAoiValidation() throws IOException, AWTException {
		Reporting.setReportingValues(this.getClass().getName());

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage.selectByAoiTab();

		List<WebElement> items = homePage.getTabElements(Locators.BrowsePage.AREAOFINTERESTTABS);

		for (int i = 0; i < items.size(); i++) {
			items = homePage.getTabElements(Locators.BrowsePage.AREAOFINTERESTTABS);
			String tabTitle = homePage.getText(items.get(i).findElement(By.xpath("div/h3")));
			String tabDescription = homePage
					.getText(items.get(i).findElement(By.xpath("div[@class='a-browse-tile-content']/p")));
			BrowsePage browsePage = homePage.selectAreaByName(tabTitle);
			String pageTitle = browsePage.getText(Locators.BrowsePage.TITLE);
			String pageDescription = browsePage.getText(Locators.AcamedicItemPage.DESCRIPTION);

			assertEquals(tabTitle, pageTitle);
			assertEquals(tabDescription, pageDescription);
			if (tabTitle.equalsIgnoreCase(pageTitle) && tabDescription.equalsIgnoreCase(pageDescription)) {
				Reporting.logResults(driver, "Pass",
						"Verify" + tabTitle + "and" + tabDescription + " in Area of Interest", "Verified " + tabTitle + " in Area of Interest");

			} else {
				Reporting.logResults(driver, "Fail",
						"Verify" + tabTitle + "and" + tabDescription + " in Area of Interest", "Failed to Verify " + tabTitle + " in Area of Interest");
			}
			homePage.navigateHome();
		}
	}

	@Test(groups = { "regression", "smoke" })
	public void browsePageFacultyValidation() throws IOException, AWTException {
		Reporting.setReportingValues(this.getClass().getName());

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		List<WebElement> items = homePage.getTabElements(Locators.HomePage.FACULTYCONTAINERTABS);

		for (int i = 0; i < items.size(); i++) {
			homePage.selectByFacultyTab();
			items = homePage.getTabElements(Locators.HomePage.FACULTYCONTAINERTABS);
			String tabTitle = homePage.getText(items.get(i).findElement(By.xpath("div/h3")));
			String tabDescription = homePage
					.getText(items.get(i).findElement(By.xpath("div[@class='a-browse-tile-content']/p")));
			BrowsePage browsePage = homePage.selectFacultyByName(tabTitle);
			String pageTitle = browsePage.getText(Locators.BrowsePage.TITLE);
			String pageDescription = browsePage.getText(Locators.AcamedicItemPage.DESCRIPTION);

			assertEquals(tabTitle, pageTitle);
			assertEquals(tabDescription, pageDescription);
			if (tabTitle.equalsIgnoreCase(pageTitle) && tabDescription.equalsIgnoreCase(pageDescription)) {
				Reporting.logResults(driver, "Pass",
						"Verify" + tabTitle + "and" + tabDescription + " in Area of Interest", "Verified " + tabTitle + " in Area of Interest");

			} else {
				Reporting.logResults(driver, "Fail",
						"Verify" + tabTitle + "and" + tabDescription + " in Area of Interest", "Failed to Verify " + tabTitle + " in Area of Interest");
			}
			homePage.navigateHome();
		}
	}

	@Test(groups = { "regression", "smoke", "long" })
	public void browsePageSubjectAreaValidationSecondHalf() throws IOException, AWTException {
		Reporting.setReportingValues(this.getClass().getName());

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		List<WebElement> items = homePage.getTabElements(Locators.HomePage.SUBJECTAREATABS);

		for (int i = items.size() / 2; i < items.size(); i++) {
			homePage.selectBySubjectTab();
			items = homePage.getTabElements(Locators.HomePage.SUBJECTAREATABS);
			String tabTitle = homePage.getText(items.get(i).findElement(By.xpath("div/h3")));

			BrowsePage browsePage = homePage.selectSubjectAreaByName(tabTitle);
			String pageTitle = browsePage.getText(Locators.BrowsePage.TITLE);

			assertEquals(tabTitle, pageTitle);
			if (tabTitle.equalsIgnoreCase(pageTitle)) {
				Reporting.logResults(driver, "Pass", "Verify" + tabTitle, "Verified " + tabTitle + " in Subject area");

			} else {
				Reporting.logResults(driver, "Fail",
						"Verify" + tabTitle + " in Subject area", "Failed to Verify " + tabTitle + " in Subject area");
			}
			homePage.navigateHome();
		}
	}

	@Test(groups = { "regression", "smoke", "long" })
	public void browsePageSubjectAreaValidationFirstHalf() throws IOException, AWTException {
		Reporting.setReportingValues(this.getClass().getName());

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage.selectBySubjectTab();
		List<WebElement> items = homePage.getTabElements(Locators.HomePage.SUBJECTAREATABS);

		for (int i = 0; i < items.size() / 2; i++) {
			homePage.selectBySubjectTab();
			items = homePage.getTabElements(Locators.HomePage.SUBJECTAREATABS);
			String tabTitle = homePage.getText(items.get(i).findElement(By.xpath("div/h3")));

			BrowsePage browsePage = homePage.selectSubjectAreaByName(tabTitle);
			String pageTitle = browsePage.getText(Locators.BrowsePage.TITLE);

			assertEquals(tabTitle, pageTitle);
			if (tabTitle.equalsIgnoreCase(pageTitle)) {
				Reporting.logResults(driver, "Pass", "Verify" + tabTitle, "Verified " + tabTitle + " in Subject area");

			} else {
				Reporting.logResults(driver, "Fail",
						"Verify" + tabTitle + " in Subject area", "Failed to Verify " + tabTitle + " in Subject area");
			}
			homePage.navigateHome();
		}
	}
}
