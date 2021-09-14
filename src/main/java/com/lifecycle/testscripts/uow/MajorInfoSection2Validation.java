

package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.accelarators.Utilities;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;



public class MajorInfoSection2Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection() throws IOException, InterruptedException, AWTException, NullPointerException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for section 2 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name
		validations.validateLabelPerCell(Locators.MajorTemplatelabelUOW.Section2Heading, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D9", "Section 2 heading");
		
		//Pass Locator, Google Sheet ID, sheet tab and cell range for name, sheet tab and cell range for mandatory column,  Locator name
		validations.validateLabelSheetsMandate(Locators.MajorTemplatelabelUOW.Section2Field1label, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D10", "T07_Major Study Specialisation Info!H10", "Section 2 Field 1");
		validations.validateLabelSheetsMandate(Locators.MajorTemplatelabelUOW.Section2Field2label, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D11", "T07_Major Study Specialisation Info!H11", "Section 2 Field 2");
	
		
		validations.validateLabelSheetsMandate(Locators.MajorTemplatelabelUOW.Section2Field3label, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D12", "T07_Major Study Specialisation Info!H12", "Section 2 Field 3");
		validations.validateLabelSheetsMandate(Locators.MajorTemplatelabelUOW.Section2Field4label, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D14", "T07_Major Study Specialisation Info!H14", "Section 2 Field 4");
		validations.validateLabelSheetsMandate(Locators.MajorTemplatelabelUOW.Section2Field5label, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D15", "T07_Major Study Specialisation Info!H15", "Section 2 Field 5");
		validations.validateLabelSheetsMandate(Locators.MajorTemplatelabelUOW.Section2Field6label, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D16", "T07_Major Study Specialisation Info!H16", "Section 2 Field 6");
		validations.validateLabelSheetsMandate(Locators.MajorTemplatelabelUOW.Section2Field7label, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D17", "T07_Major Study Specialisation Info!H17", "Section 2 Field 7");
		validations.validateLabelSheetsMandate(Locators.MajorTemplatelabelUOW.Section2Field8label, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D18", "T07_Major Study Specialisation Info!H18", "Section 2 Field 8");
		validations.validateLabelSheetsMandate(Locators.MajorTemplatelabelUOW.Section2Field9label, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D22", "T07_Major Study Specialisation Info!H22", "Section 2 Field 9");
		validations.validateLabelSheetsMandate(Locators.MajorTemplatelabelUOW.Section2Field10label, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D28", "T07_Major Study Specialisation Info!H28", "Section 2 Field 10");
		validations.validateLabelSheetsMandate(Locators.MajorTemplatelabelUOW.Section2Field11label, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D29", "T07_Major Study Specialisation Info!H29", "Section 2 Field 11");
		
		
		// Click on edit
		validations.click(Locators.MajorTemplatelabelUOW.Section2Edit, "Section 2 Edit");
		validations.longWait();
	
		//Input the data in all the fields
		
		
		validations.enterFromSheets(Locators.MajorTemplatelabelUOW.Section2Field1Data, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!B3", "Section 2 Field 1");
		validations.enterFromSheets(Locators.MajorTemplatelabelUOW.Section2Field2Data, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!B4", "Section 2 Field 2");
		validations.selectFromSheets(Locators.MajorTemplatelabelUOW.Section2Field4Data, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!B6", "Section 2 Field 4");
		validations.selectFromSheets(Locators.MajorTemplatelabelUOW.Section2Field5Data, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!B7", "Section 2 Field 5");
		validations.enterFromSheets(Locators.MajorTemplatelabelUOW.Section2Field7Data, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!B9", "Section 2 Field 7");
		

		validations.longWait();
			
		
		// Click the related records, validate the label for fields within and enter data for Field 8
		
		validations.click(Locators.MajorTemplatelabelUOW.Section2Field8RelatedClick, "Section 2 Field 8");
		validations.validateLabelSheetsMandate(Locators.MajorTemplatelabelUOW.Section2Field8_1label, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D19", "T07_Major Study Specialisation Info!H19", "Section 2 Field 8 > 1");
		validations.enterFromSheets(Locators.MajorTemplatelabelUOW.Section2Field8_1Data, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!B11", "Section 2 Field 8 > 1");
		
		validations.validateLabelSheetsMandate(Locators.MajorTemplatelabelUOW.Section2Field8_2label, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D20", "T07_Major Study Specialisation Info!H20", "Section 2 Field 8 > 2");
        validations.isElementDisplayed(Locators.MajorTemplatelabelUOW.Section2Field8_3label, "Section 2 Field 8 > 3");
		validations.clickCheckBox(Locators.MajorTemplatelabelUOW.Section2Field8_2Yes, Locators.MajorTemplatelabelUOW.Section2Field8_2No, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!D12", "Section 2 Field 8 > 2: Yes", "Section 2 Field 8 > 2: No");	
		validations.validateLabelSheetsMandate(Locators.MajorTemplatelabelUOW.Section2Field8_3label, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D21", "T07_Major Study Specialisation Info!H21", "Section 2 Field 8 > 3");
		validations.validateAttribute(Locators.MajorTemplatelabelUOW.Section2Field8_3Data, "placeholder", ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!E13", "Section 2 Field 8 > 3 ");
		
		
		// Click the related records, validate the label for fields within and enter data for Field 9
		validations.longWait();
		validations.click(Locators.MajorTemplatelabelUOW.Section2Field9RelatedClick, "Section 2 Field 9");
		validations.validateLabelSheetsMandate(Locators.MajorTemplatelabelUOW.Section2Field9_1label, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D23", "T07_Major Study Specialisation Info!H23", "Section 2 Field 9 > 1");
		validations.validateAttribute(Locators.MajorTemplatelabelUOW.Section2Field9_1Data,"placeholder", ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!E15", "Section 2 Field 9 > 1");
		validations.enterFromSheets(Locators.MajorTemplatelabelUOW.Section2Field9_1Data, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!B15", "Section 2 Field 9 > 1");
		validations.shortWait();
		validations.click(Locators.MajorTemplatelabelUOW.Section2Field9_1DataSelect, "Section 2 Field 9 > 1");

		validations.validateLabelSheetsMandate(Locators.MajorTemplatelabelUOW.Section2Field9_2label, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D24", "T07_Major Study Specialisation Info!H24", "Section 2 Field 9 > 2");
		validations.validateLabelSheetsMandate(Locators.MajorTemplatelabelUOW.Section2Field9_3label, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D25", "T07_Major Study Specialisation Info!H25", "Section 2 Field 9 > 3");
		
	
		validations.longWait();
		
		//validations.isElementDisplayed(Locators.MajorTemplatelabelUOW.Section2Field9_4label, "Section 2 Field 9 > 4");
		validations.clickCheckBox(Locators.MajorTemplatelabelUOW.Section2Field9_3Yes, Locators.MajorTemplatelabelUOW.Section2Field9_3No, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!D17", "Section 2 Field 9 > 3: Yes", "Section 2 Field 9 > 3: No");
		validations.validateLabelSheetsMandate(Locators.MajorTemplatelabelUOW.Section2Field9_4label, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D26", "T07_Major Study Specialisation Info!H26", "Section 2 Field 9 > 4");
		validations.validateAttribute(Locators.MajorTemplatelabelUOW.Section2Field9_4Data, "placeholder", ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!E18", "Section 2 Field 9 > 4");
		validations.validateLabelSheetsMandate(Locators.MajorTemplatelabelUOW.Section2Field9_5label, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D27", "T07_Major Study Specialisation Info!H27", "Section 2 Field 9 > 5");
		validations.clickCheckBox(Locators.MajorTemplatelabelUOW.Section2Field9_5Yes, Locators.MajorTemplatelabelUOW.Section2Field9_5No, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!D19", "Section 2 Field 9 > 5: Yes", "Section 2 Field 9 > 5: No");
		
		validations.enterFromSheets(Locators.MajorTemplatelabelUOW.Section2Field10Data, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!B20", "Section 2 Field 10");
		
		
		// Click the related records, validate the label for fields within and enter data for Field 11
		
		validations.click(Locators.MajorTemplatelabelUOW.Section2Field11RelatedClick, "Section 2 Field 11");
		validations.validateLabelSheetsMandate(Locators.MajorTemplatelabelUOW.Section2Field11_1label, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D30", "T07_Major Study Specialisation Info!H30", "Section 2 Field 11 > 1");
		validations.validateLabelSheetsMandate(Locators.MajorTemplatelabelUOW.Section2Field11_2label, ConstantDetails.UOW_Templates, "T07_Major Study Specialisation Info!D31", "T07_Major Study Specialisation Info!H31", "Section 2 Field 11 > 2");
		validations.selectFromSheets(Locators.MajorTemplatelabelUOW.Section2Field11_1Data, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!B22", "Section 2 Field 11 > 1");
		validations.validateSelectValues(Locators.MajorTemplatelabelUOW.Section2Field11_1Data, ConstantDetails.UOW_ComparabaleAcademicItems, "Sheet1!A2:A6", "Section 2 Field 11 > 1");
        validations.enterFromSheets(Locators.MajorTemplatelabelUOW.Section2Field11_2Data, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!B23", "Section 2 Field 11 > 2");
        validations.click(Locators.MajorTemplatelabelUOW.Section2Field11_2DataClick, "Section 2 Field 11 > 2");
		
		
		
		validations.longWait();
		// Save the section
		validations.click(Locators.MajorTemplatelabelUOW.Section2Save, "Section 2 Save");
		validations.longWait();
		
		
		// Validate the saved data 
		validations.validateSavedData(Locators.MajorTemplatelabelUOW.Section2Field1DataSaved, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!C3", "Section 2 Field 1");
		validations.validateSavedData(Locators.MajorTemplatelabelUOW.Section2Field2DataSaved, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!C4", "Section 2 Field 2");
		validations.validateData(Locators.MajorTemplatelabelUOW.Section2Field3DataSaved, ConstantDetails.MajorTitle, "Section 2 Field 3");
		validations.validateSavedData(Locators.MajorTemplatelabelUOW.Section2Field4DataSaved, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!C6", "Section 2 Field 4");
		validations.validateSavedData(Locators.MajorTemplatelabelUOW.Section2Field5DataSaved, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!C7", "Section 2 Field 5");
		validations.validateData(Locators.MajorTemplatelabelUOW.Section2Field6DataSaved, "Postgraduate", "Section 2 Field 6"); 
		validations.validateSavedData(Locators.MajorTemplatelabelUOW.Section2Field7DataSaved, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!C9", "Section 2 Field 7");

		

		
		
		validations.shortWait();
	
		validations.click(Locators.MajorTemplatelabelUOW.Section2Field8Chev, "Section 2 Field 8 chevron");
		validations.validateSavedData(Locators.MajorTemplatelabelUOW.Section2Field8_1DataSaved, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!C11", "Section 2 Field 8 > 1");
		validations.validateSavedData(Locators.MajorTemplatelabelUOW.Section2Field8_2DataSaved, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!C12", "Section 2 Field 8 > 2");

		validations.click(Locators.MajorTemplatelabelUOW.Section2Field9Chev, "Section 2 Field 9 chevron");
		validations.validateSavedData(Locators.MajorTemplatelabelUOW.Section2Field9_1DataSaved, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!C15", "Section 2 Field 9 > 1");
		validations.validateSavedData(Locators.MajorTemplatelabelUOW.Section2Field9_2DataSaved, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!C16", "Section 2 Field 9 > 2");
		validations.validateSavedData(Locators.MajorTemplatelabelUOW.Section2Field9_3DataSaved, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!C17", "Section 2 Field 9 > 3");
		validations.validateSavedData(Locators.MajorTemplatelabelUOW.Section2Field9_5DataSaved, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!C19", "Section 2 Field 9 > 5");
		
		validations.validateSavedData(Locators.MajorTemplatelabelUOW.Section2Field10DataSaved, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!C20", "Section 2 Field 10");
		
		validations.click(Locators.MajorTemplatelabelUOW.Section2Field11Chev, "Section 2 Field 11 chevron");
		validations.validateSavedData(Locators.MajorTemplatelabelUOW.Section2Field11_1DataSaved, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!C22", "Section 2 Field 11 > 1");
		validations.validateSavedData(Locators.MajorTemplatelabelUOW.Section2Field11_2DataSaved, ConstantDetails.UOW_TestData, "T07_Major Study Specialisation Info!C23", "Section 2 Field 11 > 2");
		validations.longWait();
	}


}
