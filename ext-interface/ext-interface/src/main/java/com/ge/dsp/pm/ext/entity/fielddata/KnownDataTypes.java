
package com.ge.dsp.pm.ext.entity.fielddata;

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
import org.mimosa.osacbmv3_3.DataEvent;


/**
 * <p>Java class for KnownDataTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KnownDataTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.mimosa.org/OSACBMV3.3.1}DataEvent"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/fielddata}data"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KnownDataTypes", propOrder = {
    "dataEvent",
    "data"
})
public class KnownDataTypes
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(name = "DataEvent", namespace = "http://www.mimosa.org/OSACBMV3.3.1", required = true, nillable = true)
    protected DataEvent dataEvent;
    @XmlElement(required = true)
    protected Data data;

    /**
     * Gets the value of the dataEvent property.
     * 
     * @return
     *     possible object is
     *     {@link DataEvent }
     *     
     */
    public DataEvent getDataEvent() {
        return dataEvent;
    }

    /**
     * Sets the value of the dataEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataEvent }
     *     
     */
    public void setDataEvent(DataEvent value) {
        this.dataEvent = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Data }
     *     
     */
    public Data getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Data }
     *     
     */
    public void setData(Data value) {
        this.data = value;
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
            DataEvent theDataEvent;
            theDataEvent = this.getDataEvent();
            strategy.appendField(locator, this, "dataEvent", buffer, theDataEvent);
        }
        {
            Data theData;
            theData = this.getData();
            strategy.appendField(locator, this, "data", buffer, theData);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof KnownDataTypes)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final KnownDataTypes that = ((KnownDataTypes) object);
        {
            DataEvent lhsDataEvent;
            lhsDataEvent = this.getDataEvent();
            DataEvent rhsDataEvent;
            rhsDataEvent = that.getDataEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataEvent", lhsDataEvent), LocatorUtils.property(thatLocator, "dataEvent", rhsDataEvent), lhsDataEvent, rhsDataEvent)) {
                return false;
            }
        }
        {
            Data lhsData;
            lhsData = this.getData();
            Data rhsData;
            rhsData = that.getData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "data", lhsData), LocatorUtils.property(thatLocator, "data", rhsData), lhsData, rhsData)) {
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
            DataEvent theDataEvent;
            theDataEvent = this.getDataEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataEvent", theDataEvent), currentHashCode, theDataEvent);
        }
        {
            Data theData;
            theData = this.getData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "data", theData), currentHashCode, theData);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
