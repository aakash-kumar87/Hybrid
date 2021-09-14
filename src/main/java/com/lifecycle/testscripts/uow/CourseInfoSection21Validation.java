
package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;



public class CourseInfoSection21Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection() throws IOException, InterruptedException, AWTException, NullPointerException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for Section 21 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section21Heading, ConstantDetails.UOW_Templates, "T06_Course Information!D189", "Section 21 heading");
		
		 validations.shortWait();
		validations.linkBySheet(driver, ConstantDetails.UOW_Templates, "T06_Course Information!D189", "Section 21");
		 validations.longWait();
		 
		// Click on edit
		validations.click(Locators.TemplatelabelUOW.Section21Edit, "Section 21 Edit");
		validations.longWait();

		
		//Validate the field labels
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section21Field1label, ConstantDetails.UOW_Templates, "T06_Course Information!D190", "T06_Course Information!H190", "Section 21 Field 1");

		// Click on related record 
		validations.click(Locators.TemplatelabelUOW.Section21Field1RelatedClick, "Section 21 Field 1 Related record");
		validations.shortWait();

		// Validate the labels inside related records
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section21Field1_1label, ConstantDetails.UOW_Templates, "T06_Course Information!D191", "T06_Course Information!H191", "Section 21 Field 1 > 1");


		//Input the data in all the fields
	    // enter the data

		validations.enterFromSheets(Locators.TemplatelabelUOW.Section21Field1_1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B170", "Section 21 Field 1 > 1");
		validations.longWait();
		

		// Save the section
		validations.click(Locators.TemplatelabelUOW.Section21Save, "Section 21 Save");
		validations.longWait();
	
		// Click on chevron
		validations.click(Locators.TemplatelabelUOW.Section21Field1Chev, "Section 21 Field 1 chevron");
		validations.shortWait();
		
		
		// Validate the saved data 
		validations.validateSavedData(Locators.TemplatelabelUOW.Section21Field1_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C170", "Section 21 Field 1 > 1");

		validations.longWait();
	
	
	
	}


}
