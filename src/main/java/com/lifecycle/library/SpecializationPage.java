package com.lifecycle.library;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.locators.Locators;

public class SpecializationPage extends ActionDriver implements IAcademicPage {

	public SpecializationPage(WebDriver incomingDriver) {
		super(incomingDriver);
	}

	public void expandElement(WebElement webElement) throws IOException, AWTException {
		click(webElement, "");
	}

	@Override
	public void bookmarkPage() throws IOException, AWTException {
		click(Locators.AcamedicItemPage.BOOKMARKBUTTON, "bookmark button");
		String classes = getAttribute(Locators.AcamedicItemPage.BOOKMARKBUTTONCLICKED, "class");
		assertTrue(classes.contains("a-btn-bookmark--marked"));
	}
}
