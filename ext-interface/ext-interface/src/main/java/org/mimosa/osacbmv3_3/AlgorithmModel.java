
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
 * <p>Java class for AlgorithmModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlgorithmModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alg_model_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="algNameForModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comp_model_id" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3"/>
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastUpdate" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlgorithmModel", propOrder = {
    "algModelId",
    "algNameForModel",
    "compModelId",
    "desc",
    "lastUpdate",
    "manufacturer",
    "name",
    "userTag",
    "version"
})
public class AlgorithmModel
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(name = "alg_model_id")
    @XmlSchemaType(name = "unsignedInt")
    protected long algModelId;
    protected String algNameForModel;
    @XmlElement(name = "comp_model_id", required = true)
    protected MIMKey3 compModelId;
    protected String desc;
    protected OsacbmTime lastUpdate;
    @XmlElement(required = true)
    protected MIMKey3 manufacturer;
    protected String name;
    protected String userTag;
    protected String version;

    /**
     * Gets the value of the algModelId property.
     * 
     */
    public long getAlgModelId() {
        return algModelId;
    }

    /**
     * Sets the value of the algModelId property.
     * 
     */
    public void setAlgModelId(long value) {
        this.algModelId = value;
    }

    /**
     * Gets the value of the algNameForModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgNameForModel() {
        return algNameForModel;
    }

    /**
     * Sets the value of the algNameForModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgNameForModel(String value) {
        this.algNameForModel = value;
    }

    /**
     * Gets the value of the compModelId property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getCompModelId() {
        return compModelId;
    }

    /**
     * Sets the value of the compModelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setCompModelId(MIMKey3 value) {
        this.compModelId = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
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
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setManufacturer(MIMKey3 value) {
        this.manufacturer = value;
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

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
            long theAlgModelId;
            theAlgModelId = (true?this.getAlgModelId(): 0L);
            strategy.appendField(locator, this, "algModelId", buffer, theAlgModelId);
        }
        {
            String theAlgNameForModel;
            theAlgNameForModel = this.getAlgNameForModel();
            strategy.appendField(locator, this, "algNameForModel", buffer, theAlgNameForModel);
        }
        {
            MIMKey3 theCompModelId;
            theCompModelId = this.getCompModelId();
            strategy.appendField(locator, this, "compModelId", buffer, theCompModelId);
        }
        {
            String theDesc;
            theDesc = this.getDesc();
            strategy.appendField(locator, this, "desc", buffer, theDesc);
        }
        {
            OsacbmTime theLastUpdate;
            theLastUpdate = this.getLastUpdate();
            strategy.appendField(locator, this, "lastUpdate", buffer, theLastUpdate);
        }
        {
            MIMKey3 theManufacturer;
            theManufacturer = this.getManufacturer();
            strategy.appendField(locator, this, "manufacturer", buffer, theManufacturer);
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
        {
            String theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AlgorithmModel)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AlgorithmModel that = ((AlgorithmModel) object);
        {
            long lhsAlgModelId;
            lhsAlgModelId = (true?this.getAlgModelId(): 0L);
            long rhsAlgModelId;
            rhsAlgModelId = (true?that.getAlgModelId(): 0L);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "algModelId", lhsAlgModelId), LocatorUtils.property(thatLocator, "algModelId", rhsAlgModelId), lhsAlgModelId, rhsAlgModelId)) {
                return false;
            }
        }
        {
            String lhsAlgNameForModel;
            lhsAlgNameForModel = this.getAlgNameForModel();
            String rhsAlgNameForModel;
            rhsAlgNameForModel = that.getAlgNameForModel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "algNameForModel", lhsAlgNameForModel), LocatorUtils.property(thatLocator, "algNameForModel", rhsAlgNameForModel), lhsAlgNameForModel, rhsAlgNameForModel)) {
                return false;
            }
        }
        {
            MIMKey3 lhsCompModelId;
            lhsCompModelId = this.getCompModelId();
            MIMKey3 rhsCompModelId;
            rhsCompModelId = that.getCompModelId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "compModelId", lhsCompModelId), LocatorUtils.property(thatLocator, "compModelId", rhsCompModelId), lhsCompModelId, rhsCompModelId)) {
                return false;
            }
        }
        {
            String lhsDesc;
            lhsDesc = this.getDesc();
            String rhsDesc;
            rhsDesc = that.getDesc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "desc", lhsDesc), LocatorUtils.property(thatLocator, "desc", rhsDesc), lhsDesc, rhsDesc)) {
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
            MIMKey3 lhsManufacturer;
            lhsManufacturer = this.getManufacturer();
            MIMKey3 rhsManufacturer;
            rhsManufacturer = that.getManufacturer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturer", lhsManufacturer), LocatorUtils.property(thatLocator, "manufacturer", rhsManufacturer), lhsManufacturer, rhsManufacturer)) {
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
        {
            String lhsVersion;
            lhsVersion = this.getVersion();
            String rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion)) {
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
            long theAlgModelId;
            theAlgModelId = (true?this.getAlgModelId(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "algModelId", theAlgModelId), currentHashCode, theAlgModelId);
        }
        {
            String theAlgNameForModel;
            theAlgNameForModel = this.getAlgNameForModel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "algNameForModel", theAlgNameForModel), currentHashCode, theAlgNameForModel);
        }
        {
            MIMKey3 theCompModelId;
            theCompModelId = this.getCompModelId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compModelId", theCompModelId), currentHashCode, theCompModelId);
        }
        {
            String theDesc;
            theDesc = this.getDesc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "desc", theDesc), currentHashCode, theDesc);
        }
        {
            OsacbmTime theLastUpdate;
            theLastUpdate = this.getLastUpdate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastUpdate", theLastUpdate), currentHashCode, theLastUpdate);
        }
        {
            MIMKey3 theManufacturer;
            theManufacturer = this.getManufacturer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturer", theManufacturer), currentHashCode, theManufacturer);
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
        {
            String theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
