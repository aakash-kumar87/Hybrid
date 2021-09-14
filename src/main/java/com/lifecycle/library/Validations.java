package com.lifecycle.library;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;
import com.lifecycle.source.GoogleSheetAPI;

/**
 *This class contains below all the main validation methods used
 * @author Aakash Kumar
 *
 */

public class Validations extends ActionDriver {

	Calendar calendar = Calendar.getInstance();
	int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
	String dayOfMonthStr = String.valueOf(dayOfMonth);

	private Random rand = new Random();

	public Validations(WebDriver incomingDriver) {
		super(incomingDriver);
	}

	/**
	 * This method will Validate the label for the field by passing the expected value and locator
	 * @author Aakash Kumar
	 * @param locator
	 * @param value
	 * @param locatorname
	 * @return boolean
	 * @throws HeadlessException
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean validateLabel(By locator, String value, String locatorname) throws IOException, AWTException {
		flag = false;
		try {
			String label = driver.findElement(locator).getText();
			if (label.equals(value)) {
				Reporting.logResults(driver, "Pass", "Validate label", "label is correct for: " + locatorname);
				flag = true;
			} else {
				Reporting.logResults(driver, "FAIL", "Validate label",
						"label is incorrect for: " + locatorname + ", Expected :" + value +" Actual:" +label);
				return false;
			}

		} catch (Exception e) {
			Reporting.logResults(driver, "FAIL", "Validate label",
					"Unable to locate the label/locator for: " + locatorname);
			return false;
		}
		return flag;

	}

	/**
	 * This method will Validate the URL contains the string passed
	 * @author Aakash Kumar
	 * @param driver
	 * @param value
	 * @return boolean
	 * @throws HeadlessException
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean validateURLContains(WebDriver driver, String value)
			throws IOException, AWTException, AssertionError {

		try {
			Assert.assertTrue(driver.getCurrentUrl().contains(value), "FAIL, Not landed to, Expected page: " + value);
			Reporting.logResults(driver, "Pass", "Validate Landing URL", "User lands to: " + value);
			flag = true;
		}

		catch (Exception e) {
			Reporting.logResults(driver, "FAIL", "Validate Landing URL", "Not landed to: " + value);
			flag = false;
		}
		return flag;
	}

	/**
	 * This method will Validate the label for the field, reading the expected data from google sheets 
	 * Specifically its going to read the label field and the mandatory column to validate it with the field labels
     * @usage Can be used to validate fields within modals and sections (for related and not related field labels)
	 * @author Aakash Kumar
	 * @param locator
	 * @param spreadsheetId
	 * @param range
	 * @param range2
	 * @param locatorname
	 * @return boolean
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean validateLabelSheetsMandate(By locator, String spreadsheetId, String range, String range2,
			String locatorname) throws IOException, AWTException {
		flag = false;
		try {
			char Mandate = 'Y';
			String ActualMandateString = String.valueOf(Mandate);
			String ActualMandateString1 = "Yes";
			String label = driver.findElement(locator).getText();

			// String label = "Course Name (Official) *";

			// This code is added to solve the Issue while validating Label with Mandate *,
			// Where label locators for mandatory fields in information page have separate
			// div and span whereas in
			// Modal, teh locator have only span

			if (label.contains("*")) {
				String labelPart1 = label.substring(0, label.length() - 1).trim();
				String labelPart2 = label.substring(label.length() - 1);
				String labelFinal = labelPart1.concat(labelPart2);
				label = labelFinal;
			} else {
				// do nothing
			}

			String labelExpected = "";
			String MandateExpected = "";

			// get data as an object from the defined cell or range from the google sheet
			GoogleSheetAPI sheetAPI = new GoogleSheetAPI();
			List<Object> expectedlabel = sheetAPI.getSpreadSheetRecordsCell(spreadsheetId, range);

			// convert the object into an array of strings and assign the first string to
			// the label expected
			String[] array = new String[expectedlabel.size()];
			int index = 0;
			for (Object value : expectedlabel) {
//				  array[index] = String.valueOf(value);
				array[index] = value.toString();
				index++;
			}
			labelExpected = array[0];

			// get data as an object from the defined cell or range from the google sheet

			List<Object> expectedMandate = sheetAPI.getSpreadSheetRecordsCell(spreadsheetId, range2);
			String[] array2 = new String[expectedMandate.size()];
			int index2 = 0;
			for (Object value : expectedMandate) {
				array2[index2] = value.toString();
				index2++;
			}
			MandateExpected = array2[0];

			if (MandateExpected.equals(ActualMandateString) || MandateExpected.equals(ActualMandateString1)) {
				String mandate = "*";
				labelExpected += mandate;
			} else {
				labelExpected = labelExpected;
			}

			// Validate the actual label against the label derived from google sheets
			if (label.equals(labelExpected)) {
				Reporting.logResults(driver, "Pass", "Validate label", "label is correct for: " + locatorname);
				flag = true;
			} else {
				Reporting.logResults(driver, "FAIL", "Validate label",
						"label is incorrect for: " + locatorname + ", Expected :" + labelExpected +" Actual:" +label);
				System.out.println(labelExpected);
				flag = false;
			}

		} catch (Exception e) {
			Reporting.logResults(driver, "FAIL", "Validate label",
					"Null value read from sheet or Unable to locate the label/locator for: " + locatorname);
			flag = false;
		}
		return flag;

	}

	/**
	 * This method will Validate the label(For example, section heading) for the field reading the expected data from google sheets 
	 * @author Aakash Kumar
	 * @param locator
	 * @param spreadsheetId
	 * @param range
	 * @param locatorname
	 * @return boolean
	 * @throws IOException
	 * @throws AWTException
	 * @throws InterruptedException 
	 */
	public boolean validateLabelPerCell(By locator, String spreadsheetId, String range, String locatorname)
			throws IOException, AWTException, InterruptedException {
		flag = false;
		try {

			String label = driver.findElement(locator).getText();
			String labelExpected = "";
			// get data as an object from the defined cell or range from the google sheet
			GoogleSheetAPI sheetAPI = new GoogleSheetAPI();
	
			List<Object> expectedlabel = sheetAPI.getSpreadSheetRecordsCell(spreadsheetId, range);
			// convert the object into an array of strings and assign the first string to
			// the label expected
			String[] array = new String[expectedlabel.size()];
			int index = 0;
			for (Object value : expectedlabel) {
//				  array[index] = String.valueOf(value);
				array[index] = value.toString();
				index++;
			}
			labelExpected = array[0];

			// Validate the actual label against the label derived from google sheets
			if (label.equals(labelExpected)) {
				Reporting.logResults(driver, "Pass", "Validate label", "label is correct for: " + locatorname);
				flag = true;
			} else {
				Reporting.logResults(driver, "FAIL", "Validate label",
						"label is incorrect for: " + locatorname + ", Expected :" + labelExpected +" Actual:" +label);
				flag = false;
			}

			
			
		
		  } catch (Throwable e) {
		  
			  e.printStackTrace();
		  Reporting.logResults(driver, "FAIL", "Validate label/Data",
		  "Null value read from sheet or Unable to locate the label/locator for: " +
		  locatorname); flag = false; }
		 	return flag;

	}
	
	
	/**
	 * This method will Validate the attribute ( for example, placeholder text) for the field taking the expected datan from google sheets by passing the spreadsheet ID and the range of cells
	 * @author Aakash Kumar
	 * @param locator
	 * @param spreadsheetId
	 * @param range
	 * @param range2
	 * @param locatorname
	 * @return boolean
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean validateAttribute(By locator, String attribute, String spreadsheetId, String range, String locatorname)
			throws IOException, AWTException {
		flag = false;
		try {

			String label = getAttribute(locator, attribute);
			String labelExpected = "";

			// get data as an object from the defined cell or range from the google sheet
			GoogleSheetAPI sheetAPI = new GoogleSheetAPI();
			List<Object> expectedlabel = sheetAPI.getSpreadSheetRecordsCell(spreadsheetId, range);

			// convert the object into an array of strings and assign the first string to
			// the label expected
			String[] array = new String[expectedlabel.size()];
			int index = 0;
			for (Object value : expectedlabel) {
//				  array[index] = String.valueOf(value);
				array[index] = value.toString();
				index++;
			}
			labelExpected = array[0];

			// Validate the actual label against the label derived from google sheets
			
			if (label.equals(labelExpected)) {
				Reporting.logResults(driver, "Pass", "Validate Attribute", "value is correct for: " + locatorname +" "+ attribute);
				flag = true;
			} else {
				Reporting.logResults(driver, "FAIL", "Validate Attribute",
						"value is incorrect for: " + locatorname + " " + attribute + ", Expected value is :" + labelExpected  + " Actual value is :" + label);
				flag = false;
			}

		} catch (Exception e) {
			Reporting.logResults(driver, "FAIL", "Validate Attribute",
					"Null value read from sheet or Unable to locate the locator for: " + locatorname);
			flag = false;
		}
		return flag;

	}
	
	
	

	
	/**
	 * This method will Validate the Saved data for the field taking the expected data from google sheets by passing the spreadsheet ID and the range of cells
	 * @author Aakash Kumar
	 * @param locator
	 * @param spreadsheetId
	 * @param range
	 * @param range2
	 * @param locatorname
	 * @return boolean
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean validateSavedData(By locator, String spreadsheetId, String range, String locatorname)
			throws IOException, AWTException {
		flag = false;
		try {

			String label = driver.findElement(locator).getText();
			String labelExpected = "";

			// get data as an object from the defined cell or range from the google sheet
			GoogleSheetAPI sheetAPI = new GoogleSheetAPI();
			List<Object> expectedlabel = sheetAPI.getSpreadSheetRecordsCell(spreadsheetId, range);

			// convert the object into an array of strings and assign the first string to
			// the label expected
			String[] array = new String[expectedlabel.size()];
			int index = 0;
			for (Object value : expectedlabel) {
//				  array[index] = String.valueOf(value);
				array[index] = value.toString();
				index++;
			}
			labelExpected = array[0];

			// Validate the actual label against the label derived from google sheets
			if (label.equals(labelExpected)) {
				Reporting.logResults(driver, "Pass", "Validate Data", "Data is correct for: " + locatorname);
				flag = true;
			} else {
				Reporting.logResults(driver, "FAIL", "Validate Data",
						"Data is incorrect for: " + locatorname + ", Expected :" + labelExpected +" Actual:" +label);
				flag = false;
			}

		} catch (Exception e) {
			Reporting.logResults(driver, "FAIL", "Validate Data",
					"Null value read from sheet or Unable to locate the label/locator for: " + locatorname);
			flag = false;
		}
		return flag;

	}
	
	// In progress 
	
	/**
	 * This method will Read the section heading from the workbook, and scroll to that section
	 * @author Aakash Kumar
	 * @param locator
	 * @param spreadsheetId
	 * @param range
	 * @param locatorname
	 * @return boolean
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean linkBySheet(WebDriver driver, String spreadsheetId, String range, String locatorname)
			throws IOException, AWTException {
		flag = false;
		try {
			String linkText = "";
			// get data as an object from the defined cell or range from the google sheet
			GoogleSheetAPI sheetAPI = new GoogleSheetAPI();
			List<Object> expectedlabel = sheetAPI.getSpreadSheetRecordsCell(spreadsheetId, range);

			// convert the object into an array of strings and assign the first string to the variable
			String[] array = new String[expectedlabel.size()];
			int index = 0;
			for (Object value : expectedlabel) {
				array[index] = value.toString();
				index++;
			}
			linkText = array[0];
                
			scrollToPageTop();
			longWait();
			moveToElement(driver.findElement(Locators.Dashboard.buttonContainsText(linkText)));
			scrollToView(Locators.Dashboard.buttonContainsText(linkText), linkText+" Side Link");
			shortWait();
			//click(Locators.Dashboard.buttonContainsText(linkText), linkText+ " left nav Link");
				flag = true;
		} catch (Exception e) {
			Reporting.logResults(driver, "FAIL", "Verify the side link scroll", "Null values read or Unable to find the element : " + locatorname);
			flag = false;
		}
		return flag;

	}
	
	
	
	
	/**
	 * This method will Validate the drop down values listed in csv format per field from google sheets and convert into string, Appending the default string " --Please Select -- " to it 
	 * @author Aakash Kumar
	 * @param locator
	 * @param spreadsheetId
	 * @param range
	 * @param locatorname
	 * @return boolean
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean validateDropDownValuesCsvData(By locator, String spreadsheetId, String range, String locatorname)
			throws IOException, AWTException {
		flag = false;
		try {

			ArrayList<String> actualDropDownItems = new ArrayList<String>();

			// get data as an object from the defined cell or range from the google sheet
			GoogleSheetAPI sheetAPI = new GoogleSheetAPI();
			List<Object> expectedlabelSheets = sheetAPI.getSpreadSheetRecordsCell(spreadsheetId, range);
			// convert the object into an list of strings and append default value in
			// index(0) to the array
			// String[] array = new String[expectedlabel.size()];
		
			
			List<String> expectedlabelsList = new ArrayList<>(expectedlabelSheets.size());
			for (Object object : expectedlabelSheets) {
				expectedlabelsList.add(0, " -- Please Select -- ");
				expectedlabelsList.add(object != null ? object.toString() : null);
			}
		

			// Split the comma separated list labels, Trim the leading spaces, Add the
			// default string " -- Please Select-- " to the list
			String[] expectedlabelsListSplitComma = new String[20];
			String[] expectedlabelsListTrimmed = new String[20];
			String[] defaultStringToAdd = new String[] { expectedlabelsList.get(0) };

			expectedlabelsListSplitComma = expectedlabelsList.get(1).split(",");
			for (int i = 0; i < expectedlabelsListSplitComma.length; i++) {
				expectedlabelsListTrimmed[i] = expectedlabelsListSplitComma[i].trim();
			}
			String[] expectedLabelsListFinal = Arrays.copyOf(defaultStringToAdd,
					defaultStringToAdd.length + expectedlabelsListTrimmed.length);
			System.arraycopy(expectedlabelsListTrimmed, 0, expectedLabelsListFinal, defaultStringToAdd.length,
					expectedlabelsListTrimmed.length);

			// Get text from the select locator and validate against the values derived from
			// the google sheets
			Select dropDownValues = new Select(driver.findElement(locator));
			int count = 0;
			List<WebElement> options = dropDownValues.getOptions();
			for (WebElement we : options) {
				actualDropDownItems.add(we.getText());
			}
			for (int i = 0; i < actualDropDownItems.size(); i++) {
				if (!expectedLabelsListFinal[i].equals(actualDropDownItems.get(i))) {
					count++;
					System.out.println(count);
				}
			}
			if (actualDropDownItems.size() != 0 && count == 0) {
				Reporting.logResults(driver, "Pass", "Validate Drop down values",
						"values are correct for: " + locatorname);
				flag = true;
			} else if (count != 0) {
				Reporting.logResults(driver, "FAIL", "Validate Drop down values", "Values are incorrect for: "
						+ locatorname + ", Expected value is :" + Arrays.toString(expectedLabelsListFinal));
				flag = false;
			}
		} catch (Exception e) {
			Reporting.logResults(driver, "FAIL", "Validate Drop down values",
					"Null value read from sheet or Unable to locate the label/locator for: " + locatorname);
			flag = false;
		}
		return flag;
	}

	/**
	 * This method will Validate the Values in the drop-down/select component (ref data) from the Google sheet where data is stored as a list in a column
	 * @author Aakash Kumar
	 * @param locator
	 * @param spreadsheetId
	 * @param range
	 * @param locatorname
	 * @return boolean
	 * @throws IOException
	 * @throws AWTException
	 * @throws InterruptedException 
	 */

