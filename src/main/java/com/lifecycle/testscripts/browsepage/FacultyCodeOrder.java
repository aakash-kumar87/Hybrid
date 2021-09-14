package com.lifecycle.testscripts.browsepage;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.BrowsePage;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class FacultyCodeOrder extends BaseDriverUtil {
	List<WebElement> programList = new ArrayList<>();

	@Test(groups = { "regression", "CUR-1174" })
	public void checkProgramOrderedByName() throws IOException, AWTException, InterruptedException {
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage.selectByAoiTab();

		BrowsePage browsePage = homePage.selectAreaByName("Engineering and Related Technologies");
		browsePage.expandSection(Locators.BrowsePage.Undergraduate.PROGRAMLISTVIEWMORE);

		assertTrue(browsePage.verifyListIsOrdered(Locators.BrowsePage.Undergraduate.PROGRAMLIST));
		Reporting.logResults(driver, "Pass", "Verify Items are in order", "Elements in order");
	}

	@Test(groups = { "regression", "CUR-1174" })
	public void checkDoubleDegreeProgramOrderedByName() throws IOException, AWTException, InterruptedException {
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage.selectByAoiTab();

		BrowsePage browsePage = homePage.selectAreaByName("Engineering and Related Technologies");
		browsePage.expandSection(Locators.BrowsePage.Undergraduate.DOUBLEDEGREEPROGRAMLISTVIEWMORE);

		assertTrue(browsePage.verifyListIsOrdered(Locators.BrowsePage.Undergraduate.DOUBLEDEGREEPROGRAMLIST));
		Reporting.logResults(driver, "Pass", "Verify Items are in order", "Elements in order");
	}

	@Test(groups = { "regression", "CUR-1174" })
	public void checkSpecialProgramOrderedByName() throws IOException, AWTException, InterruptedException {
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage.selectByAoiTab();

		BrowsePage browsePage = homePage.selectAreaByName("Engineering and Related Technologies");
		browsePage.expandSection(Locators.BrowsePage.Undergraduate.SPECIALPROGRAMLISTVIEWMORE);

		assertTrue(browsePage.verifyListIsOrdered(Locators.BrowsePage.Undergraduate.SPECIALPROGRAMLIST));

	}

	@Test(groups = { "regression", "CUR-1174" })
	public void checkCourseOrderedByCode() throws IOException, AWTException, InterruptedException {
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage.selectByAoiTab();

		BrowsePage browsePage = homePage.selectAreaByName("Engineering and Related Technologies");
		browsePage.expandSection(Locators.BrowsePage.Undergraduate.COURSEPROGRAMLISTVIEWMORE);

		assertTrue(browsePage.verifyListIsOrdered(Locators.BrowsePage.Undergraduate.COURSEPROGRAMLIST));
	}

}
