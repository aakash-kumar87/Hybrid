package com.lifecycle.testscripts.programpage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.lifecycle.DataAccess.HighlyUsedRequests.Get.GetCourses;
import com.lifecycle.DataAccess.HighlyUsedRequests.Put.PatchCourses;
import com.lifecycle.DataAccess.Models.CourseModel.Result;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.enums.Courses;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.library.ProgramPage;
import com.lifecycle.library.SearchResults;
import com.lifecycle.locators.Locators;

public class VerifyIntakePeriod extends BaseDriverUtil {

	@Test(groups = { "data", "CUR-1077" })
	public void verifyChangeOfIntake() throws IOException, AWTException, InterruptedException {

		Result program = GetCourses.getCourseWithIntake(Courses.intakePeriod.Term1.getIntakeCode());

		// Selenium
		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		SearchResults searchResults = homePage.performSearch(program.getCode());
		ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(program.getCode()));

		String webIntakePeriod = programPage.getText(Locators.ProgramPage.INTAKEPERIODTEXT).replaceAll("\\s+", "")
				.replaceAll("-", "");

		assertTrue(webIntakePeriod.toLowerCase().contains(Courses.intakePeriod.Term1.toString().toLowerCase()),
				"failed expected: " + Courses.intakePeriod.Term1.toString().toLowerCase() + "but it was: "
						+ webIntakePeriod.toLowerCase());

		PatchCourses.putIntakeCodeOnCourse(Courses.intakePeriod.Term2.getIntakeCode(), program.getSysId());
		Thread.sleep(13000);

		programPage.refreshPage();

		webIntakePeriod = programPage.getText(Locators.ProgramPage.INTAKEPERIODTEXT).replaceAll("\\s+", "")
				.replaceAll("-", "");

		assertTrue(webIntakePeriod.toLowerCase().contains(Courses.intakePeriod.Term2.toString().toLowerCase()),
				"failed expected: " + Courses.intakePeriod.Term2.toString().toLowerCase() + " but it was: "
						+ webIntakePeriod.toLowerCase());

	}

	@Test(groups = { "regression" })
	public void intakePeriodPresent() throws IOException, AWTException {
		List<String> codes = Arrays.asList("3261", "3409");
		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		for (String code : codes) {
			SearchResults searchResults = homePage.performSearch(code);
			ProgramPage programPage = searchResults.selectProgramByCode(Integer.parseInt(code));
			assertTrue(programPage.isElementDisplayed(Locators.ProgramPage.INTAKEPERIODTEXT));
			assertTrue(programPage.isElementDisplayed(Locators.ProgramPage.INTAKEPERIOD));
			assertEquals(programPage.getText(Locators.ProgramPage.INTAKEPERIOD), "Intake Period");
			assertFalse(programPage.getText(Locators.ProgramPage.INTAKEPERIODTEXT).isEmpty());

			homePage = programPage.navigateHome();
		}
	}
}
