
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
 * <p>Java class for TimeSelect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSelect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="decimate" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="snapshotEnd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="snapshotStart" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="timeEnd" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime" minOccurs="0"/>
 *         &lt;element name="timeStart" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSelect", propOrder = {
    "decimate",
    "snapshotEnd",
    "snapshotStart",
    "timeEnd",
    "timeStart"
})
public class TimeSelect
    implements Serializable, Equals, HashCode, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long decimate;
    protected Integer snapshotEnd;
    protected Integer snapshotStart;
    protected OsacbmTime timeEnd;
    protected OsacbmTime timeStart;

    /**
     * Gets the value of the decimate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDecimate() {
        return decimate;
    }

    /**
     * Sets the value of the decimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDecimate(Long value) {
        this.decimate = value;
    }

    /**
     * Gets the value of the snapshotEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSnapshotEnd() {
        return snapshotEnd;
    }

    /**
     * Sets the value of the snapshotEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSnapshotEnd(Integer value) {
        this.snapshotEnd = value;
    }

    /**
     * Gets the value of the snapshotStart property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSnapshotStart() {
        return snapshotStart;
    }

    /**
     * Sets the value of the snapshotStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSnapshotStart(Integer value) {
        this.snapshotStart = value;
    }

    /**
     * Gets the value of the timeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getTimeEnd() {
        return timeEnd;
    }

    /**
     * Sets the value of the timeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setTimeEnd(OsacbmTime value) {
        this.timeEnd = value;
    }

    /**
     * Gets the value of the timeStart property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getTimeStart() {
        return timeStart;
    }

    /**
     * Sets the value of the timeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setTimeStart(OsacbmTime value) {
        this.timeStart = value;
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
            Long theDecimate;
            theDecimate = this.getDecimate();
            strategy.appendField(locator, this, "decimate", buffer, theDecimate);
        }
        {
            Integer theSnapshotEnd;
            theSnapshotEnd = this.getSnapshotEnd();
            strategy.appendField(locator, this, "snapshotEnd", buffer, theSnapshotEnd);
        }
        {
            Integer theSnapshotStart;
            theSnapshotStart = this.getSnapshotStart();
            strategy.appendField(locator, this, "snapshotStart", buffer, theSnapshotStart);
        }
        {
            OsacbmTime theTimeEnd;
            theTimeEnd = this.getTimeEnd();
            strategy.appendField(locator, this, "timeEnd", buffer, theTimeEnd);
        }
        {
            OsacbmTime theTimeStart;
            theTimeStart = this.getTimeStart();
            strategy.appendField(locator, this, "timeStart", buffer, theTimeStart);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TimeSelect)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeSelect that = ((TimeSelect) object);
        {
            Long lhsDecimate;
            lhsDecimate = this.getDecimate();
            Long rhsDecimate;
            rhsDecimate = that.getDecimate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "decimate", lhsDecimate), LocatorUtils.property(thatLocator, "decimate", rhsDecimate), lhsDecimate, rhsDecimate)) {
                return false;
            }
        }
        {
            Integer lhsSnapshotEnd;
            lhsSnapshotEnd = this.getSnapshotEnd();
            Integer rhsSnapshotEnd;
            rhsSnapshotEnd = that.getSnapshotEnd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "snapshotEnd", lhsSnapshotEnd), LocatorUtils.property(thatLocator, "snapshotEnd", rhsSnapshotEnd), lhsSnapshotEnd, rhsSnapshotEnd)) {
                return false;
            }
        }
        {
            Integer lhsSnapshotStart;
            lhsSnapshotStart = this.getSnapshotStart();
            Integer rhsSnapshotStart;
            rhsSnapshotStart = that.getSnapshotStart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "snapshotStart", lhsSnapshotStart), LocatorUtils.property(thatLocator, "snapshotStart", rhsSnapshotStart), lhsSnapshotStart, rhsSnapshotStart)) {
                return false;
            }
        }
        {
            OsacbmTime lhsTimeEnd;
            lhsTimeEnd = this.getTimeEnd();
            OsacbmTime rhsTimeEnd;
            rhsTimeEnd = that.getTimeEnd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeEnd", lhsTimeEnd), LocatorUtils.property(thatLocator, "timeEnd", rhsTimeEnd), lhsTimeEnd, rhsTimeEnd)) {
                return false;
            }
        }
        {
            OsacbmTime lhsTimeStart;
            lhsTimeStart = this.getTimeStart();
            OsacbmTime rhsTimeStart;
            rhsTimeStart = that.getTimeStart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeStart", lhsTimeStart), LocatorUtils.property(thatLocator, "timeStart", rhsTimeStart), lhsTimeStart, rhsTimeStart)) {
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
            Long theDecimate;
            theDecimate = this.getDecimate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "decimate", theDecimate), currentHashCode, theDecimate);
        }
        {
            Integer theSnapshotEnd;
            theSnapshotEnd = this.getSnapshotEnd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "snapshotEnd", theSnapshotEnd), currentHashCode, theSnapshotEnd);
        }
        {
            Integer theSnapshotStart;
            theSnapshotStart = this.getSnapshotStart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "snapshotStart", theSnapshotStart), currentHashCode, theSnapshotStart);
        }
        {
            OsacbmTime theTimeEnd;
            theTimeEnd = this.getTimeEnd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeEnd", theTimeEnd), currentHashCode, theTimeEnd);
        }
        {
            OsacbmTime theTimeStart;
            theTimeStart = this.getTimeStart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeStart", theTimeStart), currentHashCode, theTimeStart);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
