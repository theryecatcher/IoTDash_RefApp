
package org.mimosa.osacbmv3_3;

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
 * <p>Java class for DAValueDataSeq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DAValueDataSeq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}DADataEvent">
 *       &lt;sequence>
 *         &lt;element name="values" type="{http://www.mimosa.org/OSACBMV3.3.1}Value"/>
 *         &lt;element name="xAxisDeltas" type="{http://www.mimosa.org/OSACBMV3.3.1}Value"/>
 *         &lt;element name="xAxisStart" type="{http://www.mimosa.org/OSACBMV3.3.1}Value" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DAValueDataSeq", propOrder = {
    "values",
    "xAxisDeltas",
    "xAxisStart"
})
public class DAValueDataSeq
    extends DADataEvent
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected Value values;
    @XmlElement(required = true)
    protected Value xAxisDeltas;
    protected Value xAxisStart;

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setValues(Value value) {
        this.values = value;
    }

    /**
     * Gets the value of the xAxisDeltas property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getXAxisDeltas() {
        return xAxisDeltas;
    }

    /**
     * Sets the value of the xAxisDeltas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setXAxisDeltas(Value value) {
        this.xAxisDeltas = value;
    }

    /**
     * Gets the value of the xAxisStart property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getXAxisStart() {
        return xAxisStart;
    }

    /**
     * Sets the value of the xAxisStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setXAxisStart(Value value) {
        this.xAxisStart = value;
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
            Value theValues;
            theValues = this.getValues();
            strategy.appendField(locator, this, "values", buffer, theValues);
        }
        {
            Value theXAxisDeltas;
            theXAxisDeltas = this.getXAxisDeltas();
            strategy.appendField(locator, this, "xAxisDeltas", buffer, theXAxisDeltas);
        }
        {
            Value theXAxisStart;
            theXAxisStart = this.getXAxisStart();
            strategy.appendField(locator, this, "xAxisStart", buffer, theXAxisStart);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DAValueDataSeq)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DAValueDataSeq that = ((DAValueDataSeq) object);
        {
            Value lhsValues;
            lhsValues = this.getValues();
            Value rhsValues;
            rhsValues = that.getValues();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "values", lhsValues), LocatorUtils.property(thatLocator, "values", rhsValues), lhsValues, rhsValues)) {
                return false;
            }
        }
        {
            Value lhsXAxisDeltas;
            lhsXAxisDeltas = this.getXAxisDeltas();
            Value rhsXAxisDeltas;
            rhsXAxisDeltas = that.getXAxisDeltas();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xAxisDeltas", lhsXAxisDeltas), LocatorUtils.property(thatLocator, "xAxisDeltas", rhsXAxisDeltas), lhsXAxisDeltas, rhsXAxisDeltas)) {
                return false;
            }
        }
        {
            Value lhsXAxisStart;
            lhsXAxisStart = this.getXAxisStart();
            Value rhsXAxisStart;
            rhsXAxisStart = that.getXAxisStart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xAxisStart", lhsXAxisStart), LocatorUtils.property(thatLocator, "xAxisStart", rhsXAxisStart), lhsXAxisStart, rhsXAxisStart)) {
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
            Value theValues;
            theValues = this.getValues();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "values", theValues), currentHashCode, theValues);
        }
        {
            Value theXAxisDeltas;
            theXAxisDeltas = this.getXAxisDeltas();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xAxisDeltas", theXAxisDeltas), currentHashCode, theXAxisDeltas);
        }
        {
            Value theXAxisStart;
            theXAxisStart = this.getXAxisStart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xAxisStart", theXAxisStart), currentHashCode, theXAxisStart);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
