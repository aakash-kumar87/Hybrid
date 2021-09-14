package com.lifecycle.testscripts.specialisationPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.DataAccess.HighlyUsedRequests.Get.GetAcademicItemsAssociations;
import com.lifecycle.DataAccess.HighlyUsedRequests.Get.GetCourses;
import com.lifecycle.DataAccess.HighlyUsedRequests.Get.GetSpecializations;
import com.lifecycle.DataAccess.Models.CourseModel;
import com.lifecycle.DataAccess.Models.SpecializationModel;
import com.lifecycle.DataAccess.Models.AssociatedItemsModel.Result;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.Utilities;
import com.lifecycle.library.CoursePage;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.library.SearchResults;
import com.lifecycle.library.SpecializationPage;
import com.lifecycle.locators.Locators;

public class GeneralVerifications extends BaseDriverUtil {

	@Test(groups = { "regression", "AI" })
	public void verifyLearningCapabilitiesExpandAndPills() throws IOException, InterruptedException, AWTException {
		List<String> codes = Arrays.asList("AHISA1", "ZEITS1");

		setup(driver);

		for (String code : codes) {
			CurriculumHomePage homePage = new CurriculumHomePage(driver);
			SearchResults searchResults = homePage.performSearch(code);
			SpecializationPage specializationPage = searchResults.selectSpecialisationByCode(code);
			List<WebElement> elements = specializationPage.getTabElements(Locators.SpecialisationPage.LEARNINGOUTCOMES);
			List<WebElement> expanders = specializationPage
					.getTabElements(By.xpath("//div[@id='subject-lo']/div/div/a"));

			// skip first iteration as this is the heading
			int i = 0;
			for (WebElement webElement : elements.subList(1, elements.size())) {
				while (i < expanders.size()) {
					specializationPage.expandElement(expanders.get(i));
					specializationPage.mediumWait();
					assertTrue(webElement.isDisplayed());
					assertTrue(!webElement
							.findElements(By.xpath("//div[@id='toggleBody" + (i + 1) + "']//div[@class='a-chip']"))
							.isEmpty());
					i++;
				}
			}
			specializationPage.navigateHome();
		}
	}

	@Test(groups = { "regression" })
	public void codeTitleDescriptionCheck() throws IOException, InterruptedException, AWTException {
		List<String> codes = Arrays.asList("ZEITS1", "AHISA1", "COMPJ1", "TABLA1", "COMPSS");

		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		for (String code : codes) {
			SpecializationModel.Result specializationDetails = GetSpecializations.GetSpecializationByCode(code);

			SearchResults searchResults = homePage.performSearch(code);
			SpecializationPage specializationPage = searchResults.selectSpecialisationByCode(code);

			String specializationTitle = specializationPage.getText(Locators.AcamedicItemPage.OverviewModule.TITLE);
			String specializationCode = specializationPage
					.getText(Locators.AcamedicItemPage.OverviewModule.OVERVIEWCODE);
			String specializationDescription = specializationPage.getAttribute(Locators.SpecialisationPage.DESCRIPTION,
					"innerHTML");
			specializationDescription = Utilities.html2text(specializationDescription);
			specializationDescription = Utilities.removeNewLinesAndBreaks(specializationDescription);

			String expectedDescription = Utilities.html2text(specializationDetails.getHtmlDescription());
			expectedDescription = Utilities.removeNewLinesAndBreaks(expectedDescription);
			expectedDescription = Utilities.convertAnyAsciiApostrophes(expectedDescription);

			assertEquals(specializationTitle, specializationDetails.getName());
			assertEquals(specializationCode, specializationDetails.getCode());
			assertEquals(specializationDescription.trim(), expectedDescription.trim());

			homePage = specializationPage.navigateHome();
		}
	}

	@Test(groups = { "regression" })
	public void additionInformationPresent() throws IOException, InterruptedException, AWTException {
		List<String> codes = Arrays.asList("ZEITS1", "AHISA1", "TABLA1");
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		for (String code : codes) {
			SpecializationPage specializationPage = homePage.performSearch(code).selectSpecialisationByCode(code);

			assertTrue(specializationPage.isElementDisplayed(Locators.SpecialisationPage.ADDITIONALINFORMATION),
					"unable to locate additional information for " + code);

			homePage = specializationPage.navigateHome();
		}
	}

	@Test(groups = { "regression" })
	public void additionInformationNotPresent() throws IOException, AWTException {
		List<String> codes = Arrays.asList("COMPJ1");
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		for (String code : codes) {
			CoursePage specializationPage = homePage.performSearch(code).selectCourseFromAll(code);
	
			homePage = specializationPage.navigateHome();
		}
	}

	@Test(groups = { "regression" })
	public void availableInProgramsCheck() throws IOException, InterruptedException, AWTException {

		List<String> codes = Arrays.asList("ZEITS1", "ANATA1");
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		for (String code : codes) {
			int count = 0;
			List<String> expectedAvailableInPrograms = retrieveRelatedPrograms(code);
			CoursePage specializationPage = homePage.performSearch(code).selectCourseFromAll(code);

			List<WebElement> availableInPrograms = specializationPage
					.getTabElements(Locators.ProgramPage.AVIALABLEINPROGRAMSTABS);

			if (availableInPrograms.isEmpty()) {
				availableInPrograms = specializationPage
						.getTabElements(Locators.ProgramPage.AVIALABLEINPROGRAMSTABSSMALL);
			}

			for (WebElement programs : availableInPrograms) {
				String headerText;
				try {
					headerText = specializationPage.getText(programs.findElement(By.xpath("div/h4")));

				} catch (Exception e) {
					headerText = specializationPage.getText(programs.findElement(By.xpath("div/strong")));

				}

				headerText = headerText.split(" ")[0];
				assertTrue(expectedAvailableInPrograms.contains(headerText.trim()),
						headerText + " is not an expected header");

				count++;
			}

			assertEquals(count, expectedAvailableInPrograms.size());

			homePage = specializationPage.navigateHome();
		}
	}

	private List<String> retrieveRelatedPrograms(String code) throws IOException, InterruptedException {
		List<String> codes = new ArrayList<>();
		List<Result> results = GetAcademicItemsAssociations.getAvailableInPrograms(code);
		for (Result result : results) {
			CourseModel.Result courseResult = GetCourses
					.getCourseBySysIdNoPublishedState(result.getAssociatedAcademicItem().getValue());
			if (courseResult.getPublishedInHandbook().equals("1")) {
				codes.add(courseResult.getCode());
			}
		}
		return codes;
	}
}
