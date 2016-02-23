
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
    "start",
    "end",
    "tags"
})
public class DatapointsQuery {

    @JsonProperty("start")
    private Object start;
    @JsonProperty("end")
    private Object end;
    @JsonProperty("tags")
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * 
     * @return
     *     The start
     */
    @JsonProperty("start")
    public Object getStart() {
        return start;
    }

    /**
     * 
     * @param start
     *     The start
     */
    @JsonProperty("start")
    public void setStart(Object start) {
        this.start = start;
    }

    /**
     * 
     * @return
     *     The end
     */
    @JsonProperty("end")
    public Object getEnd() {
        return end;
    }

    /**
     * 
     * @param end
     *     The end
     */
    @JsonProperty("end")
    public void setEnd(Object end) {
        this.end = end;
    }

    /**
     * 
     * @return
     *     The tags
     */
    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }


    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(start).append(end).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DatapointsQuery) == false) {
            return false;
        }
        DatapointsQuery rhs = ((DatapointsQuery) other);
        return new EqualsBuilder().append(start, rhs.start).append(end, rhs.end).append(tags, rhs.tags).isEquals();
    }

}
