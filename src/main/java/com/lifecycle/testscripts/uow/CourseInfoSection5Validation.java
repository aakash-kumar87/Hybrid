
package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;



public class CourseInfoSection5Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection() throws IOException, InterruptedException, AWTException, NullPointerException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for Section 4 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section5Heading, ConstantDetails.UOW_Templates, "T06_Course Information!D60", "Section 5 heading");
		
		 validations.shortWait();
		 
		validations.linkBySheet(driver, ConstantDetails.UOW_Templates, "T06_Course Information!D60", "Section 5");
	//	 validations.scrollToView(Locators.TemplatelabelUOW.Section4Heading, "Section 4 Heading");
		validations.longWait();
		 
	
		 
		// Click on edit
		validations.click(Locators.TemplatelabelUOW.Section5Edit, "Section 5 Edit");
		validations.longWait();
		

		
		//Pass Locator, Google Sheet ID, sheet tab and cell range for name, sheet tab and cell range for mandatory column,  Locator name
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section5Field1label, ConstantDetails.UOW_Templates, "T06_Course Information!D61", "T06_Course Information!H61", "Section 5 Field 1");
	
		validations.isElementDisplayed(Locators.TemplatelabelUOW.Section5Field2label, "Section 5 Field 2");
		
		// Click on the multiselect checkboxes
        validations.multiSelectClick(Locators.TemplatelabelUOW.Section5Field1Data, "Section 5 Field 1");
        
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section5Field2label, ConstantDetails.UOW_Templates, "T06_Course Information!D62", "T06_Course Information!H62", "Section 5 Field 2");


		//Input the data in all the fields
		
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section5Field2Data, ConstantDetails.UOW_TestData, "T06_Course Information!B55", "Section 5 Field 2");
		

		validations.longWait();
		// Save the section
		validations.click(Locators.TemplatelabelUOW.Section5Save, "Section 5 Save");
		validations.longWait();

		// Validate the saved data 
		
		validations.validateMultiSelectValues(Locators.TemplatelabelUOW.Section5Field1DataSaved, ConstantDetails.UOW_Applications, "Sheet1!A2:A5", "Section 5 Field 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section5Field2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C55", "Section 5 Field 2");

		validations.shortWait();
	
	
	}


}
