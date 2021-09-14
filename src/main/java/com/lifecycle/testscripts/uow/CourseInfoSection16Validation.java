package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;



public class CourseInfoSection16Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection() throws IOException, InterruptedException, AWTException, NullPointerException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for Section 16 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section16Heading, ConstantDetails.UOW_Templates, "T06_Course Information!D161", "Section 16 heading");
		
		 validations.shortWait();
		validations.linkBySheet(driver, ConstantDetails.UOW_Templates, "T06_Course Information!D161", "Section 16");
		 validations.longWait();
		 
		// Click on edit
		validations.click(Locators.TemplatelabelUOW.Section16Edit, "Section 16 Edit");
		validations.longWait();

		
		//Pass Locator, Google Sheet ID, sheet tab and cell range for name, sheet tab and cell range for mandatory column,  Locator name
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section16Field1label, ConstantDetails.UOW_Templates, "T06_Course Information!D162", "T06_Course Information!H162", "Section 16 Field 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section16Field2label, ConstantDetails.UOW_Templates, "T06_Course Information!D164", "T06_Course Information!H164", "Section 16 Field 2");

		
		// Click on related record 
		validations.click(Locators.TemplatelabelUOW.Section16Field1RelatedClick, "Section 16 Field 1 Related record");
		validations.click(Locators.TemplatelabelUOW.Section16Field2RelatedClick, "Section 16 Field 2 Related record");
		 validations.shortWait();

		// Validate the labels inside related records
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section16Field1_1label, ConstantDetails.UOW_Templates, "T06_Course Information!D163", "T06_Course Information!H163", "Section 16 Field 1 > 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section16Field2_1label, ConstantDetails.UOW_Templates, "T06_Course Information!D165", "T06_Course Information!H165", "Section 16 Field 2 > 1");


		//Input the data in all the fields
	    // enter the data

		validations.enterFromSheets(Locators.TemplatelabelUOW.Section16Field1_1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B136", "Section 16 Field 1 > 1");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section16Field2_1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B137", "Section 16 Field 2 > 1");
		
		validations.longWait();
		// Save the section
		validations.click(Locators.TemplatelabelUOW.Section16Save, "Section 16 Save");
		validations.longWait();
	
		// Click on chevron
		validations.click(Locators.TemplatelabelUOW.Section16Field1Chev, "Section 16 Field 1 chevron");
		validations.click(Locators.TemplatelabelUOW.Section16Field2Chev, "Section 16 Field 2 chevron");
		 validations.shortWait();
	
		// Validate the saved data 
		validations.validateSavedData(Locators.TemplatelabelUOW.Section16Field1_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C136", "Section 16 Field 1 > 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section16Field2_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C137", "Section 16 Field 2 > 1");
	
		validations.longWait();
	
	
	
	}


}
