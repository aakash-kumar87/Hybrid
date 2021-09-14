package com.lifecycle.DataAccess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import org.openqa.selenium.NotFoundException;

import com.lifecycle.accelarators.ReadProperties;

public class CoreAccess {
	static ReadProperties rp = new ReadProperties();
	static String username = rp.readProperties().getProperty("username");
	static String password = rp.readProperties().getProperty("password");
	static String serviceNowUrl = rp.readProperties().getProperty("serviceNowUrl");
	private static URL url;

	/**
	 * 
	 * @param environment
	 * @param table
	 * @param parameters
	 * @param count
	 * @return
	 * @throws IOException
	 * @throws Exception
	 */
	public static String performGetRequest(String environment, String table, Map<String, String> parameters)
			throws IOException {

		switch (environment) {
		case "test":
			url = new URL(serviceNowUrl + table.toLowerCase() + "?" + Utils.getParamsString(parameters));
			break;
		case "uat":
			url = new URL("http://example.com");
			break;

		default:
			throw new NotFoundException("Unable to locate Environment");
		}

		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("Accept", "application/json");

		con.setRequestProperty("Authorization", "Basic " + Utils.authentication());
		con.setConnectTimeout(5000);
		con.setReadTimeout(5000);

		con.setDoOutput(true);

		// trigger call
		int status = 0;
		try {
			StringBuilder content;
			status = con.getResponseCode();
			if (status == 200 || status == 201) {
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String inputLine;
				content = new StringBuilder();
				while ((inputLine = in.readLine()) != null) {
					content.append(inputLine);
				}
				in.close();
				return content.toString();

			}

		} catch (IOException e) {
			return e.toString();
		} finally {
			con.disconnect();
		}
		return Integer.toString(status);
	}

	/**
	 * 
	 * @param environment
	 * @param table
	 * @param parameters
	 * @return
	 * @throws IOException
	 * @throws Exception
	 */
	public static int performPatchRequest(String environment, String table, Map<String, String> parameters)
			throws IOException {
		switch (environment) {
		case "test":
			url = new URL(serviceNowUrl + table.toLowerCase() + "/" + parameters.get("sys_id"));
			break;
		case "uat":
			url = new URL("http://example.com");
			break;

		default:
			throw new NotFoundException("Unable to locate Environment");
		}

		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestProperty("X-HTTP-Method-Override", "PATCH");
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("Accept", "application/json");

		con.setRequestProperty("Authorization", "Basic " + Utils.authentication());
		con.setConnectTimeout(5000);
		con.setReadTimeout(5000);
		con.setDoOutput(true);
		OutputStream outStream = con.getOutputStream();
		OutputStreamWriter outStreamWriter = new OutputStreamWriter(outStream, "UTF-8");
		outStreamWriter.write(Utils.createPutBody(parameters));
		outStreamWriter.flush();
		outStreamWriter.close();
		outStream.close();

		return con.getResponseCode();

	}
}
