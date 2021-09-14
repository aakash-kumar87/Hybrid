package com.lifecycle.testscripts.search;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class VerifyResultsForCoursesBasedonFilterSelection extends BaseDriverUtil {
	private String facultytext;
	private boolean flag;

	@Test(groups = { "regression", "TSFS  " })
	public void verifyFilters() {
		Reporting.setReportingValues(this.getClass().getName());

		try {
			setup(driver);
			ActionDriver action = new ActionDriver(driver);
			action.enter(Locators.HomePage.SEARCH, "Computer", "Search input text in home page");
			action.click(Locators.HomePage.SEARCHBUTTON, "Search button");
			Thread.sleep(500);
			searchFilters("Course");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void searchFilters(String name) {

		driver.findElement(By.xpath("//button[text()='" + name + "']")).click();

		try {

			verifyspecial(name, "Undergraduate", "Offering periods");
			verifyspecial(name, "Postgraduate", "Offering periods");
			verifyspecial(name, "Undergraduate", "Faculty");
			verifyspecial(name, "Postgraduate", "Faculty");
			verifyspecial(name, "Undergraduate", "Delivery Mode");
			verifyspecial(name, "Postgraduate", "Delivery Mode");
			verifyspecial(name, "Research", "Offering periods");
			verifyspecial(name, "Research", "Faculty");
			verifyspecial(name, "Research", "Delivery Mode");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param filter     E.g: Study as , Specialisation type, Faculty, Area of
	 *                   Interest
	 * @param studylevel E.g: Undergraduate or Postgraduate
	 * @param filterBy   E.g: Program, Specialisation or Course
	 * @throws InterruptedException
	 * @throws HeadlessException
	 * @throws IOException
	 * @throws AWTException
	 */

	public void verifyspecial(String filterBy, String studylevel, String filterType)
			throws InterruptedException, IOException, AWTException {
		try {

			
	}
		catch(Exception e){
			}
	}
}
	
	
		

