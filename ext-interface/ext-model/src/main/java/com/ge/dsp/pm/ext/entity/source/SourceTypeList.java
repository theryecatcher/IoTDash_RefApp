//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.07 at 07:40:43 PM IST 
//


package com.ge.dsp.pm.ext.entity.source;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for SourceTypeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceTypeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/source}sourceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceTypeList", propOrder = {
    "sourceType"
})
public class SourceTypeList
    implements Serializable, Equals, HashCode, ToString
{

    protected List<SourceType> sourceType;

    /**
     * Gets the value of the sourceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceType }
     * 
     * 
     */
    public List<SourceType> getSourceType() {
        if (sourceType == null) {
            sourceType = new ArrayList<SourceType>();
        }
        return this.sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param sourceType
     *     allowed object is
     *     {@link SourceType }
     *     
     */
    public void setSourceType(List<SourceType> sourceType) {
        this.sourceType = sourceType;
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
            List<SourceType> theSourceType;
            theSourceType = (((this.sourceType!= null)&&(!this.sourceType.isEmpty()))?this.getSourceType():null);
            strategy.appendField(locator, this, "sourceType", buffer, theSourceType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SourceTypeList)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SourceTypeList that = ((SourceTypeList) object);
        {
            List<SourceType> lhsSourceType;
            lhsSourceType = (((this.sourceType!= null)&&(!this.sourceType.isEmpty()))?this.getSourceType():null);
            List<SourceType> rhsSourceType;
            rhsSourceType = (((that.sourceType!= null)&&(!that.sourceType.isEmpty()))?that.getSourceType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceType", lhsSourceType), LocatorUtils.property(thatLocator, "sourceType", rhsSourceType), lhsSourceType, rhsSourceType)) {
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
            List<SourceType> theSourceType;
            theSourceType = (((this.sourceType!= null)&&(!this.sourceType.isEmpty()))?this.getSourceType():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceType", theSourceType), currentHashCode, theSourceType);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
