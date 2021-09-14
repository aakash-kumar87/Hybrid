package com.lifecycle.testscripts.browsepage;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class VerifyGoToSearchFilterValidationForAOI extends BaseDriverUtil {

	@Test(groups = { "regression", "TSFS" })
	public void verifyUG() throws IOException, AWTException {
		Reporting.setReportingValues(this.getClass().getName());

		setup(driver);
		areaOfInterestgoToSearchValidation();
	}

	public boolean areaOfInterestgoToSearchValidation() throws IOException {
		boolean flag = false;
		try {

			// for loop for getting list of ids

			List<WebElement> items = driver.findElements(Locators.BrowsePage.AREAOFINTERESTTABS);
			int count = items.size();

			for (int i = 0; i < count; i++) {

				items = driver.findElements(Locators.BrowsePage.AREAOFINTERESTTABS);
				ActionDriver action = new ActionDriver(driver);
				action.click(items.get(i), "");

				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				// validate UG and pG courses in AOI

				List<WebElement> li = driver.findElements(Locators.BrowsePage.BROWSEPAGELEFTPANEITEMS);

				int cou = li.size();

				for (int j = 1; j <= cou; j++) {

					driver.findElement(By.xpath("//div[@class='m-page-nav-list']/div[" + j + "]")).click();
					Thread.sleep(500);
					String aListItem = driver.findElement(By.xpath("//div[@class='m-page-nav-list']/div[" + j + "]"))
							.getText();

					flag = driver.findElement(By.xpath("//h3[contains(text(),'" + aListItem + "')]")).isDisplayed();
					if (!flag) {
						Reporting.logResults(driver, "Fail", "Verify Left pane Elements",
								"Element " + aListItem + "in Left pane is Not displayed as header in the right");
					} else {
						Reporting.logResults(driver, "Pass", "Verify Left pane Elements in Undergrad",
								"Element " + aListItem + "in Left pane is displayed as header in the right");
					}
				}

				// going to search page and validating stuff
				Thread.sleep(1000);

				String title = driver.findElement(Locators.AcamedicItemPage.TITLE).getText();
				Thread.sleep(1000);
				List<WebElement> searchCount = driver.findElements(By.xpath("//h2[text()='search']"));

				for (int j = 1; j <= searchCount.size(); j++) {

					// Condition to check if Go to search page is not displayed
					if (!driver.findElement(By.xpath("(//h2[text()='search'])[" + j + "]")).isDisplayed()) {
						driver.findElement(By.xpath("//button[text()='Postgraduate']")).click();
						Thread.sleep(1000);

						if (!driver.findElement(By.xpath("(//h2[text()='search'])[" + j + "]")).isDisplayed()) {
							driver.findElement(By.xpath("//button[text()='Research']")).click();
							Thread.sleep(1000);
						}

					}
					if (driver.findElement(By.xpath("(//h2[text()='search'])[" + j + "]")).isDisplayed()) {
						String tabName = driver
								.findElement(
										By.xpath("//div[@class='m-tab-panel__item m-tab-panel__item--active']/button"))
								.getText();
						driver.findElement(By.xpath("(//h2[text()='search'])[" + j + "]")).click();
						driver.findElement(By.xpath("//span[text()='Area of Interest']")).click();

						Thread.sleep(1000);

						// verify title in previous page is checked in area of Interest here
						List<WebElement> l = driver.findElements(By.xpath(
								"(//span[text()='Area of Interest']//following::div[@class='o-filter-category-items'])[1]"));

						int c = l.size();
						for (int k = 1; k <= c; k++) {
							WebElement element = driver.findElement(By.xpath(
									"(//span[text()='Area of Interest']//following::div[@class='o-filter-category-items'])[1]//label[text()='"
											+ title + "']/input"));
							((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
							Thread.sleep(500);
							flag = element.isSelected();

							if (flag) {
								Reporting.logResults(driver, "Pass", "Verify Area of Interest filter for " + title,
										"Area of filter applied for " + title + " in " + tabName
												+ " for go to search link ");
								break;
							} else {
								Reporting.logResults(driver, "Fail", "Verify Area of Interest filter for " + title,
										"Area of filter not applied for " + title + " in " + tabName
												+ " for go to search link ");
							}
						}
						driver.navigate().back();
						Thread.sleep(2000);
					}
				}
				action.click(Locators.HomePage.HOMEBTN, "Home button");
			}
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}
}
