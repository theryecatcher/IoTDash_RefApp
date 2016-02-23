
package com.ge.dsp.pm.ext.entity.property;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.attributedef.AttributeDef;
import com.ge.dsp.pm.ext.entity.property.propertyidentifier.PropertyIdentifier;
import com.ge.dsp.pm.ext.entity.propertytype.PropertyType;
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
 * A Property is like a column in a table.  Or a row in an Entity-Attribute-Value table.  
 * An Attribute is like a column 'type' defintion in a table. e.g. varchar2(64), datetime, etc
 * A Property differs from an Attribute by assigning a PropertyType. This gives context to the Property so the system can drive behavior off the PropertyType. 
 * There are 2 use-cases for Property.  One in an Entity-Attribute-Value or Column Family architecture where the Property is a row.  The other in an Entity-Column architecture where the Property is a column.
 * In the first use case, propertyType can be physical or conceptual.  In the 2nd use case, propertyType is conceptual.
 * Property is used with Source.  A Source (think of an entity) can have many Properties.  Each Property has a shape which is described by the Property Attribute.
 * In both use-cases, PropertyType can drive setup behavior when a new Property is created.  For example, setting up child properties based on the property type.  
 * 
 * 
 * <p>Java class for Property complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Property">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/property/propertyidentifier}propertyIdentifier" minOccurs="0"/>
 *         &lt;element name="propertyType" type="{http://dsp.ge.com/pm/ext/entity/propertytype}PropertyType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/attributedef}attributeDef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Property", propOrder = {
    "propertyIdentifier",
    "propertyType",
    "name",
    "value",
    "attributeDef"
})
public class Property
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/property/propertyidentifier")
    protected PropertyIdentifier propertyIdentifier;
    protected PropertyType propertyType;
    protected String name;
    protected String value;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/attributedef")
    protected AttributeDef attributeDef;

    /**
     * Gets the value of the propertyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyIdentifier }
     *     
     */
    public PropertyIdentifier getPropertyIdentifier() {
        return propertyIdentifier;
    }

    /**
     * Sets the value of the propertyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyIdentifier }
     *     
     */
    public void setPropertyIdentifier(PropertyIdentifier value) {
        this.propertyIdentifier = value;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyType }
     *     
     */
    public PropertyType getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType }
     *     
     */
    public void setPropertyType(PropertyType value) {
        this.propertyType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the attributeDef property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeDef }
     *     
     */
    public AttributeDef getAttributeDef() {
        return attributeDef;
    }

    /**
     * Sets the value of the attributeDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeDef }
     *     
     */
    public void setAttributeDef(AttributeDef value) {
        this.attributeDef = value;
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
            PropertyIdentifier thePropertyIdentifier;
            thePropertyIdentifier = this.getPropertyIdentifier();
            strategy.appendField(locator, this, "propertyIdentifier", buffer, thePropertyIdentifier);
        }
        {
            PropertyType thePropertyType;
            thePropertyType = this.getPropertyType();
            strategy.appendField(locator, this, "propertyType", buffer, thePropertyType);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            AttributeDef theAttributeDef;
            theAttributeDef = this.getAttributeDef();
            strategy.appendField(locator, this, "attributeDef", buffer, theAttributeDef);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Property)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Property that = ((Property) object);
        {
            PropertyIdentifier lhsPropertyIdentifier;
            lhsPropertyIdentifier = this.getPropertyIdentifier();
            PropertyIdentifier rhsPropertyIdentifier;
            rhsPropertyIdentifier = that.getPropertyIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "propertyIdentifier", lhsPropertyIdentifier), LocatorUtils.property(thatLocator, "propertyIdentifier", rhsPropertyIdentifier), lhsPropertyIdentifier, rhsPropertyIdentifier)) {
                return false;
            }
        }
        {
            PropertyType lhsPropertyType;
            lhsPropertyType = this.getPropertyType();
            PropertyType rhsPropertyType;
            rhsPropertyType = that.getPropertyType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "propertyType", lhsPropertyType), LocatorUtils.property(thatLocator, "propertyType", rhsPropertyType), lhsPropertyType, rhsPropertyType)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsValue;
            lhsValue = this.getValue();
            String rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            AttributeDef lhsAttributeDef;
            lhsAttributeDef = this.getAttributeDef();
            AttributeDef rhsAttributeDef;
            rhsAttributeDef = that.getAttributeDef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attributeDef", lhsAttributeDef), LocatorUtils.property(thatLocator, "attributeDef", rhsAttributeDef), lhsAttributeDef, rhsAttributeDef)) {
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
            PropertyIdentifier thePropertyIdentifier;
            thePropertyIdentifier = this.getPropertyIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "propertyIdentifier", thePropertyIdentifier), currentHashCode, thePropertyIdentifier);
        }
        {
            PropertyType thePropertyType;
            thePropertyType = this.getPropertyType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "propertyType", thePropertyType), currentHashCode, thePropertyType);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        {
            AttributeDef theAttributeDef;
            theAttributeDef = this.getAttributeDef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attributeDef", theAttributeDef), currentHashCode, theAttributeDef);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
