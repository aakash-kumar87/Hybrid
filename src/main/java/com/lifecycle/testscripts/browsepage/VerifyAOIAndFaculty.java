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

public class VerifyAOIAndFaculty extends BaseDriverUtil {

	@Test
	public void verifyUG() throws IOException, AWTException {
		Reporting.setReportingValues(this.getClass().getName());
		setup(driver);
		validateAreadOfInterstUGValidation();
	}

	public boolean validateAreadOfInterstUGValidation() throws IOException {
		boolean flag = false;
		try {
			// for loop for getting list of ids

			List<WebElement> items = driver.findElements(By.xpath("//div[@id='tab_field_of_education']/a"));
			int count = items.size();

			for (int i = 1; i <= count; i++) {

				ActionDriver action = new ActionDriver(driver);
				action.click(By.xpath("//div[@id='tab_field_of_education']/a[" + i + "]"),
						"Element " + i + "is clicked in Area of Interest");
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				// validate UG and pG courses in AOI

				List<WebElement> li = driver.findElements(By.xpath("(//div[@class='m-page-nav-list'])[1]/div"));

				int cou = li.size();
				for (int j = 1; j <= cou; j++) {
					driver.findElement(By.xpath("//div[@class='m-page-nav-list']/div[" + j + "]")).click();
					Thread.sleep(500);
					String aListItem = driver.findElement(By.xpath("//div[@class='m-page-nav-list']/div[" + j + "]"))
							.getText();

					flag = driver.findElement(By.xpath("//h3[contains(text(),'" + aListItem + "')]")).isDisplayed();
					if (!flag) {
						Reporting.logResults(driver, "Fail",
								"Verify Left pane Elements", "Element " + aListItem + "in Left pane is Not displayed as header in the right");
					} else {
						Reporting.logResults(driver, "Pass",
								"Verify Left pane Elements in Undergrad", "Element " + aListItem + "in Left pane is displayed as header in the right");
					}

				}
				// going to search page and validating stuff
				Thread.sleep(1000);

				String title = driver.findElement(By.xpath("//h2[@class='a-browse-heading']")).getText();
				Thread.sleep(1000);
				driver.findElement(By.xpath(
						"(//button[text()='Undergraduate']//ancestor::div[@class='a-browse-tab-panel']//a[@class='a-browse-more-controls-link'])[1]"))
						.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[text()='Area of Interest']")).click();

				// verify title in previous page is checked in area of Interest here
				List<WebElement> l = driver
						.findElements(By.xpath("//div[@class='o-filter-category'][3]//div[@class='o-filter-option']"));

				int c = l.size();
				for (int j = 1; j <= c; j++) {
					WebElement element = driver.findElement(By
							.xpath("//div[@class='o-filter-category'][3]//div[@class='o-filter-option']//label[text()='"
									+ title + "']/input"));
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
					Thread.sleep(500);
					flag = element.isSelected();

					if (flag) {
						Reporting.logResults(driver, "Pass",
								"Verify Area of Interest in go to search link  ", "Area of Interest  go to search link was matched for " + title);
						break;
					}
				}
				driver.navigate().back();
				Thread.sleep(2000);
				// Checking PG list
				action.click(Locators.BrowsePage.POSTGRADUATE, "PostGraduate");

				List<WebElement> pi = driver.findElements(By.xpath("(//div[@class='m-page-nav-list'])[2]/div"));
				int coi = pi.size();

				for (int q = 1; q <= coi; q++) {
					driver.findElement(By.xpath("(//div[@class='m-page-nav-list'])[2]/div[" + q + "]")).click();
					Thread.sleep(500);
					String pListItem = driver
							.findElement(By.xpath("(//div[@class='m-page-nav-list'])[2]/div[" + q + "]")).getText();

					flag = driver
							.findElement(
									By.xpath("//div[@id='Postgraduate']//h3[contains(text(),'" + pListItem + "')]"))
							.isDisplayed();
					if (!flag) {
						Reporting.logResults(driver, "Fail",
								"Verify Left pane Elements in PostGrad", "Element " + pListItem + "in Left pane is Not displayed as header in the right");
					} else {
						Reporting.logResults(driver, "Pass",
								"Verify Left pane Elements in PostGrad", "Element " + pListItem + "in Left pane is displayed as header in the right");
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
