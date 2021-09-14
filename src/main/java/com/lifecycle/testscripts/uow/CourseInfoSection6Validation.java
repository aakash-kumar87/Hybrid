
package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;



public class CourseInfoSection6Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection() throws IOException, InterruptedException, AWTException, NullPointerException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for Section 6 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section6Heading, ConstantDetails.UOW_Templates, "T06_Course Information!D63", "Section 6 heading");
		
		 validations.shortWait();
		validations.linkBySheet(driver, ConstantDetails.UOW_Templates, "T06_Course Information!D63", "Section 6");
		 validations.longWait();
		 
		// Click on edit
		validations.click(Locators.TemplatelabelUOW.Section6Edit, "Section 6 Edit");
		validations.longWait();

		
		//Validate the field labels
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field1label, ConstantDetails.UOW_Templates, "T06_Course Information!D64", "T06_Course Information!H64", "Section 6 Field 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field2label, ConstantDetails.UOW_Templates, "T06_Course Information!D68", "T06_Course Information!H68", "Section 6 Field 2");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field3label, ConstantDetails.UOW_Templates, "T06_Course Information!D72", "T06_Course Information!H72", "Section 6 Field 3");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field4label, ConstantDetails.UOW_Templates, "T06_Course Information!D76", "T06_Course Information!H76", "Section 6 Field 4");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field5label, ConstantDetails.UOW_Templates, "T06_Course Information!D79", "T06_Course Information!H79", "Section 6 Field 5");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field6label, ConstantDetails.UOW_Templates, "T06_Course Information!D83", "T06_Course Information!H83", "Section 6 Field 6");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field7label, ConstantDetails.UOW_Templates, "T06_Course Information!D84", "T06_Course Information!H84", "Section 6 Field 7");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field8label, ConstantDetails.UOW_Templates, "T06_Course Information!D85", "T06_Course Information!H85", "Section 6 Field 8");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field9label, ConstantDetails.UOW_Templates, "T06_Course Information!D86", "T06_Course Information!H86", "Section 6 Field 9");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field10label, ConstantDetails.UOW_Templates, "T06_Course Information!D87", "T06_Course Information!H87", "Section 6 Field 10");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field11label, ConstantDetails.UOW_Templates, "T06_Course Information!D88", "T06_Course Information!H88", "Section 6 Field 11");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field12label, ConstantDetails.UOW_Templates, "T06_Course Information!D89", "T06_Course Information!H89", "Section 6 Field 12");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field13label, ConstantDetails.UOW_Templates, "T06_Course Information!D90", "T06_Course Information!H90", "Section 6 Field 13");
		
	
		//Input the data in all the fields
	    // enter the label/data
        
		
		validations.click(Locators.TemplatelabelUOW.Section6Field1RelatedClick, "Section 6 Field 1 Related record");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field1_1label, ConstantDetails.UOW_Templates, "T06_Course Information!D65", "T06_Course Information!H65", "Section 6 Field 1 > 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field1_2label, ConstantDetails.UOW_Templates, "T06_Course Information!D66", "T06_Course Information!H66", "Section 6 Field 1 > 2");
		validations.isElementDisplayed(Locators.TemplatelabelUOW.Section6Field1_3label, "Section 6 Field 1 > 3");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section6Field1_1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B175", "Section 6 Field 1 > 1");
		validations.clickCheckBox(Locators.TemplatelabelUOW.Section6Field1_2Yes, Locators.TemplatelabelUOW.Section6Field1_2No, ConstantDetails.UOW_TestData, "T06_Course Information!D176", "Section 6 Field 1 > 2: Yes", "Section 6 Field 1 > 2: No");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field1_3label, ConstantDetails.UOW_Templates, "T06_Course Information!D67", "T06_Course Information!H67", "Section 6 Field 1 > 3");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section6Field1_3Data, ConstantDetails.UOW_TestData, "T06_Course Information!B177", "Section 6 Field 1 > 3");
        validations.shortWait();
		validations.click(Locators.TemplatelabelUOW.Section6Field1_3DataClick, "Section 6 Field 1 > 3 data");
		
		validations.click(Locators.TemplatelabelUOW.Section6Field2RelatedClick, "Section 6 Field 2 Related record");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field2_1label, ConstantDetails.UOW_Templates, "T06_Course Information!D69", "T06_Course Information!H69", "Section 6 Field 2 > 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field2_2label, ConstantDetails.UOW_Templates, "T06_Course Information!D70", "T06_Course Information!H70", "Section 6 Field 2 > 2");
		validations.isElementDisplayed(Locators.TemplatelabelUOW.Section6Field2_3label, "Section 6 Field 2 > 3");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section6Field2_1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B179", "Section 6 Field 2 > 1");
		validations.clickCheckBox(Locators.TemplatelabelUOW.Section6Field2_2Yes, Locators.TemplatelabelUOW.Section6Field2_2No, ConstantDetails.UOW_TestData, "T06_Course Information!D180", "Section 6 Field 2 > 2: Yes", "Section 6 Field 2 > 2: No");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field2_3label, ConstantDetails.UOW_Templates, "T06_Course Information!D71", "T06_Course Information!H71", "Section 6 Field 2 > 3");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section6Field2_3Data, ConstantDetails.UOW_TestData, "T06_Course Information!B181", "Section 6 Field 2 > 3");
        validations.shortWait();
		validations.click(Locators.TemplatelabelUOW.Section6Field2_3DataClick, "Section 6 Field 2 > 3 data");
		
		
		validations.click(Locators.TemplatelabelUOW.Section6Field3RelatedClick, "Section 6 Field 3 Related record");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field3_1label, ConstantDetails.UOW_Templates, "T06_Course Information!D73", "T06_Course Information!H73", "Section 6 Field 3 > 1");
        validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field3_2label, ConstantDetails.UOW_Templates, "T06_Course Information!D74", "T06_Course Information!H74", "Section 6 Field 3 > 2");
        validations.isElementDisplayed(Locators.TemplatelabelUOW.Section6Field3_3label, "Section 6 Field 3 > 3");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section6Field3_1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B183", "Section 6 Field 3 > 1");
		validations.clickCheckBox(Locators.TemplatelabelUOW.Section6Field3_2Yes, Locators.TemplatelabelUOW.Section6Field3_2No, ConstantDetails.UOW_TestData, "T06_Course Information!D184", "Section 6 Field 2 > 2: Yes", "Section 6 Field 3 > 2: No");
        validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field3_3label, ConstantDetails.UOW_Templates, "T06_Course Information!D75", "T06_Course Information!H75", "Section 6 Field 3 > 3");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section6Field3_3Data, ConstantDetails.UOW_TestData, "T06_Course Information!B185", "Section 6 Field 3 > 3");
        validations.shortWait();
		validations.click(Locators.TemplatelabelUOW.Section6Field3_3DataClick, "Section 6 Field 3 > 3 data");
	
		validations.click(Locators.TemplatelabelUOW.Section6Field4RelatedClick, "Section 6 Field 4 Related record");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field4_1label, ConstantDetails.UOW_Templates, "T06_Course Information!D77", "T06_Course Information!H77", "Section 6 Field 4 > 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field4_2label, ConstantDetails.UOW_Templates, "T06_Course Information!D78", "T06_Course Information!H78", "Section 6 Field 4 > 2");
		validations.selectFromSheets(Locators.TemplatelabelUOW.Section6Field4_1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B187", "Section 6 Field 4 > 1"); 
        validations.validateSelectValues(Locators.TemplatelabelUOW.Section6Field4_1Data, ConstantDetails.UOW_EntryReqType, "Sheet1!A2:A3", "Section 6 Field 4 > 1");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section6Field4_2Data, ConstantDetails.UOW_TestData, "T06_Course Information!B188", "Section 6 Field 4 > 2");
		
		
		validations.click(Locators.TemplatelabelUOW.Section6Field5RelatedClick, "Section 6 Field 5 Related record");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field5_1label, ConstantDetails.UOW_Templates, "T06_Course Information!D80", "T06_Course Information!H80", "Section 6 Field 5 > 1");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field5_2label, ConstantDetails.UOW_Templates, "T06_Course Information!D81", "T06_Course Information!H81", "Section 6 Field 5 > 2");
        validations.isElementDisplayed(Locators.TemplatelabelUOW.Section6Field5_3label, "Section 6 Field 5 > 3");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section6Field5_1Data, ConstantDetails.UOW_TestData, "T06_Course Information!B190", "Section 6 Field 5 > 1");
		validations.clickCheckBox(Locators.TemplatelabelUOW.Section6Field5_2Yes, Locators.TemplatelabelUOW.Section6Field5_2No, ConstantDetails.UOW_TestData, "T06_Course Information!D191", "Section 6 Field 2 > 2: Yes", "Section 6 Field 5 > 2: No");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section6Field5_3label, ConstantDetails.UOW_Templates, "T06_Course Information!D82", "T06_Course Information!H82", "Section 6 Field 5 > 3");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section6Field5_3Data, ConstantDetails.UOW_TestData, "T06_Course Information!B192", "Section 6 Field 5 > 3");
        validations.shortWait();
		validations.click(Locators.TemplatelabelUOW.Section6Field5_3DataClick, "Section 6 Field 5 > 3 data");
		
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section6Field6Data, ConstantDetails.UOW_TestData, "T06_Course Information!B193", "Section 6 Field 6");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section6Field7Data, ConstantDetails.UOW_TestData, "T06_Course Information!B194", "Section 6 Field 7");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section6Field8Data, ConstantDetails.UOW_TestData, "T06_Course Information!B195", "Section 6 Field 8");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section6Field9Data, ConstantDetails.UOW_TestData, "T06_Course Information!B196", "Section 6 Field 9");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section6Field10Data, ConstantDetails.UOW_TestData, "T06_Course Information!B197", "Section 6 Field 10");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section6Field11Data, ConstantDetails.UOW_TestData, "T06_Course Information!B198", "Section 6 Field 11");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section6Field12Data, ConstantDetails.UOW_TestData, "T06_Course Information!B199", "Section 6 Field 12");
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section6Field13Data, ConstantDetails.UOW_TestData, "T06_Course Information!B200", "Section 6 Field 13");
		
		validations.longWait();
		
		// Save the section
		validations.click(Locators.TemplatelabelUOW.Section6Save, "Section 6 Save");
		validations.longWait();
	
		// Validate the saved data 
		validations.click(Locators.TemplatelabelUOW.Section6Field1Chev, "Section 6 Field 1 Chevron");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field1_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C175", "Section 6 Field 1 > 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field1_2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C176", "Section 6 Field 1 > 2");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field1_3DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C177", "Section 6 Field 1 > 3");
		
		validations.click(Locators.TemplatelabelUOW.Section6Field2Chev, "Section 6 Field 2 Chevron");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field2_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C179", "Section 6 Field 2 > 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field2_2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C180", "Section 6 Field 2 > 2");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field2_3DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C181", "Section 6 Field 2 > 3");
		
		validations.click(Locators.TemplatelabelUOW.Section6Field3Chev, "Section 6 Field 3 Chevron");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field3_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C183", "Section 6 Field 3 > 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field3_2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C184", "Section 6 Field 3 > 2");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field3_3DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C185", "Section 6 Field 3 > 3");
		
		validations.click(Locators.TemplatelabelUOW.Section6Field4Chev, "Section 6 Field 4 Chevron");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field4_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C187", "Section 6 Field 4 > 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field4_2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C188", "Section 6 Field 4 > 2");
		
		validations.click(Locators.TemplatelabelUOW.Section6Field5Chev, "Section 6 Field 5 Chevron");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field5_1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C190", "Section 6 Field 5 > 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field5_2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C191", "Section 6 Field 5 > 2");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field5_3DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C192", "Section 6 Field 5 > 3");
		
		
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field6DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C193", "Section 6 Field 6");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field7DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C194", "Section 6 Field 7");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field8DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C195", "Section 6 Field 8");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field9DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C196", "Section 6 Field 9");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field10DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C197", "Section 6 Field 10");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field11DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C198", "Section 6 Field 11");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field12DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C199", "Section 6 Field 12");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section6Field13DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C200", "Section 6 Field 13");
		
		validations.longWait();
	
	
	
	}


}
