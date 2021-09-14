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
import com.lifecycle.DataAccess.Models.UnitModel;
import com.lifecycle.DataAccess.Models.UnitModel.Result;
import com.lifecycle.enums.Courses;

public class GetUnits {

	public static Result getUnitsByCode(String code) throws IOException {
		return getUnit("code", code);
	}

	private static Result getUnit(String incomingParameter, String incomingValue) throws IOException {
		String table = "x_f5sl_cl_subjects";

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

		UnitModel result = mapper.readValue(reseponse, UnitModel.class);
		Random rnd = new Random();
		return result.getResult().get(rnd.nextInt(result.getResult().size()));
	}

	private static List<String> genericReturnFields() {
		List<String> fieldsToReturn = new ArrayList<>();
		fieldsToReturn.add("code");
		fieldsToReturn.add("study_level");
		fieldsToReturn.add("name");
		fieldsToReturn.add("description");
		fieldsToReturn.add("parent_academic_org");
		fieldsToReturn.add("academic_org");

		return fieldsToReturn;
	}

}