	public boolean validateSelectValues(By locator, String spreadsheetId, String range, String locatorname)
			throws IOException, AWTException, InterruptedException {
		flag = false;
		try {

		    // get data as an object from the defined cell or range from the google sheet 
		    GoogleSheetAPI sheetAPI = new GoogleSheetAPI();
			List<Object> expectedValue = sheetAPI.getSpreadSheetRecordsColumn(spreadsheetId, range);

		    // convert the object into an list of strings and append default value in index(0) to the array
			
			List<String> expectedlabelsList = new ArrayList<>(expectedValue.size());
	
			for (Object object : expectedValue) {
				expectedlabelsList.add(object != null ? object.toString() : null);
			}
			List<String> expectedValues = new ArrayList<>();
			expectedValues.add(0, " -- Please Select -- ");
			for (String e:expectedlabelsList ) {
				expectedValues.add(e.replaceAll("[^a-zA-Z 0-9(':., @ / )-]", ""));
			}

        	List<String> actualDropDownItems = new ArrayList<String>();
        	
			Select dropDownValues = new Select(driver.findElement(locator));
			int count = 0;
			List<WebElement> dropDownList = dropDownValues.getOptions();
			for (WebElement we : dropDownList) {
				actualDropDownItems.add(we.getText());
			}
			for (int i = 0; i < actualDropDownItems.size(); i++) {
				if (!expectedValues.get(i).equals(actualDropDownItems.get(i))) {
					count++;
					System.out.println("expected: "+expectedValues.get(i));
					System.out.println("Actual: "+actualDropDownItems.get(i));
				}
			}
			if (actualDropDownItems.size() != 0 && count == 0) {
				Reporting.logResults(driver, "Pass", "Validate Drop Down Values",
						"Values are correct and in order for: " + locatorname);
				flag = true;
			} else {
				Reporting.logResults(driver, "FAIL", "Validate Drop Down Values",
						"values are incorrect or incorrect order for: " + locatorname);
				flag = false;
			}

		} catch (Exception e) {
			
		     if(e.getMessage().contains("429")) {
		    	 Reporting.logResults(driver, "FAIL", "Resourse allocation",
							"APi resourse exausted ");
		    	 timeWait(10000);
		     }
			Reporting.logResults(driver, "FAIL", "Validate Drop Down Values",
					"Null value read from sheet or Unable to locate the element for: " + locatorname);
			flag = false;
		}
		return flag;
	}
	
	
	/**
	 * This method will Validate the saved values in a multi-select field against the Reference data from the Google sheets, where data is stored as a list in a column.
	 * @author Aakash Kumar
	 * @param locator
	 * @param spreadsheetId
	 * @param range
	 * @param locatorname
	 * @return boolean
	 * @throws IOException
	 * @throws AWTException
	 */

