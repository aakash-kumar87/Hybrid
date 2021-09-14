package com.lifecycle.DataAccess.HighlyUsedRequests.Get;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.lifecycle.DataAccess.CoreAccess;
import com.lifecycle.DataAccess.Utils;
import com.lifecycle.DataAccess.Models.ArraryOfSysId;
import com.lifecycle.DataAccess.Models.SubjectModel;
import com.lifecycle.DataAccess.Models.SubjectModel.Result;

public class Subjects {
	@Test
	public static Result getRandomActivePostedSubject() throws IOException, InterruptedException {
		String sysId = getRandomActivePostedSubjectSysId();
		String table = "x_f5sl_cl_subjects";

		List<String> fieldsToReturn = new ArrayList<>();
		fieldsToReturn.add("code");
		fieldsToReturn.add("status");
		fieldsToReturn.add("sys_id");
		fieldsToReturn.add("study_level");
		fieldsToReturn.add("unit_category");
		fieldsToReturn.add("name");
		fieldsToReturn.add("faculty");
		fieldsToReturn.add("school");
		fieldsToReturn.add("contact_hours");
		fieldsToReturn.add("flag_for_timetable");
		fieldsToReturn.add("asced_broad");
		fieldsToReturn.add("published_in_handbook");
		fieldsToReturn.add("description");

		Map<String, String> parameters = new HashMap<>();
		parameters.put("sysparm_fields", Utils.sysparamCreator(fieldsToReturn));
		parameters.put("sys_id", sysId);
		parameters.put("sysparm_limit", "1");
		String reseponse = CoreAccess.performGetRequest("test", table, parameters);
		ObjectMapper mapper = new ObjectMapper();
		Thread.sleep(1000);
		mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		Thread.sleep(1000);
		SubjectModel value = mapper.readValue(reseponse, SubjectModel.class);
		Thread.sleep(100);
		return value.getResult().get(0);
	}

	public static String getRandomActivePostedSubjectSysId() throws IOException {
		String table = "x_f5sl_cl_subjects";
		Map<String, String> parameters = new HashMap<>();
		parameters.put("sysparm_fields", "sys_id");
		parameters.put("status", "Active");
		parameters.put("sysparm_limit", "100");
		String reseponse = CoreAccess.performGetRequest("test", table, parameters);
		ObjectMapper mapper = new ObjectMapper();
		ArraryOfSysId value = mapper.readValue(reseponse, ArraryOfSysId.class);
		Random rnd = new Random();
		return value.getResult().get(rnd.nextInt(value.getResult().size())).getSysId();
	}

}
