package com.lifecycle.DataAccess.Models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({ "result" })
public class SubjectModel {

	@JsonProperty("result")
	private List<Result> result = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("result")
	public List<Result> getResult() {
		return result;
	}

	@JsonProperty("result")
	public void setResult(List<Result> result) {
		this.result = result;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	@JsonPropertyOrder({ "study_level", "code", "description", "unit_category", "asced_broad", "contact_hours",
			"faculty", "sys_id", "school", "published_in_handbook", "name", "flag_for_timetable", "status" })
	public static class Result {

		@JsonProperty("study_level")
		private String studyLevel;
		@JsonProperty("code")
		private String code;
		@JsonProperty("description")
		private String description;
		@JsonProperty("unit_category")
		private String unitCategory;
		@JsonProperty("asced_broad")
		private String ascedBroad;
		@JsonProperty("contact_hours")
		private String contactHours;
		@JsonProperty("faculty")
		private String faculty;
		@JsonProperty("sys_id")
		private String sysId;
		@JsonProperty("school")
		private String school;
		@JsonProperty("published_in_handbook")
		private String publishedInHandbook;
		@JsonProperty("name")
		private String name;
		@JsonProperty("flag_for_timetable")
		private String flagForTimetable;
		@JsonProperty("status")
		private String status;
		@JsonIgnore
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();

		@JsonProperty("study_level")
		public String getStudyLevel() {
			return studyLevel;
		}

		@JsonProperty("study_level")
		public void setStudyLevel(String studyLevel) {
			this.studyLevel = studyLevel;
		}

		@JsonProperty("code")
		public String getCode() {
			return code;
		}

		@JsonProperty("code")
		public void setCode(String code) {
			this.code = code;
		}

		@JsonProperty("description")
		public String getDescription() {
			return description;
		}

		@JsonProperty("description")
		public void setDescription(String description) {
			this.description = description;
		}

		@JsonProperty("unit_category")
		public String getUnitCategory() {
			return unitCategory;
		}

		@JsonProperty("unit_category")
		public void setUnitCategory(String unitCategory) {
			this.unitCategory = unitCategory;
		}

		@JsonProperty("asced_broad")
		public String getAscedBroad() {
			return ascedBroad;
		}

		@JsonProperty("asced_broad")
		public void setAscedBroad(String ascedBroad) {
			this.ascedBroad = ascedBroad;
		}

		@JsonProperty("contact_hours")
		public String getContactHours() {
			return contactHours;
		}

		@JsonProperty("contact_hours")
		public void setContactHours(String contactHours) {
			this.contactHours = contactHours;
		}

		@JsonProperty("faculty")
		public String getFaculty() {
			return faculty;
		}

		@JsonProperty("faculty")
		public void setFaculty(String faculty) {
			this.faculty = faculty;
		}

		@JsonProperty("sys_id")
		public String getSysId() {
			return sysId;
		}

		@JsonProperty("sys_id")
		public void setSysId(String sysId) {
			this.sysId = sysId;
		}

		@JsonProperty("school")
		public String getSchool() {
			return school;
		}

		@JsonProperty("school")
		public void setSchool(String school) {
			this.school = school;
		}

		@JsonProperty("published_in_handbook")
		public String getPublishedInHandbook() {
			return publishedInHandbook;
		}

		@JsonProperty("published_in_handbook")
		public void setPublishedInHandbook(String publishedInHandbook) {
			this.publishedInHandbook = publishedInHandbook;
		}

		@JsonProperty("name")
		public String getName() {
			return name;
		}

		@JsonProperty("name")
		public void setName(String name) {
			this.name = name;
		}

		@JsonProperty("flag_for_timetable")
		public String getFlagForTimetable() {
			return flagForTimetable;
		}

		@JsonProperty("flag_for_timetable")
		public void setFlagForTimetable(String flagForTimetable) {
			this.flagForTimetable = flagForTimetable;
		}

		@JsonProperty("status")
		public String getStatus() {
			return status;
		}

		@JsonProperty("status")
		public void setStatus(String status) {
			this.status = status;
		}

		@JsonAnyGetter
		public Map<String, Object> getAdditionalProperties() {
			return this.additionalProperties;
		}

		@JsonAnySetter
		public void setAdditionalProperty(String name, Object value) {
			this.additionalProperties.put(name, value);
		}

	}
}