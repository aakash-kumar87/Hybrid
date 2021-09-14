package com.lifecycle.testscripts.browsepage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.Utilities;
import com.lifecycle.library.BrowsePage;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.locators.Locators;

public class BrowseByAoi extends BaseDriverUtil {
	private Random rand = new Random();

	@Test(groups = { "regression", "CUR-1485" })
	public void verifySingleProgramAppearsInRelaventBrowsePage()
			throws IOException, InterruptedException, AWTException {
		String code = "3061";
		String areaOfInterest = "Natural and Physical Sciences";
		boolean flag = false;

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		BrowsePage browsePage = homePage.selectAreaByName(areaOfInterest);
		browsePage.expandSection(Locators.BrowsePage.Undergraduate.PROGRAMLISTVIEWMORE);
		List<WebElement> programs = browsePage.getTabElements(Locators.BrowsePage.Undergraduate.PROGRAMLIST);

		for (WebElement webElement : programs) {
			WebElement elementCode = webElement.findElement(By.xpath("../div[1]"));
			if (elementCode.getText().contains(code)) {
				flag = true;
				break;
			}
		}

		assertTrue(flag, "program is in the list");
	}

	@Test(groups = { "regression", "CUR-1485" })
	public void verifySingleProgramDoesntAppearsInNonRelaventBrowsePage()
			throws IOException, InterruptedException, AWTException {
		String code = "3061";
		boolean flag = false;

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		BrowsePage browsePage = homePage.selectBrowseTypeByIndex(Locators.HomePage.AREAOFINTERESTTABS, rand.nextInt(8));
		List<WebElement> programs = browsePage.getTabElements(Locators.BrowsePage.Undergraduate.PROGRAMLIST);
		if (programs.size() >= 9) {
			browsePage.expandSection(Locators.BrowsePage.Undergraduate.PROGRAMLISTVIEWMORE);
			programs = browsePage.getTabElements(Locators.BrowsePage.Undergraduate.PROGRAMLIST);
		} else {
			programs = browsePage.getTabElements(Locators.BrowsePage.Undergraduate.PROGRAMLISTBIG);
		}
		WebElement elementCode;
		for (WebElement webElement : programs) {
			if (programs.size() > 8) {
				elementCode = webElement.findElement(By.xpath("../div[1]"));
			} else {
				elementCode = webElement.findElement(By.xpath("../../div/span"));
			}
			if (elementCode.getText().contains(code)) {
				flag = true;
				break;
			}
		}

		assertFalse(flag, "program is in the list");
	}

	@Test(groups = { "regression", "CUR-1485" })
	public void verifySpecialisationAppearsInRelaventBrowsePage()
			throws IOException, InterruptedException, AWTException {
		String code = "ACCTA1";
		String areaOfInterest = "Management and Commerce";
		boolean flag = false;

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		BrowsePage browsePage = homePage.selectAreaByName(areaOfInterest);
		browsePage.expandSection(Locators.BrowsePage.Undergraduate.SPECIALPROGRAMLISTVIEWMORE);
		flag = Utilities.doesListContain(code, browsePage, Locators.BrowsePage.Undergraduate.SPECIALPROGRAMLIST);

		assertTrue(flag, "program is in the list");
	}

	@Test(groups = { "regression", "CUR-1485" })
	public void verifySpecialisationDoesntAppearsInNonRelaventBrowsePage()
			throws IOException, InterruptedException, AWTException {
		String code = "3061";
		boolean flag = false;

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		BrowsePage browsePage = homePage.selectBrowseTypeByIndex(Locators.HomePage.AREAOFINTERESTTABS,
				Utilities.getRandomWithExclusion(rand, 0, 8, 7));
		List<WebElement> programs = browsePage.getTabElements(Locators.BrowsePage.Undergraduate.PROGRAMLIST);
		if (programs.size() >= 9) {
			browsePage.expandSection(Locators.BrowsePage.Undergraduate.PROGRAMLISTVIEWMORE);
			programs = browsePage.getTabElements(Locators.BrowsePage.Undergraduate.PROGRAMLIST);
		}

		for (WebElement webElement : programs) {
			WebElement elementCode = webElement.findElement(By.xpath("../div[1]"));
			if (elementCode.getText().contains(code)) {
				flag = true;
				break;
			}
		}

		assertFalse(flag, "program is in the list");
	}

