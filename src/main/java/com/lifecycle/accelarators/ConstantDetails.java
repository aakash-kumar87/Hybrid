package com.lifecycle.accelarators;


import java.util.Random;

import org.openqa.selenium.Keys;



public class  ConstantDetails {

	
	// Urls
	
	
	public static final String QUTQA = "https://oemcldev006.service-now.com/login.do";
	
	public static final String QUTUAT = "https://oemcldev009.service-now.com/login.do";
	
    public static final String QUTDEV = "https://oemcldev008.service-now.com/login.do";
    
    public static final String PRODUCTQA = "https://cluat002oem.service-now.com/login.do";
    
    public static final String Prod = "https://murdochcl.service-now.com/";
   
    public static final String DEMO = "https://ven01454.service-now.com/login.do";
    
    
    // User and pass

    public static final String Username = "aakash.kumar";

    public static final String Password = "Reset@12345";
    
    // browser & file path
    
    public static final String ChromeDriverPath = "C:/Users/Aakash Kumar/eclipse-workspace/QUT_core/drivers/";
    
    public static final String FirefoxDriverPath = "/Users/Aakash Kumar/eclipse-workspace/QUT_core/drivers/";
    
    public static final String Path_TestData = "/Users/Aakash Kumar/eclipse-workspace/QUT_core/drivers/";
    
   // public static final String Path_TestData = "https://docs.google.com/spreadsheets/d/1rbuFEnllQ-0qHUkOHFi9NjefpsqxbnpqsURtJiTxLQE/edit#gid=1398110570";
    
    public static final String File_TestData = "Testdata.xlsx";
    
    // Random Num generator 
    
	static Random ran = new Random();
	public static int x = ran.nextInt(600) + 5;
	
	public static String RandomNum = Integer.toString(x);
	
	// Copy and paste 
	
   public static String selectAll = Keys.chord(Keys.CONTROL,Keys.chord("a"));
    
    public static String copy = Keys.chord(Keys.CONTROL,Keys.chord("c"));
	
    public static String paste = Keys.chord(Keys.CONTROL,Keys.chord("v"));
    
    // Item titles 
    
    public static final String NewCourseTitle = "Automated Course ";
    
    public static final String NewMajorTitle = "Automated major ";
    
    public static final String NewUnitTitle = "Masters Of Unit ";
    
    public static final String NewStudyBTitle = "Masters Of Study Area B ";
    
    public static final String NewStudyATitle = "Masters Of Study Area A ";
    
    public static final String NewMinorTitle = "Masters Of Minor ";
    
    public static final String NewInitProposal = "Initial proposal ";
    
    public static final String NewCurrDia = "Curriculum Diagnostic ";
    
	
    public static String CourseTitle = ConstantDetails.NewCourseTitle+RandomNum ;
    
    public static String MajorTitle = ConstantDetails.NewMajorTitle+RandomNum ;
    
    public static String UnitTitle = ConstantDetails.NewUnitTitle+RandomNum ;
    
    public static String StudyBTitle = ConstantDetails.NewStudyBTitle+RandomNum ;
    
    public static String StudyATitle = ConstantDetails.NewStudyATitle+RandomNum ;
    
    public static String MinorTitle = ConstantDetails.NewMinorTitle+RandomNum ;
    
    public static String InitProposalName = ConstantDetails.NewInitProposal+RandomNum ;
    
    public static String CurrDiaTitle = ConstantDetails.NewCurrDia+RandomNum ;
    
    public static String ProposalTitle = ConstantDetails.CourseTitle +"Proposal" ;
    
    public static String ProposalTitleUnit = ConstantDetails.UnitTitle +"Proposal" ;
    
    public static String ProposalTitleMajor = ConstantDetails.StudyBTitle +"Proposal" ;
    
    public static String ProposalTitleCoMajor = ConstantDetails.StudyATitle +"Proposal" ;
    
    public static String ProposalTitleMinor = ConstantDetails.MinorTitle +"Proposal" ;
    
    // template Data 
    
