package com.lifecycle.locators;

import org.openqa.selenium.By;

public class Locators {
	
	
	public static class Dashboard {

		public static By CREATEITEM = By.xpath("//button[@aria-label='Create new Academic Items']");
	
		public static By CREATEITEMMONASH = By.xpath("//button[@class='css-18h8r7r-FloatingActionButton']");
		
		public static By createItemUOW(String name) {
			By xpath = By.xpath("//button[text()='Create a new " + name  +"']");
			return xpath;
		}
		
		public static By buttonByText(String name) {
			By xpath = By.xpath("//button[text()='"+name+"']");
			return xpath;
		}
		
		public static By locatorByCell(String name) {
			By xpath = By.xpath("//button[text()='"+name+"']");
			return xpath;
		}

		
		public static By linkByText(String name) {
			By xpath = By.xpath("//a[text()='"+name+"']");
			return xpath;
		}
		
		public static By buttonContainsText(String name) {
		By xpath = By.xpath("//button[contains(text(),'"+name+"')]");
		return xpath;
		}
		
		
		public static By academicItem =  By.xpath("//*[@id='Academic Items']/div/div/div[3]/div[1]/table/tbody/tr/td[7]/a/button");
		
	
		
	}
	
	
	public static class CourseModal {

		public static By HEADING1 = By.xpath("//h1[@class='css-1ys51y0']");
		public static By HEADING2 = By.xpath("//h2[@class='css-1rc8dej']");
		public static By ITEMTYPELABEL = By.xpath("//label[@aria-label='Label for Select the type of course']/div");
		public static By ITEMTYPESELECT = By.xpath("//select[@name='broad_type']");
		public static By ITEMTITLELABEL = By.xpath("//label[@aria-label='Label for Title']/div");
		public static By ITEMTITLEINPUT = By.xpath("//input[@name='name']");
		public static By IMPYEARLABEL = By.xpath("//label[@aria-label='Label for Implementation Year']/div");
		public static By IMPYEARSELECT = By.xpath("//select[@aria-label='implementation_year']");
		public static By INITIALPROPOSALLABEL = By.xpath("//label[@aria-label='Label for Initial Proposal']/div");
		public static By INITIALPROPOSALLABELSELECT = By.xpath("//input[@class='TypeAheadList__input']");
		public static By INITIALPROPOSALLINK = By.xpath("//a[@rel='nofollow']");
		public static By ITEMCREATE = By.xpath("//button[@class='css-ghzmat-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");
		public static By CREATEBUTTON(String name) {
			By xpath = By.xpath("//button[text()='" + name  +"']");
			return xpath;
		}
		
		public static By ITEMTITLELABELMONASH = By.xpath("//label[@aria-label='Label for Course title']/div");
		public static By IMPYEARLABELMONASH = By.xpath("//label[@aria-label='Label for Implementation year']/div");
		public static By ITEMTYPELABELMONASH = By.xpath("//label[@aria-label='Label for Course type']/div");
		public static By ITEMTYPESELECTMONASH = By.xpath("//select[@name='type']");
		
		
		public static By ITEMTYPELABELUOW = By.xpath("//label[@aria-label='Label for Select the Entity']/div");
		public static By ITEMTYPESELECTUOW = By.xpath("//select[@name='entity']");
		public static By ITEMTITLELABELUOW = By.xpath("//label[@aria-label='Label for Name']/div");
		public static By ITEMTITLEINPUTUOW = By.xpath("//input[@name='name']");
		public static By IMPYEARLABELUOW = By.xpath("//label[@aria-label='Label for Commencement Year']/div");
		public static By IMPYEARSELECTUOW = By.xpath("//select[@aria-label='implementation_year']");
		public static By APPROVALPROCESSLABELUOW = By.xpath("//label[@aria-label='Label for Select the Approval Process']/div");
		public static By APPROVALPROCESSSELECETUOW = By.xpath("//select[@name='approval_process']");
		
		
	}
	
	
	public static class MajorModal {


		
		public static By ENTITYLABELUOW = By.xpath("//label[@aria-label='Label for Select the Entity']/div");
		public static By ENTITYSELECTUOW = By.xpath("//select[@name='entity']");
		public static By ITEMAWARDTYPELABELUOW = By.xpath("//label[@aria-label='Label for Award Type']/div");
		public static By ITEMAWARDSELECTUOW = By.xpath("//select[@name='study_level']");
		public static By ITEMTITLELABELUOW = By.xpath("//label[@aria-label='Label for Name']/div");
		public static By ITEMTITLEINPUTUOW = By.xpath("//input[@name='name']");
		public static By IMPYEARLABELUOW = By.xpath("//label[@aria-label='Label for Commencement Year']/div");
		public static By IMPYEARSELECTUOW = By.xpath("//select[@aria-label='implementation_year']");
		public static By APPROVALPROCESSLABELUOW = By.xpath("//label[@aria-label='Label for Select the Approval Process']/div");
		public static By APPROVALPROCESSSELECETUOW = By.xpath("//select[@name='approval_process']");
		
		
	}
	
	
	
	
	
	public static class TemplatelabelUOW {
		
		public static By Section1Heading= By.xpath("//*[@id='61ddd8b2dba0b340ac7b8a264a961917']/div[2]/div[1]/h2");
		public static By Section1Edit = By.xpath("//*[@id='61ddd8b2dba0b340ac7b8a264a961917']/div[2]/div[2]/button");
		public static By Section1Save = By.xpath("//*[@id='61ddd8b2dba0b340ac7b8a264a961917']/div[2]/div[2]/div/button[2]");
		
		public static By Section1Field1Label = By.xpath("//*[@id='e0fd1cb2dba0b340ac7b8a264a9619af']/div[2]/div/div");
		public static By Section1DateClick = By.xpath("//*[@id='e0fd1cb2dba0b340ac7b8a264a9619af']/div[3]/span/div/div/div[1]/button");
		public static By Section1DateSelect = By.xpath("//*[@id='e0fd1cb2dba0b340ac7b8a264a9619af']/div[3]/span/div/div[2]/div/div[2]/div/div/div[2]/button");
		public static By Section1Field1Data = By.xpath("//*[@id='e0fd1cb2dba0b340ac7b8a264a9619af']/div[3]/span");

		
		//section 2 locators 
		
		public static By Section2Heading= By.xpath("//*[@id='2ce343264f9a5f0044a3cf401310c7c4']/div[2]/div[1]/h2");
		public static By Section2Edit = By.xpath("//*[@id='2ce343264f9a5f0044a3cf401310c7c4']/div[2]/div[2]/button");
		public static By Section2Save = By.xpath("//*[@id='2ce343264f9a5f0044a3cf401310c7c4']/div[2]/div[2]/div/button[2]");
		

		public static By Section2Field1label = By.xpath("//*[@id='68e343264f9a5f0044a3cf401310c7c5']/div[2]/div/div");
		public static By Section2Field2label = By.xpath("//*[@id='de456f1adb687340ac7b8a264a96191f']/div[2]/div/div");
		public static By Section2Field3label = By.xpath("//*[@id='24e343264f9a5f0044a3cf401310c7c6']/div[2]/div/div");
		public static By Section2Field4label = By.xpath("//*[@id='ece343264f9a5f0044a3cf401310c7c6']/div[2]/div/div");
		public static By Section2Field5label = By.xpath("//*[@id='19a0f94adbd7130052fd96888a961988']/div[2]/div/div");
		public static By Section2Field6label = By.xpath("//*[@id='11e07d4adbd7130052fd96888a9619c9']/div[2]/div/div");
		public static By Section2Field7label = By.xpath("//*[@id='7ca66ad6db287b4052fd96888a961945']/div[2]/div/div");
		public static By Section2Field8label = By.xpath("//*[@id='a8e343264f9a5f0044a3cf401310c7c7']/div[2]/div/div");
		public static By Section2Field9label = By.xpath("//*[@id='20e343264f9a5f0044a3cf401310c7c9']/div[2]/div/div");
		public static By Section2Field10label = By.xpath("//*[@id='64e343264f9a5f0044a3cf401310c7c8']/div[2]/div/div");
		public static By Section2Field11label = By.xpath("//*[@id='739a7385dbbb170052fd96888a9619b7']/div[2]/div/div");
		public static By Section2Field12label = By.xpath("//*[@id='60e343264f9a5f0044a3cf401310c7cb']/div[2]/div/div");
		public static By Section2Field13label = By.xpath("//*[@id='2ce343264f9a5f0044a3cf401310c7cb']/div[2]/div/div");
		public static By Section2Field14label = By.xpath("//*[@id='366bae8cdb20b74052fd96888a9619ba']/div[2]/div/div");
		public static By Section2Field15label = By.xpath("//*[@id='3958af1edb687340ac7b8a264a9619c5']/div[2]/div/div");
		public static By Section2Field16label = By.xpath("//*[@id='6ce343264f9a5f0044a3cf401310c7cd']/div[2]/div/div");
		public static By Section2Field17label = By.xpath("//*[@id='99f54ed74f1e9f0044a3cf401310c78f']/div[2]/div/div");
		public static By Section2Field18label = By.xpath("//*[@id='b224cb3fdb046b0052fd96888a9619c0']/div[2]/div/div");
		
		
		
		
	
		public static By Section2Field2Data = By.xpath("//input[@name='abbreviated_name_and_major']");
		
		public static By Section2Field4Data = By.xpath("//input[@name='post_nominals']");
		public static By Section2Field5Data = By.xpath("//select[@name='parent_academic_org']");
		public static By Section2Field6Data = By.xpath("//select[@name='academic_org']");
		public static By Section2Field7Data = By.xpath("//div[@class='Form MultiSelect']/*");
		
		public static By Section2Field9Data = By.xpath("//select[@name='type']");
		public static By Section2Field10Data = By.xpath("//select[@name='aqf_level']");
		public static By Section2Field11Data = By.xpath("//input[@name='credit_points']");
		public static By Section2Field12Data = By.xpath("//input[@name='full_time_duration']");
		public static By Section2Field13Data = By.xpath("//input[@name='part_time_duration']");
		public static By Section2Field14Data = By.xpath("//input[@name='mb_1']");
		public static By Section2Field17Data = By.xpath("//textarea[@name='course_review_cluster']");
		
		//  Section 2 related records
		
		public static By Section2Field15RelatedClick = By.xpath("//*[@id='3958af1edb687340ac7b8a264a9619c5']/div[3]/div/div/div/div");
	
		public static By Section2Field15_1label = By.xpath("//*[@id='3958af1edb687340ac7b8a264a9619c5']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/label/div");
		public static By Section2Field15_2label = By.xpath("//*[@id='3958af1edb687340ac7b8a264a9619c5']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/label/div");		
		public static By Section2Field15_3label = By.xpath("//*[@id='3958af1edb687340ac7b8a264a9619c5']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/label/div");	
		
		public static By Section2Field15_1Data = By.xpath("//input[@name='code']");
		public static By Section2Field15_2Yes = By.xpath("//*[@id='3958af1edb687340ac7b8a264a9619c5']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[1]/div/label/span/input");
		public static By Section2Field15_2No = By.xpath("//*[@id='3958af1edb687340ac7b8a264a9619c5']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[2]/div/label/span/input");
		public static By Section2Field15_3Data = By.xpath("//input[@class='css-128qk4e']");
		
		
		
		public static By Section2Field16RelatedClick = By.xpath("//*[@id='6ce343264f9a5f0044a3cf401310c7cd']/div[3]/div/div/div/div");
		public static By Section2Field16_1label = By.xpath("//*[@id='6ce343264f9a5f0044a3cf401310c7cd']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/label/div");
		public static By Section2Field16_2label = By.xpath("//*[@id='6ce343264f9a5f0044a3cf401310c7cd']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/label/div");
		public static By Section2Field16_3label = By.xpath("//*[@id='6ce343264f9a5f0044a3cf401310c7cd']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/label/div");
		public static By Section2Field16_4label = By.xpath("//label[@aria-label='Label for Instances']");
		public static By Section2Field16_5label = By.xpath("//*[@id='6ce343264f9a5f0044a3cf401310c7cd']/div[3]/div/div/table/tbody/tr[2]/td/form/div[5]/label/div");

		
		public static By Section2Field16_1Data = By.xpath("//*[@id='6ce343264f9a5f0044a3cf401310c7cd']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span/div/div/input");
		
	//	public static By Section2Field16_1DataSelect = By.xpath("//*[@id='6ce343264f9a5f0044a3cf401310c7cd']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span/div/div[2]/div");
		public static By Section2Field16_1DataSelect = By.xpath("//div[@class='css-re31td']");
		public static By Section2Field16_3Yes = By.xpath("//*[@id='6ce343264f9a5f0044a3cf401310c7cd']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span/div/div[1]/div/label/span/input");
		public static By Section2Field16_3No = By.xpath("//*[@id='6ce343264f9a5f0044a3cf401310c7cd']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span/div/div[2]/div/label/span/input");
		
		public static By Section2Field16_4Data = By.xpath("//*[@id='6ce343264f9a5f0044a3cf401310c7cd']/div[3]/div/div/table/tbody/tr[2]/td/form/div[4]/div/span/div/div/div[1]/input");
		public static By Section2Field16_5Yes = By.xpath("//*[@id='6ce343264f9a5f0044a3cf401310c7cd']/div[3]/div/div/table/tbody/tr[2]/td/form/div[5]/div/span/div/div[1]/div/label/span/input");
		public static By Section2Field16_5No = By.xpath("//*[@id='6ce343264f9a5f0044a3cf401310c7cd']/div[3]/div/div/table/tbody/tr[2]/td/form/div[5]/div/span/div/div[2]/div/label/span/input");
		
		public static By Section2Field18RelatedClick = By.xpath("//*[@id='b224cb3fdb046b0052fd96888a9619c0']/div[3]/div/div/div/div");
		public static By Section2Field18_1label = By.xpath("//*[@id='b224cb3fdb046b0052fd96888a9619c0']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/label/div");
		public static By Section2Field18_2label = By.xpath("//*[@id='b224cb3fdb046b0052fd96888a9619c0']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/label/div");
		
		public static By Section2Field18_1Data = By.xpath("//*[@id='b224cb3fdb046b0052fd96888a9619c0']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span/div/div/select");
		
	
		public static By Section2Field18_2Data = By.xpath("//*[@id='b224cb3fdb046b0052fd96888a9619c0']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[1]/input");
		public static By Section2Field18_2DataClick = By.xpath("//*[@id='b224cb3fdb046b0052fd96888a9619c0']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[2]/div[1]");
		
		
		// saved data locators 
		
		public static By Section2Field2DataSaved = By.xpath("//*[@id='de456f1adb687340ac7b8a264a96191f']/div[3]/span");
		public static By Section2Field3DataSaved = By.xpath("//*[@id='24e343264f9a5f0044a3cf401310c7c6']/div[3]/span");
		public static By Section2Field4DataSaved = By.xpath("//*[@id='ece343264f9a5f0044a3cf401310c7c6']/div[3]/span");
		public static By Section2Field5DataSaved = By.xpath("//*[@id='19a0f94adbd7130052fd96888a961988']/div[3]/span");
		public static By Section2Field6DataSaved = By.xpath("//*[@id='11e07d4adbd7130052fd96888a9619c9']/div[3]/span");
		public static By Section2Field7DataSaved = By.xpath("//*[@id='7ca66ad6db287b4052fd96888a961945']/div[3]/span");
		public static By Section2Field8DataSaved = By.xpath("//*[@id='a8e343264f9a5f0044a3cf401310c7c7']/div[3]/span");
		public static By Section2Field9DataSaved = By.xpath("//*[@id='20e343264f9a5f0044a3cf401310c7c9']/div[3]/span");
		public static By Section2Field10DataSaved = By.xpath("//*[@id='64e343264f9a5f0044a3cf401310c7c8']/div[3]/span");
		public static By Section2Field11DataSaved = By.xpath("//*[@id='739a7385dbbb170052fd96888a9619b7']/div[3]/span");
		public static By Section2Field12DataSaved = By.xpath("//*[@id='60e343264f9a5f0044a3cf401310c7cb']/div[3]/span");
		public static By Section2Field13DataSaved = By.xpath("//*[@id='2ce343264f9a5f0044a3cf401310c7cb']/div[3]/span");
		public static By Section2Field14DataSaved = By.xpath("//*[@id='366bae8cdb20b74052fd96888a9619ba']/div[3]/span");
		
