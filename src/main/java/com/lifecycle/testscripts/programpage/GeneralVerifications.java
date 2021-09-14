package com.lifecycle.testscripts.programpage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.util.Strings;

import com.lifecycle.DataAccess.HighlyUsedRequests.Get.GetAcademicItemsAssociations;
import com.lifecycle.DataAccess.HighlyUsedRequests.Get.GetCourses;
import com.lifecycle.DataAccess.Models.AssociatedItemsModel;
import com.lifecycle.DataAccess.Models.CourseModel;
import com.lifecycle.DataAccess.Models.CourseModel.Result;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.Utilities;
import com.lifecycle.library.CoursePage;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.library.ProgramPage;
import com.lifecycle.library.SearchResults;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class GeneralVerifications extends BaseDriverUtil {

	@Test(groups = { "regression" })
	public void codeTitleDescriptionCheck() throws IOException, AWTException, InterruptedException {
		List<String> codes = Arrays.asList("3409", "3261", "4471");

		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		for (String code : codes) {
			Result courseDetails = GetCourses.getCourseByCode(code);

			SearchResults searchResults = homePage.performSearch(code);
			ProgramPage programPage = searchResults.selectProgramByCode(Integer.parseInt(code));

			String programTitle = programPage.getText(Locators.AcamedicItemPage.OverviewModule.TITLE);
			String programCode = programPage.getText(Locators.AcamedicItemPage.OverviewModule.OVERVIEWCODE);
			String programDescription = programPage.getAttribute(Locators.ProgramPage.DESCRIPTION, "innerHTML");
			programDescription = Utilities.html2text(programDescription);
			programDescription = Utilities.convertAnyAsciiApostrophes(programDescription);
			programDescription = Utilities.removeNewLinesAndBreaks(programDescription);

			String expectedDescription = Utilities.html2text(courseDetails.getDescription());
			expectedDescription = Utilities.removeNewLinesAndBreaks(expectedDescription);

			assertEquals(programTitle, courseDetails.getName());
			assertEquals(programCode, courseDetails.getCode());
			assertEquals(programDescription.trim(), expectedDescription.trim());

			homePage = programPage.navigateHome();
		}
	}

	@Test(groups = { "regression" })
	public void codeTitleDescriptionCheckDap() throws IOException, AWTException, InterruptedException {
		List<String> codes = Arrays.asList("3961", "3134", "4763");

		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		for (String code : codes) {
			Result courseDetails = GetCourses.getCourseByCode(code);

			SearchResults searchResults = homePage.performSearch(code);
			ProgramPage programPage = searchResults.selectProgramByCode(Integer.parseInt(code));

			String programTitle = programPage.getText(Locators.AcamedicItemPage.OverviewModule.TITLE);
			String programCode = programPage.getText(Locators.AcamedicItemPage.OverviewModule.OVERVIEWCODE);
			String programDescription = programPage.getAttribute(Locators.ProgramPage.DESCRIPTION, "innerHTML");
			programDescription = Utilities.html2text(programDescription);
			programDescription = Utilities.convertAnyAsciiApostrophes(programDescription);
			programDescription = Utilities.removeNewLinesAndBreaks(programDescription);

			String expectedDescription = Utilities.html2text(courseDetails.getDescription());
			expectedDescription = Utilities.convertAnyAsciiApostrophes(expectedDescription);
			expectedDescription = Utilities.removeNewLinesAndBreaks(expectedDescription);

			assertEquals(programTitle, courseDetails.getName());
			assertEquals(programCode, courseDetails.getCode());
			assertEquals(programDescription.trim(), expectedDescription.trim());

			homePage = programPage.navigateHome();
		}
	}

	@Test(groups = { "regression" })
	public void navigationBoldness() throws IOException, AWTException, InterruptedException {
		String code = "4471";
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage.shrinkWindow();
		SearchResults searchResults = homePage.performSearch(code);
		ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(code));

		scrollAndVerify(programPage);
	}

	@Test(groups = { "regression", "CUR-1379" })
	public void navigationBoldnessDAP() throws InterruptedException, IOException, AWTException {
		String code = "3463";
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage.shrinkWindow();
		SearchResults searchResults = homePage.performSearch(code);

		ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(code));
		scrollAndVerify(programPage);
	}

	@Test(groups = { "regression" })
	public void durationPresenet() throws IOException, AWTException, InterruptedException {
		List<String> codes = Arrays.asList("3261", "3409", "4782", "3961");
		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		for (String code : codes) {
			SearchResults searchResults = homePage.performSearch(code);
			ProgramPage programPage = searchResults.selectProgramByCode(Integer.parseInt(code));

			programPage.shortWait();
			assertTrue(programPage.isElementDisplayed(Locators.ProgramPage.DURATION));
			assertTrue(programPage.isElementDisplayed(Locators.ProgramPage.DURATIONTEXT));
			assertTrue(programPage.getText(Locators.ProgramPage.DURATION).equalsIgnoreCase("Typical duration"));
			assertTrue(programPage.getText(Locators.ProgramPage.DURATIONTEXT).contains("Years"));

			homePage = programPage.navigateHome();
		}
	}

	@Test(groups = { "regression" })
	public void verifySampleProgramsIsPresent() throws IOException, AWTException {
		String code = "3409";
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		SearchResults searchResults = homePage.performSearch(code);
		ProgramPage programPage = searchResults.selectProgramByCode(Integer.parseInt(code));

		assertEquals(programPage.getText(Locators.ProgramPage.SAMPLEPROGRAMSHEADER).trim(), "Sample Programs");

		String bodyText = programPage.getText(
				programPage.getElement(Locators.ProgramPage.SAMPLEPROGRAMSHEADER).findElement(By.xpath("../p")));

		String expectedText = "To access sample program(s), please visit:";

		assertEquals(bodyText.trim(), expectedText, "Text is incorrect");

		assertTrue(programPage.isElementDisplayed(
				programPage.getElement(Locators.ProgramPage.SAMPLEPROGRAMSHEADER).findElement(By.xpath("../div/a"))),
				"Link is not displayed");
	}

	@Test(groups = { "regression" })
	public void testToolTips() throws IOException, AWTException, InterruptedException {
		String code = "4471";
		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		SearchResults searchResults = homePage.performSearch(code);
		ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(code));

		// program
		WebElement element = driver.findElement(By.xpath("//div[@class='a-chip-row a-btn-bookmark-offset']/div/span"));
		programPage.mouseHover(element);
		programPage.shortWait();
		assertTrue(element.findElement(By.xpath("//div[@class='a-chip-row a-btn-bookmark-offset']/div/span/span"))
				.isDisplayed());
		programPage.shortWait();

		// course credits
		element = driver.findElement(By.xpath(
				"//div[@class='a-column a-column-df-3 hide-xs hide-sm no-print']//div[@class='a-row a-row-equal-height']//div[6]//div[1]//strong[1]/span"));
		programPage.mouseHover(element);
		programPage.shortWait();
		assertTrue(element.findElement(By.xpath(
				"//div[@class='a-column a-column-df-3 hide-xs hide-sm no-print']//div[@class='a-row a-row-equal-height']//div[6]//div[1]//strong[1]/span/span"))
				.isDisplayed());
	}

	@Test(groups = { "regression" })
	public void verifyEntryRequirementsPresent() throws IOException, AWTException, InterruptedException {
		List<String> codes = Arrays.asList("8271", "5659");
		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		for (String code : codes) {
			homePage = verifyEntry(homePage, code, "Entry Requirements");
		}
	}

	@Test(groups = { "regression" })
	public void verifySpecialEntryRequirementsPresent() throws IOException, AWTException, InterruptedException {
		List<String> codes = Arrays.asList("3261", "4471");
		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		for (String code : codes) {
			homePage = verifyEntry(homePage, code, "Special Admission Requirements");
		}
	}

	@Test(groups = { "regression" })
	public void verifyRecognitionOfPriorLearning() throws IOException, AWTException, InterruptedException {
		List<String> codes = Arrays.asList("8625");
		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		for (String code : codes) {
			Reporting.logResults(driver, "Alert", "Starting test for course code " + code, "");

			SearchResults searchResults = homePage.performSearch(code);
			ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(code));
			List<WebElement> elements = programPage.getTabElements(Locators.ProgramPage.PROGRAMREQUIREMENTS);

			WebElement elementHeading = elements.get(1).findElement(By.xpath("a/div/strong"));
			assertEquals(elementHeading.getText(), "Recognition of Prior Learning");

			programPage.click(elements.get(1), "Entry Requirements");
			programPage.shortWait();
			WebElement inside = elements.get(1).findElement(By.xpath("div/div"));

			assertTrue(programPage.isElementDisplayed(inside));
			assertTrue(Strings.isNotNullAndNotEmpty(inside.getText()));

			homePage = programPage.navigateHome();
		}
	}

	@Test(groups = { "regression" })
	public void verifyProgressionRequirements() throws IOException, AWTException {
		List<String> codes = Arrays.asList("3409", "4471", "8271", "8625", "5659");
		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		for (String code : codes) {
			Reporting.logResults(driver, "Alert", "Starting test for course code " + code, "");

			SearchResults searchResults = homePage.performSearch(code);
			ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(code));
			List<WebElement> elements = programPage.getTabElements(Locators.ProgramPage.PROGRAMREQUIREMENTS);
			int index = 1;
			if (code == "8625") {
				index = 2;
			}
			WebElement elementHeading = elements.get(index).findElement(By.xpath("a/div/strong"));
			assertEquals(elementHeading.getText(), "Progression Requirements");

			programPage.click(elements.get(index), "Entry Requirements");
			WebElement inside = elements.get(index).findElement(By.xpath("div/div"));

			assertTrue(programPage.isElementDisplayed(inside));
			assertTrue(Strings.isNotNullAndNotEmpty(inside.getText()));

			homePage = programPage.navigateHome();
		}
	}

	@Test(groups = { "regression" })
	public void verifyInternships() throws IOException, AWTException {
		List<String> codes = Arrays.asList("4471");
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		for (String code : codes) {
			Reporting.logResults(driver, "Alert", "Starting test for course code " + code, "");

			SearchResults searchResults = homePage.performSearch(code);
			ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(code));
			List<WebElement> elements = programPage.getTabElements(Locators.ProgramPage.PROGRAMREQUIREMENTS);
			WebElement entry = null;
			for (WebElement item : elements.subList(1, elements.size())) {

				if (item.findElement(By.xpath("a/div/strong")).getText().equals("Internships and Placements")) {
					entry = item;
				}
			}

			assertNotNull(entry, "Unable to find Internships and placements");

			programPage.click(entry, "Entry Requirements");

			WebElement inside = entry.findElement(By.xpath("div/div"));

			assertTrue(programPage.isElementDisplayed(inside));
			assertTrue(Strings.isNotNullAndNotEmpty(inside.getText()));

			homePage = programPage.navigateHome();
		}

	}

	@Test(groups = { "regression" })
	public void verifyAditionalInformationPresent() throws IOException, AWTException {
		List<String> codes = Arrays.asList("3409", "4471", "5659");

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		for (String code : codes) {
			SearchResults searchResults = homePage.performSearch(code);
			ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(code));

			WebElement element = programPage.getElement(Locators.ProgramPage.ADITIONALINFROMATION);
			assertTrue(programPage.isElementDisplayed(element));

			String sectionHeading = programPage.getText(element.findElement(By.xpath("h3")));
			assertEquals(sectionHeading.trim(), "Additional Information");

			homePage = programPage.navigateHome();
		}
	}

	@Test(groups = { "regression", "CUR-1352" })
	public void verifySaPandDaPStructureText() throws IOException, AWTException {
		setup(driver);
		HashMap<String, String> data = new HashMap<>();
		data.put("4763", "Dual Award");
		data.put("3409", "Single Award");

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		for (Entry<String, String> program : data.entrySet()) {
			ProgramPage programPage = homePage.performSearch(program.getKey())
					.selectProgramFromAll(Integer.parseInt(program.getKey()));

			String structureTitleText = programPage.getText(Locators.ProgramPage.ProgramStructure.TITLE);
			String sideMenu = programPage.getText(Locators.AcamedicItemPage.SideMenu.PROGRAMSTRUCTURE);

			if (program.getValue().equals("Dual Award")) {
				assertEquals(structureTitleText, "Double Degree Structure");
				assertEquals(sideMenu, "Double Degree Structure");
			} else {
				assertEquals(structureTitleText, "Program Structure");
				assertEquals(sideMenu, "Program Structure");
			}
			homePage = programPage.navigateHome();
		}
	}

	@Test
	public void standAloneProgramsDap() throws IOException, AWTException, InterruptedException {
		setup(driver);

		List<String> codes = Arrays.asList("3961", "3856");

		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		for (String code : codes) {
			List<String> standAlonePrograms = retriveStandalonePrograms(code);

			CoursePage programPage = homePage.performSearch(code).selectCourseFromAll(code);

			List<String> standAloneCodes = new ArrayList<>();
			for (WebElement element : programPage.getTabElements(Locators.ProgramPage.STANDALONEPROGRAMCODES)) {
				standAloneCodes.add(element.getText());
			}
			assertEquals(standAloneCodes.size(), standAlonePrograms.size());
			assertTrue(standAloneCodes.equals(standAlonePrograms));

			homePage = programPage.navigateHome();
		}
	}

	@Test(groups = { "regression" })
	public void verifyAditionalExpensesPresent() throws IOException, AWTException {
		List<String> codes = Arrays.asList("3261", "8271");

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		for (String code : codes) {
			SearchResults searchResults = homePage.performSearch(code);
			ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(code));

			WebElement element = programPage.getElement(Locators.ProgramPage.ADDITIONALEXPENSES);
			assertTrue(programPage.isElementDisplayed(element));

			String sectionHeading = programPage.getText(element.findElement(By.xpath("strong")));
			assertEquals(sectionHeading.trim(), "Additional Expenses");

			homePage = programPage.navigateHome();
		}
	}

	private List<String> retriveStandalonePrograms(String code) throws IOException, InterruptedException {
		List<String> codes = new ArrayList<>();
		List<AssociatedItemsModel.Result> results = GetAcademicItemsAssociations.getStandAlonePrograms(code);
		for (AssociatedItemsModel.Result result : results) {
			CourseModel.Result courseResult = GetCourses
					.getCourseBySysIdNoPublishedState(result.getAcademicItem().getValue());
			if (courseResult.getPublishedInHandbook().equals("1") && courseResult.getActive().equals("true")) {
				codes.add(courseResult.getCode());
			}
		}

		return codes.stream().distinct().collect(Collectors.toList());
	}

	private CurriculumHomePage verifyEntry(CurriculumHomePage homePage, String code, String heading)
			throws IOException, AWTException, InterruptedException {
		Reporting.logResults(driver, "Alert", "Starting test for course code " + code, "");

		SearchResults searchResults = homePage.performSearch(code);
		ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(code));
		List<WebElement> elements = programPage.getTabElements(Locators.ProgramPage.ADMISSIONREQUIREMENTS);

		WebElement elementHeading = elements.get(1).findElement(By.xpath("a/div/strong"));
		assertEquals(elementHeading.getText(), heading);

		programPage.click(elements.get(1), "Entry Requirements");
		programPage.shortWait();
		WebElement inside = elements.get(1).findElement(By.xpath("div/div/p"));

		assertTrue(programPage.isElementDisplayed(inside));
		assertTrue(Strings.isNotNullAndNotEmpty(inside.getText()));

		homePage = programPage.navigateHome();
		return homePage;
	}

	private void scrollAndVerify(ProgramPage programPage) throws InterruptedException {
		List<WebElement> elements = programPage.getTabElements(Locators.ProgramPage.NAVIGATIONHEADERS);
		List<String> headings = new ArrayList<>();

		for (WebElement webElement : elements) {
			headings.add(programPage.getText(webElement));
		}
		for (String heading : headings.subList(1, headings.size())) {
			programPage.scrollToHeading(heading);
			if (heading.equals("Sample Double Degree(s)")) {
				programPage.jsSroll(-30);
			}
			programPage.shortWait();
			assertTrue(programPage.getElementAttribute(heading, "class").contains("active"));
		}
	}

}
