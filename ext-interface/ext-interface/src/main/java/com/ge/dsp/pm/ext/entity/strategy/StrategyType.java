
package com.ge.dsp.pm.ext.entity.strategy;

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
 * <p>Java class for StrategyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrategyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strategyTypeEnum" type="{http://dsp.ge.com/pm/ext/entity/strategy}StrategyTypeEnum"/>
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
@XmlType(name = "StrategyType", propOrder = {
    "strategyTypeEnum",
    "otherValue"
})
public class StrategyType
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected StrategyTypeEnum strategyTypeEnum;
    protected String otherValue;

    /**
     * Gets the value of the strategyTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link StrategyTypeEnum }
     *     
     */
    public StrategyTypeEnum getStrategyTypeEnum() {
        return strategyTypeEnum;
    }

    /**
     * Sets the value of the strategyTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategyTypeEnum }
     *     
     */
    public void setStrategyTypeEnum(StrategyTypeEnum value) {
        this.strategyTypeEnum = value;
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
            StrategyTypeEnum theStrategyTypeEnum;
            theStrategyTypeEnum = this.getStrategyTypeEnum();
            strategy.appendField(locator, this, "strategyTypeEnum", buffer, theStrategyTypeEnum);
        }
        {
            String theOtherValue;
            theOtherValue = this.getOtherValue();
            strategy.appendField(locator, this, "otherValue", buffer, theOtherValue);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof StrategyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final StrategyType that = ((StrategyType) object);
        {
            StrategyTypeEnum lhsStrategyTypeEnum;
            lhsStrategyTypeEnum = this.getStrategyTypeEnum();
            StrategyTypeEnum rhsStrategyTypeEnum;
            rhsStrategyTypeEnum = that.getStrategyTypeEnum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strategyTypeEnum", lhsStrategyTypeEnum), LocatorUtils.property(thatLocator, "strategyTypeEnum", rhsStrategyTypeEnum), lhsStrategyTypeEnum, rhsStrategyTypeEnum)) {
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
            StrategyTypeEnum theStrategyTypeEnum;
            theStrategyTypeEnum = this.getStrategyTypeEnum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strategyTypeEnum", theStrategyTypeEnum), currentHashCode, theStrategyTypeEnum);
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
