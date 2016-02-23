
package org.mimosa.osacbmv3_3;

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


/**
 * <p>Java class for AmbiguityGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmbiguityGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ambId" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3"/>
 *         &lt;element name="ambiguityType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="estStart" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime"/>
 *         &lt;element name="logConnector" type="{http://www.mimosa.org/OSACBMV3.3.1}LogicalConnector" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmbiguityGroup", propOrder = {
    "ambId",
    "ambiguityType",
    "estStart",
    "logConnector",
    "name",
    "userTag"
})
public class AmbiguityGroup
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected MIMKey3 ambId;
    protected MIMKey3 ambiguityType;
    @XmlElement(required = true)
    protected OsacbmTime estStart;
    protected LogicalConnector logConnector;
    protected String name;
    protected String userTag;

    /**
     * Gets the value of the ambId property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getAmbId() {
        return ambId;
    }

    /**
     * Sets the value of the ambId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setAmbId(MIMKey3 value) {
        this.ambId = value;
    }

    /**
     * Gets the value of the ambiguityType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getAmbiguityType() {
        return ambiguityType;
    }

    /**
     * Sets the value of the ambiguityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setAmbiguityType(MIMKey3 value) {
        this.ambiguityType = value;
    }

    /**
     * Gets the value of the estStart property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getEstStart() {
        return estStart;
    }

    /**
     * Sets the value of the estStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setEstStart(OsacbmTime value) {
        this.estStart = value;
    }

    /**
     * Gets the value of the logConnector property.
     * 
     * @return
     *     possible object is
     *     {@link LogicalConnector }
     *     
     */
    public LogicalConnector getLogConnector() {
        return logConnector;
    }

    /**
     * Sets the value of the logConnector property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalConnector }
     *     
     */
    public void setLogConnector(LogicalConnector value) {
        this.logConnector = value;
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
            MIMKey3 theAmbId;
            theAmbId = this.getAmbId();
            strategy.appendField(locator, this, "ambId", buffer, theAmbId);
        }
        {
            MIMKey3 theAmbiguityType;
            theAmbiguityType = this.getAmbiguityType();
            strategy.appendField(locator, this, "ambiguityType", buffer, theAmbiguityType);
        }
        {
            OsacbmTime theEstStart;
            theEstStart = this.getEstStart();
            strategy.appendField(locator, this, "estStart", buffer, theEstStart);
        }
        {
            LogicalConnector theLogConnector;
            theLogConnector = this.getLogConnector();
            strategy.appendField(locator, this, "logConnector", buffer, theLogConnector);
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
        if (!(object instanceof AmbiguityGroup)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AmbiguityGroup that = ((AmbiguityGroup) object);
        {
            MIMKey3 lhsAmbId;
            lhsAmbId = this.getAmbId();
            MIMKey3 rhsAmbId;
            rhsAmbId = that.getAmbId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ambId", lhsAmbId), LocatorUtils.property(thatLocator, "ambId", rhsAmbId), lhsAmbId, rhsAmbId)) {
                return false;
            }
        }
        {
            MIMKey3 lhsAmbiguityType;
            lhsAmbiguityType = this.getAmbiguityType();
            MIMKey3 rhsAmbiguityType;
            rhsAmbiguityType = that.getAmbiguityType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ambiguityType", lhsAmbiguityType), LocatorUtils.property(thatLocator, "ambiguityType", rhsAmbiguityType), lhsAmbiguityType, rhsAmbiguityType)) {
                return false;
            }
        }
        {
            OsacbmTime lhsEstStart;
            lhsEstStart = this.getEstStart();
            OsacbmTime rhsEstStart;
            rhsEstStart = that.getEstStart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estStart", lhsEstStart), LocatorUtils.property(thatLocator, "estStart", rhsEstStart), lhsEstStart, rhsEstStart)) {
                return false;
            }
        }
        {
            LogicalConnector lhsLogConnector;
            lhsLogConnector = this.getLogConnector();
            LogicalConnector rhsLogConnector;
            rhsLogConnector = that.getLogConnector();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logConnector", lhsLogConnector), LocatorUtils.property(thatLocator, "logConnector", rhsLogConnector), lhsLogConnector, rhsLogConnector)) {
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
            MIMKey3 theAmbId;
            theAmbId = this.getAmbId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ambId", theAmbId), currentHashCode, theAmbId);
        }
        {
            MIMKey3 theAmbiguityType;
            theAmbiguityType = this.getAmbiguityType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ambiguityType", theAmbiguityType), currentHashCode, theAmbiguityType);
        }
        {
            OsacbmTime theEstStart;
            theEstStart = this.getEstStart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estStart", theEstStart), currentHashCode, theEstStart);
        }
        {
            LogicalConnector theLogConnector;
            theLogConnector = this.getLogConnector();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logConnector", theLogConnector), currentHashCode, theLogConnector);
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
