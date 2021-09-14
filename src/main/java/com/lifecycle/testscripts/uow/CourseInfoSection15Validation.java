package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.accelarators.Utilities;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;



public class CourseInfoSection15Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection() throws IOException, InterruptedException, AWTException, NullPointerException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for Section 15 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section15Heading, ConstantDetails.UOW_Templates, "T06_Course Information!D150", "Section 15 heading");
		
		 validations.shortWait();
		validations.linkBySheet(driver, ConstantDetails.UOW_Templates, "T06_Course Information!D150", "Section 15");
		 validations.longWait();
		 
		// Click on edit
		validations.click(Locators.TemplatelabelUOW.Section15Edit, "Section 15 Edit");
		validations.longWait();

		
		//Pass Locator, Google Sheet ID, sheet tab and cell range for name, sheet tab and cell range for mandatory column,  Locator name
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section15Field1label, ConstantDetails.UOW_Templates, "T06_Course Information!D151", "T06_Course Information!H151", "Section 15 Field 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section15Field2label, ConstantDetails.UOW_Templates, "T06_Course Information!D156", "T06_Course Information!H156", "Section 15 Field 2");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section15Field3label, ConstantDetails.UOW_Templates, "T06_Course Information!D157", "T06_Course Information!H157", "Section 15 Field 3");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section15Field4label, ConstantDetails.UOW_Templates, "T06_Course Information!D158", "T06_Course Information!H158", "Section 15 Field 4");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section15Field5label, ConstantDetails.UOW_Templates, "T06_Course Information!D159", "T06_Course Information!H159", "Section 15 Field 5");

		
		// Click on related record 
		validations.click(Locators.TemplatelabelUOW.Section15Field1RelatedClick, "Section 15 Field 1 Related record");
		 validations.shortWait();

		
		// Validate the labels inside related records
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section15Field1_1label, ConstantDetails.UOW_Templates, "T06_Course Information!D152", "T06_Course Information!H152", "Section 15 Field 1 > 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section15Field1_2label, ConstantDetails.UOW_Templates, "T06_Course Information!D153", "T06_Course Information!H153", "Section 15 Field 1 > 2");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section15Field1_3label, ConstantDetails.UOW_Templates, "T06_Course Information!D154", "T06_Course Information!H154", "Section 15 Field 1 > 3");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section15Field1_4label, ConstantDetails.UOW_Templates, "T06_Course Information!D155", "T06_Course Information!H155", "Section 15 Field 1 > 4");


		//Input the data in all the fields
	    // enter the data

		validations.enterFromSheets(Locators.TemplatelabelUOW.Section15Field1_1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B124", "Section 15 Field 1 > 1");
		validations.validatedatePicker(Locators.TemplatelabelUOW.Section15Field1_2DateClick, Locators.TemplatelabelUOW.Section15Field1_2DateSelect, "Section 15 Field 1 > 2");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section15Field1_3Data, ConstantDetails.UOW_TestData, "T06_Course Information!B126", "Section 15 Field 1 > 3");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section15Field1_4Data, ConstantDetails.UOW_TestData, "T06_Course Information!B127", "Section 15 Field 1 > 4");

		validations.validatedatePicker(Locators.TemplatelabelUOW.Section15Field2DateClick, Locators.TemplatelabelUOW.Section15Field2DateSelect, "Section 15 Field 2");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section15Field3Data, ConstantDetails.UOW_TestData, "T06_Course Information!B129", "Section 15 Field 3");
		validations.multiSelectClick(Locators.TemplatelabelUOW.Section15Field4Data, "Section 15 Field 4"); 
		validations.isElementDisplayed(Locators.TemplatelabelUOW.Section15Field6Data, "Section 15 Field 6");
		validations.clickCheckBox(Locators.TemplatelabelUOW.Section15Field5Yes, Locators.TemplatelabelUOW.Section15Field5No, ConstantDetails.UOW_TestData, "T06_Course Information!D131", "Section 15 Field 5 : Yes", "Section 15 Field 3 5: No");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section15Field6label, ConstantDetails.UOW_Templates, "T06_Course Information!D160", "T06_Course Information!H160", "Section 15 Field 6");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section15Field6Data, ConstantDetails.UOW_TestData, "T06_Course Information!B132", "Section 15 Field 6");

		
		validations.longWait();
		// Save the section
		validations.click(Locators.TemplatelabelUOW.Section15Save, "Section 15 Save");
		validations.longWait();
	
		// Click on chevron
		validations.click(Locators.TemplatelabelUOW.Section15Field1Chev, "Section 15 Field 1 chevron");
		 validations.shortWait();
		 
		// Validate the saved data 
		validations.validateSavedData(Locators.TemplatelabelUOW.Section15Field1_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C124", "Section 15 Field 1 > 1");
		
		//This method will return the current date in the specified format
		String currentDate = Utilities.currentDate();
		
		// Validate the Data saved
		validations.validateData(Locators.TemplatelabelUOW.Section15Field1_2DataSaved, currentDate, "Section 15 Field 1 > 2");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section15Field1_3DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C126", "Section 15 Field 1 > 3");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section15Field1_4DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C127", "Section 15 Field 1 > 4");
		
		validations.validateData(Locators.TemplatelabelUOW.Section15Field2DataSaved, currentDate, "Section 15 Field 2");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section15Field3DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C129", "Section 15 Field 3");
        validations.validateMultiSelectValues(Locators.TemplatelabelUOW.Section15Field4DataSaved, ConstantDetails.UOW_Confirmation, "Sheet1!A2:A3", "Section 15 Field 4"); 
		validations.validateSavedData(Locators.TemplatelabelUOW.Section15Field5DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C131", "Section 15 Field 5");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section15Field6DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C132", "Section 15 Field 6");


	
		validations.longWait();
	
	
	
	}


}
