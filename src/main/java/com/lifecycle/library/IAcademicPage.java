package com.lifecycle.library;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface IAcademicPage {
	public void bookmarkPage() throws IOException, AWTException, InterruptedException;

	public boolean isElementDisplayed(WebElement element);

	public boolean isElementDisplayed(By locator);

	public String getText(By locator);

	public CurriculumHomePage navigateHome() throws IOException, AWTException;
}
