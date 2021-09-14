package com.lifecycle.DataAccess.HighlyUsedRequests.Get;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import com.lifecycle.DataAccess.CoreAccess;
import com.lifecycle.DataAccess.Utils;
import com.lifecycle.DataAccess.Models.AssociatedItemsModel;
import com.lifecycle.DataAccess.Models.AssociatedItemsModel.Result;

public class GetAcademicItemsAssociations {

	public static List<Result> getAvailableInPrograms(String code) throws IOException, InterruptedException {
		String codeSysId = GetSpecializations.GetSpecializationByCode(code).getSysId();
		return getRelatedAssociation("academic_item", codeSysId, 2);
	}

	public static List<Result> getRelatedDapPrograms(String code) throws IOException, InterruptedException {
		String codeSysId = GetSpecializations.GetSpecializationByCode(code).getSysId();
		return getRelatedAssociation("academic_item", codeSysId, 1);
	}

	public static List<Result> getRelatedDapProgramsCourses(String code) throws IOException, InterruptedException {
		String codeSysId = GetCourses.getCourseByCode(code).getSysId();
		return getRelatedAssociation("academic_item", codeSysId, 1);
	}

	public static List<Result> getRelatedSapProgramsCourses(String code) throws IOException, InterruptedException {
		String codeSysId = GetCourses.getCourseByCode(code).getSysId();
		return getRelatedAssociation("academic_item", codeSysId, 2);
	}

	public static List<Result> getStandAlonePrograms(String code) throws IOException, InterruptedException {
		String codeSysId = GetCourses.getCourseByCode(code).getSysId();
		return getRelatedAssociation("associated_academic_item", codeSysId, 1);
	}

	private static List<Result> getRelatedAssociation(String incomingParameter, String incomingValue,
			int associationValue) throws IOException {
		String table = "x_f5sl_cl_ai_association";

		List<String> fieldsToReturn = genericReturnFields();

		Map<String, String> parameters = new HashMap<>();
		parameters.put("sysparm_fields", Utils.sysparamCreator(fieldsToReturn));
		parameters.put("sysparm_limit", "250");
		parameters.put("association_type", Integer.toString(associationValue));
		parameters.put(incomingParameter, incomingValue);

		String reseponse = CoreAccess.performGetRequest("test", table, parameters);
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		return mapper.readValue(reseponse, AssociatedItemsModel.class).getResult();
	}

	private static List<String> genericReturnFields() {
		List<String> fieldsToReturn = new ArrayList<>();
		fieldsToReturn.add("dependent_type");
		fieldsToReturn.add("linking_id");
		fieldsToReturn.add("sys_mod_count");
		fieldsToReturn.add("academic_item");
		fieldsToReturn.add("sys_id");
		fieldsToReturn.add("associated_academic_item");
		fieldsToReturn.add("association_type");
		return fieldsToReturn;
	}

}
