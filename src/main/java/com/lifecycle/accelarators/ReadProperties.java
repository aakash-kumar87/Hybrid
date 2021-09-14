package com.lifecycle.accelarators;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.Properties;

public class ReadProperties {

	public Properties readProperties() {
		Properties prop = new Properties();
		try {
			File f = new File(System.getProperty("user.dir") + "/app.properties");
			FileInputStream fi = new FileInputStream(f);
			prop.load(fi);
			fi.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}

	public static Map<String, String> readTestData(String suidatafilepath, String suidataSheetname,
			String testcasename) {
		// TODO Auto-generated method stub
		return null;
	}

	/*	*//*******************************************************************************
			 * Function Name : readTestData Description : read the test data from the given
			 * sheet & row in a file and store in a hash map Parameters : sFilePath,
			 * sSheetName, sTestCaseName Usage : bStatus = readTestData(sFilePath,
			 * sSheetName, sTestCaseName) Created By : Aakash Kumar Created On :
			 ********************************************************************************/
	/*
	 * public static Map<String, String> readTestData(String sFilePath, String
	 * sSheetName, String sTestCaseName) throws IOException { String sKey = null;
	 * String sValue = null; HashMap<String, String> objMap = new HashMap<>(); try {
	 * Workbook objWorkbook = Workbook.getWorkbook(new File(sFilePath)); Sheet
	 * objSheet = objWorkbook.getSheet(sSheetName); int iRowCount =
	 * objSheet.getRows(); int iColCount = objSheet.getColumns(); for (int
	 * iRowCounter = 1; iRowCounter < iRowCount; iRowCounter++) { String
	 * sCurTestCaseName = objSheet.getCell(0, iRowCounter).getContents(); if
	 * ((sCurTestCaseName.equalsIgnoreCase(sTestCaseName))) { for (int iColCounter =
	 * 1; iColCounter < iColCount; iColCounter++) { sKey =
	 * objSheet.getCell(iColCounter, 0).getContents(); System.out.println(sKey);
	 * sValue = objSheet.getCell(iColCounter, iRowCounter).getContents();
	 * System.out.println(sValue); sValue = getDate(sValue); sValue =
	 * getTestDataUniqueValue(sValue);
	 * 
	 * if ((!sValue.equalsIgnoreCase("Null")) && (sValue.trim().length() != 0)) {
	 * objMap.put(sKey, sValue); } } break; } } } catch (BiffException e) {
	 * Messages.errorMsg = "Exception occured.." + e.getMessage(); } return objMap;
	 * }
	 * 
	 *//*******************************************************************************
		 * Function Name : getDate Description : Format the given input to date format
		 * and return that value Parameters : sValue Usage : bStatus =
		 * readTestData(sValue) Created By : Aakash Kumar Created On :
		 ******************************************************************************/
	/*
	 * private static String getDate(String sValue) {
	 * 
	 * Calendar cal = Calendar.getInstance(); SimpleDateFormat sdf = new
	 * SimpleDateFormat("dd/MM/yyyy"); String dt = sValue;
	 * 
	 * if (sValue.trim().equalsIgnoreCase("Today")) { dt =
	 * sdf.format(cal.getTime()); }
	 * 
	 * if (sValue.trim().contains("Today_")) { String[] arrValues =
	 * sValue.split("_"); int iDays = Integer.parseInt(arrValues[1]);
	 * cal.add(Calendar.DATE, iDays); // cal. dt = sdf.format(cal.getTime()); } if
	 * (sValue.trim().contains("Today#")) { String[] arrValues = sValue.split("#");
	 * int iDays = Integer.parseInt(arrValues[1]); cal.add(Calendar.DATE, -iDays);
	 * // cal. dt = sdf.format(cal.getTime()); } return dt; }
	 * 
	 *//*******************************************************************************
		 * Function Name : getTestDataUniqueValue Description : Format the given input
		 * to unique value Parameters : sValue Usage : bStatus =
		 * getTestDataUniqueValue(sValue) Created By : Aakash Kumar Created On :
		 ******************************************************************************/
	/*
	 * private static String getTestDataUniqueValue(String sValue) { String sTemp;
	 * sTemp = sValue.toUpperCase(); if (sTemp.contains("UNIQUE")) { sTemp =
	 * getUniqueName(sTemp); sTemp = sTemp.replace("UNIQUE", "");
	 * System.out.println(sTemp); return sTemp; } return sValue; }
	 * 
	 *//**
		 * Appends a time-based value to a given string value. The combined, unique
		 * string is returned.
		 * 
		 * @param sName input string to make unique
		 * @return String
		 *//*
			 * private static String getUniqueName(String sName) { Calendar rightNow =
			 * Calendar.getInstance(); if (sName == "") { return sName; } else { return
			 * sName + rightNow.get(Calendar.YEAR) + rightNow.get(Calendar.MONTH) +
			 * rightNow.get(Calendar.DAY_OF_MONTH) + rightNow.get(Calendar.HOUR) +
			 * rightNow.get(Calendar.MINUTE) + rightNow.get(Calendar.SECOND); } }
			 */

}
