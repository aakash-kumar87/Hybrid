package com.lifecycle.testscripts.programpage;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.library.ProgramPage;
import com.lifecycle.library.SearchResults;
import com.lifecycle.locators.Locators;

public class RecognitionOfAchievement extends BaseDriverUtil {

	@Test(groups = { "regression" })
	public void passWithDistinctionPresent() throws IOException, AWTException {
		List<String> codes = Arrays.asList("3409");
		String awardTitle = "Award of Pass with Distinction";
		String awardBody = "The Award of Pass with Distinction is awarded when a weighted average mark (WAM) of at least 75% has been achieved and at least 50% of the requirements of the award completed at UNSW. All eligible programs will award Pass with Distinction except in special circumstances where approval of Academic Board has been given for a program to opt out.";
		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		for (String code : codes) {
			SearchResults searchResults = homePage.performSearch(code);
			ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(code));

			List<WebElement> awards = programPage.getTabElements(Locators.ProgramPage.RECOGNITIONOFACHIEVEMENT);

			findAndVerify(awardBody, awardTitle, programPage, awards);

			homePage = programPage.navigateHome();
		}

	}

	@Test(groups = { "regression" })
	public void universityMedalPresent() throws IOException, AWTException {
		List<String> codes = Arrays.asList("3409");
		String awardTitle = "University Medal";
		String awardBody = "The University Medal is awarded to recognise outstanding academic performance by a bachelor degree student in line with the University Medal Policy and University Medal Procedure.";
		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		for (String code : codes) {
			SearchResults searchResults = homePage.performSearch(code);
			ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(code));

			List<WebElement> awards = programPage.getTabElements(Locators.ProgramPage.RECOGNITIONOFACHIEVEMENT);

			findAndVerify(awardBody, awardTitle, programPage, awards);

			homePage = programPage.navigateHome();
		}

	}

	private void findAndVerify(String awardBody, String awardTitle, ProgramPage programPage, List<WebElement> awards)
			throws IOException, AWTException {
		for (WebElement element : awards.subList(1, awards.size())) {
			WebElement titleElement = element.findElement(By.xpath("a/div/div/p"));
			if (programPage.getText(titleElement).equals(awardTitle)) {
				programPage.click(element.findElement(By.xpath("a")), "award title");
				String text = programPage.getText(element.findElement(By.xpath("div/div/div/p")));

				assertEquals(text.trim(), awardBody);
				break;
			}
		}
	}
}
