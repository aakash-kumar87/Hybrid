package com.lifecycle.testscripts.search;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.SearchPage;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class Verify_Pagination extends BaseDriverUtil {
	private boolean flag;

	// broken test
	@Test
	public void pagination() throws IOException, AWTException, InterruptedException {
		Reporting.setReportingValues(this.getClass().getName());
		setup(driver);

		verifySearchPageBySearchButton("Arts");
		ActionDriver action = new ActionDriver(driver);
	
		if (flag) {
			Reporting.logResults(driver, "Pass", "Verify Pagination section", "Pagination section is visible");
			// waiting for transition
			Thread.sleep(400);

			List<WebElement> pagenumber = driver.findElements(
					By.xpath("//nav[@aria-label='Navigate Search Result Pages']//span[@class='m-pagination-btn']/a"));

			for (int i = 1; i <= pagenumber.size(); i++) {

				driver.findElement(
						By.xpath("//nav[@aria-label='Navigate Search Result Pages']//span[@class='m-pagination-btn']/a["
								+ i + "]"))
						.click();
				driver.findElement(By.xpath("//span[@class='m-pagination-text']")).isDisplayed();
				Thread.sleep(500);

			}
		} else {

			Reporting.logResults(driver, "Fail", "Verify Pagination section", "Pagination section is not visible");
		}
	}

	public boolean verifySearchPageBySearchButton(String searchText) {
		try {
			SearchPage search = new SearchPage(driver);
			if (search.assertSearch(searchText)) {

				Thread.sleep(500);
					if (!flag) {

					Reporting.logResults(driver, "Fail", "Verify search text in search page results",
							"Failed to  verify " + searchText + " in Search page ");
				} else {
					Reporting.logResults(driver, "pass", "Verify search text in search page",
							"Succesfully verified " + searchText + " in Search page ");
				}
			}
			if (!flag) {
				Reporting.logResults(driver, "Fail", "Verify search results of " + searchText + " in search page",
						"search results not matched with " + searchText);
			} else {
				Reporting.logResults(driver, "pass", "Verify search results of " + searchText + " in search page",
						"search results  matched with " + searchText);
			}

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;

		}
		return flag;
	}
}