    public static String MultiLineTextData = "The teaching staff of the school are experts in the fields in which they teach and have very high levels of pedagogical knowledge and skill, including expert knowledge of evidence-based teaching strategies. Teachers and school leaders take personal and collective responsibility for improving student learning and wellbeing, working together and learning from each other’s practices. The sharing and showcasing of best practice are common. In team meetings there is an emphasis on the joint analysis of student work and on teaching strategies for improving student learning. Teachers collaboratively plan, deliver and review the effectiveness of lessons. School leaders place a very high priority on the ongoing professional learning of all staff and on the development of a school-wide, self-reflective culture focused on improving classroom teaching. School leaders participate in professional learning activities, learning alongside teachers, and the school supports teachers to continue formal study and celebrates professional success.There is evidence that the principal and other school leaders see the development of staff into an expert and coherent school-wide teaching team as central to improving outcomes for all students. There is a documented professional learning plan and the school has arrangements in place for mentoring and coaching. Teachers visit each other’s classrooms and welcome opportunities to have principals and other school leaders observe and discuss their work with them. Attention is paid to strengths and weaknesses in the school-wide team, with strategies in place to recruit staff with particular expertise, to train staff to address particular needs, and to support staff who find it difficult to commit to the school’s improvement agenda. The school provides opportunities for teachers to take on leadership roles outside the classroom.There is evidence that the principal and other school leaders see the development of staff into an expert and coherent school-wide teaching team as central to improving outcomes for all students. There is a documented professional learning plan and the school has arrangements in place for mentoring and coaching. Teachers visit each other’s classrooms and welcome opportunities to have principals and other school leaders observe and discuss their work with them. Attention is paid to strengths and weaknesses in the school-wide team, with strategies in place to recruit staff with particular expertise, to train staff to address particular needs, and to support staff who find it difficult to commit to the school’s improvement agenda. The school provides opportunities for teachers to take on leadership roles outside the classroom.There is evidence that the principal and other school leaders see the development of staff into an expert and coherent school-wide teaching team as central to improving outcomes for all students. There is a documented professional learning plan and the school has arrangements in place for mentoring and coaching. Teachers visit each other’s classrooms and welcome opportunities to have principals and other school leaders observe and discuss their work with them. Attention is paid to strengths and weaknesses in the school-wide team, with strategies in place to recruit staff with particular expertise, to train staff to address particular needs, and to support staff who find it difficult to commit to the school’s improvement agenda. The school provides opportunities for teachers to take on leadership roles outside the classroomThere is evidence that the principal and other school leaders see the development of staff into an expert and coherent school-wide teaching team as central to improving outcomes for all students. There is a documented professional learning plan and the school has arrangements in place for entorinand coaching. Teachers visit each other’s classrooms and welcome opportunities to have principals and other school leaders observe and discuss their is present which is more than 4000" ;
	
