
package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;



public class CourseInfoSection7Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection() throws IOException, InterruptedException, AWTException, NullPointerException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for Section 7 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section7Heading, ConstantDetails.UOW_Templates, "T06_Course Information!D91", "Section 7 heading");
		
		validations.shortWait();
		validations.linkBySheet(driver, ConstantDetails.UOW_Templates, "T06_Course Information!D91", "Section 7");
		validations.longWait();
	
		 
		// Click on edit
		validations.click(Locators.TemplatelabelUOW.Section7Edit, "Section 7 Edit");
		validations.longWait();
		

		//Pass Locator, Google Sheet ID, sheet tab and cell range for name, sheet tab and cell range for mandatory column,  Locator name
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section7Field1label, ConstantDetails.UOW_Templates, "T06_Course Information!D92", "T06_Course Information!H92", "Section 7 Field 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section7Field2label, ConstantDetails.UOW_Templates, "T06_Course Information!D99", "T06_Course Information!H99", "Section 7 Field 2");

		// Click on related record 
		validations.click(Locators.TemplatelabelUOW.Section7Field1RelatedClick, "Section 7 Field 1 Related record");
		
		
		// Validate the labels inside related records
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section7Field1_1label, ConstantDetails.UOW_Templates, "T06_Course Information!D93", "T06_Course Information!H93", "Section 7 Field 1 > 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section7Field1_2label, ConstantDetails.UOW_Templates, "T06_Course Information!D94", "T06_Course Information!H94", "Section 7 Field 1 > 2");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section7Field1_3label, ConstantDetails.UOW_Templates, "T06_Course Information!D95", "T06_Course Information!H95", "Section 7 Field 1 > 3");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section7Field1_4label, ConstantDetails.UOW_Templates, "T06_Course Information!D96", "T06_Course Information!H96", "Section 7 Field 1 > 4");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section7Field1_5label, ConstantDetails.UOW_Templates, "T06_Course Information!D97", "T06_Course Information!H97", "Section 7 Field 1 > 5");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section7Field1_6label, ConstantDetails.UOW_Templates, "T06_Course Information!D98", "T06_Course Information!H98", "Section 7 Field 1 > 6");


		//Input the data in all the fields
		validations.selectFromSheets(Locators.TemplatelabelUOW.Section7Field1_1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B58", "Section 7 Field 1 > 1");
		
		// Validate the drop down data 
	    validations.validateSelectValues(Locators.TemplatelabelUOW.Section7Field1_1Data, ConstantDetails.UOW_EnglishLanguagetest, "Sheet1!A2:A3", "Section 7 Field 1 > 1");
	
	    // enter the data
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section7Field1_2Data, ConstantDetails.UOW_TestData, "T06_Course Information!B59", "Section 7 Field 1 > 2");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section7Field1_3Data, ConstantDetails.UOW_TestData, "T06_Course Information!B60", "Section 7 Field 1 > 3");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section7Field1_4Data, ConstantDetails.UOW_TestData, "T06_Course Information!B61", "Section 7 Field 1 > 4");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section7Field1_5Data, ConstantDetails.UOW_TestData, "T06_Course Information!B62", "Section 7 Field 1 > 5");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section7Field1_6Data, ConstantDetails.UOW_TestData, "T06_Course Information!B63", "Section 7 Field 1 > 6");
		
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section7Field2Data, ConstantDetails.UOW_TestData, "T06_Course Information!B64", "Section 7 Field 2");

	
		validations.longWait();
		// Save the section
		validations.click(Locators.TemplatelabelUOW.Section7Save, "Section 7 Save");
		validations.longWait();
	
		// Click on chevron
		validations.click(Locators.TemplatelabelUOW.Section7Field1Chev, "Section 7 Field 2 chevron");
		
		
		// Validate the saved data 
		validations.validateSavedData(Locators.TemplatelabelUOW.Section7Field1_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C58", "Section 7 Field 1 > 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section7Field1_2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C59", "Section 7 Field 1 > 2");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section7Field1_3DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C60", "Section 7 Field 1 > 3");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section7Field1_4DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C61", "Section 7 Field 1 > 4");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section7Field1_5DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C62", "Section 7 Field 1 > 5");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section7Field1_6DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C63", "Section 7 Field 1 > 6");
	
		validations.validateSavedData(Locators.TemplatelabelUOW.Section7Field2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C64", "Section 7 Field 2");

		validations.longWait();
	
	
	
	}


}
