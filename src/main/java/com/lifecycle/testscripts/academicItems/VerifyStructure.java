package com.lifecycle.testscripts.academicItems;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.BrowsePage;
import com.lifecycle.library.CoursePage;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.library.ProgramPage;
import com.lifecycle.library.SpecializationPage;
import com.lifecycle.locators.Locators;

public class VerifyStructure extends BaseDriverUtil {

	@Test(groups = { "regression", "AI" })
	public void verifyProgramItemType() throws IOException, AWTException {

		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage.selectByAoiTab();
		BrowsePage browsePage = homePage.selectAreaByName("Engineering and Related Technologies");
		List<WebElement> options = browsePage.getTabElements(Locators.BrowsePage.Undergraduate.PROGRAMLIST);
		ProgramPage programPage = browsePage.selectRandomProgramItem(options);
		String text = programPage.getText(Locators.AcamedicItemPage.OverviewModule.AIPILL);
		assertTrue(text.equalsIgnoreCase("program"));
	}

	@Test(groups = { "regression", "AI" })
	public void verifyCourseItemType() throws IOException, AWTException {

		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage.selectByAoiTab();
		BrowsePage browsePage = homePage.selectAreaByName("Engineering and Related Technologies");
		List<WebElement> options = browsePage.getTabElements(Locators.BrowsePage.Undergraduate.COURSEPROGRAMLIST);
		CoursePage coursePage = browsePage.selectRandomCourseItem(options);
		String text = coursePage.getText(Locators.AcamedicItemPage.OverviewModule.AIPILL);
		assertTrue(text.equalsIgnoreCase("course"));
	}

	@Test(groups = { "regression", "AI" })
	public void verifyDoubleDegreeItemType() throws IOException, AWTException {

		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage.selectByAoiTab();
		BrowsePage browsePage = homePage.selectAreaByName("Engineering and Related Technologies");
		List<WebElement> options = browsePage.getTabElements(Locators.BrowsePage.Undergraduate.DOUBLEDEGREEPROGRAMLIST);
		ProgramPage programPage = browsePage.selectRandomProgramItem(options);
		String text = programPage.getText(Locators.AcamedicItemPage.OverviewModule.AIPILL);
		assertTrue(text.equalsIgnoreCase("Program"));
	}

	@Test(groups = { "regression", "AI" })
	public void verifySpecializationtemType() throws IOException, AWTException {

		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage.selectByAoiTab();
		BrowsePage browsePage = homePage.selectAreaByName("Engineering and Related Technologies");
		List<WebElement> options = browsePage.getTabElements(Locators.BrowsePage.Undergraduate.SPECIALPROGRAMLIST);
		SpecializationPage specializationPage = browsePage.selectRandomSpecializationItem(options);
		String text = specializationPage.getText(Locators.AcamedicItemPage.OverviewModule.AIPILL);
		assertTrue(text.equalsIgnoreCase("Specialisation"));
	}

}
