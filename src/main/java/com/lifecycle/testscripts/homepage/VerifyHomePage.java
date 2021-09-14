package com.lifecycle.testscripts.homepage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class VerifyHomePage extends BaseDriverUtil {

	@Test
	public void loginPage() throws IOException, InterruptedException, AWTException {
		Reporting.setReportingValues(this.getClass().getName());
		setup(driver);
		try {
			driver.findElement(By.xpath("//button[text()='By Areas of Interest']"));
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	List<String> titles = new ArrayList<>(Arrays.asList("Architecture and Building", "Creative Arts", "Education",
			"Engineering and Related Technologies", "Environmental and Related Studies", "Health", "Humanities and Law",
			"Information Technology", "Management and Commerce", "Natural and Physical Sciences"));
	List<String> descriptions = new ArrayList<>(Arrays.asList(
			"The science and techniques involved in designing, constructing, maintaining public, commercial, industrial and residential structures and landscapes.",
			"Creating and performing works of art, music, dance, drama, clothing design creation and the communication of messages through a variety of media.",
			"An understanding of the methods, techniques and processes of teaching and learning in preschools, schools, tertiary institutions & informal settings.",
			"The design, manufacture, installation, maintenance and functioning of machines, products, systems and structures.",
			"The interaction between people and the environment and the application of scientific knowledge to protect it from deterioration.",
			"Maintaining and restoring the physical and mental wellbeing of humans. Identifying, treating, controlling and preventing injury and diseases.",
			"Human behaviour and interaction, beliefs, values, cultural expression, social structure, organisation and the rules that govern behaviour.",
			"The study or use of computer and telecommunication systems for processing, storing, and transmitting information.",
			"The theory and practice of decision making and policy formation, organisational development, planning and financial management of goods and services.",
			"The study of all living organisms and inanimate natural objects, through experiment, observation and deduction."));

	@Test(groups = { "regression", "smoke" })
	public void checkAoITilesArePresentAndCorrectForAoI() throws IOException, AWTException {
		setup(driver);
		WebElement element;
		HashMap<String, String> map = new HashMap<>();

		for (int i = 0; i < titles.size(); i++) {
			map.put(titles.get(i), descriptions.get(i));
		}

		CurriculumHomePage homePage = new CurriculumHomePage(driver);
		List<WebElement> tiles = homePage.getTabElements(Locators.HomePage.AREAOFINTERESTTABS);
		for (int i = 0; i < tiles.size(); i++) {
			element = tiles.get(i);
			String description = "";
			try {
				description = map.get(homePage.getText(element.findElement(By.xpath("div/h3"))));
				assertNotNull(description);
				assertEquals(homePage.getText(element.findElement(By.xpath("div/p"))), description);
				map.remove(homePage.getText(element.findElement(By.xpath("div/h3"))));
			} catch (NullPointerException e) {
				throw new NotFoundException("Unknown title found");
			} catch (AssertionError e) {
				System.out.println(homePage.getText(element.findElement(By.xpath("div/p"))));
				System.out.println(description);
				throw new AssertionError("description is incorrect");
			}
		}
		assertTrue(map.isEmpty(), "a tile is missing");
	}
}
