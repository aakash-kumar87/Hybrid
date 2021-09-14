package com.lifecycle.library;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.collect.Ordering;
import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class BrowsePage extends ActionDriver {

	private Random rand = new Random();

	public BrowsePage(WebDriver incomingDriver) {
		super(incomingDriver);
	}

	public List<WebElement> retrieveAllItemsInSection(By section) {
		return driver.findElements(section);
	}

	public CoursePage selectRandomCourseItem(List<WebElement> items) {
		items.get(rand.nextInt(items.size())).click();
		return new CoursePage(driver);
	}

	public ProgramPage selectRandomProgramItem(List<WebElement> items) {
		items.get(rand.nextInt(items.size())).click();
		return new ProgramPage(driver);
	}

	public SpecializationPage selectRandomSpecializationItem(List<WebElement> items) {
		items.get(rand.nextInt(items.size())).click();
		return new SpecializationPage(driver);
	}

	public void selectEducationLevel(String level) throws IOException, AWTException {
		if (level.equalsIgnoreCase("undergraduate")) {
			click(Locators.BrowsePage.UNDERGRADUATEBTN, "undergraduate button");
		} else if (level.equalsIgnoreCase("postgraduate")) {
			click(Locators.BrowsePage.POSTGRADUATEBTN, "undergraduate button");
		}
	}

	/**
	 * This method will validate Title and description in BRowse section of Area of
	 * Interest in home page and also in the landing page
	 * 
	 * @return
	 * @throws HeadlessException
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean verifyAreadOfInterstValidation() throws IOException {
		flag = false;
		try {

			List<WebElement> items = driver.findElements(Locators.BrowsePage.AREAOFINTERESTTABS);
			int count = items.size();

			for (int i = 0; i < count; i++) {

				items = driver.findElements(Locators.BrowsePage.AREAOFINTERESTTABS);

				String sTitle = items.get(i).findElement(By.xpath("div/h3")).getText();
				String sDescription = items.get(i).findElement(By.xpath("div[@class='a-browse-tile-content']/p"))
						.getText();
				ActionDriver action = new ActionDriver(driver);
				action.click(items.get(i), "");
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				String aTitle = driver.findElement(Locators.AcamedicItemPage.TITLE).getText();
				String aDescription = driver.findElement(Locators.AcamedicItemPage.DESCRIPTION).getText();

				if (aTitle.equalsIgnoreCase(sTitle) && aDescription.equalsIgnoreCase(sDescription)) {
					Reporting.logResults(driver, "Pass",
							"Verify" + aTitle + "and" + aDescription + " in Area of Interest",
							"Verified " + aTitle + " in Area of Interest");

				} else {
					Reporting.logResults(driver, "Fail",
							"Verify" + aTitle + "and" + aDescription + " in Area of Interest",
							"Failed to Verify " + aTitle + " in Area of Interest");
				}

				action.click(Locators.HomePage.HOMEBTN, "Home button");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	/**
	 * This method will validate Title and description in BRowse section of
	 * Faculties in home page and also in the landing page
	 * 
	 * @return
	 * @throws HeadlessException
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean verifyByFacultyValidation() throws IOException {
		flag = false;
		try {
			ActionDriver action = new ActionDriver(driver);
			action.click(Locators.BrowsePage.FACULTIES, "Clicked on Faculty");
			List<WebElement> items = driver.findElements(Locators.BrowsePage.AREAOFFACULTY);
			int count = items.size();

			for (int i = 0; i < count; i++) {

				items = driver.findElements(Locators.BrowsePage.AREAOFFACULTY);

				String sTitle = items.get(i).findElement(By.xpath("div/h3")).getText();
				String sDescription = items.get(i).findElement(By.xpath("div[@class='a-browse-tile-content']/p"))
						.getText();
				action.click(items.get(i), "");
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				String aTitle = driver.findElement(Locators.AcamedicItemPage.TITLE).getText();
				String aDescription = driver.findElement(Locators.AcamedicItemPage.DESCRIPTION).getText();

				if (aTitle.equalsIgnoreCase(sTitle) && aDescription.equalsIgnoreCase(sDescription)) {
					Reporting.logResults(driver, "Pass", "Verify" + aTitle + "and" + aDescription + " in By Faculty",
							"Verified " + aTitle + " in By Faculty");

				} else {
					Reporting.logResults(driver, "Fail", "Verify" + aTitle + "and" + aDescription + " in By Faculty",
							"Failed to Verify " + aTitle + " in By Faculty");
				}
				action.click(Locators.HomePage.HOMEBTN, "Home button");
				action.click(Locators.BrowsePage.FACULTIES, "Clicked on Faculty");
			}
			flag = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public boolean verifyListIsOrdered(By listLocator) throws IOException, AWTException {
		List<WebElement> elements = driver.findElements(listLocator);
		List<String> codes = new ArrayList<>();
		for (WebElement e : elements) {
			codes.add(e.getText());
		}
		if (Ordering.natural().isOrdered(codes)) {
			Reporting.logResults(driver, "Pass", "Verify Items are in order", "Elements in order");
			return true;
		}
		Reporting.logResults(driver, "Fail", "Verify Items are in order", "Elements in order");
		return false;
	}

	public boolean verifyHeader(int menuIndex) throws IOException, AWTException {
		String aListItem = driver.findElement(By.xpath("//div[@class='m-page-nav-list']/div[" + menuIndex + "]"))
				.getText();

		boolean flag = driver.findElement(By.xpath("//h3[contains(text(),'" + aListItem + "')]")).isDisplayed();
		if (!flag) {
			Reporting.logResults(driver, "Fail", "Verify Left pane Elements",
					"Element " + aListItem + "in Left pane is Not displayed as header in the right");
		} else {
			Reporting.logResults(driver, "Pass", "Verify Left pane Elements in Undergrad",
					"Element " + aListItem + "in Left pane is displayed as header in the right");
		}
		return flag;
	}

	public SearchResults selectGoToSearch(By locator) throws IOException, AWTException {
		click(locator, "");
		return new SearchResults(driver);
	}

	/////////////////////////

	/**
	 * This method will validate Title and description in BRowse section of
	 * Faculties in home page and also in the landing page
	 * 
	 * @return
	 * @throws HeadlessException
	 * @throws IOException
	 * @throws AWTException
	 */

	public SearchResults goToSearch(int index) throws IOException, AWTException {
		click(By.xpath(
				"(//button[text()='Undergraduate ']//ancestor::div[@class='a-browse-tab-panel']//a[@class='a-browse-more-controls-link'])["
						+ index + "]"),
				"Go to search");
		return new SearchResults(driver);
	}

	public boolean areaOfInterst() {
		try {
			ActionDriver action = new ActionDriver(driver);
			flag = action.isElementPresent(Locators.BrowsePage.AREAOFINTERSTACTIVE);
			if (!flag) {
				Reporting.logResults(driver, "Fail", "Verify Area of Interest is active By default",
						"Area of Interst is not active by Default");
			} else {
				Reporting.logResults(driver, "Pass", "Verify Area of Interest is active By default",
						"Area of Interst is Active by Default");
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return flag;
	}
}
