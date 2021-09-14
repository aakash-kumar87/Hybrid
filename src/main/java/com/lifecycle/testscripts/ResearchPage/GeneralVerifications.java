package com.lifecycle.testscripts.ResearchPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.DataAccess.HighlyUsedRequests.Get.GetCourses;
import com.lifecycle.DataAccess.Models.CourseModel.Result;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.Utilities;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.library.ResearchPage;
import com.lifecycle.library.SearchResults;
import com.lifecycle.locators.Locators;

public class GeneralVerifications extends BaseDriverUtil {

	@Test(groups = { "regression" })
	public void navigationBoldness() throws IOException, AWTException, InterruptedException {
		String code = "4471";
		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage.shrinkWindow();
		SearchResults searchResults = homePage.performSearch(code);
		ResearchPage researchPage = searchResults.selectResearchFromAll(Integer.parseInt(code));

		scrollAndVerify(researchPage);
	}

	@Test(groups = { "regression" })
	public void codeTitleDescriptionCheck() throws IOException, AWTException, InterruptedException {
		List<String> codes = Arrays.asList("3961", "2010");
		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		for (String code : codes) {

			Result courseDetails = GetCourses.getCourseByCode(code);
			ResearchPage researchPage = homePage.performSearch(code).selectResearchFromAll(Integer.parseInt(code));

			String programTitle = researchPage.getText(Locators.AcamedicItemPage.OverviewModule.TITLE);
			String programCode = researchPage.getText(Locators.AcamedicItemPage.OverviewModule.OVERVIEWCODE);
			String programDescription = researchPage.getAttribute(Locators.ProgramPage.DESCRIPTION, "innerHTML");
			programDescription = Utilities.html2text(programDescription);
			programDescription = Utilities.convertAnyAsciiApostrophes(programDescription);
			programDescription = Utilities.removeNewLinesAndBreaks(programDescription);

			String expectedDescription = Utilities.html2text(courseDetails.getDescription());
			expectedDescription = Utilities.removeNewLinesAndBreaks(expectedDescription);

			assertEquals(programTitle, courseDetails.getName());
			assertEquals(programCode, courseDetails.getCode());
			assertEquals(programDescription.trim(), expectedDescription.trim());

			homePage = researchPage.navigateHome();
		}
	}

	@Test(groups = { "CUR-1516" })
	public void researchTeachingCalenderVerification() throws IOException, AWTException {
		String code = "2010";

		setup(driver);

		ResearchPage researchPage = new CurriculumHomePage(driver).performSearch(code)
				.selectResearchFromAll(Integer.parseInt(code));

		String text = researchPage.getText(Locators.ResearchPage.TEACHINGCALANDER);
		String expectedText = "Research Calendar";

		assertEquals(text, expectedText);
	}

	@Test(groups = { "CUR-1515" })
	public void helpTextForResearchStudyLvl() throws IOException, AWTException {
		String code = "2010";
		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		SearchResults searchResutlts = homePage.performSearch(code);
		ResearchPage researchPage = searchResutlts.selectResearchFromAll(Integer.parseInt(code));

		assertFalse(researchPage.isElementDisplayed(Locators.ResearchPage.STUDYLVLDESCRIPTION));

		researchPage.mouseHover(researchPage.getElement(Locators.ResearchPage.STUDYLVL));

		assertTrue(researchPage.isElementDisplayed(Locators.ResearchPage.STUDYLVLDESCRIPTION));

		String text = researchPage.getText(Locators.ResearchPage.STUDYLVLDESCRIPTION);
		String expectedText = "Research: A level of study which involves a student independently researching a specific"
				+ " topic under the guidance of a supervisor and producing a thesis or report."
				+ " Some research programs involve a coursework component.";

		assertEquals(text, expectedText);
	}

	private void scrollAndVerify(ResearchPage researchPage) throws InterruptedException {
		List<WebElement> elements = researchPage.getTabElements(Locators.ProgramPage.NAVIGATIONHEADERS);
		List<String> headings = new ArrayList<>();

		for (WebElement webElement : elements) {
			headings.add(researchPage.getText(webElement));
		}
		for (String heading : headings.subList(1, headings.size())) {
			researchPage.scrollToHeading(heading);
			if (heading.equals("Sample Double Degree(s)")) {
				researchPage.jsSroll(-30);
			}
			researchPage.shortWait();
			assertTrue(researchPage.getElementAttribute(heading, "class").contains("active"));
		}
	}
}
