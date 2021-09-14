
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
public class AssociatedItemsModel {

	@JsonProperty("result")
	private List<Result> result = new ArrayList<Result>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public AssociatedItemsModel() {
	}

	/**
	 * 
	 * @param result
	 */
	public AssociatedItemsModel(List<Result> result) {
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

	public AssociatedItemsModel withResult(List<Result> result) {
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

	public AssociatedItemsModel withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	@JsonPropertyOrder({ "dependent_type", "linking_id", "sys_mod_count", "description", "date_end", "association_type",
			"sys_updated_on", "sys_tags", "pe_remote_id", "date_effective", "sys_class_name", "academic_item", "sys_id",
			"sys_updated_by", "sys_created_on", "associated_academic_item", "sys_created_by", "order", "status" })
	public static class Result {

		@JsonProperty("dependent_type")
		private String dependentType;
		@JsonProperty("linking_id")
		private String linkingId;
		@JsonProperty("sys_mod_count")
		private String sysModCount;
		@JsonProperty("description")
		private String description;
		@JsonProperty("date_end")
		private String dateEnd;
		@JsonProperty("association_type")
		private String associationType;
		@JsonProperty("sys_updated_on")
		private String sysUpdatedOn;
		@JsonProperty("sys_tags")
		private String sysTags;
		@JsonProperty("pe_remote_id")
		private String peRemoteId;
		@JsonProperty("date_effective")
		private String dateEffective;
		@JsonProperty("sys_class_name")
		private String sysClassName;
		@JsonProperty("academic_item")
		private AcademicItem academicItem;
		@JsonProperty("sys_id")
		private String sysId;
		@JsonProperty("sys_updated_by")
		private String sysUpdatedBy;
		@JsonProperty("sys_created_on")
		private String sysCreatedOn;
		@JsonProperty("associated_academic_item")
		private AssociatedAcademicItem associatedAcademicItem;
		@JsonProperty("sys_created_by")
		private String sysCreatedBy;
		@JsonProperty("order")
		private String order;
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
		 * @param associatedAcademicItem
		 * @param sysCreatedOn
		 * @param sysModCount
		 * @param dateEffective
		 * @param status
		 * @param associationType
		 * @param dateEnd
		 * @param sysClassName
		 * @param sysUpdatedOn
		 * @param sysTags
		 * @param sysCreatedBy
		 * @param sysId
		 * @param dependentType
		 * @param order
		 * @param description
		 * @param sysUpdatedBy
		 * @param peRemoteId
		 * @param academicItem
		 * @param linkingId
		 */
		public Result(String dependentType, String linkingId, String sysModCount, String description, String dateEnd,
				String associationType, String sysUpdatedOn, String sysTags, String peRemoteId, String dateEffective,
				String sysClassName, AcademicItem academicItem, String sysId, String sysUpdatedBy, String sysCreatedOn,
				AssociatedAcademicItem associatedAcademicItem, String sysCreatedBy, String order, String status) {
			super();
			this.dependentType = dependentType;
			this.linkingId = linkingId;
			this.sysModCount = sysModCount;
			this.description = description;
			this.dateEnd = dateEnd;
			this.associationType = associationType;
			this.sysUpdatedOn = sysUpdatedOn;
			this.sysTags = sysTags;
			this.peRemoteId = peRemoteId;
			this.dateEffective = dateEffective;
			this.sysClassName = sysClassName;
			this.academicItem = academicItem;
			this.sysId = sysId;
			this.sysUpdatedBy = sysUpdatedBy;
			this.sysCreatedOn = sysCreatedOn;
			this.associatedAcademicItem = associatedAcademicItem;
			this.sysCreatedBy = sysCreatedBy;
			this.order = order;
			this.status = status;
		}

		@JsonProperty("dependent_type")
		public String getDependentType() {
			return dependentType;
		}

		@JsonProperty("dependent_type")
		public void setDependentType(String dependentType) {
			this.dependentType = dependentType;
		}

		public Result withDependentType(String dependentType) {
			this.dependentType = dependentType;
			return this;
		}

		@JsonProperty("linking_id")
		public String getLinkingId() {
			return linkingId;
		}

		@JsonProperty("linking_id")
		public void setLinkingId(String linkingId) {
			this.linkingId = linkingId;
		}

		public Result withLinkingId(String linkingId) {
			this.linkingId = linkingId;
			return this;
		}

		@JsonProperty("sys_mod_count")
		public String getSysModCount() {
			return sysModCount;
		}

		@JsonProperty("sys_mod_count")
		public void setSysModCount(String sysModCount) {
			this.sysModCount = sysModCount;
		}

		public Result withSysModCount(String sysModCount) {
			this.sysModCount = sysModCount;
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

		@JsonProperty("date_end")
		public String getDateEnd() {
			return dateEnd;
		}

		@JsonProperty("date_end")
		public void setDateEnd(String dateEnd) {
			this.dateEnd = dateEnd;
		}

		public Result withDateEnd(String dateEnd) {
			this.dateEnd = dateEnd;
			return this;
		}

		@JsonProperty("association_type")
		public String getAssociationType() {
			return associationType;
		}

		@JsonProperty("association_type")
		public void setAssociationType(String associationType) {
			this.associationType = associationType;
		}

		public Result withAssociationType(String associationType) {
			this.associationType = associationType;
			return this;
		}

		@JsonProperty("sys_updated_on")
		public String getSysUpdatedOn() {
			return sysUpdatedOn;
		}

		@JsonProperty("sys_updated_on")
		public void setSysUpdatedOn(String sysUpdatedOn) {
			this.sysUpdatedOn = sysUpdatedOn;
		}

		public Result withSysUpdatedOn(String sysUpdatedOn) {
			this.sysUpdatedOn = sysUpdatedOn;
			return this;
		}

		@JsonProperty("sys_tags")
		public String getSysTags() {
			return sysTags;
		}

		@JsonProperty("sys_tags")
		public void setSysTags(String sysTags) {
			this.sysTags = sysTags;
		}

		public Result withSysTags(String sysTags) {
			this.sysTags = sysTags;
			return this;
		}

		@JsonProperty("pe_remote_id")
		public String getPeRemoteId() {
			return peRemoteId;
		}

		@JsonProperty("pe_remote_id")
		public void setPeRemoteId(String peRemoteId) {
			this.peRemoteId = peRemoteId;
		}

		public Result withPeRemoteId(String peRemoteId) {
			this.peRemoteId = peRemoteId;
			return this;
		}

		@JsonProperty("date_effective")
		public String getDateEffective() {
			return dateEffective;
		}

		@JsonProperty("date_effective")
		public void setDateEffective(String dateEffective) {
			this.dateEffective = dateEffective;
		}

		public Result withDateEffective(String dateEffective) {
			this.dateEffective = dateEffective;
			return this;
		}

		@JsonProperty("sys_class_name")
		public String getSysClassName() {
			return sysClassName;
		}

		@JsonProperty("sys_class_name")
		public void setSysClassName(String sysClassName) {
			this.sysClassName = sysClassName;
		}

		public Result withSysClassName(String sysClassName) {
			this.sysClassName = sysClassName;
			return this;
		}

		@JsonProperty("academic_item")
		public AcademicItem getAcademicItem() {
			return academicItem;
		}

		@JsonProperty("academic_item")
		public void setAcademicItem(AcademicItem academicItem) {
			this.academicItem = academicItem;
		}

		public Result withAcademicItem(AcademicItem academicItem) {
			this.academicItem = academicItem;
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

		@JsonProperty("sys_updated_by")
		public String getSysUpdatedBy() {
			return sysUpdatedBy;
		}

		@JsonProperty("sys_updated_by")
		public void setSysUpdatedBy(String sysUpdatedBy) {
			this.sysUpdatedBy = sysUpdatedBy;
		}

		public Result withSysUpdatedBy(String sysUpdatedBy) {
			this.sysUpdatedBy = sysUpdatedBy;
			return this;
		}

		@JsonProperty("sys_created_on")
		public String getSysCreatedOn() {
			return sysCreatedOn;
		}

		@JsonProperty("sys_created_on")
		public void setSysCreatedOn(String sysCreatedOn) {
			this.sysCreatedOn = sysCreatedOn;
		}

		public Result withSysCreatedOn(String sysCreatedOn) {
			this.sysCreatedOn = sysCreatedOn;
			return this;
		}

		@JsonProperty("associated_academic_item")
		public AssociatedAcademicItem getAssociatedAcademicItem() {
			return associatedAcademicItem;
		}

		@JsonProperty("associated_academic_item")
		public void setAssociatedAcademicItem(AssociatedAcademicItem associatedAcademicItem) {
			this.associatedAcademicItem = associatedAcademicItem;
		}

		public Result withAssociatedAcademicItem(AssociatedAcademicItem associatedAcademicItem) {
			this.associatedAcademicItem = associatedAcademicItem;
			return this;
		}

		@JsonProperty("sys_created_by")
		public String getSysCreatedBy() {
			return sysCreatedBy;
		}

		@JsonProperty("sys_created_by")
		public void setSysCreatedBy(String sysCreatedBy) {
			this.sysCreatedBy = sysCreatedBy;
		}

		public Result withSysCreatedBy(String sysCreatedBy) {
			this.sysCreatedBy = sysCreatedBy;
			return this;
		}

		@JsonProperty("order")
		public String getOrder() {
			return order;
		}

		@JsonProperty("order")
		public void setOrder(String order) {
			this.order = order;
		}

		public Result withOrder(String order) {
			this.order = order;
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
		public static class AssociatedAcademicItem {

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
			public AssociatedAcademicItem() {
			}

			/**
			 * 
			 * @param link
			 * @param value
			 */
			public AssociatedAcademicItem(String link, String value) {
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

			public AssociatedAcademicItem withLink(String link) {
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

			public AssociatedAcademicItem withValue(String value) {
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

			public AssociatedAcademicItem withAdditionalProperty(String name, Object value) {
				this.additionalProperties.put(name, value);
				return this;
			}

		}

		@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
		@JsonPropertyOrder({ "link", "value" })
		public static class AcademicItem {

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
			public AcademicItem() {
			}

			/**
			 * 
			 * @param link
			 * @param value
			 */
			public AcademicItem(String link, String value) {
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

			public AcademicItem withLink(String link) {
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

			public AcademicItem withValue(String value) {
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

			public AcademicItem withAdditionalProperty(String name, Object value) {
				this.additionalProperties.put(name, value);
				return this;
			}

		}
	}

}