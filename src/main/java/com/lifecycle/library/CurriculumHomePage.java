package com.lifecycle.library;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.locators.Locators;
import com.lifecycle.locators.Locators.HomePage;
import com.lifecycle.locators.Locators.HomePage.hamburgerMenu;
import com.lifecycle.reporting.Reporting;

public class CurriculumHomePage extends ActionDriver {
	public CurriculumHomePage(WebDriver incomingDriver) {
		super(incomingDriver);
		wait.until(ExpectedConditions.titleContains("Student Handbook"));
	}

	public SearchPage search(String acadmeicitem) throws IOException {

		try {
			ActionDriver action = new ActionDriver(driver);
			action.click(Locators.HomePage.SEARCH, "search page");
			action.enter(Locators.HomePage.SEARCH, acadmeicitem, "Search button in home page");
	
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			flag = true;

		} catch (Exception e) {

			e.getMessage();
		}
		return new SearchPage(driver);
	}

	public SearchResults performSearch(String searchText) {
		try {
			if (click(Locators.HomePage.SEARCH, "search area")) {
				if (enter(Locators.HomePage.SEARCH, searchText, "Search button in home page")) {
					click(Locators.HomePage.SEARCHBUTTON, "Search Button");

				} else {
					Reporting.logResults(driver, "fail", "enter action", "enter failed");
				}
			} else {
				Reporting.logResults(driver, "Search ", "Search action", "Search failed");
			}
			shortWait();
			return new SearchResults(driver);
		} catch (Exception e) {
			throw new NotFoundException(e);
		}
	}

	public MyListPage navigateToMyListPage() throws IOException, AWTException {
		click(Locators.HomePage.MYLISTVIEWALLBTN, "my list view all");
		return new MyListPage(driver);
	}

	public void selectByAoiTab() throws IOException, AWTException {
		click(Locators.HomePage.AREAOFINTERESTBTN, "Area of interest");
		Assert.assertTrue(driver.findElement(Locators.HomePage.AREAOFINTERESTTABS).isDisplayed());
	}

	public void selectByFacultyTab() throws IOException, AWTException {
		click(Locators.HomePage.FACULTYBTN, "Faculty");
		Assert.assertTrue(driver.findElement(Locators.HomePage.FACULTYCONTAINERTABS).isDisplayed());
	}

	public void selectBySubjectTab() throws IOException, AWTException {
		click(Locators.HomePage.SUBJECTAREABTN, "Faculty");
		Assert.assertTrue(driver.findElement(Locators.HomePage.SUBJECTAREATABS).isDisplayed());
	}

	public BrowsePage selectAreaByName(String name) throws IOException, AWTException {
		List<WebElement> tabs = driver.findElements(HomePage.AREAOFINTERESTTABS);

		for (WebElement webElement : tabs) {
			WebElement elementHeader = webElement.findElement(By.xpath("div/h3"));
			if (elementHeader.getText().toLowerCase().contains(name.toLowerCase())) {
				click(webElement, webElement.getText());
				return new BrowsePage(driver);
			}
		}
		throw new NotFoundException("Unable to locate a tab containing \"" + name + "\" as its header");
	}

	public MyListPage directNavigationToMyList() {
		String currentUrl = driver.getCurrentUrl();
		String newUrl = currentUrl + "mylist";
		driver.get(newUrl);
		return new MyListPage(driver);
	}

	public BrowsePage selectFacultyByName(String name) throws IOException, AWTException {
		List<WebElement> tabs = driver.findElements(HomePage.FACULTYCONTAINERTABS);

		for (WebElement webElement : tabs) {
			WebElement elementHeader = webElement.findElement(By.xpath("div/h3"));
			if (elementHeader.getText().toLowerCase().contains(name.toLowerCase())) {
				click(webElement, webElement.getText());
				return new BrowsePage(driver);
			}
		}
		throw new NotFoundException("Unable to locate a tab containing \"" + name + "\" as its header");
	}

	public BrowsePage selectSubjectAreaByName(String name) throws IOException, AWTException {
		List<WebElement> tabs = driver.findElements(HomePage.SUBJECTAREATABS);

		for (WebElement webElement : tabs) {
			WebElement elementHeader = webElement.findElement(By.xpath("div/h3"));
			if (elementHeader.getText().toLowerCase().contains(name.toLowerCase())) {
				click(webElement, webElement.getText());
				return new BrowsePage(driver);
			}
		}
		throw new NotFoundException("Unable to locate a tab containing \"" + name + "\" as its header");
	}

	public BrowsePage selectBrowseTypeByIndex(By locator, int index) throws IOException {
		try {
			List<WebElement> elements = driver.findElements(locator);
			click(elements.get(index), "Clicking tab");
		} catch (Exception e) {
			throw new NotFoundException("Unable to locate index of \"" + index + "\"");
		}
		return new BrowsePage(driver);
	}

	public boolean expandSideMenu() throws IOException, InterruptedException, AWTException {
		click(Locators.HomePage.BROWSEMENUBTN, "HamburgerMenu");

		flag = isElementPresent(Locators.HomePage.BROWSEMENUCONTAINER);

		if (!flag) {
			Reporting.logResults(driver, "Fail", "Verify Menu Expanded", "Side menu is not visible");
		}
		// waiting for transition
		Thread.sleep(400);
		return flag;
	}

	public boolean noResultsAutocomplete(String searchText) throws IOException, AWTException {
		click(Locators.HomePage.SEARCH, "search area");
		enter(Locators.HomePage.SEARCH, searchText, "entering text into search");

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Locators.HomePage.SEARCHSUGGESTIONS));

		List<WebElement> list = getTabElements(Locators.HomePage.SEARCHSUGGESTIONS);
		return getText(list.get(0).findElement(By.xpath("div/span"))).equalsIgnoreCase("No results");
	}

	public MyListPage navigateToMyListPageViaHamburgerMenu() throws IOException, InterruptedException, AWTException {
		expandSideMenu();
		click(hamburgerMenu.MYLIST, "mylist section");
		shortWait();
		click(hamburgerMenu.VIEWALLBTN, "mylist view all button");
		return new MyListPage(driver);
	}
}
