package com.lifecycle.library;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.locators.CustomXpaths;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class SearchAndVerify extends ActionDriver {

	public SearchAndVerify(WebDriver incomingDriver) {
		super(incomingDriver);
	}

	private String program = "Program";
	private String specialisation = "Specialisation";
	private String course = "Course";

	private List<String> valid = Arrays.asList("Program", "Specialisation", "Course");
	private List<String> studyLevel = Arrays.asList("Undergraduate", "Postgraduate");

	public void verifySearchPageBySearchButton(String text) {

		boolean flag = false;
		try {
			flag = click(Locators.HomePage.SEARCH, "search area");
			if (!flag) {
				Reporting.logResults(driver, "fail", "click action", "click failed");
				return;
			}

			flag = enter(Locators.HomePage.SEARCH, text, "Search button in home page");
			if (!flag) {
				Reporting.logResults(driver, "fail", "enter action", "enter failed");
			}

			flag = click(Locators.HomePage.SEARCHBUTTON, "Search Button");
			if (!flag) {
				Reporting.logResults(driver, "fail", "Search button click action", "Search button was not clicked");
			}

			Thread.sleep(3000);

			flag = assertTitle("Search");
			if (!flag) {
				Reporting.logResults(driver, "Fail", "Verify title assertion", "Assertion of title failed");

			} else {
				Reporting.logResults(driver, "pass", "Verify title assertion", "Assertion of title passed");

			}

			String value = driver.findElement(By.xpath("//input[@class='m-advanced-search-field__input']"))
					.getAttribute("value");

			flag = value.contains(text);
			if (!flag) {
				Reporting.logResults(driver, "Fail", "Verify search text in search page",
						"Entered text in home page search and text in search page is different");
			} else {
				Reporting.logResults(driver, "pass", "Verify search text in search page",
						"Entered text in home page search and text in search page matches");
			}

			String val = driver.findElement(By.xpath("//li[@class='m-advanced-results-total']/span")).getText();
			flag = val.contains(text);
			if (!flag) {
				Reporting.logResults(driver, "Fail", "Verify search results in search page",
						"Entered text in home page search and text in search results are different");
			} else {
				Reporting.logResults(driver, "pass", "Verify search results in search page",
						"Entered text in home page search and text in search results are matches");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void searchBySeeAllResults(String text) {
		boolean flag = false;
		try {
			flag = click(Locators.HomePage.SEARCH, "search button");

			if (!flag) {
				Reporting.logResults(driver, "fail", "click action", "click failed");
				return;
			}

			flag = enter(Locators.HomePage.SEARCH, text, "Search button in home page");

			if (!flag) {
				Reporting.logResults(driver, "fail", "enter action", "enter failed");
			}

	

			flag = assertTitle("Search");
			if (!flag) {
				Reporting.logResults(driver, "Fail", "Verify title assertion", "Assertion of title failed");

			} else {
				Reporting.logResults(driver, "pass", "Verify title assertion", "Assertion of title passed");

			}

			String value = driver.findElement(By.xpath("//input[@class='m-advanced-search-field__input']"))
					.getAttribute("value");

			flag = value.contains(text);
			if (!flag) {
				Reporting.logResults(driver, "Fail", "Verify search text in search page",
						"Entered text in home page search and text in search page is different");
			} else {
				Reporting.logResults(driver, "pass", "Verify search text in search page",
						"Entered text in home page search and text in search page matches");
			}

			String val = driver.findElement(By.xpath("//li[@class='m-advanced-results-total']/span")).getText();
			flag = val.contains(text);
			if (!flag) {
				Reporting.logResults(driver, "Fail", "Verify search results in search page",
						"Entered text in home page search and text in search results are different");
			} else {
				Reporting.logResults(driver, "pass", "Verify search results in search page",
						"Entered text in home page search and text in search results are matches");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void advanceSearch(String text) {
		boolean flag = false;
		try {
			flag = click(Locators.HomePage.SEARCH, "search button");
			if (!flag) {
				Reporting.logResults(driver, "fail", "click action", "click failed");
				return;
			}

			flag = enter(Locators.HomePage.SEARCH, text, "Search button in home page");

			if (!flag) {
				Reporting.logResults(driver, "fail", "enter action", "enter failed");
			}

		

			flag = assertTitle("Search");
			if (!flag) {
				Reporting.logResults(driver, "Fail", "Verify title assertion", "Assertion of title failed");

			} else {
				Reporting.logResults(driver, "pass", "Verify title assertion", "Assertion of title passed");

			}

			String value = driver.findElement(By.xpath("//input[@class='m-advanced-search-field__input']"))
					.getAttribute("value");

			flag = value.contains(text);
			if (!flag) {
				Reporting.logResults(driver, "Fail", "Verify search text in search page",
						"Entered text in home page search and text in search page is different");
			} else {
				Reporting.logResults(driver, "pass", "Verify search text in search page",
						"Entered text in home page search and text in search page matches");
			}

			String val = driver.findElement(By.xpath("//li[@class='m-advanced-results-total']/span")).getText();
			flag = val.contains(text);
			if (!flag) {
				Reporting.logResults(driver, "Fail", "Verify search results in search page",
						"Entered text in home page search and text in search results are different");
			} else {
				Reporting.logResults(driver, "pass", "Verify search results in search page",
						"Entered text in home page search and text in search results are matches");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean verifyProgram() {
		String text = "Program";
		boolean flag = false;
		try {
			click(CustomXpaths.getElementByText(text), "Program");
			List<WebElement> l = driver
					.findElements(By.xpath("//ul[@id='advanced-search__suggestions']//following::li"));
			int cItems = l.size();
			do {
				flag = isElementPresent(By.xpath("//span[text()='chevron_right']"));
				if (flag) {
					System.out.println("true");
				}
				for (int i = 1; i <= cItems; i++) {

					String actual = driver
							.findElement(By
									.xpath("(//span[@class='m-advanced-search-result-link__tag']/span[1])[" + i + "]"))
							.getText();
					if (actual.equalsIgnoreCase(text)) {
						Reporting.logResults(driver, "Pass", "Verify resuls page have all programs records",
								"Result " + i + " is a program");
					} else {
						Reporting.logResults(driver, "Fail", "Verify resuls page have all programs records",
								"Result " + i + " is not a program");
					}
				}
				driver.findElement(By.xpath("//span[text()='chevron_right']")).click();
				Thread.sleep(2000);

			} while (isElementPresent(By.xpath("//span[text()='chevron_right']")));
			System.out.println("outside of loop");

			click(CustomXpaths.getElementByText(text), "Specialisation");

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public void verifySearch(String name) {
		String uG = "Undergraduate";
		String pG = "Postgraduate";

		try {
			driver.findElement(By.xpath("//button[text()='" + name + "']")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//div[text()='Undergraduate']")).click();
			Thread.sleep(1000);
			ActionDriver action = new ActionDriver(driver);
		
		
			String bResult = driver.findElement(By.xpath("" + "//div[@class='a-chip-row a-btn-bookmark-offset']/div"))
					.getText();
			String bStudyLevel = driver.findElement(By.xpath("(//strong[text()='Study Level'])[2]/following::p[1]"))
					.getText();

			if (bResult.equalsIgnoreCase(name)) {
				Reporting.logResults(driver, "pass", "Verify " + name + "in Landing page", "Landing page is a " + name);
			} else {
				Reporting.logResults(driver, "Fail", "Verify " + name + "in Landing page",
						"Landing page is not a " + name);
			}
			if (bStudyLevel.equalsIgnoreCase(pG)) {
				Reporting.logResults(driver, "pass", "Verify post graduate in landing page",
						"Study level is mentioned as PostGraduate in " + name);
			} else {
				Reporting.logResults(driver, "Fail", "Verify post graduate in landing page",
						"Study level is not mentioned as PostGraduate in " + name);
			}

			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void searchFilters(String name) {
		driver.findElement(By.xpath("//button[text()='" + name + "']")).click();
		try {
			verifyUndergraduate("Faculty", "Undergraduate");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param headercount        Undergraduate header table count of left hand side
	 * @param filter             Area of table string like Study As, Faculty
	 * @param filterTypeCheckBox Input as program type or faculty sub program
	 * @throws InterruptedException
	 * @throws HeadlessException
	 * @throws IOException
	 * @throws AWTException
	 */
	public void verifyUndergraduate(String filter, String studylevel)
			throws InterruptedException, IOException, AWTException {
		boolean flag;
		driver.findElement(By.xpath("//div[text()='" + studylevel + "']")).click();
		driver.findElement(By.xpath("//span[text()='" + filter + "']")).click();

		List<WebElement> sSubItem = driver.findElements(
				By.xpath("(//span[text()='" + filter + "']/following::div[@class='o-filter-category-items'])[1]/div"));
		for (int k = 1; k <= sSubItem.size(); k++) {
			if (k > 1) {
				driver.findElement(By.xpath("//div[text()='" + studylevel + "']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='" + filter + "']")).click();
				Thread.sleep(2000);
			}
			String singleprogram = driver
					.findElement(By.xpath("(//span[text()='" + filter
							+ "']/following::div[@class='o-filter-category-items'])[1]/div[" + k + "]/label"))
					.getText();
			driver.findElement(By.xpath("(//span[text()='" + filter
					+ "']/following::div[@class='o-filter-category-items'])[1]/div[" + k + "]/label")).click();
			Thread.sleep(2000);

			// write conditions
			if (singleprogram.equalsIgnoreCase("Single Program")) {
				program = singleprogram.replaceAll("Single Program", "Program");

				if (driver.findElements(By.xpath("//li[@role='contentinfo']/following-sibling::li[1]")) != null) {
					flag = true;
				} else {
					Reporting.logResults(driver, "Fail", "Results found", "No results found");
					break;
				}
				ActionDriver action = new ActionDriver(driver);
		
			}

			// I am struck here, how to click next dual program
			if (singleprogram.equalsIgnoreCase("Dual Program")) {
				if (driver.findElements(By.xpath("//li[@role='contentinfo']/following-sibling::li[1]")) != null) {
					flag = true;
				} else {
					Reporting.logResults(driver, "Fail", "Results found", "No results found");
					break;
				}
			
			}

		
				Thread.sleep(1000);
			}
		}
	}

