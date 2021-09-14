package com.lifecycle.testscripts.Release302;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class VerifyResultsForCoursesBasedonFilterSelection extends BaseDriverUtil {
	private String facultytext;
	private boolean flag;

	@Test(groups = { "regression", "TSFS  " })
	public void verifyFilters() {
		Reporting.setReportingValues(this.getClass().getName());

		try {
			setup(driver);
			ActionDriver action = new ActionDriver(driver);
			action.enter(Locators.HomePage.SEARCH, "Computer", "Search input text in home page");
			action.click(Locators.HomePage.SEARCHBUTTON, "Search button");
			Thread.sleep(500);
			searchFilters("Course");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void searchFilters(String name) {

		driver.findElement(By.xpath("//button[text()='" + name + "']")).click();

		try {


			verifyspecial(name, "Undergraduate", "Faculty");
			verifyspecial(name, "Postgraduate", "Faculty");
			verifyspecial(name, "Research", "Faculty");


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

	public void verifyspecial(String filterBy, String studylevel, String filterType)
			throws InterruptedException, IOException, AWTException {
		try {
			driver.findElement(By.xpath("//div[text()='" + studylevel + "']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//span[text()='" + filterType + "']")).click();
			Thread.sleep(500);

			List<WebElement> sSubItem = driver.findElements(By.xpath(
					"(//span[text()='" + filterType + "']/following::div[@class='o-filter-category-items'])[1]/div"));
			for (int k = 1; k <= sSubItem.size(); k++) {

				if (filterType.equalsIgnoreCase("Faculty")) {
					
					driver.findElement(By.xpath("(//span[text()='Faculty']/../..//following::div[@class='o-filter-category-items']//button)["+k+"]")).click();
					Thread.sleep(500);
					// Getting the first item of Faculty and clicking
					String de = driver.findElement(By.xpath(
							"//span[text()='Faculty']/../..//following::div[@class='o-filter-category-items']/div[" + k
									+ "]/button/span"))
							.getText();

					Thread.sleep(500);
					// Getting size of the first item in Faculty
					int sub = driver
							.findElements(By.xpath(
									"//span[text()='" + de + "']/../..//div[@class='o-filter-category-items']/div"))
							.size();
				if(sub==1)
				{

					String su = driver.findElement(By.xpath("//span[text()='" + de
							+ "']/../..//div[@class='o-filter-category-items']/div[1]")).getText();
					
						if(!su.equalsIgnoreCase("Faculty-owned offering"))
						{
							Reporting.logResults(driver, "Fail", "Faculty owned offering label", "Failed to Verify Faculty owned offering label for "+de + " in "+ studylevel);
						}
						else Reporting.logResults(driver, "Pass", "Faculty owned offering label", "Verified Faculty owned offering label for "+de + " in "+ studylevel);

					}
				
				if(sub>1)
				{
				
				
					String su = driver.findElement(By.xpath("//span[text()='" + de
							+ "']/../..//div[@class='o-filter-category-items']/div[2]")).getText();
					
						if(!su.equalsIgnoreCase("Faculty-owned offering"))
						{
							Reporting.logResults(driver, "Fail", "Faculty owned offering label", "Failed to Verify Faculty owned offering label for "+de + " in "+ studylevel);
						}
						else Reporting.logResults(driver, "Pass", "Faculty owned offering label", "Verified Faculty owned offering label for "+de + " in "+ studylevel);
						
					
						}
				driver.findElement(By.xpath("(//span[text()='Faculty']/../..//following::div[@class='o-filter-category-items']//button)["+k+"]")).click();
				Thread.sleep(500);
					}
				}
			driver.findElement(By.xpath("//button[text()='" + filterBy + "']")).click();
			driver.findElement(By.xpath("//div[text()='" + studylevel + "']")).click();
			driver.findElement(By.xpath("//span[text()='" + filterType + "']")).click();
			Thread.sleep(2000);

			
			Thread.sleep(1000);
			
		

		} catch (Exception e) {
		Reporting.logResults(driver, "Fail", "Verify specialsiation filters", "Failed to verify specialisaton filters");
			e.printStackTrace();
		}
	}
}
