package com.lifecycle.testscripts.programpage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.library.ProgramPage;
import com.lifecycle.library.SearchResults;
import com.lifecycle.locators.Locators;

public class ProfessionalOutcomes extends BaseDriverUtil {

	@Test(groups = { "regression" })
	public void verifyAccreditationsPresent() throws IOException, AWTException, InterruptedException {
		List<String> codes = Arrays.asList("4471");

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		for (String code : codes) {
			SearchResults searchResults = homePage.performSearch(code);
			ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(code));

			assertEquals(programPage.getText(Locators.ProgramPage.ProfessionalOutcomes.ACCREDITATIONSTEXT),
					"Accreditations");

			programPage.click(Locators.ProgramPage.ProfessionalOutcomes.ACCREDITATIONSTEXT, "title");
			programPage.shortWait();
			assertTrue(programPage.isElementDisplayed(Locators.ProgramPage.ProfessionalOutcomes.ACCREDITATIONSBODY),
					"Element not displayed");

			homePage = programPage.navigateHome();
		}
	}

	@Test(groups = { "regression" })
	public void verifyProfessionalRecognitionPresent() throws IOException, AWTException, InterruptedException {
		List<String> codes = Arrays.asList("3362", "8257");

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		for (String code : codes) {
			SearchResults searchResults = homePage.performSearch(code);
			ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(code));

			assertEquals(programPage.getText(Locators.ProgramPage.ProfessionalOutcomes.PROFESSIONALRECOGNITIONTEXT),
					"Professional Recognition");

			programPage.click(Locators.ProgramPage.ProfessionalOutcomes.PROFESSIONALRECOGNITIONTEXT, "title");
			programPage.shortWait();
			assertTrue(
					programPage
							.isElementDisplayed(Locators.ProgramPage.ProfessionalOutcomes.PROFESSIONALRECOGNITIONBODY),
					"Element not displayed");

			homePage = programPage.navigateHome();
		}
	}

	@Test(groups = { "regression" })
	public void verifyCareerOpportunitiesPresent() throws IOException, AWTException, InterruptedException {
		List<String> codes = Arrays.asList("3409", "3261");

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		for (String code : codes) {
			SearchResults searchResults = homePage.performSearch(code);
			ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(code));

			assertEquals(programPage.getText(Locators.ProgramPage.ProfessionalOutcomes.CAREEROPPORTUNITIESTEXT),
					"Career Opportunities");

			programPage.click(Locators.ProgramPage.ProfessionalOutcomes.CAREEROPPORTUNITIESTEXT, "title");
			programPage.shortWait();
			assertTrue(
					programPage.isElementDisplayed(Locators.ProgramPage.ProfessionalOutcomes.CAREEROPPORTUNITIESBODY),
					"Element not displayed");

			homePage = programPage.navigateHome();
		}
	}
}
