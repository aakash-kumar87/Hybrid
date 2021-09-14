package com.lifecycle.testscripts.uow;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.library.LandingPage;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class CreateAI extends BaseDriverUtil {
	
//	public WebDriver driver;
	
	

	@Test(groups = {"regression"})
	public void createCourseUOW() throws IOException, InterruptedException, AWTException {
		setup(driver);
	
		Validations validations = new Validations(driver);
		// Create a new 
		validations.click(Locators.Dashboard.CREATEITEM, "Create Item Button");
		validations.longWait();
		
		// Create a new course
		validations.click(Locators.Dashboard.createItemUOW("course"), "Create a new course Button");
		
		// Validate the course modal heading, labels and input data to create a new course
		
	
	
		validations.validateLabelPerCell(Locators.CourseModal.HEADING1, ConstantDetails.UOW_WORKFLOW_ALLOCATION_MODALS, "1. Create a Course!U9", "HEADING 1");
		validations.validateLabelPerCell(Locators.CourseModal.HEADING2, ConstantDetails.UOW_WORKFLOW_ALLOCATION_MODALS, "1. Create a Course!U10", "HEADING 2");
		
		validations.isElementDisplayed(Locators.Dashboard.buttonByText("Select the Course of Study"), "Select the Course of Study");
		

		
		validations.validateLabelSheetsMandate(Locators.CourseModal.ITEMTYPELABELUOW, ConstantDetails.UOW_WORKFLOW_ALLOCATION_MODALS, "1. Create a Course!U12", "1. Create a Course!Y12", "Select the Entity");
		validations.select(Locators.CourseModal.ITEMTYPESELECTUOW, "UOWCA", "Select the Entity");
		validations.validateDropDownValuesCsvData(Locators.CourseModal.ITEMTYPESELECTUOW, ConstantDetails.UOW_WORKFLOW_ALLOCATION_MODALS, "1. Create a Course!W12", "Select the Entity");
		
		
		validations.validateLabelSheetsMandate(Locators.CourseModal.APPROVALPROCESSLABELUOW, ConstantDetails.UOW_WORKFLOW_ALLOCATION_MODALS, "1. Create a Course!U133", "1. Create a Course!Y133", "Select the Approval Process");
		validations.select(Locators.CourseModal.APPROVALPROCESSSELECETUOW, "Standard", "Select the Approval Process");
		validations.validateDropDownValuesCsvData(Locators.CourseModal.APPROVALPROCESSSELECETUOW, ConstantDetails.UOW_WORKFLOW_ALLOCATION_MODALS, "1. Create a Course!W133", "Select the Approval Process");
		
	
		
		validations.validateLabelSheetsMandate(Locators.CourseModal.ITEMTITLELABELUOW, ConstantDetails.UOW_WORKFLOW_ALLOCATION_MODALS, "1. Create a Course!U16", "1. Create a Course!Y16", "Name");
		validations.enter(Locators.CourseModal.ITEMTITLEINPUTUOW, ConstantDetails.CourseTitle, "Name ");
		
		validations.validateLabelSheetsMandate(Locators.CourseModal.IMPYEARLABELUOW, ConstantDetails.UOW_WORKFLOW_ALLOCATION_MODALS, "1. Create a Course!U19", "1. Create a Course!Y19", "Commencement Year");
		validations.select(Locators.CourseModal.IMPYEARSELECTUOW, ConstantDetails.ImplementationYear, "Commencement Year ");
		validations.click(Locators.CourseModal.CREATEBUTTON("Create"), "Create button");
		Reporting.logResults(driver, "Pass", "Creation of record", "Course created is: "+ ConstantDetails.CourseTitle);
		
	}
	
	
	
	@Test(groups = {"regression"})
	public void createMajorUOW() throws IOException, InterruptedException, AWTException {
		setup(driver);
	
		Validations validations = new Validations(driver);
		// Create a new 
		validations.click(Locators.Dashboard.CREATEITEM, "Create Item Button");
		validations.longWait();
		
		// Create a new course
		validations.click(Locators.Dashboard.createItemUOW("major / specialisation"), "Create a new major / specialisation Button");
		
		// Validate the course modal heading, labels and input data to create a new course
		
	
	
		validations.validateLabelPerCell(Locators.CourseModal.HEADING1, ConstantDetails.UOW_WORKFLOW_ALLOCATION_MODALS, "2. Create a Major!U10", "HEADING 1");
		validations.validateLabelPerCell(Locators.CourseModal.HEADING2, ConstantDetails.UOW_WORKFLOW_ALLOCATION_MODALS, "2. Create a Major!U11", "HEADING 2");
		
		
		validations.validateLabelSheetsMandate(Locators.MajorModal.ENTITYLABELUOW, ConstantDetails.UOW_WORKFLOW_ALLOCATION_MODALS, "2. Create a Major!U13", "2. Create a Major!Y13", "Select the Entity");
		validations.select(Locators.MajorModal.ENTITYSELECTUOW, "UOW", "Select the Entity");
		validations.validateDropDownValuesCsvData(Locators.MajorModal.ENTITYSELECTUOW, ConstantDetails.UOW_WORKFLOW_ALLOCATION_MODALS, "2. Create a Major!W13", "Select the Entity");
		
	
		validations.validateLabelSheetsMandate(Locators.MajorModal.ITEMAWARDTYPELABELUOW, ConstantDetails.UOW_WORKFLOW_ALLOCATION_MODALS, "2. Create a Major!U16", "2. Create a Major!Y16", "Select the Award type");
		validations.select(Locators.MajorModal.ITEMAWARDSELECTUOW, "Postgraduate", "Select the Award type");
		validations.validateDropDownValuesCsvData(Locators.MajorModal.ITEMAWARDSELECTUOW, ConstantDetails.UOW_WORKFLOW_ALLOCATION_MODALS, "2. Create a Major!W16", "Select the Award type");
		
		
		validations.validateLabelSheetsMandate(Locators.MajorModal.APPROVALPROCESSLABELUOW, ConstantDetails.UOW_WORKFLOW_ALLOCATION_MODALS, "2. Create a Major!U19", "2. Create a Major!Y19", "Select the Approval Process");
		validations.select(Locators.MajorModal.APPROVALPROCESSSELECETUOW, "Standard", "Select the Approval Process");
		validations.validateDropDownValuesCsvData(Locators.MajorModal.APPROVALPROCESSSELECETUOW, ConstantDetails.UOW_WORKFLOW_ALLOCATION_MODALS, "2. Create a Major!W19", "Select the Approval Process");
		
	
		
		validations.validateLabelSheetsMandate(Locators.MajorModal.ITEMTITLELABELUOW, ConstantDetails.UOW_WORKFLOW_ALLOCATION_MODALS, "2. Create a Major!U23", "2. Create a Major!Y23", "Name");
		validations.enter(Locators.MajorModal.ITEMTITLEINPUTUOW, ConstantDetails.MajorTitle, "Name ");
		
		validations.validateLabelSheetsMandate(Locators.MajorModal.IMPYEARLABELUOW, ConstantDetails.UOW_WORKFLOW_ALLOCATION_MODALS, "2. Create a Major!U26", "2. Create a Major!Y26", "Commencement Year");
		validations.select(Locators.MajorModal.IMPYEARSELECTUOW, ConstantDetails.ImplementationYear, "Commencement Year ");
		validations.click(Locators.CourseModal.CREATEBUTTON("Create"), "Create button");
		Reporting.logResults(driver, "Pass", "Creation of record", "Course created is: "+ ConstantDetails.MajorTitle);
		
	}
	

		
	}