	@Test(groups = { "regression", "CUR-1485" })
	public void verifyMultiInterestProgramAppearsInRelaventBrowsePage()
			throws IOException, InterruptedException, AWTException {
		String code = "4521";
		String firstAreaOfInterest = "Architecture and Building";
		String secondAreaOfInterest = "Creative Arts";
		boolean flag = false;

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		BrowsePage browsePage = homePage.selectAreaByName(firstAreaOfInterest);
		List<WebElement> programs = browsePage.getTabElements(Locators.BrowsePage.Undergraduate.PROGRAMLIST);
		if (programs.size() >= 9) {
			browsePage.expandSection(Locators.BrowsePage.Undergraduate.PROGRAMLISTVIEWMORE);
		}
		flag = Utilities.doesListContain(code, browsePage, Locators.BrowsePage.Undergraduate.PROGRAMLIST);

		assertTrue(flag, "program is in the list");

		homePage = browsePage.navigateHome();

		browsePage = homePage.selectAreaByName(secondAreaOfInterest);
		programs = browsePage.getTabElements(Locators.BrowsePage.Undergraduate.PROGRAMLIST);
		if (programs.size() >= 9) {
			browsePage.expandSection(Locators.BrowsePage.Undergraduate.PROGRAMLISTVIEWMORE);
		}
		flag = Utilities.doesListContain(code, browsePage, Locators.BrowsePage.Undergraduate.PROGRAMLIST);

		assertTrue(flag, "program is in the list");

	}

	@Test(groups = { "regression", "CUR-1485" })
	public void verifyMultiInterestProgramDoesntAppearsInNonRelaventBrowsePage()
			throws IOException, InterruptedException, AWTException {
		String code = "4521";
		boolean flag = false;

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		BrowsePage browsePage = homePage.selectBrowseTypeByIndex(Locators.HomePage.AREAOFINTERESTTABS,
				Utilities.getRandomWithExclusion(rand, 0, 8, 0, 1, 8));
		List<WebElement> programs = browsePage.getTabElements(Locators.BrowsePage.Undergraduate.PROGRAMLIST);
		if (programs.size() >= 9) {
			browsePage.expandSection(Locators.BrowsePage.Undergraduate.PROGRAMLISTVIEWMORE);
			programs = browsePage.getTabElements(Locators.BrowsePage.Undergraduate.PROGRAMLIST);
		} else {
			programs = browsePage.getTabElements(Locators.BrowsePage.Undergraduate.PROGRAMLISTBIG);
		}
		WebElement elementCode;
		for (WebElement webElement : programs) {
			if (programs.size() > 8) {
				elementCode = webElement.findElement(By.xpath("../div[1]"));
			} else {
				elementCode = webElement.findElement(By.xpath("../../div/span"));
			}
			if (elementCode.getText().contains(code)) {
				flag = true;
				break;
			}
		}

		assertFalse(flag, "program is in the list");
	}

	@Test(groups = { "regression", "CUR-1485" })
	public void verifyDAPProgramAppearsInRelaventBrowsePage() throws IOException, InterruptedException, AWTException {
		String code = "3856";
		String firstAreaOfInterest = "Health";
		String secondAreaOfInterest = "Creative Arts";
		boolean flag = false;

		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		BrowsePage browsePage = homePage.selectAreaByName(firstAreaOfInterest);
		List<WebElement> programs = browsePage
				.getTabElements(Locators.BrowsePage.Undergraduate.DOUBLEDEGREEPROGRAMLIST);
		if (programs.size() >= 9) {
			browsePage.expandSection(Locators.BrowsePage.Undergraduate.DOUBLEDEGREEPROGRAMLISTVIEWMORE);
			flag = Utilities.doesListContain(code, browsePage,
					Locators.BrowsePage.Undergraduate.DOUBLEDEGREEPROGRAMLIST);
		} else {
			flag = Utilities.doesListContain(code, browsePage,
					Locators.BrowsePage.Undergraduate.DOUBLEDEGREEPROGRAMLISTBIG);

		}

		assertTrue(flag, "program is in the list");

		homePage = browsePage.navigateHome();

		browsePage = homePage.selectAreaByName(secondAreaOfInterest);
		programs = browsePage.getTabElements(Locators.BrowsePage.Undergraduate.DOUBLEDEGREEPROGRAMLIST);
		if (programs.size() >= 9) {
			browsePage.expandSection(Locators.BrowsePage.Undergraduate.DOUBLEDEGREEPROGRAMLISTVIEWMORE);
			flag = Utilities.doesListContain(code, browsePage,
					Locators.BrowsePage.Undergraduate.DOUBLEDEGREEPROGRAMLIST);
		} else {
			flag = Utilities.doesListContain(code, browsePage,
					Locators.BrowsePage.Undergraduate.DOUBLEDEGREEPROGRAMLISTBIG);
		}
		assertTrue(flag, "program is in the list");
	}

}
