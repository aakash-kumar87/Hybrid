package com.lifecycle.testscripts.search;

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
import com.lifecycle.library.SearchResults;
import com.lifecycle.locators.Locators;

public class SearchJourneyTabs extends BaseDriverUtil {

	public final List<String> expectedOrder = Arrays.asList("Undergraduate", "Postgraduate", "Research");

	@Test(groups = { "regression", "CUR-1392" })
	public void programTabStudyLvlValidation() throws IOException, InterruptedException, AWTException {
		setup(driver);

	}

	@Test(groups = { "regression", "CUR-1392" })
	public void specializationTabStudyLvlValidation() throws InterruptedException, IOException, AWTException {
		setup(driver);

		SearchResults searchResults = new CurriculumHomePage(driver).performSearch("");

	
	}

	@Test(groups = { "regression", "CUR-1392" })
	public void courseTabStudyLvlValidation() throws IOException, InterruptedException, AWTException {
		setup(driver);

		SearchResults searchResults = new CurriculumHomePage(driver).performSearch("");

		

	}
}
