
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
 * <p>Java class for Site complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Site">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://www.mimosa.org/OSACBMV3.3.1}SITE_CATEGORY"/>
 *         &lt;element name="regId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemUserTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Site", propOrder = {
    "category",
    "regId",
    "siteId",
    "systemUserTag",
    "userTag"
})
public class Site
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected SITECATEGORY category;
    protected String regId;
    protected String siteId;
    protected String systemUserTag;
    protected String userTag;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link SITECATEGORY }
     *     
     */
    public SITECATEGORY getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link SITECATEGORY }
     *     
     */
    public void setCategory(SITECATEGORY value) {
        this.category = value;
    }

    /**
     * Gets the value of the regId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegId() {
        return regId;
    }

    /**
     * Sets the value of the regId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegId(String value) {
        this.regId = value;
    }

    /**
     * Gets the value of the siteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the value of the siteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteId(String value) {
        this.siteId = value;
    }

    /**
     * Gets the value of the systemUserTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemUserTag() {
        return systemUserTag;
    }

    /**
     * Sets the value of the systemUserTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemUserTag(String value) {
        this.systemUserTag = value;
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
            SITECATEGORY theCategory;
            theCategory = this.getCategory();
            strategy.appendField(locator, this, "category", buffer, theCategory);
        }
        {
            String theRegId;
            theRegId = this.getRegId();
            strategy.appendField(locator, this, "regId", buffer, theRegId);
        }
        {
            String theSiteId;
            theSiteId = this.getSiteId();
            strategy.appendField(locator, this, "siteId", buffer, theSiteId);
        }
        {
            String theSystemUserTag;
            theSystemUserTag = this.getSystemUserTag();
            strategy.appendField(locator, this, "systemUserTag", buffer, theSystemUserTag);
        }
        {
            String theUserTag;
            theUserTag = this.getUserTag();
            strategy.appendField(locator, this, "userTag", buffer, theUserTag);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Site)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Site that = ((Site) object);
        {
            SITECATEGORY lhsCategory;
            lhsCategory = this.getCategory();
            SITECATEGORY rhsCategory;
            rhsCategory = that.getCategory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "category", lhsCategory), LocatorUtils.property(thatLocator, "category", rhsCategory), lhsCategory, rhsCategory)) {
                return false;
            }
        }
        {
            String lhsRegId;
            lhsRegId = this.getRegId();
            String rhsRegId;
            rhsRegId = that.getRegId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regId", lhsRegId), LocatorUtils.property(thatLocator, "regId", rhsRegId), lhsRegId, rhsRegId)) {
                return false;
            }
        }
        {
            String lhsSiteId;
            lhsSiteId = this.getSiteId();
            String rhsSiteId;
            rhsSiteId = that.getSiteId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "siteId", lhsSiteId), LocatorUtils.property(thatLocator, "siteId", rhsSiteId), lhsSiteId, rhsSiteId)) {
                return false;
            }
        }
        {
            String lhsSystemUserTag;
            lhsSystemUserTag = this.getSystemUserTag();
            String rhsSystemUserTag;
            rhsSystemUserTag = that.getSystemUserTag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "systemUserTag", lhsSystemUserTag), LocatorUtils.property(thatLocator, "systemUserTag", rhsSystemUserTag), lhsSystemUserTag, rhsSystemUserTag)) {
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
            SITECATEGORY theCategory;
            theCategory = this.getCategory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "category", theCategory), currentHashCode, theCategory);
        }
        {
            String theRegId;
            theRegId = this.getRegId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "regId", theRegId), currentHashCode, theRegId);
        }
        {
            String theSiteId;
            theSiteId = this.getSiteId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "siteId", theSiteId), currentHashCode, theSiteId);
        }
        {
            String theSystemUserTag;
            theSystemUserTag = this.getSystemUserTag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "systemUserTag", theSystemUserTag), currentHashCode, theSystemUserTag);
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
