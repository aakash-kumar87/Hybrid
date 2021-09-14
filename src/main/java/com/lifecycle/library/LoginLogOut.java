package com.lifecycle.library;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.accelarators.ReadProperties;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class LoginLogOut extends ActionDriver {

	public LoginLogOut(WebDriver incomingDriver) {
		super(incomingDriver);
	}

	final Logger logger = Logger.getLogger(LoginLogOut.class);

	static ReadProperties rp = new ReadProperties();
	static String url = rp.readProperties().getProperty("url");
	static String username = rp.readProperties().getProperty("username");
	static String password = rp.readProperties().getProperty("password");

	/**
	 * This method will login into handbook application
	 * 
	 * @throws HeadlessException
	 * @throws IOException
	 * @throws AWTException
	 */
	public void login() throws IOException, AWTException {
		try {
			ActionDriver action = new ActionDriver(driver);
			action.enter(Locators.HomePage.USERNAME, username, "Username");
			action.enter(Locators.HomePage.PASSWORD, password, "Password");
			action.click(Locators.HomePage.LOGIN_BTN, "Login button in homepage");
			Reporting.logResults(driver, "Pass", "Login Functionality", "Login to courseloop was succesfull");
		} catch (Exception e) {
			e.printStackTrace();
			Reporting.logResults(driver, "Fail", "Login Functionality", "Unable to login to courseloop");
		}
	}

	public void logout() throws IOException, AWTException {
		try {
			ActionDriver action = new ActionDriver(driver);
			action.click(Locators.HomePage.LOGOUT, "Logout");
			Reporting.logResults(driver, "Pass", "Logout Functionality", "Logout was succesfull");
		} catch (Exception e) {
			e.printStackTrace();
			Reporting.logResults(driver, "Fail", "Logout Functionality", "Unable to logout to courseloop");
		}
	}
}
