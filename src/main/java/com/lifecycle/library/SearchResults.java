package com.lifecycle.library;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.locators.Locators;

public class SearchResults extends ActionDriver {

	public SearchResults(WebDriver incomingDriver) {
		super(incomingDriver);
		wait.until(ExpectedConditions.titleContains("UNSW Handbook"));
	}

	public ProgramPage selectProgramFromAll(int code) throws IOException, AWTException {
		click(By.xpath("//b[contains(text(),'" + code + "')]"), "Item with code " + code + "selected");
		return new ProgramPage(driver);
	}

	public ResearchPage selectResearchFromAll(int code) throws IOException, AWTException {
		click(By.xpath("//b[contains(text(),'" + code + "')]"), "Item with code " + code + "selected");
		return new ResearchPage(driver);
	}

	public CoursePage selectCourseByCode(String code) throws IOException, InterruptedException, AWTException {
		
		shortWait();
		click(By.xpath("//b[contains(text(),'" + code + "')]"), "Course with code " + code + "selected");
		return new CoursePage(driver);
	}

	public CoursePage selectCourseFromAll(String code) throws IOException, AWTException {
		click(By.xpath("//b[contains(text(),'" + code + "')]"), "Course with code " + code + "selected");
		return new CoursePage(driver);
	}

	public SpecializationPage selectSpecialisationByCode(String code) throws IOException, InterruptedException, AWTException {
		shortWait();
		click(By.xpath("//b[contains(text(),'" + code + "')]"), "specialisation with code " + code + "selected");
		return new SpecializationPage(driver);
	}

	public ProgramPage selectProgramByCode(int code) throws IOException, AWTException {
		
		click(By.xpath("//b[contains(text(),'" + code + "')]"), "Program with code " + code + "selected");
		return new ProgramPage(driver);
	}

	public List<WebElement> getFilterOptions(By locator) {
		WebElement filter = driver.findElement(locator);
		return filter.findElements(By.xpath("../../div/div/div/div/label"));
	}

	public void selectEducationLevel(String level) throws IOException, AWTException {
	
	}

	public void selectGrouping(String text) throws IOException, InterruptedException, AWTException {
		

		shortWait();
	}

	public boolean isItemWithCodeVisable(int code) {
		return isElementDisplayed(By.xpath("//b[contains(text(),'" + code + "')]"));
	}

	/***
	 * 
	 * @param tab            Search result general filter (All, Program,
	 *                       Specialization, Course)
	 * @param webElement     - Side filter options (button locator to select)
	 * @param accordian      - Sub menu of options in side filter
	 * @param educationLevel - Graduate or Undergraduates
	 * @throws IOException
	 * @throws AWTException
	 * @throws InterruptedException
	 */
	public void navigateToSubHeadingForType(By webElement, By accordian, String educationLevel) throws IOException, AWTException {
		selectEducationLevel(educationLevel);
		if (driver.findElement(accordian).getAttribute("aria-hidden").contains("true")) {
			click(webElement, getText(webElement));
		}
	}
}
