//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 02:16:43 AM PST 
//


package com.ge.dsp.pm.ext.entity.vo.unitcode;

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
 * This object contains the unitCode information that is needed by the analytic core runtime
 *                 components for unit conversion. The
 *                 contents lifecycle is documented in the detailed design -> core runtime platform page in the project
 *                 wiki.
 *             
 * 
 * <p>Java class for UnitCodeVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitCodeVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unitCodeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="standardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="typeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="unitLookup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="unitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="convertScaleM" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="convertOffestB" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitCodeVO", propOrder = {
    "unitCodeId",
    "standardType",
    "typeId",
    "unitLookup",
    "unitType",
    "unitId",
    "unitName",
    "unitDescription",
    "convertScaleM",
    "convertOffestB"
})
public class UnitCodeVO
    implements Serializable, Equals, HashCode, ToString
{

    protected int unitCodeId;
    @XmlElement(required = true)
    protected String standardType;
    protected int typeId;
    @XmlElement(required = true)
    protected String unitLookup;
    protected String unitType;
    protected Integer unitId;
    protected String unitName;
    protected String unitDescription;
    protected float convertScaleM;
    protected float convertOffestB;

    /**
     * Gets the value of the unitCodeId property.
     * 
     */
    public int getUnitCodeId() {
        return unitCodeId;
    }

    /**
     * Sets the value of the unitCodeId property.
     * 
     */
    public void setUnitCodeId(int value) {
        this.unitCodeId = value;
    }

    /**
     * Gets the value of the standardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardType() {
        return standardType;
    }

    /**
     * Sets the value of the standardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardType(String value) {
        this.standardType = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     */
    public int getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     */
    public void setTypeId(int value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the unitLookup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitLookup() {
        return unitLookup;
    }

    /**
     * Sets the value of the unitLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitLookup(String value) {
        this.unitLookup = value;
    }

    /**
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitType(String value) {
        this.unitType = value;
    }

    /**
     * Gets the value of the unitId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnitId() {
        return unitId;
    }

    /**
     * Sets the value of the unitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitId(Integer value) {
        this.unitId = value;
    }

    /**
     * Gets the value of the unitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * Sets the value of the unitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitName(String value) {
        this.unitName = value;
    }

    /**
     * Gets the value of the unitDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitDescription() {
        return unitDescription;
    }

    /**
     * Sets the value of the unitDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitDescription(String value) {
        this.unitDescription = value;
    }

    /**
     * Gets the value of the convertScaleM property.
     * 
     */
    public float getConvertScaleM() {
        return convertScaleM;
    }

    /**
     * Sets the value of the convertScaleM property.
     * 
     */
    public void setConvertScaleM(float value) {
        this.convertScaleM = value;
    }

    /**
     * Gets the value of the convertOffestB property.
     * 
     */
    public float getConvertOffestB() {
        return convertOffestB;
    }

    /**
     * Sets the value of the convertOffestB property.
     * 
     */
    public void setConvertOffestB(float value) {
        this.convertOffestB = value;
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
            int theUnitCodeId;
            theUnitCodeId = (true?this.getUnitCodeId(): 0);
            strategy.appendField(locator, this, "unitCodeId", buffer, theUnitCodeId);
        }
        {
            String theStandardType;
            theStandardType = this.getStandardType();
            strategy.appendField(locator, this, "standardType", buffer, theStandardType);
        }
        {
            int theTypeId;
            theTypeId = (true?this.getTypeId(): 0);
            strategy.appendField(locator, this, "typeId", buffer, theTypeId);
        }
        {
            String theUnitLookup;
            theUnitLookup = this.getUnitLookup();
            strategy.appendField(locator, this, "unitLookup", buffer, theUnitLookup);
        }
        {
            String theUnitType;
            theUnitType = this.getUnitType();
            strategy.appendField(locator, this, "unitType", buffer, theUnitType);
        }
        {
            Integer theUnitId;
            theUnitId = this.getUnitId();
            strategy.appendField(locator, this, "unitId", buffer, theUnitId);
        }
        {
            String theUnitName;
            theUnitName = this.getUnitName();
            strategy.appendField(locator, this, "unitName", buffer, theUnitName);
        }
        {
            String theUnitDescription;
            theUnitDescription = this.getUnitDescription();
            strategy.appendField(locator, this, "unitDescription", buffer, theUnitDescription);
        }
        {
            float theConvertScaleM;
            theConvertScaleM = (true?this.getConvertScaleM(): 0.0F);
            strategy.appendField(locator, this, "convertScaleM", buffer, theConvertScaleM);
        }
        {
            float theConvertOffestB;
            theConvertOffestB = (true?this.getConvertOffestB(): 0.0F);
            strategy.appendField(locator, this, "convertOffestB", buffer, theConvertOffestB);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof UnitCodeVO)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UnitCodeVO that = ((UnitCodeVO) object);
        {
            int lhsUnitCodeId;
            lhsUnitCodeId = (true?this.getUnitCodeId(): 0);
            int rhsUnitCodeId;
            rhsUnitCodeId = (true?that.getUnitCodeId(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitCodeId", lhsUnitCodeId), LocatorUtils.property(thatLocator, "unitCodeId", rhsUnitCodeId), lhsUnitCodeId, rhsUnitCodeId)) {
                return false;
            }
        }
        {
            String lhsStandardType;
            lhsStandardType = this.getStandardType();
            String rhsStandardType;
            rhsStandardType = that.getStandardType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "standardType", lhsStandardType), LocatorUtils.property(thatLocator, "standardType", rhsStandardType), lhsStandardType, rhsStandardType)) {
                return false;
            }
        }
        {
            int lhsTypeId;
            lhsTypeId = (true?this.getTypeId(): 0);
            int rhsTypeId;
            rhsTypeId = (true?that.getTypeId(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "typeId", lhsTypeId), LocatorUtils.property(thatLocator, "typeId", rhsTypeId), lhsTypeId, rhsTypeId)) {
                return false;
            }
        }
        {
            String lhsUnitLookup;
            lhsUnitLookup = this.getUnitLookup();
            String rhsUnitLookup;
            rhsUnitLookup = that.getUnitLookup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitLookup", lhsUnitLookup), LocatorUtils.property(thatLocator, "unitLookup", rhsUnitLookup), lhsUnitLookup, rhsUnitLookup)) {
                return false;
            }
        }
        {
            String lhsUnitType;
            lhsUnitType = this.getUnitType();
            String rhsUnitType;
            rhsUnitType = that.getUnitType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitType", lhsUnitType), LocatorUtils.property(thatLocator, "unitType", rhsUnitType), lhsUnitType, rhsUnitType)) {
                return false;
            }
        }
        {
            Integer lhsUnitId;
            lhsUnitId = this.getUnitId();
            Integer rhsUnitId;
            rhsUnitId = that.getUnitId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitId", lhsUnitId), LocatorUtils.property(thatLocator, "unitId", rhsUnitId), lhsUnitId, rhsUnitId)) {
                return false;
            }
        }
        {
            String lhsUnitName;
            lhsUnitName = this.getUnitName();
            String rhsUnitName;
            rhsUnitName = that.getUnitName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitName", lhsUnitName), LocatorUtils.property(thatLocator, "unitName", rhsUnitName), lhsUnitName, rhsUnitName)) {
                return false;
            }
        }
        {
            String lhsUnitDescription;
            lhsUnitDescription = this.getUnitDescription();
            String rhsUnitDescription;
            rhsUnitDescription = that.getUnitDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitDescription", lhsUnitDescription), LocatorUtils.property(thatLocator, "unitDescription", rhsUnitDescription), lhsUnitDescription, rhsUnitDescription)) {
                return false;
            }
        }
        {
            float lhsConvertScaleM;
            lhsConvertScaleM = (true?this.getConvertScaleM(): 0.0F);
            float rhsConvertScaleM;
            rhsConvertScaleM = (true?that.getConvertScaleM(): 0.0F);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "convertScaleM", lhsConvertScaleM), LocatorUtils.property(thatLocator, "convertScaleM", rhsConvertScaleM), lhsConvertScaleM, rhsConvertScaleM)) {
                return false;
            }
        }
        {
            float lhsConvertOffestB;
            lhsConvertOffestB = (true?this.getConvertOffestB(): 0.0F);
            float rhsConvertOffestB;
            rhsConvertOffestB = (true?that.getConvertOffestB(): 0.0F);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "convertOffestB", lhsConvertOffestB), LocatorUtils.property(thatLocator, "convertOffestB", rhsConvertOffestB), lhsConvertOffestB, rhsConvertOffestB)) {
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
            int theUnitCodeId;
            theUnitCodeId = (true?this.getUnitCodeId(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitCodeId", theUnitCodeId), currentHashCode, theUnitCodeId);
        }
        {
            String theStandardType;
            theStandardType = this.getStandardType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "standardType", theStandardType), currentHashCode, theStandardType);
        }
        {
            int theTypeId;
            theTypeId = (true?this.getTypeId(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "typeId", theTypeId), currentHashCode, theTypeId);
        }
        {
            String theUnitLookup;
            theUnitLookup = this.getUnitLookup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitLookup", theUnitLookup), currentHashCode, theUnitLookup);
        }
        {
            String theUnitType;
            theUnitType = this.getUnitType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitType", theUnitType), currentHashCode, theUnitType);
        }
        {
            Integer theUnitId;
            theUnitId = this.getUnitId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitId", theUnitId), currentHashCode, theUnitId);
        }
        {
            String theUnitName;
            theUnitName = this.getUnitName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitName", theUnitName), currentHashCode, theUnitName);
        }
        {
            String theUnitDescription;
            theUnitDescription = this.getUnitDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitDescription", theUnitDescription), currentHashCode, theUnitDescription);
        }
        {
            float theConvertScaleM;
            theConvertScaleM = (true?this.getConvertScaleM(): 0.0F);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "convertScaleM", theConvertScaleM), currentHashCode, theConvertScaleM);
        }
        {
            float theConvertOffestB;
            theConvertOffestB = (true?this.getConvertOffestB(): 0.0F);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "convertOffestB", theConvertOffestB), currentHashCode, theConvertOffestB);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
