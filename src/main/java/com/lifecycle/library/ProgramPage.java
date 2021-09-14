package com.lifecycle.library;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.locators.Locators;

public class ProgramPage extends ActionDriver implements IAcademicPage {

	public ProgramPage(WebDriver incomingDriver) {
		super(incomingDriver);
		// wait.until(ExpectedConditions.titleContains("Program"));
	}

	public boolean verifyLocationIsPresent(boolean present) throws IOException, AWTException {
		if (present) {
			return isElementPresent(Locators.ProgramPage.CAMPUSTEXT);
		}
		return !isElementPresent(Locators.ProgramPage.CAMPUSTEXT);
	}

	public List<WebElement> expandAndRecordElements(By viewMore, By list)
			throws IOException, InterruptedException, AWTException {

		expandSection(viewMore);

		return driver.findElements(list);
	}

	public void expandElement(WebElement webElement) throws IOException, AWTException {
		click(webElement, "");
	}

	public void bookmarkPage() throws IOException, AWTException {
		click(Locators.AcamedicItemPage.BOOKMARKBUTTON, "bookmark button");
		String classes = getAttribute(Locators.AcamedicItemPage.BOOKMARKBUTTONCLICKED, "class");
		assertTrue(classes.contains("a-btn-bookmark--marked"));
	}

	public MyListPage navigateToMyListViaBanner() throws InterruptedException, IOException, AWTException {
		mediumWait();
		click(Locators.ProgramPage.BANNERGOTOMYLIST, "Banner go to my list link");
		return new MyListPage(driver);
	}
}
