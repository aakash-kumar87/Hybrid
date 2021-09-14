package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;



public class CourseInfoSection14Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection() throws IOException, InterruptedException, AWTException, NullPointerException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for Section 14 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section14Heading, ConstantDetails.UOW_Templates, "T06_Course Information!D133", "Section 14 heading");
		
		 validations.shortWait();
		validations.linkBySheet(driver, ConstantDetails.UOW_Templates, "T06_Course Information!D133", "Section 14");
		 validations.longWait();
		 
		// Click on edit
		validations.click(Locators.TemplatelabelUOW.Section14Edit, "Section 14 Edit");
		validations.longWait();

		
		//Pass Locator, Google Sheet ID, sheet tab and cell range for name, sheet tab and cell range for mandatory column,  Locator name
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section14Field1label, ConstantDetails.UOW_Templates, "T06_Course Information!D134", "T06_Course Information!H134", "Section 14 Field 1");
		validations.clickCheckBox(Locators.TemplatelabelUOW.Section14Field1Yes, Locators.TemplatelabelUOW.Section14Field1No, ConstantDetails.UOW_TestData, "T06_Course Information!D106", "Section 14 Field 1 : Yes", "Section 14 Field 1 : No");

		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section14Field2label, ConstantDetails.UOW_Templates, "T06_Course Information!D135", "T06_Course Information!H135", "Section 14 Field 2");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section14Field3label, ConstantDetails.UOW_Templates, "T06_Course Information!D138", "T06_Course Information!H138", "Section 14 Field 3");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section14Field4label, ConstantDetails.UOW_Templates, "T06_Course Information!D145", "T06_Course Information!H145", "Section 14 Field 4");

		
		// Click on related record 
		validations.click(Locators.TemplatelabelUOW.Section14Field2RelatedClick, "Section 14 Field 2 Related record");
		validations.click(Locators.TemplatelabelUOW.Section14Field3RelatedClick, "Section 14 Field 3 Related record");
		validations.click(Locators.TemplatelabelUOW.Section14Field4RelatedClick, "Section 14 Field 4 Related record");
		 validations.shortWait();

		
		// Validate the labels inside related records
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section14Field2_1label, ConstantDetails.UOW_Templates, "T06_Course Information!D136", "T06_Course Information!H136", "Section 14 Field 2 > 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section14Field2_2label, ConstantDetails.UOW_Templates, "T06_Course Information!D137", "T06_Course Information!H137", "Section 14 Field 2 > 2");

		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section14Field3_1Label, ConstantDetails.UOW_Templates, "T06_Course Information!D139", "T06_Course Information!H139", "Section 14 Field 3 > 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section14Field3_2Label, ConstantDetails.UOW_Templates, "T06_Course Information!D140", "T06_Course Information!H140", "Section 14 Field 3 > 2");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section14Field3_3Label, ConstantDetails.UOW_Templates, "T06_Course Information!D141", "T06_Course Information!H141", "Section 14 Field 3 > 3");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section14Field3_4Label, ConstantDetails.UOW_Templates, "T06_Course Information!D142", "T06_Course Information!H142", "Section 14 Field 3 > 4");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section14Field3_5Label, ConstantDetails.UOW_Templates, "T06_Course Information!D143", "T06_Course Information!H143", "Section 14 Field 3 > 5");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section14Field3_6Label, ConstantDetails.UOW_Templates, "T06_Course Information!D144", "T06_Course Information!H144", "Section 14 Field 3 > 6");

		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section14Field4_1Label, ConstantDetails.UOW_Templates, "T06_Course Information!D146", "T06_Course Information!H146", "Section 14 Field 4 > 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section14Field4_2Label, ConstantDetails.UOW_Templates, "T06_Course Information!D147", "T06_Course Information!H147", "Section 14 Field 4 > 2");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section14Field4_3Label, ConstantDetails.UOW_Templates, "T06_Course Information!D148", "T06_Course Information!H148", "Section 14 Field 4 > 3");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section14Field4_4Label, ConstantDetails.UOW_Templates, "T06_Course Information!D149", "T06_Course Information!H149", "Section 14 Field 4 > 4");


		//Input the data in all the fields
	    // enter the data
		validations.shortWait();
		validations.shortWait();
		
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section14Field2_1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B108", "Section 14 Field 2 > 1");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section14Field2_2Data, ConstantDetails.UOW_TestData, "T06_Course Information!B109", "Section 14 Field 2 > 2");

		validations.enterFromSheets(Locators.TemplatelabelUOW.Section14Field3_1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B111", "Section 14 Field 3 > 1");
		validations.multiSelectClick(Locators.TemplatelabelUOW.Section14Field3_2Data, "Section 14 Field 3 > 2"); 
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section14Field3_3Data, ConstantDetails.UOW_TestData, "T06_Course Information!B113", "Section 14 Field 3 > 3");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section14Field3_4Data, ConstantDetails.UOW_TestData, "T06_Course Information!B114", "Section 14 Field 3 > 4");
		validations.clickCheckBox(Locators.TemplatelabelUOW.Section14Field3_5Yes, Locators.TemplatelabelUOW.Section14Field3_5No, ConstantDetails.UOW_TestData, "T06_Course Information!D115", "Section 14 Field 3 > 5 : Yes", "Section 14 Field 3 > 5: No");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section14Field3_6Data, ConstantDetails.UOW_TestData, "T06_Course Information!B116", "Section 14 Field 3 > 6");

		validations.enterFromSheets(Locators.TemplatelabelUOW.Section14Field4_1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B118", "Section 14 Field 4 > 1");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section14Field4_2Data, ConstantDetails.UOW_TestData, "T06_Course Information!B119", "Section 14 Field 4 > 2");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section14Field4_3Data, ConstantDetails.UOW_TestData, "T06_Course Information!B120", "Section 14 Field 4 > 3");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section14Field4_4Data, ConstantDetails.UOW_TestData, "T06_Course Information!B121", "Section 14 Field 4 > 4");


		validations.longWait();
		// Save the section
		validations.click(Locators.TemplatelabelUOW.Section14Save, "Section 14 Save");
		validations.longWait();
	
		// Click on chevron
		validations.click(Locators.TemplatelabelUOW.Section14Field2Chev, "Section 14 Field 2 chevron");
		validations.click(Locators.TemplatelabelUOW.Section14Field3Chev, "Section 14 Field 3 chevron");
		validations.click(Locators.TemplatelabelUOW.Section14Field4Chev, "Section 14 Field 4 chevron");
		 validations.shortWait();
		 
		// Validate the saved data 
		validations.validateSavedData(Locators.TemplatelabelUOW.Section14Field1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C106", "Section 14 Field 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section14Field2_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C108", "Section 14 Field 2 > 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section14Field2_2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C109", "Section 14 Field 2 > 2");
		
		validations.validateSavedData(Locators.TemplatelabelUOW.Section14Field3_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C111", "Section 14 Field 3 > 1");
		validations.validateMultiSelectValues(Locators.TemplatelabelUOW.Section14Field3_2DataSaved, ConstantDetails.UOW_ArrangementType, "Sheet1!A2:A4", "Section 14 Field 3 > 2");  
		validations.validateSavedData(Locators.TemplatelabelUOW.Section14Field3_3DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C113", "Section 14 Field 3 > 3");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section14Field3_4DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C114", "Section 14 Field 3 > 4");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section14Field3_5DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C115", "Section 14 Field 3 > 5");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section14Field3_6DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C116", "Section 14 Field 3 > 6");
		
		validations.validateSavedData(Locators.TemplatelabelUOW.Section14Field4_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C118", "Section 14 Field 4 > 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section14Field4_2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C119", "Section 14 Field 4 > 2");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section14Field4_3DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C120", "Section 14 Field 4 > 3");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section14Field4_4DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C121", "Section 14 Field 4 > 4");
	
		validations.longWait();
	
	
	
	}


}
