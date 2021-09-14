package com.lifecycle.library;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.locators.Locators;

public class CoursePage extends ActionDriver implements IAcademicPage {

	public CoursePage(WebDriver incomingDriver) {
		super(incomingDriver);
	}



	@Override
	public void bookmarkPage() throws IOException, AWTException, InterruptedException {
		click(Locators.AcamedicItemPage.BOOKMARKBUTTON, "bookmark button");
		shortWait();
		String classes = getAttribute(Locators.AcamedicItemPage.BOOKMARKBUTTONCLICKED, "class");
		assertTrue(classes.contains("a-btn-bookmark--marked"));
	}
}
