
package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.accelarators.Utilities;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;



public class CourseInfoSection12Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection1() throws IOException, InterruptedException, AWTException, NullPointerException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for Section 12 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section12Heading, ConstantDetails.UOW_Templates, "T06_Course Information!D121", "Section 12 heading");
		
		 validations.shortWait();
		validations.linkBySheet(driver, ConstantDetails.UOW_Templates, "T06_Course Information!D121", "Section 12");
		 validations.longWait();
		 
		// Click on edit
		validations.click(Locators.TemplatelabelUOW.Section12Edit, "Section 12 Edit");
		validations.longWait();

		
		//Pass Locator, Google Sheet ID, sheet tab and cell range for name, sheet tab and cell range for mandatory column,  Locator name
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section12Field1label, ConstantDetails.UOW_Templates, "T06_Course Information!D122", "T06_Course Information!H122", "Section 12 Field 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section12Field2label, ConstantDetails.UOW_Templates, "T06_Course Information!D123", "T06_Course Information!H123", "Section 12 Field 2");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section12Field3label, ConstantDetails.UOW_Templates, "T06_Course Information!D124", "T06_Course Information!H124", "Section 12 Field 3");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section12Field4label, ConstantDetails.UOW_Templates, "T06_Course Information!D127", "T06_Course Information!H127", "Section 12 Field 4");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section12Field5label, ConstantDetails.UOW_Templates, "T06_Course Information!D128", "T06_Course Information!H128", "Section 12 Field 5");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section12Field6label, ConstantDetails.UOW_Templates, "T06_Course Information!D129", "T06_Course Information!H129", "Section 12 Field 6");

		
		// Click on related record 
		validations.click(Locators.TemplatelabelUOW.Section12Field3RelatedClick, "Section 12 Field 3 Related record");	
		
		// Validate the labels inside related records
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section12Field3_1label, ConstantDetails.UOW_Templates, "T06_Course Information!D125", "T06_Course Information!H125", "Section 12 Field 3 > 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section12Field3_2label, ConstantDetails.UOW_Templates, "T06_Course Information!D126", "T06_Course Information!H126", "Section 12 Field 3 > 2");


		//Input the data in all the fields
	    // enter the data
		
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section12Field1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B93", "Section 12 Field 1");
		validations.shortWait();
		validations.click(Locators.TemplatelabelUOW.Section12Field1DataClick, "Section 12 Field 1 Data");
		
		validations.validatedatePicker(Locators.TemplatelabelUOW.Section12Field2DateClick, Locators.TemplatelabelUOW.Section12Field2DateSelect, "Section 12 Field 2");
		validations.selectFromSheets(Locators.TemplatelabelUOW.Section12Field3_1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B95", "Section 12 Field 3 > 1");
		validations.validateSelectValues(Locators.TemplatelabelUOW.Section12Field3_1Data, ConstantDetails.UOW_TransformtaionPractice, "Sheet1!A2:A7", "Section 12 Field 3 > 1");
	
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section12Field3_2Data, ConstantDetails.UOW_TestData, "T06_Course Information!B96", "Section 12 Field 3 > 2");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section12Field4Data, ConstantDetails.UOW_TestData, "T06_Course Information!B97", "Section 12 Field 4");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section12Field5Data, ConstantDetails.UOW_TestData, "T06_Course Information!B98", "Section 12 Field 5");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section12Field6Data, ConstantDetails.UOW_TestData, "T06_Course Information!B99", "Section 12 Field 6");

		

		validations.longWait();
		// Save the section
		validations.click(Locators.TemplatelabelUOW.Section12Save, "Section 12 Save");
		validations.longWait();
	
		// Click on chevron
		validations.click(Locators.TemplatelabelUOW.Section12Field3Chev, "Section 12 Field 3 chevron");

		//This method will return the current date in the specified format
		String currentDate = Utilities.currentDate();
		
		
		// Validate the saved data 
		validations.validateSavedData(Locators.TemplatelabelUOW.Section12Field1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C93", "Section 12 Field 1");
		
		// Validate the Data saved
		// Pass the locator, data in string, Locator name
		validations.validateData(Locators.TemplatelabelUOW.Section12Field2DataSaved, currentDate, "Section 12 Field 2");
		
		validations.validateSavedData(Locators.TemplatelabelUOW.Section12Field3_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C95", "Section 12 Field 3 > 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section12Field3_2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C96", "Section 12 Field 3 > 2");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section12Field4DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C97", "Section 12 Field 4");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section12Field5DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C98", "Section 12 Field 5");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section12Field6DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C99", "Section 12 Field 6");

		validations.longWait();
	
	
	
	}


}
