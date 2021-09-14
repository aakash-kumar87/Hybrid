package com.lifecycle.DataAccess;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.List;
import java.util.Map;

public class Utils {
	/***
	 * Creates a string of all variables to update
	 * 
	 * @param params Map of Key(field to update) and values(new Value)
	 * @return formatted string
	 */
	public static String createPutBody(Map<String, String> params) {
		StringBuilder result = new StringBuilder();
		result.append("{");
		for (Map.Entry<String, String> entry : params.entrySet()) {
			if (!entry.getKey().equals("sys_id")) {
				result.append("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"");
				result.append(",");
			}
		}

		String resultString = result.toString();
		return resultString.length() > 0 ? resultString.substring(0, resultString.length() - 1) + "}"
				: resultString + "}";
	}

	/**
	 * 
	 * @param params
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String getParamsString(Map<String, String> params) {
		StringBuilder result = new StringBuilder();

		for (Map.Entry<String, String> entry : params.entrySet()) {
			result.append(entry.getKey());
			result.append("=");
			result.append(entry.getValue());
			result.append("&");
		}

		String resultString = result.toString();
		return resultString.length() > 0 ? resultString.substring(0, resultString.length() - 1) : resultString;
	}

	/**
	 * Retrieves the credentials from the app.properties file and encodes them
	 * 
	 * @return String of encoded characters
	 */
	public static String authentication() {
		String userpassword = "raghumanthena" + ":" + "password1234";
		return Base64.getEncoder().encodeToString(userpassword.getBytes());
	}

	public static String sysparamCreator(List<String> params) {
		StringBuilder result = new StringBuilder();

		for (String entry : params) {
			result.append(entry);
			result.append("%2C");

		}

		String resultString = result.toString();
		return resultString.length() > 0 ? resultString.substring(0, resultString.length() - 3) : resultString;
	}
}
