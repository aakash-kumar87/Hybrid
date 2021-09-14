package com.lifecycle.testscripts.programpage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.DataAccess.HighlyUsedRequests.Get.GetAcademicItemsAssociations;
import com.lifecycle.DataAccess.HighlyUsedRequests.Get.GetCourses;
import com.lifecycle.DataAccess.Models.AssociatedItemsModel;
import com.lifecycle.DataAccess.Models.CourseModel;
import com.lifecycle.DataAccess.Models.CourseModel.Result;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.enums.Courses;
import com.lifecycle.enums.Courses.location;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.library.ProgramPage;
import com.lifecycle.locators.Locators;

public class RelatedPrograms extends BaseDriverUtil {
	@Test(groups = { "regression" })
	public void verifyDapRelatedPrograms() throws IOException, AWTException, InterruptedException {
		setup(driver);

		List<String> codes = Arrays.asList("3444", "3447");

		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		for (String code : codes) {
			List<String> expectedCodes = retrieveRelatedDapPrograms(code);

			ProgramPage programPage = homePage.performSearch(code).selectProgramFromAll(Integer.parseInt(code));
			List<String> relatedCodes = new ArrayList<>();
			for (WebElement element : programPage.getTabElements(Locators.ProgramPage.RELATEDDAPCODES)) {
				relatedCodes.add(element.getText().split(" ", 2)[0]);
			}

			Collections.sort(expectedCodes);

			assertEquals(relatedCodes.size(), expectedCodes.size());
			assertTrue(expectedCodes.equals(relatedCodes));

			homePage = programPage.navigateHome();
		}
	}

	@Test(groups = { "regression" })
	public void verifySapRelatedPrograms() throws IOException, AWTException, InterruptedException {
		setup(driver);

		List<String> codes = Arrays.asList("3775", "3966");

		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		for (String code : codes) {
			List<String> expectedCodes = retrieveRelatedSapPrograms(code);

			ProgramPage programPage = homePage.performSearch(code).selectProgramFromAll(Integer.parseInt(code));
			List<String> relatedCodes = new ArrayList<>();
			for (WebElement element : programPage.getTabElements(Locators.ProgramPage.RELATEDSAPCODES)) {
				relatedCodes.add(element.getText().split(" ", 2)[0]);
			}

			Collections.sort(expectedCodes);

			assertEquals(relatedCodes.size(), expectedCodes.size());
			assertTrue(expectedCodes.equals(relatedCodes));

			homePage = programPage.navigateHome();
		}
	}

	@Test(groups = { "regression", "CUR-1353" })
	public void detailsAppearWhereRelevant() throws IOException, InterruptedException, AWTException {
		setup(driver);

		List<String> codes = Arrays.asList("3775", "3966");

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		for (String code : codes) {
			ProgramPage programPage = homePage.performSearch(code).selectProgramFromAll(Integer.parseInt(code));
			List<WebElement> programs = programPage.getTabElements(Locators.ProgramPage.RELATEDSAPTABS);
			for (WebElement program : programs.subList(1, programs.size())) {
				String relatedCode = programPage.getText(program.findElement(By.xpath("a/div/div/strong"))).split(" ",
						2)[0];
				programPage.expandElement(program);

				String programInformation = programPage.getText(program.findElement(By.xpath("div/div/p")));
				Result programInfo = GetCourses.getCourseByCode(relatedCode.trim());

				if (!programInfo.getLocation().getValue().isEmpty()) {
					String location = "";
					for (location c : Courses.location.values()) {
						if (c.getLocationCode().equals(programInfo.getLocation().getValue())) {
							location = c.name();
						}
					}

					assertTrue(programInformation.toLowerCase().contains(location.toLowerCase()));

				}
			}
			homePage = programPage.navigateHome();
		}
		// if it contains x y z do check else continue
	}

	private List<String> retrieveRelatedDapPrograms(String code) throws IOException, InterruptedException {
		List<String> codes = new ArrayList<>();
		List<AssociatedItemsModel.Result> results = GetAcademicItemsAssociations.getRelatedDapProgramsCourses(code);
		for (AssociatedItemsModel.Result result : results) {
			CourseModel.Result courseResult = GetCourses
					.getCourseBySysIdNoPublishedState(result.getAssociatedAcademicItem().getValue());
			if (courseResult.getPublishedInHandbook().equals("1") && courseResult.getActive().equals("true")) {
				codes.add(courseResult.getCode());
			}
		}
		return codes.stream().distinct().collect(Collectors.toList());
	}

	private List<String> retrieveRelatedSapPrograms(String code) throws IOException, InterruptedException {
		List<String> codes = new ArrayList<>();
		List<AssociatedItemsModel.Result> results = GetAcademicItemsAssociations.getRelatedSapProgramsCourses(code);
		for (AssociatedItemsModel.Result result : results) {
			CourseModel.Result courseResult = GetCourses
					.getCourseBySysIdNoPublishedState(result.getAssociatedAcademicItem().getValue());
			if (courseResult.getPublishedInHandbook().equals("1") && courseResult.getActive().equals("true")) {
				codes.add(courseResult.getCode());
			}
		}
		return codes.stream().distinct().collect(Collectors.toList());
	}
}
