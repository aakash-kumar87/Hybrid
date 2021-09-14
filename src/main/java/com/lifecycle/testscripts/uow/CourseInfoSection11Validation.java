
package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;

/**
 * @author Rishu
 */

public class CourseInfoSection11Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection() throws IOException, InterruptedException, AWTException, NullPointerException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for Section 11 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name(i.e, text for logs)
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section11Heading, ConstantDetails.UOW_Templates, "T06_Course Information!D118", "Section 11 Heading");
		validations.shortWait(); //this is to be used as the system is slow
		
		//Just to scroll down to the desired section
		validations.linkBySheet(driver, ConstantDetails.UOW_Templates, "T06_Course Information!D118", "Section 11");
		validations.longWait();
		
		//Click on edit button for section 11
		//Pass Locator and Locator name(i.e, text for logs)
		validations.click(Locators.TemplatelabelUOW.Section11Edit, "Section 11 Edit"); 
		validations.longWait();
		
		//Validate field labels in the section and verify mandatory * for fields together using this method
		//Pass Locator, Google Sheet ID, sheet tab and cell range for name, sheet tab and cell range for mandatory column,  Locator name
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section11Field1label, ConstantDetails.UOW_Templates, "T06_Course Information!D119", "T06_Course Information!H119", "Section 11 Field 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section11Field2label, ConstantDetails.UOW_Templates, "T06_Course Information!D120", "T06_Course Information!H120", "Section 11 Field 2");

		//Input test data in all the fields from the test sheet	
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section11Field1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B85", "Section 11 Field 1 Input");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section11Field2Data, ConstantDetails.UOW_TestData, "T06_Course Information!B86", "Section 11 Field 2 Input");
		validations.longWait();
		
		//Save the section
		validations.click(Locators.TemplatelabelUOW.Section11Save, "Section 11 Save");
		validations.longWait();

		//Validate the saved data 
		validations.validateSavedData(Locators.TemplatelabelUOW.Section11Field1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C85", "Section 11 Field 1 Saved data");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section11Field2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C86", "Section 11 Field 2 Saved data");
		validations.longWait();
	
	}

}
