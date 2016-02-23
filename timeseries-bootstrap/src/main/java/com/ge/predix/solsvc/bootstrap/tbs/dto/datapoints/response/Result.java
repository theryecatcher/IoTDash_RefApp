
package com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "groups",
    "attributes",
    "values"
})
public class Result {

    @JsonProperty("groups")
    private List<Group> groups = new ArrayList<Group>();
    @JsonProperty("attributes")
    private Map<String, List<String>> attributes;
    
    @JsonProperty("attributes")
    public Map<String, List<String>> getAttributes() {
		return attributes;
	}

    @JsonProperty("attributes")
	public void setAttributes(Map<String, List<String>> attributes) {
		this.attributes = attributes;
	}

	@JsonProperty("values")
    private List<List<Object>> values = new ArrayList<List<Object>>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The groups
     */
    @JsonProperty("groups")
    public List<Group> getGroups() {
        return groups;
    }

    /**
     * 
     * @param groups
     *     The groups
     */
    @JsonProperty("groups")
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }


    /**
     * 
     * @return
     *     The values
     */
    @JsonProperty("values")
    public List<List<Object>> getValues() {
        return values;
    }

    /**
     * 
     * @param values
     *     The values
     */
    @JsonProperty("values")
    public void setValues(List<List<Object>> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(groups).append(attributes).append(values).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Result) == false) {
            return false;
        }
        Result rhs = ((Result) other);
        return new EqualsBuilder().append(groups, rhs.groups).append(attributes, rhs.attributes).append(values, rhs.values).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
