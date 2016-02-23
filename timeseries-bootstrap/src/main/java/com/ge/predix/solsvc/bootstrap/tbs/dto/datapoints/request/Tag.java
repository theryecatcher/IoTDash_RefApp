
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
    "name",
    "limit",
    "order",
    "aggregations",
    "filters",
    "groups"
})
public class Tag {

    @JsonProperty("name")
    private String name;
    @JsonProperty("limit")
    private Integer limit;
    @JsonProperty("order")
    private String order;
    @JsonProperty("aggregations")
    private List<Aggregation> aggregations = new ArrayList<Aggregation>();
    @JsonProperty("filters")
    private Filters filters;
    @JsonProperty("groups")
    private List<Group> groups = new ArrayList<Group>();

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The limit
     */
    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    /**
     * 
     * @param limit
     *     The limit
     */
    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * 
     * @return
     *     The order
     */
    @JsonProperty("order")
    public String getOrder() {
        return order;
    }

    /**
     * 
     * @param order
     *     The order
     */
    @JsonProperty("order")
    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * 
     * @return
     *     The aggregations
     */
    @JsonProperty("aggregations")
    public List<Aggregation> getAggregations() {
        return aggregations;
    }

    /**
     * 
     * @param aggregations
     *     The aggregations
     */
    @JsonProperty("aggregations")
    public void setAggregations(List<Aggregation> aggregations) {
        this.aggregations = aggregations;
    }

    /**
     * 
     * @return
     *     The filters
     */
    @JsonProperty("filters")
    public Filters getFilters() {
        return filters;
    }

    /**
     * 
     * @param filters
     *     The filters
     */
    @JsonProperty("filters")
    public void setFilters(Filters filters) {
        this.filters = filters;
    }

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }


    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(limit).append(order).append(aggregations).append(filters).append(groups).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tag) == false) {
            return false;
        }
        Tag rhs = ((Tag) other);
        return new EqualsBuilder().append(name, rhs.name).append(limit, rhs.limit).append(order, rhs.order).append(aggregations, rhs.aggregations).append(filters, rhs.filters).append(groups, rhs.groups).isEquals();
    }

}
