package com.lifecycle.DataAccess.Models;

import java.util.ArrayList;
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
public class SpecializationModel {

	@JsonProperty("result")
	private List<Result> result = new ArrayList<Result>();
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
	@JsonPropertyOrder({ "study_level", "sys_id", "code", "name", "html_description", "status", "faculty" })
	public static class Result {

		@JsonProperty("study_level")
		private String studyLevel;
		@JsonProperty("sys_id")
		private String sysId;
		@JsonProperty("code")
		private String code;
		@JsonProperty("name")
		private String name;
		@JsonProperty("html_description")
		private String htmlDescription;
		@JsonProperty("status")
		private String status;
		@JsonProperty("faculty")
		private String faculty;
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

		public Result withStudyLevel(String studyLevel) {
			this.studyLevel = studyLevel;
			return this;
		}

		@JsonProperty("sys_id")
		public String getSysId() {
			return sysId;
		}

		@JsonProperty("sys_id")
		public void setSysId(String sysId) {
			this.sysId = sysId;
		}

		public Result withSysId(String sysId) {
			this.sysId = sysId;
			return this;
		}

		@JsonProperty("code")
		public String getCode() {
			return code;
		}

		@JsonProperty("code")
		public void setCode(String code) {
			this.code = code;
		}

		public Result withCode(String code) {
			this.code = code;
			return this;
		}

		@JsonProperty("name")
		public String getName() {
			return name;
		}

		@JsonProperty("name")
		public void setName(String name) {
			this.name = name;
		}

		public Result withName(String name) {
			this.name = name;
			return this;
		}

		@JsonProperty("html_description")
		public String getHtmlDescription() {
			return htmlDescription;
		}

		@JsonProperty("html_description")
		public void setHtmlDescription(String htmlDescription) {
			this.htmlDescription = htmlDescription;
		}

		public Result withHtmlDescription(String htmlDescription) {
			this.htmlDescription = htmlDescription;
			return this;
		}

		@JsonProperty("status")
		public String getStatus() {
			return status;
		}

		@JsonProperty("status")
		public void setStatus(String status) {
			this.status = status;
		}

		public Result withStatus(String status) {
			this.status = status;
			return this;
		}

		@JsonProperty("faculty")
		public String getFaculty() {
			return faculty;
		}

		@JsonProperty("faculty")
		public void setFaculty(String faculty) {
			this.faculty = faculty;
		}

		public Result withFaculty(String faculty) {
			this.faculty = faculty;
			return this;
		}

		@JsonAnyGetter
		public Map<String, Object> getAdditionalProperties() {
			return this.additionalProperties;
		}

		@JsonAnySetter
		public void setAdditionalProperty(String name, Object value) {
			this.additionalProperties.put(name, value);
		}

		public Result withAdditionalProperty(String name, Object value) {
			this.additionalProperties.put(name, value);
			return this;
		}

	}
}