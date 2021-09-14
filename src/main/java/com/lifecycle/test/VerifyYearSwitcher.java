package com.lifecycle.test;

import static org.testng.Assert.assertTrue;

import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ReadProperties;
import com.lifecycle.library.Constants;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class VerifyYearSwitcher extends BaseDriverUtil {

	private Logger logger = Logger.getLogger("VerifyYearSwitcher");

	@Test(groups = { "regression", "CUR-1595" })
	public void yearSwitcher() {
		try {
			Reporting.setReportingValues(this.getClass().getName());
			Map<String, String> objUIData = ReadProperties.readTestData(Constants.sUIDataFilePath,
					Constants.sUIData_SheetName, Reporting.Testcasename);
			String[] sArrLabelsAcademicPrograms = objUIData.get("AcademicPrograms").split(",");

			if (sArrLabelsAcademicPrograms.length < 1) {
				Reporting.logResults(driver, "Fail", "Verify UI Data is available to verify UI Field verification",
						"Could not find UI Data or is null...");
				Assert.fail("Found No data in UI_Data.xls file...");
			}

			setup(driver);
			CurriculumHomePage home = new CurriculumHomePage(driver);
			home.search("3458");
			String year = driver.findElement(By.xpath("//button[@class='a-btn-secondary btn-open']/span")).getText();
			String view = driver.findElement(By.xpath("(//div[@class='switch']/div)[1]")).getText();
			
			if(view.equalsIgnoreCase("You’re viewing the "+year+ " version"))
			{
				assertTrue(view.equalsIgnoreCase("You’re viewing the "+year+ " version"));
				Reporting.logResults(driver, "Pass", "validate static text", "verified static text for "+year);
			}
			else Reporting.logResults(driver, "Fail", "validate static text", "Failed static text for "+year);
				

			if (view.contains(year)) {
				Reporting.logResults(driver, "Pass", "Verify handbook view year validation",
						"Viewing the correct year handbook as selected");
			} else {
				Reporting.logResults(driver, "Fail", "Verify handbook view year validation",
						"Viewing incorrect year handbook ");
			}

			ActionDriver action = new ActionDriver(driver);
			action.click(Locators.AcamedicItemPage.YEARSWITCH, "year switch");
			action.click(Locators.AcamedicItemPage.CHANGEYEAR, "Change Year");
			Thread.sleep(2000);
			String syear = driver.findElement(By.xpath("//button[@class='a-btn-secondary btn-open']/span")).getText();
			String sview = driver.findElement(By.xpath("(//div[@class='switch']/div)[1]")).getText();
			
			if(view.equalsIgnoreCase("You’re viewing the "+syear+ " version"))
			{
				assertTrue(view.equalsIgnoreCase("You’re viewing the "+syear+ " version"));
				Reporting.logResults(driver, "Pass", "validate static text", "verified static text for "+syear);
			}
			else Reporting.logResults(driver, "Fail", "validate static text", "Failed static text for "+syear);

			if (sview.contains(syear)) {
				Reporting.logResults(driver, "Pass", "Verify handbook view year validation",
						"Viewing the correct year handbook as selected");
			} else {
				Reporting.logResults(driver, "Fail", "Verify handbook view year validation",
						"Viewing incorrect year handbook ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
