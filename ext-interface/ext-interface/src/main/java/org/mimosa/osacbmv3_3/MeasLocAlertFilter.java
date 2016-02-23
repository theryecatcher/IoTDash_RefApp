
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for MeasLocAlertFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasLocAlertFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}SelectionFilter">
 *       &lt;sequence>
 *         &lt;element name="alertSeverity" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="alertTypeCode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="alertTypeId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="alertTypeSite" type="{http://www.mimosa.org/OSACBMV3.3.1}Site" minOccurs="0"/>
 *         &lt;element name="regionEnum" type="{http://www.mimosa.org/OSACBMV3.3.1}EnumValue" minOccurs="0"/>
 *         &lt;element name="regionRef" type="{http://www.mimosa.org/OSACBMV3.3.1}AlertRegionRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasLocAlertFilter", propOrder = {
    "alertSeverity",
    "alertTypeCode",
    "alertTypeId",
    "alertTypeSite",
    "regionEnum",
    "regionRef"
})
public class MeasLocAlertFilter
    extends SelectionFilter
    implements Serializable, Equals, HashCode, ToString
{

    protected MIMKey3 alertSeverity;
    @XmlSchemaType(name = "unsignedInt")
    protected Long alertTypeCode;
    @XmlSchemaType(name = "unsignedInt")
    protected Long alertTypeId;
    protected Site alertTypeSite;
    protected EnumValue regionEnum;
    protected AlertRegionRef regionRef;

    /**
     * Gets the value of the alertSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getAlertSeverity() {
        return alertSeverity;
    }

    /**
     * Sets the value of the alertSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setAlertSeverity(MIMKey3 value) {
        this.alertSeverity = value;
    }

    /**
     * Gets the value of the alertTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAlertTypeCode() {
        return alertTypeCode;
    }

    /**
     * Sets the value of the alertTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAlertTypeCode(Long value) {
        this.alertTypeCode = value;
    }

    /**
     * Gets the value of the alertTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAlertTypeId() {
        return alertTypeId;
    }

    /**
     * Sets the value of the alertTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAlertTypeId(Long value) {
        this.alertTypeId = value;
    }

    /**
     * Gets the value of the alertTypeSite property.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getAlertTypeSite() {
        return alertTypeSite;
    }

    /**
     * Sets the value of the alertTypeSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setAlertTypeSite(Site value) {
        this.alertTypeSite = value;
    }

    /**
     * Gets the value of the regionEnum property.
     * 
     * @return
     *     possible object is
     *     {@link EnumValue }
     *     
     */
    public EnumValue getRegionEnum() {
        return regionEnum;
    }

    /**
     * Sets the value of the regionEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumValue }
     *     
     */
    public void setRegionEnum(EnumValue value) {
        this.regionEnum = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            MIMKey3 theAlertSeverity;
            theAlertSeverity = this.getAlertSeverity();
            strategy.appendField(locator, this, "alertSeverity", buffer, theAlertSeverity);
        }
        {
            Long theAlertTypeCode;
            theAlertTypeCode = this.getAlertTypeCode();
            strategy.appendField(locator, this, "alertTypeCode", buffer, theAlertTypeCode);
        }
        {
            Long theAlertTypeId;
            theAlertTypeId = this.getAlertTypeId();
            strategy.appendField(locator, this, "alertTypeId", buffer, theAlertTypeId);
        }
        {
            Site theAlertTypeSite;
            theAlertTypeSite = this.getAlertTypeSite();
            strategy.appendField(locator, this, "alertTypeSite", buffer, theAlertTypeSite);
        }
        {
            EnumValue theRegionEnum;
            theRegionEnum = this.getRegionEnum();
            strategy.appendField(locator, this, "regionEnum", buffer, theRegionEnum);
        }
        {
            AlertRegionRef theRegionRef;
            theRegionRef = this.getRegionRef();
            strategy.appendField(locator, this, "regionRef", buffer, theRegionRef);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MeasLocAlertFilter)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MeasLocAlertFilter that = ((MeasLocAlertFilter) object);
        {
            MIMKey3 lhsAlertSeverity;
            lhsAlertSeverity = this.getAlertSeverity();
            MIMKey3 rhsAlertSeverity;
            rhsAlertSeverity = that.getAlertSeverity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alertSeverity", lhsAlertSeverity), LocatorUtils.property(thatLocator, "alertSeverity", rhsAlertSeverity), lhsAlertSeverity, rhsAlertSeverity)) {
                return false;
            }
        }
        {
            Long lhsAlertTypeCode;
            lhsAlertTypeCode = this.getAlertTypeCode();
            Long rhsAlertTypeCode;
            rhsAlertTypeCode = that.getAlertTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alertTypeCode", lhsAlertTypeCode), LocatorUtils.property(thatLocator, "alertTypeCode", rhsAlertTypeCode), lhsAlertTypeCode, rhsAlertTypeCode)) {
                return false;
            }
        }
        {
            Long lhsAlertTypeId;
            lhsAlertTypeId = this.getAlertTypeId();
            Long rhsAlertTypeId;
            rhsAlertTypeId = that.getAlertTypeId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alertTypeId", lhsAlertTypeId), LocatorUtils.property(thatLocator, "alertTypeId", rhsAlertTypeId), lhsAlertTypeId, rhsAlertTypeId)) {
                return false;
            }
        }
        {
            Site lhsAlertTypeSite;
            lhsAlertTypeSite = this.getAlertTypeSite();
            Site rhsAlertTypeSite;
            rhsAlertTypeSite = that.getAlertTypeSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alertTypeSite", lhsAlertTypeSite), LocatorUtils.property(thatLocator, "alertTypeSite", rhsAlertTypeSite), lhsAlertTypeSite, rhsAlertTypeSite)) {
                return false;
            }
        }
        {
            EnumValue lhsRegionEnum;
            lhsRegionEnum = this.getRegionEnum();
            EnumValue rhsRegionEnum;
            rhsRegionEnum = that.getRegionEnum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regionEnum", lhsRegionEnum), LocatorUtils.property(thatLocator, "regionEnum", rhsRegionEnum), lhsRegionEnum, rhsRegionEnum)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            MIMKey3 theAlertSeverity;
            theAlertSeverity = this.getAlertSeverity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alertSeverity", theAlertSeverity), currentHashCode, theAlertSeverity);
        }
        {
            Long theAlertTypeCode;
            theAlertTypeCode = this.getAlertTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alertTypeCode", theAlertTypeCode), currentHashCode, theAlertTypeCode);
        }
        {
            Long theAlertTypeId;
            theAlertTypeId = this.getAlertTypeId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alertTypeId", theAlertTypeId), currentHashCode, theAlertTypeId);
        }
        {
            Site theAlertTypeSite;
            theAlertTypeSite = this.getAlertTypeSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alertTypeSite", theAlertTypeSite), currentHashCode, theAlertTypeSite);
        }
        {
            EnumValue theRegionEnum;
            theRegionEnum = this.getRegionEnum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "regionEnum", theRegionEnum), currentHashCode, theRegionEnum);
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
