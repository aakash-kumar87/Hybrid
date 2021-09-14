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
public class UnitModel {

	@JsonProperty("result")
	private List<Result> result = new ArrayList<Result>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public UnitModel() {
	}

	/**
	 * 
	 * @param result
	 */
	public UnitModel(List<Result> result) {
		super();
		this.result = result;
	}

	@JsonProperty("result")
	public List<Result> getResult() {
		return result;
	}

	@JsonProperty("result")
	public void setResult(List<Result> result) {
		this.result = result;
	}

	public UnitModel withResult(List<Result> result) {
		this.result = result;
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

	public UnitModel withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	@JsonPropertyOrder({ "study_level", "code", "parent_academic_org", "academic_org", "name", "description",
			"status" })
	public static class Result {

		@JsonProperty("study_level")
		private String studyLevel;
		@JsonProperty("code")
		private String code;
		@JsonProperty("parent_academic_org")
		private ParentAcademicOrg parentAcademicOrg;
		@JsonProperty("academic_org")
		private AcademicOrg academicOrg;
		@JsonProperty("name")
		private String name;
		@JsonProperty("description")
		private String description;
		@JsonProperty("status")
		private String status;
		@JsonIgnore
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();

		/**
		 * No args constructor for use in serialization
		 * 
		 */
		public Result() {
		}

		/**
		 * 
		 * @param studyLevel
		 * @param status
		 * @param description
		 * @param name
		 * @param academicOrg
		 * @param parentAcademicOrg
		 * @param code
		 */
		public Result(String studyLevel, String code, ParentAcademicOrg parentAcademicOrg, AcademicOrg academicOrg,
				String name, String description, String status) {
			super();
			this.studyLevel = studyLevel;
			this.code = code;
			this.parentAcademicOrg = parentAcademicOrg;
			this.academicOrg = academicOrg;
			this.name = name;
			this.description = description;
			this.status = status;
		}

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

		@JsonProperty("parent_academic_org")
		public ParentAcademicOrg getParentAcademicOrg() {
			return parentAcademicOrg;
		}

		@JsonProperty("parent_academic_org")
		public void setParentAcademicOrg(ParentAcademicOrg parentAcademicOrg) {
			this.parentAcademicOrg = parentAcademicOrg;
		}

		public Result withParentAcademicOrg(ParentAcademicOrg parentAcademicOrg) {
			this.parentAcademicOrg = parentAcademicOrg;
			return this;
		}

		@JsonProperty("academic_org")
		public AcademicOrg getAcademicOrg() {
			return academicOrg;
		}

		@JsonProperty("academic_org")
		public void setAcademicOrg(AcademicOrg academicOrg) {
			this.academicOrg = academicOrg;
		}

		public Result withAcademicOrg(AcademicOrg academicOrg) {
			this.academicOrg = academicOrg;
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

		@JsonProperty("description")
		public String getDescription() {
			return description;
		}

		@JsonProperty("description")
		public void setDescription(String description) {
			this.description = description;
		}

		public Result withDescription(String description) {
			this.description = description;
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

		@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
		@JsonPropertyOrder({ "link", "value" })
		public class AcademicOrg {

			@JsonProperty("link")
			private String link;
			@JsonProperty("value")
			private String value;
			@JsonIgnore
			private Map<String, Object> additionalProperties = new HashMap<String, Object>();

			/**
			 * No args constructor for use in serialization
			 * 
			 */
			public AcademicOrg() {
			}

			/**
			 * 
			 * @param link
			 * @param value
			 */
			public AcademicOrg(String link, String value) {
				super();
				this.link = link;
				this.value = value;
			}

			@JsonProperty("link")
			public String getLink() {
				return link;
			}

			@JsonProperty("link")
			public void setLink(String link) {
				this.link = link;
			}

			public AcademicOrg withLink(String link) {
				this.link = link;
				return this;
			}

			@JsonProperty("value")
			public String getValue() {
				return value;
			}

			@JsonProperty("value")
			public void setValue(String value) {
				this.value = value;
			}

			public AcademicOrg withValue(String value) {
				this.value = value;
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

			public AcademicOrg withAdditionalProperty(String name, Object value) {
				this.additionalProperties.put(name, value);
				return this;
			}

		}

		@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
		@JsonPropertyOrder({ "link", "value" })
		public class ParentAcademicOrg {

			@JsonProperty("link")
			private String link;
			@JsonProperty("value")
			private String value;
			@JsonIgnore
			private Map<String, Object> additionalProperties = new HashMap<String, Object>();

			/**
			 * No args constructor for use in serialization
			 * 
			 */
			public ParentAcademicOrg() {
			}

			/**
			 * 
			 * @param link
			 * @param value
			 */
			public ParentAcademicOrg(String link, String value) {
				super();
				this.link = link;
				this.value = value;
			}

			@JsonProperty("link")
			public String getLink() {
				return link;
			}

			@JsonProperty("link")
			public void setLink(String link) {
				this.link = link;
			}

			public ParentAcademicOrg withLink(String link) {
				this.link = link;
				return this;
			}

			@JsonProperty("value")
			public String getValue() {
				return value;
			}

			@JsonProperty("value")
			public void setValue(String value) {
				this.value = value;
			}

			public ParentAcademicOrg withValue(String value) {
				this.value = value;
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

			public ParentAcademicOrg withAdditionalProperty(String name, Object value) {
				this.additionalProperties.put(name, value);
				return this;
			}

		}
	}

}
