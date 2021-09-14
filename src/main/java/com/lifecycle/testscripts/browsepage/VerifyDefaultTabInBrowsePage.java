package com.lifecycle.testscripts.browsepage;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class VerifyDefaultTabInBrowsePage extends BaseDriverUtil {

	private boolean flag;

	@Test(groups = { "regression", "BR" })

	public void verifyUG() throws IOException, AWTException {
		Reporting.setReportingValues(this.getClass().getName());

		setup(driver);
		defaultTabForBrowse(Locators.BrowsePage.SUBJECTAREALINK, Locators.BrowsePage.SUBJECTAREA);
		defaultTabForBrowse(Locators.BrowsePage.AREAOFINTEREST, Locators.BrowsePage.AREAOFINTERESTTABS);
		defaultTabForBrowse(Locators.BrowsePage.FACULTIES, Locators.BrowsePage.AREAOFFACULTY);

	}

	public boolean defaultTabForBrowse(By link, By itemcount) {
		try {
			ActionDriver action = new ActionDriver(driver);
			action.click(link, "");
			List<WebElement> items = driver.findElements(itemcount);
			int count = items.size();

			for (int i = 0; i < count; i++) {

				items = driver.findElements(itemcount);
				action.click(items.get(i), "");
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				String actual = driver.findElement(Locators.AcamedicItemPage.TITLE).getText();

				String defualttab = driver
						.findElement(By.xpath("//div[@class='m-tab-panel__item m-tab-panel__item--active']/button"))
						.getText();

				if (defualttab.equalsIgnoreCase("Undergraduate")) {

					Reporting.logResults(driver, "Pass", actual + " Verify default tab ",
							actual + " Default is undergraduate");
				}

				if (defualttab.equalsIgnoreCase("Postgraduate")) {
					action.click(By.xpath("//button[text()='Undergraduate']"), "UG");
					flag = driver
							.findElement(By.xpath("//p[contains(text(),'Sorry, there are no Undergraduate Programs')]"))
							.isDisplayed();

					if (!flag) {

						Reporting.logResults(driver, "Fail", actual + " Verify default tab ",
								" Postgraduate is by default but there are courses in UG for " + actual);
					} else {
						Reporting.logResults(driver, "Pass", actual + " Verify default tab  " + actual,
								" Post Graduate tab is default because no items found for UG " + actual);
					}
				}

				if (defualttab.equalsIgnoreCase("Research")) {
					System.out.println("Research is displayed by default");

					action.click(By.xpath("//button[text()='Undergraduate']"), "UG");
					flag = driver
							.findElement(By.xpath("//p[contains(text(),'Sorry, there are no Undergraduate Programs')]"))
							.isDisplayed();

					if (flag) {
						System.out.println("NO academic items found for UG");
						action.click(By.xpath("//button[text()='Postgraduate']"), "PG");
						flag = driver
								.findElement(
										By.xpath("//p[contains(text(),'Sorry, there are no Postgraduate Programs')]"))
								.isDisplayed();
						System.out.println("No items found PG");
						Reporting.logResults(driver, "Pass", actual + " Verify default tab ",
								actual + " Research is  default No academic items found for UG&PG");

					} else {
						Reporting.logResults(driver, "Fail", actual + " Verify default tab ",
								actual + " Academic items found for UG/PG but Research is shown as default");
					}
				}
				flag = action.click(Locators.HomePage.HOMEBTN, "Home button");
				if (!flag)
					return flag;
				flag = action.click(link, "");
				if (!flag)
					return flag;
			}
			return true;
		} catch (Exception e) {
			flag = false;
			return flag;
		}
	}
}