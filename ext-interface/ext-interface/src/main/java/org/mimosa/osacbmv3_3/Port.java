
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for Port complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Port">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="config" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="lastUpdate" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="osacbmDataType" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmDataType" minOccurs="0"/>
 *         &lt;element name="site" type="{http://www.mimosa.org/OSACBMV3.3.1}Site" minOccurs="0"/>
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
@XmlType(name = "Port", propOrder = {
    "config",
    "id",
    "lastUpdate",
    "name",
    "osacbmDataType",
    "site",
    "userTag"
})
@XmlSeeAlso({
    PAPort.class,
    AGPort.class,
    DAPort.class,
    HAPort.class,
    DMPort.class,
    SDPort.class
})
public class Port
    implements Serializable, Equals, HashCode, ToString
{

    protected String config;
    @XmlSchemaType(name = "unsignedInt")
    protected long id;
    @XmlElement(required = true)
    protected OsacbmTime lastUpdate;
    protected String name;
    protected OsacbmDataType osacbmDataType;
    protected Site site;
    protected String userTag;

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfig(String value) {
        this.config = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setLastUpdate(OsacbmTime value) {
        this.lastUpdate = value;
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
     * Gets the value of the osacbmDataType property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmDataType }
     *     
     */
    public OsacbmDataType getOsacbmDataType() {
        return osacbmDataType;
    }

    /**
     * Sets the value of the osacbmDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmDataType }
     *     
     */
    public void setOsacbmDataType(OsacbmDataType value) {
        this.osacbmDataType = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setSite(Site value) {
        this.site = value;
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
            String theConfig;
            theConfig = this.getConfig();
            strategy.appendField(locator, this, "config", buffer, theConfig);
        }
        {
            long theId;
            theId = (true?this.getId(): 0L);
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            OsacbmTime theLastUpdate;
            theLastUpdate = this.getLastUpdate();
            strategy.appendField(locator, this, "lastUpdate", buffer, theLastUpdate);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            OsacbmDataType theOsacbmDataType;
            theOsacbmDataType = this.getOsacbmDataType();
            strategy.appendField(locator, this, "osacbmDataType", buffer, theOsacbmDataType);
        }
        {
            Site theSite;
            theSite = this.getSite();
            strategy.appendField(locator, this, "site", buffer, theSite);
        }
        {
            String theUserTag;
            theUserTag = this.getUserTag();
            strategy.appendField(locator, this, "userTag", buffer, theUserTag);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Port)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Port that = ((Port) object);
        {
            String lhsConfig;
            lhsConfig = this.getConfig();
            String rhsConfig;
            rhsConfig = that.getConfig();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "config", lhsConfig), LocatorUtils.property(thatLocator, "config", rhsConfig), lhsConfig, rhsConfig)) {
                return false;
            }
        }
        {
            long lhsId;
            lhsId = (true?this.getId(): 0L);
            long rhsId;
            rhsId = (true?that.getId(): 0L);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            OsacbmTime lhsLastUpdate;
            lhsLastUpdate = this.getLastUpdate();
            OsacbmTime rhsLastUpdate;
            rhsLastUpdate = that.getLastUpdate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastUpdate", lhsLastUpdate), LocatorUtils.property(thatLocator, "lastUpdate", rhsLastUpdate), lhsLastUpdate, rhsLastUpdate)) {
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
            OsacbmDataType lhsOsacbmDataType;
            lhsOsacbmDataType = this.getOsacbmDataType();
            OsacbmDataType rhsOsacbmDataType;
            rhsOsacbmDataType = that.getOsacbmDataType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "osacbmDataType", lhsOsacbmDataType), LocatorUtils.property(thatLocator, "osacbmDataType", rhsOsacbmDataType), lhsOsacbmDataType, rhsOsacbmDataType)) {
                return false;
            }
        }
        {
            Site lhsSite;
            lhsSite = this.getSite();
            Site rhsSite;
            rhsSite = that.getSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "site", lhsSite), LocatorUtils.property(thatLocator, "site", rhsSite), lhsSite, rhsSite)) {
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
            String theConfig;
            theConfig = this.getConfig();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "config", theConfig), currentHashCode, theConfig);
        }
        {
            long theId;
            theId = (true?this.getId(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            OsacbmTime theLastUpdate;
            theLastUpdate = this.getLastUpdate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastUpdate", theLastUpdate), currentHashCode, theLastUpdate);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            OsacbmDataType theOsacbmDataType;
            theOsacbmDataType = this.getOsacbmDataType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "osacbmDataType", theOsacbmDataType), currentHashCode, theOsacbmDataType);
        }
        {
            Site theSite;
            theSite = this.getSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "site", theSite), currentHashCode, theSite);
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
