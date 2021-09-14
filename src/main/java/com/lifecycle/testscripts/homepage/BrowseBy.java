package com.lifecycle.testscripts.homepage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class BrowseBy extends BaseDriverUtil {
	private static Logger logger = Logger.getLogger("ActionDriver");

	@Test(groups = { "regression", "core" })
	public void verifyBrowseByAoiCount() throws IOException, AWTException {
		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage.selectByAoiTab();

		List<WebElement> elements = homePage.getTabElements(Locators.HomePage.AREAOFINTERESTTABS);

		assertEquals(elements.size(), 10, "Count mismatch");
		for (WebElement webElement : elements) {
			try {
				String text = webElement.getText();
				assertNotNull(text);
				logger.info("---" + text);
			} catch (Exception e) {
				Reporting.logResults(driver, "Fail",
						"Check there are descriptions for each tile, 10 areas of interest in total.",
						"Unalbe to locate name or describion text");
			}
		}
	}

	@Test(groups = { "regression", "core" })
	public void verifyBrowseByFacultyCount() throws IOException, AWTException {
		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage.selectByFacultyTab();
		List<WebElement> elements = homePage.getTabElements(Locators.HomePage.FACULTYCONTAINERTABS);

		assertEquals(elements.size(), 11, "Count mismatch");
		for (WebElement webElement : elements) {
			try {
				String text = webElement.getText();
				assertNotNull(text);
				logger.info("---" + text);
			} catch (Exception e) {
				Reporting.logResults(driver, "Fail",
						"Check there are descriptions for each tile, 10 areas of interest in total.",
						"Unalbe to locate name or describion text");
			}
		}
	}
}
