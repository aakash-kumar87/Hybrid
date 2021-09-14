package com.lifecycle.testscripts.browsepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class VerifySubjectArea extends BaseDriverUtil {

	private boolean bstatus;

	@Test(groups = { "regression", "FAI" })
	public void verifyBySubjectArea() {
		Reporting.setReportingValues(this.getClass().getName());
		try {
			setup(driver);

			ActionDriver action = new ActionDriver(driver);
			bstatus = action.click(Locators.BrowsePage.SUBJECTAREALINK, "By subject area");

			List<WebElement> subjectareacount = driver.findElements(Locators.BrowsePage.SUBJECTAREA);

			for (int i = 0; i < subjectareacount.size(); i++) {

				subjectareacount = driver.findElements(Locators.BrowsePage.SUBJECTAREA);
				String text = subjectareacount.get(i).findElement(By.xpath("div/h3")).getText();
				bstatus = action.click(subjectareacount.get(i), "");
				Thread.sleep(1000);
				String actual = driver.findElement(Locators.AcamedicItemPage.TITLE).getText();
				if (text.equals(actual)) {
					Reporting.logResults(driver, "Pass", "Verify subject area title of " + text,
							"Verified subject area for " + text);
				} else {
					Reporting.logResults(driver, "Fail", "Verify subject area title of " + text,
							"Failed to verify subject area of  " + text);
				}
				driver.navigate().back();
				Thread.sleep(1000);
				bstatus = action.click(Locators.BrowsePage.SUBJECTAREALINK, "By subject area");
				if (!bstatus)
					Reporting.logResults(driver, "Fail", "Click on subject area link",
							"Unable to click on subject area link ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
