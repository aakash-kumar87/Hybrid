package com.lifecycle.library;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.locators.Locators;

public class ResearchPage extends ActionDriver implements IAcademicPage {

	public ResearchPage(WebDriver incomingDriver) {
		super(incomingDriver);
	}

	@Override
	public void bookmarkPage() throws IOException, AWTException {
		click(Locators.AcamedicItemPage.OverviewModule.BOOKMARKBTN, "bookmark button");
		String classes = getAttribute(Locators.AcamedicItemPage.OverviewModule.BOOKMARKBTN, "class");
		assertTrue(classes.contains("a-btn-bookmark--marked"));

	}
}
