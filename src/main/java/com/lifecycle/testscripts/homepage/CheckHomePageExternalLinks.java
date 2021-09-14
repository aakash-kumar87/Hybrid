package com.lifecycle.testscripts.homepage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class CheckHomePageExternalLinks extends BaseDriverUtil {
	List<String> hamburgerTitles = new ArrayList<>(Arrays.asList("Class Search by Teaching Period", "UNSW Home | UNSW",
			"UNSW Research | UNSW Research", "Future Students - UNSW Sydney", "UNSW Current Students", "myUNSW",
			"UNSW Handbook Previous Handbooks and Calendars"));

	List<String> headerLinks = new ArrayList<>(Arrays.asList("UNSW Handbook Previous Handbooks and Calendars", "myUNSW",
			"UNSW Current Students", "Future Students - UNSW Sydney", "UNSW Research | UNSW Research",
			"UNSW Home | UNSW", "Class Search by Teaching Period"));

	List<String> footerLinks = new ArrayList<>(
			Arrays.asList("eLearning and IT for students | UNSW Current Students", "Handbook Questions",
					"Research Listing", "Library", "UNSW International: Study Abroad - Top University in Australia",
					"Contact Student Central | UNSW Current Students"));
	List<String> pageFooterLinks = new ArrayList<>(Arrays.asList("Copyright & Disclaimer - UNSW Sydney",
			"Privacy Policy - UNSW Sydney", "Accessibility - UNSW Sydney"));

	@Test(groups = { "regression", "CUR-1287", "GM" })
	public void checkHamburgerExternalLinks() throws IOException, InterruptedException, AWTException {
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage.expandSideMenu();
		List<WebElement> elements = homePage.getTabElements(Locators.HomePage.hamburgerMenu.HAMBURGEREXTERNALLINKS);

		Thread.sleep(500);
		for (WebElement webElement : elements) {
			String title = homePage.newTabOpened(webElement);
			assertEquals(hamburgerTitles.get(0), title);
			hamburgerTitles.remove(0);
			Reporting.logResults(driver, "Pass",
					"Verify button opens link in new tab", "link opened in new tab with title that matches expected list: " + title);
		}

		assertEquals(hamburgerTitles.size(), 0,
				"Threre is still some expected headers left over.... something may be wrong");
	}

	@Test(groups = { "regression", "GM" })
	public void checkHeaderLinks() throws IOException, InterruptedException, AWTException {
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		List<WebElement> elements = homePage.getTabElements(Locators.HomePage.HEADEREXTERNALLINKS);

		Thread.sleep(500);
		for (WebElement webElement : elements) {
			homePage.mouseHover(webElement);
			Thread.sleep(200);
			assertTrue(homePage.getBackgroundColor(webElement).contains("100, 100, 100"), "colors dont match");
			String title = homePage.newTabOpened(webElement);
			assertEquals(headerLinks.get(0), title);
			headerLinks.remove(0);
			Reporting.logResults(driver, "Pass",
					"Verify button opens link in new tab", "link opened in new tab with title that matches expected list: " + title);
		}

		assertEquals(headerLinks.size(), 0,
				"Threre is still some expected headers left over.... something may be wrong");
	}

	@Test(groups = { "regression", "GM" })
	public void checkFooterLinks() throws IOException, InterruptedException, AWTException {
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		List<WebElement> elements = homePage.getTabElements(Locators.HomePage.FOOTEREXERNALLINKS);

		assertTrue(elements.size() == 6);
		homePage.scrollToPageBottom();
		for (WebElement webElement : elements) {
			homePage.mouseHover(webElement);
			Thread.sleep(300);
			assertTrue(homePage.getElementColor(webElement).contains("255, 255, 255"), "colors dont match");
			String title = homePage.newTabOpened(webElement);
			assertEquals(footerLinks.get(0), title);
			footerLinks.remove(0);
			Reporting.logResults(driver, "Pass",
					"Verify button opens link in new tab", "link opened in new tab with title that matches expected list: " + title);
		}

		assertEquals(footerLinks.size(), 0,
				"Threre is still some expected headers left over.... something may be wrong");
	}

	@Test(groups = { "regression", "GM" })
	public void checkPageFooterLinks() throws IOException, InterruptedException, AWTException {
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		List<WebElement> elements = homePage.getTabElements(Locators.HomePage.PAGEFOOTERLINKS);

		assertTrue(elements.size() == 4);
		homePage.scrollToPageBottom();
		for (WebElement webElement : elements.subList(0, elements.size() - 1)) {
			homePage.mouseHover(webElement);
			Thread.sleep(300);
			assertTrue(homePage.getBorderStatus(webElement));
			String title = homePage.newTabOpened(webElement);
			assertEquals(pageFooterLinks.get(0), title);
			pageFooterLinks.remove(0);
			Reporting.logResults(driver, "Pass",
					"Verify button opens link in new tab", "link opened in new tab with title that matches expected list: " + title);
		}

		assertEquals(pageFooterLinks.size(), 0,
				"Threre is still some expected headers left over.... something may be wrong");
	}

	@Test(groups = { "regression", "GM" })
	public void checkLogoLink() throws IOException, InterruptedException, AWTException {
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		WebElement logo = homePage.getElement(Locators.HomePage.LOGO).findElement(By.xpath("img"));
		String title = homePage.newTabOpened(logo);

		assertEquals(title.trim(), "UNSW Sydney – Australia’s Global University");
	}

	@Test(groups = { "regression", "smoke" })
	public void checkLogoHoverText() throws IOException, AWTException {
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		String logoTitleText = homePage.getAttribute(Locators.HomePage.LOGO, "title");
		assertEquals(logoTitleText, "Click here to go to UNSW website");
	}
}