	public boolean validateMultiSelectValues(By locator, String spreadsheetId, String range, String locatorname)
			throws IOException, AWTException {
		flag = false;
		try {

		    // get data as an object from the defined cell or range from the google sheet 
		    GoogleSheetAPI sheetAPI = new GoogleSheetAPI();
			List<Object> expectedValue = sheetAPI.getSpreadSheetRecordsColumn(spreadsheetId, range);

		    // convert the object into an list of strings and append default value in index(0) to the array
			
			List<String> expectedlabelsList = new ArrayList<>(expectedValue.size());
	
			for (Object object : expectedValue) {
				expectedlabelsList.add(object != null ? object.toString() : null);
			}
			List<String> expectedValues = new ArrayList<>();
			for (String e:expectedlabelsList ) {
				expectedValues.add(e.replaceAll("[^a-zA-Z 0-9(':., @ / )-]", ""));
				//expectedValues.add(e.replaceAll("[^a-z A-Z 0-9 , . - ' (' : . , - _ ) – ]", ""));
			}

			
			// Adding code to remove duplicates
			
		      List<String> expectedValuesNoDuplicates = expectedValues.stream().distinct().collect(Collectors.toList());
		      System.out.println(expectedValuesNoDuplicates);
		       
			
			// Validate the values of multi-select options from google sheet against the saved values
			int count=0;
        	List<String> actualValues = new ArrayList<String>();
			List<WebElement> options = driver.findElement(locator).findElements(By.tagName("li"));
			for (WebElement we : options) {
				 actualValues.add(we.getText());
			}	 
			    for (int i = 0; i < actualValues.size(); i++) {
			    	  if (!expectedValuesNoDuplicates.get(i).equals(actualValues.get(i))) {
			    	  count++;
			    	  System.out.println("Expected:"+expectedValuesNoDuplicates.get(i));
			    	  System.out.println("Actual:"+actualValues.get(i));
			    	  System.out.println(count);
			    	  } 
			    }
			    if (actualValues.size() != 0 && count == 0 ){
			    	Reporting.logResults(driver, "Pass", "Validate Multiselect Values", "Values are correct and in order for: " + locatorname);
			    	flag= true;
			    } else {
			    	Reporting.logResults(driver, "FAIL", "Validate Multiselect Values", "Values are incorrect or incorrect order for: " + locatorname);
			    } 

		} catch (Exception e) {
			Reporting.logResults(driver, "FAIL", "Validate Multiselect Values",
					"Null value read from sheet or Unable to locate the element for: " + locatorname);
			flag = false;
		}
		return flag;
	}
	
	


