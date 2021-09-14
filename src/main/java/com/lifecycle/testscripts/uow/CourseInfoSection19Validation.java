
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



public class CourseInfoSection19Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection() throws IOException, InterruptedException, AWTException, NullPointerException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for Section 19 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section19Heading, ConstantDetails.UOW_Templates, "T06_Course Information!D174", "Section 19 heading");
		
		 validations.shortWait();
		validations.linkBySheet(driver, ConstantDetails.UOW_Templates, "T06_Course Information!D174", "Section 19");
		 validations.longWait();
		 
		// Click on edit
		validations.click(Locators.TemplatelabelUOW.Section19Edit, "Section 19 Edit");
		validations.longWait();

		
		//Validate the field labels
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section19Field1label, ConstantDetails.UOW_Templates, "T06_Course Information!D175", "T06_Course Information!H175", "Section 19 Field 1");

	    // Validate conditional display of fields 
		validations.isElementDisplayed(Locators.TemplatelabelUOW.Section19Field2label, "Section 19 Field 2");
		validations.isElementDisplayed(Locators.TemplatelabelUOW.Section19Field3label, "Section 19 Field 3");
		validations.isElementDisplayed(Locators.TemplatelabelUOW.Section19Field4label, "Section 19 Field 4");
		validations.isElementDisplayed(Locators.TemplatelabelUOW.Section19Field5label, "Section 19 Field 5"); 
		validations.isElementDisplayed(Locators.TemplatelabelUOW.Section19Field6label, "Section 19 Field 6");
		validations.isElementDisplayed(Locators.TemplatelabelUOW.Section19Field7label, "Section 19 Field 7");
		validations.isElementDisplayed(Locators.TemplatelabelUOW.Section19Field8label, "Section 19 Field 8");
		
		
		// Select yes for field 1 to enable all 6 other fields 
		
		validations.clickCheckBox(Locators.TemplatelabelUOW.Section19Field1Yes, Locators.TemplatelabelUOW.Section19Field1No, ConstantDetails.UOW_TestData, "T06_Course Information!D150", "Section 19 Field 1: Yes", "Section 19 Field 1: No");
		
	   //	validations.selectFromSheets(Locators.TemplatelabelUOW.Section19Field1, ConstantDetails.UOW_TestData, "T06_Course Information!B161", "Section 19 Field 1");
		
		// Validate the labels of conditional fields displayed
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section19Field2label, ConstantDetails.UOW_Templates, "T06_Course Information!D176", "T06_Course Information!H176", "Section 19 Field 2");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section19Field3label, ConstantDetails.UOW_Templates, "T06_Course Information!D177", "T06_Course Information!H177", "Section 19 Field 3");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section19Field4label, ConstantDetails.UOW_Templates, "T06_Course Information!D178", "T06_Course Information!H178", "Section 19 Field 4");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section19Field5label, ConstantDetails.UOW_Templates, "T06_Course Information!D179", "T06_Course Information!H179", "Section 19 Field 5");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section19Field6label, ConstantDetails.UOW_Templates, "T06_Course Information!D180", "T06_Course Information!H180", "Section 19 Field 6");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section19Field7label, ConstantDetails.UOW_Templates, "T06_Course Information!D181", "T06_Course Information!H181", "Section 19 Field 7");
		
	 	
	
		//Input the data in all the fields
	    // enter the data

		validations.selectFromSheets(Locators.TemplatelabelUOW.Section19Field2Data, ConstantDetails.UOW_TestData, "T06_Course Information!B151", "Section 19 Field 2");
		validations.validateSelectValues(Locators.TemplatelabelUOW.Section19Field2Data, ConstantDetails.UOW_PrimaryStudyArea, "Sheet1!A2:A26", "Section 19 Field 2");
    	validations.multiSelectClick(Locators.TemplatelabelUOW.Section19Field3Data, "Section 19 Field 3"); 
		validations.enterHTMLEditor(Locators.TemplatelabelUOW.Section19Field4DataFrame, Locators.TemplatelabelUOW.Section19Field4Data, ConstantDetails.UOW_TestData, "T06_Course Information!B153", "Section 19 Field 4" );
		validations.enterFromSheets(Locators.TemplatelabelUOW.Section19Field5Data, ConstantDetails.UOW_TestData, "T06_Course Information!B154", "Section 19 Field 5");
		validations.enterHTMLEditor(Locators.TemplatelabelUOW.Section19Field6DataFrame, Locators.TemplatelabelUOW.Section19Field6Data, ConstantDetails.UOW_TestData, "T06_Course Information!B155", "Section 19 Field 5" );
	    
		// Select yes for field 7 to enable 8th field and then validate label/add data for 8th field
		
		validations.clickCheckBox(Locators.TemplatelabelUOW.Section19Field7Yes, Locators.TemplatelabelUOW.Section19Field7No, ConstantDetails.UOW_TestData, "T06_Course Information!D156", "Section 19 Field 7: Yes", "Section 19 Field 7: No");
		validations.validateLabelSheetsMandate(Locators.TemplatelabelUOW.Section19Field8label, ConstantDetails.UOW_Templates, "T06_Course Information!D182", "T06_Course Information!H182", "Section 19 Field 8");
			
		validations.validateAttribute(Locators.TemplatelabelUOW.Section19Field8Data, "placeholder", ConstantDetails.UOW_TestData, "T06_Course Information!E157", "Section 19 Field 7");
	    validations.enterFromSheets(Locators.TemplatelabelUOW.Section19Field8Data, ConstantDetails.UOW_TestData, "T06_Course Information!B157", "Section 19 Field 8");
		
		validations.longWait();
		
		// Save the section
		validations.click(Locators.TemplatelabelUOW.Section19Save, "Section 19 Save");
		validations.longWait();
	
		// Validate the saved data 
		validations.validateSavedData(Locators.TemplatelabelUOW.Section19Field1DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C150", "Section 19 Field 1");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section19Field2DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C151", "Section 19 Field 2");
		validations.validateMultiSelectValues(Locators.TemplatelabelUOW.Section19Field3DataSaved, ConstantDetails.UOW_StudyArea, "Sheet1!A2:A35", "Section 19 Field 3");  
		validations.validateSavedData(Locators.TemplatelabelUOW.Section19Field4DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C153", "Section 19 Field 4");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section19Field5DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C154", "Section 19 Field 5");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section19Field6DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C155", "Section 19 Field 6");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section19Field7DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C156", "Section 19 Field 7");
		validations.validateSavedData(Locators.TemplatelabelUOW.Section19Field8DataSaved, ConstantDetails.UOW_TestData, "T06_Course Information!C157", "Section 19 Field 8");
		
		validations.longWait();
	
	
	
	}


}
