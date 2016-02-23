
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for Data complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Data">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compositeData" type="{http://www.mimosa.org/OSACBMV3.3.1}Data" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dataType" type="{http://www.mimosa.org/OSACBMV3.3.1}DataType" minOccurs="0"/>
 *         &lt;element name="time" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.mimosa.org/OSACBMV3.3.1}Value" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Data", propOrder = {
    "compositeData",
    "dataType",
    "time",
    "value"
})
public class Data
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(nillable = true)
    protected List<Data> compositeData;
    protected DataType dataType;
    protected OsacbmTime time;
    protected Value value;

    /**
     * Gets the value of the compositeData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositeData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositeData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Data }
     * 
     * 
     */
    public List<Data> getCompositeData() {
        if (compositeData == null) {
            compositeData = new ArrayList<Data>();
        }
        return this.compositeData;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setDataType(DataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setTime(OsacbmTime value) {
        this.time = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setValue(Value value) {
        this.value = value;
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
            List<Data> theCompositeData;
            theCompositeData = (((this.compositeData!= null)&&(!this.compositeData.isEmpty()))?this.getCompositeData():null);
            strategy.appendField(locator, this, "compositeData", buffer, theCompositeData);
        }
        {
            DataType theDataType;
            theDataType = this.getDataType();
            strategy.appendField(locator, this, "dataType", buffer, theDataType);
        }
        {
            OsacbmTime theTime;
            theTime = this.getTime();
            strategy.appendField(locator, this, "time", buffer, theTime);
        }
        {
            Value theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Data)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Data that = ((Data) object);
        {
            List<Data> lhsCompositeData;
            lhsCompositeData = (((this.compositeData!= null)&&(!this.compositeData.isEmpty()))?this.getCompositeData():null);
            List<Data> rhsCompositeData;
            rhsCompositeData = (((that.compositeData!= null)&&(!that.compositeData.isEmpty()))?that.getCompositeData():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "compositeData", lhsCompositeData), LocatorUtils.property(thatLocator, "compositeData", rhsCompositeData), lhsCompositeData, rhsCompositeData)) {
                return false;
            }
        }
        {
            DataType lhsDataType;
            lhsDataType = this.getDataType();
            DataType rhsDataType;
            rhsDataType = that.getDataType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataType", lhsDataType), LocatorUtils.property(thatLocator, "dataType", rhsDataType), lhsDataType, rhsDataType)) {
                return false;
            }
        }
        {
            OsacbmTime lhsTime;
            lhsTime = this.getTime();
            OsacbmTime rhsTime;
            rhsTime = that.getTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "time", lhsTime), LocatorUtils.property(thatLocator, "time", rhsTime), lhsTime, rhsTime)) {
                return false;
            }
        }
        {
            Value lhsValue;
            lhsValue = this.getValue();
            Value rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
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
            List<Data> theCompositeData;
            theCompositeData = (((this.compositeData!= null)&&(!this.compositeData.isEmpty()))?this.getCompositeData():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compositeData", theCompositeData), currentHashCode, theCompositeData);
        }
        {
            DataType theDataType;
            theDataType = this.getDataType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataType", theDataType), currentHashCode, theDataType);
        }
        {
            OsacbmTime theTime;
            theTime = this.getTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "time", theTime), currentHashCode, theTime);
        }
        {
            Value theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
