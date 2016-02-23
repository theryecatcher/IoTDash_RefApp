
package com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request;

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
    "attributes",
    "measurements",
    "qualities"
})
public class Filters {

    @JsonProperty("attributes")
    private List<Attribute> attributes = new ArrayList<Attribute>();
    @JsonProperty("measurements")
    private Measurements measurements;
    @JsonProperty("qualities")
    private Qualities qualities;

    /**
     * 
     * @return
     *     The attributes
     */
    @JsonProperty("attributes")
    public List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * 
     * @param attributes
     *     The attributes
     */
    @JsonProperty("attributes")
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    /**
     * 
     * @return
     *     The measurements
     */
    @JsonProperty("measurements")
    public Measurements getMeasurements() {
        return measurements;
    }

    /**
     * 
     * @param measurements
     *     The measurements
     */
    @JsonProperty("measurements")
    public void setMeasurements(Measurements measurements) {
        this.measurements = measurements;
    }

    /**
     * 
     * @return
     *     The qualities
     */
    @JsonProperty("qualities")
    public Qualities getQualities() {
        return qualities;
    }

    /**
     * 
     * @param qualities
     *     The qualities
     */
    @JsonProperty("qualities")
    public void setQualities(Qualities qualities) {
        this.qualities = qualities;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }


    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(attributes).append(measurements).append(qualities).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Filters) == false) {
            return false;
        }
        Filters rhs = ((Filters) other);
        return new EqualsBuilder().append(attributes, rhs.attributes).append(measurements, rhs.measurements).append(qualities, rhs.qualities).isEquals();
    }

}
