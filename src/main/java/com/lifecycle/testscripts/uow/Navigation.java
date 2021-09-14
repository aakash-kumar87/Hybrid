package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.LandingPage;
import com.lifecycle.locators.Locators;



public class Navigation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void navigateToCourseInfo() throws IOException, InterruptedException, AWTException {
		LandingPage landing = new LandingPage(driver);
		
		//This will validate the Landing page after click, and click on the mentioned template
		//Pass Driver, url contains text, locator to click(can be academic item link or any template string name in locator), Landing page string,  template to click
		
		// use the below string in case landing page is not detail page not bundling page
		String landingPage = "Course Information";
		landing.navigateToCourseInfo(driver, "proposal-landing", Locators.Dashboard.academicItem, landingPage,  "Academic item from proposal bundle");
	}

	@Test(groups = {"regression"})
	public void navigateToMajorInfo() throws IOException, InterruptedException, AWTException {
		LandingPage landing = new LandingPage(driver);
		
		//This will validate the Landing page after click, and click on the mentioned template
		//Pass Driver, url contains text, locator to click(can be academic item link or any template string name in locator), Landing page string,  template to click
		
		// use the below string in case landing page is not detail page not bundling page
		String landingPage = "Major Study / Specialisation Information";
		landing.navigateToCourseInfo(driver, "proposal-landing", Locators.Dashboard.academicItem, landingPage,  "Academic item from proposal bundle");
	}



}
