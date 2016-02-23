//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 02:16:43 AM PST 
//


package com.ge.dsp.pm.ext.entity.fieldvalues;

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
 * <p>Java class for FieldValuesList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldValuesList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/fieldvalues}fieldValues" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldValuesList", propOrder = {
    "fieldValues"
})
public class FieldValuesList
    implements Serializable, Equals, HashCode, ToString
{

    protected List<FieldValues> fieldValues;

    /**
     * Gets the value of the fieldValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldValues }
     * 
     * 
     */
    public List<FieldValues> getFieldValues() {
        if (fieldValues == null) {
            fieldValues = new ArrayList<FieldValues>();
        }
        return this.fieldValues;
    }

    /**
     * Sets the value of the fieldValues property.
     * 
     * @param fieldValues
     *     allowed object is
     *     {@link FieldValues }
     *     
     */
    public void setFieldValues(List<FieldValues> fieldValues) {
        this.fieldValues = fieldValues;
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
            List<FieldValues> theFieldValues;
            theFieldValues = (((this.fieldValues!= null)&&(!this.fieldValues.isEmpty()))?this.getFieldValues():null);
            strategy.appendField(locator, this, "fieldValues", buffer, theFieldValues);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FieldValuesList)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FieldValuesList that = ((FieldValuesList) object);
        {
            List<FieldValues> lhsFieldValues;
            lhsFieldValues = (((this.fieldValues!= null)&&(!this.fieldValues.isEmpty()))?this.getFieldValues():null);
            List<FieldValues> rhsFieldValues;
            rhsFieldValues = (((that.fieldValues!= null)&&(!that.fieldValues.isEmpty()))?that.getFieldValues():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldValues", lhsFieldValues), LocatorUtils.property(thatLocator, "fieldValues", rhsFieldValues), lhsFieldValues, rhsFieldValues)) {
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
            List<FieldValues> theFieldValues;
            theFieldValues = (((this.fieldValues!= null)&&(!this.fieldValues.isEmpty()))?this.getFieldValues():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldValues", theFieldValues), currentHashCode, theFieldValues);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}