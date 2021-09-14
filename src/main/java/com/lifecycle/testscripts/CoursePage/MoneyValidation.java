package com.lifecycle.testscripts.CoursePage;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.BrowsePage;
import com.lifecycle.library.CoursePage;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.locators.Locators;

public class MoneyValidation extends BaseDriverUtil {

	@Test(groups = { "regression", "CUR-1309" })

	public void checkValueHasDollarSign() throws IOException, InterruptedException, AWTException {
		setup(driver);

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		homePage.selectByAoiTab();

		BrowsePage browsePage = homePage.selectAreaByName("Environmental and Related Studies");
		browsePage.expandSection(Locators.BrowsePage.Undergraduate.COURSEPROGRAMLISTVIEWMORE);

		List<WebElement> items = browsePage
				.retrieveAllItemsInSection(Locators.BrowsePage.Undergraduate.COURSEPROGRAMLIST);

		CoursePage coursePage = browsePage.selectRandomCourseItem(items);
		
	}
}
