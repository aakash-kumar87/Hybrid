package com.lifecycle.testscripts.programpage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Ignore;
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

public class VerifyDeliveryMode extends BaseDriverUtil {

	@Test(groups = { "regression" })
	public void deliveryModePresenet() throws IOException, AWTException {
		List<String> codes = Arrays.asList("3261", "3409");
		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		for (String code : codes) {
			SearchResults searchResults = homePage.performSearch(code);
			ProgramPage programPage = searchResults.selectProgramByCode(Integer.parseInt(code));
			assertTrue(programPage.isElementDisplayed(Locators.ProgramPage.DELIVERYMODETEXT));
			assertTrue(programPage.isElementDisplayed(Locators.ProgramPage.DELIVERYMODE));
			assertFalse(programPage.getText(Locators.ProgramPage.DELIVERYMODETEXT).equalsIgnoreCase("Delivery Mode"));
			assertFalse(programPage.getText(Locators.ProgramPage.DELIVERYMODE).isEmpty());

			homePage = programPage.navigateHome();
		}
	}

	@Test(groups = { "data", "CUR-1077" })
	public void addDeliveryModeToCourse() throws IOException, AWTException, InterruptedException {

		// find course
		Result program = GetCourses.getCourseWithDeliveryMethod("");

		setup(driver);
		// selenium
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		SearchResults searchResults = homePage.performSearch(program.getCode());
		ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(program.getCode()));

		assertFalse(programPage.isElementPresent(Locators.ProgramPage.DELIVERYMODETEXT), "Delivery Method showing");

		PatchCourses.putDeliveryCodeOnCourse(Courses.deliveryMethod.Distance.getDeliveryCode(), program.getSysId());
		Thread.sleep(16000);

		programPage.refreshPage();

		String webDeliveryMethods = programPage.getText(Locators.ProgramPage.DELIVERYMODETEXT).replaceAll("\\s+", "")
				.replaceAll("-", "");

		assertTrue(programPage.isElementPresent(Locators.ProgramPage.DELIVERYMODETEXT), "Delivery Method showing");
		assertTrue(webDeliveryMethods.toLowerCase().contains(Courses.deliveryMethod.Distance.toString().toLowerCase()),
				"failed expected: " + webDeliveryMethods.toLowerCase() + "to contain "
						+ Courses.deliveryMethod.Distance.toString().toLowerCase() + " but didnt");
	}

	@Test(groups = { "data", "CUR-1077" })
	public void verifyChangeOfDelivery() throws IOException, InterruptedException, AWTException {

		// find course
		Result program = GetCourses.getCourseWithDeliveryMethod(Courses.deliveryMethod.FaceToFace.getDeliveryCode());

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		SearchResults searchResults = homePage.performSearch(program.getCode());
		ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(program.getCode()));

		String webDeliveryMethods = programPage.getText(Locators.ProgramPage.DELIVERYMODETEXT).replaceAll("\\s+", "")
				.replaceAll("-", "");

		assertTrue(programPage.isElementPresent(Locators.ProgramPage.DELIVERYMODETEXT), "Delivery Method showing");
		assertTrue(
				webDeliveryMethods.toLowerCase().contains(Courses.deliveryMethod.FaceToFace.toString().toLowerCase()),
				"failed expected: " + webDeliveryMethods.toLowerCase() + "to contain "
						+ Courses.deliveryMethod.Distance.toString().toLowerCase() + " but didnt");

		PatchCourses.putDeliveryCodeOnCourse(Courses.deliveryMethod.FaceToFace.getDeliveryCode(), program.getSysId());
		Thread.sleep(14000);

		programPage.refreshPage();

		webDeliveryMethods = programPage.getText(Locators.ProgramPage.DELIVERYMODETEXT).replaceAll("\\s+", "")
				.replaceAll("-", "");

		assertTrue(programPage.isElementPresent(Locators.ProgramPage.DELIVERYMODETEXT), "Delivery Method showing");
		assertTrue(webDeliveryMethods.toLowerCase().contains(Courses.deliveryMethod.Distance.toString().toLowerCase()),
				"failed expected: " + webDeliveryMethods.toLowerCase() + "to contain "
						+ Courses.deliveryMethod.Distance.toString().toLowerCase() + " but didnt");
	}

	@Ignore
	@Test(groups = { "data", "CUR-1077" })
	public void verifyRemovalDelivery() throws IOException, InterruptedException, AWTException {

		// find course
		Result program = GetCourses.getCourseWithDeliveryMethod(Courses.deliveryMethod.FaceToFace.getDeliveryCode());

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		SearchResults searchResults = homePage.performSearch(program.getCode());
		ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(program.getCode()));

		String webDeliveryMethods = programPage.getText(Locators.ProgramPage.DELIVERYMODETEXT).replaceAll("\\s+", "")
				.replaceAll("-", "");

		assertTrue(programPage.isElementPresent(Locators.ProgramPage.DELIVERYMODETEXT), "Delivery Method showing");
		assertTrue(
				webDeliveryMethods.toLowerCase().contains(Courses.deliveryMethod.FaceToFace.toString().toLowerCase()),
				"failed expected: " + webDeliveryMethods.toLowerCase() + "to contain "
						+ Courses.deliveryMethod.FaceToFace.toString().toLowerCase() + " but didnt");

		PatchCourses.putDeliveryCodeOnCourse("", program.getSysId());
		Thread.sleep(16000);

		programPage.refreshPage();

		assertFalse(programPage.isElementPresent(Locators.ProgramPage.DELIVERYMODETEXT), "Delivery Method showing");
	}

}