	/**
	 * This method will Click and select the date in the date picker
	 * @author Aakash Kumar
	 * @param Click locator
	 * @param Select locator
	 * @param locatorname
	 * @return boolean
	 * @throws IOException
	 * @throws AWTException
	 */

	public boolean validatedatePicker(By Clicklocator, By Selectlocator, String locatorName)
			throws IOException, AWTException {
		flag = false;

		// Click the date picker option
		click(Clicklocator, locatorName);

		// select the current date
		try {
			shortWait();

			List<WebElement> dates = driver.findElements(Selectlocator);
			for (WebElement date : dates) {
				if (date.getText().equals(dayOfMonthStr)) {
					date.click();
					Reporting.logResults(driver, "Pass", "Select Date picker",
							"Selected current date for: " + locatorName);
					shortWait();
					flag = true;
					break;
				}
			}

			shortWait();
		}

		catch (Exception e) {
			Reporting.logResults(driver, "FAIL", "Validate Date picker",
					"Unable to locate the element for: " + locatorName);
			flag = false;
		}
		return flag;
	}
	
	/**
	 * This method will Click and select the date in the date picker
	 * @author Aakash Kumar
	 * @param Click locator
	 * @param Select locator
	 * @param locatorname
	 * @return boolean
	 * @throws IOException
	 * @throws AWTException
	 * @throws InterruptedException 
	 */