    public static String SavedMultiLineTextData = "The teaching staff of the school are experts in the fields in which they teach and have very high levels of pedagogical knowledge and skill, including expert knowledge of evidence-based teaching strategies. Teachers and school leaders take personal and collective responsibility for improving student learning and wellbeing, working together and learning from each other’s practices. The sharing and showcasing of best practice are common. In team meetings there is an emphasis on the joint analysis of student work and on teaching strategies for improving student learning. Teachers collaboratively plan, deliver and review the effectiveness of lessons. School leaders place a very high priority on the ongoing professional learning of all staff and on the development of a school-wide, self-reflective culture focused on improving classroom teaching. School leaders participate in professional learning activities, learning alongside teachers, and the school supports teachers to continue formal study and celebrates professional success.There is evidence that the principal and other school leaders see the development of staff into an expert and coherent school-wide teaching team as central to improving outcomes for all students. There is a documented professional learning plan and the school has arrangements in place for mentoring and coaching. Teachers visit each other’s classrooms and welcome opportunities to have principals and other school leaders observe and discuss their work with them. Attention is paid to strengths and weaknesses in the school-wide team, with strategies in place to recruit staff with particular expertise, to train staff to address particular needs, and to support staff who find it difficult to commit to the school’s improvement agenda. The school provides opportunities for teachers to take on leadership roles outside the classroom.There is evidence that the principal and other school leaders see the development of staff into an expert and coherent school-wide teaching team as central to improving outcomes for all students. There is a documented professional learning plan and the school has arrangements in place for mentoring and coaching. Teachers visit each other’s classrooms and welcome opportunities to have principals and other school leaders observe and discuss their work with them. Attention is paid to strengths and weaknesses in the school-wide team, with strategies in place to recruit staff with particular expertise, to train staff to address particular needs, and to support staff who find it difficult to commit to the school’s improvement agenda. The school provides opportunities for teachers to take on leadership roles outside the classroom.There is evidence that the principal and other school leaders see the development of staff into an expert and coherent school-wide teaching team as central to improving outcomes for all students. There is a documented professional learning plan and the school has arrangements in place for mentoring and coaching. Teachers visit each other’s classrooms and welcome opportunities to have principals and other school leaders observe and discuss their work with them. Attention is paid to strengths and weaknesses in the school-wide team, with strategies in place to recruit staff with particular expertise, to train staff to address particular needs, and to support staff who find it difficult to commit to the school’s improvement agenda. The school provides opportunities for teachers to take on leadership roles outside the classroomThere is evidence that the principal and other school leaders see the development of staff into an expert and coherent school-wide teaching team as central to improving outcomes for all students. There is a documented professional learning plan and the school has arrangements in place for entorinand coaching. Teachers visit each other’s classrooms and welcome opportunities to have principals and other school leaders observe and discuss their is present" ;
    
    
    
  //  public static String MultiLineTextData = "Test1.Test2/n+Test1{Test2/n+Test1}Test2/n+Test1[Test2/nTest1]Test2/n+Tst1Test2/nTest1.Test2/n+Test1,Test2!t@t#t$t%t^y&u*i(i)o_u+k=k`<h>k?o;u'y|y";
 //   public static String SavedMultiLineTextData = "Test1.Test2/n+Test1{Test2/n+Test1}Test2/n+Test1[Test2/nTest1]Test2/n+Tst1Test2/nTest1.Test2/n+Test1,Test2!t@t#t$t%t^y&u*i(i)o_u+k=k`<h>k?o;u'y|y";
    
    
  //  public static String MultiLineTextDataLess = "Test1.Test2/n+Test1{Test2/n+Test1}Test2/n+Test1[Test2/nTest1]Test2/n+Tst1Test2/nTest1.Test2/n+Test1,Test2!t@t#t$t%t^y&u*i(i)o_u+k=k`<h>k?o;u'y|y";
 //   public static String SavedMultiLineTextDataLess = "Test1.Test2/n+Test1{Test2/n+Test1}Test2/n+Test1[Test2/nTest1]Test2/n+Tst1Test2/nTest1.Test2/n+Test1,Test2!t@t#t$t%t^y&u*i(i)o_u+k=k`<h>k?o;u'y|y";
    
    public static String MultiLineTextDataLess = "The teaching staff of the school are experts in the fields of education. Nobody can beat them,right?" ;
    
    public static String MultiLineTextDataLess2 = "The teaching staff of the school are experts in the fields of education. Nobody can beat them,right? 2nd record" ;
    
    public static String MultiLineTextDataLess3 = "The teaching staff of the school are experts in the fields of education. Nobody can beat them,right? 3rd record" ;
    
    public static String MultiLineTextDataLess4 = "The teaching staff of the school are experts in the fields of education. Nobody can beat them,right? 4th record" ;
    
    public static String MultiLineTextDataLess5 = "The teaching staff of the school are experts in the fields of education. Nobody can beat them,right? 5th record" ;
	
    public static String SavedMultiLineTextDataLess = "The teaching staff of the school are experts in the fields of education. Nobody can beat them,right?" ;
    
    public static String SavedMultiLineTextDataLess2 = "The teaching staff of the school are experts in the fields of education. Nobody can beat them,right? 2nd record" ;
    
    public static String SavedMultiLineTextDataLess3 = "The teaching staff of the school are experts in the fields of education. Nobody can beat them,right? 4th record" ;
    
