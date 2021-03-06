//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.07 at 07:40:43 PM IST 
//


package com.ge.dsp.pm.ext.entity.model;

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
 * <p>Java class for SampleEngine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SampleEngine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dsp.ge.com/pm/ext/entity/model}Model">
 *       &lt;sequence>
 *         &lt;element name="averageSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampleEngine", propOrder = {
    "averageSpeed"
})
public class SampleEngine
    extends Model
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String averageSpeed;

    /**
     * Gets the value of the averageSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAverageSpeed() {
        return averageSpeed;
    }

    /**
     * Sets the value of the averageSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAverageSpeed(String value) {
        this.averageSpeed = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            String theAverageSpeed;
            theAverageSpeed = this.getAverageSpeed();
            strategy.appendField(locator, this, "averageSpeed", buffer, theAverageSpeed);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SampleEngine)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SampleEngine that = ((SampleEngine) object);
        {
            String lhsAverageSpeed;
            lhsAverageSpeed = this.getAverageSpeed();
            String rhsAverageSpeed;
            rhsAverageSpeed = that.getAverageSpeed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "averageSpeed", lhsAverageSpeed), LocatorUtils.property(thatLocator, "averageSpeed", rhsAverageSpeed), lhsAverageSpeed, rhsAverageSpeed)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theAverageSpeed;
            theAverageSpeed = this.getAverageSpeed();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "averageSpeed", theAverageSpeed), currentHashCode, theAverageSpeed);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
