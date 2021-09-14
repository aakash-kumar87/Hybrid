
package com.lifecycle.testscripts.search;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class VerifyResultsForSpecialisationBasedonFilterSelection extends BaseDriverUtil {
	private boolean flag;
	private String facultytext;

	// test throws exceptions but still pass
	// false positive
	@Test(groups = { "regression", "TSFS  " })
	public void verifyFilters() {
		Reporting.setReportingValues(this.getClass().getName());

		try {
			setup(driver);
			ActionDriver action = new ActionDriver(driver);
			action.enter(Locators.HomePage.SEARCH, "engineering", "Search input text in home page");
			action.click(Locators.HomePage.SEARCHBUTTON, "Search button");
			Thread.sleep(500);
			searchFilters("Specialisation");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void searchFilters(String name) {
		driver.findElement(By.xpath("//button[text()='" + name + "']")).click();

		try {
			verifySpecial(name, "Undergraduate", "Specialisation Type");
			verifySpecial(name, "Undergraduate", "Faculty");
			verifySpecial(name, "Postgraduate", "Faculty");
			verifySpecial(name, "Research", "Faculty");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param filter     E.g: Study as , Specialisation type, Faculty, Area of
	 *                   Interest
	 * @param studylevel E.g: Undergraduate or Postgraduate
	 * @param filterBy   E.g: Program, Specialisation or Course
	 * @throws InterruptedException
	 * @throws HeadlessException
	 * @throws IOException
	 * @throws AWTException
	 */
	/******************************
	 * SURROUNDING A WHOLE METHOD WITH TRY CATCH CAUSES BIG ISSUES
	 * @throws AWTException 
	 */
	public void verifySpecial(String filterBy, String studylevel, String filterType)
			throws InterruptedException, IOException, AWTException {
		try {
			driver.findElement(By.xpath("//div[text()='" + studylevel + "']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//span[text()='" + filterType + "']")).click();
			Thread.sleep(500);

			List<WebElement> sSubItem = driver.findElements(By.xpath(
					"(//span[text()='" + filterType + "']/following::div[@class='o-filter-category-items'])[1]/div"));
			for (int k = 1; k <= sSubItem.size(); k++) {

				if ((k > 1) && filterType.equalsIgnoreCase("Specialisation Type")) {
					driver.findElement(By.xpath("//div[text()='" + studylevel + "']")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath("//span[text()='" + filterType + "']")).click();
					Thread.sleep(500);
				}

				if ((k > 1) && filterType.equalsIgnoreCase("Faculty")) {
					driver.findElement(
							By.xpath("//span[text()='Faculty']/../..//div[@class='o-filter-category'][" + k + "]"))
							.click();
				}

				if (filterType.equalsIgnoreCase("Specialisation Type")) {
					String singleprogram = driver
							.findElement(By.xpath("(//span[text()='" + filterType
									+ "']/following::div[@class='o-filter-category-items'])[1]/div[" + k + "]/label"))
							.getText();
					driver.findElement(By.xpath("(//span[text()='" + filterType
							+ "']/following::div[@class='o-filter-category-items'])[1]/div[" + k + "]/label")).click();
					Thread.sleep(1000);

					ActionDriver action = new ActionDriver(driver);
					if (flag) {
						System.out.println(
								"No records  found for " + singleprogram + " in " + studylevel + " for " + filterType);
						driver.findElement(By.xpath("//button[text()='" + filterBy + "']")).click();
						continue;
					} else {
					}

					String text = driver.findElement(Locators.AcamedicItemPage.STUDYAS).getText();
					String type = driver.findElement(Locators.AcamedicItemPage.SPECIALISATIONTYPE).getText();
					if (type.isEmpty()) {
						String atype = driver.findElement(By.xpath("(//span[text()='Specialisation'])[2]")).getText();
						type = atype;
					}

					if (text.equalsIgnoreCase(filterBy) && type.equalsIgnoreCase(singleprogram)) {

						Reporting.logResults(driver, "Pass", "Verify filters for " + type,
								" Verified " + type + " in " + filterBy + " for " + studylevel);
					} else {
						Reporting.logResults(driver, "Fail", "Verify filters for " + type,
								" Failed to Verify " + type + " in " + filterBy + " for " + studylevel);
					}

				}

				if (filterType.equalsIgnoreCase("Faculty")) {
					// Getting the first item of Faculty and clicking
					String de = driver.findElement(By.xpath(
							"//span[text()='Faculty']/../..//following::div[@class='o-filter-category-items']/div[" + k
									+ "]/button/span"))
							.getText();
					if (k == 1)
						driver.findElement(By.xpath(
								"//span[text()='Faculty']/../..//following::div[@class='o-filter-category-items']/div["
										+ k + "]"))
								.click();

					Thread.sleep(500);
					// Getting size of the first item in Faculty
					int sub = driver
							.findElements(By.xpath(
									"//span[text()='" + de + "']/../..//div[@class='o-filter-category-items']/div"))
							.size();
				if(sub==1)
				{
					String su1 = driver.findElement(By.xpath("//span[text()='" + de
							+ "']/../..//div[@class='o-filter-category-items']/div[1]")).getText();
					driver.findElement(By.xpath("//span[text()='" + de
							+ "']/../..//div[@class='o-filter-category-items']/div[1]")).click();
					ActionDriver action = new ActionDriver(driver);
					if (flag) {
						System.out.println("No results found for " + su1);
						driver.findElement(By.xpath("//span[text()='" + de
								+ "']/../..//div[@class='o-filter-category-items']/div[1]")).click();
						continue;
					}
					else
					{
						
						Thread.sleep(1000);

						String text = driver.findElement(Locators.AcamedicItemPage.STUDYAS).getText();
						if (!de.contains("DVC (Academic) Board of Studies")) {
							facultytext = driver.findElement(Locators.AcamedicItemPage.FACULTYSPECIAL).getText();
						}

						if (text.equalsIgnoreCase(filterBy) && facultytext.contains(de)) {
							Reporting.logResults(driver, "Pass", "Verification of items ",
									filterBy + "and" + de + "are  matched in the landing page");

						} else {
							Reporting.logResults(driver, "Fail", "Verification of items ",
									filterBy + "and" + de + "are not matched in the landing page");
						}
						driver.findElement(By.xpath("//button[text()='" + filterBy + "']")).click();
						driver.findElement(By.xpath("//div[text()='" + studylevel + "']")).click();
						driver.findElement(By.xpath("//span[text()='" + filterType + "']")).click();
						Thread.sleep(2000);

						driver.findElement(
								By.xpath("//span[text()='Faculty']/../..//div[@class='o-filter-category'][" + k + "]"))
								.click();
						Thread.sleep(1000);

					}
				}
					if(sub>1)
					{
					
					for (int i = 2; i <= sub; i++) {
						String su = driver.findElement(By.xpath("//span[text()='" + de
								+ "']/../..//div[@class='o-filter-category-items']/div[" + i + "]")).getText();
						
						if(i==2)
						{
							if(!su.equalsIgnoreCase("Faculty-owned offering1"))
							{
								Reporting.logResults(driver, "Fail", "Faculty owned offering label", "Verified Faculty owned offering label for "+facultytext);
							}
						
							
						}
						driver.findElement(By.xpath("//span[text()='" + de
								+ "']/../..//div[@class='o-filter-category-items']/div[" + i + "]")).click();
						Thread.sleep(1000);
						ActionDriver action = new ActionDriver(driver);
						
						if (flag) {
							System.out.println("No results found for " + su);
							driver.findElement(By.xpath("//span[text()='" + de
									+ "']/../..//div[@class='o-filter-category-items']/div["+i+"]")).click();
							continue;
						}

						else {
							
							Thread.sleep(1000);

							String text = driver.findElement(Locators.AcamedicItemPage.STUDYAS).getText();

							if (de.contains("DVC (Academic) Board of Studies")) {
								facultytext = driver.findElement(By.xpath(
										"((//div[@class='a-row a-row-equal-height o-attributes-table'])[2]//p)[1]"))
										.getText();
							}
							if (!de.contains("DVC (Academic) Board of Studies")) {
								facultytext = driver.findElement(Locators.AcamedicItemPage.FACULTYSPECIAL).getText();
							}

							if (text.equalsIgnoreCase(filterBy) && facultytext.contains(de)) {
								Reporting.logResults(driver, "Pass", "Verification of items ",
										filterBy + "and" + de + "are  matched in the landing page");

							} else {
								Reporting.logResults(driver, "Fail", "Verification of items ",
										filterBy + "and" + de + "are not matched in the landing page");
							}

							if (i > 3 && !su.equalsIgnoreCase("School of Surveying and Spatial Information Systems")) {
								String schooltext = driver.findElement(By.xpath(
										"((//div[@class='a-row a-row-equal-height o-attributes-table'])[2]//a)[2]"))
										.getText();

								if (su.equalsIgnoreCase(schooltext)) {
									Reporting.logResults(driver, "Pass", "Verification of school ",
											su + "is  matched in the landing page");
								} else {
									Reporting.logResults(driver, "Fail", "Verification of items ",
											su + "is not matched in the landing page");
								}
							}
						}
						
							driver.findElement(By.xpath("//button[text()='" + filterBy + "']")).click();
						driver.findElement(By.xpath("//div[text()='" + studylevel + "']")).click();
						driver.findElement(By.xpath("//span[text()='" + filterType + "']")).click();
						Thread.sleep(2000);

						driver.findElement(
								By.xpath("//span[text()='Faculty']/../..//div[@class='o-filter-category'][" + k + "]"))
								.click();
						Thread.sleep(1000);
					}
				}
				}
				Thread.sleep(1000);
			}
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()='" + filterBy + "']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
		Reporting.logResults(driver, "Fail", "Verify specialsiation filters", "Failed to verify specialisaton filters");
			e.printStackTrace();
		}
	}
}
