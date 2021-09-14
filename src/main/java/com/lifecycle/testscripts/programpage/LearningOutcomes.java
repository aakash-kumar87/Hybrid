package com.lifecycle.testscripts.programpage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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

public class LearningOutcomes extends BaseDriverUtil {

	@Test(groups = { "regression", "AI" })
	public void verifyLearningCapabilitiesExpandAndPillsSingleAwardProgram()
			throws IOException, AWTException, InterruptedException {
		List<String> codes = Arrays.asList("8271", "8625", "4471");

		setup(driver);

		for (String code : codes) {
			CurriculumHomePage homePage = new CurriculumHomePage(driver);
			SearchResults searchResults = homePage.performSearch(code);
			ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(code));
			List<WebElement> elements = programPage.getTabElements(Locators.ProgramPage.LEARNINGOUTCOMES);
			List<WebElement> expanders = programPage
					.getTabElements(By.xpath("//div[@id='learning-outcomes']/div/div/a"));

			// skip first iteration as this is the heading
			int i = 0;
			for (WebElement webElement : elements.subList(1, elements.size())) {
				while (i < expanders.size()) {
					programPage.expandElement(expanders.get(i));
					programPage.mediumWait();
					assertTrue(webElement.isDisplayed());
					assertTrue(!webElement
							.findElements(By.xpath("//div[@id='toggleBody" + (i + 1) + "']//div[@class='a-chip']"))
							.isEmpty());
					i++;
				}
			}
			programPage.navigateHome();
		}
	}

	@Test(groups = { "regression", "AI" })
	public void verifyLearningCapabilitiesExpandAndPillsDoubleAwardProgram()
			throws IOException, AWTException, InterruptedException {
		List<String> codes = Arrays.asList("3961");
		setup(driver);

		for (String code : codes) {
			CurriculumHomePage homePage = new CurriculumHomePage(driver);
			SearchResults searchResults = homePage.performSearch(code);
			ProgramPage programPage = searchResults.selectProgramFromAll(Integer.parseInt(code));

			List<WebElement> elements = programPage.getTabElements(Locators.ProgramPage.DAPLEARNINGOUTCOMES);
			programPage.click(elements.get(0).findElement(By.xpath("button")), "dropdown");
			List<WebElement> options = elements.get(0).findElements(By.xpath("div/a"));

			assertEquals(options.size(), 2);
			for (int i = 0; i < options.size(); i++) {
				programPage.click(options.get(i), "course");
				elements = programPage.getTabElements(Locators.ProgramPage.DAPLEARNINGOUTCOMES);
				List<WebElement> expanders = programPage.getTabElements(
						By.xpath("//div[@id='dual-awards-learning-outcomes']/div[not(@aria-hidden='true')]/div/div/a"));
				int j = 2;
				for (WebElement webElement : elements.subList(1, elements.size())) {
					while (j < expanders.size()) {
						programPage.expandElement(expanders.get(j));
						programPage.mediumWait();
						assertTrue(webElement.isDisplayed());
						assertTrue(!webElement
								.findElements(By.xpath("//div[@id='toggleBody" + (j - 1) + "']//div[@class='a-chip']"))
								.isEmpty());
						j++;
					}
				}
				programPage.click(elements.get(0).findElement(By.xpath("button")), "dropdown");
			}
			programPage.navigateHome();
		}
	}
}
