
package com.ge.dsp.pm.ext.entity.field;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.attributedef.AttributeDef;
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
 * <p>Java class for Field complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Field">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/field/fieldidentifier}fieldIdentifier"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/field}fieldType" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/field}parents" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Field", propOrder = {
    "fieldIdentifier",
    "fieldType",
    "parents",
    "attributeDef"
})
public class Field
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/field/fieldidentifier", required = true)
    protected FieldIdentifier fieldIdentifier;
    protected FieldType fieldType;
    protected List<Field> parents;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/attributedef")
    protected AttributeDef attributeDef;

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
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link FieldType }
     *     
     */
    public FieldType getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldType }
     *     
     */
    public void setFieldType(FieldType value) {
        this.fieldType = value;
    }

    /**
     * Gets the value of the parents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Field }
     * 
     * 
     */
    public List<Field> getParents() {
        if (parents == null) {
            parents = new ArrayList<Field>();
        }
        return this.parents;
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
            FieldIdentifier theFieldIdentifier;
            theFieldIdentifier = this.getFieldIdentifier();
            strategy.appendField(locator, this, "fieldIdentifier", buffer, theFieldIdentifier);
        }
        {
            FieldType theFieldType;
            theFieldType = this.getFieldType();
            strategy.appendField(locator, this, "fieldType", buffer, theFieldType);
        }
        {
            List<Field> theParents;
            theParents = (((this.parents!= null)&&(!this.parents.isEmpty()))?this.getParents():null);
            strategy.appendField(locator, this, "parents", buffer, theParents);
        }
        {
            AttributeDef theAttributeDef;
            theAttributeDef = this.getAttributeDef();
            strategy.appendField(locator, this, "attributeDef", buffer, theAttributeDef);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Field)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Field that = ((Field) object);
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
            FieldType lhsFieldType;
            lhsFieldType = this.getFieldType();
            FieldType rhsFieldType;
            rhsFieldType = that.getFieldType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldType", lhsFieldType), LocatorUtils.property(thatLocator, "fieldType", rhsFieldType), lhsFieldType, rhsFieldType)) {
                return false;
            }
        }
        {
            List<Field> lhsParents;
            lhsParents = (((this.parents!= null)&&(!this.parents.isEmpty()))?this.getParents():null);
            List<Field> rhsParents;
            rhsParents = (((that.parents!= null)&&(!that.parents.isEmpty()))?that.getParents():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parents", lhsParents), LocatorUtils.property(thatLocator, "parents", rhsParents), lhsParents, rhsParents)) {
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
            FieldIdentifier theFieldIdentifier;
            theFieldIdentifier = this.getFieldIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldIdentifier", theFieldIdentifier), currentHashCode, theFieldIdentifier);
        }
        {
            FieldType theFieldType;
            theFieldType = this.getFieldType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldType", theFieldType), currentHashCode, theFieldType);
        }
        {
            List<Field> theParents;
            theParents = (((this.parents!= null)&&(!this.parents.isEmpty()))?this.getParents():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parents", theParents), currentHashCode, theParents);
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