	public boolean enterHTMLEditor(By iframeLocator, By inputlocator, String spreadsheetId, String range, String locatorname)
			throws IOException, AWTException, InterruptedException {
		flag = false;
		
		// call the Switch to frame method
		if (switchToDefaultFrameByLocator(iframeLocator) == true) {
			Reporting.logResults(driver, "Pass", "Switch to iframe", "Switched to the iframe for: " + locatorname);
			
			// Enter the text wothing the Body of HTML editor
			enterFromSheets(inputlocator, spreadsheetId, range, locatorname);
			longWait();
			
			// Switch back to default content
			driver.switchTo().defaultContent();
			flag =true;
		}
		
		else {
			Reporting.logResults(driver, "FAIL", "Switch to iframe", "Unable to locate the iframe for: " + locatorname);
			flag=false;
		}
		return flag;
		}

	
	
	

	/**
	 * This method will Validate the saved data in the field by passing locator and data to be saved
	 * @author Aakash Kumar
	 * @param locator
	 * @param data
	 * @param locatorname
	 * @return boolean
	 * @throws IOException
	 * @throws AWTException
	 */

	public boolean validateData(By locator, String data, String locatorname) throws IOException, AWTException {
		flag = false;
		try {
			longWait();
			if (driver.findElement(locator).isDisplayed()) {

				String actualData = driver.findElement(locator).getText();
				String expectedData = data;

				// Validate the actual Data against the Data derived from google sheets
				if (actualData.equals(expectedData)) {
					Reporting.logResults(driver, "Pass", "Validate Data", "Data is correct for: " + locatorname);
					flag = true;
				} else {
					Reporting.logResults(driver, "FAIL", "Validate Data", "Data is incorrect for: " + locatorname
							+ ", correct value is :" + expectedData + "actual is:" + actualData);
					flag = false;
				}
			}

		} catch (Exception e) {
			Reporting.logResults(driver, "FAIL", "Validate Data",
					"Unable to locate the Data/locator for: " + locatorname);
			flag = false;
		}
		return flag;

	}
	