    public static String SavedMultiLineTextDataLess4 = "The teaching staff of the school are experts in the fields of education. Nobody can beat them,right? 5th record" ;
    
    public static String SavedMultiLineTextDataLess5 = "The teaching staff of the school are experts in the fields of education. Nobody can beat them,right? 3rd record" ;
    
    public static String Number1 ="1";
    
    public static String Number2 ="2";
    
    public static String Number3 =" ";
    
    public static String Number4 ="4";
    
    public static String Number5 ="5";
    
    public static String SavedNumber1 ="CLO1";
    
    public static String SavedNumber2 ="CLO2";
    
    public static String SavedNumber3 ="CLO3";
    
    public static String SavedNumber4 ="CLO4";
    
    public static String SavedNumber5 ="CLO5";
    
    public static String SavedNumberStudyA1 ="SLO1";
    
    public static String SavedNumberStudyA2 ="SLO2";
    
    public static String SavedNumberStudyA3 ="SLO4";
    
    public static String SavedNumberStudyA4 ="SLO5";
    
    public static String SavedNumberStudyA5 ="SLO6";
    
    public static String SavedNumberStudyB1 ="SBLO1";
    
    public static String SavedNumberStudyB2 ="SBLO2";
    
    public static String SavedNumberStudyB3 ="SBLO4";
    
    public static String SavedNumberStudyB4 ="SBLO5";
    
    public static String SavedNumberStudyB5 ="SBLO6";
    
    
    public static String IntOnlyText = "QWERTYUIOPLKJHgfdsazxcvbnm10.1/;'<>?:[] {}|=-)(*&^%$$#@!~";
    
    
    public static String SavedIntOnlyText = "101";
    
    public static String DecText = "QWERTYUIOPLKJHgfdsazxcvbnm10.1/;'<>?:[] {}|=-)(*&^%$$#@!~";
    
    
    public static String SavedDecText = "10.1";	
    		
    // Most used Data
    
    public static String OwningFaulty = "Faculty of Education" ;
    
    public static String OwningDisc = "Information Technology" ;
   
    
   // public static String CollaboratingDisc ="Admin, Agricultural Sciences, Arts, Centre for University Teaching and Learning, Chemical and Metallurgical Engineering and Chemistry, Chiropractic, College of Veterinary Medicine, Counselling, Creative Arts, Education, Electrical Engineering, Energy and Physics, Engineering and Information Technology, Environmental and Conservation Sciences, Exercise Science, Governance, Health Professions, Humanities, Information Technology, Institute for Immunology and Infectious Diseases, Kulbardi Aboriginal Centre, Law, Management, Management and Governance, Mathematics and Statistics, Medical and Molecular Sciences, Murdoch Institute of Technology, Nursing, Office of the Deputy Vice Chancellor Education, Psychology, Psychology and Exercise Science, Sir Walter Murdoch School (Public Policy and International Affairs), Society and Communication, University - Shared Responsibility, Veterinary and Life Sciences";
   
     
 
    public static String AdminContactName = "aakash kumar" ;
    
    public static String AdminContactEmail = "thisisatesttoseehowlongemailwillintheformattingoftheform@factor5.com.au" ;

    public static String InitItemType = "Course" ;
    
    public static String InitApprovalLevel = "AC" ;
    
    public static String InitApprovalLevelACAC = "ACAC" ;
    
    public static String InitApprovalLevelSG = "School Governance" ;
    
    // Admin view button labels 
 
    public static String MarkAsCompleteBtn = "Mark as Complete" ;
    
    public static String SaveBtn = "Save" ;
    
    public static String MeetingBtn = "Allocate to Meeting" ;
    
    public static String ReleaseImpBtn = "Release to Implementation" ;
    
    public static String SubmitACBtn = "Submit to AC" ;
    
    public static String ArchiveBtn = "Archive" ;
    
    public static String SupportBtn = "Support" ;
    
    
    public static String SubmitCAGBtn = "Submit to CAG" ;
    
    
    public static String UnSubmitBtn = "Unsubmit" ;
    
    public static String SubmitACACBtn = "Submit to ACAC" ;
    
