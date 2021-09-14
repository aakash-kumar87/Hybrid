package com.lifecycle.DataAccess.HighlyUsedRequests.Get;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import com.lifecycle.DataAccess.CoreAccess;
import com.lifecycle.DataAccess.Utils;
import com.lifecycle.DataAccess.Models.SpecializationModel;
import com.lifecycle.DataAccess.Models.SpecializationModel.Result;
import com.lifecycle.enums.Courses;

public class GetSpecializations {
	public static Result GetSpecializationByCode(String code) throws IOException {
		return getSpecialization("code", code);
	}

	private static SpecializationModel.Result getSpecialization(String incomingParameter, String incomingValue)
			throws IOException {
		String table = "x_f5sl_cl_areas_of_study";

		List<String> fieldsToReturn = genericReturnFields();

		Map<String, String> parameters = new HashMap<>();
		parameters.put("sysparm_fields", Utils.sysparamCreator(fieldsToReturn));
		parameters.put("sysparm_limit", "250");
		parameters.put(incomingParameter, incomingValue);
		parameters.put("status", Courses.status.Active.toString());
		parameters.put("published_in_handbook", String.valueOf(Courses.published_in_handbook.Yes.getValue()));

		String reseponse = CoreAccess.performGetRequest("test", table, parameters);
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		SpecializationModel result = mapper.readValue(reseponse, SpecializationModel.class);
		Random rnd = new Random();
		return result.getResult().get(rnd.nextInt(result.getResult().size()));
	}

	private static List<String> genericReturnFields() {
		List<String> fieldsToReturn = new ArrayList<>();
		fieldsToReturn.add("study_level");
		fieldsToReturn.add("sys_id");
		fieldsToReturn.add("code");
		fieldsToReturn.add("name");
		fieldsToReturn.add("html_description");
		fieldsToReturn.add("status");
		fieldsToReturn.add("faculty");

		return fieldsToReturn;
	}
}
