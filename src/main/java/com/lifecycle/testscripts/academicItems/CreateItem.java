package com.lifecycle.testscripts.academicItems;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.lifecycle.accelarators.ActionDriver;
import com.lifecycle.accelarators.BaseDriverUtil;
import com.lifecycle.accelarators.ConstantDetails;
import com.lifecycle.library.Validations;
import com.lifecycle.locators.Locators;

public class CreateItem extends BaseDriverUtil {
	
	
	@Test(groups = {"regression"})
	
	public void createItemQUT() throws IOException, InterruptedException, AWTException {
		setup(driver);
		Validations validations = new Validations(driver);
		
		// Create a new 
		validations.click(Locators.Dashboard.CREATEITEM, "Create Item Button");
		validations.longWait();
		
		// Create a new course
		validations.click(Locators.Dashboard.createItemUOW("Course"), "Create a new course Button");
		
		// Validate the course modal heading, labels and input data to create a new course
	
		validations.validateLabelPerCell(Locators.CourseModal.HEADING1, "1bO4l1jqhHg2qOl5MUGCDYRQcZNRUp9hO-Yd7yOjs5d8", "Create - Course!I7", "HEADING 1");
		validations.validateLabelPerCell(Locators.CourseModal.HEADING2, "1bO4l1jqhHg2qOl5MUGCDYRQcZNRUp9hO-Yd7yOjs5d8", "Create - Course!I8", "HEADING 2");
		
		validations.validateLabelSheetsMandate(Locators.CourseModal.ITEMTYPELABEL, "1bO4l1jqhHg2qOl5MUGCDYRQcZNRUp9hO-Yd7yOjs5d8", "Create - Course!U10", "Create - Course!X10", "Select the type of course");
		validations.select(Locators.CourseModal.ITEMTYPESELECT, ConstantDetails.CourseType, "Select the type of course");
		validations.validateDropDownValuesCsvData(Locators.CourseModal.ITEMTYPESELECT, "1bO4l1jqhHg2qOl5MUGCDYRQcZNRUp9hO-Yd7yOjs5d8", "Create - Course!W10", "Select the type of course");
		
		validations.validateLabelSheetsMandate(Locators.CourseModal.ITEMTITLELABEL, "1bO4l1jqhHg2qOl5MUGCDYRQcZNRUp9hO-Yd7yOjs5d8", "Create - Course!U14", "Create - Course!X14", "Title");
		validations.enter(Locators.CourseModal.ITEMTITLEINPUT, ConstantDetails.CourseTitle, "Title ");
		
		validations.validateLabelSheetsMandate(Locators.CourseModal.IMPYEARLABEL, "1bO4l1jqhHg2qOl5MUGCDYRQcZNRUp9hO-Yd7yOjs5d8", "Create - Course!U17", "Create - Course!X17", "Implementation Year");
		validations.select(Locators.CourseModal.IMPYEARSELECT, ConstantDetails.ImplementationYear, "Implementation Year ");
		
		validations.validateLabelSheetsMandate(Locators.CourseModal.INITIALPROPOSALLABEL, "1bO4l1jqhHg2qOl5MUGCDYRQcZNRUp9hO-Yd7yOjs5d8", "Create - Course!U19", "Create - Course!X19", "Initial Proposal");
		validations.validateLabel(Locators.CourseModal.INITIALPROPOSALLINK, "Click here to create a new Initial Proposal", "Click here to create a new Initial Proposal Link");
		
		//dashboardpage.click(Locators.CourseModal.ITEMCREATE, "Create button");
		
	}
	
	@Test(groups = {"regression"})
	
	public void createItemMonash() throws IOException, InterruptedException, AWTException {
		setup(driver);
	
		Validations validations = new Validations(driver);
		
		// Create a new 
		validations.click(Locators.Dashboard.CREATEITEMMONASH, "Create Item Button");
		validations.longWait();
		
		// Create a new course
		validations.click(Locators.Dashboard.createItemUOW("course"), "Create a new course Button");
		
		// Validate the course modal heading, labels and input data to create a new course
	
		validations.validateLabelPerCell(Locators.CourseModal.HEADING1, "1EwMGDVnAljC_w0y4wYC9V9tBhFmX8xlSAK-nBHKKhco", "1. Create a Course!O8", "HEADING 1");
		validations.validateLabelPerCell(Locators.CourseModal.HEADING2, "1EwMGDVnAljC_w0y4wYC9V9tBhFmX8xlSAK-nBHKKhco", "1. Create a Course!O9", "HEADING 2");
		
		
		validations.validateLabelSheetsMandate(Locators.CourseModal.ITEMTITLELABELMONASH, "1EwMGDVnAljC_w0y4wYC9V9tBhFmX8xlSAK-nBHKKhco", "1. Create a Course!O14", "1. Create a Course!R14", "Course title");
		validations.enter(Locators.CourseModal.ITEMTITLEINPUT, ConstantDetails.CourseTitle, "Title ");
		
		
		
		validations.validateLabelSheetsMandate(Locators.CourseModal.IMPYEARLABELMONASH, "1EwMGDVnAljC_w0y4wYC9V9tBhFmX8xlSAK-nBHKKhco", "1. Create a Course!O17", "1. Create a Course!R17", "Implementation year");
		validations.select(Locators.CourseModal.IMPYEARSELECT, ConstantDetails.ImplementationYear, "Implementation Year ");
		
		validations.validateLabelSheetsMandate(Locators.CourseModal.ITEMTYPELABELMONASH, "1EwMGDVnAljC_w0y4wYC9V9tBhFmX8xlSAK-nBHKKhco", "1. Create a Course!O20", "1. Create a Course!R20", "Course type");
		validations.select(Locators.CourseModal.ITEMTYPESELECTMONASH, "Non award pathway", "Course type");
		
		
		//dashboardpage.click(Locators.CourseModal.CREATEBUTTON("Create"), "Create button");
		
	}
	
