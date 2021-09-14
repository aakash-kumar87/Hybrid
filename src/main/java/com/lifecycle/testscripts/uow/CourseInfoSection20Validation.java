
package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;



public class CourseInfoSection20Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection() throws IOException, InterruptedException, AWTException, NullPointerException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for Section 20 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section20Heading, ConstantDetails.UOW_Templates, "T06_Course Information!D183", "Section 20 heading");
		
		 validations.shortWait();
		validations.linkBySheet(driver, ConstantDetails.UOW_Templates, "T06_Course Information!D183", "Section 20");
		 validations.longWait();
		 
		// Click on edit
		validations.click(Locators.TemplatelabelUOW.Section20Edit, "Section 20 Edit");
		validations.longWait();

		
		//Validate the field labels
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section20Field1label, ConstantDetails.UOW_Templates, "T06_Course Information!D184", "T06_Course Information!H185", "Section 20 Field 1");

	    // Validate conditional display of fields 
		validations.isElementDisplayed(Locators.TemplatelabelUOW.Section20Field2label, "Section 20 Field 2");
		validations.isElementDisplayed(Locators.TemplatelabelUOW.Section20Field2label, "Section 20 Field 3");
		validations.isElementDisplayed(Locators.TemplatelabelUOW.Section20Field2label, "Section 20 Field 4");
		validations.isElementDisplayed(Locators.TemplatelabelUOW.Section20Field2label, "Section 20 Field 5"); 
		
		// Select yes for field 1 to enable all 4 fields 
		
	//	validations.clickCheckBox(Locators.TemplatelabelUOW.Section20Field1Yes, Locators.TemplatelabelUOW.Section20Field1No, ConstantDetails.UOW_TestData, "T06_Course Information!D161", "Section 20 Field 1: Yes", "Section 20 Field 1: No");
		
		validations.selectFromSheets(Locators.TemplatelabelUOW.Section20Field1, ConstantDetails.UOW_TestData, "T06_Course Information!B161", "Section 20 Field 1");
		
		// Validate the labels of conditional fields displayed
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section20Field2label, ConstantDetails.UOW_Templates, "T06_Course Information!D185", "T06_Course Information!H185", "Section 20 Field 2");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section20Field3label, ConstantDetails.UOW_Templates, "T06_Course Information!D186", "T06_Course Information!H186", "Section 20 Field 3");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section20Field4label, ConstantDetails.UOW_Templates, "T06_Course Information!D187", "T06_Course Information!H187", "Section 20 Field 4");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section20Field5label, ConstantDetails.UOW_Templates, "T06_Course Information!D188", "T06_Course Information!H188", "Section 20 Field 5");

		//Input the data in all the fields
	    // enter the data

		validations.enterFromSheets(Locators.TemplatelabelUOW.Section20Field2Data, ConstantDetails.UOW_TestData, "T06_Course Information!B162", "Section 20 Field 2");
		validations.longWait();
		
		validations.click(Locators.TemplatelabelUOW.Section20Field2DataClick, "Section 20 Field 2");
		validations.longWait();
		
		validations.click(Locators.TemplatelabelUOW.Section20Field3label, "Section 20 Field 3");
		validations.multiSelectClick(Locators.TemplatelabelUOW.Section20Field3Data, "Section 20 Field 3"); 
		
		
		
		validations.enterHTMLEditor(Locators.TemplatelabelUOW.Section20Field4DataFrame, Locators.TemplatelabelUOW.Section20Field4Data, ConstantDetails.UOW_TestData, "T06_Course Information!B164", "Section 20 Field 4" );
		validations.enterHTMLEditor(Locators.TemplatelabelUOW.Section20Field5DataFrame, Locators.TemplatelabelUOW.Section20Field5Data, ConstantDetails.UOW_TestData, "T06_Course Information!B165", "Section 20 Field 5" );
	
		validations.longWait();
		
		// Save the section
		validations.click(Locators.TemplatelabelUOW.Section20Save, "Section 20 Save");
		validations.longWait();
	
		// Validate the saved data 
		validations.validateSavedData(Locators.TemplatelabelUOW.Section20Field1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C161", "Section 20 Field 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section20Field2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C162", "Section 20 Field 2");
		validations.validateMultiSelectValues(Locators.TemplatelabelUOW.Section20Field3DataSaved, ConstantDetails.UOW_Faculty, "Faculty-Unit Relationship!D2:D64", "Section 20 Field 3");  
		validations.validateSavedData(Locators.TemplatelabelUOW.Section20Field4DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C164", "Section 20 Field 4");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section20Field5DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C165", "Section 20 Field 5");
		
		validations.longWait();
	
	
	
	}


}
