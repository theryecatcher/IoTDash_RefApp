
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
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
 * <p>Java class for MimTypeDescriptors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MimTypeDescriptors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="postScalType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="srcDetectType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="windowType" type="{http://www.mimosa.org/OSACBMV3.3.1}WindowType" minOccurs="0"/>
 *         &lt;element name="xAxisMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="xAxisMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MimTypeDescriptors", propOrder = {
    "postScalType",
    "srcDetectType",
    "windowType",
    "xAxisMax",
    "xAxisMin"
})
public class MimTypeDescriptors
    implements Serializable, Equals, HashCode, ToString
{

    protected MIMKey3 postScalType;
    protected MIMKey3 srcDetectType;
    protected WindowType windowType;
    protected Double xAxisMax;
    protected Double xAxisMin;

    /**
     * Gets the value of the postScalType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getPostScalType() {
        return postScalType;
    }

    /**
     * Sets the value of the postScalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setPostScalType(MIMKey3 value) {
        this.postScalType = value;
    }

    /**
     * Gets the value of the srcDetectType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getSrcDetectType() {
        return srcDetectType;
    }

    /**
     * Sets the value of the srcDetectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setSrcDetectType(MIMKey3 value) {
        this.srcDetectType = value;
    }

    /**
     * Gets the value of the windowType property.
     * 
     * @return
     *     possible object is
     *     {@link WindowType }
     *     
     */
    public WindowType getWindowType() {
        return windowType;
    }

    /**
     * Sets the value of the windowType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindowType }
     *     
     */
    public void setWindowType(WindowType value) {
        this.windowType = value;
    }

    /**
     * Gets the value of the xAxisMax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXAxisMax() {
        return xAxisMax;
    }

    /**
     * Sets the value of the xAxisMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXAxisMax(Double value) {
        this.xAxisMax = value;
    }

    /**
     * Gets the value of the xAxisMin property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXAxisMin() {
        return xAxisMin;
    }

    /**
     * Sets the value of the xAxisMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXAxisMin(Double value) {
        this.xAxisMin = value;
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
            MIMKey3 thePostScalType;
            thePostScalType = this.getPostScalType();
            strategy.appendField(locator, this, "postScalType", buffer, thePostScalType);
        }
        {
            MIMKey3 theSrcDetectType;
            theSrcDetectType = this.getSrcDetectType();
            strategy.appendField(locator, this, "srcDetectType", buffer, theSrcDetectType);
        }
        {
            WindowType theWindowType;
            theWindowType = this.getWindowType();
            strategy.appendField(locator, this, "windowType", buffer, theWindowType);
        }
        {
            Double theXAxisMax;
            theXAxisMax = this.getXAxisMax();
            strategy.appendField(locator, this, "xAxisMax", buffer, theXAxisMax);
        }
        {
            Double theXAxisMin;
            theXAxisMin = this.getXAxisMin();
            strategy.appendField(locator, this, "xAxisMin", buffer, theXAxisMin);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MimTypeDescriptors)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MimTypeDescriptors that = ((MimTypeDescriptors) object);
        {
            MIMKey3 lhsPostScalType;
            lhsPostScalType = this.getPostScalType();
            MIMKey3 rhsPostScalType;
            rhsPostScalType = that.getPostScalType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postScalType", lhsPostScalType), LocatorUtils.property(thatLocator, "postScalType", rhsPostScalType), lhsPostScalType, rhsPostScalType)) {
                return false;
            }
        }
        {
            MIMKey3 lhsSrcDetectType;
            lhsSrcDetectType = this.getSrcDetectType();
            MIMKey3 rhsSrcDetectType;
            rhsSrcDetectType = that.getSrcDetectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "srcDetectType", lhsSrcDetectType), LocatorUtils.property(thatLocator, "srcDetectType", rhsSrcDetectType), lhsSrcDetectType, rhsSrcDetectType)) {
                return false;
            }
        }
        {
            WindowType lhsWindowType;
            lhsWindowType = this.getWindowType();
            WindowType rhsWindowType;
            rhsWindowType = that.getWindowType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "windowType", lhsWindowType), LocatorUtils.property(thatLocator, "windowType", rhsWindowType), lhsWindowType, rhsWindowType)) {
                return false;
            }
        }
        {
            Double lhsXAxisMax;
            lhsXAxisMax = this.getXAxisMax();
            Double rhsXAxisMax;
            rhsXAxisMax = that.getXAxisMax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xAxisMax", lhsXAxisMax), LocatorUtils.property(thatLocator, "xAxisMax", rhsXAxisMax), lhsXAxisMax, rhsXAxisMax)) {
                return false;
            }
        }
        {
            Double lhsXAxisMin;
            lhsXAxisMin = this.getXAxisMin();
            Double rhsXAxisMin;
            rhsXAxisMin = that.getXAxisMin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xAxisMin", lhsXAxisMin), LocatorUtils.property(thatLocator, "xAxisMin", rhsXAxisMin), lhsXAxisMin, rhsXAxisMin)) {
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
            MIMKey3 thePostScalType;
            thePostScalType = this.getPostScalType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postScalType", thePostScalType), currentHashCode, thePostScalType);
        }
        {
            MIMKey3 theSrcDetectType;
            theSrcDetectType = this.getSrcDetectType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "srcDetectType", theSrcDetectType), currentHashCode, theSrcDetectType);
        }
        {
            WindowType theWindowType;
            theWindowType = this.getWindowType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "windowType", theWindowType), currentHashCode, theWindowType);
        }
        {
            Double theXAxisMax;
            theXAxisMax = this.getXAxisMax();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xAxisMax", theXAxisMax), currentHashCode, theXAxisMax);
        }
        {
            Double theXAxisMin;
            theXAxisMin = this.getXAxisMin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xAxisMin", theXAxisMin), currentHashCode, theXAxisMin);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
