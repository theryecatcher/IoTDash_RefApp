
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for AlertRegion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertRegion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertType" type="{http://www.mimosa.org/OSACBMV3.3.1}AlertType"/>
 *         &lt;element name="regionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionRef" type="{http://www.mimosa.org/OSACBMV3.3.1}AlertRegionRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertRegion", propOrder = {
    "alertType",
    "regionName",
    "regionRef"
})
@XmlSeeAlso({
    AlertRegionCBM.class
})
public class AlertRegion
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected AlertType alertType;
    protected String regionName;
    @XmlElement(required = true)
    protected AlertRegionRef regionRef;

    /**
     * Gets the value of the alertType property.
     * 
     * @return
     *     possible object is
     *     {@link AlertType }
     *     
     */
    public AlertType getAlertType() {
        return alertType;
    }

    /**
     * Sets the value of the alertType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertType }
     *     
     */
    public void setAlertType(AlertType value) {
        this.alertType = value;
    }

    /**
     * Gets the value of the regionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Sets the value of the regionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionName(String value) {
        this.regionName = value;
    }

    /**
     * Gets the value of the regionRef property.
     * 
     * @return
     *     possible object is
     *     {@link AlertRegionRef }
     *     
     */
    public AlertRegionRef getRegionRef() {
        return regionRef;
    }

    /**
     * Sets the value of the regionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertRegionRef }
     *     
     */
    public void setRegionRef(AlertRegionRef value) {
        this.regionRef = value;
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
            AlertType theAlertType;
            theAlertType = this.getAlertType();
            strategy.appendField(locator, this, "alertType", buffer, theAlertType);
        }
        {
            String theRegionName;
            theRegionName = this.getRegionName();
            strategy.appendField(locator, this, "regionName", buffer, theRegionName);
        }
        {
            AlertRegionRef theRegionRef;
            theRegionRef = this.getRegionRef();
            strategy.appendField(locator, this, "regionRef", buffer, theRegionRef);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AlertRegion)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AlertRegion that = ((AlertRegion) object);
        {
            AlertType lhsAlertType;
            lhsAlertType = this.getAlertType();
            AlertType rhsAlertType;
            rhsAlertType = that.getAlertType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alertType", lhsAlertType), LocatorUtils.property(thatLocator, "alertType", rhsAlertType), lhsAlertType, rhsAlertType)) {
                return false;
            }
        }
        {
            String lhsRegionName;
            lhsRegionName = this.getRegionName();
            String rhsRegionName;
            rhsRegionName = that.getRegionName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regionName", lhsRegionName), LocatorUtils.property(thatLocator, "regionName", rhsRegionName), lhsRegionName, rhsRegionName)) {
                return false;
            }
        }
        {
            AlertRegionRef lhsRegionRef;
            lhsRegionRef = this.getRegionRef();
            AlertRegionRef rhsRegionRef;
            rhsRegionRef = that.getRegionRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regionRef", lhsRegionRef), LocatorUtils.property(thatLocator, "regionRef", rhsRegionRef), lhsRegionRef, rhsRegionRef)) {
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
            AlertType theAlertType;
            theAlertType = this.getAlertType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alertType", theAlertType), currentHashCode, theAlertType);
        }
        {
            String theRegionName;
            theRegionName = this.getRegionName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "regionName", theRegionName), currentHashCode, theRegionName);
        }
        {
            AlertRegionRef theRegionRef;
            theRegionRef = this.getRegionRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "regionRef", theRegionRef), currentHashCode, theRegionRef);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
