
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import java.math.BigInteger;
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
 * <p>Java class for OsacbmTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OsacbmTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="localTime" type="{http://www.mimosa.org/OSACBMV3.3.1}LocalTime" minOccurs="0"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="time_binary" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="time_type" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTimeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OsacbmTime", propOrder = {
    "localTime",
    "time",
    "timeBinary",
    "timeType"
})
public class OsacbmTime
    implements Serializable, Equals, HashCode, ToString
{

    protected LocalTime localTime;
    @XmlElement(required = true)
    protected String time;
    @XmlElement(name = "time_binary")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger timeBinary;
    @XmlElement(name = "time_type", required = true)
    protected OsacbmTimeType timeType;

    /**
     * Gets the value of the localTime property.
     * 
     * @return
     *     possible object is
     *     {@link LocalTime }
     *     
     */
    public LocalTime getLocalTime() {
        return localTime;
    }

    /**
     * Sets the value of the localTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalTime }
     *     
     */
    public void setLocalTime(LocalTime value) {
        this.localTime = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the timeBinary property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeBinary() {
        return timeBinary;
    }

    /**
     * Sets the value of the timeBinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeBinary(BigInteger value) {
        this.timeBinary = value;
    }

    /**
     * Gets the value of the timeType property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTimeType }
     *     
     */
    public OsacbmTimeType getTimeType() {
        return timeType;
    }

    /**
     * Sets the value of the timeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTimeType }
     *     
     */
    public void setTimeType(OsacbmTimeType value) {
        this.timeType = value;
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
            LocalTime theLocalTime;
            theLocalTime = this.getLocalTime();
            strategy.appendField(locator, this, "localTime", buffer, theLocalTime);
        }
        {
            String theTime;
            theTime = this.getTime();
            strategy.appendField(locator, this, "time", buffer, theTime);
        }
        {
            BigInteger theTimeBinary;
            theTimeBinary = this.getTimeBinary();
            strategy.appendField(locator, this, "timeBinary", buffer, theTimeBinary);
        }
        {
            OsacbmTimeType theTimeType;
            theTimeType = this.getTimeType();
            strategy.appendField(locator, this, "timeType", buffer, theTimeType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OsacbmTime)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OsacbmTime that = ((OsacbmTime) object);
        {
            LocalTime lhsLocalTime;
            lhsLocalTime = this.getLocalTime();
            LocalTime rhsLocalTime;
            rhsLocalTime = that.getLocalTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localTime", lhsLocalTime), LocatorUtils.property(thatLocator, "localTime", rhsLocalTime), lhsLocalTime, rhsLocalTime)) {
                return false;
            }
        }
        {
            String lhsTime;
            lhsTime = this.getTime();
            String rhsTime;
            rhsTime = that.getTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "time", lhsTime), LocatorUtils.property(thatLocator, "time", rhsTime), lhsTime, rhsTime)) {
                return false;
            }
        }
        {
            BigInteger lhsTimeBinary;
            lhsTimeBinary = this.getTimeBinary();
            BigInteger rhsTimeBinary;
            rhsTimeBinary = that.getTimeBinary();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeBinary", lhsTimeBinary), LocatorUtils.property(thatLocator, "timeBinary", rhsTimeBinary), lhsTimeBinary, rhsTimeBinary)) {
                return false;
            }
        }
        {
            OsacbmTimeType lhsTimeType;
            lhsTimeType = this.getTimeType();
            OsacbmTimeType rhsTimeType;
            rhsTimeType = that.getTimeType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeType", lhsTimeType), LocatorUtils.property(thatLocator, "timeType", rhsTimeType), lhsTimeType, rhsTimeType)) {
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
            LocalTime theLocalTime;
            theLocalTime = this.getLocalTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localTime", theLocalTime), currentHashCode, theLocalTime);
        }
        {
            String theTime;
            theTime = this.getTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "time", theTime), currentHashCode, theTime);
        }
        {
            BigInteger theTimeBinary;
            theTimeBinary = this.getTimeBinary();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeBinary", theTimeBinary), currentHashCode, theTimeBinary);
        }
        {
            OsacbmTimeType theTimeType;
            theTimeType = this.getTimeType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeType", theTimeType), currentHashCode, theTimeType);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