	@Test(groups = {"regression"})
	public void createCourseUOW() throws IOException, InterruptedException, AWTException {
		setup(driver);
	
		Validations validations = new Validations(driver);
		ActionDriver action = new ActionDriver(driver);
		
		// Create a new 
		validations.click(Locators.Dashboard.CREATEITEM, "Create Item Button");
		validations.longWait();
		
		// Create a new course
		validations.click(Locators.Dashboard.createItemUOW("course"), "Create a new course Button");
		
		// Validate the course modal heading, labels and input data to create a new course
		
	
	
		validations.validateLabelPerCell(Locators.CourseModal.HEADING1, "1yzjQx-Ag1-y426APnmIB4Q7yFmc37ji4o17WNqb7kq4", "1. Create a Course!U9", "HEADING 1");
		validations.validateLabelPerCell(Locators.CourseModal.HEADING2, "1yzjQx-Ag1-y426APnmIB4Q7yFmc37ji4o17WNqb7kq4", "1. Create a Course!U10", "HEADING 2");
		
		validations.isElementDisplayed(Locators.Dashboard.buttonByText("Select the Course of Study"), "Select the Course of Study");
		
	
		
		validations.validateLabelSheetsMandate(Locators.CourseModal.ITEMTYPELABELUOW, "1yzjQx-Ag1-y426APnmIB4Q7yFmc37ji4o17WNqb7kq4", "1. Create a Course!U12", "1. Create a Course!Y12", "Select the Entity");
		validations.select(Locators.CourseModal.ITEMTYPESELECTUOW, "UOWCA", "Select the Entity");
		validations.validateDropDownValuesCsvData(Locators.CourseModal.ITEMTYPESELECTUOW, "1yzjQx-Ag1-y426APnmIB4Q7yFmc37ji4o17WNqb7kq4", "1. Create a Course!W12", "Select the Entity");
		
		
		validations.validateLabelSheetsMandate(Locators.CourseModal.APPROVALPROCESSLABELUOW, "1yzjQx-Ag1-y426APnmIB4Q7yFmc37ji4o17WNqb7kq4", "1. Create a Course!U133", "1. Create a Course!Y133", "Select the Approval Process");
		validations.select(Locators.CourseModal.APPROVALPROCESSSELECETUOW, "Standard", "Select the Approval Process");
		validations.validateDropDownValuesCsvData(Locators.CourseModal.APPROVALPROCESSSELECETUOW, "1yzjQx-Ag1-y426APnmIB4Q7yFmc37ji4o17WNqb7kq4", "1. Create a Course!W133", "Select the Approval Process");
		
	
		
		validations.validateLabelSheetsMandate(Locators.CourseModal.ITEMTITLELABELUOW, "1yzjQx-Ag1-y426APnmIB4Q7yFmc37ji4o17WNqb7kq4", "1. Create a Course!U16", "1. Create a Course!Y16", "Name");
		validations.enter(Locators.CourseModal.ITEMTITLEINPUTUOW, ConstantDetails.CourseTitle, "Name ");
		
		validations.validateLabelSheetsMandate(Locators.CourseModal.IMPYEARLABELUOW, "1yzjQx-Ag1-y426APnmIB4Q7yFmc37ji4o17WNqb7kq4", "1. Create a Course!U19", "1. Create a Course!Y19", "Commencement Year");
		validations.select(Locators.CourseModal.IMPYEARSELECTUOW, ConstantDetails.ImplementationYear, "Commencement Year ");
		
		validations.click(Locators.CourseModal.CREATEBUTTON("Create"), "Create button");
		
		
		action.longWait();
		validations.validateURLContains(driver, "proposal-overview");
	    action.click(Locators.Dashboard.linkByText("Course Information"), "Course Information template");
	}

/*	@Test(groups = { "regression", "CUR-1358", "AI" })
	public void browseMenuFacultyCourseBreadcrumbValidation() throws IOException, InterruptedException, AWTException {
		Reporting.setReportingValues(this.getClass().getName());
		setup(driver);
		CurriculumHomePage homePage = new CurriculumHomePage(driver);

		String brdFaculty = navigationAndBreadText(homePage, "single");

		assertTrue(brdFaculty.contains("Faculty of Engineering"));

		brdFaculty = navigationAndBreadText(homePage, "multi");

		assertTrue(brdFaculty.contains("Faculty of Engineering"));
	}

	private String navigationAndBreadText(CurriculumHomePage homePage, String type)
			throws IOException, InterruptedException, AWTException {
		homePage.expandSideMenu();

		homePage.click(Locators.HomePage.hamburgerMenu.FACULTY, "faculty");
		Thread.sleep(400);
		homePage.click(Locators.HomePage.hamburgerMenu.FACULTYOFENGINEERING, "faculty of engineering");

		// select random course Single Degree
		List<WebElement> elements = homePage.getTabElements(By.xpath("//div[@id='" + type + "CourseUndergraduate']/a"));
		WebElement courseToSelect = elements.get(rnd.nextInt(elements.size()));

		courseToSelect.click();

		String textToReturn = driver.findElement(By.xpath("//ul//li[3]")).getText();
		homePage.click(Locators.HomePage.HOMEBTN, "HomeButton");
		return textToReturn;
	}*/
}
