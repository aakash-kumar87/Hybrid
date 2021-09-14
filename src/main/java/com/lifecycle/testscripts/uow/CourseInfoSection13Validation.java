package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.accelarators.Utilities;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;



public class CourseInfoSection13Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection() throws IOException, InterruptedException, AWTException, NullPointerException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for Section 13 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section13Heading, ConstantDetails.UOW_Templates, "T06_Course Information!D130", "Section 13 heading");
		
		 validations.shortWait();
		validations.linkBySheet(driver, ConstantDetails.UOW_Templates, "T06_Course Information!D130", "Section 13");
		 validations.longWait();
		 
		// Click on edit
		validations.click(Locators.TemplatelabelUOW.Section13Edit, "Section 13 Edit");
		validations.longWait();
		
		//Pass Locator, Google Sheet ID, sheet tab and cell range for name, sheet tab and cell range for mandatory column,  Locator name
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section13Field1label, ConstantDetails.UOW_Templates, "T06_Course Information!D131", "T06_Course Information!H131", "Section 13 Field 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section13Field2label, ConstantDetails.UOW_Templates, "T06_Course Information!D132", "T06_Course Information!H132", "Section 13 Field 2");
		
		//Input the data in all the fields	
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section13Field1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B102", "Section 13 Field 1");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section13Field2Data, ConstantDetails.UOW_TestData, "T06_Course Information!B103", "Section 13 Field 2");

		validations.longWait();
		// Save the section
		validations.click(Locators.TemplatelabelUOW.Section13Save, "Section 13 Save");
		validations.longWait();
		
		// Validate the saved data 
		validations.validateSavedData(Locators.TemplatelabelUOW.Section13Field1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C102", "Section 13 Field 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section13Field2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C103", "Section 13 Field 2");
	
		validations.longWait();
	}


}
