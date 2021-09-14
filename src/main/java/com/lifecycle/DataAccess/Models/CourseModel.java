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
public class CourseModel {

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
	@JsonPropertyOrder({ "study_level", "credit_points", "code", "implementation_year", "active",
			"govt_special_course_type", "description", "student_types", "partner_school_list", "uac_code",
			"asced_broad", "type", "version", "faculty", "is_multi_award", "published_in_handbook", "aqf_level",
			"delivery_method", "name", "intake_period", "location", "status" })
	public static class Result {
		@JsonProperty("sys_id")
		private String sysId;
		@JsonProperty("study_level")
		private String studyLevel;
		@JsonProperty("credit_points")
		private String creditPoints;
		@JsonProperty("code")
		private String code;
		@JsonProperty("implementation_year")
		private String implementationYear;
		@JsonProperty("active")
		private String active;
		@JsonProperty("govt_special_course_type")
		private String govtSpecialCourseType;
		@JsonProperty("description")
		private String description;
		@JsonProperty("student_types")
		private String studentTypes;
		@JsonProperty("partner_school_list")
		private String partnerSchoolList;
		@JsonProperty("uac_code")
		private String uacCode;
		@JsonProperty("asced_broad")
		private AscedBroad ascedBroad;
		@JsonProperty("type")
		private String type;
		@JsonProperty("version")
		private String version;
		@JsonProperty("faculty")
		private String faculty;
		@JsonProperty("is_multi_award")
		private String isMultiAward;
		@JsonProperty("published_in_handbook")
		private String publishedInHandbook;
		@JsonProperty("aqf_level")
		private String aqfLevel;
		@JsonProperty("delivery_method")
		private String deliveryMethod;
		@JsonProperty("name")
		private String name;
		@JsonProperty("intake_period")
		private String intakePeriod;
		@JsonProperty("location")
		private Location location;
		@JsonProperty("status")
		private String status;
		@JsonIgnore
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();

		@JsonProperty("sys_id")
		public String getSysId() {
			return sysId;
		}

		@JsonProperty("sys_id")
		public void setSysId(String sysId) {
			this.sysId = sysId;
		}

		@JsonProperty("study_level")
		public String getStudyLevel() {
			return studyLevel;
		}

		@JsonProperty("study_level")
		public void setStudyLevel(String studyLevel) {
			this.studyLevel = studyLevel;
		}

		@JsonProperty("credit_points")
		public String getCreditPoints() {
			return creditPoints;
		}

		@JsonProperty("credit_points")
		public void setCreditPoints(String creditPoints) {
			this.creditPoints = creditPoints;
		}

		@JsonProperty("code")
		public String getCode() {
			return code;
		}

		@JsonProperty("code")
		public void setCode(String code) {
			this.code = code;
		}

		@JsonProperty("implementation_year")
		public String getImplementationYear() {
			return implementationYear;
		}

		@JsonProperty("implementation_year")
		public void setImplementationYear(String implementationYear) {
			this.implementationYear = implementationYear;
		}

		@JsonProperty("active")
		public String getActive() {
			return active;
		}

		@JsonProperty("active")
		public void setActive(String active) {
			this.active = active;
		}

		@JsonProperty("govt_special_course_type")
		public String getGovtSpecialCourseType() {
			return govtSpecialCourseType;
		}

		@JsonProperty("govt_special_course_type")
		public void setGovtSpecialCourseType(String govtSpecialCourseType) {
			this.govtSpecialCourseType = govtSpecialCourseType;
		}

		@JsonProperty("description")
		public String getDescription() {
			return description;
		}

		@JsonProperty("description")
		public void setDescription(String description) {
			this.description = description;
		}

		@JsonProperty("student_types")
		public String getStudentTypes() {
			return studentTypes;
		}

		@JsonProperty("student_types")
		public void setStudentTypes(String studentTypes) {
			this.studentTypes = studentTypes;
		}

		@JsonProperty("partner_school_list")
		public String getPartnerSchoolList() {
			return partnerSchoolList;
		}

		@JsonProperty("partner_school_list")
		public void setPartnerSchoolList(String partnerSchoolList) {
			this.partnerSchoolList = partnerSchoolList;
		}

		@JsonProperty("uac_code")
		public String getUacCode() {
			return uacCode;
		}

		@JsonProperty("uac_code")
		public void setUacCode(String uacCode) {
			this.uacCode = uacCode;
		}

		@JsonProperty("asced_broad")
		public AscedBroad getAscedBroad() {
			return ascedBroad;
		}

		@JsonProperty("asced_broad")
		public void setAscedBroad(AscedBroad ascedBroad) {
			this.ascedBroad = ascedBroad;
		}

		@JsonProperty("type")
		public String getType() {
			return type;
		}

		@JsonProperty("type")
		public void setType(String type) {
			this.type = type;
		}

		@JsonProperty("version")
		public String getVersion() {
			return version;
		}

		@JsonProperty("version")
		public void setVersion(String version) {
			this.version = version;
		}

		@JsonProperty("faculty")
		public String getFaculty() {
			return faculty;
		}

		@JsonProperty("faculty")
		public void setFaculty(String faculty) {
			this.faculty = faculty;
		}

		@JsonProperty("is_multi_award")
		public String getIsMultiAward() {
			return isMultiAward;
		}

		@JsonProperty("is_multi_award")
		public void setIsMultiAward(String isMultiAward) {
			this.isMultiAward = isMultiAward;
		}

		@JsonProperty("published_in_handbook")
		public String getPublishedInHandbook() {
			return publishedInHandbook;
		}

		@JsonProperty("published_in_handbook")
		public void setPublishedInHandbook(String publishedInHandbook) {
			this.publishedInHandbook = publishedInHandbook;
		}

		@JsonProperty("aqf_level")
		public String getAqfLevel() {
			return aqfLevel;
		}

		@JsonProperty("aqf_level")
		public void setAqfLevel(String aqfLevel) {
			this.aqfLevel = aqfLevel;
		}

		@JsonProperty("delivery_method")
		public String getDeliveryMethod() {
			return deliveryMethod;
		}

		@JsonProperty("delivery_method")
		public void setDeliveryMethod(String deliveryMethod) {
			this.deliveryMethod = deliveryMethod;
		}

		@JsonProperty("name")
		public String getName() {
			return name;
		}

		@JsonProperty("name")
		public void setName(String name) {
			this.name = name;
		}

		@JsonProperty("intake_period")
		public String getIntakePeriod() {
			return intakePeriod;
		}

		@JsonProperty("intake_period")
		public void setIntakePeriod(String intakePeriod) {
			this.intakePeriod = intakePeriod;
		}

		@JsonProperty("location")
		public Location getLocation() {
			return location;
		}

		@JsonProperty("location")
		public void setLocation(Location location) {
			this.location = location;
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

		@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
		@JsonPropertyOrder({ "link", "value" })
		public class AscedBroad {

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
			public AscedBroad() {
			}

			/**
			 * 
			 * @param link
			 * @param value
			 */
			public AscedBroad(String link, String value) {
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

			@JsonProperty("value")
			public String getValue() {
				return value;
			}

			@JsonProperty("value")
			public void setValue(String value) {
				this.value = value;
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

		@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
		@JsonPropertyOrder({ "link", "value" })
		public class Location {

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
			public Location() {
			}

			/**
			 * 
			 * @param link
			 * @param value
			 */
			public Location(String link, String value) {
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

			public Location withLink(String link) {
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

			public Location withValue(String value) {
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

			public Location withAdditionalProperty(String name, Object value) {
				this.additionalProperties.put(name, value);
				return this;
			}

		}
	}

}