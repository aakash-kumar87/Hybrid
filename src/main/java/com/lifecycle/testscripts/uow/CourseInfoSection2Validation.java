
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



public class CourseInfoSection2Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection() throws IOException, InterruptedException, AWTException, NullPointerException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for section 2 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section2Heading, ConstantDetails.UOW_Templates, "T06_Course Information!D9", "Section 2 heading");
		
		//Pass Locator, Google Sheet ID, sheet tab and cell range for name, sheet tab and cell range for mandatory column,  Locator name
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field1label, ConstantDetails.UOW_Templates, "T06_Course Information!D10", "T06_Course Information!H10", "Section 2 Field 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field2label, ConstantDetails.UOW_Templates, "T06_Course Information!D11", "T06_Course Information!H11", "Section 2 Field 2");
	
		
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field3label, ConstantDetails.UOW_Templates, "T06_Course Information!D12", "T06_Course Information!H12", "Section 2 Field 3");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field4label, ConstantDetails.UOW_Templates, "T06_Course Information!D13", "T06_Course Information!H13", "Section 2 Field 4");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field5label, ConstantDetails.UOW_Templates, "T06_Course Information!D14", "T06_Course Information!H14", "Section 2 Field 5");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field6label, ConstantDetails.UOW_Templates, "T06_Course Information!D15", "T06_Course Information!H15", "Section 2 Field 6");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field7label, ConstantDetails.UOW_Templates, "T06_Course Information!D16", "T06_Course Information!H16", "Section 2 Field 7");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field8label, ConstantDetails.UOW_Templates, "T06_Course Information!D17", "T06_Course Information!H17", "Section 2 Field 8");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field9label, ConstantDetails.UOW_Templates, "T06_Course Information!D18", "T06_Course Information!H18", "Section 2 Field 9");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field10label, ConstantDetails.UOW_Templates, "T06_Course Information!D19", "T06_Course Information!H19", "Section 2 Field 10");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field11label, ConstantDetails.UOW_Templates, "T06_Course Information!D20", "T06_Course Information!H20", "Section 2 Field 11");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field12label, ConstantDetails.UOW_Templates, "T06_Course Information!D21", "T06_Course Information!H21", "Section 2 Field 12");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field13label, ConstantDetails.UOW_Templates, "T06_Course Information!D22", "T06_Course Information!H22", "Section 2 Field 13");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field14label, ConstantDetails.UOW_Templates, "T06_Course Information!D23", "T06_Course Information!H23", "Section 2 Field 14");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field15label, ConstantDetails.UOW_Templates, "T06_Course Information!D25", "T06_Course Information!H25", "Section 2 Field 15");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field16label, ConstantDetails.UOW_Templates, "T06_Course Information!D29", "T06_Course Information!H29", "Section 2 Field 16");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field17label, ConstantDetails.UOW_Templates, "T06_Course Information!D35", "T06_Course Information!H35", "Section 2 Field 17");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field18label, ConstantDetails.UOW_Templates, "T06_Course Information!D36", "T06_Course Information!H36", "Section 2 Field 18");
		
		
		// Click on edit
		validations.click(Locators.TemplatelabelUOW.Section2Edit, "Section 2 Edit");
		validations.longWait();
	
		//Input the data in all the fields
		
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section2Field2Data, ConstantDetails.UOW_TestData, "T06_Course Information!B4", "Section 2 Field 2");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section2Field4Data, ConstantDetails.UOW_TestData, "T06_Course Information!B6", "Section 2 Field 4");
		validations.selectFromSheets(Locators.TemplatelabelUOW.Section2Field5Data, ConstantDetails.UOW_TestData, "T06_Course Information!B7", "Section 2 Field 5");
		validations.selectFromSheets(Locators.TemplatelabelUOW.Section2Field6Data, ConstantDetails.UOW_TestData, "T06_Course Information!B8", "Section 2 Field 6");
		
		
		validations.multiSelectClick(Locators.TemplatelabelUOW.Section2Field7Data, "Section 2 Field 7");
		
		validations.selectFromSheets(Locators.TemplatelabelUOW.Section2Field9Data, ConstantDetails.UOW_TestData, "T06_Course Information!B11", "Section 2 Field 9");
		validations.validateSelectValues(Locators.TemplatelabelUOW.Section2Field9Data, ConstantDetails.UOW_AQFLevels, "Sheet1!A2:A22", "Section 2 Field 9");
		
		
		validations.selectFromSheets(Locators.TemplatelabelUOW.Section2Field10Data, ConstantDetails.UOW_TestData, "T06_Course Information!B12", "Section 2 Field 10");
		
		
		
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section2Field11Data, ConstantDetails.UOW_TestData, "T06_Course Information!B13", "Section 2 Field 11");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section2Field12Data, ConstantDetails.UOW_TestData, "T06_Course Information!B14", "Section 2 Field 12");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section2Field13Data, ConstantDetails.UOW_TestData, "T06_Course Information!B15", "Section 2 Field 13");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section2Field14Data, ConstantDetails.UOW_TestData, "T06_Course Information!B16", "Section 2 Field 14");
		
		validations.longWait();
			
		
		// Click the related records, validate the label for fields within and enter data for field 15
		
		validations.click(Locators.TemplatelabelUOW.Section2Field15RelatedClick, "Section 2 Field 15");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field15_1label, ConstantDetails.UOW_Templates, "T06_Course Information!D26", "T06_Course Information!H26", "Section 2 Field 15 > 1");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section2Field15_1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B19", "Section 2 Field 15 > 1");
		
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field15_2label, ConstantDetails.UOW_Templates, "T06_Course Information!D27", "T06_Course Information!H27", "Section 2 Field 15 > 2");
        validations.isElementDisplayed(Locators.TemplatelabelUOW.Section2Field15_3label, "Section 2 Field 15 > 3");
		validations.clickCheckBox(Locators.TemplatelabelUOW.Section2Field15_2Yes, Locators.TemplatelabelUOW.Section2Field15_2No, ConstantDetails.UOW_TestData, "T06_Course Information!D20", "Section 2 Field 15 > 2: Yes", "Section 2 Field 15 > 2: No");	
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field15_3label, ConstantDetails.UOW_Templates, "T06_Course Information!D28", "T06_Course Information!H28", "Section 2 Field 15 > 3");
		validations.validateAttribute(Locators.TemplatelabelUOW.Section2Field15_3Data, "placeholder", ConstantDetails.UOW_TestData, "T06_Course Information!E21", "Section 2 Field 15 > 3 ");
		
		
		// Click the related records, validate the label for fields within and enter data for field 16
		validations.longWait();
		validations.click(Locators.TemplatelabelUOW.Section2Field16RelatedClick, "Section 2 Field 16");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field16_1label, ConstantDetails.UOW_Templates, "T06_Course Information!D30", "T06_Course Information!H30", "Section 2 Field 16 > 1");
		validations.validateAttribute(Locators.TemplatelabelUOW.Section2Field16_1Data,"placeholder", ConstantDetails.UOW_TestData, "T06_Course Information!E23", "Section 2 Field 16 > 1");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section2Field16_1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B23", "Section 2 Field 16 > 1");
		validations.shortWait();
		validations.click(Locators.TemplatelabelUOW.Section2Field16_1DataSelect, "Section 2 Field 16 > 1");

		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field16_2label, ConstantDetails.UOW_Templates, "T06_Course Information!D31", "T06_Course Information!H31", "Section 2 Field 16 > 2");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field16_3label, ConstantDetails.UOW_Templates, "T06_Course Information!D32", "T06_Course Information!H32", "Section 2 Field 16 > 3");
		
	
		validations.longWait();
		
		//validations.isElementDisplayed(Locators.TemplatelabelUOW.Section2Field16_4label, "Section 2 Field 16 > 4");
		validations.clickCheckBox(Locators.TemplatelabelUOW.Section2Field16_3Yes, Locators.TemplatelabelUOW.Section2Field16_3No, ConstantDetails.UOW_TestData, "T06_Course Information!D25", "Section 2 Field 16 > 3: Yes", "Section 2 Field 16 > 3: No");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field16_4label, ConstantDetails.UOW_Templates, "T06_Course Information!D33", "T06_Course Information!H33", "Section 2 Field 16 > 4");
		validations.validateAttribute(Locators.TemplatelabelUOW.Section2Field16_4Data, "placeholder", ConstantDetails.UOW_TestData, "T06_Course Information!E26", "Section 2 Field 16 > 4");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field16_5label, ConstantDetails.UOW_Templates, "T06_Course Information!D34", "T06_Course Information!H34", "Section 2 Field 16 > 5");
		validations.clickCheckBox(Locators.TemplatelabelUOW.Section2Field16_5Yes, Locators.TemplatelabelUOW.Section2Field16_5No, ConstantDetails.UOW_TestData, "T06_Course Information!D27", "Section 2 Field 16 > 5: Yes", "Section 2 Field 16 > 5: No");
		
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section2Field17Data, ConstantDetails.UOW_TestData, "T06_Course Information!B28", "Section 2 Field 17");
		
		
		// Click the related records, validate the label for fields within and enter data for field 18
		
		validations.click(Locators.TemplatelabelUOW.Section2Field18RelatedClick, "Section 2 Field 18");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field18_1label, ConstantDetails.UOW_Templates, "T06_Course Information!D37", "T06_Course Information!H37", "Section 2 Field 18 > 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section2Field18_2label, ConstantDetails.UOW_Templates, "T06_Course Information!D38", "T06_Course Information!H38", "Section 2 Field 18 > 2");
		validations.selectFromSheets(Locators.TemplatelabelUOW.Section2Field18_1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B30", "Section 2 Field 18 > 1");
		validations.validateSelectValues(Locators.TemplatelabelUOW.Section2Field18_1Data, ConstantDetails.UOW_ComparabaleAcademicItems, "Sheet1!A2:A6", "Section 2 Field 18 > 1");
        validations.enterFromSheets(Locators.TemplatelabelUOW.Section2Field18_2Data, ConstantDetails.UOW_TestData, "T06_Course Information!B31", "Section 2 Field 18 > 2");
        validations.click(Locators.TemplatelabelUOW.Section2Field18_2DataClick, "Section 2 Field 18 > 2");
		
		
		
		validations.longWait();
		// Save the section
		validations.click(Locators.TemplatelabelUOW.Section2Save, "Section 2 Save");
		validations.longWait();
		
		
		// Validate the saved data 
		
		validations.validateSavedData(Locators.TemplatelabelUOW.Section2Field2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!B4", "Section 2 Field 2");
		validations.validateData(Locators.TemplatelabelUOW.Section2Field3DataSaved, ConstantDetails.CourseTitle, "Section 2 Field 3");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section2Field4DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!B6", "Section 2 Field 4");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section2Field5DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!B7", "Section 2 Field 5");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section2Field6DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!B8", "Section 2 Field 6");
		
		
		
		validations.validateMultiSelectValues(Locators.TemplatelabelUOW.Section2Field7DataSaved, ConstantDetails.UOW_RegulatoryAuthority, "Sheet1!A2:A09", "Section 2 Field 7");
		
		validations.validateSavedData(Locators.TemplatelabelUOW.Section2Field9DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!B11", "Section 2 Field 9");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section2Field10DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!B12", "Section 2 Field 10");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section2Field11DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C13", "Section 2 Field 11");
		
		validations.validateSavedData(Locators.TemplatelabelUOW.Section2Field12DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!B14", "Section 2 Field 12");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section2Field13DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!B15", "Section 2 Field 13");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section2Field14DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C16", "Section 2 Field 14");
		
		
		
		validations.shortWait();
	
		validations.click(Locators.TemplatelabelUOW.Section2Field15Chev, "Section 2 Field 15 chevron");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section2Field15_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!B19", "Section 2 Field 15 > 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section2Field15_2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C20", "Section 2 Field 15 > 2");

		validations.click(Locators.TemplatelabelUOW.Section2Field16Chev, "Section 2 Field 16 chevron");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section2Field16_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!B23", "Section 2 Field 16 > 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section2Field16_2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C24", "Section 2 Field 16 > 2");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section2Field16_3DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C25", "Section 2 Field 16 > 3");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section2Field16_5DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C27", "Section 2 Field 16 > 5");
		
		validations.validateSavedData(Locators.TemplatelabelUOW.Section2Field17DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!B28", "Section 2 Field 17");
		
		validations.click(Locators.TemplatelabelUOW.Section2Field18Chev, "Section 2 Field 18 chevron");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section2Field18_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!B30", "Section 2 Field 18 > 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section2Field18_2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C31", "Section 2 Field 18 > 2");
		validations.longWait();
	}


}
