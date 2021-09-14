package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;



public class CourseInfoSection17Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection() throws IOException, InterruptedException, AWTException, NullPointerException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for Section 17 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section17Heading, ConstantDetails.UOW_Templates, "T06_Course Information!D166", "Section 17 heading");
		
		 validations.shortWait();
		validations.linkBySheet(driver, ConstantDetails.UOW_Templates, "T06_Course Information!D166", "Section 17");
		 validations.longWait();
		 
		// Click on edit
		validations.click(Locators.TemplatelabelUOW.Section17Edit, "Section 17 Edit");
		validations.longWait();

		
		//Validate the field labels
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section17Field1label, ConstantDetails.UOW_Templates, "T06_Course Information!D167", "T06_Course Information!H167", "Section 17 Field 1");
	
		
		// Click on related record 
		validations.click(Locators.TemplatelabelUOW.Section17Field1RelatedClick, "Section 17 Field 1 Related record");
		 validations.shortWait();

		// Validate the labels inside related records
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section17Field1_1label, ConstantDetails.UOW_Templates, "T06_Course Information!D168", "T06_Course Information!H168", "Section 17 Field 1 > 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section17Field1_2label, ConstantDetails.UOW_Templates, "T06_Course Information!D169", "T06_Course Information!H169", "Section 17 Field 1 > 2");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section17Field1_3label, ConstantDetails.UOW_Templates, "T06_Course Information!D170", "T06_Course Information!H170", "Section 17 Field 1 > 3");


		//Input the data in all the fields
	    // enter the data

		validations.selectFromSheets(Locators.TemplatelabelUOW.Section17Field1_1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B141", "Section 17 Field 1 > 1");
		validations.validateSelectValues(Locators.TemplatelabelUOW.Section17Field1_1Data, ConstantDetails.UOW_Type, "Sheet1!A2:A5", "Section 17 Field 1 > 1");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section17Field1_2Data, ConstantDetails.UOW_TestData, "T06_Course Information!B142", "Section 17 Field 1 > 2");
		validations.longWait();
		validations.click(Locators.TemplatelabelUOW.Section17Field1_2DataClick, "Section 17 Field 1 > 2");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section17Field1_3Data, ConstantDetails.UOW_TestData, "T06_Course Information!B143", "Section 17 Field 1 > 3");
	
		validations.longWait();
		// Save the section
		validations.click(Locators.TemplatelabelUOW.Section17Save, "Section 17 Save");
		validations.longWait();
	
		// Click on chevron
		validations.click(Locators.TemplatelabelUOW.Section17Field1Chev, "Section 17 Field 1 chevron");
		validations.shortWait();
	
		// Validate the saved data 
		validations.validateSavedData(Locators.TemplatelabelUOW.Section17Field1_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C141", "Section 17 Field 1 > 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section17Field1_2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C142", "Section 17 Field 1 > 2");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section17Field1_3DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C143", "Section 17 Field 1 > 3");

		validations.longWait();
	
	
	
	}


}
