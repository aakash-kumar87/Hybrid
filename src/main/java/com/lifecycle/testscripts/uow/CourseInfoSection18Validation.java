
package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;



public class CourseInfoSection18Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection() throws IOException, InterruptedException, AWTException, NullPointerException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for Section 18 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section18Heading, ConstantDetails.UOW_Templates, "T06_Course Information!D171", "Section 18 heading");
		
		 validations.shortWait();
		validations.linkBySheet(driver, ConstantDetails.UOW_Templates, "T06_Course Information!D171", "Section 18");
		 validations.longWait();
		 
		// Click on edit
		validations.click(Locators.TemplatelabelUOW.Section18Edit, "Section 18 Edit");
		validations.longWait();

		
		//Validate the field labels
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section18Field1label, ConstantDetails.UOW_Templates, "T06_Course Information!D172", "T06_Course Information!H172", "Section 18 Field 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section18Field2label, ConstantDetails.UOW_Templates, "T06_Course Information!D173", "T06_Course Information!H173", "Section 18 Field 2");


		//Input the data in all the fields
	    // enter the data

		validations.selectFromSheets(Locators.TemplatelabelUOW.Section18Field1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B146", "Section 18 Field 1");
		validations.validateSelectValues(Locators.TemplatelabelUOW.Section18Field1Data, ConstantDetails.UOW_SISPApproval, "Sheet1!A2:A4", "Section 18 Field 1");
		validations.multiSelectClick(Locators.TemplatelabelUOW.Section18Field2Data, "Section 18 Field 2");
		
		
		validations.longWait();
		// Save the section
		validations.click(Locators.TemplatelabelUOW.Section18Save, "Section 18 Save");
		validations.longWait();
	
		// Validate the saved data 
		validations.validateSavedData(Locators.TemplatelabelUOW.Section18Field1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C146", "Section 18 Field 1");
		validations.validateMultiSelectValues(Locators.TemplatelabelUOW.Section18Field2DataSaved, ConstantDetails.UOW_MastersByCourse, "Sheet1!A2:A4", "Section 18 Field 2");
	
		validations.longWait();
	
	
	
	}


}
