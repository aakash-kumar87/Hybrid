package com.lifecycle.testscripts.programpage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.library.ProgramPage;
import com.lifecycle.locators.Locators;

public class CallToAction extends BaseDriverUtil {

	@Test(groups = { "regression" })
	public void facultyLinkVerificaiton() throws IOException, AWTException, InterruptedException {
		setup(driver);
		HashMap<String, String> data = new HashMap<>();
		data.put("3409", "UNSW Arts & Social Sciences - your licence to explore");
		data.put("3261", "Built Environment | Built Environment");
		data.put("4471", "UNSW Canberra");
		data.put("8271", "UNSW Science for society: Learn, Explore, Discover");
		data.put("8625", "UNSW Business School - Where great minds do business");

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		for (Entry<String, String> program : data.entrySet()) {
			ProgramPage programPage = homePage.performSearch(program.getKey())
					.selectProgramFromAll(Integer.parseInt(program.getKey()));
			assertTrue(programPage.isClickable(programPage.getElement(Locators.ProgramPage.FACULTYLINK)));
			String title = programPage.newTabOpened(programPage.getElement(Locators.ProgramPage.FACULTYLINK));

			assertEquals(title.trim(), program.getValue());

			homePage = programPage.navigateHome();
		}
	}
}
