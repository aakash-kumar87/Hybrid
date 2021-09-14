
package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;



public class CourseInfoSection4Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection() throws IOException, InterruptedException, AWTException, NullPointerException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for Section 4 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section4Heading, ConstantDetails.UOW_Templates, "T06_Course Information!D51", "Section 4 heading");
		
		 validations.shortWait();
		validations.linkBySheet(driver, ConstantDetails.UOW_Templates, "T06_Course Information!D51", "Section 4");
	//	 validations.scrollToView(Locators.TemplatelabelUOW.Section4Heading, "Section 4 Heading");
		 validations.longWait();
		 
		// Click on edit
		validations.click(Locators.TemplatelabelUOW.Section4Edit, "Section 4 Edit");
		validations.longWait();

		
		//Pass Locator, Google Sheet ID, sheet tab and cell range for name, sheet tab and cell range for mandatory column,  Locator name
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section4Field1label, ConstantDetails.UOW_Templates, "T06_Course Information!D52", "T06_Course Information!H52", "Section 4 Field 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section4Field3label, ConstantDetails.UOW_Templates, "T06_Course Information!D59", "T06_Course Information!H59", "Section 4 Field 3");
	
		validations.isElementDisplayed(Locators.TemplatelabelUOW.Section4Field2label, "Section 4 Field 2");
		
		// Validate the checkbox data and click
		validations.clickCheckBox(Locators.TemplatelabelUOW.Section4Field1Yes, Locators.TemplatelabelUOW.Section4Field1No, ConstantDetails.UOW_TestData, "T06_Course Information!D44", "Section 4 Field 1: Yes", "Section 4 Field 1: No");	

		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section4Field2label, ConstantDetails.UOW_Templates, "T06_Course Information!D53", "T06_Course Information!H53", "Section 4 Field 2");

		// Click on related record 
		validations.click(Locators.TemplatelabelUOW.Section4Field2RelatedClick, "Section 4 Field 2 Related record");
		
		
		// Validate the labels inside related records
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section4Field2_1label, ConstantDetails.UOW_Templates, "T06_Course Information!D54", "T06_Course Information!H54", "Section 4 Field 2 > 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section4Field2_2label, ConstantDetails.UOW_Templates, "T06_Course Information!D55", "T06_Course Information!H55", "Section 4 Field 2 > 2");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section4Field2_3label, ConstantDetails.UOW_Templates, "T06_Course Information!D56", "T06_Course Information!H56", "Section 4 Field 2 > 3");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section4Field2_4label, ConstantDetails.UOW_Templates, "T06_Course Information!D57", "T06_Course Information!H57", "Section 4 Field 2 > 4");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section4Field2_5label, ConstantDetails.UOW_Templates, "T06_Course Information!D58", "T06_Course Information!H58", "Section 4 Field 2 > 5");


		//Input the data in all the fields
		
		validations.selectFromSheets(Locators.TemplatelabelUOW.Section4Field2_1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B46", "Section 4 Field 2 > 1");
		
		// Validate the drop down data 
	    validations.validateSelectValues(Locators.TemplatelabelUOW.Section4Field2_1Data, ConstantDetails.UOW_TypeOfRequirement, "Sheet1!A2:A3", "Section 4 Field 2 > 1");
	
	    // enter the data
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section4Field2_2Data, ConstantDetails.UOW_TestData, "T06_Course Information!B47", "Section 4 Field 2 > 2");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section4Field2_3Data, ConstantDetails.UOW_TestData, "T06_Course Information!B48", "Section 4 Field 2 > 3");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section4Field2_4Data, ConstantDetails.UOW_TestData, "T06_Course Information!B49", "Section 4 Field 2 > 4");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section4Field2_5Data, ConstantDetails.UOW_TestData, "T06_Course Information!B50", "Section 4 Field 2 > 5");
		
		// Validate the checkbox data and click
		validations.clickCheckBox(Locators.TemplatelabelUOW.Section4Field3Yes, Locators.TemplatelabelUOW.Section4Field3No, ConstantDetails.UOW_TestData, "T06_Course Information!D51", "Section 4 Field 3: Yes", "Section 4 Field 3: No");	

		validations.longWait();
		// Save the section
		validations.click(Locators.TemplatelabelUOW.Section4Save, "Section 4 Save");
		validations.longWait();
	
		// Click on chevron
		validations.click(Locators.TemplatelabelUOW.Section4Field2Chev, "Section 4 Field 2 chevron");
		
		
		// Validate the saved data 
		
		validations.validateSavedData(Locators.TemplatelabelUOW.Section4Field1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C44", "Section 4 Field 1");

		validations.validateSavedData(Locators.TemplatelabelUOW.Section4Field2_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C46", "Section 4 Field 2 > 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section4Field2_2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C47", "Section 4 Field 2 > 2");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section4Field2_3DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C48", "Section 4 Field 2 > 3");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section4Field2_4DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C49", "Section 4 Field 2 > 4");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section4Field2_5DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C50", "Section 4 Field 2 > 5");
		
		validations.validateSavedData(Locators.TemplatelabelUOW.Section4Field3DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C51", "Section 4 Field 3");

		validations.longWait();
	
	
	
	}


}
