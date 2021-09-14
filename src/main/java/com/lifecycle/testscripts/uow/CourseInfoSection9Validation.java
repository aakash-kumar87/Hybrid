
package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;



public class CourseInfoSection9Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection() throws IOException, InterruptedException, AWTException, NullPointerException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for Section 9 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section9Heading, ConstantDetails.UOW_Templates, "T06_Course Information!D109", "Section 9 heading");
		
		 validations.shortWait();
		validations.linkBySheet(driver, ConstantDetails.UOW_Templates, "T06_Course Information!D109", "Section 9");
		 validations.longWait();
		 
		// Click on edit
		validations.click(Locators.TemplatelabelUOW.Section9Edit, "Section 9 Edit");
		validations.longWait();

		
		//Pass Locator, Google Sheet ID, sheet tab and cell range for name, sheet tab and cell range for mandatory column,  Locator name
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section9Field1label, ConstantDetails.UOW_Templates, "T06_Course Information!D110", "T06_Course Information!H110", "Section 9 Field 1");

		//Input the data in all the fields
	    // enter the data
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section9Field1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B76", "Section 9 Field 1");
		
		validations.longWait();
		
		// Save the section
		validations.click(Locators.TemplatelabelUOW.Section9Save, "Section 9 Save");
		validations.longWait();
	
		
		// Validate the saved data 
		
		validations.validateSavedData(Locators.TemplatelabelUOW.Section9Field1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C76", "Section 9 Field 1");

		validations.longWait();
	
	
	
	}


}
