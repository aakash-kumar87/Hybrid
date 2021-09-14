package com.lifecycle.accelarators;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.lifecycle.library.CurriculumHomePage;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;
import com.lifecycle.source.GoogleSheetAPI;

/**
 * @author Aakash
 *
 */
public class ActionDriver {

	protected boolean flag;
	protected WebDriver driver;
	protected WebDriverWait wait;

	public ActionDriver(WebDriver incomingDriver) {
		driver = incomingDriver;
		wait = new WebDriverWait(driver, 10);
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

	public void scrollToHeading(String heading) throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'" + heading + "')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		shortWait();
	}

	public String getElementAttribute(String heading, String attribute) {
		return driver.findElement(By.xpath("//div[@id='pageNavContainer']//a[contains(text(),'" + heading + "')]"))
				.getAttribute(attribute);
	}

	public void jsSroll(int px) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + px + ")");
		shortWait();
	}

	public List<WebElement> getTabElements(By locator) {
		return driver.findElements(locator);
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	/**
	 * Expands section based on element till all options are displayed
	 * 
	 * @param locator By
	 * @throws HeadlessException
	 * @throws IOException
	 * @throws AWTException
	 * @throws InterruptedException
	 */
	public void expandSection(By locator) throws IOException, InterruptedException, AWTException {
		WebElement expandButton = driver.findElement(locator);
		do {
			expandButton.click();
			// shits slow bro
			longWait();
			longWait();
			longWait();
			longWait();
			longWait();
			longWait();

		} while (!areThereMoreOptions(expandButton));
		Reporting.logResults(driver, "Pass", "Expanding Sections", "Sections Expanded");
	}

	private boolean areThereMoreOptions(WebElement element) {
		return element.getText().contains("No more");
	}

	public boolean isClickable(WebElement element) {
		try {

			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	/**
	 * Clicks the Element based on the locator provided Providing locatorName can
	 * help identify the name in the reporting ;
	 * 
	 * @param locator
	 * @param locatorName
	 * @return
	 * @author Aakash
	 * @throws AWTException
	 * @throws HeadlessException
	 */

	public boolean click(By locator, String locatorName) throws IOException, AWTException {

		try {
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			driver.findElement(locator).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			flag = true;
			Reporting.logResults(driver, "Pass", "Verify the click element ", "succesfully clicked on " + locatorName);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			Reporting.logResults(driver, "FAIL", "Verify the click Element", "Unable to click on " + locatorName +" " + locator);
			return false;
		}

	}

	public boolean click(WebElement element, String elementName) throws IOException, AWTException {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Reporting.logResults(driver, "Pass", "Verify the click element ", "succesfully clicked on " + elementName);
			return true;
		} catch (Exception e) {
			Reporting.logResults(driver, "FAIL", "Verify the click Element", "Unable to click on " + elementName);
			return false;
		}

	}
	


	public CurriculumHomePage navigateHome() throws IOException, AWTException {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		click(Locators.HomePage.HOMEBTN, "HomeButton");
		return new CurriculumHomePage(driver);
	}

	public void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
	}
	
	
	
	
	
	
	
	
	

	/**
	 * This Method will verify is element present in the page or not
	 * 
	 * @param locator
	 * @return
	 * @throws AWTException
	 * @throws IOException
	 * @throws HeadlessException
	 */

	public boolean isElementPresent(By locator) throws IOException, AWTException {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			driver.findElement(locator);
			return true;
		} catch (Exception e) {
			Reporting.logResults(driver, "Alert", "is element present", "unable to locate element");
			return false;
		}
		
	}

	public boolean isElementDisplayed(WebElement element) {
		try {
			element.isDisplayed();
			flag = true;
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}

	public boolean isElementDisplayed(By locator) {
		try {
			flag = driver.findElement(locator).isDisplayed();
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}
	
	public void isElementDisplayed(By locator, String locatorname) throws IOException, AWTException {
		try {
			flag = driver.findElement(locator).isDisplayed();
			if(flag==true) {
				Reporting.logResults(driver, "FAIL", "Validate conditional field display", "Field must be not be displayed, but displayed " + locatorname);
			}
				else {
					Reporting.logResults(driver, "Pass", "Validate conditional field display", "Field is not displayed " + locatorname);

				}
			
		} catch (Exception e) {
			Reporting.logResults(driver, "Pass", "Validate conditional field display", "Field is not displayed " + locatorname);
		}
		
	}

	public boolean isElementSelected(By locator) {
		try {
			driver.findElement(locator).isSelected();
			flag = true;
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}

	/**
	 * This method will hover over an element mentioned
	 * 
	 * @param element
	 * @return
	 * @throws AWTException
	 * @throws IOException
	 * @throws HeadlessException
	 */
	public boolean mouseHover(WebElement element) throws IOException, AWTException {
		flag = false;
		try {
			Actions a = new Actions(driver);
			a.moveToElement(element).build().perform();
			flag = true;
			Reporting.logResults(driver, "Pass", "Hover over an Element", "Sucessfully hovered over an element ");
		} catch (Exception e) {

			e.printStackTrace();
			Reporting.logResults(driver, "FAIL", "Hover over an Element", "FAILed hovering over an element");
		}
		return flag;
	}

	/**
	 * This method will enter the value in the locator
	 * 
	 * @param locator
	 * @param value
	 * @param locatorname
	 * @return
	 * @throws HeadlessException
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean enter(By locator, String value, String locatorname) throws IOException, AWTException {
		flag = false;
		try {
			driver.findElement(locator).clear();
			driver.findElement(locator).sendKeys(value);
			Reporting.logResults(driver, "Pass", "Enter Text", "Succesfully entered text in " + locatorname);
			flag = true;

		} catch (Exception e) {
			Reporting.logResults(driver, "FAIL", "Enter text", "Unable to enter text in " + locatorname);
			return false;
		}
		return flag;

	}

	
	
	
	
	/**
	 * This method will select the value in the dropdown locator
	 * 
	 * @param locator
	 * @param value
	 * @param locatorname
	 * @return
	 * @throws HeadlessException
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean select(By locator, String value, String locatorname) throws IOException, AWTException {
		flag = false;
		try {
			Select dropdown = new Select(driver.findElement(locator));
			dropdown.selectByVisibleText(value);
			Reporting.logResults(driver, "Pass", "select dropdown value", "Succesfully selected value " + locatorname);
			flag = true;

		} catch (Exception e) {
			Reporting.logResults(driver, "FAIL", "select dropdown value", "Unable to select value for " + locatorname);
			return false;
		}
		return flag;

	}
	
	
	/**
	 * This method will select the value in the dropdown locator by reading data from google sheets
	 * 
	 * @param locator
	 * @param value
	 * @param locatorname
	 * @return
	 * @throws HeadlessException
	 * @throws IOException
	 * @throws AWTException
	 */
	
	public boolean select(By locator, String spreadsheetId, String range, String locatorname) throws IOException, AWTException {
		flag = false;
		try {
			String inputData = "";

			
			   // get data as an object from the defined cell or range from the google sheet 
			    GoogleSheetAPI sheetAPI = new GoogleSheetAPI();
				List<Object> expectedlabel = sheetAPI.getSpreadSheetRecordsCell(spreadsheetId, range);

			   // convert the object into an array of strings and assign the first string to the label expected
				String[] array = new String[expectedlabel.size()];
				int index = 0;
				for (Object value : expectedlabel) {
//				  array[index] = String.valueOf(value);
				  array[index] = value.toString();
				  index++;
				}
				inputData = array[0];
			
			
				
			Select dropdown = new Select(driver.findElement(locator));
			dropdown.selectByVisibleText(inputData);
			Reporting.logResults(driver, "Pass", "select dropdown value", "Succesfully selected value " + locatorname);
			flag = true;

		} catch (Exception e) {
			Reporting.logResults(driver, "FAIL", "select dropdown value", "Unable to select value for " + locatorname);
			return false;
		}
		return flag;

	}
	

	
	 

	/******************************************************************************************************************************/
	/**
	 * Assert Title of the page.
	 * 
	 * @param sTitle: Expected title of the page.
	 */
	/******************************************************************************************************************************/

	public boolean assertTitle(String sTitle) {
		flag = false;
		try {
			Assert.assertEquals(getTitle(), sTitle);
			flag = true;
		} catch (Exception ex) {
			ex.printStackTrace();
			flag = false;
		}
		return flag;
	}

	public void shrinkWindow() {
		driver.manage().window().setSize(new Dimension(1300, 700));
	}

	/**
	 * This Method will return the tile of the page
	 * 
	 * @return
	 */
	public String getTitle() {
		return driver.getTitle();
	}

	public String getAttribute(By locator, String attribute) {
		return driver.findElement(locator).getAttribute(attribute);
	}

	/************************************************************************************************************************************/
	/**
	 * @param objLocator: Action to be performed on element (Get it from Object
	 *        repository)
	 * @param sLocatorName: Meaningful name to the element (Ex:Login Button, SignIn
	 *        Link etc..)
	 * @return --boolean (true or false)
	 * @throws Throwable
	 */
	/**
	 * @throws @throws AWTException @throws IOException @throws *
	 **************************************************************************************************************************/
	public boolean jsClick(By objLocator, String sLocatorName) throws IOException, AWTException {
		flag = false;
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", driver.findElement(objLocator));
			flag = true;

			Reporting.logResults(driver, "Pass", "java script executor click",
					"successfully to click on " + sLocatorName);

		} catch (Exception e) {
			Reporting.logResults(driver, "FAIL", "java script executor click", "FAILed to click on " + sLocatorName);
			flag = false;
		}
		return flag;
	}

	/************************************************************************************************************************************/
	/**
	 * 
	 * @param locator     Action to be performed on element (Get it from Object
	 *                    repository)
	 * @param locatorName Meaningful name to the element (Ex:Login Button, SignIn
	 *                    Link etc..)
	 * @return boolean (true or false)
	 */
	/**
	 * @throws AWTException @throws *
	 ************************************************************************************************************************************/
	public boolean scrollToView(By locator, String locatorName) throws IOException, AWTException {

		try {
			WebElement element = driver.findElement(locator);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Reporting.logResults(driver, "Pass", "scroll to an element", "succesfully scrolled to  " + locatorName);
			return true;
		} catch (Exception e) {
			Reporting.logResults(driver, "FAIL", "scroll to an element", "Failed scrolled to  " + locatorName);
			return false;
		}
	}
	
	public void scrollToPageTop() {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
	}

	public void scrollToPageBottom() {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public String getText(By locator) {
		String value = null;
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			value = driver.findElement(locator).getText();
			if (value == null)
				throw new NullPointerException();
			else
				return value;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getText(WebElement webElement) {
		String value = null;
		try {
			value = webElement.getText();
			if (value == null)
				throw new NullPointerException();
			else
				return value;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Switch to iFrame with name
	 * 
	 * @param iFrameName
	 * @return
	 */
	public boolean switchToDefaultFrameByStringOrId(String iFrameName) {
		try {
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrameName));
			driver.switchTo().frame(iFrameName);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public String getElementColor(WebElement element) {
		return element.getCssValue("color");
	}

	public String getBackgroundColor(WebElement element) {
		return element.getCssValue("background-color");
	}

	public boolean getBorderStatus(WebElement element) {
		return !element.getCssValue("border").isEmpty();
	}

	/**
	 * Switch to iFrame with index
	 * 
	 * @param index
	 * @return
	 */
	public boolean switchToDefaultFrameByIndex(int index) {
		try {
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
			driver.switchTo().frame(index);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * Switch to iFrame with Locator and webElement
	 * 
	 * @param index
	 * @return
	 */
	public boolean switchToDefaultFrameByLocatorElement(By locator, WebElement element) {
		try {
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
			driver.switchTo().frame(element);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * Switch to iFrame By knowing the locator
	 * 
	 * @param index
	 * @return
	 */
	public boolean switchToDefaultFrameByLocator(By locator) {
		try {
			driver.switchTo().frame(driver.findElement(locator));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * Clicks a link then switches to the new tab and records the title before
	 * closing the tab
	 * 
	 * @param element
	 * @return Title of the new page
	 * @throws InterruptedException
	 */
	public String newTabOpened(WebElement element) throws InterruptedException {
		element.click();
		ArrayList<String> tabHandles = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabHandles.get(1));
		Thread.sleep(300);
		wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState")
				.equals("complete"));
		String title = driver.getTitle();

		driver.close();
		Thread.sleep(300);

		tabHandles = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabHandles.get(0));
		return title;
	}
	
	
	public boolean multiSelectClick(By locator, String locatorName) throws IOException, AWTException {
	try
	{
		List<WebElement> els = getElements(locator);

	for ( WebElement el : els ) {
	    if ( !el.isSelected() ) {
	        el.click();
	    }
	}
	Reporting.logResults(driver, "Pass", "Click Multiselect options", "Successfully clicked on  " + locatorName);
	return true;
	}
	
	catch(Exception e)
	{
		Reporting.logResults(driver, "FAIL", "Click Multiselect options", "Unable to locate  " + locatorName);
		return false;
	}
	}
	
	


	public void shortWait() throws InterruptedException {
		Thread.sleep(300);
	}

	public void mediumWait() throws InterruptedException {
		Thread.sleep(600);
	}

	public void longWait() throws InterruptedException {
		Thread.sleep(1000);
	}
	
	public void timeWait(int interval) throws InterruptedException {
		Thread.sleep(interval);
	}
	
	public void close() throws InterruptedException {
		driver.close();
	}
	

}
