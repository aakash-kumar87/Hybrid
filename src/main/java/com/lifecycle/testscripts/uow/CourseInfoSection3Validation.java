
package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;



public class CourseInfoSection3Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection() throws IOException, InterruptedException, AWTException, NullPointerException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for Section 3 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section3Heading, ConstantDetails.UOW_Templates, "T06_Course Information!D39", "Section 3 heading");
		
		 validations.shortWait();
		validations.linkBySheet(driver, ConstantDetails.UOW_Templates, "T06_Course Information!D39", "Section 3");
	//	 validations.scrollToView(Locators.TemplatelabelUOW.Section3Heading, "Section 3 Heading");
		 validations.longWait();
		 
		// Click on edit
		validations.click(Locators.TemplatelabelUOW.Section3Edit, "Section 3 Edit");
		validations.longWait();

		
		//Pass Locator, Google Sheet ID, sheet tab and cell range for name, sheet tab and cell range for mandatory column,  Locator name
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section3Field1label, ConstantDetails.UOW_Templates, "T06_Course Information!D40", "T06_Course Information!H40", "Section 3 Field 1");
		
		// Click on related record 
		validations.click(Locators.TemplatelabelUOW.Section3Field1RelatedClick, "Section 3 Field 1");
		
		
		// Validate the labels inside related records
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section3Field3_1label, ConstantDetails.UOW_Templates, "T06_Course Information!D41", "T06_Course Information!H41", "Section 3 Field 1 > 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section3Field3_2label, ConstantDetails.UOW_Templates, "T06_Course Information!D42", "T06_Course Information!H42", "Section 3 Field 1 > 2");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section3Field3_3label, ConstantDetails.UOW_Templates, "T06_Course Information!D43", "T06_Course Information!H43", "Section 3 Field 1 > 3");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section3Field3_4label, ConstantDetails.UOW_Templates, "T06_Course Information!D44", "T06_Course Information!H44", "Section 3 Field 1 > 4");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section3Field3_5label, ConstantDetails.UOW_Templates, "T06_Course Information!D45", "T06_Course Information!H45", "Section 3 Field 1 > 5");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section3Field3_6label, ConstantDetails.UOW_Templates, "T06_Course Information!D46", "T06_Course Information!H46", "Section 3 Field 1 > 6");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section3Field3_7label, ConstantDetails.UOW_Templates, "T06_Course Information!D47", "T06_Course Information!H47", "Section 3 Field 1 > 7");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section3Field3_8label, ConstantDetails.UOW_Templates, "T06_Course Information!D48", "T06_Course Information!H48", "Section 3 Field 1 > 8");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section3Field3_9label, ConstantDetails.UOW_Templates, "T06_Course Information!D49", "T06_Course Information!H49", "Section 3 Field 1 > 9");
		
		
		validations.longWait();
		
		//Input the data in all the fields
		
		validations.clickCheckBox(Locators.TemplatelabelUOW.Section3Field3_1Yes, Locators.TemplatelabelUOW.Section3Field3_1No, ConstantDetails.UOW_TestData, "T06_Course Information!D33", "Section 3 Field 1 > 1: Yes", "Section 3 Field 1 > 1: No");	
		
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section3Field3_2Data, ConstantDetails.UOW_TestData, "T06_Course Information!B34", "Section 3 Field 1 > 2");
		validations.click(Locators.TemplatelabelUOW.Section3Field3_2DataClick, "Section 3 Field 1 > 2");
		
		validations.selectFromSheets(Locators.TemplatelabelUOW.Section3Field3_3Data, ConstantDetails.UOW_TestData, "T06_Course Information!B35", "Section 3 Field 1 > 3");
		
		// Validate the drop down data 
	    validations.validateSelectValues(Locators.TemplatelabelUOW.Section3Field3_3Data, ConstantDetails.UOW_Intake, "Session!P2:P189", "Section 3 Field 1 > 3");
	
	    // enter the data
		validations.selectFromSheets(Locators.TemplatelabelUOW.Section3Field3_4Data, ConstantDetails.UOW_TestData, "T06_Course Information!B36", "Section 3 Field 1 > 4");
		
		// Validate the drop down data 
	    validations.validateSelectValues(Locators.TemplatelabelUOW.Section3Field3_4Data, ConstantDetails.UOW_DeliveryMode, "Sheet1!A2:A4", "Section 3 Field 1 > 4");
		
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section3Field3_5Data, ConstantDetails.UOW_TestData, "T06_Course Information!B37", "Section 3 Field 1 > 5");
		validations.multiSelectClick(Locators.TemplatelabelUOW.Section3Field3_7Data, "Section 3 Field 1 > 7");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section3Field3_8Data, ConstantDetails.UOW_TestData, "T06_Course Information!B40", "Section 3 Field 1 > 8");
		validations.isElementDisplayed(Locators.TemplatelabelUOW.Section3Field3_10label, "Section 3 Field 1 > 10");
	

		validations.selectFromSheets(Locators.TemplatelabelUOW.Section3Field3_9Data, ConstantDetails.UOW_TestData, "T06_Course Information!B41", "Section 3 Field 1 > 9");
		
		// Validate the drop down data 
	    validations.validateSelectValues(Locators.TemplatelabelUOW.Section3Field3_9Data, ConstantDetails.UOW_Rationale, "Sheet1!A2:A5", "Section 3 Field 1 > 9");
	    
	    
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section3Field3_10label, ConstantDetails.UOW_Templates, "T06_Course Information!D50", "T06_Course Information!H50", "Section 3 Field 1 > 10");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section3Field3_10Data, ConstantDetails.UOW_TestData, "T06_Course Information!B42", "Section 3 Field 1 > 10");

		
		
		
		validations.longWait();
		// Save the section
		validations.click(Locators.TemplatelabelUOW.Section3Save, "Section 3 Save");
		validations.longWait();
		
		// Click on chevron
		validations.click(Locators.TemplatelabelUOW.Section3Field1Chev, "Section 3 Field 1 chevron");
		
		
		// Validate the saved data 
		
		validations.validateSavedData(Locators.TemplatelabelUOW.Section3Field3_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C33", "Section 3 Field 1 > 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section3Field3_2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C34", "Section 3 Field 1 > 2");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section3Field3_3DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!B35", "Section 3 Field 1 > 3");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section3Field3_4DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!B36", "Section 3 Field 1 > 4");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section3Field3_5DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C37", "Section 3 Field 1 > 5");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section3Field3_6DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C38", "Section 3 Field 1 > 6");
		
		validations.validateMultiSelectValues(Locators.TemplatelabelUOW.Section3Field3_7DataSaved, ConstantDetails.UOW_StudentType, "Sheet1!A2:A3", "Section 3 Field 1 > 7");
		
		
		validations.validateSavedData(Locators.TemplatelabelUOW.Section3Field3_8DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!B40", "Section 3 Field 1 > 8");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section3Field3_9DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!B41", "Section 3 Field 1 > 9");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section3Field3_10DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!B42", "Section 3 Field 1 > 10");
		
		
		validations.longWait();
	
	
	
	}


}
