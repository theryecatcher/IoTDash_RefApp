
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
 * <p>Java class for NumAlert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumAlert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alertSeverity" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="alertTypeCode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="alertTypeId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="alertTypeSite" type="{http://www.mimosa.org/OSACBMV3.3.1}Site" minOccurs="0"/>
 *         &lt;element name="hiSideAlert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lastTrigger" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime" minOccurs="0"/>
 *         &lt;element name="regionEnum" type="{http://www.mimosa.org/OSACBMV3.3.1}EnumValue" minOccurs="0"/>
 *         &lt;element name="regionRef" type="{http://www.mimosa.org/OSACBMV3.3.1}AlertRegionRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumAlert", propOrder = {
    "alertName",
    "alertSeverity",
    "alertTypeCode",
    "alertTypeId",
    "alertTypeSite",
    "hiSideAlert",
    "lastTrigger",
    "regionEnum",
    "regionRef"
})
public class NumAlert
    implements Serializable, Equals, HashCode, ToString
{

    protected String alertName;
    protected MIMKey3 alertSeverity;
    @XmlSchemaType(name = "unsignedInt")
    protected long alertTypeCode;
    @XmlSchemaType(name = "unsignedInt")
    protected Long alertTypeId;
    protected Site alertTypeSite;
    protected Boolean hiSideAlert;
    protected OsacbmTime lastTrigger;
    protected EnumValue regionEnum;
    protected AlertRegionRef regionRef;

    /**
     * Gets the value of the alertName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertName() {
        return alertName;
    }

    /**
     * Sets the value of the alertName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertName(String value) {
        this.alertName = value;
    }

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
     */
    public long getAlertTypeCode() {
        return alertTypeCode;
    }

    /**
     * Sets the value of the alertTypeCode property.
     * 
     */
    public void setAlertTypeCode(long value) {
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
     * Gets the value of the hiSideAlert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHiSideAlert() {
        return hiSideAlert;
    }

    /**
     * Sets the value of the hiSideAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHiSideAlert(Boolean value) {
        this.hiSideAlert = value;
    }

    /**
     * Gets the value of the lastTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getLastTrigger() {
        return lastTrigger;
    }

    /**
     * Sets the value of the lastTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setLastTrigger(OsacbmTime value) {
        this.lastTrigger = value;
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
        {
            String theAlertName;
            theAlertName = this.getAlertName();
            strategy.appendField(locator, this, "alertName", buffer, theAlertName);
        }
        {
            MIMKey3 theAlertSeverity;
            theAlertSeverity = this.getAlertSeverity();
            strategy.appendField(locator, this, "alertSeverity", buffer, theAlertSeverity);
        }
        {
            long theAlertTypeCode;
            theAlertTypeCode = (true?this.getAlertTypeCode(): 0L);
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
            Boolean theHiSideAlert;
            theHiSideAlert = this.isHiSideAlert();
            strategy.appendField(locator, this, "hiSideAlert", buffer, theHiSideAlert);
        }
        {
            OsacbmTime theLastTrigger;
            theLastTrigger = this.getLastTrigger();
            strategy.appendField(locator, this, "lastTrigger", buffer, theLastTrigger);
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
        if (!(object instanceof NumAlert)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NumAlert that = ((NumAlert) object);
        {
            String lhsAlertName;
            lhsAlertName = this.getAlertName();
            String rhsAlertName;
            rhsAlertName = that.getAlertName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alertName", lhsAlertName), LocatorUtils.property(thatLocator, "alertName", rhsAlertName), lhsAlertName, rhsAlertName)) {
                return false;
            }
        }
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
            long lhsAlertTypeCode;
            lhsAlertTypeCode = (true?this.getAlertTypeCode(): 0L);
            long rhsAlertTypeCode;
            rhsAlertTypeCode = (true?that.getAlertTypeCode(): 0L);
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
            Boolean lhsHiSideAlert;
            lhsHiSideAlert = this.isHiSideAlert();
            Boolean rhsHiSideAlert;
            rhsHiSideAlert = that.isHiSideAlert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hiSideAlert", lhsHiSideAlert), LocatorUtils.property(thatLocator, "hiSideAlert", rhsHiSideAlert), lhsHiSideAlert, rhsHiSideAlert)) {
                return false;
            }
        }
        {
            OsacbmTime lhsLastTrigger;
            lhsLastTrigger = this.getLastTrigger();
            OsacbmTime rhsLastTrigger;
            rhsLastTrigger = that.getLastTrigger();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastTrigger", lhsLastTrigger), LocatorUtils.property(thatLocator, "lastTrigger", rhsLastTrigger), lhsLastTrigger, rhsLastTrigger)) {
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
        int currentHashCode = 1;
        {
            String theAlertName;
            theAlertName = this.getAlertName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alertName", theAlertName), currentHashCode, theAlertName);
        }
        {
            MIMKey3 theAlertSeverity;
            theAlertSeverity = this.getAlertSeverity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alertSeverity", theAlertSeverity), currentHashCode, theAlertSeverity);
        }
        {
            long theAlertTypeCode;
            theAlertTypeCode = (true?this.getAlertTypeCode(): 0L);
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
            Boolean theHiSideAlert;
            theHiSideAlert = this.isHiSideAlert();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hiSideAlert", theHiSideAlert), currentHashCode, theHiSideAlert);
        }
        {
            OsacbmTime theLastTrigger;
            theLastTrigger = this.getLastTrigger();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastTrigger", theLastTrigger), currentHashCode, theLastTrigger);
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
