package com.lifecycle.testscripts.factultypage;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ReadProperties;
import com.lifecycle.library.Constants;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class VerifyEmbeddedStructure extends BaseDriverUtil {

	private boolean flag;

	private static Map<String, String> objUIData = null;
	private static String[] sArrLabels_AcademicPrograms;
	private static Logger logger = Logger.getLogger("VerifyEmbeddedStructure");

	@Test(groups = { "regression", "CUR-1550" })
	public void verifyembeddedstructure() throws IOException, InterruptedException {
		Reporting.setReportingValues(this.getClass().getName());

		try {

			objUIData = ReadProperties.readTestData(Constants.sUIDataFilePath, Constants.sUIData_SheetName,
					Reporting.Testcasename);

			sArrLabels_AcademicPrograms = objUIData.get("AcademicPrograms").split(",");
			if (sArrLabels_AcademicPrograms.length < 1) {
				Reporting.logResults(driver, "Fail",
						"Verify UI Data is available to verify UI Field verification", "Could not find UI Data or is null...");
				Assert.fail("Found No data in UI_Data.xls file...");
			}

			setup(driver);

			// Iterating the loop for different acamedic programs
			for (String acadmeicitem : sArrLabels_AcademicPrograms) {
				flag = search(acadmeicitem);
				if (!flag) {
					driver.findElement(Locators.HomePage.SEARCH).clear();
					Reporting.logResults(driver, "Fail", "Academic item " + acadmeicitem, acadmeicitem + "Not visible ");
					continue;
				}
				ActionDriver action = new ActionDriver(driver);
				action.scrollToView(Locators.AcamedicItemPage.SPECIALREQUIRMENTS, "Special requirements");
				action.click(Locators.AcamedicItemPage.SPECIALREQUIRMENTS, "Special requirements tab");

				List<WebElement> items = driver.findElements(Locators.AcamedicItemPage.EMBEDDEDSTRUCTUREITEMS);

				for (int i = 1; i <= items.size(); i++) {

					String text = driver.findElement(By.xpath(
							"(//div[@class='m-single-course-wrapper'][@data-hbui-filter-item='specialisation']/a/div/span[1])["
									+ i + "]"))
							.getText();
					action.click(By.xpath(
							"(//div[@class='m-single-course-wrapper'][@data-hbui-filter-item='specialisation']/a)[" + i
									+ "]"),
							"special");
					Thread.sleep(1000);
					if (driver.findElement(By.xpath("//div[@class='sliding-panel_content']")).isDisplayed()) {
						Reporting.logResults(driver, "Pass",
								"Verify Embedded structure", "Verified embedded structure for " + text);
					} else {
						Reporting.logResults(driver, "Fail",
								"Verify Embedded structure", " embedded structure not available for  " + text);
					}

					action.click(By.xpath("//button[text()='arrow_back']"), "Navigate Back");
					Thread.sleep(500);
				}
				action.click(Locators.HomePage.HOMEBTN, "Home button");
			}
		} catch (Exception e) {
			e.getMessage();
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
