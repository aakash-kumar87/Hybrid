package com.lifecycle.DataAccess.HighlyUsedRequests.Put;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.lifecycle.DataAccess.CoreAccess;

public class PatchCourses {
	static String table = "x_f5sl_cl_courses";

	public static void putDeliveryCodeOnCourse(String code, String sysId) throws IOException {
		Map<String, String> parameters = new HashMap<>();
		parameters.put("sys_id", sysId);
		parameters.put("delivery_method", code);

		int reseponse = CoreAccess.performPatchRequest("test", table, parameters);

		assertEquals(reseponse, 200);
	}

	public static void putIntakeCodeOnCourse(String code, String sysId) throws IOException {
		Map<String, String> parameters = new HashMap<>();
		parameters.put("sys_id", sysId);
		parameters.put("intake_period", code);

		int reseponse = CoreAccess.performPatchRequest("test", table, parameters);

		assertEquals(reseponse, 200);
	}

	public static void putLocationCodeOnCourse(String location, String sysId) throws IOException {
		Map<String, String> parameters = new HashMap<>();
		parameters.put("sys_id", sysId);
		parameters.put("location", location);

		int reseponse = CoreAccess.performPatchRequest("test", table, parameters);

		assertEquals(reseponse, 200);
	}
}
