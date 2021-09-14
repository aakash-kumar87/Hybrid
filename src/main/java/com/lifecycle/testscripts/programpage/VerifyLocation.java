package com.lifecycle.testscripts.programpage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.lifecycle.DataAccess.HighlyUsedRequests.Get.GetCourses;
import com.lifecycle.DataAccess.HighlyUsedRequests.Put.PatchCourses;
import com.lifecycle.DataAccess.Models.CourseModel.Result;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.enums.Courses;
import com.lifecycle.enums.Courses.location;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.library.ProgramPage;
import com.lifecycle.library.SearchResults;
import com.lifecycle.locators.Locators;

public class VerifyLocation extends BaseDriverUtil {

	@Test(groups = { "CUR-1283", "data" })
	public void removeAndAddLocation() throws IOException, AWTException, InterruptedException {

		Result program = GetCourses.getCourseWithLocation(Courses.location.Canberra.getLocationCode());

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		SearchResults searchResults = homePage.performSearch(program.getCode());

		ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(program.getCode()));

		assertTrue(programPage.verifyLocationIsPresent(true));

		PatchCourses.putLocationCodeOnCourse("", program.getSysId());

		Thread.sleep(15000);

		programPage.refreshPage();

		assertTrue(programPage.verifyLocationIsPresent(false));

		PatchCourses.putLocationCodeOnCourse(location.Sydney.getLocationCode(), program.getSysId());
		Thread.sleep(15000);

		programPage.refreshPage();

		assertTrue(programPage.verifyLocationIsPresent(true));
		assertEquals(driver.findElement(Locators.ProgramPage.CAMPUSTEXT).getText().toLowerCase(),
				location.Sydney.toString().toLowerCase());
	}

	@Test(groups = { "CUR-1283", "CUR-1367", "data" })
	public void swapLocation() throws IOException, AWTException, InterruptedException {
		Result program = GetCourses.getCourseWithLocation(location.Canberra.getLocationCode());

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		SearchResults searchResults = homePage.performSearch(program.getCode());

		// Check location in search results
		assertTrue(searchResults
				.getText(By.xpath("//span[contains(text(),'- " + program.getName()
						+ "')]/../../..//span[contains(text(),'Offered in')]"))
				.toLowerCase().contains(location.Canberra.toString().toLowerCase()));
		ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(program.getCode()));

		assertTrue(programPage.isElementPresent(Locators.ProgramPage.CAMPUSTEXT));
		assertEquals(programPage.getText(Locators.ProgramPage.CAMPUSTEXT).toLowerCase(),
				location.Canberra.toString().toLowerCase());

		PatchCourses.putLocationCodeOnCourse(location.Sydney.getLocationCode(), program.getSysId());
		Thread.sleep(15000);

		programPage.refreshPage();

		assertTrue(programPage.isElementPresent(Locators.ProgramPage.CAMPUSTEXT));
		assertEquals(programPage.getText(Locators.ProgramPage.CAMPUSTEXT).toLowerCase(),
				location.Sydney.toString().toLowerCase());
	}
}
