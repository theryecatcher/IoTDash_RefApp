
package com.ge.dsp.pm.ext.entity.fieldselection;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.engunit.EngUnit;
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
 * 
 * 				this structure is used to identify the field (from the
 * 				asset model) whose value is requested. The selection
 * 				filter specifies to constrain the return value to the
 * 				subset of values within the time seleciton.
 * 			
 * 
 * <p>Java class for FieldSelection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldSelection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/field/fieldidentifier}fieldIdentifier" minOccurs="0"/>
 *         &lt;element name="expectedDataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expectedEU" type="{http://dsp.ge.com/pm/ext/entity/engunit}EngUnit" minOccurs="0"/>
 *         &lt;element name="resultId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldSelection", propOrder = {
    "fieldIdentifier",
    "expectedDataType",
    "expectedEU",
    "resultId"
})
public class FieldSelection
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/field/fieldidentifier")
    protected FieldIdentifier fieldIdentifier;
    protected String expectedDataType;
    protected EngUnit expectedEU;
    protected String resultId;

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
     * Gets the value of the expectedDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedDataType() {
        return expectedDataType;
    }

    /**
     * Sets the value of the expectedDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedDataType(String value) {
        this.expectedDataType = value;
    }

    /**
     * Gets the value of the expectedEU property.
     * 
     * @return
     *     possible object is
     *     {@link EngUnit }
     *     
     */
    public EngUnit getExpectedEU() {
        return expectedEU;
    }

    /**
     * Sets the value of the expectedEU property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngUnit }
     *     
     */
    public void setExpectedEU(EngUnit value) {
        this.expectedEU = value;
    }

    /**
     * Gets the value of the resultId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultId() {
        return resultId;
    }

    /**
     * Sets the value of the resultId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultId(String value) {
        this.resultId = value;
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
            String theExpectedDataType;
            theExpectedDataType = this.getExpectedDataType();
            strategy.appendField(locator, this, "expectedDataType", buffer, theExpectedDataType);
        }
        {
            EngUnit theExpectedEU;
            theExpectedEU = this.getExpectedEU();
            strategy.appendField(locator, this, "expectedEU", buffer, theExpectedEU);
        }
        {
            String theResultId;
            theResultId = this.getResultId();
            strategy.appendField(locator, this, "resultId", buffer, theResultId);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FieldSelection)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FieldSelection that = ((FieldSelection) object);
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
            String lhsExpectedDataType;
            lhsExpectedDataType = this.getExpectedDataType();
            String rhsExpectedDataType;
            rhsExpectedDataType = that.getExpectedDataType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expectedDataType", lhsExpectedDataType), LocatorUtils.property(thatLocator, "expectedDataType", rhsExpectedDataType), lhsExpectedDataType, rhsExpectedDataType)) {
                return false;
            }
        }
        {
            EngUnit lhsExpectedEU;
            lhsExpectedEU = this.getExpectedEU();
            EngUnit rhsExpectedEU;
            rhsExpectedEU = that.getExpectedEU();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expectedEU", lhsExpectedEU), LocatorUtils.property(thatLocator, "expectedEU", rhsExpectedEU), lhsExpectedEU, rhsExpectedEU)) {
                return false;
            }
        }
        {
            String lhsResultId;
            lhsResultId = this.getResultId();
            String rhsResultId;
            rhsResultId = that.getResultId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resultId", lhsResultId), LocatorUtils.property(thatLocator, "resultId", rhsResultId), lhsResultId, rhsResultId)) {
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
            String theExpectedDataType;
            theExpectedDataType = this.getExpectedDataType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expectedDataType", theExpectedDataType), currentHashCode, theExpectedDataType);
        }
        {
            EngUnit theExpectedEU;
            theExpectedEU = this.getExpectedEU();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expectedEU", theExpectedEU), currentHashCode, theExpectedEU);
        }
        {
            String theResultId;
            theResultId = this.getResultId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resultId", theResultId), currentHashCode, theResultId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
