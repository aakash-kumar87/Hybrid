package com.lifecycle.DataAccess.test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.lifecycle.DataAccess.CoreAccess;

public class Connection {

	@Test
	public void whenGetRequest_thenOk() throws Exception {
		Map<String, String> parameters = new HashMap<>();
		// parameters.put("param1", "val");

		String response = CoreAccess.performGetRequest("test", "x_f5sl_cl_courses", parameters);

		assertNotNull(response);
		assertFalse(response.equals("401"));

	}

	@Test(groups = { "negative" })
	public void malformedRequest() throws Exception {
		Map<String, String> parameters = new HashMap<>();
		parameters.put("param1", "val");

		String response = CoreAccess.performGetRequest("test", "x_f5sl_cl_courses", parameters);

		assertNotNull(response);
		assertTrue(response.equals("400"));
	}
}