    public static String MakeApprovedBtn = "Make Approved" ;
    
    public static String CompleteBtn = "Complete" ;
    
    public static String InitCompleteBtn = "Complete(for Initial proposal)" ;
    
    public static String ApproveBtn = "Approve" ;
    
    public static String ReturnSchoolBtn = "Return to School" ;
    
    public static String DeleteBtn = "Delete" ;
    
    
    
    
    // Stages in admin view workflows
    
    public static String SchoolStage = "School" ;

    public static String CAGStage = "CAG" ;

    public static String ACACStage = "ACAC" ;

    public static String ACStage = "AC" ;
    
    public static String ImpStage = "Implementation" ;
    
    public static String CompleteStage = "Complete" ;
    
    
    public static String CAGFeedback = "CAG Feedback Added" ;
    
    
    // Proposal Status
    
    public static String Status1 = "PROPOSED" ;
    
    // Meetings portal 
    
    public static String MeetingPortal1 = "INITIATE PORTAL" ; 
    
    public static String MeetingPortal2 = "PEX PORTAL" ; 
    
    public static String MeetingPortal3 = "QUT EX PORTAL" ; 
    
    public static String MeetingPortal4 = "FACULTY PORTAL" ; 
    
    public static String MeetingPortal4a = "FACULTY OF EDUCATION PORTAL" ;
    
    public static String MeetingPortal4b = "FACULTY OF HEALTH PORTAL" ;
    
    public static String MeetingPortal4c = "FACULTY OF LAW PORTAL" ;
    
    public static String MeetingPortal4d = "QUT BUSINESS SCHOOL PORTAL" ;
    
    public static String MeetingPortal4e = "CREATIVE INDUSTRIES FACULTY PORTAL" ;
    
    public static String MeetingPortal4f = "SCIENCE AND ENGINEERING FACULTY PORTAL" ;
    
    public static String MeetingPortal4g = "QUT INTERNATIONAL COLLEGE PORTAL" ;
    
    public static String MeetingPortal5 = "CSC1 PORTAL" ; 
    
    public static String MeetingPortal6 = "FAB PORTAL" ; 
    
   public static String MeetingPortal6a = "FACULTY OF EDUCATION PORTAL" ;
    
    public static String MeetingPortal6b = "FACULTY OF HEALTH PORTAL" ;
    
    public static String MeetingPortal6c = "FACULTY OF LAW PORTAL" ;
    
    public static String MeetingPortal6d = "QUT BUSINESS SCHOOL PORTAL" ;
    
    public static String MeetingPortal6e = "CREATIVE INDUSTRIES FACULTY PORTAL" ;
    
    public static String MeetingPortal6f = "SCIENCE AND ENGINEERING FACULTY PORTAL" ;
    
    public static String MeetingPortal6g = "QUT INTERNATIONAL COLLEGE PORTAL" ;
    
    
    public static String MeetingPortal7 = "CSC2 PORTAL" ; 
    
    public static String MeetingPortal8 = "UAB PORTAL" ; 
     
 
    
    
    
    

    
    // Iems dropdown 
    
    public static String ItemDropDown0 = "COURSELOOP" ; 
    
    public static String ItemDropDown1 = "CURRICULUM ITEMS" ; 
    
    public static String ItemDropDown2 = "ADMIN VIEW" ; 
    
    public static String ItemDropDown3 = "INITIAL PROPOSALS" ; 
    
    public static String ItemDropDown4 = "GOVERNANCE MEETINGS" ; 
    
    public static String ItemDropDown5 = "CURRICULUM REVIEWS" ; 
    
    public static String ItemDropDown6 = "HELP AND GUIDANCE" ; 
    
    
    // Academic view buttons and labels 
    
    public static String Print = "Print" ; 
    
    public static String Delete = "Delete" ; 
    
    public static String Comments = "Comments" ; 
    
    public static String MarkComplete = "MARK AS COMPLETE" ; 
    
    public static String LogOut = "LOG OUT" ;
    
    
    // Modal data
    
    public static String ImplementationYear = "2019" ;

