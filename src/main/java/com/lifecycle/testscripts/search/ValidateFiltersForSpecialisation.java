package com.lifecycle.testscripts.search;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class ValidateFiltersForSpecialisation extends BaseDriverUtil {

	List<String> sUndergraduate = Arrays.asList("Specialisation Type", "Faculty", "Area of Interest");
	List<String> sPostgraduate = Arrays.asList("Faculty", "Area of Interest");
	List<String> sResearch = Arrays.asList("Faculty", "Area of Interest");

	@Test
	public void verify() {
		try {
			Reporting.setReportingValues(this.getClass().getName());
			setup(driver);
			ActionDriver action = new ActionDriver(driver);
			action.click(Locators.HomePage.SEARCHBUTTON, "Search button");
			Thread.sleep(500);
			search("Specialisation", "Undergraduate");
			search("Specialisation", "Postgraduate");
			search("Specialisation", "Research");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void search(String studyType, String studyLevel) throws IOException, InterruptedException, AWTException

	{
		ActionDriver action = new ActionDriver(driver);
		boolean bstatus = action.click(By.xpath("//button[text()='" + studyType + "']"), studyType);
		if (!bstatus)
			return;
		Thread.sleep(500);

		bstatus = action.click(By.xpath("(//div[contains(text(),'" + studyLevel + "')])[1]"), studyType);

		if (!bstatus)
			return;
		Thread.sleep(500);

		List<WebElement> li = driver.findElements(
				By.xpath("//div[@class='m-radio-tabs']//following-sibling::div[@class='o-filter-category']"));

		for (int i = 1; i <= li.size(); i++) {

			String text = driver.findElement(
					By.xpath("(//div[@class='m-radio-tabs']//following-sibling::div[@class='o-filter-category'])[" + i
							+ "]/button/span[1]"))
					.getText();
			if (studyLevel == "Undergraduate") {
				bstatus = sUndergraduate.contains(text);
				if (!bstatus) {
					Reporting.logResults(driver, "Fail", "filters in Specialisation " + studyLevel,
							text + " is not listed in " + sUndergraduate);
				}
				Reporting.logResults(driver, "Pass", "Filters in Specialisation for " + studyLevel,
						text + " is listed in " + sUndergraduate);
			}

			if (studyLevel == "Postgraduate") {
				bstatus = sPostgraduate.contains(text);
				if (!bstatus) {
					Reporting.logResults(driver, "Fail", "filters in Specialisation " + studyLevel,
							text + " is not listed in " + sPostgraduate);
				}
				Reporting.logResults(driver, "Pass", "filters in Specialisation " + studyLevel,
						text + " is  listed in " + sPostgraduate);
			}

			if (studyLevel == "Research") {
				bstatus = sResearch.contains(text);
				if (!bstatus) {
					Reporting.logResults(driver, "Fail", "filters in Specialisation " + studyLevel,
							text + " is not listed in " + sResearch);
				}
				Reporting.logResults(driver, "Pass", "filters in Specialisation " + studyLevel,
						text + " is  listed in " + sResearch);
			}
		}

	}

}
