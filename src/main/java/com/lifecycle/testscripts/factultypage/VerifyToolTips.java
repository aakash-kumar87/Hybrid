package com.lifecycle.testscripts.factultypage;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ReadProperties;
import com.lifecycle.library.Constants;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class VerifyToolTips extends BaseDriverUtil {

	private Logger logger = Logger.getLogger("VerifyToolTips");

	@Test(groups = { "regression", "BR" })

	public void verifyToolTip() throws IOException, AWTException {

		Reporting.setReportingValues(this.getClass().getName());
		Map<String, String> objUIData = ReadProperties.readTestData(Constants.sUIDataFilePath, Constants.sUIData_SheetName,
				Reporting.Testcasename);

		String[] sArrLabelsToolTips = objUIData.get("Labels").split(",");
		String[] sArrLabelsAcademicPrograms = objUIData.get("AcademicPrograms").split(",");

		if (sArrLabelsToolTips.length < 1 && sArrLabelsAcademicPrograms.length < 1) {
			Reporting.logResults(driver, "Fail",
					"Verify UI Data is available to verify UI Field verification", "Could not find UI Data or is null...");
			Assert.fail("Found No data in UI_Data.xls file...");
		}
		setup(driver);

		// Iterating the loop for different acamedic programs
		for (String acadmeicitem : sArrLabelsAcademicPrograms) {
			boolean flag = search(acadmeicitem);
			if (!flag) {
				driver.findElement(Locators.HomePage.SEARCH).clear();
				continue;
			}
			WebElement studylevel = driver.findElement(Locators.AcamedicItemPage.STUDYASTOOLTIP);
			String studyleveltype = studylevel.getText();
			Actions a = new Actions(driver);
			a.moveToElement(studylevel).build().perform();
			ActionDriver action = new ActionDriver(driver);
			flag = action.isElementPresent(Locators.AcamedicItemPage.TOOLTIPSTUDYLEVELTYPE(studyleveltype));

			if (flag) {
				Reporting.logResults(driver, "Pass",
						"Verify tool tip for " + studyleveltype + " in " + acadmeicitem, "Verified tool tip for " + studyleveltype + " in " + acadmeicitem);
			} else {
				Reporting.logResults(driver, "Fail",
						"Verify tool tip for " + studyleveltype + " in " + acadmeicitem, " Tool tip not present for " + studyleveltype + " in " + acadmeicitem);
			}

			// Iterating the loop for different tooptips
			for (String string : sArrLabelsToolTips) {
				flag = action.isElementPresent(Locators.AcamedicItemPage.ACADEMICITEMINFOBUTTON(string));
				if (!flag) {
					logger.warn(string + " not found for this academic item page " + acadmeicitem);
					continue;
				}
				a.moveToElement(driver.findElement(Locators.AcamedicItemPage.ACADEMICITEMINFOBUTTON(string))).build()
						.perform();

				flag = action.isElementPresent(Locators.AcamedicItemPage.ACAMEDIC_ITEM_TOOLTIP_TRUE(string));

				if (flag) {
					Reporting.logResults(driver, "Pass",
							"Verify tool tip for " + string + " in " + acadmeicitem, "Verified tool tip for " + string + " in " + acadmeicitem);
				} else {
					Reporting.logResults(driver, "Fail",
							"Verify tool tip for " + string + " in " + acadmeicitem, " Tool tip not present for " + string + " in " + acadmeicitem);
				}
			}
			action.click(Locators.HomePage.HOMEBTN, "Home button");
		}
	}

	/**
	 * This method will find the academic program and takes user to the program page
	 * 
	 * @param acadmeicitem
	 * @return
	 * @throws HeadlessException
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean search(String acadmeicitem) throws IOException {

		boolean flag;
		try {
			ActionDriver action = new ActionDriver(driver);
			action.click(Locators.HomePage.SEARCH, "search page");
			action.enter(Locators.HomePage.SEARCH, acadmeicitem, "Search button in home page");


			flag = true;
		} catch (Exception e) {
			flag = false;
			e.getMessage();
		}
		return flag;
	}

}
