package com.lifecycle.testscripts.search;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.locators.CustomXpaths;
import com.lifecycle.reporting.Reporting;

public class VerifyFilterCountForUG extends BaseDriverUtil {

	private boolean flag;

	@Test(groups = { "regression", "TS " })
	public void verifyFilterCountForProgramsUG() {
		Reporting.setReportingValues(this.getClass().getName());
		try {

			setup(driver);
			ActionDriver action = new ActionDriver(driver);
			action.click(CustomXpaths.getElementByText("search"), "Search Button");
			Thread.sleep(500);

			verifyProgramFiltersUG();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean verifyProgramFiltersUG() {
		try {
			ActionDriver action = new ActionDriver(driver);
			flag = action.click(CustomXpaths.getElementByText("Program"), "Program Button");
			if (!flag)
				return flag;

			for (int i = 1; i <= 3; i++) {

				action.click(By.xpath("//div[@class='o-filter-category'][" + i + "]"), "Section in program ");
				Thread.sleep(500);

				if (i == 1) {
					List<WebElement> list = driver
							.findElements(By.xpath("(//div[@class='o-filter-category-items'])[" + i + "]/div"));
					if (list.size() != 2) {
						Reporting.logResults(driver, "Fail", "Verify count in study as ",
								"Found " + list.size() + " in study as filter section");

						return false;
					} else {
						Reporting.logResults(driver, "pass", "Verify count in study as ",
								"Found " + list.size() + " in study as filter section");
					}
				}

				if (i == 2) {
					List<WebElement> list = driver
							.findElements(By.xpath("(//div[@class='o-filter-category-items'])[" + i + "]/div"));
					if (list.size() != 11) {
						Reporting.logResults(driver, "Fail", "Verify count in Faculty ",
								"Found " + list.size() + " in Faculty filter section");
						return false;
					} else {
						Reporting.logResults(driver, "pass", "Verify count in Faculty  ",
								"Found " + list.size() + " in faculty filter section");
					}
				}

				if (i == 3) {
					List<WebElement> list = driver
							.findElements(By.xpath("(//div[@class='o-filter-category-items'])[" + i + "]/div"));
					if (list.size() != 10) {
						Reporting.logResults(driver, "Fail", "Verify count in Area of study ",
								"Found " + list.size() + " in Area of study section");
						return false;
					} else {
						Reporting.logResults(driver, "pass", "Verify count in Area of study ",
								"Found " + list.size() + " in Area of study filter section ");
					}
				}
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
