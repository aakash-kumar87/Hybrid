

package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.accelarators.Utilities;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;



public class CourseInfoSection1Validation extends BaseDriverUtil  {

	@Test(groups = {"regression"})
	public void verifySection1() throws IOException, InterruptedException, AWTException {
		Validations validations = new Validations(driver);
		
		//Validate the Section heading and the field labels for section 1 
		//Pass Locator, Google Sheet ID, sheet tab and cell range, Locator name
	
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section1Heading, ConstantDetails.UOW_Templates, "T06_Course Information!D7", "Section 1 heading");
		validations.validateLabelPerCell(Locators.TemplatelabelUOW.Section1Field1Label, ConstantDetails.UOW_Templates, "T06_Course Information!D8", "Section 1 Field 1");
		
		
		// Click on edit
		validations.click(Locators.TemplatelabelUOW.Section1Edit, "Section 1 Edit");
		
		validations.longWait();
		
		//Click and enter value in date picker
		//Pass Click locator, Select locator, field name
		validations.validatedatePicker(Locators.TemplatelabelUOW.Section1DateClick, Locators.TemplatelabelUOW.Section1DateSelect, "Commencement Date");
		
		
		
		// Save the section
		validations.click(Locators.TemplatelabelUOW.Section1Save, "Section 1 save");
		
		//wait
		validations.longWait();
		
	 
		
		//This method will return the current date in the specified format
		String currentDate = Utilities.currentDate();
		
		// Validate the Data saved
		// Pass the locator, data in string, Locator name
		validations.validateData(Locators.TemplatelabelUOW.Section1Field1Data, currentDate, "Commencement Date");
		
		validations.longWait();
		
	}


}
