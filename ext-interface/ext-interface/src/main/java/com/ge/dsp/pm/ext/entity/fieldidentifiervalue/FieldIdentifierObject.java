
package com.ge.dsp.pm.ext.entity.fieldidentifiervalue;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.field.fieldidentifier.FieldIdentifier;
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
 * <p>Java class for FieldIdentifierObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldIdentifierObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/field/fieldidentifier}fieldIdentifier"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldIdentifierObject", propOrder = {
    "fieldIdentifier",
    "value"
})
public class FieldIdentifierObject
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/field/fieldidentifier", required = true)
    protected FieldIdentifier fieldIdentifier;
    protected Object value;

    /**
     * Gets the value of the fieldIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link FieldIdentifier }
     *     
     */
    public FieldIdentifier getFieldIdentifier() {
        return fieldIdentifier;
    }

    /**
     * Sets the value of the fieldIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIdentifier }
     *     
     */
    public void setFieldIdentifier(FieldIdentifier value) {
        this.fieldIdentifier = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValue(Object value) {
        this.value = value;
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
            FieldIdentifier theFieldIdentifier;
            theFieldIdentifier = this.getFieldIdentifier();
            strategy.appendField(locator, this, "fieldIdentifier", buffer, theFieldIdentifier);
        }
        {
            Object theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FieldIdentifierObject)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FieldIdentifierObject that = ((FieldIdentifierObject) object);
        {
            FieldIdentifier lhsFieldIdentifier;
            lhsFieldIdentifier = this.getFieldIdentifier();
            FieldIdentifier rhsFieldIdentifier;
            rhsFieldIdentifier = that.getFieldIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldIdentifier", lhsFieldIdentifier), LocatorUtils.property(thatLocator, "fieldIdentifier", rhsFieldIdentifier), lhsFieldIdentifier, rhsFieldIdentifier)) {
                return false;
            }
        }
        {
            Object lhsValue;
            lhsValue = this.getValue();
            Object rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
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
            FieldIdentifier theFieldIdentifier;
            theFieldIdentifier = this.getFieldIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldIdentifier", theFieldIdentifier), currentHashCode, theFieldIdentifier);
        }
        {
            Object theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
