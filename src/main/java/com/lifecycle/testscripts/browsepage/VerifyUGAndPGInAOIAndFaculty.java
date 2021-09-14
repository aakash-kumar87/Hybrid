package com.lifecycle.testscripts.browsepage;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.BrowsePage;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.library.SearchResults;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class VerifyUGAndPGInAOIAndFaculty extends BaseDriverUtil {

	private boolean flag;

	@Test
	public void verifyUG() throws IOException, AWTException, InterruptedException {
		Reporting.setReportingValues(this.getClass().getName());

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage.selectByAoiTab();
		List<WebElement> items = driver.findElements(Locators.HomePage.AREAOFINTERESTTABS);

		for (int i = 0; i < items.size(); i++) {
			BrowsePage browsePage = homePage.selectBrowseTypeByIndex(Locators.HomePage.AREAOFINTERESTTABS, i);

			List<WebElement> li = browsePage.getTabElements(By.xpath("(//div[@class='m-page-nav-list'])[1]/div"));

			for (int j = 1; j <= li.size(); j++) {
				browsePage.click(By.xpath("//div[@class='m-page-nav-list']/div[" + j + "]"), null);
				browsePage.shortWait();
				String aListItem = browsePage.getText(By.xpath("//div[@class='m-page-nav-list']/div[" + j + "]"));

				flag = browsePage.isElementDisplayed(By.xpath("//h3[contains(text(),'" + aListItem + "')]"));
				if (!flag) {
					Reporting.logResults(driver, "Fail",
							"Verify Left pane Elements", "Element " + aListItem + "in Left pane is Not displayed as header in the right");
				} else {
					Reporting.logResults(driver, "Pass",
							"Verify Left pane Elements in Undergrad", "Element " + aListItem + "in Left pane is displayed as header in the right");
				}
			}

			String title = browsePage.getText(By.xpath("//h2[@class='a-browse-heading']"));

			SearchResults searchResults = browsePage
					.selectGoToSearch(Locators.BrowsePage.Undergraduate.COURSEPROGRAMLISTSEARCH);

			searchResults.click(By.xpath("//span[text()='Area of Interest']"), null);
			List<WebElement> l = searchResults
					.getTabElements(By.xpath("//div[@class='o-filter-category'][3]//div[@class='o-filter-option']"));

			for (int j = 1; j <= l.size(); j++) {

				flag = searchResults.isElementDisplayed(
						By.xpath("//div[@class='o-filter-category'][3]//div[@class='o-filter-option']//label[text()='"
								+ title + "']/input"));

				if (flag) {
					Reporting.logResults(driver, "Pass",
							"Verify Area of Interest in go to search link  ", "Area of Interest in go to search link was matched");
					break;
				}
			}
			homePage = browsePage.navigateHome();
		}
	}

	@Test
	public void verifyPG() throws IOException, AWTException, InterruptedException {
		Reporting.setReportingValues(this.getClass().getName());

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage.selectByAoiTab();
		List<WebElement> items = driver.findElements(Locators.HomePage.AREAOFINTERESTTABS);

		for (int i = 0; i < items.size(); i++) {
			BrowsePage browsePage = homePage.selectBrowseTypeByIndex(Locators.HomePage.AREAOFINTERESTTABS, i);

			List<WebElement> li = browsePage.getTabElements(By.xpath("(//div[@class='m-page-nav-list'])[1]/div"));
			browsePage.mediumWait();
			browsePage.selectEducationLevel("postgraduate");
			for (int j = 1; j < li.size(); j++) {
				browsePage.click(By.xpath("(//div[@class='m-page-nav-list'])[2]/div[" + j + "]"), null);
				browsePage.mediumWait();
				String aListItem = browsePage.getText(By.xpath("//div[@class='m-page-nav-list']/div[" + j + "]"));

				flag = browsePage.isElementDisplayed(
						By.xpath("//div[@id='Postgraduate']//h3[contains(text(),'" + aListItem + "')]"));
				browsePage.shortWait();
				if (!flag) {
					Reporting.logResults(driver, "Fail",
							"Verify Left pane Elements", "Element " + aListItem + "in Left pane is Not displayed as header in the right");
				} else {
					Reporting.logResults(driver, "Pass",
							"Verify Left pane Elements in Undergrad", "Element " + aListItem + "in Left pane is displayed as header in the right");
				}
			}

			String title = browsePage.getText(By.xpath("//h2[@class='a-browse-heading']"));

			SearchResults searchResults = browsePage
					.selectGoToSearch(Locators.BrowsePage.Postgraduate.COURSEPROGRAMLISTSEARCH);
			searchResults.selectEducationLevel("postgraduate");
			searchResults.shortWait();
			searchResults.click(By.xpath("//span[text()='Area of Interest']"), null);
			List<WebElement> l = searchResults
					.getTabElements(By.xpath("//div[@class='o-filter-category'][3]//div[@class='o-filter-option']"));

			for (int j = 1; j <= l.size(); j++) {

				flag = searchResults.isElementDisplayed(
						By.xpath("//div[@class='o-filter-category'][3]//div[@class='o-filter-option']//label[text()='"
								+ title + "']/input"));

				if (flag) {
					Reporting.logResults(driver, "Pass",
							"Verify Area of Interest in go to search link  ", "Area of Interest in go to search link was matched");
					break;
				}
			}
			homePage = browsePage.navigateHome();
		}
	}
}
