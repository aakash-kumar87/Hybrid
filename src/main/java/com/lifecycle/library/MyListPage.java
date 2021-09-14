package com.lifecycle.library;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.locators.Locators;

public class MyListPage extends ActionDriver {

	public MyListPage(WebDriver incomingDriver) {
		super(incomingDriver);
		wait.until(ExpectedConditions.titleContains("My List"));
	}

	public void clearAll() throws IOException, AWTException {
		click(Locators.MyListPage.EDITBTN, "Edit button");
		click(Locators.MyListPage.CLEARALLBTN, "clear all button");
	}

	public void removeFirstItem() throws IOException, InterruptedException, AWTException {
		click(Locators.MyListPage.EDITBTN, "Edit button");
		shortWait();
		click(Locators.MyListPage.FIRSTREMOVEBTN, "first cross");
		shortWait();
		click(Locators.MyListPage.DONEBTN, "done button");
	}

	public void clearRecentlyViewed() throws IOException, AWTException {
		click(Locators.MyListPage.CLEARRECENTLYVIEWED, "clear recently viewed button");

	}
}
