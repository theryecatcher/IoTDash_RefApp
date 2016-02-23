//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 02:16:43 AM PST 
//


package com.ge.dsp.pm.ext.entity.osa.selectionfilter;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.field.Field;
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
 * <p>Java class for NameStringOrField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameStringOrField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="nameField" type="{http://dsp.ge.com/pm/ext/entity/field}Field" minOccurs="0"/>
 *         &lt;element name="nameString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameStringOrField", propOrder = {
    "nameField",
    "nameString"
})
public class NameStringOrField
    implements Serializable, Equals, HashCode, ToString
{

    protected Field nameField;
    protected String nameString;

    /**
     * Gets the value of the nameField property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getNameField() {
        return nameField;
    }

    /**
     * Sets the value of the nameField property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setNameField(Field value) {
        this.nameField = value;
    }

    /**
     * Gets the value of the nameString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameString() {
        return nameString;
    }

    /**
     * Sets the value of the nameString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameString(String value) {
        this.nameString = value;
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
            Field theNameField;
            theNameField = this.getNameField();
            strategy.appendField(locator, this, "nameField", buffer, theNameField);
        }
        {
            String theNameString;
            theNameString = this.getNameString();
            strategy.appendField(locator, this, "nameString", buffer, theNameString);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof NameStringOrField)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NameStringOrField that = ((NameStringOrField) object);
        {
            Field lhsNameField;
            lhsNameField = this.getNameField();
            Field rhsNameField;
            rhsNameField = that.getNameField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nameField", lhsNameField), LocatorUtils.property(thatLocator, "nameField", rhsNameField), lhsNameField, rhsNameField)) {
                return false;
            }
        }
        {
            String lhsNameString;
            lhsNameString = this.getNameString();
            String rhsNameString;
            rhsNameString = that.getNameString();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nameString", lhsNameString), LocatorUtils.property(thatLocator, "nameString", rhsNameString), lhsNameString, rhsNameString)) {
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
            Field theNameField;
            theNameField = this.getNameField();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nameField", theNameField), currentHashCode, theNameField);
        }
        {
            String theNameString;
            theNameString = this.getNameString();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nameString", theNameString), currentHashCode, theNameString);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}