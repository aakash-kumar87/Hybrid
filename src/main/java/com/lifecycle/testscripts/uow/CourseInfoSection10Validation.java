package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;



public class CourseInfoSection10Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection() throws IOException, InterruptedException, AWTException, NullPointerException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for Section 10 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section10Heading, ConstantDetails.UOW_Templates, "T06_Course Information!D111", "Section 10 heading");
		
		 validations.shortWait();
		validations.linkBySheet(driver, ConstantDetails.UOW_Templates, "T06_Course Information!D111", "Section 10");
		 validations.longWait();
		 
		// Click on edit
		validations.click(Locators.TemplatelabelUOW.Section10Edit, "Section 10 Edit");
		validations.longWait();

		
		//Pass Locator, Google Sheet ID, sheet tab and cell range for name, sheet tab and cell range for mandatory column,  Locator name
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section10Field1label, ConstantDetails.UOW_Templates, "T06_Course Information!D112", "T06_Course Information!H112", "Section 10 Field 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section10Field2label, ConstantDetails.UOW_Templates, "T06_Course Information!D114", "T06_Course Information!H114", "Section 10 Field 2");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section10Field3label, ConstantDetails.UOW_Templates, "T06_Course Information!D116", "T06_Course Information!H116", "Section 10 Field 3");

		// Click on related record 
		validations.click(Locators.TemplatelabelUOW.Section10Field1RelatedClick, "Section 10 Field 1 Related record");
		validations.click(Locators.TemplatelabelUOW.Section10Field2RelatedClick, "Section 10 Field 2 Related record");
	
		
		// Validate the labels inside related records
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section10Field1_1label, ConstantDetails.UOW_Templates, "T06_Course Information!D113", "T06_Course Information!H113", "Section 10 Field 1 > 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section10Field2_1label, ConstantDetails.UOW_Templates, "T06_Course Information!D115", "T06_Course Information!H115", "Section 10 Field 2 > 1");


		//Input the data in all the fields
	    // enter the data
		
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section10Field1_1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B79", "Section 10 Field 1 > 1");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section10Field2_1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B80", "Section 10 Field 2 > 1");

		validations.selectFromSheets(Locators.TemplatelabelUOW.Section10Field3Data, ConstantDetails.UOW_TestData, "T06_Course Information!B81", "Section 10 Field 3");

		validations.validateSelectValues(Locators.TemplatelabelUOW.Section10Field3Data, ConstantDetails.UOW_HounoursGrade, "Sheet1!A2:A5", "Section 10 Field 3");


		validations.longWait();
		// Save the section
		validations.click(Locators.TemplatelabelUOW.Section10Save, "Section 10 Save");
		validations.longWait();
	
		// Click on chevron
		validations.click(Locators.TemplatelabelUOW.Section10Field1Chev, "Section 10 Field 1 chevron");
		validations.click(Locators.TemplatelabelUOW.Section10Field2Chev, "Section 10 Field 2 chevron");
		
		// Validate the saved data 
		
		validations.validateSavedData(Locators.TemplatelabelUOW.Section10Field1_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C79", "Section 10 Field 1 > !");

		validations.validateSavedData(Locators.TemplatelabelUOW.Section10Field2_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C80", "Section 10 Field 2 > 1");

		validations.validateSavedData(Locators.TemplatelabelUOW.Section10Field3DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C81", "Section 10 Field 3");

		validations.longWait();
	
	
	
	}


}