	/**
	 * This Method validates the default flag checked and Clicks on the other check box, on the basis on default check-box provided 
	 * @param Yeslocator (for the locator of yes check-box)
	 * @param Nolocator (for the locator of yes check-box)
	 * @param String spreadsheetId, String range (To get the Default value data)
	 * @param locatorNameYes (for reporting)
	 * @param locatorNameNo (for reporting)
	 * @return boolean
	 * @author Aakash Kumar
	 * @throws AWTException
	 * @throws HeadlessException
	 */

	public boolean clickCheckBox(By Yeslocator, By Nolocator, String spreadsheetId, String range, String locatorNameYes, String locatorNameNo) throws IOException, AWTException {
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
		
			String YesDefault = "Yes";
			String NoDefault = "No";
			if(inputData.equalsIgnoreCase(YesDefault)){
			boolean YesChecked = driver.findElement(Yeslocator).isSelected();
			 if (YesChecked == true) {
			 Reporting.logResults(driver, "Pass", "Verify the Default checked value ", "Default checkbox is " + locatorNameYes);
			  try {
				  longWait();
			      driver.findElement(Nolocator).click();
			      Reporting.logResults(driver, "Pass", "Verify the click on checkbox ", "clicked on check box for " + locatorNameNo);
			      flag = true;
			  }
			  catch(Exception e)
			  {
				  Reporting.logResults(driver, "FAIL", "Verify the Checkbox Element", "Unable to locate element for " + locatorNameNo );
			  } 
			 }
			  else {
				  Reporting.logResults(driver, "FAIL", "Verify the Default checked value ", "Default checkbox is not  " + locatorNameYes);  
			  }
			 
			
			}
			if(inputData.equalsIgnoreCase(NoDefault)){
			boolean NoChecked = driver.findElement(Nolocator).isSelected();
			 if (NoChecked == true) {
			 Reporting.logResults(driver, "Pass", "Verify the Default checked value ", "Default checkbox is " + locatorNameNo);
			  try {
				  longWait();
			      driver.findElement(Yeslocator).click();
			      Reporting.logResults(driver, "Pass", "Verify the click on checkbox ", "clicked on check box for " + locatorNameYes);
			      flag = true;
			  }
			  catch(Exception e)
			  {
				  Reporting.logResults(driver, "FAIL", "Verify the Checkbox Element", "Unable to locate element for " + locatorNameYes );
			  }
			 }
			 
			  else {
				  Reporting.logResults(driver, "FAIL", "Verify the Default checked value ", "Default checkbox is not  " + locatorNameNo);  
			  }
			}
			if(!inputData.equalsIgnoreCase(NoDefault) && !inputData.equalsIgnoreCase(YesDefault) ){
				System.out.println("Busted");
				Reporting.logResults(driver, "FAIL", "Verify the Checkbox values", "Incorrect values read from sheet for " + locatorNameYes );
			}
			
			 return flag;
		 
		} catch (Exception e) {
			e.printStackTrace();
			Reporting.logResults(driver, "FAIL", "Verify the Checkbox Element", "Null values or Unable to locate element for " + locatorNameYes +" or " + locatorNameNo);
			return flag;
		}
	}
	
	/**
	 * This method will enter the value in the locator by reading data from google sheets
	 * @param locator
	 * @param spreadsheetId
	 * @param range
	 * @param locatorname
	 * @return boolean
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean enterFromSheets(By locator, String spreadsheetId, String range, String locatorname) throws IOException, AWTException {
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
				
			driver.findElement(locator).clear();
			driver.findElement(locator).sendKeys(inputData);
			Reporting.logResults(driver, "Pass", "Enter Text", "Succesfully entered text in " + locatorname);
			flag = true;

		} catch (Exception e) {
			Reporting.logResults(driver, "FAIL", "Enter text", "Unable to enter text in " + locatorname);
			return false;
		}
		return flag;

	}
	
	/**
	 * This method will select the value in the drop-down locator by reading value from the google sheets
	 * @param locator
	 * @param spreadsheetId
	 * @param range
	 * @param locatorname
	 * @return boolean
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean selectFromSheets(By locator, String spreadsheetId, String range, String locatorname) throws IOException, AWTException {
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
	
	
	public void timeWait(int interval) throws InterruptedException {
		Thread.sleep(interval);
	}
	
	
	
	
	

	/*
	 * public List<WebElement> retrieveAllItemsInSection(By section) { return
	 * driver.findElements(section); }
	 * 
	 * public CoursePage selectRandomCourseItem(List<WebElement> items) {
	 * items.get(rand.nextInt(items.size())).click(); return new CoursePage(driver);
	 * }
	 * 
	 * public ProgramPage selectRandomProgramItem(List<WebElement> items) {
	 * items.get(rand.nextInt(items.size())).click(); return new
	 * ProgramPage(driver); }
	 * 
	 * public SpecializationPage selectRandomSpecializationItem(List<WebElement>
	 * items) { items.get(rand.nextInt(items.size())).click(); return new
	 * SpecializationPage(driver); }
	 * 
	 * public void selectEducationLevel(String level) throws IOException,
	 * AWTException { if (level.equalsIgnoreCase("undergraduate")) {
	 * click(Locators.BrowsePage.UNDERGRADUATEBTN, "undergraduate button"); } else
	 * if (level.equalsIgnoreCase("postgraduate")) {
	 * click(Locators.BrowsePage.POSTGRADUATEBTN, "undergraduate button"); } }
	 * 
	 *//**
		 * This method will validate Title and description in BRowse section of Area of
		 * Interest in home page and also in the landing page
		 * 
		 * @return
		 * @throws HeadlessException
		 * @throws IOException
		 * @throws AWTException
		 */
	/*
	 * public boolean verifyAreadOfInterstValidation() throws IOException { flag =
	 * false; try {
	 * 
	 * List<WebElement> items =
	 * driver.findElements(Locators.BrowsePage.AREAOFINTERESTTABS); int count =
	 * items.size();
	 * 
	 * for (int i = 0; i < count; i++) {
	 * 
	 * items = driver.findElements(Locators.BrowsePage.AREAOFINTERESTTABS);
	 * 
	 * String sTitle = items.get(i).findElement(By.xpath("div/h3")).getText();
	 * String sDescription =
	 * items.get(i).findElement(By.xpath("div[@class='a-browse-tile-content']/p"))
	 * .getText(); ActionDriver action = new ActionDriver(driver);
	 * action.click(items.get(i), ""); driver.manage().timeouts().implicitlyWait(50,
	 * TimeUnit.SECONDS); String aTitle =
	 * driver.findElement(Locators.AcamedicItemPage.TITLE).getText(); String
	 * aDescription =
	 * driver.findElement(Locators.AcamedicItemPage.DESCRIPTION).getText();
	 * 
	 * if (aTitle.equalsIgnoreCase(sTitle) &&
	 * aDescription.equalsIgnoreCase(sDescription)) { Reporting.logResults(driver,
	 * "Pass", "Verify" + aTitle + "and" + aDescription + " in Area of Interest",
	 * "Verified " + aTitle + " in Area of Interest");
	 * 
	 * } else { Reporting.logResults(driver, "FAIL", "Verify" + aTitle + "and" +
	 * aDescription + " in Area of Interest", "FAILed to Verify " + aTitle +
	 * " in Area of Interest"); }
	 * 
	 * action.click(Locators.HomePage.HOMEBTN, "Home button");
	 * 
	 * }
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } return true; }
	 * 
	 *//**
		 * This method will validate Title and description in BRowse section of
		 * Faculties in home page and also in the landing page
		 * 
		 * @return
		 * @throws HeadlessException
		 * @throws IOException
		 * @throws AWTException
		 */
	/*
	 * public boolean verifyByFacultyValidation() throws IOException { flag = false;
	 * try { ActionDriver action = new ActionDriver(driver);
	 * action.click(Locators.BrowsePage.FACULTIES, "Clicked on Faculty");
	 * List<WebElement> items =
	 * driver.findElements(Locators.BrowsePage.AREAOFFACULTY); int count =
	 * items.size();
	 * 
	 * for (int i = 0; i < count; i++) {
	 * 
	 * items = driver.findElements(Locators.BrowsePage.AREAOFFACULTY);
	 * 
	 * String sTitle = items.get(i).findElement(By.xpath("div/h3")).getText();
	 * String sDescription =
	 * items.get(i).findElement(By.xpath("div[@class='a-browse-tile-content']/p"))
	 * .getText(); action.click(items.get(i), "");
	 * driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); String
	 * aTitle = driver.findElement(Locators.AcamedicItemPage.TITLE).getText();
	 * String aDescription =
	 * driver.findElement(Locators.AcamedicItemPage.DESCRIPTION).getText();
	 * 
	 * if (aTitle.equalsIgnoreCase(sTitle) &&
	 * aDescription.equalsIgnoreCase(sDescription)) { Reporting.logResults(driver,
	 * "Pass", "Verify" + aTitle + "and" + aDescription + " in By Faculty",
	 * "Verified " + aTitle + " in By Faculty");
	 * 
	 * } else { Reporting.logResults(driver, "FAIL", "Verify" + aTitle + "and" +
	 * aDescription + " in By Faculty", "FAILed to Verify " + aTitle +
	 * " in By Faculty"); } action.click(Locators.HomePage.HOMEBTN, "Home button");
	 * action.click(Locators.BrowsePage.FACULTIES, "Clicked on Faculty"); } flag =
	 * true;
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } return flag; }
	 * 
	 * public boolean verifyListIsOrdered(By listLocator) throws IOException,
	 * AWTException { List<WebElement> elements = driver.findElements(listLocator);
	 * List<String> codes = new ArrayList<>(); for (WebElement e : elements) {
	 * codes.add(e.getText()); } if (Ordering.natural().isOrdered(codes)) {
	 * Reporting.logResults(driver, "Pass", "Verify Items are in order",
	 * "Elements in order"); return true; } Reporting.logResults(driver, "FAIL",
	 * "Verify Items are in order", "Elements in order"); return false; }
	 * 
	 * public boolean verifyHeader(int menuIndex) throws IOException, AWTException {
	 * String aListItem =
	 * driver.findElement(By.xpath("//div[@class='m-page-nav-list']/div[" +
	 * menuIndex + "]")) .getText();
	 * 
	 * boolean flag = driver.findElement(By.xpath("//h3[contains(text(),'" +
	 * aListItem + "')]")).isDisplayed(); if (!flag) { Reporting.logResults(driver,
	 * "FAIL", "Verify Left pane Elements", "Element " + aListItem +
	 * "in Left pane is Not displayed as header in the right"); } else {
	 * Reporting.logResults(driver, "Pass",
	 * "Verify Left pane Elements in Undergrad", "Element " + aListItem +
	 * "in Left pane is displayed as header in the right"); } return flag; }
	 * 
	 * public SearchResults selectGoToSearch(By locator) throws IOException,
	 * AWTException { click(locator, ""); return new SearchResults(driver); }
	 * 
	 * /////////////////////////
	 * 
	 *//**
		 * This method will validate Title and description in BRowse section of
		 * Faculties in home page and also in the landing page
		 * 
		 * @return
		 * @throws HeadlessException
		 * @throws IOException
		 * @throws AWTException
		 *//*
			 * 
			 * public SearchResults goToSearch(int index) throws IOException, AWTException {
			 * click(By.xpath(
			 * "(//button[text()='Undergraduate ']//ancestor::div[@class='a-browse-tab-panel']//a[@class='a-browse-more-controls-link'])["
			 * + index + "]"), "Go to search"); return new SearchResults(driver); }
			 * 
			 * public boolean areaOfInterst() { try { ActionDriver action = new
			 * ActionDriver(driver); flag =
			 * action.isElementPresent(Locators.BrowsePage.AREAOFINTERSTACTIVE); if (!flag)
			 * { Reporting.logResults(driver, "FAIL",
			 * "Verify Area of Interest is active By default",
			 * "Area of Interst is not active by Default"); } else {
			 * Reporting.logResults(driver, "Pass",
			 * "Verify Area of Interest is active By default",
			 * "Area of Interst is Active by Default"); } } catch (Exception e) {
			 * e.getMessage(); } return flag; }
			 */

}