    public static String ImplementationYearUpdate = "2020" ;
    
    public static String CourseType = "Award course" ; 
    
    // Google sheet URL's 
    
    public static String UOW_Templates = "1t6KPyJiiaTFQk5PTKdjLdT8OP_7zuxP0E0rY-6Zqjks";
    
    public static String UOW_TestData = "1-bB3o5NrT9c4dMc8fYuuI6w62dDxw0zNqze86P9KmRg";
    
    public static String UOW_AQFLevels= "1xUtYB9Gyz2VzxU49C8uW-47ej9l3NNO5eSwpN3jbjU0";
    
    public static String UOW_RegulatoryAuthority= "1-XHbZiNJwO98Y27R6l0UxtAwSVz6vpt2a6gz5HpU28Y";
    
    public static String UOW_WORKFLOW_ALLOCATION_MODALS= "1yzjQx-Ag1-y426APnmIB4Q7yFmc37ji4o17WNqb7kq4";
    
    public static String UOW_ComparabaleAcademicItems= "1wxt4_JnpNbTLmoBZXaGlM6U0iaOEU1L8PfkrDOQl6n4";
   
    public static String UOW_Intake= "1ibEp3qK5tpKseSLW-TOx-zI4mpGldNYgjRoy-jtMYaY";
    
    public static String UOW_Rationale= "1bfEFMBfrUtgFXLvyoKrkHJjUAfMvPS5E_NTO3q_OBV4";
    
    public static String UOW_DeliveryMode= "1jnbttS1VpAIKS5gnJtLKPvdhWn0JODk-jBd5roC6zN8";
    
    public static String UOW_StudentType= "1QXzPCbkGsuTfplMwYLkhca8w2DoRqcoukKtXD9I4izs";
    
    public static String UOW_TypeOfRequirement= "1iYgRMh6IrrTeC34eE9MfjOPwoo2BqsECtrUvP8UiXss";
    
    public static String UOW_Applications = "1eEhiDmnkRB5tGBwpIh8T0Ivf4Zj1ZIqJy8kvVHdWzKA";
    
    public static String UOW_EnglishLanguagetest = "1kcI10AJ6QN8447cJ5k6IOw1cDhu7q5Yu78aGmNp37BI";
    
    public static String UOW_AQFKSA = "1xCUfuK4CMJZXO_xdgZ54LdDyV8Sg2zyYT7_7DJVMWss";
    
    public static String UOW_HounoursGrade = "189jYvUqhPX-cJf_YaTvQtA7HyDtHP_BrCbeTSPGSZNU";
    
    public static String UOW_TransformtaionPractice = "17d6FdCM3U64S2K2o8EBCHUIEOGpBl1x66zcSAJHWI4E";
    
    public static String UOW_ArrangementType = "1J1B0r-2jseSHHwn0r2GbHUYzIcRxDa5MjJ_WpxY_MvA";
    
    public static String UOW_Confirmation = "1pqcSQQkPsJvJip65zrha13sJmEy6kkWQ6tOIVhd2d7E";
    
    public static String UOW_Type = "1dBjHVQHOtpn4obuGKyCPnbZpRbmW74CGwS70dcYun5c";
    
    public static String UOW_SISPApproval = "1_C9k13zpva5TohIHsrpmBT1sWCM5BO2tj6HJt1AuiBo";
    
    public static String UOW_MastersByCourse = "1DcTSg0Jrm2BKb4w7KIEV2Ck36AQzOZvSlw4MnwZ2cTw";
    
    public static String UOW_Faculty = "1Icwtxa6krpPI7ZOYd5hM_Vl_MSc_WlTlj2kvKMnoRcU";
   
    public static String UOW_PrimaryStudyArea = "1SxMvuIgahx5bpExvStT48AOxfJuLYFU-lkhCanDvWKs";
    
    public static String UOW_StudyArea = "1wqlne5x_9ZHnf978LAC0PQw8fAZd3jn43_wTJwgJPvc";
    
    public static String UOW_EntryReqType = "1c3gjdggslggflVNf3OuYyJdtUWOIkmbZAU8lMueQHNU";
    
    
}