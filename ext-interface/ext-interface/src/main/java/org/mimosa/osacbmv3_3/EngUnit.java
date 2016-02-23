
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
 * <p>Java class for EngUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EngUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="abbrev" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="dbId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refUnit" type="{http://www.mimosa.org/OSACBMV3.3.1}RefUnit" minOccurs="0"/>
 *         &lt;element name="site" type="{http://www.mimosa.org/OSACBMV3.3.1}Site"/>
 *         &lt;element name="unitConv" type="{http://www.mimosa.org/OSACBMV3.3.1}UnitConverter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EngUnit", propOrder = {
    "abbrev",
    "code",
    "dbId",
    "name",
    "refUnit",
    "site",
    "unitConv"
})
public class EngUnit
    implements Serializable, Equals, HashCode, ToString
{

    protected String abbrev;
    @XmlSchemaType(name = "unsignedInt")
    protected long code;
    @XmlSchemaType(name = "unsignedInt")
    protected long dbId;
    protected String name;
    protected RefUnit refUnit;
    @XmlElement(required = true)
    protected Site site;
    protected UnitConverter unitConv;

    /**
     * Gets the value of the abbrev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbrev() {
        return abbrev;
    }

    /**
     * Sets the value of the abbrev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbrev(String value) {
        this.abbrev = value;
    }

    /**
     * Gets the value of the code property.
     * 
     */
    public long getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     */
    public void setCode(long value) {
        this.code = value;
    }

    /**
     * Gets the value of the dbId property.
     * 
     */
    public long getDbId() {
        return dbId;
    }

    /**
     * Sets the value of the dbId property.
     * 
     */
    public void setDbId(long value) {
        this.dbId = value;
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
     * Gets the value of the refUnit property.
     * 
     * @return
     *     possible object is
     *     {@link RefUnit }
     *     
     */
    public RefUnit getRefUnit() {
        return refUnit;
    }

    /**
     * Sets the value of the refUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefUnit }
     *     
     */
    public void setRefUnit(RefUnit value) {
        this.refUnit = value;
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
     * Gets the value of the unitConv property.
     * 
     * @return
     *     possible object is
     *     {@link UnitConverter }
     *     
     */
    public UnitConverter getUnitConv() {
        return unitConv;
    }

    /**
     * Sets the value of the unitConv property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitConverter }
     *     
     */
    public void setUnitConv(UnitConverter value) {
        this.unitConv = value;
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
            String theAbbrev;
            theAbbrev = this.getAbbrev();
            strategy.appendField(locator, this, "abbrev", buffer, theAbbrev);
        }
        {
            long theCode;
            theCode = (true?this.getCode(): 0L);
            strategy.appendField(locator, this, "code", buffer, theCode);
        }
        {
            long theDbId;
            theDbId = (true?this.getDbId(): 0L);
            strategy.appendField(locator, this, "dbId", buffer, theDbId);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            RefUnit theRefUnit;
            theRefUnit = this.getRefUnit();
            strategy.appendField(locator, this, "refUnit", buffer, theRefUnit);
        }
        {
            Site theSite;
            theSite = this.getSite();
            strategy.appendField(locator, this, "site", buffer, theSite);
        }
        {
            UnitConverter theUnitConv;
            theUnitConv = this.getUnitConv();
            strategy.appendField(locator, this, "unitConv", buffer, theUnitConv);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EngUnit)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EngUnit that = ((EngUnit) object);
        {
            String lhsAbbrev;
            lhsAbbrev = this.getAbbrev();
            String rhsAbbrev;
            rhsAbbrev = that.getAbbrev();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abbrev", lhsAbbrev), LocatorUtils.property(thatLocator, "abbrev", rhsAbbrev), lhsAbbrev, rhsAbbrev)) {
                return false;
            }
        }
        {
            long lhsCode;
            lhsCode = (true?this.getCode(): 0L);
            long rhsCode;
            rhsCode = (true?that.getCode(): 0L);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
                return false;
            }
        }
        {
            long lhsDbId;
            lhsDbId = (true?this.getDbId(): 0L);
            long rhsDbId;
            rhsDbId = (true?that.getDbId(): 0L);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dbId", lhsDbId), LocatorUtils.property(thatLocator, "dbId", rhsDbId), lhsDbId, rhsDbId)) {
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
            RefUnit lhsRefUnit;
            lhsRefUnit = this.getRefUnit();
            RefUnit rhsRefUnit;
            rhsRefUnit = that.getRefUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refUnit", lhsRefUnit), LocatorUtils.property(thatLocator, "refUnit", rhsRefUnit), lhsRefUnit, rhsRefUnit)) {
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
            UnitConverter lhsUnitConv;
            lhsUnitConv = this.getUnitConv();
            UnitConverter rhsUnitConv;
            rhsUnitConv = that.getUnitConv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitConv", lhsUnitConv), LocatorUtils.property(thatLocator, "unitConv", rhsUnitConv), lhsUnitConv, rhsUnitConv)) {
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
            String theAbbrev;
            theAbbrev = this.getAbbrev();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abbrev", theAbbrev), currentHashCode, theAbbrev);
        }
        {
            long theCode;
            theCode = (true?this.getCode(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
        }
        {
            long theDbId;
            theDbId = (true?this.getDbId(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dbId", theDbId), currentHashCode, theDbId);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            RefUnit theRefUnit;
            theRefUnit = this.getRefUnit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refUnit", theRefUnit), currentHashCode, theRefUnit);
        }
        {
            Site theSite;
            theSite = this.getSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "site", theSite), currentHashCode, theSite);
        }
        {
            UnitConverter theUnitConv;
            theUnitConv = this.getUnitConv();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitConv", theUnitConv), currentHashCode, theUnitConv);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
