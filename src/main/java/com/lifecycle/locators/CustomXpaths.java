package com.lifecycle.locators;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.openqa.selenium.By;

public class CustomXpaths {

	/**
	 * 
	 * @param name
	 * @return
	 * @throws HeadlessException
	 * @throws IOException
	 * @throws AWTException
	 */
	public static By getElementByText(String name) {
		return By.xpath("//*[text()='" + name + "']");
	}

	public static By getElementByContainsText(String name) {
		return By.xpath("//*[contains(text(),'" + name + "')]");
	}

	public static By getElementById(String name) {
		return By.id(name);
	}
}
