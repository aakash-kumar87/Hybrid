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
public class ArraryOfSysId {

	@JsonProperty("result")
	private List<Result> result = null;

	@JsonProperty("result")
	public List<Result> getResult() {
		return result;
	}

	@JsonProperty("result")
	public void setResult(List<Result> result) {
		this.result = result;
	}

	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	@JsonPropertyOrder({ "sys_id" })
	public static class Result {

		@JsonProperty("sys_id")
		private String sysId;
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
