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
import com.lifecycle.DataAccess.Models.CourseModel;
import com.lifecycle.DataAccess.Models.CourseModel.Result;
import com.lifecycle.enums.Courses;

public class GetCourses {

	public static Result getCourseBySysId(String sysId) throws Exception {
		String table = "x_f5sl_cl_courses";

		List<String> fieldsToReturn = genericReturnFields();

		Map<String, String> parameters = new HashMap<>();
		parameters.put("sysparm_fields", Utils.sysparamCreator(fieldsToReturn));
		parameters.put("sysparm_limit", "1");
		parameters.put("sys_id", sysId);
		parameters.put("status", Courses.status.Active.toString());
		parameters.put("published_in_handbook", String.valueOf(Courses.published_in_handbook.Yes.getValue()));

		String reseponse = CoreAccess.performGetRequest("test", table, parameters);
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		return mapper.readValue(reseponse, CourseModel.class).getResult().get(0);
	}

	public static Result getCourseBySysIdNoPublishedState(String sysId) throws IOException {
		String table = "x_f5sl_cl_courses";

		List<String> fieldsToReturn = genericReturnFields();

		Map<String, String> parameters = new HashMap<>();
		parameters.put("sysparm_fields", Utils.sysparamCreator(fieldsToReturn));
		parameters.put("sysparm_limit", "1");
		parameters.put("sys_id", sysId);

		String reseponse = CoreAccess.performGetRequest("test", table, parameters);
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		return mapper.readValue(reseponse, CourseModel.class).getResult().get(0);
	}

	public static Result getCourseWithIntake(String intakePeriod) throws IOException, InterruptedException {
		return getCourse("intake_period", intakePeriod);
	}

	public static Result getCourseWithDeliveryMethod(String deliveryMethod) throws IOException, InterruptedException {
		return getCourse("delivery_method", deliveryMethod);
	}

	public static Result getCourseWithLocation(String location) throws IOException, InterruptedException {
		return getCourse("location", location);
	}

	public static Result getCourseByCode(String code) throws IOException, InterruptedException {
		return getCourse("code", code);
	}

	private static Result getCourse(String incomingParameter, String incomingValue)
			throws IOException, InterruptedException {
		String table = "x_f5sl_cl_courses";

		List<String> fieldsToReturn = genericReturnFields();

		Map<String, String> parameters = new HashMap<>();
		parameters.put("sysparm_fields", Utils.sysparamCreator(fieldsToReturn));
		parameters.put("sysparm_limit", "250");
		parameters.put(incomingParameter, incomingValue);
		parameters.put("status", Courses.status.Active.toString());
		parameters.put("implementation_year", "2019");
		parameters.put("published_in_handbook", String.valueOf(Courses.published_in_handbook.Yes.getValue()));

		String reseponse = CoreAccess.performGetRequest("test", table, parameters);
		ObjectMapper mapper = new ObjectMapper();
		Thread.sleep(1000);
		mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		Thread.sleep(1000);

		CourseModel result = mapper.readValue(reseponse, CourseModel.class);
		Random rnd = new Random();
		return result.getResult().get(rnd.nextInt(result.getResult().size()));
	}

	private static List<String> genericReturnFields() {
		List<String> fieldsToReturn = new ArrayList<>();
		fieldsToReturn.add("code");
		fieldsToReturn.add("study_level");
		fieldsToReturn.add("name");
		fieldsToReturn.add("type");
		fieldsToReturn.add("status");
		fieldsToReturn.add("faculty");
		fieldsToReturn.add("uac_code");
		fieldsToReturn.add("implementation_year");
		fieldsToReturn.add("is_multi_award");
		fieldsToReturn.add("version");
		fieldsToReturn.add("aqf_level");
		fieldsToReturn.add("credit_points");
		fieldsToReturn.add("active");
		fieldsToReturn.add("sys_id");
		fieldsToReturn.add("govt_special_course_type");
		fieldsToReturn.add("description");
		fieldsToReturn.add("student_types");
		fieldsToReturn.add("partner_school_list");
		fieldsToReturn.add("location");
		fieldsToReturn.add("asced_broad");
		fieldsToReturn.add("published_in_handbook");
		fieldsToReturn.add("delivery_method");
		fieldsToReturn.add("intake_period");
		return fieldsToReturn;
	}
}