		public static By Section2Field17DataSaved = By.xpath("//*[@id='99f54ed74f1e9f0044a3cf401310c78f']/div[3]/span");
		
		
		// Saved data for related records
		public static By Section2Field15Chev = By.xpath("//*[@id='3958af1edb687340ac7b8a264a9619c5']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section2Field16Chev = By.xpath("//*[@id='6ce343264f9a5f0044a3cf401310c7cd']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section2Field18Chev = By.xpath("//*[@id='b224cb3fdb046b0052fd96888a9619c0']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		
		public static By Section2Field15_1DataSaved = By.xpath("//*[@id='3958af1edb687340ac7b8a264a9619c5']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span");
		public static By Section2Field15_2DataSaved = By.xpath("//*[@id='3958af1edb687340ac7b8a264a9619c5']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span");
		
		public static By Section2Field16_1DataSaved = By.xpath("//*[@id='6ce343264f9a5f0044a3cf401310c7cd']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span");
		public static By Section2Field16_2DataSaved = By.xpath("//*[@id='6ce343264f9a5f0044a3cf401310c7cd']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span");
		public static By Section2Field16_3DataSaved = By.xpath("//*[@id='6ce343264f9a5f0044a3cf401310c7cd']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span");
		
		public static By Section2Field16_5DataSaved = By.xpath("//*[@id='6ce343264f9a5f0044a3cf401310c7cd']/div[3]/div/div/table/tbody/tr[2]/td/form/div[5]/div/span");

		public static By Section2Field18_1DataSaved = By.xpath("//*[@id='b224cb3fdb046b0052fd96888a9619c0']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span");
		public static By Section2Field18_2DataSaved = By.xpath("//*[@id='b224cb3fdb046b0052fd96888a9619c0']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span");
		
		
		// Section 3 labels 
		
		public static By Section3Heading= By.xpath("//*[@id='b0e343264f9a5f0044a3cf401310c7cf']/div[2]/div[1]/h2");
		public static By Section3Edit = By.xpath("//*[@id='b0e343264f9a5f0044a3cf401310c7cf']/div[2]/div[2]/button");
		public static By Section3Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section3Field1label = By.xpath("//*[@id='7ce343264f9a5f0044a3cf401310c7cf']/div[2]/div/div");
		
		public static By Section3Field1RelatedClick = By.xpath("//*[@id=\"7ce343264f9a5f0044a3cf401310c7cf\"]/div[3]/div/div/div/div");

		
		
		public static By Section3Field3_1label = By.xpath("//label[@aria-label='Label for On Offer']");
		public static By Section3Field3_2label = By.xpath("//label[@aria-label='Label for Delivery Location']");
		public static By Section3Field3_3label = By.xpath("//label[@aria-label='Label for Intake/s']");
		public static By Section3Field3_4label = By.xpath("//label[@aria-label='Label for Delivery Mode']");
		public static By Section3Field3_5label = By.xpath("//label[@aria-label='Label for Course Instance Name']");
		public static By Section3Field3_6label = By.xpath("//label[@aria-label='Label for Instance Tag Name']");
		public static By Section3Field3_7label = By.xpath("//label[@aria-label='Label for Student Type']");
		public static By Section3Field3_8label = By.xpath("//label[@aria-label='Label for Additional Details']");
		public static By Section3Field3_9label = By.xpath("//label[@aria-label='Label for Rationale for Instance']");
		public static By Section3Field3_10label = By.xpath("//label[@aria-label='Label for Rationale Description']");
		
		
		public static By Section3Field3_1Yes = By.xpath("//*[@id='7ce343264f9a5f0044a3cf401310c7cf']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span/div/div[1]/div/label/span/input");
		public static By Section3Field3_1No = By.xpath("//*[@id='7ce343264f9a5f0044a3cf401310c7cf']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span/div/div[2]/div/label/span/input");
		public static By Section3Field3_2Data = By.xpath("//input[@class='TypeAheadList__input']");
		public static By Section3Field3_2DataClick = By.xpath("//*[@id='7ce343264f9a5f0044a3cf401310c7cf']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[2]/div[1]");
		public static By Section3Field3_3Data = By.xpath("//select[@name='admission_calendar']");
		public static By Section3Field3_4Data = By.xpath("//select[@name='mode']");
		public static By Section3Field3_5Data = By.xpath("//input[@name='ext_id']");
		
	    public static By Section3Field3_7Data = By.xpath("//div[@class='Form MultiSelect']/*");
		public static By Section3Field3_8Data = By.xpath("//textarea[@name='comments']");
		public static By Section3Field3_9Data = By.xpath("//select[@aria-label='delivery_collaborators']");
		public static By Section3Field3_10Data = By.xpath("//textarea[@aria-label='collaborator_details']");
		
		public static By Section3Field1Chev = By.xpath("//*[@id='7ce343264f9a5f0044a3cf401310c7cf']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section3Field3_1DataSaved = By.xpath("//label[@aria-label='Label for On Offer']/following-sibling::div/span");
		public static By Section3Field3_2DataSaved = By.xpath("//label[@aria-label='Label for Delivery Location']/following-sibling::div/span");
		public static By Section3Field3_3DataSaved = By.xpath("//label[@aria-label='Label for Intake/s']/following-sibling::div/span");
		public static By Section3Field3_4DataSaved = By.xpath("//label[@aria-label='Label for Delivery Mode']/following-sibling::div/span");
		public static By Section3Field3_5DataSaved = By.xpath("//label[@aria-label='Label for Course Instance Name']/following-sibling::div/span");
		public static By Section3Field3_6DataSaved = By.xpath("//label[@aria-label='Label for Instance Tag Name']/following-sibling::div/span");
		public static By Section3Field3_7DataSaved = By.xpath("//label[@aria-label='Label for Student Type']/following-sibling::div/span");
		public static By Section3Field3_8DataSaved = By.xpath("//label[@aria-label='Label for Additional Details']/following-sibling::div/span");
		public static By Section3Field3_9DataSaved = By.xpath("//label[@aria-label='Label for Rationale for Instance']/following-sibling::div/span");
		public static By Section3Field3_10DataSaved = By.xpath("//label[@aria-label='Label for Rationale Description']/following-sibling::div/span");
		
		
		//section 4 locators
		
		public static By Section4Heading= By.xpath("//*[@id='b8e343264f9a5f0044a3cf401310c7e7']/div[2]/div[1]/h2");
		public static By Section4Edit = By.xpath("//*[@id='b8e343264f9a5f0044a3cf401310c7e7']/div[2]/div[2]/button");
		public static By Section4Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section4Field1label = By.xpath("//*[@id='c1ec9832dba0b340ac7b8a264a9619ff']/div[2]/div/div");
		public static By Section4Field2label = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7e8']/div[2]/div/div");
		public static By Section4Field3label = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7e9']/div[2]/div/div");
		
		
		
		public static By Section4Field2_1label = By.xpath("//label[@aria-label='Label for Type of Requirement']");
		public static By Section4Field2_2label = By.xpath("//label[@aria-label='Label for Number of Weeks']");
		public static By Section4Field2_3label = By.xpath("//label[@aria-label='Label for Total Number of Hours']");
		public static By Section4Field2_4label = By.xpath("//label[@aria-label='Label for Hours Per Week']");
		public static By Section4Field2_5label = By.xpath("//label[@aria-label='Label for Additional Information']");
	
		public static By Section4Field1Yes = By.xpath("//*[@id='c1ec9832dba0b340ac7b8a264a9619ff']/div[3]/span/div/div[1]/div/label/span/input");
		public static By Section4Field1No = By.xpath("//*[@id='c1ec9832dba0b340ac7b8a264a9619ff']/div[3]/span/div/div[2]/div/label/span/input");
		
		public static By Section4Field2RelatedClick = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7e8']/div[3]/div/div/div/div");

		public static By Section4Field2_1Data = By.xpath("//select[@aria-label='type']");
		public static By Section4Field2_2Data = By.xpath("//input[@aria-label='week_count']");
		public static By Section4Field2_3Data = By.xpath("//input[@aria-label='total_hours']");
		public static By Section4Field2_4Data = By.xpath("//input[@aria-label='hours_per_week']");
		public static By Section4Field2_5Data = By.xpath("//textarea[@aria-label='additional_information']");

		
		
		public static By Section4Field3Yes = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7e9']/div[3]/span/div/div[1]/div/label/span/input");
		public static By Section4Field3No = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7e9']/div[3]/span/div/div[2]/div/label/span/input");
		
        // Data saved locators
		
		public static By Section4Field2Chev = By.xpath("//*[@id=\"74e343264f9a5f0044a3cf401310c7e8\"]/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		
		
		
		public static By Section4Field1DataSaved = By.xpath("//*[@id=\"c1ec9832dba0b340ac7b8a264a9619ff\"]/div[3]/span");
	
		public static By Section4Field2_1DataSaved = By.xpath("//label[@aria-label='Label for Type of Requirement']/following-sibling::div/span");
		public static By Section4Field2_2DataSaved = By.xpath("//label[@aria-label='Label for Number of Weeks']/following-sibling::div/span");
		public static By Section4Field2_3DataSaved = By.xpath("//label[@aria-label='Label for Total Number of Hours']/following-sibling::div/span");
		public static By Section4Field2_4DataSaved = By.xpath("//label[@aria-label='Label for Hours Per Week']/following-sibling::div/span");
		public static By Section4Field2_5DataSaved = By.xpath("//label[@aria-label='Label for Additional Information']/following-sibling::div/span");

		public static By Section4Field3DataSaved = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7e9']/div[3]/span");
		
		
			
		
		//section 5 locators
		
		public static By Section5Heading= By.xpath("//*[@id='3ce343264f9a5f0044a3cf401310c7d0']/div[2]/div[1]/h2");
		public static By Section5Edit = By.xpath("//*[@id='3ce343264f9a5f0044a3cf401310c7d0']/div[2]/div[2]/button");
		public static By Section5Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section5Field1label = By.xpath("//*[@id='f4e343264f9a5f0044a3cf401310c7d1']/div[2]/div/div");
		public static By Section5Field2label = By.xpath("//*[@id='b0e343264f9a5f0044a3cf401310c7d2']/div[2]/div/div");
		
		public static By Section5Field1Data = By.xpath("//div[@class='Form MultiSelect']/*");
		public static By Section5Field2Data = By.xpath("//textarea[@aria-label='additional_application_info']");
		
		
        // Data saved locators
		
		public static By Section5Field1DataSaved = By.xpath("//*[@id='f4e343264f9a5f0044a3cf401310c7d1']/div[3]/span");
		public static By Section5Field2DataSaved = By.xpath("//*[@id='b0e343264f9a5f0044a3cf401310c7d2']/div[3]/span");
		
		
		//section 6 locators
		
		public static By Section6Heading= By.xpath("//*[@id='7ce343264f9a5f0044a3cf401310c7d2']/div[2]/div[1]/h2");
		public static By Section6Edit = By.xpath("//*[@id='7ce343264f9a5f0044a3cf401310c7d2']/div[2]/div[2]/button");
		public static By Section6Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section6Field1label = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[2]/div/div");
		public static By Section6Field2label = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[2]/div/div");
		public static By Section6Field3label = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[2]/div/div");
		public static By Section6Field4label = By.xpath("//*[@id='3dbeb326db60b340ac7b8a264a9619cc']/div[2]/div/div");
		public static By Section6Field5label = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[2]/div/div");
		public static By Section6Field6label = By.xpath("//*[@id='b4e343264f9a5f0044a3cf401310c7da']/div[2]/div/div");
		public static By Section6Field7label = By.xpath("//*[@id='bce343264f9a5f0044a3cf401310c7d4']/div[2]/div/div");
		public static By Section6Field8label = By.xpath("//*[@id='78e343264f9a5f0044a3cf401310c7d5']/div[2]/div/div");
		public static By Section6Field9label = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7d6']/div[2]/div/div");
		public static By Section6Field10label = By.xpath("//*[@id='fce343264f9a5f0044a3cf401310c7d6']/div[2]/div/div");
		public static By Section6Field11label = By.xpath("//*[@id='b8e343264f9a5f0044a3cf401310c7d7']/div[2]/div/div");
		public static By Section6Field12label = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7d8']/div[2]/div/div");
		public static By Section6Field13label = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7d9']/div[2]/div/div");
	
		public static By Section6Field1RelatedClick = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/div/div");
		public static By Section6Field2RelatedClick = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/div/div");
		public static By Section6Field3RelatedClick = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/div/div");
		public static By Section6Field4RelatedClick = By.xpath("//*[@id='3dbeb326db60b340ac7b8a264a9619cc']/div[3]/div/div/div/div");
		public static By Section6Field5RelatedClick = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/div/div");

		public static By Section6Field1_1label = By.xpath("//label[@aria-label='Label for Minimum ATAR']");
		public static By Section6Field1_2label = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/label/div");
		public static By Section6Field1_3label = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/label/div");
		public static By Section6Field1_1Data = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span/div/div/input");
		public static By Section6Field1_2Yes = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[1]/div/label/span/input");
		public static By Section6Field1_2No = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[2]/div/label/span/input");
		public static By Section6Field1_3Data = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span/div/div/div[1]/input");
		public static By Section6Field1_3DataClick = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span/div/div/div[2]/div/label");
	
		
		
		public static By Section6Field2_1label = By.xpath("//label[@aria-label='Label for Guaranteed Selection Rank']");
		public static By Section6Field2_2label = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/label/div");
		public static By Section6Field2_3label = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/label/div");
		public static By Section6Field2_1Data = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span/div/div/input");
		public static By Section6Field2_2Yes = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[1]/div/label/span/input");
		public static By Section6Field2_2No = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[2]/div/label/span/input");
		public static By Section6Field2_3Data = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span/div/div/div[1]/input");
		public static By Section6Field2_3DataClick = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span/div/div/div[2]/div/label");
	
		
		
		public static By Section6Field3_1label = By.xpath("//label[@aria-label='Label for Additional Selection Criteria Information']");
		public static By Section6Field3_2label = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/label/div");
		public static By Section6Field3_3label = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/label/div");
		public static By Section6Field3_1Data = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span/div/div/textarea");
		public static By Section6Field3_2Yes = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[1]/div/label/span/input");
		public static By Section6Field3_2No = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[2]/div/label/span/input");
		public static By Section6Field3_3Data = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span/div/div/div[1]/input");
		public static By Section6Field3_3DataClick = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span/div/div/div[2]/div/label");
	
		public static By Section6Field4_1label = By.xpath("//label[@aria-label='Label for Type']");
		public static By Section6Field4_2label = By.xpath("//*[@id='3dbeb326db60b340ac7b8a264a9619cc']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/label/div");
		public static By Section6Field4_1Data = By.xpath("//select[@aria-label='domain']");
		public static By Section6Field4_2Data = By.xpath("//*[@id='3dbeb326db60b340ac7b8a264a9619cc']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div/textarea");
	
		
		public static By Section6Field5_1label = By.xpath("//label[@aria-label='Label for UAC']");
		public static By Section6Field5_2label = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/label/div");
		public static By Section6Field5_3label = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/label/div");
		public static By Section6Field5_1Data = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span/div/div/input");
		public static By Section6Field5_2Yes = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[1]/div/label/span/input");
		public static By Section6Field5_2No = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[2]/div/label/span/input");
		public static By Section6Field5_3Data = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span/div/div/div[1]/input");
		public static By Section6Field5_3DataClick = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span/div/div/div[2]/div/label");
	
		
		public static By Section6Field6Data = By.xpath("//textarea[@aria-label='early_admission']");
		public static By Section6Field7Data = By.xpath("//textarea[@aria-label='vocational_education']");
		public static By Section6Field8Data = By.xpath("//textarea[@aria-label='higher_education_study']");
		public static By Section6Field9Data = By.xpath("//textarea[@aria-label='undergraduate_qualification']");
		public static By Section6Field10Data = By.xpath("//textarea[@aria-label='weighted_average_mark']");
		public static By Section6Field11Data = By.xpath("//textarea[@aria-label='other_tertiary_qualifications']");
		public static By Section6Field12Data = By.xpath("//textarea[@aria-label='work_experience']");
		public static By Section6Field13Data = By.xpath("//textarea[@aria-label='other_admission_reqs']");
		
		
        // Data saved locators
		
		public static By Section6Field1Chev = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section6Field1_1DataSaved = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span");
		public static By Section6Field1_2DataSaved = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span");
		public static By Section6Field1_3DataSaved = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span");

		public static By Section6Field2Chev = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section6Field2_1DataSaved = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span");
		public static By Section6Field2_2DataSaved = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span");
		public static By Section6Field2_3DataSaved = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span");

		public static By Section6Field3Chev = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section6Field3_1DataSaved = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span");
		public static By Section6Field3_2DataSaved = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span");
		public static By Section6Field3_3DataSaved = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span");

		public static By Section6Field4Chev = By.xpath("//*[@id='3dbeb326db60b340ac7b8a264a9619cc']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section6Field4_1DataSaved = By.xpath("//*[@id='3dbeb326db60b340ac7b8a264a9619cc']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span");
		public static By Section6Field4_2DataSaved = By.xpath("//*[@id='3dbeb326db60b340ac7b8a264a9619cc']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span");

		public static By Section6Field5Chev = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section6Field5_1DataSaved = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span");
		public static By Section6Field5_2DataSaved = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span");
		public static By Section6Field5_3DataSaved = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span");

		
		public static By Section6Field6DataSaved = By.xpath("//*[@id='b4e343264f9a5f0044a3cf401310c7da']/div[3]/span");
		public static By Section6Field7DataSaved = By.xpath("//*[@id='bce343264f9a5f0044a3cf401310c7d4']/div[3]/span");
		public static By Section6Field8DataSaved = By.xpath("//*[@id='78e343264f9a5f0044a3cf401310c7d5']/div[3]/span");
		public static By Section6Field9DataSaved = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7d6']/div[3]/span");
		public static By Section6Field10DataSaved = By.xpath("//*[@id='fce343264f9a5f0044a3cf401310c7d6']/div[3]/span");
		public static By Section6Field11DataSaved = By.xpath("//*[@id='b8e343264f9a5f0044a3cf401310c7d7']/div[3]/span");
		public static By Section6Field12DataSaved = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7d8']/div[3]/span");
		public static By Section6Field13DataSaved = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7d9']/div[3]/span");
		
		// section 7 locators
		
		
		public static By Section7Heading= By.xpath("//*[@id='70e343264f9a5f0044a3cf401310c7db']/div[2]/div[1]/h2");
		public static By Section7Edit = By.xpath("//*[@id='70e343264f9a5f0044a3cf401310c7db']/div[2]/div[2]/button");
		public static By Section7Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section7Field1label = By.xpath("//*[@id='b0e343264f9a5f0044a3cf401310c7dd']/div[2]/div/div");
		public static By Section7Field2label = By.xpath("//*[@id='f4e343264f9a5f0044a3cf401310c7dc']/div[2]/div/div");
		
		
		public static By Section7Field1_1label = By.xpath("//label[@aria-label='Label for English Language Test']");
		public static By Section7Field1_2label = By.xpath("//label[@aria-label='Label for Overall Score']");
		public static By Section7Field1_3label = By.xpath("//label[@aria-label='Label for Reading Score ']");
		public static By Section7Field1_4label = By.xpath("//label[@aria-label='Label for Writing Score ']");
		public static By Section7Field1_5label = By.xpath("//label[@aria-label='Label for Listening Score ']");
		public static By Section7Field1_6label = By.xpath("//label[@aria-label='Label for Speaking Score ']");
	
		
		public static By Section7Field1RelatedClick = By.xpath("//*[@id='b0e343264f9a5f0044a3cf401310c7dd']/div[3]/div/div/div/div");

		public static By Section7Field1_1Data = By.xpath("//select[@aria-label='english_language_test']");
		public static By Section7Field1_2Data = By.xpath("//input[@aria-label='overall_score']");
		public static By Section7Field1_3Data = By.xpath("//input[@aria-label='reading_score']");
		public static By Section7Field1_4Data = By.xpath("//input[@aria-label='writing_score']");
		public static By Section7Field1_5Data = By.xpath("//input[@aria-label='listening_score']");
		public static By Section7Field1_6Data = By.xpath("//input[@aria-label='speaking_score']");
		
		public static By Section7Field2Data = By.xpath("//textarea[@aria-label='mb_2']");

		
        // Data saved locators
		
		public static By Section7Field1Chev = By.xpath("//*[@id='b0e343264f9a5f0044a3cf401310c7dd']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");

		public static By Section7Field1_1DataSaved = By.xpath("//label[@aria-label='Label for English Language Test']/following-sibling::div/span");
		public static By Section7Field1_2DataSaved = By.xpath("//label[@aria-label='Label for Overall Score']/following-sibling::div/span");
		public static By Section7Field1_3DataSaved = By.xpath("//label[@aria-label='Label for Reading Score ']/following-sibling::div/span");
		public static By Section7Field1_4DataSaved = By.xpath("//label[@aria-label='Label for Writing Score ']/following-sibling::div/span");
		public static By Section7Field1_5DataSaved = By.xpath("//label[@aria-label='Label for Listening Score ']/following-sibling::div/span");
		public static By Section7Field1_6DataSaved = By.xpath("//label[@aria-label='Label for Speaking Score ']/following-sibling::div/span");
		
		public static By Section7Field2DataSaved = By.xpath("//*[@id='f4e343264f9a5f0044a3cf401310c7dc']/div[3]/span");
		
		
		// section 8 locators
		
		
		public static By Section8Heading= By.xpath("//*[@id='c1e343264f9a5f0044a3cf401310c7fe']/div[2]/div[1]/h2");
		public static By Section8Edit = By.xpath("//*[@id='c1e343264f9a5f0044a3cf401310c7fe']/div[2]/div[2]/button");
		public static By Section8Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section8Field1label = By.xpath("//*[@id='8de343264f9a5f0044a3cf401310c7fe']/div[2]/div/div");
		public static By Section8Field2label = By.xpath("//*[@id='22d626274fde9f004beec61f0310c773']/div[2]/div/div");
		public static By Section8Field3label = By.xpath("//*[@id='b04fd9494f2253004beec61f0310c72a']/div[2]/div/div");
		public static By Section8Field4label = By.xpath("//*[@id='ac94028bdb97130052fd96888a9619c6']/div[2]/div/div");
		
		
		public static By Section8Field2_1label = By.xpath("//label[@aria-label='Label for Code']");
		public static By Section8Field2_2label = By.xpath("//label[@aria-label='Label for Description']");
		public static By Section8Field2_3label = By.xpath("//label[@aria-label='Label for Number']");
		public static By Section8Field2_4label = By.xpath("//label[@aria-label='Label for AQF KSAs']");
	
	
		public static By Section8Field1Data = By.xpath("//textarea[@aria-label='detailed_narrative']");	
		public static By Section8Field2RelatedClick = By.xpath("//*[@id='22d626274fde9f004beec61f0310c773']/div[3]/div/div/div/div");

		//	public static By Section8Field2_1Data = By.xpath("//select[@aria-label='type']"); 
		public static By Section8Field2_2Data = By.xpath("//textarea[@aria-label='description']");
		public static By Section8Field2_3Data = By.xpath("//input[@aria-label='number']");
		public static By Section8Field2_4Data = By.xpath("//div[@class='Form MultiSelect']/*");

		public static By Section8Field3Data = By.xpath("//textarea[@aria-label='wil_additional_detail']");
		public static By Section8Field4Data = By.xpath("//textarea[@aria-label='inherent_requirements']");
		
        // Data saved locators
		
		public static By Section8Field2Chev = By.xpath("//*[@id='22d626274fde9f004beec61f0310c773']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");

		public static By Section8Field1DataSaved = By.xpath("//*[@id='8de343264f9a5f0044a3cf401310c7fe']/div[3]/span");
	
		public static By Section8Field2_1DataSaved = By.xpath("//label[@aria-label='Label for Code']/following-sibling::div/span");
		public static By Section8Field2_2DataSaved = By.xpath("//*[@id='22d626274fde9f004beec61f0310c773']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span");
		public static By Section8Field2_3DataSaved = By.xpath("//label[@aria-label='Label for Number']/following-sibling::div/span");
		public static By Section8Field2_4DataSaved = By.xpath("//label[@aria-label='Label for AQF KSAs']/following-sibling::div/span");

		public static By Section8Field3DataSaved = By.xpath("//*[@id='b04fd9494f2253004beec61f0310c72a']/div[3]/span");
		public static By Section8Field4DataSaved = By.xpath("//*[@id='ac94028bdb97130052fd96888a9619c6']/div[3]/span");
		
		
		//added by Rishu
		//section 11 locators 
			//Locators for heading (label), save and edit buttons for this section
			public static By Section11Heading= By.xpath("//*[@id='38e343264f9a5f0044a3cf401310c7ef']/div[2]/div[1]/h2");
			public static By Section11Edit = By.xpath("//*[@id='38e343264f9a5f0044a3cf401310c7ef']/div[2]/div[2]/button");
			public static By Section11Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");
	
			//locators for this section field labels
			public static By Section11Field1label = By.xpath("//*[@id='f0e343264f9a5f0044a3cf401310c7f0']/div[2]/div/div");
			public static By Section11Field2label = By.xpath("//*[@id='bce343264f9a5f0044a3cf401310c7f0']/div[2]/div/div");
			
			//Locators for saving data (input fields)
			public static By Section11Field1Data = By.xpath("//textarea[@aria-label='course_offering']");
			public static By Section11Field2Data = By.xpath("//textarea[@aria-label='subject_offering']");
			
			//Locators to fetch saved data from fields
			public static By Section11Field1DataSaved = By.xpath("//*[@id='f0e343264f9a5f0044a3cf401310c7f0']/div[3]/span");
			public static By Section11Field2DataSaved = By.xpath("//*[@id='bce343264f9a5f0044a3cf401310c7f0']/div[3]/span");
		//End of section 11 locators
		
		
		// section 9 locators
		
		
		public static By Section9Heading= By.xpath("//*[@id='c06d870fdbd4374052fd96888a96199a']/div[2]/div[1]/h2");
		public static By Section9Edit = By.xpath("//*[@id='c06d870fdbd4374052fd96888a96199a']/div[2]/div[2]/button");
		public static By Section9Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");
	
		public static By Section9Field1label = By.xpath("//*[@id='b8e343264f9a5f0044a3cf401310c7ea']/div[2]/div/div");
		
		public static By Section9Field1Data = By.xpath("//textarea[@aria-label='description']");	

        // Data saved locators
		
		public static By Section9Field1DataSaved = By.xpath("//*[@id='b8e343264f9a5f0044a3cf401310c7ea']/div[3]/span");

		
		
		// section 10 locators
		
		
		public static By Section10Heading= By.xpath("//*[@id='fce343264f9a5f0044a3cf401310c7e9']/div[2]/div[1]/h2");
		public static By Section10Edit = By.xpath("//*[@id='fce343264f9a5f0044a3cf401310c7e9']/div[2]/div[2]/button");
		public static By Section10Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section10Field1label = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7eb']/div[2]/div/div");
		public static By Section10Field2label = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7ec']/div[2]/div/div");
		public static By Section10Field3label = By.xpath("//*[@id='f8e343264f9a5f0044a3cf401310c7ec']/div[2]/div/div");
		//	public static By Section10Field4label = By.xpath("//*[@id='ac94028bdb97130052fd96888a9619c6']/div[2]/div/div");
		
		
		public static By Section10Field1_1label = By.xpath("//label[@aria-label='Label for Rule']");
		public static By Section10Field1_1Data = By.xpath("//textarea[@aria-label='description']");	
		public static By Section10Field1RelatedClick = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7eb']/div[3]/div/div/div/div");
		
		public static By Section10Field2_1label = By.xpath("//label[@aria-label='Label for Structure Additional Comment']");
		public static By Section10Field2_1Data = By.xpath("//label[@aria-label='Label for Structure Additional Comment']/following-sibling::div/span/div/div/textarea");
		public static By Section10Field2RelatedClick = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7ec']/div[3]/div/div/div/div");

		public static By Section10Field3Data = By.xpath("//select[@aria-label='honours_grade_method']");
		
        // Data saved locators
		
		public static By Section10Field1Chev = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7eb']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section10Field1_1DataSaved = By.xpath("//label[@aria-label='Label for Rule']/following-sibling::div/span");
	
		public static By Section10Field2Chev = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7ec']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section10Field2_1DataSaved = By.xpath("//label[@aria-label='Label for Structure Additional Comment']/following-sibling::div/span");

		public static By Section10Field3DataSaved = By.xpath("//*[@id='f8e343264f9a5f0044a3cf401310c7ec']/div[3]/span");
	
		
		
		//section 12 locators
		
		public static By Section12Heading= By.xpath("//*[@id='78e343264f9a5f0044a3cf401310c7f1']/div[2]/div[1]/h2");
		public static By Section12Edit = By.xpath("//*[@id='78e343264f9a5f0044a3cf401310c7f1']/div[2]/div[2]/button");
		public static By Section12Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section12Field1label = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7f2']/div[2]/div/div");
		public static By Section12Field2label = By.xpath("//*[@id='f8e343264f9a5f0044a3cf401310c7f3']/div[2]/div/div");
		public static By Section12Field3label = By.xpath("//*[@id='619be98adbec3340ac7b8a264a9619c7']/div[2]/div/div");
		public static By Section12Field4label = By.xpath("//*[@id='38e343264f9a5f0044a3cf401310c7f8']/div[2]/div/div");
		public static By Section12Field5label = By.xpath("//*[@id='f0e343264f9a5f0044a3cf401310c7f9']/div[2]/div/div");
		public static By Section12Field6label = By.xpath("//*[@id='d71946d74f1a9f004beec61f0310c720']/div[2]/div/div");

		
		public static By Section12Field3_1label = By.xpath("//label[@aria-label='Label for Transformation Practice']");
		public static By Section12Field3_2label = By.xpath("//label[@aria-label='Label for Description']");
	
		public static By Section12Field1Data = By.xpath("//input[@type='text']");
		public static By Section12Field1DataClick = By.xpath("//div[@class='css-re31td']");
		
		public static By Section12Field2DateClick = By.xpath("//button[@class='css-1j77qaq-PlainButton-ButtonCommonStyle-ButtonFont-InvertedPlainButton-DatePickerIconButton']");
		public static By Section12Field2DateSelect = By.xpath("//div[@class='react-calendar__month-view__days']/button");

		
		public static By Section12Field3RelatedClick = By.xpath("//div[@class='DetailRelatedRecord RelatedRecord--editing']");

		public static By Section12Field3_1Data = By.xpath("//select[@aria-label='type']");
		public static By Section12Field3_2Data = By.xpath("//textarea[@aria-label='description']");
	
		public static By Section12Field4Data = By.xpath("//textarea[@aria-label='elp_scaffolding']");
		public static By Section12Field5Data = By.xpath("//textarea[@aria-label='wil_subjects']");
		public static By Section12Field6Data = By.xpath("//textarea[@aria-label='mb_3']");

		
        // Data saved locators
		
		public static By Section12Field1DataSaved = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7f2']/div[3]/span");
		public static By Section12Field2DataSaved = By.xpath("//*[@id='f8e343264f9a5f0044a3cf401310c7f3']/div[3]/span");
		
		public static By Section12Field3Chev = By.xpath("//*[@id='619be98adbec3340ac7b8a264a9619c7']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section12Field3_1DataSaved = By.xpath("//label[@aria-label='Label for Transformation Practice']/following-sibling::div/span");
		public static By Section12Field3_2DataSaved = By.xpath("//*[@id=\"619be98adbec3340ac7b8a264a9619c7\"]/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span"); 
		
		public static By Section12Field4DataSaved = By.xpath("//*[@id='38e343264f9a5f0044a3cf401310c7f8']/div[3]/span");
		public static By Section12Field5DataSaved = By.xpath("//*[@id='f0e343264f9a5f0044a3cf401310c7f9']/div[3]/span");
		public static By Section12Field6DataSaved = By.xpath("//*[@id='d71946d74f1a9f004beec61f0310c720']/div[3]/span");
		
	    //section 13 locators
		
		public static By Section13Heading= By.xpath("//*[@id='70e343264f9a5f0044a3cf401310c7fa']/div[2]/div[1]/h2");
		public static By Section13Edit = By.xpath("//*[@id='70e343264f9a5f0044a3cf401310c7fa']/div[2]/div[2]/button");
		public static By Section13Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section13Field1label = By.xpath("//*[@id='3ce343264f9a5f0044a3cf401310c7fa']/div[2]/div/div");
		public static By Section13Field2label = By.xpath("//*[@id='f4e343264f9a5f0044a3cf401310c7fb']/div[2]/div/div");

		public static By Section13Field1Data = By.xpath("//textarea[@aria-label='content_overview']");
		public static By Section13Field2Data = By.xpath("//textarea[@aria-label='pedagogical_design']");

		
        // Data saved locators
		
		public static By Section13Field1DataSaved = By.xpath("//*[@id='3ce343264f9a5f0044a3cf401310c7fa']/div[3]/span");
		public static By Section13Field2DataSaved = By.xpath("//*[@id='f4e343264f9a5f0044a3cf401310c7fb']/div[3]/span");

		
	    //section 14 locators
		
		public static By Section14Heading= By.xpath("//*[@id='f8e343264f9a5f0044a3cf401310c7e3']/div[2]/div[1]/h2");
		public static By Section14Edit = By.xpath("//*[@id='f8e343264f9a5f0044a3cf401310c7e3']/div[2]/div[2]/button");
		public static By Section14Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section14Field1label = By.xpath("//*[@id='b4e343264f9a5f0044a3cf401310c7e4']/div[2]/div/div");
		public static By Section14Field2label = By.xpath("//*[@id='70e343264f9a5f0044a3cf401310c7e5']/div[2]/div/div");
		public static By Section14Field3label = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7e6']/div[2]/div/div");
		public static By Section14Field4label = By.xpath("//*[@id='682a46d74f1a9f004beec61f0310c72e']/div[2]/div/div");
		
		public static By Section14Field2RelatedClick = By.xpath("//*[@id='70e343264f9a5f0044a3cf401310c7e5']/div[3]/div");
		public static By Section14Field3RelatedClick = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7e6']/div[3]/div");
		public static By Section14Field4RelatedClick = By.xpath("//*[@id='682a46d74f1a9f004beec61f0310c72e']/div[3]/div");
		
		public static By Section14Field1Yes = By.xpath("//*[@id='b4e343264f9a5f0044a3cf401310c7e4']/div[3]/span/div/div[1]/div/label/span/input");
		public static By Section14Field1No = By.xpath("//*[@id='b4e343264f9a5f0044a3cf401310c7e4']/div[3]/span/div/div[2]/div/label/span/input");

		public static By Section14Field2_1label = By.xpath("//label[@aria-label='Label for Offshore Delivery Partner']");
		public static By Section14Field2_2label = By.xpath("//label[@aria-label='Label for Amendments']");
		public static By Section14Field2_1Data = By.xpath("//input[@aria-label='offshore_delivery_partner']");
		public static By Section14Field2_2Data = By.xpath("//textarea[@aria-label='amendments']");
	
		public static By Section14Field3_1Label = By.xpath("//label[@aria-label='Label for Partner Name']");
		public static By Section14Field3_2Label = By.xpath("//label[@aria-label='Label for Arrangement Type']");
		public static By Section14Field3_3Label = By.xpath("//label[@aria-label='Label for Partnership Approval']");
		public static By Section14Field3_4Label = By.xpath("//label[@aria-label='Label for Details of Delivery']");
		public static By Section14Field3_5Label = By.xpath("//label[@aria-label='Label for Executed Agreement']");
		public static By Section14Field3_6Label = By.xpath("//label[@aria-label='Label for QA Arrangements']");
		
		public static By Section14Field3_1Data = By.xpath("//input[@aria-label='partner_name']");
		public static By Section14Field3_2Data = By.xpath("//div[@class='Form MultiSelect']/*");
		public static By Section14Field3_3Data = By.xpath("//textarea[@aria-label='partnership_approval']");
		public static By Section14Field3_4Data = By.xpath("//textarea[@aria-label='delivery_details']");
		public static By Section14Field3_5Yes = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7e6']/div[3]/div/div/table/tbody/tr[2]/td/form/div[5]/div/span/div/div[1]/div/label/span/input");
		public static By Section14Field3_5No = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7e6']/div[3]/div/div/table/tbody/tr[2]/td/form/div[5]/div/span/div/div[2]/div/label/span/input");
		public static By Section14Field3_6Data = By.xpath("//textarea[@aria-label='qa_arrangements']");
	
		
		public static By Section14Field4_1Label = By.xpath("//label[@aria-label='Label for Course Management']");
		public static By Section14Field4_2Label = By.xpath("//label[@aria-label='Label for Pre-Enrolment Engagement to Students ']");
		public static By Section14Field4_3Label = By.xpath("//label[@aria-label='Label for Care for and Services to Students ']");
		public static By Section14Field4_4Label = By.xpath("//label[@aria-label='Label for Student Visa Requirements ']");
		
		
		public static By Section14Field4_1Data = By.xpath("//textarea[@aria-label='course_management']");
		public static By Section14Field4_2Data = By.xpath("//textarea[@aria-label='pre_enrolment_engagement']");
		public static By Section14Field4_3Data = By.xpath("//textarea[@aria-label='student_care_and_services']");
		public static By Section14Field4_4Data = By.xpath("//textarea[@aria-label='visa_requirements']");

		
        // Data saved locators
		
		public static By Section14Field1DataSaved = By.xpath("//*[@id='b4e343264f9a5f0044a3cf401310c7e4']/div[3]/span");
	
		public static By Section14Field2Chev = By.xpath("//*[@id='70e343264f9a5f0044a3cf401310c7e5']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section14Field3Chev = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7e6']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section14Field4Chev = By.xpath("//*[@id='682a46d74f1a9f004beec61f0310c72e']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		
		public static By Section14Field2_1DataSaved = By.xpath("//label[@aria-label='Label for Offshore Delivery Partner']/following-sibling::div/span");
		public static By Section14Field2_2DataSaved = By.xpath("//label[@aria-label='Label for Amendments']/following-sibling::div/span");

		public static By Section14Field3_1DataSaved = By.xpath("//label[@aria-label='Label for Partner Name']/following-sibling::div/span");
		public static By Section14Field3_2DataSaved = By.xpath("//label[@aria-label='Label for Arrangement Type']/following-sibling::div/span");
		public static By Section14Field3_3DataSaved = By.xpath("//label[@aria-label='Label for Partnership Approval']/following-sibling::div/span");
		public static By Section14Field3_4DataSaved = By.xpath("//label[@aria-label='Label for Details of Delivery']/following-sibling::div/span");
		public static By Section14Field3_5DataSaved = By.xpath("//label[@aria-label='Label for Executed Agreement']/following-sibling::div/span");
		public static By Section14Field3_6DataSaved = By.xpath("//label[@aria-label='Label for QA Arrangements']/following-sibling::div/span");

		public static By Section14Field4_1DataSaved = By.xpath("//label[@aria-label='Label for Course Management']/following-sibling::div/span");
		public static By Section14Field4_2DataSaved = By.xpath("//label[@aria-label='Label for Pre-Enrolment Engagement to Students ']/following-sibling::div/span");
		public static By Section14Field4_3DataSaved = By.xpath("//label[@aria-label='Label for Care for and Services to Students ']/following-sibling::div/span");
		public static By Section14Field4_4DataSaved = By.xpath("//label[@aria-label='Label for Student Visa Requirements ']/following-sibling::div/span");

		
		
	    //section 15 locators
		
		public static By Section15Heading= By.xpath("//*[@id='b8e343264f9a5f0044a3cf401310c7de']/div[2]/div[1]/h2");
		public static By Section15Edit = By.xpath("//*[@id='b8e343264f9a5f0044a3cf401310c7de']/div[2]/div[2]/button");
		public static By Section15Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section15Field1label = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7df']/div[2]/div/div");
		public static By Section15Field2label = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7e0']/div[2]/div/div");
		public static By Section15Field3label = By.xpath("//*[@id='fce343264f9a5f0044a3cf401310c7e0']/div[2]/div/div");
		public static By Section15Field4label = By.xpath("//*[@id='aee2e2b54f6a93004beec61f0310c7e3']/div[2]/div/div");
		public static By Section15Field5label = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7e2']/div[2]/div/div");
		public static By Section15Field6label = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7e3']/div[2]/div/div");

		
		public static By Section15Field1RelatedClick = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7df']/div[3]/div");
	
		public static By Section15Field1_1label = By.xpath("//label[@aria-label='Label for Professional Body / Association Name']");
		public static By Section15Field1_2label = By.xpath("//label[@aria-label='Label for Date of Application']");
		public static By Section15Field1_3label = By.xpath("//label[@aria-label='Label for Accreditation Period']");
		public static By Section15Field1_4label = By.xpath("//label[@aria-label='Label for Additional Details']");
		
		public static By Section15Field1_1Data = By.xpath("//input[@aria-label='name']");
		public static By Section15Field1_2DateClick = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7df']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div/div[1]/button");
		public static By Section15Field1_2DateSelect = By.xpath("//div[@class='react-calendar__month-view__days']/button");
		public static By Section15Field1_3Data = By.xpath("//input[@aria-label='duration']");
		public static By Section15Field1_4Data = By.xpath("//textarea[@aria-label='description']");
		
		public static By Section15Field2DateClick = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7e0']/div[3]/span/div/div/div[1]/button");
		public static By Section15Field2DateSelect = By.xpath("//div[@class='react-calendar__month-view__days']/button");
	
		public static By Section15Field3Data = By.xpath("//textarea[@aria-label='caa_accreditation_description']");
		public static By Section15Field4Data = By.xpath("//div[@class='Form MultiSelect']/*");

		public static By Section15Field5Yes = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7e2']/div[3]/span/div/div[1]/div/label/span/input");
		public static By Section15Field5No = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7e2']/div[3]/span/div/div[2]/div/label/span/input");

		public static By Section15Field6Data = By.xpath("//textarea[@aria-label='caa_amendment_description']");



		
        // Data saved locators
		
	    public static By Section15Field1Chev = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7df']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		
	    public static By Section15Field1_1DataSaved = By.xpath("//label[@aria-label='Label for Professional Body / Association Name']/following-sibling::div/span");
		public static By Section15Field1_2DataSaved = By.xpath("//label[@aria-label='Label for Date of Application']/following-sibling::div/span");
		public static By Section15Field1_3DataSaved = By.xpath("//label[@aria-label='Label for Accreditation Period']/following-sibling::div/span");
		public static By Section15Field1_4DataSaved = By.xpath("//label[@aria-label='Label for Additional Details']/following-sibling::div/span");

		public static By Section15Field2DataSaved = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7e0']/div[3]/span");
		public static By Section15Field3DataSaved = By.xpath("//*[@id='fce343264f9a5f0044a3cf401310c7e0']/div[3]/span");
		public static By Section15Field4DataSaved = By.xpath("//*[@id='aee2e2b54f6a93004beec61f0310c7e3']/div[3]/span");
		public static By Section15Field5DataSaved = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7e2']/div[3]/span");
		public static By Section15Field6DataSaved = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7e3']/div[3]/span");
	
		
	    //section 16 locators
		
		public static By Section16Heading= By.xpath("//*[@id='c9e383264f9a5f0044a3cf401310c701']/div[2]/div[1]/h2");
		public static By Section16Edit = By.xpath("//*[@id='c9e383264f9a5f0044a3cf401310c701']/div[2]/div[2]/button");
		public static By Section16Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section16Field1label = By.xpath("//*[@id='992cd3d6db687340ac7b8a264a9619a0']/div[2]/div/div");
		public static By Section16Field2label = By.xpath("//*[@id='427c9bd6db687340ac7b8a264a961986']/div[2]/div/div");
		
		public static By Section16Field1RelatedClick = By.xpath("//*[@id='992cd3d6db687340ac7b8a264a9619a0']/div[3]/div");
		public static By Section16Field2RelatedClick = By.xpath("//*[@id='427c9bd6db687340ac7b8a264a961986']/div[3]/div");

		public static By Section16Field1_1label = By.xpath("//*[@id='992cd3d6db687340ac7b8a264a9619a0']/div[3]/div/div/table/tbody/tr[2]/td/form/div/label");
		public static By Section16Field2_1label = By.xpath("//*[@id='427c9bd6db687340ac7b8a264a961986']/div[3]/div/div/table/tbody/tr[2]/td/form/div/label");
	
		public static By Section16Field1_1Data = By.xpath("//*[@id='992cd3d6db687340ac7b8a264a9619a0']/div[3]/div/div/table/tbody/tr[2]/td/form/div/div/span/div/div/textarea");
		public static By Section16Field2_1Data = By.xpath("//*[@id='427c9bd6db687340ac7b8a264a961986']/div[3]/div/div/table/tbody/tr[2]/td/form/div/div/span/div/div/textarea");

        // Data saved locators
		
	    public static By Section16Field1Chev = By.xpath("//*[@id='992cd3d6db687340ac7b8a264a9619a0']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
	    public static By Section16Field2Chev = By.xpath("//*[@id='427c9bd6db687340ac7b8a264a961986']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
	
	    public static By Section16Field1_1DataSaved = By.xpath("//*[@id='992cd3d6db687340ac7b8a264a9619a0']/div[3]/div/div/table/tbody/tr[2]/td/form/div/div/span");
		public static By Section16Field2_1DataSaved = By.xpath("//*[@id='427c9bd6db687340ac7b8a264a961986']/div[3]/div/div/table/tbody/tr[2]/td/form/div/div/span");

		//Section 17 locators

		
		public static By Section17Heading= By.xpath("//*[@id='89e383264f9a5f0044a3cf401310c704']/div[2]/div[1]/h2");
		public static By Section17Edit = By.xpath("//*[@id='89e383264f9a5f0044a3cf401310c704']/div[2]/div[2]/button");
		public static By Section17Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section17Field1label = By.xpath("//*[@id='45e383264f9a5f0044a3cf401310c705']/div[2]/div/div");

		public static By Section17Field1_1label = By.xpath("//label[@aria-label='Label for Type']");
		public static By Section17Field1_2label = By.xpath("//label[@aria-label='Label for Course Details']");
		public static By Section17Field1_3label = By.xpath("//label[@aria-label='Label for Additional Details']");
	
		public static By Section17Field1RelatedClick = By.xpath("//div[@class='DetailRelatedRecord RelatedRecord--editing']");

		public static By Section17Field1_1Data = By.xpath("//select[@aria-label='dependent_type']");
		public static By Section17Field1_2Data = By.xpath("//input[@type='text']");
		public static By Section17Field1_2DataClick = By.xpath("//div[@class='css-px1gc1']/div[1]");
		public static By Section17Field1_3Data = By.xpath("//textarea[@aria-label='description']");
	
        // Data saved locators
	
		public static By Section17Field1Chev = By.xpath("//*[@id='45e383264f9a5f0044a3cf401310c705']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section17Field1_1DataSaved = By.xpath("//*[@id='45e383264f9a5f0044a3cf401310c705']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span");
		public static By Section17Field1_2DataSaved = By.xpath("//label[@aria-label='Label for Course Details']/following-sibling::div/span");
		public static By Section17Field1_3DataSaved = By.xpath("//*[@id='45e383264f9a5f0044a3cf401310c705']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span"); 
		
		//Section 18 locators

		
		public static By Section18Heading= By.xpath("//*[@id='05e383264f9a5f0044a3cf401310c706']/div[2]/div[1]/h2");
		public static By Section18Edit = By.xpath("//*[@id='05e383264f9a5f0044a3cf401310c706']/div[2]/div[2]/button");
		public static By Section18Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section18Field1label = By.xpath("//*[@id='1925ba314faa93004beec61f0310c767']/div[2]/div/div");
		public static By Section18Field2label = By.xpath("//*[@id='89e383264f9a5f0044a3cf401310c707']/div[2]/div/div");

		public static By Section18Field1Data = By.xpath("//select[@aria-label='sisp_approval']");
		public static By Section18Field2Data = By.xpath("//div[@class='Form MultiSelect']/*");

	
        // Data saved locators
	
		public static By Section18Field1DataSaved = By.xpath("//*[@id='1925ba314faa93004beec61f0310c767']/div[3]/span");
		public static By Section18Field2DataSaved = By.xpath("//*[@id='89e383264f9a5f0044a3cf401310c707']/div[3]/span");
		
		
		
		//Section 19 locators
		
		
		
		public static By Section19Heading= By.xpath("//*[@id='45e383264f9a5f0044a3cf401310c708']/div[2]/div[1]/h2");
		public static By Section19Edit = By.xpath("//*[@id='45e383264f9a5f0044a3cf401310c708']/div[2]/div[2]/button");
		public static By Section19Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section19Field1label = By.xpath("//*[@id='01e383264f9a5f0044a3cf401310c709']/div[2]/div/div");
		public static By Section19Field2label = By.xpath("//*[@id='a303024bdb97130052fd96888a961921']/div[2]/div/div");
		public static By Section19Field3label = By.xpath("//*[@id='c9e383264f9a5f0044a3cf401310c709']/div[2]/div/div");
		public static By Section19Field4label = By.xpath("//*[@id='85e383264f9a5f0044a3cf401310c70a']/div[2]/div/div");
		public static By Section19Field5label = By.xpath("//*[@id='41e383264f9a5f0044a3cf401310c70b']/div[2]/div/div");
		public static By Section19Field6label = By.xpath("//*[@id='0de383264f9a5f0044a3cf401310c70b']/div[2]/div/div");
		public static By Section19Field7label = By.xpath("//*[@id='c5e383264f9a5f0044a3cf401310c70c']/div[2]/div/div");
		public static By Section19Field8label = By.xpath("//*[@id='81e383264f9a5f0044a3cf401310c70d']/div[2]/div/div");
		
		public static By Section19Field1Yes = By.xpath("//*[@id='01e383264f9a5f0044a3cf401310c709']/div[3]/span/div/div[1]/div/label/span/input");
		public static By Section19Field1No = By.xpath("//*[@id='01e383264f9a5f0044a3cf401310c709']/div[3]/span/div/div[2]/div/label/span/input");
		
	
		public static By Section19Field1 = By.xpath("//select[@aria-label='published_in_handbook']");
		public static By Section19Field2Data = By.xpath("//select[@aria-label='primary_study_area']");
		public static By Section19Field3Data = By.xpath("//div[@class='Form MultiSelect']/*");
		public static By Section19Field4DataFrame = By.xpath("//*[@id='85e383264f9a5f0044a3cf401310c70a']/div[3]/span/div/div/div/div/div[2]/iframe");
		public static By Section19Field4Data = By.xpath("//body[@id='tinymce']");
		public static By Section19Field5Data = By.xpath("//textarea[@aria-label='market_position']");
		public static By Section19Field6DataFrame = By.xpath("//*[@id='0de383264f9a5f0044a3cf401310c70b']/div[3]/span/div/div/div/div/div[2]/iframe");
		public static By Section19Field6Data = By.xpath("//body[@id='tinymce']");
		public static By Section19Field7Yes = By.xpath("//*[@id='c5e383264f9a5f0044a3cf401310c70c']/div[3]/span/div/div[1]/div/label/span/input");
		public static By Section19Field7No = By.xpath("//*[@id='c5e383264f9a5f0044a3cf401310c70c']/div[3]/span/div/div[2]/div/label/span/input");
		public static By Section19Field8Data = By.xpath("//textarea[@aria-label='course_finder_text']");
		
		
        // Data saved locators
		
	 
	    public static By Section19Field1DataSaved = By.xpath("//*[@id='01e383264f9a5f0044a3cf401310c709']/div[3]/span");
		public static By Section19Field2DataSaved = By.xpath("//*[@id='a303024bdb97130052fd96888a961921']/div[3]/span");
		public static By Section19Field3DataSaved = By.xpath("//*[@id='c9e383264f9a5f0044a3cf401310c709']/div[3]/span");
		public static By Section19Field4DataSaved = By.xpath("//*[@id='85e383264f9a5f0044a3cf401310c70a']/div[3]/span");
		public static By Section19Field5DataSaved = By.xpath("//*[@id='41e383264f9a5f0044a3cf401310c70b']/div[3]/span");
		public static By Section19Field6DataSaved = By.xpath("//*[@id='0de383264f9a5f0044a3cf401310c70b']/div[3]/span");
		public static By Section19Field7DataSaved = By.xpath("//*[@id='c5e383264f9a5f0044a3cf401310c70c']/div[3]/span");
		public static By Section19Field8DataSaved = By.xpath("//*[@id='81e383264f9a5f0044a3cf401310c70d']/div[3]/span");

		
		
		
		//Section 21 locators

		
		public static By Section21Heading= By.xpath("//*[@id='8b7c875adb287340ac7b8a264a96199f']/div[2]/div[1]/h2");
		public static By Section21Edit = By.xpath("//*[@id='8b7c875adb287340ac7b8a264a96199f']/div[2]/div[2]/button");
		public static By Section21Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section21Field1label = By.xpath("//*[@id='0e9c4b5edb287340ac7b8a264a9619cc']/div[2]/div/div");
		public static By Section21Field1_1label = By.xpath("//label[@aria-label='Label for Faculty Contact']");
		public static By Section21Field1RelatedClick = By.xpath("//div[@class='DetailRelatedRecord RelatedRecord--editing']");
		public static By Section21Field1_1Data = By.xpath("//input[@aria-label='contact_email']");
		
		public static By Section21Field1Chev = By.xpath("//*[@id='0e9c4b5edb287340ac7b8a264a9619cc']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");

        // Data saved locators
	
		public static By Section21Field1_1DataSaved = By.xpath("//label[@aria-label='Label for Faculty Contact']/following-sibling::div/span");

		
	    //section 20 locators
		
		public static By Section20Heading= By.xpath("//*[@id='4de383264f9a5f0044a3cf401310c70d']/div[2]/div[1]/h2");
		public static By Section20Edit = By.xpath("//*[@id='4de383264f9a5f0044a3cf401310c70d']/div[2]/div[2]/button");
		public static By Section20Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section20Field1label = By.xpath("//*[@id='c3911cf2db0c0c10f65ba0311496196a']/div[2]/div/div");
		public static By Section20Field2label = By.xpath("//*[@id='4dacee8cdb20b74052fd96888a961919']/div[2]/div/div");
		public static By Section20Field3label = By.xpath("//*[@id='5361fd4adbd7130052fd96888a961912']/div[2]/div/div");
		public static By Section20Field4label = By.xpath("//*[@id='c1e383264f9a5f0044a3cf401310c70f']/div[2]/div/div");
		public static By Section20Field5label = By.xpath("//*[@id='8c00c6a5db5fbb0052fd96888a961962']/div[2]/div/div");

		
		//public static By Section20Field1Yes = By.xpath("//*[@id='09e383264f9a5f0044a3cf401310c70e']/div[3]/span/div/div[1]/div/label/span/input");
		//public static By Section20Field1No = By.xpath("//*[@id='09e383264f9a5f0044a3cf401310c70e']/div[3]/span/div/div[2]/div/label/span/input");
		
	
		public static By Section20Field1 = By.xpath("//select[@aria-label='published_in_handbook']");
		public static By Section20Field2Data = By.xpath("//input[@class='css-128qk4e']");
		public static By Section20Field2DataClick = By.xpath("//*[@id='4dacee8cdb20b74052fd96888a961919']/div[3]/span/div/div/div[2]/div[1]/label");
		public static By Section20Field3Data = By.xpath("//div[@class='Form MultiSelect']/*");
	//	public static By Section20Field4Data = By.xpath("//[@id='tinymce']");

		public static By Section20Field4DataFrame = By.xpath("//*[@id='c1e383264f9a5f0044a3cf401310c70f']/div[3]/span/div/div/div/div/div[2]/iframe");
		public static By Section20Field4Data = By.xpath("//body[@id='tinymce']");
		public static By Section20Field5DataFrame = By.xpath("//*[@id='8c00c6a5db5fbb0052fd96888a961962']/div[3]/span/div/div/div/div/div[2]/iframe");
		public static By Section20Field5Data = By.xpath("//body[@id='tinymce']");
		
	
        // Data saved locators
		
	 
	    public static By Section20Field1DataSaved = By.xpath("//*[@id='c3911cf2db0c0c10f65ba0311496196a']/div[3]/span");
		public static By Section20Field2DataSaved = By.xpath("//*[@id='4dacee8cdb20b74052fd96888a961919']/div[3]/span");
		public static By Section20Field3DataSaved = By.xpath("//*[@id='5361fd4adbd7130052fd96888a961912']/div[3]/span");
		public static By Section20Field4DataSaved = By.xpath("//*[@id='c1e383264f9a5f0044a3cf401310c70f']/div[3]/span");
		public static By Section20Field5DataSaved = By.xpath("//*[@id='8c00c6a5db5fbb0052fd96888a961962']/div[3]/span");


		
	}
	
	
public static class MajorTemplatelabelUOW {
		
		public static By Section1Heading= By.xpath("//*[@id='478e50f2dba0b340ac7b8a264a9619e1']/div[2]/div[1]/h2");
		public static By Section1Edit = By.xpath("//*[@id='478e50f2dba0b340ac7b8a264a9619e1']/div[2]/div[2]/button");
		public static By Section1Save = By.xpath("//*[@id='478e50f2dba0b340ac7b8a264a9619e1']/div[2]/div[2]/div/button[2]");
		
		public static By Section1Field1Label = By.xpath("//*[@id='f29e54f2dba0b340ac7b8a264a961907']/div[2]/div/div");
		public static By Section1DateClick = By.xpath("//*[@id='f29e54f2dba0b340ac7b8a264a961907']/div[3]/span/div/div/div[1]/button");
		public static By Section1DateSelect = By.xpath("//*[@id='f29e54f2dba0b340ac7b8a264a961907']/div[3]/span/div/div[2]/div/div[2]/div/div/div[2]/button");
		public static By Section1Field1Data = By.xpath("//*[@id='f29e54f2dba0b340ac7b8a264a961907']/div[3]/span");

		
		//section 2 locators 
		
		public static By Section2Heading= By.xpath("//*[@id='46660b264f9a5f0044a3cf401310c795']/div[2]/div[1]/h2");
		public static By Section2Edit = By.xpath("//*[@id='46660b264f9a5f0044a3cf401310c795']/div[2]/div[2]/button");
		public static By Section2Save = By.xpath("//*[@id='46660b264f9a5f0044a3cf401310c795']/div[2]/div[2]/div/button[2]");
		

		public static By Section2Field1label = By.xpath("//*[@id='c6660b264f9a5f0044a3cf401310c797']/div[2]/div/div");
		public static By Section2Field2label = By.xpath("//*[@id='4d5ed5c2db207b4052fd96888a961995']/div[2]/div/div");
		public static By Section2Field3label = By.xpath("//*[@id='0e660b264f9a5f0044a3cf401310c796']/div[2]/div/div");
		public static By Section2Field4label = By.xpath("//*[@id='7782f98adbd7130052fd96888a96197c']/div[2]/div/div");
		public static By Section2Field5label = By.xpath("//*[@id='27b23d8adbd7130052fd96888a9619ab']/div[2]/div/div");
		public static By Section2Field6label = By.xpath("//*[@id='82660b264f9a5f0044a3cf401310c798']/div[2]/div/div");
		public static By Section2Field7label = By.xpath("//*[@id='4e660b264f9a5f0044a3cf401310c798']/div[2]/div/div");
		public static By Section2Field8label = By.xpath("//*[@id='c70661c6db207b4052fd96888a961906']/div[2]/div/div");
		public static By Section2Field9label = By.xpath("//*[@id='c2660b264f9a5f0044a3cf401310c79a']/div[2]/div/div");
		public static By Section2Field10label = By.xpath("//*[@id='8e9546b84faa13004beec61f0310c7cb']/div[2]/div/div");
		public static By Section2Field11label = By.xpath("//*[@id='60243283dbd4374052fd96888a9619a8']/div[2]/div/div");

		
		
		
		public static By Section2Field1Data = By.xpath("//input[@name='abbr_name']");
		public static By Section2Field2Data = By.xpath("//input[@name='short_title']");
		public static By Section2Field4Data = By.xpath("//select[@aria-label='parent_academic_org']");
		public static By Section2Field5Data = By.xpath("//select[@aria-label='academic_org']");
		public static By Section2Field7Data = By.xpath("//input[@name='credit_points']");
		public static By Section2Field10Data = By.xpath("//input[@aria-label='course_review_cluster']");

		
		//  Section 2 related records
		
		public static By Section2Field8RelatedClick = By.xpath("//*[@id='c70661c6db207b4052fd96888a961906']/div[3]/div/div/div/div");
	
		public static By Section2Field8_1label = By.xpath("//*[@id='c70661c6db207b4052fd96888a961906']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/label/div");
		public static By Section2Field8_2label = By.xpath("//*[@id='c70661c6db207b4052fd96888a961906']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/label/div");		
		public static By Section2Field8_3label = By.xpath("//*[@id='c70661c6db207b4052fd96888a961906']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/label/div");	
		
		public static By Section2Field8_1Data = By.xpath("//input[@name='code']");
		public static By Section2Field8_2Yes = By.xpath("//*[@id='c70661c6db207b4052fd96888a961906']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[1]/div/label/span/input");
		public static By Section2Field8_2No = By.xpath("//*[@id='c70661c6db207b4052fd96888a961906']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[2]/div/label/span/input");
		public static By Section2Field8_3Data = By.xpath("//input[@class='css-128qk4e']");
		
		
		
		public static By Section2Field9RelatedClick = By.xpath("//*[@id='c2660b264f9a5f0044a3cf401310c79a']/div[3]/div/div/div/div");
		public static By Section2Field9_1label = By.xpath("//*[@id='c2660b264f9a5f0044a3cf401310c79a']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/label/div");
		public static By Section2Field9_2label = By.xpath("//*[@id='c2660b264f9a5f0044a3cf401310c79a']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/label/div");
		public static By Section2Field9_3label = By.xpath("//*[@id='c2660b264f9a5f0044a3cf401310c79a']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/label/div");
		public static By Section2Field9_4label = By.xpath("//label[@aria-label='Label for Instances']");
		public static By Section2Field9_5label = By.xpath("//*[@id='c2660b264f9a5f0044a3cf401310c79a']/div[3]/div/div/table/tbody/tr[2]/td/form/div[5]/label/div");

		
		public static By Section2Field9_1Data = By.xpath("//*[@id='c2660b264f9a5f0044a3cf401310c79a']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span/div/div/input");
	//	public static By Section2Field9_1DataSelect = By.xpath("//*[@id='6ce343264f9a5f0044a3cf401310c7cd']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span/div/div[2]/div");
		public static By Section2Field9_1DataSelect = By.xpath("//div[@class='css-re31td']");
		public static By Section2Field9_3Yes = By.xpath("//*[@id='c2660b264f9a5f0044a3cf401310c79a']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span/div/div[1]/div/label/span/input");
		public static By Section2Field9_3No = By.xpath("//*[@id='c2660b264f9a5f0044a3cf401310c79a']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span/div/div[2]/div/label/span/input");
		
		public static By Section2Field9_4Data = By.xpath("//*[@id='c2660b264f9a5f0044a3cf401310c79a']/div[3]/div/div/table/tbody/tr[2]/td/form/div[4]/div/span/div/div/div[1]/input");
		public static By Section2Field9_5Yes = By.xpath("//*[@id='c2660b264f9a5f0044a3cf401310c79a']/div[3]/div/div/table/tbody/tr[2]/td/form/div[5]/div/span/div/div[1]/div/label/span/input");
		public static By Section2Field9_5No = By.xpath("//*[@id='c2660b264f9a5f0044a3cf401310c79a']/div[3]/div/div/table/tbody/tr[2]/td/form/div[5]/div/span/div/div[2]/div/label/span/input");
		
		
		
		public static By Section2Field11RelatedClick = By.xpath("//*[@id='60243283dbd4374052fd96888a9619a8']/div[3]/div/div/div/div");
		public static By Section2Field11_1label = By.xpath("//*[@id='60243283dbd4374052fd96888a9619a8']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/label/div");
		public static By Section2Field11_2label = By.xpath("//*[@id='60243283dbd4374052fd96888a9619a8']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/label/div");

		public static By Section2Field11_1Data = By.xpath("//*[@id='60243283dbd4374052fd96888a9619a8']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span/div/div/select");
		
	
		public static By Section2Field11_2Data = By.xpath("//*[@id='60243283dbd4374052fd96888a9619a8']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[1]/input");
		public static By Section2Field11_2DataClick = By.xpath("//*[@id='60243283dbd4374052fd96888a9619a8']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[2]/div[1]");
		
		
		// saved data locators 
		

		

		public static By Section2Field1DataSaved = By.xpath("//*[@id='c6660b264f9a5f0044a3cf401310c797']/div[3]/span");
		public static By Section2Field2DataSaved = By.xpath("//*[@id='4d5ed5c2db207b4052fd96888a961995']/div[3]/span");
		public static By Section2Field3DataSaved = By.xpath("//*[@id='0e660b264f9a5f0044a3cf401310c796']/div[3]/span");
		public static By Section2Field4DataSaved = By.xpath("//*[@id='7782f98adbd7130052fd96888a96197c']/div[3]/span");
		public static By Section2Field5DataSaved = By.xpath("//*[@id='27b23d8adbd7130052fd96888a9619ab']/div[3]/span");
		public static By Section2Field6DataSaved = By.xpath("//*[@id='82660b264f9a5f0044a3cf401310c798']/div[3]/div/span");
		public static By Section2Field7DataSaved = By.xpath("//*[@id='4e660b264f9a5f0044a3cf401310c798']/div[3]/span");
		public static By Section2Field10DataSaved = By.xpath("//*[@id='8e9546b84faa13004beec61f0310c7cb']/div[3]/span");

		
		
		// Saved data for related records
		public static By Section2Field8Chev = By.xpath("//*[@id='c70661c6db207b4052fd96888a961906']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section2Field9Chev = By.xpath("//*[@id='c2660b264f9a5f0044a3cf401310c79a']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section2Field11Chev = By.xpath("//*[@id='60243283dbd4374052fd96888a9619a8']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		
		public static By Section2Field8_1DataSaved = By.xpath("//*[@id='c70661c6db207b4052fd96888a961906']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span");
		public static By Section2Field8_2DataSaved = By.xpath("//*[@id='c70661c6db207b4052fd96888a961906']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span");
		
		public static By Section2Field9_1DataSaved = By.xpath("//*[@id='c2660b264f9a5f0044a3cf401310c79a']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span");
		public static By Section2Field9_2DataSaved = By.xpath("//*[@id='c2660b264f9a5f0044a3cf401310c79a']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span");
		public static By Section2Field9_3DataSaved = By.xpath("//*[@id='c2660b264f9a5f0044a3cf401310c79a']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span");
		public static By Section2Field9_5DataSaved = By.xpath("//*[@id='c2660b264f9a5f0044a3cf401310c79a']/div[3]/div/div/table/tbody/tr[2]/td/form/div[5]/div/span");

		public static By Section2Field11_1DataSaved = By.xpath("//*[@id='60243283dbd4374052fd96888a9619a8']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span");
		public static By Section2Field11_2DataSaved = By.xpath("//*[@id='60243283dbd4374052fd96888a9619a8']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span");
		
		
		// Section 3 labels 
		
		public static By Section3Heading= By.xpath("//*[@id='b0e343264f9a5f0044a3cf401310c7cf']/div[2]/div[1]/h2");
		public static By Section3Edit = By.xpath("//*[@id='b0e343264f9a5f0044a3cf401310c7cf']/div[2]/div[2]/button");
		public static By Section3Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section3Field1label = By.xpath("//*[@id='7ce343264f9a5f0044a3cf401310c7cf']/div[2]/div/div");
		
		public static By Section3Field1RelatedClick = By.xpath("//*[@id=\"7ce343264f9a5f0044a3cf401310c7cf\"]/div[3]/div/div/div/div");

		
		
		public static By Section3Field3_1label = By.xpath("//label[@aria-label='Label for On Offer']");
		public static By Section3Field3_2label = By.xpath("//label[@aria-label='Label for Delivery Location']");
		public static By Section3Field3_3label = By.xpath("//label[@aria-label='Label for Intake/s']");
		public static By Section3Field3_4label = By.xpath("//label[@aria-label='Label for Delivery Mode']");
		public static By Section3Field3_5label = By.xpath("//label[@aria-label='Label for Course Instance Name']");
		public static By Section3Field3_6label = By.xpath("//label[@aria-label='Label for Instance Tag Name']");
		public static By Section3Field3_7label = By.xpath("//label[@aria-label='Label for Student Type']");
		public static By Section3Field3_8label = By.xpath("//label[@aria-label='Label for Additional Details']");
		public static By Section3Field3_9label = By.xpath("//label[@aria-label='Label for Rationale for Instance']");
		public static By Section3Field3_10label = By.xpath("//label[@aria-label='Label for Rationale Description']");
		
		
		public static By Section3Field3_1Yes = By.xpath("//*[@id='7ce343264f9a5f0044a3cf401310c7cf']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span/div/div[1]/div/label/span/input");
		public static By Section3Field3_1No = By.xpath("//*[@id='7ce343264f9a5f0044a3cf401310c7cf']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span/div/div[2]/div/label/span/input");
		public static By Section3Field3_2Data = By.xpath("//input[@class='TypeAheadList__input']");
		public static By Section3Field3_2DataClick = By.xpath("//*[@id='7ce343264f9a5f0044a3cf401310c7cf']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[2]/div[1]");
		public static By Section3Field3_3Data = By.xpath("//select[@name='admission_calendar']");
		public static By Section3Field3_4Data = By.xpath("//select[@name='mode']");
		public static By Section3Field3_5Data = By.xpath("//input[@name='ext_id']");
		
	    public static By Section3Field3_7Data = By.xpath("//div[@class='Form MultiSelect']/*");
		public static By Section3Field3_8Data = By.xpath("//textarea[@name='comments']");
		public static By Section3Field3_9Data = By.xpath("//select[@aria-label='delivery_collaborators']");
		public static By Section3Field3_10Data = By.xpath("//textarea[@aria-label='collaborator_details']");
		
		public static By Section3Field1Chev = By.xpath("//*[@id='7ce343264f9a5f0044a3cf401310c7cf']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section3Field3_1DataSaved = By.xpath("//label[@aria-label='Label for On Offer']/following-sibling::div/span");
		public static By Section3Field3_2DataSaved = By.xpath("//label[@aria-label='Label for Delivery Location']/following-sibling::div/span");
		public static By Section3Field3_3DataSaved = By.xpath("//label[@aria-label='Label for Intake/s']/following-sibling::div/span");
		public static By Section3Field3_4DataSaved = By.xpath("//label[@aria-label='Label for Delivery Mode']/following-sibling::div/span");
		public static By Section3Field3_5DataSaved = By.xpath("//label[@aria-label='Label for Course Instance Name']/following-sibling::div/span");
		public static By Section3Field3_6DataSaved = By.xpath("//label[@aria-label='Label for Instance Tag Name']/following-sibling::div/span");
		public static By Section3Field3_7DataSaved = By.xpath("//label[@aria-label='Label for Student Type']/following-sibling::div/span");
		public static By Section3Field3_8DataSaved = By.xpath("//label[@aria-label='Label for Additional Details']/following-sibling::div/span");
		public static By Section3Field3_9DataSaved = By.xpath("//label[@aria-label='Label for Rationale for Instance']/following-sibling::div/span");
		public static By Section3Field3_10DataSaved = By.xpath("//label[@aria-label='Label for Rationale Description']/following-sibling::div/span");
		
		
		//section 4 locators
		
		public static By Section4Heading= By.xpath("//*[@id='b8e343264f9a5f0044a3cf401310c7e7']/div[2]/div[1]/h2");
		public static By Section4Edit = By.xpath("//*[@id='b8e343264f9a5f0044a3cf401310c7e7']/div[2]/div[2]/button");
		public static By Section4Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section4Field1label = By.xpath("//*[@id='c1ec9832dba0b340ac7b8a264a9619ff']/div[2]/div/div");
		public static By Section4Field2label = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7e8']/div[2]/div/div");
		public static By Section4Field3label = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7e9']/div[2]/div/div");
		
		
		
		public static By Section4Field2_1label = By.xpath("//label[@aria-label='Label for Type of Requirement']");
		public static By Section4Field2_2label = By.xpath("//label[@aria-label='Label for Number of Weeks']");
		public static By Section4Field2_3label = By.xpath("//label[@aria-label='Label for Total Number of Hours']");
		public static By Section4Field2_4label = By.xpath("//label[@aria-label='Label for Hours Per Week']");
		public static By Section4Field2_5label = By.xpath("//label[@aria-label='Label for Additional Information']");
	
		public static By Section4Field1Yes = By.xpath("//*[@id='c1ec9832dba0b340ac7b8a264a9619ff']/div[3]/span/div/div[1]/div/label/span/input");
		public static By Section4Field1No = By.xpath("//*[@id='c1ec9832dba0b340ac7b8a264a9619ff']/div[3]/span/div/div[2]/div/label/span/input");
		
		public static By Section4Field2RelatedClick = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7e8']/div[3]/div/div/div/div");

		public static By Section4Field2_1Data = By.xpath("//select[@aria-label='type']");
		public static By Section4Field2_2Data = By.xpath("//input[@aria-label='week_count']");
		public static By Section4Field2_3Data = By.xpath("//input[@aria-label='total_hours']");
		public static By Section4Field2_4Data = By.xpath("//input[@aria-label='hours_per_week']");
		public static By Section4Field2_5Data = By.xpath("//textarea[@aria-label='additional_information']");

		
		
		public static By Section4Field3Yes = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7e9']/div[3]/span/div/div[1]/div/label/span/input");
		public static By Section4Field3No = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7e9']/div[3]/span/div/div[2]/div/label/span/input");
		
        // Data saved locators
		
		public static By Section4Field2Chev = By.xpath("//*[@id=\"74e343264f9a5f0044a3cf401310c7e8\"]/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		
		
		
		public static By Section4Field1DataSaved = By.xpath("//*[@id=\"c1ec9832dba0b340ac7b8a264a9619ff\"]/div[3]/span");
	
		public static By Section4Field2_1DataSaved = By.xpath("//label[@aria-label='Label for Type of Requirement']/following-sibling::div/span");
		public static By Section4Field2_2DataSaved = By.xpath("//label[@aria-label='Label for Number of Weeks']/following-sibling::div/span");
		public static By Section4Field2_3DataSaved = By.xpath("//label[@aria-label='Label for Total Number of Hours']/following-sibling::div/span");
		public static By Section4Field2_4DataSaved = By.xpath("//label[@aria-label='Label for Hours Per Week']/following-sibling::div/span");
		public static By Section4Field2_5DataSaved = By.xpath("//label[@aria-label='Label for Additional Information']/following-sibling::div/span");

		public static By Section4Field3DataSaved = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7e9']/div[3]/span");
		
		
			
		
		//section 5 locators
		
		public static By Section5Heading= By.xpath("//*[@id='3ce343264f9a5f0044a3cf401310c7d0']/div[2]/div[1]/h2");
		public static By Section5Edit = By.xpath("//*[@id='3ce343264f9a5f0044a3cf401310c7d0']/div[2]/div[2]/button");
		public static By Section5Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section5Field1label = By.xpath("//*[@id='f4e343264f9a5f0044a3cf401310c7d1']/div[2]/div/div");
		public static By Section5Field2label = By.xpath("//*[@id='b0e343264f9a5f0044a3cf401310c7d2']/div[2]/div/div");
		
		public static By Section5Field1Data = By.xpath("//div[@class='Form MultiSelect']/*");
		public static By Section5Field2Data = By.xpath("//textarea[@aria-label='additional_application_info']");
		
		
        // Data saved locators
		
		public static By Section5Field1DataSaved = By.xpath("//*[@id='f4e343264f9a5f0044a3cf401310c7d1']/div[3]/span");
		public static By Section5Field2DataSaved = By.xpath("//*[@id='b0e343264f9a5f0044a3cf401310c7d2']/div[3]/span");
		
		
		//section 6 locators
		
		public static By Section6Heading= By.xpath("//*[@id='7ce343264f9a5f0044a3cf401310c7d2']/div[2]/div[1]/h2");
		public static By Section6Edit = By.xpath("//*[@id='7ce343264f9a5f0044a3cf401310c7d2']/div[2]/div[2]/button");
		public static By Section6Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section6Field1label = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[2]/div/div");
		public static By Section6Field2label = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[2]/div/div");
		public static By Section6Field3label = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[2]/div/div");
		public static By Section6Field4label = By.xpath("//*[@id='3dbeb326db60b340ac7b8a264a9619cc']/div[2]/div/div");
		public static By Section6Field5label = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[2]/div/div");
		public static By Section6Field6label = By.xpath("//*[@id='b4e343264f9a5f0044a3cf401310c7da']/div[2]/div/div");
		public static By Section6Field7label = By.xpath("//*[@id='bce343264f9a5f0044a3cf401310c7d4']/div[2]/div/div");
		public static By Section6Field8label = By.xpath("//*[@id='78e343264f9a5f0044a3cf401310c7d5']/div[2]/div/div");
		public static By Section6Field9label = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7d6']/div[2]/div/div");
		public static By Section6Field10label = By.xpath("//*[@id='fce343264f9a5f0044a3cf401310c7d6']/div[2]/div/div");
		public static By Section6Field11label = By.xpath("//*[@id='b8e343264f9a5f0044a3cf401310c7d7']/div[2]/div/div");
		public static By Section6Field12label = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7d8']/div[2]/div/div");
		public static By Section6Field13label = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7d9']/div[2]/div/div");
	
		public static By Section6Field1RelatedClick = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/div/div");
		public static By Section6Field2RelatedClick = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/div/div");
		public static By Section6Field3RelatedClick = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/div/div");
		public static By Section6Field4RelatedClick = By.xpath("//*[@id='3dbeb326db60b340ac7b8a264a9619cc']/div[3]/div/div/div/div");
		public static By Section6Field5RelatedClick = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/div/div");

		public static By Section6Field1_1label = By.xpath("//label[@aria-label='Label for Minimum ATAR']");
		public static By Section6Field1_2label = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/label/div");
		public static By Section6Field1_3label = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/label/div");
		public static By Section6Field1_1Data = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span/div/div/input");
		public static By Section6Field1_2Yes = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[1]/div/label/span/input");
		public static By Section6Field1_2No = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[2]/div/label/span/input");
		public static By Section6Field1_3Data = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span/div/div/div[1]/input");
		public static By Section6Field1_3DataClick = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span/div/div/div[2]/div/label");
	
		
		
		public static By Section6Field2_1label = By.xpath("//label[@aria-label='Label for Guaranteed Selection Rank']");
		public static By Section6Field2_2label = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/label/div");
		public static By Section6Field2_3label = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/label/div");
		public static By Section6Field2_1Data = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span/div/div/input");
		public static By Section6Field2_2Yes = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[1]/div/label/span/input");
		public static By Section6Field2_2No = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[2]/div/label/span/input");
		public static By Section6Field2_3Data = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span/div/div/div[1]/input");
		public static By Section6Field2_3DataClick = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span/div/div/div[2]/div/label");
	
		
		
		public static By Section6Field3_1label = By.xpath("//label[@aria-label='Label for Additional Selection Criteria Information']");
		public static By Section6Field3_2label = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/label/div");
		public static By Section6Field3_3label = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/label/div");
		public static By Section6Field3_1Data = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span/div/div/textarea");
		public static By Section6Field3_2Yes = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[1]/div/label/span/input");
		public static By Section6Field3_2No = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[2]/div/label/span/input");
		public static By Section6Field3_3Data = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span/div/div/div[1]/input");
		public static By Section6Field3_3DataClick = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span/div/div/div[2]/div/label");
	
		public static By Section6Field4_1label = By.xpath("//label[@aria-label='Label for Type']");
		public static By Section6Field4_2label = By.xpath("//*[@id='3dbeb326db60b340ac7b8a264a9619cc']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/label/div");
		public static By Section6Field4_1Data = By.xpath("//select[@aria-label='domain']");
		public static By Section6Field4_2Data = By.xpath("//*[@id='3dbeb326db60b340ac7b8a264a9619cc']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div/textarea");
	
		
		public static By Section6Field5_1label = By.xpath("//label[@aria-label='Label for UAC']");
		public static By Section6Field5_2label = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/label/div");
		public static By Section6Field5_3label = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/label/div");
		public static By Section6Field5_1Data = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span/div/div/input");
		public static By Section6Field5_2Yes = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[1]/div/label/span/input");
		public static By Section6Field5_2No = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div[2]/div/label/span/input");
		public static By Section6Field5_3Data = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span/div/div/div[1]/input");
		public static By Section6Field5_3DataClick = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span/div/div/div[2]/div/label");
	
		
		public static By Section6Field6Data = By.xpath("//textarea[@aria-label='early_admission']");
		public static By Section6Field7Data = By.xpath("//textarea[@aria-label='vocational_education']");
		public static By Section6Field8Data = By.xpath("//textarea[@aria-label='higher_education_study']");
		public static By Section6Field9Data = By.xpath("//textarea[@aria-label='undergraduate_qualification']");
		public static By Section6Field10Data = By.xpath("//textarea[@aria-label='weighted_average_mark']");
		public static By Section6Field11Data = By.xpath("//textarea[@aria-label='other_tertiary_qualifications']");
		public static By Section6Field12Data = By.xpath("//textarea[@aria-label='work_experience']");
		public static By Section6Field13Data = By.xpath("//textarea[@aria-label='other_admission_reqs']");
		
		
        // Data saved locators
		
		public static By Section6Field1Chev = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section6Field1_1DataSaved = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span");
		public static By Section6Field1_2DataSaved = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span");
		public static By Section6Field1_3DataSaved = By.xpath("//*[@id='b3ec73e2db60b340ac7b8a264a9619e7']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span");

		public static By Section6Field2Chev = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section6Field2_1DataSaved = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span");
		public static By Section6Field2_2DataSaved = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span");
		public static By Section6Field2_3DataSaved = By.xpath("//*[@id='1c6d73e2db60b340ac7b8a264a9619eb']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span");

		public static By Section6Field3Chev = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section6Field3_1DataSaved = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span");
		public static By Section6Field3_2DataSaved = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span");
		public static By Section6Field3_3DataSaved = By.xpath("//*[@id='bebd3fe2db60b340ac7b8a264a96196f']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span");

		public static By Section6Field4Chev = By.xpath("//*[@id='3dbeb326db60b340ac7b8a264a9619cc']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section6Field4_1DataSaved = By.xpath("//*[@id='3dbeb326db60b340ac7b8a264a9619cc']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span");
		public static By Section6Field4_2DataSaved = By.xpath("//*[@id='3dbeb326db60b340ac7b8a264a9619cc']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span");

		public static By Section6Field5Chev = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section6Field5_1DataSaved = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span");
		public static By Section6Field5_2DataSaved = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span");
		public static By Section6Field5_3DataSaved = By.xpath("//*[@id='6f108836db60b340ac7b8a264a9619b2']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span");

		
		public static By Section6Field6DataSaved = By.xpath("//*[@id='b4e343264f9a5f0044a3cf401310c7da']/div[3]/span");
		public static By Section6Field7DataSaved = By.xpath("//*[@id='bce343264f9a5f0044a3cf401310c7d4']/div[3]/span");
		public static By Section6Field8DataSaved = By.xpath("//*[@id='78e343264f9a5f0044a3cf401310c7d5']/div[3]/span");
		public static By Section6Field9DataSaved = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7d6']/div[3]/span");
		public static By Section6Field10DataSaved = By.xpath("//*[@id='fce343264f9a5f0044a3cf401310c7d6']/div[3]/span");
		public static By Section6Field11DataSaved = By.xpath("//*[@id='b8e343264f9a5f0044a3cf401310c7d7']/div[3]/span");
		public static By Section6Field12DataSaved = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7d8']/div[3]/span");
		public static By Section6Field13DataSaved = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7d9']/div[3]/span");
		
		// section 7 locators
		
		
		public static By Section7Heading= By.xpath("//*[@id='70e343264f9a5f0044a3cf401310c7db']/div[2]/div[1]/h2");
		public static By Section7Edit = By.xpath("//*[@id='70e343264f9a5f0044a3cf401310c7db']/div[2]/div[2]/button");
		public static By Section7Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section7Field1label = By.xpath("//*[@id='b0e343264f9a5f0044a3cf401310c7dd']/div[2]/div/div");
		public static By Section7Field2label = By.xpath("//*[@id='f4e343264f9a5f0044a3cf401310c7dc']/div[2]/div/div");
		
		
		public static By Section7Field1_1label = By.xpath("//label[@aria-label='Label for English Language Test']");
		public static By Section7Field1_2label = By.xpath("//label[@aria-label='Label for Overall Score']");
		public static By Section7Field1_3label = By.xpath("//label[@aria-label='Label for Reading Score ']");
		public static By Section7Field1_4label = By.xpath("//label[@aria-label='Label for Writing Score ']");
		public static By Section7Field1_5label = By.xpath("//label[@aria-label='Label for Listening Score ']");
		public static By Section7Field1_6label = By.xpath("//label[@aria-label='Label for Speaking Score ']");
	
		
		public static By Section7Field1RelatedClick = By.xpath("//*[@id='b0e343264f9a5f0044a3cf401310c7dd']/div[3]/div/div/div/div");

		public static By Section7Field1_1Data = By.xpath("//select[@aria-label='english_language_test']");
		public static By Section7Field1_2Data = By.xpath("//input[@aria-label='overall_score']");
		public static By Section7Field1_3Data = By.xpath("//input[@aria-label='reading_score']");
		public static By Section7Field1_4Data = By.xpath("//input[@aria-label='writing_score']");
		public static By Section7Field1_5Data = By.xpath("//input[@aria-label='listening_score']");
		public static By Section7Field1_6Data = By.xpath("//input[@aria-label='speaking_score']");
		
		public static By Section7Field2Data = By.xpath("//textarea[@aria-label='mb_2']");

		
        // Data saved locators
		
		public static By Section7Field1Chev = By.xpath("//*[@id='b0e343264f9a5f0044a3cf401310c7dd']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");

		public static By Section7Field1_1DataSaved = By.xpath("//label[@aria-label='Label for English Language Test']/following-sibling::div/span");
		public static By Section7Field1_2DataSaved = By.xpath("//label[@aria-label='Label for Overall Score']/following-sibling::div/span");
		public static By Section7Field1_3DataSaved = By.xpath("//label[@aria-label='Label for Reading Score ']/following-sibling::div/span");
		public static By Section7Field1_4DataSaved = By.xpath("//label[@aria-label='Label for Writing Score ']/following-sibling::div/span");
		public static By Section7Field1_5DataSaved = By.xpath("//label[@aria-label='Label for Listening Score ']/following-sibling::div/span");
		public static By Section7Field1_6DataSaved = By.xpath("//label[@aria-label='Label for Speaking Score ']/following-sibling::div/span");
		
		public static By Section7Field2DataSaved = By.xpath("//*[@id='f4e343264f9a5f0044a3cf401310c7dc']/div[3]/span");
		
		
		// section 8 locators
		
		
		public static By Section8Heading= By.xpath("//*[@id='c1e343264f9a5f0044a3cf401310c7fe']/div[2]/div[1]/h2");
		public static By Section8Edit = By.xpath("//*[@id='c1e343264f9a5f0044a3cf401310c7fe']/div[2]/div[2]/button");
		public static By Section8Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section8Field1label = By.xpath("//*[@id='8de343264f9a5f0044a3cf401310c7fe']/div[2]/div/div");
		public static By Section8Field2label = By.xpath("//*[@id='22d626274fde9f004beec61f0310c773']/div[2]/div/div");
		public static By Section8Field3label = By.xpath("//*[@id='b04fd9494f2253004beec61f0310c72a']/div[2]/div/div");
		public static By Section8Field4label = By.xpath("//*[@id='ac94028bdb97130052fd96888a9619c6']/div[2]/div/div");
		
		
		public static By Section8Field2_1label = By.xpath("//label[@aria-label='Label for Code']");
		public static By Section8Field2_2label = By.xpath("//label[@aria-label='Label for Description']");
		public static By Section8Field2_3label = By.xpath("//label[@aria-label='Label for Number']");
		public static By Section8Field2_4label = By.xpath("//label[@aria-label='Label for AQF KSAs']");
	
	
		public static By Section8Field1Data = By.xpath("//textarea[@aria-label='detailed_narrative']");	
		public static By Section8Field2RelatedClick = By.xpath("//*[@id='22d626274fde9f004beec61f0310c773']/div[3]/div/div/div/div");

		//	public static By Section8Field2_1Data = By.xpath("//select[@aria-label='type']"); 
		public static By Section8Field2_2Data = By.xpath("//textarea[@aria-label='description']");
		public static By Section8Field2_3Data = By.xpath("//input[@aria-label='number']");
		public static By Section8Field2_4Data = By.xpath("//div[@class='Form MultiSelect']/*");

		public static By Section8Field3Data = By.xpath("//textarea[@aria-label='wil_additional_detail']");
		public static By Section8Field4Data = By.xpath("//textarea[@aria-label='inherent_requirements']");
		
        // Data saved locators
		
		public static By Section8Field2Chev = By.xpath("//*[@id='22d626274fde9f004beec61f0310c773']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");

		public static By Section8Field1DataSaved = By.xpath("//*[@id='8de343264f9a5f0044a3cf401310c7fe']/div[3]/span");
	
		public static By Section8Field2_1DataSaved = By.xpath("//label[@aria-label='Label for Code']/following-sibling::div/span");
		public static By Section8Field2_2DataSaved = By.xpath("//*[@id='22d626274fde9f004beec61f0310c773']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span");
		public static By Section8Field2_3DataSaved = By.xpath("//label[@aria-label='Label for Number']/following-sibling::div/span");
		public static By Section8Field2_4DataSaved = By.xpath("//label[@aria-label='Label for AQF KSAs']/following-sibling::div/span");

		public static By Section8Field3DataSaved = By.xpath("//*[@id='b04fd9494f2253004beec61f0310c72a']/div[3]/span");
		public static By Section8Field4DataSaved = By.xpath("//*[@id='ac94028bdb97130052fd96888a9619c6']/div[3]/span");
		
		
		//added by Rishu
		//section 11 locators 
			//Locators for heading (label), save and edit buttons for this section
			public static By Section11Heading= By.xpath("//*[@id='38e343264f9a5f0044a3cf401310c7ef']/div[2]/div[1]/h2");
			public static By Section11Edit = By.xpath("//*[@id='38e343264f9a5f0044a3cf401310c7ef']/div[2]/div[2]/button");
			public static By Section11Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");
	
			//locators for this section field labels
			public static By Section11Field1label = By.xpath("//*[@id='f0e343264f9a5f0044a3cf401310c7f0']/div[2]/div/div");
			public static By Section11Field2label = By.xpath("//*[@id='bce343264f9a5f0044a3cf401310c7f0']/div[2]/div/div");
			
			//Locators for saving data (input fields)
			public static By Section11Field1Data = By.xpath("//textarea[@aria-label='course_offering']");
			public static By Section11Field2Data = By.xpath("//textarea[@aria-label='subject_offering']");
			
			//Locators to fetch saved data from fields
			public static By Section11Field1DataSaved = By.xpath("//*[@id='f0e343264f9a5f0044a3cf401310c7f0']/div[3]/span");
			public static By Section11Field2DataSaved = By.xpath("//*[@id='bce343264f9a5f0044a3cf401310c7f0']/div[3]/span");
		//End of section 11 locators
		
		
		// section 9 locators
		
		
		public static By Section9Heading= By.xpath("//*[@id='c06d870fdbd4374052fd96888a96199a']/div[2]/div[1]/h2");
		public static By Section9Edit = By.xpath("//*[@id='c06d870fdbd4374052fd96888a96199a']/div[2]/div[2]/button");
		public static By Section9Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");
	
		public static By Section9Field1label = By.xpath("//*[@id='b8e343264f9a5f0044a3cf401310c7ea']/div[2]/div/div");
		
		public static By Section9Field1Data = By.xpath("//textarea[@aria-label='description']");	

        // Data saved locators
		
		public static By Section9Field1DataSaved = By.xpath("//*[@id='b8e343264f9a5f0044a3cf401310c7ea']/div[3]/span");

		
		
		// section 10 locators
		
		
		public static By Section10Heading= By.xpath("//*[@id='fce343264f9a5f0044a3cf401310c7e9']/div[2]/div[1]/h2");
		public static By Section10Edit = By.xpath("//*[@id='fce343264f9a5f0044a3cf401310c7e9']/div[2]/div[2]/button");
		public static By Section10Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section10Field1label = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7eb']/div[2]/div/div");
		public static By Section10Field2label = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7ec']/div[2]/div/div");
		public static By Section10Field3label = By.xpath("//*[@id='f8e343264f9a5f0044a3cf401310c7ec']/div[2]/div/div");
		//	public static By Section10Field4label = By.xpath("//*[@id='ac94028bdb97130052fd96888a9619c6']/div[2]/div/div");
		
		
		public static By Section10Field1_1label = By.xpath("//label[@aria-label='Label for Rule']");
		public static By Section10Field1_1Data = By.xpath("//textarea[@aria-label='description']");	
		public static By Section10Field1RelatedClick = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7eb']/div[3]/div/div/div/div");
		
		public static By Section10Field2_1label = By.xpath("//label[@aria-label='Label for Structure Additional Comment']");
		public static By Section10Field2_1Data = By.xpath("//label[@aria-label='Label for Structure Additional Comment']/following-sibling::div/span/div/div/textarea");
		public static By Section10Field2RelatedClick = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7ec']/div[3]/div/div/div/div");

		public static By Section10Field3Data = By.xpath("//select[@aria-label='honours_grade_method']");
		
        // Data saved locators
		
		public static By Section10Field1Chev = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7eb']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section10Field1_1DataSaved = By.xpath("//label[@aria-label='Label for Rule']/following-sibling::div/span");
	
		public static By Section10Field2Chev = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7ec']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section10Field2_1DataSaved = By.xpath("//label[@aria-label='Label for Structure Additional Comment']/following-sibling::div/span");

		public static By Section10Field3DataSaved = By.xpath("//*[@id='f8e343264f9a5f0044a3cf401310c7ec']/div[3]/span");
	
		
		
		//section 12 locators
		
		public static By Section12Heading= By.xpath("//*[@id='78e343264f9a5f0044a3cf401310c7f1']/div[2]/div[1]/h2");
		public static By Section12Edit = By.xpath("//*[@id='78e343264f9a5f0044a3cf401310c7f1']/div[2]/div[2]/button");
		public static By Section12Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section12Field1label = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7f2']/div[2]/div/div");
		public static By Section12Field2label = By.xpath("//*[@id='f8e343264f9a5f0044a3cf401310c7f3']/div[2]/div/div");
		public static By Section12Field3label = By.xpath("//*[@id='619be98adbec3340ac7b8a264a9619c7']/div[2]/div/div");
		public static By Section12Field4label = By.xpath("//*[@id='38e343264f9a5f0044a3cf401310c7f8']/div[2]/div/div");
		public static By Section12Field5label = By.xpath("//*[@id='f0e343264f9a5f0044a3cf401310c7f9']/div[2]/div/div");
		public static By Section12Field6label = By.xpath("//*[@id='d71946d74f1a9f004beec61f0310c720']/div[2]/div/div");

		
		public static By Section12Field3_1label = By.xpath("//label[@aria-label='Label for Transformation Practice']");
		public static By Section12Field3_2label = By.xpath("//label[@aria-label='Label for Description']");
	
		public static By Section12Field1Data = By.xpath("//input[@type='text']");
		public static By Section12Field1DataClick = By.xpath("//div[@class='css-re31td']");
		
		public static By Section12Field2DateClick = By.xpath("//button[@class='css-1j77qaq-PlainButton-ButtonCommonStyle-ButtonFont-InvertedPlainButton-DatePickerIconButton']");
		public static By Section12Field2DateSelect = By.xpath("//div[@class='react-calendar__month-view__days']/button");

		
		public static By Section12Field3RelatedClick = By.xpath("//div[@class='DetailRelatedRecord RelatedRecord--editing']");

		public static By Section12Field3_1Data = By.xpath("//select[@aria-label='type']");
		public static By Section12Field3_2Data = By.xpath("//textarea[@aria-label='description']");
	
		public static By Section12Field4Data = By.xpath("//textarea[@aria-label='elp_scaffolding']");
		public static By Section12Field5Data = By.xpath("//textarea[@aria-label='wil_subjects']");
		public static By Section12Field6Data = By.xpath("//textarea[@aria-label='mb_3']");

		
        // Data saved locators
		
		public static By Section12Field1DataSaved = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7f2']/div[3]/span");
		public static By Section12Field2DataSaved = By.xpath("//*[@id='f8e343264f9a5f0044a3cf401310c7f3']/div[3]/span");
		
		public static By Section12Field3Chev = By.xpath("//*[@id='619be98adbec3340ac7b8a264a9619c7']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section12Field3_1DataSaved = By.xpath("//label[@aria-label='Label for Transformation Practice']/following-sibling::div/span");
		public static By Section12Field3_2DataSaved = By.xpath("//*[@id=\"619be98adbec3340ac7b8a264a9619c7\"]/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span"); 
		
		public static By Section12Field4DataSaved = By.xpath("//*[@id='38e343264f9a5f0044a3cf401310c7f8']/div[3]/span");
		public static By Section12Field5DataSaved = By.xpath("//*[@id='f0e343264f9a5f0044a3cf401310c7f9']/div[3]/span");
		public static By Section12Field6DataSaved = By.xpath("//*[@id='d71946d74f1a9f004beec61f0310c720']/div[3]/span");
		
	    //section 13 locators
		
		public static By Section13Heading= By.xpath("//*[@id='70e343264f9a5f0044a3cf401310c7fa']/div[2]/div[1]/h2");
		public static By Section13Edit = By.xpath("//*[@id='70e343264f9a5f0044a3cf401310c7fa']/div[2]/div[2]/button");
		public static By Section13Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section13Field1label = By.xpath("//*[@id='3ce343264f9a5f0044a3cf401310c7fa']/div[2]/div/div");
		public static By Section13Field2label = By.xpath("//*[@id='f4e343264f9a5f0044a3cf401310c7fb']/div[2]/div/div");

		public static By Section13Field1Data = By.xpath("//textarea[@aria-label='content_overview']");
		public static By Section13Field2Data = By.xpath("//textarea[@aria-label='pedagogical_design']");

		
        // Data saved locators
		
		public static By Section13Field1DataSaved = By.xpath("//*[@id='3ce343264f9a5f0044a3cf401310c7fa']/div[3]/span");
		public static By Section13Field2DataSaved = By.xpath("//*[@id='f4e343264f9a5f0044a3cf401310c7fb']/div[3]/span");

		
	    //section 14 locators
		
		public static By Section14Heading= By.xpath("//*[@id='f8e343264f9a5f0044a3cf401310c7e3']/div[2]/div[1]/h2");
		public static By Section14Edit = By.xpath("//*[@id='f8e343264f9a5f0044a3cf401310c7e3']/div[2]/div[2]/button");
		public static By Section14Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section14Field1label = By.xpath("//*[@id='b4e343264f9a5f0044a3cf401310c7e4']/div[2]/div/div");
		public static By Section14Field2label = By.xpath("//*[@id='70e343264f9a5f0044a3cf401310c7e5']/div[2]/div/div");
		public static By Section14Field3label = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7e6']/div[2]/div/div");
		public static By Section14Field4label = By.xpath("//*[@id='682a46d74f1a9f004beec61f0310c72e']/div[2]/div/div");
		
		public static By Section14Field2RelatedClick = By.xpath("//*[@id='70e343264f9a5f0044a3cf401310c7e5']/div[3]/div");
		public static By Section14Field3RelatedClick = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7e6']/div[3]/div");
		public static By Section14Field4RelatedClick = By.xpath("//*[@id='682a46d74f1a9f004beec61f0310c72e']/div[3]/div");
		
		public static By Section14Field1Yes = By.xpath("//*[@id='b4e343264f9a5f0044a3cf401310c7e4']/div[3]/span/div/div[1]/div/label/span/input");
		public static By Section14Field1No = By.xpath("//*[@id='b4e343264f9a5f0044a3cf401310c7e4']/div[3]/span/div/div[2]/div/label/span/input");

		public static By Section14Field2_1label = By.xpath("//label[@aria-label='Label for Offshore Delivery Partner']");
		public static By Section14Field2_2label = By.xpath("//label[@aria-label='Label for Amendments']");
		public static By Section14Field2_1Data = By.xpath("//input[@aria-label='offshore_delivery_partner']");
		public static By Section14Field2_2Data = By.xpath("//textarea[@aria-label='amendments']");
	
		public static By Section14Field3_1Label = By.xpath("//label[@aria-label='Label for Partner Name']");
		public static By Section14Field3_2Label = By.xpath("//label[@aria-label='Label for Arrangement Type']");
		public static By Section14Field3_3Label = By.xpath("//label[@aria-label='Label for Partnership Approval']");
		public static By Section14Field3_4Label = By.xpath("//label[@aria-label='Label for Details of Delivery']");
		public static By Section14Field3_5Label = By.xpath("//label[@aria-label='Label for Executed Agreement']");
		public static By Section14Field3_6Label = By.xpath("//label[@aria-label='Label for QA Arrangements']");
		
		public static By Section14Field3_1Data = By.xpath("//input[@aria-label='partner_name']");
		public static By Section14Field3_2Data = By.xpath("//div[@class='Form MultiSelect']/*");
		public static By Section14Field3_3Data = By.xpath("//textarea[@aria-label='partnership_approval']");
		public static By Section14Field3_4Data = By.xpath("//textarea[@aria-label='delivery_details']");
		public static By Section14Field3_5Yes = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7e6']/div[3]/div/div/table/tbody/tr[2]/td/form/div[5]/div/span/div/div[1]/div/label/span/input");
		public static By Section14Field3_5No = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7e6']/div[3]/div/div/table/tbody/tr[2]/td/form/div[5]/div/span/div/div[2]/div/label/span/input");
		public static By Section14Field3_6Data = By.xpath("//textarea[@aria-label='qa_arrangements']");
	
		
		public static By Section14Field4_1Label = By.xpath("//label[@aria-label='Label for Course Management']");
		public static By Section14Field4_2Label = By.xpath("//label[@aria-label='Label for Pre-Enrolment Engagement to Students ']");
		public static By Section14Field4_3Label = By.xpath("//label[@aria-label='Label for Care for and Services to Students ']");
		public static By Section14Field4_4Label = By.xpath("//label[@aria-label='Label for Student Visa Requirements ']");
		
		
		public static By Section14Field4_1Data = By.xpath("//textarea[@aria-label='course_management']");
		public static By Section14Field4_2Data = By.xpath("//textarea[@aria-label='pre_enrolment_engagement']");
		public static By Section14Field4_3Data = By.xpath("//textarea[@aria-label='student_care_and_services']");
		public static By Section14Field4_4Data = By.xpath("//textarea[@aria-label='visa_requirements']");

		
        // Data saved locators
		
		public static By Section14Field1DataSaved = By.xpath("//*[@id='b4e343264f9a5f0044a3cf401310c7e4']/div[3]/span");
	
		public static By Section14Field2Chev = By.xpath("//*[@id='70e343264f9a5f0044a3cf401310c7e5']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section14Field3Chev = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7e6']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section14Field4Chev = By.xpath("//*[@id='682a46d74f1a9f004beec61f0310c72e']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		
		public static By Section14Field2_1DataSaved = By.xpath("//label[@aria-label='Label for Offshore Delivery Partner']/following-sibling::div/span");
		public static By Section14Field2_2DataSaved = By.xpath("//label[@aria-label='Label for Amendments']/following-sibling::div/span");

		public static By Section14Field3_1DataSaved = By.xpath("//label[@aria-label='Label for Partner Name']/following-sibling::div/span");
		public static By Section14Field3_2DataSaved = By.xpath("//label[@aria-label='Label for Arrangement Type']/following-sibling::div/span");
		public static By Section14Field3_3DataSaved = By.xpath("//label[@aria-label='Label for Partnership Approval']/following-sibling::div/span");
		public static By Section14Field3_4DataSaved = By.xpath("//label[@aria-label='Label for Details of Delivery']/following-sibling::div/span");
		public static By Section14Field3_5DataSaved = By.xpath("//label[@aria-label='Label for Executed Agreement']/following-sibling::div/span");
		public static By Section14Field3_6DataSaved = By.xpath("//label[@aria-label='Label for QA Arrangements']/following-sibling::div/span");

		public static By Section14Field4_1DataSaved = By.xpath("//label[@aria-label='Label for Course Management']/following-sibling::div/span");
		public static By Section14Field4_2DataSaved = By.xpath("//label[@aria-label='Label for Pre-Enrolment Engagement to Students ']/following-sibling::div/span");
		public static By Section14Field4_3DataSaved = By.xpath("//label[@aria-label='Label for Care for and Services to Students ']/following-sibling::div/span");
		public static By Section14Field4_4DataSaved = By.xpath("//label[@aria-label='Label for Student Visa Requirements ']/following-sibling::div/span");

		
		
	    //section 15 locators
		
		public static By Section15Heading= By.xpath("//*[@id='b8e343264f9a5f0044a3cf401310c7de']/div[2]/div[1]/h2");
		public static By Section15Edit = By.xpath("//*[@id='b8e343264f9a5f0044a3cf401310c7de']/div[2]/div[2]/button");
		public static By Section15Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section15Field1label = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7df']/div[2]/div/div");
		public static By Section15Field2label = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7e0']/div[2]/div/div");
		public static By Section15Field3label = By.xpath("//*[@id='fce343264f9a5f0044a3cf401310c7e0']/div[2]/div/div");
		public static By Section15Field4label = By.xpath("//*[@id='aee2e2b54f6a93004beec61f0310c7e3']/div[2]/div/div");
		public static By Section15Field5label = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7e2']/div[2]/div/div");
		public static By Section15Field6label = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7e3']/div[2]/div/div");

		
		public static By Section15Field1RelatedClick = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7df']/div[3]/div");
	
		public static By Section15Field1_1label = By.xpath("//label[@aria-label='Label for Professional Body / Association Name']");
		public static By Section15Field1_2label = By.xpath("//label[@aria-label='Label for Date of Application']");
		public static By Section15Field1_3label = By.xpath("//label[@aria-label='Label for Accreditation Period']");
		public static By Section15Field1_4label = By.xpath("//label[@aria-label='Label for Additional Details']");
		
		public static By Section15Field1_1Data = By.xpath("//input[@aria-label='name']");
		public static By Section15Field1_2DateClick = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7df']/div[3]/div/div/table/tbody/tr[2]/td/form/div[2]/div/span/div/div/div[1]/button");
		public static By Section15Field1_2DateSelect = By.xpath("//div[@class='react-calendar__month-view__days']/button");
		public static By Section15Field1_3Data = By.xpath("//input[@aria-label='duration']");
		public static By Section15Field1_4Data = By.xpath("//textarea[@aria-label='description']");
		
		public static By Section15Field2DateClick = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7e0']/div[3]/span/div/div/div[1]/button");
		public static By Section15Field2DateSelect = By.xpath("//div[@class='react-calendar__month-view__days']/button");
	
		public static By Section15Field3Data = By.xpath("//textarea[@aria-label='caa_accreditation_description']");
		public static By Section15Field4Data = By.xpath("//div[@class='Form MultiSelect']/*");

		public static By Section15Field5Yes = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7e2']/div[3]/span/div/div[1]/div/label/span/input");
		public static By Section15Field5No = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7e2']/div[3]/span/div/div[2]/div/label/span/input");

		public static By Section15Field6Data = By.xpath("//textarea[@aria-label='caa_amendment_description']");



		
        // Data saved locators
		
	    public static By Section15Field1Chev = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7df']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		
	    public static By Section15Field1_1DataSaved = By.xpath("//label[@aria-label='Label for Professional Body / Association Name']/following-sibling::div/span");
		public static By Section15Field1_2DataSaved = By.xpath("//label[@aria-label='Label for Date of Application']/following-sibling::div/span");
		public static By Section15Field1_3DataSaved = By.xpath("//label[@aria-label='Label for Accreditation Period']/following-sibling::div/span");
		public static By Section15Field1_4DataSaved = By.xpath("//label[@aria-label='Label for Additional Details']/following-sibling::div/span");

		public static By Section15Field2DataSaved = By.xpath("//*[@id='34e343264f9a5f0044a3cf401310c7e0']/div[3]/span");
		public static By Section15Field3DataSaved = By.xpath("//*[@id='fce343264f9a5f0044a3cf401310c7e0']/div[3]/span");
		public static By Section15Field4DataSaved = By.xpath("//*[@id='aee2e2b54f6a93004beec61f0310c7e3']/div[3]/span");
		public static By Section15Field5DataSaved = By.xpath("//*[@id='74e343264f9a5f0044a3cf401310c7e2']/div[3]/span");
		public static By Section15Field6DataSaved = By.xpath("//*[@id='30e343264f9a5f0044a3cf401310c7e3']/div[3]/span");
	
		
	    //section 16 locators
		
		public static By Section16Heading= By.xpath("//*[@id='c9e383264f9a5f0044a3cf401310c701']/div[2]/div[1]/h2");
		public static By Section16Edit = By.xpath("//*[@id='c9e383264f9a5f0044a3cf401310c701']/div[2]/div[2]/button");
		public static By Section16Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section16Field1label = By.xpath("//*[@id='992cd3d6db687340ac7b8a264a9619a0']/div[2]/div/div");
		public static By Section16Field2label = By.xpath("//*[@id='427c9bd6db687340ac7b8a264a961986']/div[2]/div/div");
		
		public static By Section16Field1RelatedClick = By.xpath("//*[@id='992cd3d6db687340ac7b8a264a9619a0']/div[3]/div");
		public static By Section16Field2RelatedClick = By.xpath("//*[@id='427c9bd6db687340ac7b8a264a961986']/div[3]/div");

		public static By Section16Field1_1label = By.xpath("//*[@id='992cd3d6db687340ac7b8a264a9619a0']/div[3]/div/div/table/tbody/tr[2]/td/form/div/label");
		public static By Section16Field2_1label = By.xpath("//*[@id='427c9bd6db687340ac7b8a264a961986']/div[3]/div/div/table/tbody/tr[2]/td/form/div/label");
	
		public static By Section16Field1_1Data = By.xpath("//*[@id='992cd3d6db687340ac7b8a264a9619a0']/div[3]/div/div/table/tbody/tr[2]/td/form/div/div/span/div/div/textarea");
		public static By Section16Field2_1Data = By.xpath("//*[@id='427c9bd6db687340ac7b8a264a961986']/div[3]/div/div/table/tbody/tr[2]/td/form/div/div/span/div/div/textarea");

        // Data saved locators
		
	    public static By Section16Field1Chev = By.xpath("//*[@id='992cd3d6db687340ac7b8a264a9619a0']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
	    public static By Section16Field2Chev = By.xpath("//*[@id='427c9bd6db687340ac7b8a264a961986']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
	
	    public static By Section16Field1_1DataSaved = By.xpath("//*[@id='992cd3d6db687340ac7b8a264a9619a0']/div[3]/div/div/table/tbody/tr[2]/td/form/div/div/span");
		public static By Section16Field2_1DataSaved = By.xpath("//*[@id='427c9bd6db687340ac7b8a264a961986']/div[3]/div/div/table/tbody/tr[2]/td/form/div/div/span");

		//Section 17 locators

		
		public static By Section17Heading= By.xpath("//*[@id='89e383264f9a5f0044a3cf401310c704']/div[2]/div[1]/h2");
		public static By Section17Edit = By.xpath("//*[@id='89e383264f9a5f0044a3cf401310c704']/div[2]/div[2]/button");
		public static By Section17Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section17Field1label = By.xpath("//*[@id='45e383264f9a5f0044a3cf401310c705']/div[2]/div/div");

		public static By Section17Field1_1label = By.xpath("//label[@aria-label='Label for Type']");
		public static By Section17Field1_2label = By.xpath("//label[@aria-label='Label for Course Details']");
		public static By Section17Field1_3label = By.xpath("//label[@aria-label='Label for Additional Details']");
	
		public static By Section17Field1RelatedClick = By.xpath("//div[@class='DetailRelatedRecord RelatedRecord--editing']");

		public static By Section17Field1_1Data = By.xpath("//select[@aria-label='dependent_type']");
		public static By Section17Field1_2Data = By.xpath("//input[@type='text']");
		public static By Section17Field1_2DataClick = By.xpath("//div[@class='css-px1gc1']/div[1]");
		public static By Section17Field1_3Data = By.xpath("//textarea[@aria-label='description']");
	
        // Data saved locators
	
		public static By Section17Field1Chev = By.xpath("//*[@id='45e383264f9a5f0044a3cf401310c705']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");
		public static By Section17Field1_1DataSaved = By.xpath("//*[@id='45e383264f9a5f0044a3cf401310c705']/div[3]/div/div/table/tbody/tr[2]/td/form/div[1]/div/span");
		public static By Section17Field1_2DataSaved = By.xpath("//label[@aria-label='Label for Course Details']/following-sibling::div/span");
		public static By Section17Field1_3DataSaved = By.xpath("//*[@id='45e383264f9a5f0044a3cf401310c705']/div[3]/div/div/table/tbody/tr[2]/td/form/div[3]/div/span"); 
		
		//Section 18 locators

		
		public static By Section18Heading= By.xpath("//*[@id='05e383264f9a5f0044a3cf401310c706']/div[2]/div[1]/h2");
		public static By Section18Edit = By.xpath("//*[@id='05e383264f9a5f0044a3cf401310c706']/div[2]/div[2]/button");
		public static By Section18Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section18Field1label = By.xpath("//*[@id='1925ba314faa93004beec61f0310c767']/div[2]/div/div");
		public static By Section18Field2label = By.xpath("//*[@id='89e383264f9a5f0044a3cf401310c707']/div[2]/div/div");

		public static By Section18Field1Data = By.xpath("//select[@aria-label='sisp_approval']");
		public static By Section18Field2Data = By.xpath("//div[@class='Form MultiSelect']/*");

	
        // Data saved locators
	
		public static By Section18Field1DataSaved = By.xpath("//*[@id='1925ba314faa93004beec61f0310c767']/div[3]/span");
		public static By Section18Field2DataSaved = By.xpath("//*[@id='89e383264f9a5f0044a3cf401310c707']/div[3]/span");
		
		
		
		//Section 19 locators
		
		
		
		public static By Section19Heading= By.xpath("//*[@id='45e383264f9a5f0044a3cf401310c708']/div[2]/div[1]/h2");
		public static By Section19Edit = By.xpath("//*[@id='45e383264f9a5f0044a3cf401310c708']/div[2]/div[2]/button");
		public static By Section19Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section19Field1label = By.xpath("//*[@id='01e383264f9a5f0044a3cf401310c709']/div[2]/div/div");
		public static By Section19Field2label = By.xpath("//*[@id='a303024bdb97130052fd96888a961921']/div[2]/div/div");
		public static By Section19Field3label = By.xpath("//*[@id='c9e383264f9a5f0044a3cf401310c709']/div[2]/div/div");
		public static By Section19Field4label = By.xpath("//*[@id='85e383264f9a5f0044a3cf401310c70a']/div[2]/div/div");
		public static By Section19Field5label = By.xpath("//*[@id='41e383264f9a5f0044a3cf401310c70b']/div[2]/div/div");
		public static By Section19Field6label = By.xpath("//*[@id='0de383264f9a5f0044a3cf401310c70b']/div[2]/div/div");
		public static By Section19Field7label = By.xpath("//*[@id='c5e383264f9a5f0044a3cf401310c70c']/div[2]/div/div");
		public static By Section19Field8label = By.xpath("//*[@id='81e383264f9a5f0044a3cf401310c70d']/div[2]/div/div");
		
		public static By Section19Field1Yes = By.xpath("//*[@id='01e383264f9a5f0044a3cf401310c709']/div[3]/span/div/div[1]/div/label/span/input");
		public static By Section19Field1No = By.xpath("//*[@id='01e383264f9a5f0044a3cf401310c709']/div[3]/span/div/div[2]/div/label/span/input");
		
	
		public static By Section19Field1 = By.xpath("//select[@aria-label='published_in_handbook']");
		public static By Section19Field2Data = By.xpath("//select[@aria-label='primary_study_area']");
		public static By Section19Field3Data = By.xpath("//div[@class='Form MultiSelect']/*");
		public static By Section19Field4DataFrame = By.xpath("//*[@id='85e383264f9a5f0044a3cf401310c70a']/div[3]/span/div/div/div/div/div[2]/iframe");
		public static By Section19Field4Data = By.xpath("//body[@id='tinymce']");
		public static By Section19Field5Data = By.xpath("//textarea[@aria-label='market_position']");
		public static By Section19Field6DataFrame = By.xpath("//*[@id='0de383264f9a5f0044a3cf401310c70b']/div[3]/span/div/div/div/div/div[2]/iframe");
		public static By Section19Field6Data = By.xpath("//body[@id='tinymce']");
		public static By Section19Field7Yes = By.xpath("//*[@id='c5e383264f9a5f0044a3cf401310c70c']/div[3]/span/div/div[1]/div/label/span/input");
		public static By Section19Field7No = By.xpath("//*[@id='c5e383264f9a5f0044a3cf401310c70c']/div[3]/span/div/div[2]/div/label/span/input");
		public static By Section19Field8Data = By.xpath("//textarea[@aria-label='course_finder_text']");
		
		
        // Data saved locators
		
	 
	    public static By Section19Field1DataSaved = By.xpath("//*[@id='01e383264f9a5f0044a3cf401310c709']/div[3]/span");
		public static By Section19Field2DataSaved = By.xpath("//*[@id='a303024bdb97130052fd96888a961921']/div[3]/span");
		public static By Section19Field3DataSaved = By.xpath("//*[@id='c9e383264f9a5f0044a3cf401310c709']/div[3]/span");
		public static By Section19Field4DataSaved = By.xpath("//*[@id='85e383264f9a5f0044a3cf401310c70a']/div[3]/span");
		public static By Section19Field5DataSaved = By.xpath("//*[@id='41e383264f9a5f0044a3cf401310c70b']/div[3]/span");
		public static By Section19Field6DataSaved = By.xpath("//*[@id='0de383264f9a5f0044a3cf401310c70b']/div[3]/span");
		public static By Section19Field7DataSaved = By.xpath("//*[@id='c5e383264f9a5f0044a3cf401310c70c']/div[3]/span");
		public static By Section19Field8DataSaved = By.xpath("//*[@id='81e383264f9a5f0044a3cf401310c70d']/div[3]/span");

		
		
		
		//Section 21 locators

		
		public static By Section21Heading= By.xpath("//*[@id='8b7c875adb287340ac7b8a264a96199f']/div[2]/div[1]/h2");
		public static By Section21Edit = By.xpath("//*[@id='8b7c875adb287340ac7b8a264a96199f']/div[2]/div[2]/button");
		public static By Section21Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section21Field1label = By.xpath("//*[@id='0e9c4b5edb287340ac7b8a264a9619cc']/div[2]/div/div");
		public static By Section21Field1_1label = By.xpath("//label[@aria-label='Label for Faculty Contact']");
		public static By Section21Field1RelatedClick = By.xpath("//div[@class='DetailRelatedRecord RelatedRecord--editing']");
		public static By Section21Field1_1Data = By.xpath("//input[@aria-label='contact_email']");
		
		public static By Section21Field1Chev = By.xpath("//*[@id='0e9c4b5edb287340ac7b8a264a9619cc']/div[3]/div/div/table/tbody/tr[1]/td[1]/div");

        // Data saved locators
	
		public static By Section21Field1_1DataSaved = By.xpath("//label[@aria-label='Label for Faculty Contact']/following-sibling::div/span");

		
	    //section 20 locators
		
		public static By Section20Heading= By.xpath("//*[@id='4de383264f9a5f0044a3cf401310c70d']/div[2]/div[1]/h2");
		public static By Section20Edit = By.xpath("//*[@id='4de383264f9a5f0044a3cf401310c70d']/div[2]/div[2]/button");
		public static By Section20Save = By.xpath("//button[@class='css-kmfbfi-PlainButton-ButtonCommonStyle-ButtonFont-ActivePlainButton']");

		public static By Section20Field1label = By.xpath("//*[@id='c3911cf2db0c0c10f65ba0311496196a']/div[2]/div/div");
		public static By Section20Field2label = By.xpath("//*[@id='4dacee8cdb20b74052fd96888a961919']/div[2]/div/div");
		public static By Section20Field3label = By.xpath("//*[@id='5361fd4adbd7130052fd96888a961912']/div[2]/div/div");
		public static By Section20Field4label = By.xpath("//*[@id='c1e383264f9a5f0044a3cf401310c70f']/div[2]/div/div");
		public static By Section20Field5label = By.xpath("//*[@id='8c00c6a5db5fbb0052fd96888a961962']/div[2]/div/div");

		
		//public static By Section20Field1Yes = By.xpath("//*[@id='09e383264f9a5f0044a3cf401310c70e']/div[3]/span/div/div[1]/div/label/span/input");
		//public static By Section20Field1No = By.xpath("//*[@id='09e383264f9a5f0044a3cf401310c70e']/div[3]/span/div/div[2]/div/label/span/input");
		
	
		public static By Section20Field1 = By.xpath("//select[@aria-label='published_in_handbook']");
		public static By Section20Field2Data = By.xpath("//input[@class='css-128qk4e']");
		public static By Section20Field2DataClick = By.xpath("//*[@id='4dacee8cdb20b74052fd96888a961919']/div[3]/span/div/div/div[2]/div[1]/label");
		public static By Section20Field3Data = By.xpath("//div[@class='Form MultiSelect']/*");
	//	public static By Section20Field4Data = By.xpath("//[@id='tinymce']");

		public static By Section20Field4DataFrame = By.xpath("//*[@id='c1e383264f9a5f0044a3cf401310c70f']/div[3]/span/div/div/div/div/div[2]/iframe");
		public static By Section20Field4Data = By.xpath("//body[@id='tinymce']");
		public static By Section20Field5DataFrame = By.xpath("//*[@id='8c00c6a5db5fbb0052fd96888a961962']/div[3]/span/div/div/div/div/div[2]/iframe");
		public static By Section20Field5Data = By.xpath("//body[@id='tinymce']");
		
	
        // Data saved locators
		
	 
	    public static By Section20Field1DataSaved = By.xpath("//*[@id='c3911cf2db0c0c10f65ba0311496196a']/div[3]/span");
		public static By Section20Field2DataSaved = By.xpath("//*[@id='4dacee8cdb20b74052fd96888a961919']/div[3]/span");
		public static By Section20Field3DataSaved = By.xpath("//*[@id='5361fd4adbd7130052fd96888a961912']/div[3]/span");
		public static By Section20Field4DataSaved = By.xpath("//*[@id='c1e383264f9a5f0044a3cf401310c70f']/div[3]/span");
		public static By Section20Field5DataSaved = By.xpath("//*[@id='8c00c6a5db5fbb0052fd96888a961962']/div[3]/span");


		
	}
	
	
		
	

	public static class FacultyPage {

		public static By UNDERGRADUATEBTN = By.xpath("//button[@aria-controls='Undergraduate']");

		public static class Undergraduate {
			public static By PROGRAMLIST = By.xpath("//div[@id=\'singleCourseUndergraduate\']/a/div/div[3]");
			public static By PROGRAMLISTVIEWMORE = By.xpath("//*[@id=\"singleCourseUndergraduate\"]/div/button");
			public static By PROGRAMLISTSEARCH = By.xpath("//*[@id=\"singleCourseUndergraduate\"]/div/button/../a");
			public static By DOUBLEDEGREEPROGRAMLIST = By.xpath("//div[@id=\'multiCourseUndergraduate\']/a/div/div[3]");
			public static By DOUBLEDEGREEPROGRAMLISTVIEWMORE = By
					.xpath("//*[@id=\"multiCourseUndergraduate\"]/div/button");
			public static By DOUBLEDEGREEPROGRAMLISTSEARCH = By
					.xpath("//*[@id=\"multiCourseUndergraduate\"]/div/button/../a");
			public static By SPECIALPROGRAMLIST = By.xpath("//div[@id='aosUndergraduate1']/a/div/div[3]");
			public static By SPECIALPROGRAMLISTVIEWMORE = By.xpath("//*[@id=\"aosUndergraduate1\"]/div/button");
			public static By SPECIALPROGRAMLISTSEARCH = By.xpath("//*[@id=\"aosUndergraduate1\"]/div/button/../a");
			public static By COURSEPROGRAMLIST = By.xpath("//div[@id=\'subjectUndergraduate\']/a/div/div[1]");
			public static By COURSEPROGRAMLISTVIEWMORE = By.xpath("//*[@id=\"subjectUndergraduate\"]/div/button");
			public static By COURSEPROGRAMLISTSEARCH = By.xpath("//*[@id=\"subjectUndergraduate\"]/div/button/../a");
		}

		public static By POSTGRADUATEBTN = By.xpath("//button[@aria-controls='Postgraduate']");

		public static class Postgraduate {
			public static By PROGRAMLIST = By.xpath("//div[@id=\'singleCoursePostgraduate\']/a/div/div[3]");
			public static By PROGRAMLISTVIEWMORE = By.xpath("//*[@id=\"singleCoursePostgraduate\"]/div/button");
			public static By PROGRAMLISTSEARCH = By.xpath("//*[@id=\"singleCoursePostgraduate\"]/div/button/../a");
			public static By DOUBLEDEGREEPROGRAMLIST = By.xpath("//div[@id=\'multiCoursePostgraduate\']/a/div/div[3]");
			public static By DOUBLEDEGREEPROGRAMLISTVIEWMORE = By
					.xpath("//*[@id=\"multiCoursePostgraduate\"]/div/button");
			public static By DOUBLEDEGREEPROGRAMLISTSEARCH = By
					.xpath("//*[@id=\"multiCoursePostgraduate\"]/div/button/../a");
			public static By SPECIALPROGRAMLIST = By.xpath("//div[@id=\'aosPostgraduate\']/a/div/div[3]");
			public static By SPECIALPROGRAMLISTVIEWMORE = By.xpath("//*[@id=\"aosPostgraduate\"]/div/button");
			public static By SPECIALPROGRAMLISTSEARCH = By.xpath("//*[@id=\"aosPostgraduate\"]/div/button/../a");
			public static By COURSEPROGRAMLIST = By.xpath("//div[@id=\'subjectPostgraduate\']/a/div/div[1]");
			public static By COURSEPROGRAMLISTVIEWMORE = By.xpath("//*[@id=\"subjectPostgraduate\"]/div/button");
			public static By COURSEPROGRAMLISTSEARCH = By.xpath("//*[@id=\"subjectPostgraduate\"]/div/button/../a");
		}

	}

	public static class BrowsePage {
		public static By RESEARCH = By.xpath("//button[text()='Research']");
		public static final By TITLE = By.xpath("//h2[@class='a-browse-heading']");
		public static By AREAOFINTEREST = By.xpath("//button[text()='By Areas of Interest']");
		public static By FACULTIES = By.xpath("//button[text()='By Faculty']");
		public static By POSTGRADUATE = By.xpath("//button[text()='Postgraduate']");
		public static By FACULTY = By.xpath("//button[contains(text(),'By Faculty')]");
		public static By FACULTY_LINK = By.xpath("//div[@class='a-browse-info--section a-browse-info--flex']/a");
		public static By AREAOFINTERESTTABS = By.xpath("//div[@id='tab_field_of_education']/a");
		public static By AREAOFFACULTY = By.xpath("//div[@id='tab_OrgUnits']/a");
		public static By SUBJECTAREALINK = By.xpath("//button[contains(text(),'By Subject Area')]");
		public static By BROWSEPAGELEFTPANEITEMS = By.xpath("(//div[@class='m-page-nav-list'])[1]/div");
		public static By BROWSERHEADERS_UG = By.xpath("(//div[@id='Undergraduate'])[1]/h3");
		public static By BROWSERHEADERS_PG = By.xpath("(//div[@id='Postgraduate'])[1]/h3");
		public static By SEARCHBTN = By.xpath("//h2[text()='search']");
		public static By SUBJECTAREA = By.xpath("//div[@id='tab_educational_area']/a");

		public static By getDescriptionByTitle(String sTitle) {
			return By.xpath("//h3[text()='" + sTitle + "']/../following-sibling::div/p");
		}

		public static By clickTitle(String titleName) {
			return By.xpath("//h3[text()='" + titleName + "']/../..");
		}

		public static By AREAOFINTERSTACTIVE = By
				.xpath("//div[@class='m-tab-panel__item m-tab-panel__item--active p-left-0']");

		public static By UNDERGRADUATEBTN = By.xpath("//button[@aria-controls='Undergraduate']");

		public static class Undergraduate {
			public static By PROGRAMLIST = By.xpath("//div[@id=\'singleCourseUndergraduate\']/a/div/div[3]");
			public static By PROGRAMLISTBIG = By.xpath("//div[@id=\'singleCourseUndergraduate\']/a/div/h4");
			public static By PROGRAMLISTVIEWMORE = By.xpath("//*[@id=\"singleCourseUndergraduate\"]/div/button");
			public static By PROGRAMLISTSEARCH = By.xpath("//*[@id=\"singleCourseUndergraduate\"]/div/button/../a");
			public static By DOUBLEDEGREEPROGRAMLIST = By.xpath("//div[@id=\'multiCourseUndergraduate\']/a/div/div[3]");
			public static By DOUBLEDEGREEPROGRAMLISTBIG = By.xpath("//div[@id=\'multiCourseUndergraduate\']/a/div/h4");
			public static By DOUBLEDEGREEPROGRAMLISTVIEWMORE = By
					.xpath("//*[@id=\"multiCourseUndergraduate\"]/div/button");
			public static By DOUBLEDEGREEPROGRAMLISTSEARCH = By
					.xpath("//*[@id=\"multiCourseUndergraduate\"]/div/button/../a");
			public static By SPECIALPROGRAMLIST = By.xpath("//div[@id='aosUndergraduate1']/a/div/div[3]");
			public static By SPECIALPROGRAMLISTVIEWMORE = By.xpath("//*[@id=\"aosUndergraduate1\"]/div/button");
			public static By SPECIALPROGRAMLISTSEARCH = By.xpath("//*[@id=\"aosUndergraduate1\"]/div/button/../a");
			public static By COURSEPROGRAMLIST = By.xpath("//div[@id=\'subjectUndergraduate\']/a/div/div[1]");
			public static By COURSEPROGRAMLISTVIEWMORE = By.xpath("//*[@id=\"subjectUndergraduate\"]/div/button");
			public static By COURSEPROGRAMLISTSEARCH = By.xpath("//*[@id=\"subjectUndergraduate\"]/div/button/../a");
		}

		public static By POSTGRADUATEBTN = By.xpath("//button[@aria-controls='Postgraduate']");

		public static class Postgraduate {
			public static By PROGRAMLIST = By.xpath("//div[@id=\'singleCoursePostgraduate\']/a/div/div[3]");
			public static By PROGRAMLISTVIEWMORE = By.xpath("//*[@id=\"singleCoursePostgraduate\"]/div/button");
			public static By PROGRAMLISTSEARCH = By.xpath("//*[@id=\"singleCoursePostgraduate\"]/div/button/../a");
			public static By DOUBLEDEGREEPROGRAMLIST = By.xpath("//div[@id=\'multiCoursePostgraduate\']/a/div/div[3]");
			public static By DOUBLEDEGREEPROGRAMLISTVIEWMORE = By
					.xpath("//*[@id=\"multiCoursePostgraduate\"]/div/button");
			public static By DOUBLEDEGREEPROGRAMLISTSEARCH = By
					.xpath("//*[@id=\"multiCoursePostgraduate\"]/div/button/../a");
			public static By SPECIALPROGRAMLIST = By.xpath("//div[@id=\'aosPostgraduate\']/a/div/div[3]");
			public static By SPECIALPROGRAMLISTVIEWMORE = By.xpath("//*[@id=\"aosPostgraduate\"]/div/button");
			public static By SPECIALPROGRAMLISTSEARCH = By.xpath("//*[@id=\"aosPostgraduate\"]/div/button/../a");
			public static By COURSEPROGRAMLIST = By.xpath("//div[@id=\'subjectPostgraduate\']/a/div/div[1]");
			public static By COURSEPROGRAMLISTVIEWMORE = By.xpath("//*[@id=\"subjectPostgraduate\"]/div/button");
			public static By COURSEPROGRAMLISTSEARCH = By.xpath("//*[@id=\"subjectPostgraduate\"]/div/button/../a");
		}

	}

	public static class HomePage {
		public static final By MYLISTVIEWALLBTN = By.xpath("(//*[contains(text(),'View all')])[3]");
		public static By IFRAME = By.xpath("//iframe[@id='gsft_main']");
		public static By BANNERTEXT = By.xpath("//span[@class='banner-text h5 hidden-xs']");
		public static By USERNAME = By.xpath("//input[@id='user_name']");
		public static By PASSWORD = By.xpath("//input[@id='user_password']");
		public static By LOGIN_BTN = By.xpath("//button[@id='sysverb_login']");
		public static By SEARCH = By.xpath("//input[@class='m-mini-search-field__input']");
		public static By SEARCHSUGGESTIONS = By.xpath("//ul[@id='mini-search__suggestions']/li");
		public static By SEARCHBUTTON = By.xpath("//i[text()='search']");
		public static By LOGO = By.xpath("//*[@class='a-logo']/..");
		public static By RECENT = By.xpath("//h3[text()='Recently viewed']");
		public static By BROWSE = By.xpath("//h2[text()='Browse']");
		public static By SUBJECTAREABTN = By.xpath("//button[contains(text(),'By Subject Area')]");
		public static By SUBJECTAREATABS = By.xpath("//div[@id='tab_educational_area']/a");
		public static By FACULTYBTN = By.xpath("//button[@aria-controls='tab_OrgUnits']");
		public static By FACULTYCONTAINERTABS = By.xpath("//div[@id='tab_OrgUnits']/a");
		public static By AREAOFINTERESTTABS = By.xpath("//div[@id='tab_field_of_education']/a");
		public static By AREAOFINTERESTBTN = By.xpath("//button[@class='p-left-0']");
		public static By LOGOUT = By.xpath("//button[text()='Logout']");
		public static By HOMEBTN = By.xpath("//*[@id=\"breadcrumbs-nav\"]/div/ul/li[1]/a");
		public static By BROWSEMENUBTN = By.xpath("//i[@class='a-icon']");
		public static By BROWSEMENUCONTAINER = By.xpath("//div[@class='a-sticky a-hamburger no-print showcase']");
		public static By MENU = By.xpath("//*[@id=\"homepage-template\"]/header/div[2]/button");

		public static By HEADEREXTERNALLINKS = By.xpath("//div[@class='a-nav-links']/a");
		public static By FOOTEREXERNALLINKS = By.xpath("//div[@class='footer-flex a-wrapper']/a");
		public static By PAGEFOOTERLINKS = By.xpath(
				"//div[@class='a-column a-column-df-10 a-column-md-12 a-column-sm-12 a-column-df-offset-2 a-column-md-offset-0']/a");

		public static By ENGINEERINGTILE = By.xpath("//*[@id='tab_field_of_education']/a[4]");

		public static class hamburgerMenu {
			public static final By MYLIST = By.xpath("//button/h2[contains(text(),'My Lists')]");
			public static final By VIEWALLBTN = By
					.xpath("//a[@class='a-lettuce level-two'][contains(text(),'View all')]");
			public static By HAMBURGEREXTERNALLINKS = By
					.xpath("//*[@id=\"homepage-template\"]/div[2]/div[1]/div/div[2]/div/a");
			public static By FACULTY = By.xpath("//h4[@aria-hidden='true'][contains(text(),'Faculty')]");
			public static By FACULTYOFENGINEERING = By
					.xpath("//div[@class='a-patty showcase']//h4[contains(text(),'Faculty of Engineering')]");
		}
	}



	public static class ProgramPage {

		public static final By NAVIGATIONHEADERS = By.xpath("//div[@id='pageNavContainer']/div/div/div/a");
		public static final By TITLETEXT = By.xpath("//span[@data-hbui='module-title']");
		public static final By CODE = By.xpath("//strong[@class='code']");
		public static final By DESCRIPTION = By
				.xpath("//div[@id='readMoreToggle1']//div[contains(@class,'a-card-text m-toggle-text')]//div");
		public static final By DELIVERYMODETEXT = By
				.xpath("//div[@role='complementary']//button[text()='Delivery Mode']/../following::p[1]");
		public static final By DELIVERYMODE = By.xpath("//div[@role='complementary']//button[text()='Delivery Mode']");
		public static final By INTAKEPERIODTEXT = By
				.xpath("//div[@role='complementary']//strong[text()='Intake Period']/../p");
		public static final By DURATION = By.xpath("//div[@role='complementary']//strong[text()='Typical duration']");
		public static final By DURATIONTEXT = By
				.xpath("//div[@role='complementary']//strong[text()='Typical duration']/../p");
		public static final By INTAKEPERIOD = By.xpath("//div[@role='complementary']//strong[text()='Intake Period']");
		public static final By CAMPUSTEXT = By.xpath("//div[@role='complementary']//strong[text()='Campus']/../p");
		public static final By QUICKLINKS = By.xpath(
				"//div[@class='a-column a-column-df-3 hide-xs hide-sm no-print']//div[@class='a-quick-links a-card flat']/a");
		public static final By LEARNINGOUTCOMES = By.xpath("//div[@id='learning-outcomes']/div");
		public static final By DAPLEARNINGOUTCOMES = By
				.xpath("//div[@id='dual-awards-learning-outcomes']/div[not(@aria-hidden='true')]/div");
		public static final By SAMPLEPROGRAMSHEADER = By.xpath("//h3[contains(text(),'Sample Programs')]");
		public static final By ADMISSIONREQUIREMENTS = By
				.xpath("//div[@class='m-accordion-group m-accordion-with-header']/div");
		public static final By PROGRAMREQUIREMENTS = By.xpath("//div[@id='programRequirements']/div");
		public static final By PATHWAYS = By.xpath("//div[@id='pathways']/div");
		public static final By TYPEPILLTEXT = By
				.xpath("//div[@class='a-chip-row a-btn-bookmark-offset']//div[contains(@class,'a-chip')]/span/button");
		public static final By ADITIONALINFROMATION = By.xpath("//div[@id='additional']");
		public static final By ADDITIONALEXPENSES = By.xpath("//div[@id='fees']/div[3]");

		public static final By RECOGNITIONOFACHIEVEMENT = By.xpath("//div[@id='recognitionBachelors']/div");
		public static final By FACULTYLINK = By.xpath("(//button[text()='Faculty'])[2]/../../following-sibling::a");
		public static final By AVIALABLEINPROGRAMSTABS = By.xpath("//div[@class='o-card-deck']/a");
		public static final By AVIALABLEINPROGRAMSTABSSMALL = By
				.xpath("//div[@id='availableInPrograms_acc_${$velocityCount}']/div/a/div");
		public static final By STANDALONEPROGRAMCODES = By.xpath("//div[@id='standAloneCourseInfo']//div/span");
		public static final By RELATEDDAPTABS = By
				.xpath("//div[@id='relatedAcademicItems_1']//div[@id='accordion-header-footer']/div");
		public static final By RELATEDDAPCODES = By
				.xpath("//div[@id='relatedAcademicItems_1']//div[@id='accordion-header-footer']//div//div/strong");
		public static final By RELATEDSAPTABS = By
				.xpath("//div[@id='relatedAcademicItems_2']//div[@id='accordion-header-footer']/div");
		public static final By RELATEDSAPCODES = By
				.xpath("//div[@id='relatedAcademicItems_2']//div[@id='accordion-header-footer']//div//div/strong");
		public static final By BOOKMARKBTN = By.xpath("//div[@id='intro']/button");
		public static final By BANNERGOTOMYLIST = By.xpath("//a[contains(text(),'Go to MyList')]");

		public static class ProfessionalOutcomes {
			public static final By ACCREDITATIONSTEXT = By.xpath("//strong[@aria-label='Accreditations']");
			public static final By ACCREDITATIONSBODY = By.xpath("//div[@id='toggleBodyProfAccred']/div");
			public static final By CAREEROPPORTUNITIESTEXT = By.xpath("//strong[@aria-label='Career Opportunities']");
			public static final By CAREEROPPORTUNITIESBODY = By.xpath("//div[@id='toggleBodyCareerOps']/div");
			public static final By PROFESSIONALRECOGNITIONTEXT = By
					.xpath("//strong[@aria-label='Professional Recognition']");
			public static final By PROFESSIONALRECOGNITIONBODY = By.xpath("//div[@id='toggleBodyProfRecog']/div");
		}

		public static class ProgramStructure {
			public static final By LEVEL1EXPANDER = By.xpath("//a[@id='toggleLink_core_courses_1']");
			public static final By LEVEL1COURSES = By.xpath(
					"//div[@class='m-accordion-body-inner has-focus']//div[@class='o-course-list single-col']/div");
			public static final By TITLE = By.xpath("//div[@id='structure']/div/div/h3");
		}
	}


	public static class AcamedicItemPage {
		public static class SideMenu {
			public static final By PROGRAMSTRUCTURE = By.xpath("(//a[contains(@href,'#structure')])[1]");
		}

		public static class OverviewModule {
			public static final By OVERVIEWCODE = By.xpath("//div[@class='m-ai-overview-details']/div[1]");
			public static final By UNITCREDITS = By.xpath("//span[@class='hide-xs']");
			public static final By AIPILL = By.xpath("//div[@class='o-ai-overview-inner-top']/div//button");
			public static final By AIPILLSPECIALISATION = By
					.xpath("//div[contains(@class,'a-chip')][contains(text(),'Specialisation')]");
			public static final By TITLE = By.xpath("//h1[@class='o-ai-overview__h1']");
			public static final By OVERVIEWPANEL = By.xpath("//div[@class='o-ai-overview-inner-top']");
			public static final By YEARSWITCHER = By.xpath("//button[@class='a-btn-secondary btn-open']");
			public static final By VIEWINGYEAR = By.xpath(
					"//div[@class='m-ai-overview-details__cell m-ai-overview-details--hb-version hide-xs title']");
			public static final By BOOKMARKBTN = By.xpath("//button[@class='a-btn-bookmark']");
		}

		public static By STUDYASTOOLTIP = By.xpath("(//button[@class='helptext__help--label'])[1]");
		public static final By BOOKMARKBUTTON = By
				.xpath("//div[@class='o-ai-overview-inner-top']//button[@class='a-btn-bookmark']");
		public static final By BOOKMARKBUTTONCLICKED = By
				.xpath("//button[@class='a-btn-bookmark a-btn-bookmark--marked']");
		public static By STUDYAS = By.xpath("//div[@class='a-chip-row a-btn-bookmark-offset']/div");
		public static By STUDYLEVEL = By.xpath("(//strong[text()='Study Level'])[2]/following::button[1]");
		public static By Faculty = By.xpath("(//div[@class='a-row a-row-equal-height'])[2]/div//a");
		public static By DESCRIPTION = By.xpath("//p[@class='a-browse-info--section a-browse-description']");
		public static By FACULTY = By.xpath("(//div[@class='a-row a-row-equal-height o-attributes-table'])[2]//a");
		public static By SPECIALISATIONTYPE = By
				.xpath("(//button[@class='helptext__help--label'][text()='Specialisation'])[2]//following::button[1]");
		public static By OFFERINGTERMS = By.xpath(
				"(//button[@class='helptext__help--label'][text()='Offering Terms'])[2]/../span//following::p[1]");
		public static By DELIVERYMODE = By.xpath(
				"(//button[@class='helptext__help--label'][text()='Delivery Mode'])[2]/../span//following::p[1]");
		public static By FEESSECTION = By.xpath("//div[@id='subject-fees']");
		public static By FACULTYSPECIAL = By
				.xpath("((//div[@class='a-row a-row-equal-height o-attributes-table'])[2]//a)[1]");
		public static By TITLE = By.xpath("//div[@class='a-browse-intro a-row']/h2");
		public static By SPECIALREQUIRMENTS = By
				.xpath("(//h4[contains(text(),'Specialisation Requirements')]/..//following::div[1])[1]");
		public static By YEARSWITCH = By.xpath("//button[@class='a-btn-secondary btn-open']");
		public static By CHANGEYEAR = By.xpath("//label[@class='']");
		public static By EMBEDDEDSTRUCTUREITEMS = By
				.xpath("//div[@class='m-single-course-wrapper'][@data-hbui-filter-item='specialisation']/a");

		public static By TOOLTIPSTUDYLEVELTYPE(String name) {
			By xpath = By.xpath("(//button[text()='" + name + "'])[1]/../span[@aria-hidden='false']");
			return xpath;
		}

		public static By ACADEMICITEMINFOBUTTON(String name) {
			By xpath = By.xpath("(//button[text()='" + name + "'])[2]");
			return xpath;
		}

		public static By ACAMEDIC_ITEM_TOOLTIP_TRUE(String name) {
			By xpath = By.xpath("(//button[text()='" + name + "'])[2]/../span[@aria-hidden='false']");
			return xpath;
		}
	}

	public static class SpecialisationPage {
		public static final By LEARNINGOUTCOMES = By.xpath("//div[@id='subject-lo']/div");
		public static final By TITLETEXT = By.xpath("//span[@data-hbui='module-title']");
		public static final By CODE = By.xpath("//strong[@class='code']");
		public static final By DESCRIPTION = By
				.xpath("//div[@id='readMoreToggle1']//div[contains(@class,'a-card-text m-toggle-text')]//div");
		public static final By ADDITIONALINFORMATION = By.xpath("//div[@id='additional']");
	}

	public static class ResearchPage {
		public static final By TEACHINGCALANDER = By
				.xpath("(//strong[text()='Academic Calendar'])[2]/following-sibling::p");
		public static final By STUDYLVLDESCRIPTION = By
				.xpath("(//strong[text()='Study Level'])[2]/following-sibling::p/span/span");
		public static final By STUDYLVL = By.xpath("(//strong[text()='Study Level'])[2]/following-sibling::p/span");
	}



	public static class MyListPage {

		public static final By PROGRAMCODES = By.xpath("//p[@class='m-my-list-item--code']");
		public static final By EMPTYCARD = By.xpath("//div[@class='a-card o-my-list--empty']");
		public static final By EDITBTN = By.xpath("//a[@class='edit-local-storage__edit']");
		public static final By CLEARALLBTN = By.xpath("//a[@class='edit-local-storage__clear']");
		public static final By FIRSTREMOVEBTN = By.xpath("(//button[@class='m-my-list-item--delete a-icon'])[1]");
		public static final By DONEBTN = By.xpath("//a[@class='edit-local-storage__edit']");
		public static final By RECENTLYVIEWEDSECTION = By.xpath("//div[@class='o-recently-viewed']");
		public static final By CLEARRECENTLYVIEWED = By
				.xpath("//div[@class='o-recently-viewed']//*[contains(text(),'Clear all')]");
		public static final By ITEMS = By.xpath(
				"//div[@class='o-my-list o-my-list-editable']//div[@class='m-fixed-width-grid-scroller allow-wrap']//a");
		public static final By RECENTLYVIEWEDITEMS = By
				.xpath("//div[@class='o-recently-viewed']//div[@class='m-fixed-width-grid-scroller allow-wrap']//a");

	}



	public static Object SearchPage;



	
}
