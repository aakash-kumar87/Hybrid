
package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;



public class CourseInfoSection8Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection() throws IOException, InterruptedException, AWTException, NullPointerException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for Section 8 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section8Heading, ConstantDetails.UOW_Templates, "T06_Course Information!D100", "Section 8 heading");
		
		 validations.shortWait();
		validations.linkBySheet(driver, ConstantDetails.UOW_Templates, "T06_Course Information!D100", "Section 8");
	//	 validations.scrollToView(Locators.TemplatelabelUOW.Section8Heading, "Section 8 Heading");
		 validations.longWait();
		 
		// Click on edit
		validations.click(Locators.TemplatelabelUOW.Section8Edit, "Section 8 Edit");
		validations.longWait();

		
		//Pass Locator, Google Sheet ID, sheet tab and cell range for name, sheet tab and cell range for mandatory column,  Locator name
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section8Field1label, ConstantDetails.UOW_Templates, "T06_Course Information!D101", "T06_Course Information!H101", "Section 8 Field 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section8Field2label, ConstantDetails.UOW_Templates, "T06_Course Information!D102", "T06_Course Information!H102", "Section 8 Field 2");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section8Field3label, ConstantDetails.UOW_Templates, "T06_Course Information!D107", "T06_Course Information!H107", "Section 8 Field 3");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section8Field4label, ConstantDetails.UOW_Templates, "T06_Course Information!D108", "T06_Course Information!H108", "Section 8 Field 4");

		// Click on related record 
		validations.click(Locators.TemplatelabelUOW.Section8Field2RelatedClick, "Section 8 Field 2 Related record");
		
		
		// Validate the labels inside related records
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section8Field2_1label, ConstantDetails.UOW_Templates, "T06_Course Information!D103", "T06_Course Information!H103", "Section 8 Field 2 > 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section8Field2_2label, ConstantDetails.UOW_Templates, "T06_Course Information!D104", "T06_Course Information!H104", "Section 8 Field 2 > 2");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section8Field2_3label, ConstantDetails.UOW_Templates, "T06_Course Information!D105", "T06_Course Information!H105", "Section 8 Field 2 > 3");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section8Field2_4label, ConstantDetails.UOW_Templates, "T06_Course Information!D106", "T06_Course Information!H106", "Section 8 Field 2 > 4");


		//Input the data in all the fields
	    // enter the data
		
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section8Field1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B67", "Section 8 Field 1");
	
		
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section8Field2_2Data, ConstantDetails.UOW_TestData, "T06_Course Information!B69", "Section 8 Field 2 > 2");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section8Field2_3Data, ConstantDetails.UOW_TestData, "T06_Course Information!B70", "Section 8 Field 2 > 3");
		validations.multiSelectClick(Locators.TemplatelabelUOW.Section8Field2_4Data, "Section 8 Field 2 > 3");
		
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section8Field3Data, ConstantDetails.UOW_TestData, "T06_Course Information!B72", "Section 8 Field 3");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section8Field4Data, ConstantDetails.UOW_TestData, "T06_Course Information!B73", "Section 8 Field 4");


		validations.longWait();
		// Save the section
		validations.click(Locators.TemplatelabelUOW.Section8Save, "Section 8 Save");
		validations.longWait();
	
		// Click on chevron
		validations.click(Locators.TemplatelabelUOW.Section8Field2Chev, "Section 8 Field 2 chevron");
		

		
		// Validate the saved data 
		
		validations.validateSavedData(Locators.TemplatelabelUOW.Section8Field1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C67", "Section 8 Field 1");

		validations.validateSavedData(Locators.TemplatelabelUOW.Section8Field2_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C68", "Section 8 Field 2 > 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section8Field2_2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C69", "Section 8 Field 2 > 2");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section8Field2_3DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C70", "Section 8 Field 2 > 3");
		validations.validateMultiSelectValues(Locators.TemplatelabelUOW.Section8Field2_4DataSaved, ConstantDetails.UOW_AQFKSA, "Sheet1!A2:A4", "Section 8 Field 2 > 3");
		
		validations.validateSavedData(Locators.TemplatelabelUOW.Section8Field3DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C72", "Section 8 Field 3");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section8Field4DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C73", "Section 8 Field 4");

		validations.longWait();
	
	
	
	}


}
