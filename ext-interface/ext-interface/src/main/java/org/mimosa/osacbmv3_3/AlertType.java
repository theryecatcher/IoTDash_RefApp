
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for AlertType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alertSeverity" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="alertTypeCode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="alertTypeId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="alertTypeSite" type="{http://www.mimosa.org/OSACBMV3.3.1}Site"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertType", propOrder = {
    "alertName",
    "alertSeverity",
    "alertTypeCode",
    "alertTypeId",
    "alertTypeSite"
})
public class AlertType
    implements Serializable, Equals, HashCode, ToString
{

    protected String alertName;
    protected MIMKey3 alertSeverity;
    @XmlSchemaType(name = "unsignedInt")
    protected long alertTypeCode;
    @XmlSchemaType(name = "unsignedInt")
    protected long alertTypeId;
    @XmlElement(required = true)
    protected Site alertTypeSite;

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
     */
    public long getAlertTypeId() {
        return alertTypeId;
    }

    /**
     * Sets the value of the alertTypeId property.
     * 
     */
    public void setAlertTypeId(long value) {
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
            long theAlertTypeId;
            theAlertTypeId = (true?this.getAlertTypeId(): 0L);
            strategy.appendField(locator, this, "alertTypeId", buffer, theAlertTypeId);
        }
        {
            Site theAlertTypeSite;
            theAlertTypeSite = this.getAlertTypeSite();
            strategy.appendField(locator, this, "alertTypeSite", buffer, theAlertTypeSite);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AlertType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AlertType that = ((AlertType) object);
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
            long lhsAlertTypeId;
            lhsAlertTypeId = (true?this.getAlertTypeId(): 0L);
            long rhsAlertTypeId;
            rhsAlertTypeId = (true?that.getAlertTypeId(): 0L);
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
            long theAlertTypeId;
            theAlertTypeId = (true?this.getAlertTypeId(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alertTypeId", theAlertTypeId), currentHashCode, theAlertTypeId);
        }
        {
            Site theAlertTypeSite;
            theAlertTypeSite = this.getAlertTypeSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alertTypeSite", theAlertTypeSite), currentHashCode, theAlertTypeSite);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
