package com.lifecycle.library;




import java.awt.AWTException;
import java.io.IOException;

import org.apache.commons.logging.impl.Log4JLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class LandingPage  extends ActionDriver {
	

	public LandingPage(WebDriver incomingDriver) {
		super(incomingDriver);
		// TODO Auto-generated constructor stub
	
	
	}

	
	public void navigateToCourseInfo(WebDriver driver, String page, By pageToClick, String landingPage, String locatorName) throws IOException, InterruptedException, AWTException {
		
	
		Validations validations = new Validations(driver);

		// After the creation of academic item, Validate the landing page and go the information ( academic template)
		
		validations.longWait();
		validations.longWait();
		boolean urlContains = validations.validateURLContains(driver, page);
		if(urlContains==true) {
			validations.click(pageToClick, locatorName);
			validations.longWait();
			validations.click(Locators.Dashboard.linkByText(landingPage), landingPage);
		}
		else
		{
			validations.close();
		}
		

	}
	


}



