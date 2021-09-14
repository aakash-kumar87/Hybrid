package com.lifecycle.testscripts.factultypage;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.Ordering;
import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.ProgramPage;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class FacultyCodeOrder extends BaseDriverUtil {
	ActionDriver action = new ActionDriver(driver);
	List<String> codes = new ArrayList<>();
	List<WebElement> programList = new ArrayList<>();

	@Test(groups = { "regression", "CUR-1174" })
	public void checkProgramOrderedByName() throws IOException, AWTException, InterruptedException {
		setup(driver);

		assertTrue(action.click(Locators.HomePage.ENGINEERINGTILE, "Engineering and Related Technologies tile"));
		ProgramPage programPage = new ProgramPage(driver);
		programList = programPage.expandAndRecordElements(Locators.FacultyPage.Undergraduate.PROGRAMLISTVIEWMORE,
				Locators.FacultyPage.Undergraduate.PROGRAMLIST);
		codes.clear();
		for (WebElement e : programList) {
			codes.add(e.getText());
		}
		assertTrue(Ordering.natural().isOrdered(codes));
		Reporting.logResults(driver, "Pass", "Verify Items are in order", "Elements in order");
	}

	@Test(groups = { "regression", "CUR-1174" })
	public void checkDoubleDegreeProgramOrderedByName() throws IOException, AWTException, InterruptedException {
		setup(driver);
		assertTrue(action.click(Locators.HomePage.ENGINEERINGTILE, "Engineering and Related Technologies tile"));
		ProgramPage programPage = new ProgramPage(driver);
		programList = programPage.expandAndRecordElements(
				Locators.FacultyPage.Undergraduate.DOUBLEDEGREEPROGRAMLISTVIEWMORE,
				Locators.FacultyPage.Undergraduate.DOUBLEDEGREEPROGRAMLIST);
		codes.clear();
		for (WebElement e : programList) {
			codes.add(e.getText());
		}

		assertTrue(Ordering.natural().isOrdered(codes));
		Reporting.logResults(driver, "Pass", "Verify Items are in order", "Elements in order");
	}

	@Test(groups = { "regression", "CUR-1174" })
	public void checkSpecialProgramOrderedByName() throws IOException, AWTException, InterruptedException {
		setup(driver);
		assertTrue(action.click(Locators.HomePage.ENGINEERINGTILE, "Engineering and Related Technologies tile"));
		ProgramPage programPage = new ProgramPage(driver);
		programList = programPage.expandAndRecordElements(Locators.FacultyPage.Undergraduate.SPECIALPROGRAMLISTVIEWMORE,
				Locators.FacultyPage.Undergraduate.COURSEPROGRAMLIST);
		codes.clear();
		for (WebElement e : programList) {
			codes.add(e.getText());
		}

		assertTrue(Ordering.natural().isOrdered(codes));
		Reporting.logResults(driver, "Pass", "Verify Items are in order", "Elements in order");
	}

	@Test(groups = { "regression", "CUR-1174" })
	public void checkCourseOrderedByCode() throws IOException, AWTException, InterruptedException {
		setup(driver);
		assertTrue(action.click(Locators.HomePage.ENGINEERINGTILE, "Engineering and Related Technologies tile"));

		programList = driver.findElements(Locators.FacultyPage.Undergraduate.COURSEPROGRAMLIST);
		codes.clear();
		for (WebElement e : programList) {
			codes.add(e.getText());
		}

		assertTrue(Ordering.natural().isOrdered(codes));
		Reporting.logResults(driver, "Pass", "Verify Items are in order", "Elements in order");
	}

}
