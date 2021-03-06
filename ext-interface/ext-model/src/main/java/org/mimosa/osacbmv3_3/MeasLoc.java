//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.07 at 07:40:43 PM IST 
//


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
 * <p>Java class for MeasLoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasLoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measLocId" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey2"/>
 *         &lt;element name="measLocType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userTag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasLoc", propOrder = {
    "measLocId",
    "measLocType",
    "name",
    "userTag"
})
@XmlSeeAlso({
    MeasLocMIM.class
})
public class MeasLoc
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected MIMKey2 measLocId;
    @XmlElement(required = true)
    protected MIMKey3 measLocType;
    protected String name;
    @XmlElement(required = true)
    protected String userTag;

    /**
     * Gets the value of the measLocId property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey2 }
     *     
     */
    public MIMKey2 getMeasLocId() {
        return measLocId;
    }

    /**
     * Sets the value of the measLocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey2 }
     *     
     */
    public void setMeasLocId(MIMKey2 value) {
        this.measLocId = value;
    }

    /**
     * Gets the value of the measLocType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getMeasLocType() {
        return measLocType;
    }

    /**
     * Sets the value of the measLocType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setMeasLocType(MIMKey3 value) {
        this.measLocType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the userTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserTag() {
        return userTag;
    }

    /**
     * Sets the value of the userTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserTag(String value) {
        this.userTag = value;
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
            MIMKey2 theMeasLocId;
            theMeasLocId = this.getMeasLocId();
            strategy.appendField(locator, this, "measLocId", buffer, theMeasLocId);
        }
        {
            MIMKey3 theMeasLocType;
            theMeasLocType = this.getMeasLocType();
            strategy.appendField(locator, this, "measLocType", buffer, theMeasLocType);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theUserTag;
            theUserTag = this.getUserTag();
            strategy.appendField(locator, this, "userTag", buffer, theUserTag);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MeasLoc)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MeasLoc that = ((MeasLoc) object);
        {
            MIMKey2 lhsMeasLocId;
            lhsMeasLocId = this.getMeasLocId();
            MIMKey2 rhsMeasLocId;
            rhsMeasLocId = that.getMeasLocId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measLocId", lhsMeasLocId), LocatorUtils.property(thatLocator, "measLocId", rhsMeasLocId), lhsMeasLocId, rhsMeasLocId)) {
                return false;
            }
        }
        {
            MIMKey3 lhsMeasLocType;
            lhsMeasLocType = this.getMeasLocType();
            MIMKey3 rhsMeasLocType;
            rhsMeasLocType = that.getMeasLocType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measLocType", lhsMeasLocType), LocatorUtils.property(thatLocator, "measLocType", rhsMeasLocType), lhsMeasLocType, rhsMeasLocType)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsUserTag;
            lhsUserTag = this.getUserTag();
            String rhsUserTag;
            rhsUserTag = that.getUserTag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userTag", lhsUserTag), LocatorUtils.property(thatLocator, "userTag", rhsUserTag), lhsUserTag, rhsUserTag)) {
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
            MIMKey2 theMeasLocId;
            theMeasLocId = this.getMeasLocId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measLocId", theMeasLocId), currentHashCode, theMeasLocId);
        }
        {
            MIMKey3 theMeasLocType;
            theMeasLocType = this.getMeasLocType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measLocType", theMeasLocType), currentHashCode, theMeasLocType);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theUserTag;
            theUserTag = this.getUserTag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userTag", theUserTag), currentHashCode, theUserTag);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
