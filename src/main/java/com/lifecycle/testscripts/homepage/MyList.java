package com.lifecycle.testscripts.homepage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.library.MyListPage;
import com.lifecycle.library.ProgramPage;
import com.lifecycle.locators.Locators;

public class MyList extends BaseDriverUtil {

	@Test(groups = { "regression", "CUR-1415" })
	public void verifyMyListUrl() throws IOException, AWTException {
		setup(driver);

		MyListPage myListPage = new CurriculumHomePage(driver).directNavigationToMyList();

		assertTrue(myListPage.isElementDisplayed(Locators.MyListPage.EMPTYCARD));
	}

	@Test(groups = { "regression", "CUR-1415" })
	public void mylistViaAddBanner() throws InterruptedException, IOException, AWTException {
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		ProgramPage programPage = homePage.performSearch("3409").selectProgramFromAll(Integer.parseInt("3409"));
		programPage.bookmarkPage();
		MyListPage myList = programPage.navigateToMyListViaBanner();
		assertEquals(myList.getTitle(), "My List");
	}

	@Test(groups = { "regression", "CUR-1415" })
	public void verifyMyListNavigationViaBrowseMenu() throws IOException, InterruptedException, AWTException {
		List<String> progamCodes = Arrays.asList("3409", "3966");

		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage = addItemsToMyList(progamCodes, homePage);
		MyListPage myListPage = homePage.navigateToMyListPageViaHamburgerMenu();
		assertTrue(!myListPage.getTabElements(Locators.MyListPage.PROGRAMCODES).isEmpty());
	}

	@Test(groups = { "regression", "CUR-1415" })
	public void addItemsToMyList() throws IOException, AWTException {
		List<String> progamCodes = Arrays.asList("3409", "3966");

		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage = addItemsToMyList(progamCodes, homePage);

		MyListPage myListPage = homePage.navigateToMyListPage();

		List<WebElement> elements = myListPage.getTabElements(Locators.MyListPage.PROGRAMCODES);
		List<String> codes = new ArrayList<>();

		for (WebElement webElement : elements) {
			codes.add(myListPage.getText(webElement));
		}

		Collections.sort(codes);

		assertTrue(progamCodes.equals(codes));
	}

	@Test(groups = { "regression", "CUR-1415" })
	public void editClearAllValidation() throws IOException, AWTException {
		List<String> progamCodes = Arrays.asList("3409", "3966");

		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage = addItemsToMyList(progamCodes, homePage);

		MyListPage myListPage = homePage.navigateToMyListPage();

		assertTrue(!myListPage.getTabElements(Locators.MyListPage.PROGRAMCODES).isEmpty());

		myListPage.clearAll();

		assertTrue(myListPage.isElementDisplayed(Locators.MyListPage.EMPTYCARD));
		// hamburger menu check
	}

	@Test(groups = { "regression", "CUR-1415" })
	public void clearRecentlyViewed() throws IOException, AWTException {
		List<String> progamCodes = Arrays.asList("3409", "3966");

		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage = addItemsToMyList(progamCodes, homePage);

		MyListPage myListPage = homePage.navigateToMyListPage();

		assertTrue(myListPage.isElementDisplayed(Locators.MyListPage.RECENTLYVIEWEDSECTION));

		myListPage.clearRecentlyViewed();

		assertFalse(myListPage.isElementDisplayed(Locators.MyListPage.RECENTLYVIEWEDSECTION));
	}

	@Test(groups = { "regression", "CUR-1415" })
	public void clearIndividualItemsInMyList() throws IOException, AWTException, InterruptedException {
		List<String> progamCodes = Arrays.asList("3409", "3966");

		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage = addItemsToMyList(progamCodes, homePage);

		MyListPage myListPage = homePage.navigateToMyListPage();
		int oldCount = myListPage.getTabElements(Locators.MyListPage.PROGRAMCODES).size();
		myListPage.removeFirstItem();
		int newCount = myListPage.getTabElements(Locators.MyListPage.PROGRAMCODES).size();
		assertEquals(newCount, oldCount - 1);
	}

	@Test(groups = { "regression", "CUR-1597" })
	public void myListItemsContainsYear() throws IOException, AWTException {
		List<String> progamCodes = Arrays.asList("3409", "3966");

		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage = addItemsToMyList(progamCodes, homePage);
		MyListPage myListPage = homePage.navigateToMyListPage();
		List<WebElement> items = myListPage.getTabElements(Locators.MyListPage.ITEMS);
		for (WebElement webElement : items) {
			String title = myListPage.getText(webElement.findElement(By.xpath("div/div/p[2]")));
			assertTrue(title.contains("2019") || title.contains("2020"));
		}
	}

	@Test(groups = { "regression", "CUR-1598" })
	public void recentlyViewedContainsYear() throws IOException, AWTException {
		List<String> progamCodes = Arrays.asList("3409", "3966");

		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage = addItemsToMyList(progamCodes, homePage);
		MyListPage myListPage = homePage.navigateToMyListPage();
		List<WebElement> items = myListPage.getTabElements(Locators.MyListPage.RECENTLYVIEWEDITEMS);
		for (WebElement webElement : items) {
			String title = myListPage.getText(webElement.findElement(By.xpath("div/p[2]")));
			assertTrue(title.contains("2019") || title.contains("2020"));
		}
	}

	private CurriculumHomePage addItemsToMyList(List<String> progamCodes, CurriculumHomePage homePage)
			throws IOException, AWTException {
		ProgramPage programPage;
		for (String code : progamCodes) {
			programPage = homePage.performSearch(code).selectProgramFromAll(Integer.parseInt(code));
			programPage.bookmarkPage();
			homePage = programPage.navigateHome();
		}
		return homePage;
	}
}
