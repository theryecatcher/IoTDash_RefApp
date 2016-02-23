
package com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.latest.request;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "condition",
    "values"
})
public class Measurements {

    @JsonProperty("condition")
    private String condition;
    @JsonProperty("values")
    private List<Integer> values = new ArrayList<Integer>();

    /**
     * 
     * @return
     *     The condition
     */
    @JsonProperty("condition")
    public String getCondition() {
        return condition;
    }

    /**
     * 
     * @param condition
     *     The condition
     */
    @JsonProperty("condition")
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * 
     * @return
     *     The values
     */
    @JsonProperty("values")
    public List<Integer> getValues() {
        return values;
    }

    /**
     * 
     * @param values
     *     The values
     */
    @JsonProperty("values")
    public void setValues(List<Integer> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(condition).append(values).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Measurements) == false) {
            return false;
        }
        Measurements rhs = ((Measurements) other);
        return new EqualsBuilder().append(condition, rhs.condition).append(values, rhs.values).isEquals();
    }

}
