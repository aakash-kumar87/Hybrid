package com.lifecycle.testscripts.academicItems;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.NotFoundException;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.library.IAcademicPage;
import com.lifecycle.locators.Locators;

public class OverviewModule extends BaseDriverUtil {

	@Test(groups = { "regression", "CUR-1593" })
	public void overviewModulePresent() throws IOException, AWTException, InterruptedException {
		setup(driver);
		HashMap<String, String> data = new HashMap<>();
		data.put("4763", "Double Degree Program");
		data.put("3409", "Program");
		data.put("COMP4141", "Course");
		data.put("ZEITS1", "Specialisation");

		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		for (Entry<String, String> entry : data.entrySet()) {
			IAcademicPage academicPage = selectPage(entry, homePage);
			assertTrue(academicPage.isElementDisplayed(Locators.AcamedicItemPage.OverviewModule.OVERVIEWPANEL));

			homePage = academicPage.navigateHome();
		}
	}

	@Test(groups = { "regression", "CUR-1593", "AI" })
	public void overviewModulePillPresent() throws IOException, AWTException, InterruptedException {
		setup(driver);
		HashMap<String, String> data = new HashMap<>();
		data.put("4763", "Double Degree Program");
		data.put("3409", "Program");
		data.put("COMP4141", "Course");
		data.put("ZEITS1", "Specialisation");

		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		for (Entry<String, String> entry : data.entrySet()) {
			IAcademicPage academicPage = selectPage(entry, homePage);
			String pillText;
			if (entry.getValue().equals("Specialisation")) {
				pillText = academicPage.getText(Locators.AcamedicItemPage.OverviewModule.AIPILLSPECIALISATION);
			} else {
				pillText = academicPage.getText(Locators.AcamedicItemPage.OverviewModule.AIPILL);

			}
			assertEquals(pillText, entry.getValue());

			homePage = academicPage.navigateHome();
		}
	}

	@Test(groups = { "regression", "CUR-1593" })
	public void overviewModuleBookmarkPresent() throws IOException, AWTException, InterruptedException {
		setup(driver);
		HashMap<String, String> data = new HashMap<>();
		data.put("4763", "Double Degree Program");
		data.put("3409", "Program");
		data.put("COMP4141", "Course");
		data.put("ZEITS1", "Specialisation");

		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		for (Entry<String, String> entry : data.entrySet()) {

			IAcademicPage academicPage = selectPage(entry, homePage);
			assertTrue(academicPage.isElementDisplayed(Locators.AcamedicItemPage.BOOKMARKBUTTON));
			academicPage.bookmarkPage();

			homePage = academicPage.navigateHome();
		}
	}

	@Test(groups = { "regression", "CUR-1593" })
	public void overviewModuleTitleAndCodePresent() throws IOException, AWTException, InterruptedException {
		setup(driver);
		HashMap<String, String> dataItems = new HashMap<>();
		dataItems.put("4763", "Double Degree Program");
		dataItems.put("3409", "Program");
		dataItems.put("COMP4141", "Course");
		dataItems.put("ZEITS1", "Specialisation");

		HashMap<String, String> dataValues = new HashMap<>();
		dataValues.put("4763", "Criminology & Criminal Justice / Law");
		dataValues.put("3409", "Arts");
		dataValues.put("COMP4141", "Theory of Computation");
		dataValues.put("ZEITS1", "Aviation");

		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		for (Entry<String, String> entry : dataItems.entrySet()) {
			String value = dataValues.get(entry.getKey());
			IAcademicPage academicPage = selectPage(entry, homePage);

			assertTrue(academicPage.isElementDisplayed(Locators.AcamedicItemPage.OverviewModule.TITLE));
			assertTrue(academicPage.isElementDisplayed(Locators.AcamedicItemPage.OverviewModule.OVERVIEWCODE));

			String overviewCode = academicPage.getText(Locators.AcamedicItemPage.OverviewModule.OVERVIEWCODE);
			String titleText = academicPage.getText(Locators.AcamedicItemPage.OverviewModule.TITLE);

			assertEquals(titleText, value);
			assertEquals(overviewCode, entry.getKey());

			homePage = academicPage.navigateHome();
		}
	}

	@Test(groups = { "regression", "CUR-1593" })
	public void overviewModuleUnitsOfCreditPresent() throws IOException, AWTException, InterruptedException {
		setup(driver);
		HashMap<String, String> dataItems = new HashMap<>();
		dataItems.put("4763", "Double Degree Program");
		dataItems.put("3409", "Program");
		dataItems.put("COMP4141", "Course");
		dataItems.put("ZEITS1", "Specialisation");

		HashMap<String, String> dataValues = new HashMap<>();
		dataValues.put("4763", "240 Units of Credit");
		dataValues.put("3409", "144 Units of Credit");
		dataValues.put("COMP4141", "6 Units of Credit");
		dataValues.put("ZEITS1", "48 Units of Credit");

		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		for (Entry<String, String> entry : dataItems.entrySet()) {
			IAcademicPage academicPage = selectPage(entry, homePage);
			String credits = academicPage.getText(Locators.AcamedicItemPage.OverviewModule.UNITCREDITS);
			assertEquals(credits, dataValues.get(entry.getKey()));

			homePage = academicPage.navigateHome();
		}
	}

	// tooltip not yet implemented
	@Test(groups = { "regression", "CUR-1593" })
	public void overviewModuleYearSwitcherControlAndToolTipPresent()
			throws IOException, AWTException, InterruptedException {

		setup(driver);
		HashMap<String, String> dataItems = new HashMap<>();
		dataItems.put("4763", "Double Degree Program");
		dataItems.put("3409", "Program");
		dataItems.put("COMP4141", "Course");
		dataItems.put("ZEITS1", "Specialisation");

		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		for (Entry<String, String> entry : dataItems.entrySet()) {
			IAcademicPage academicPage = selectPage(entry, homePage);

			assertTrue(academicPage.isElementDisplayed(Locators.AcamedicItemPage.OverviewModule.YEARSWITCHER));

			String viewingText = academicPage.getText(Locators.AcamedicItemPage.OverviewModule.VIEWINGYEAR);
			assertEquals(viewingText.trim(), "You’re viewing the 2019 Handbook");

			homePage = academicPage.navigateHome();
		}
	}

	private IAcademicPage selectPage(Entry<String, String> entry, CurriculumHomePage homepage)
			throws IOException, AWTException, InterruptedException {
		if (entry.getValue().equalsIgnoreCase("Double Degree Program")
				|| entry.getValue().equalsIgnoreCase("Program")) {
			return homepage.performSearch(entry.getKey()).selectProgramFromAll(Integer.parseInt(entry.getKey()));
		} else if (entry.getValue().equalsIgnoreCase("Course")) {
			return homepage.performSearch(entry.getKey()).selectCourseFromAll(entry.getKey());
		} else if (entry.getValue().equalsIgnoreCase("Specialisation")) {
			return homepage.performSearch(entry.getKey()).selectSpecialisationByCode(entry.getKey());
		}

		throw new NotFoundException();
	}
}
