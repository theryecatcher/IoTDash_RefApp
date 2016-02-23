
package com.ge.dsp.pm.ext.entity.field;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for SearchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchTypeEnum" type="{http://dsp.ge.com/pm/ext/entity/field}SearchTypeEnum"/>
 *         &lt;element name="otherValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchType", propOrder = {
    "searchTypeEnum",
    "otherValue"
})
public class SearchType
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected SearchTypeEnum searchTypeEnum;
    protected String otherValue;

    /**
     * Gets the value of the searchTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTypeEnum }
     *     
     */
    public SearchTypeEnum getSearchTypeEnum() {
        return searchTypeEnum;
    }

    /**
     * Sets the value of the searchTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTypeEnum }
     *     
     */
    public void setSearchTypeEnum(SearchTypeEnum value) {
        this.searchTypeEnum = value;
    }

    /**
     * Gets the value of the otherValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherValue() {
        return otherValue;
    }

    /**
     * Sets the value of the otherValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherValue(String value) {
        this.otherValue = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            SearchTypeEnum theSearchTypeEnum;
            theSearchTypeEnum = this.getSearchTypeEnum();
            strategy.appendField(locator, this, "searchTypeEnum", buffer, theSearchTypeEnum);
        }
        {
            String theOtherValue;
            theOtherValue = this.getOtherValue();
            strategy.appendField(locator, this, "otherValue", buffer, theOtherValue);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SearchType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SearchType that = ((SearchType) object);
        {
            SearchTypeEnum lhsSearchTypeEnum;
            lhsSearchTypeEnum = this.getSearchTypeEnum();
            SearchTypeEnum rhsSearchTypeEnum;
            rhsSearchTypeEnum = that.getSearchTypeEnum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchTypeEnum", lhsSearchTypeEnum), LocatorUtils.property(thatLocator, "searchTypeEnum", rhsSearchTypeEnum), lhsSearchTypeEnum, rhsSearchTypeEnum)) {
                return false;
            }
        }
        {
            String lhsOtherValue;
            lhsOtherValue = this.getOtherValue();
            String rhsOtherValue;
            rhsOtherValue = that.getOtherValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherValue", lhsOtherValue), LocatorUtils.property(thatLocator, "otherValue", rhsOtherValue), lhsOtherValue, rhsOtherValue)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            SearchTypeEnum theSearchTypeEnum;
            theSearchTypeEnum = this.getSearchTypeEnum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchTypeEnum", theSearchTypeEnum), currentHashCode, theSearchTypeEnum);
        }
        {
            String theOtherValue;
            theOtherValue = this.getOtherValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherValue", theOtherValue), currentHashCode, theOtherValue);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
