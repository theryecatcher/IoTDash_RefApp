
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
 * <p>Java class for ItemEventBLOB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemEventBLOB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assocFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blobContentType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3"/>
 *         &lt;element name="blobDataType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3"/>
 *         &lt;element name="image_data" type="{http://www.mimosa.org/OSACBMV3.3.1}BLOB"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ordSeq" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
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
@XmlType(name = "ItemEventBLOB", propOrder = {
    "assocFileName",
    "blobContentType",
    "blobDataType",
    "imageData",
    "name",
    "ordSeq",
    "userTag"
})
public class ItemEventBLOB
    implements Serializable, Equals, HashCode, ToString
{

    protected String assocFileName;
    @XmlElement(required = true)
    protected MIMKey3 blobContentType;
    @XmlElement(required = true)
    protected MIMKey3 blobDataType;
    @XmlElement(name = "image_data", required = true)
    protected BLOB imageData;
    protected String name;
    @XmlSchemaType(name = "unsignedInt")
    protected Long ordSeq;
    protected String userTag;

    /**
     * Gets the value of the assocFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssocFileName() {
        return assocFileName;
    }

    /**
     * Sets the value of the assocFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssocFileName(String value) {
        this.assocFileName = value;
    }

    /**
     * Gets the value of the blobContentType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getBlobContentType() {
        return blobContentType;
    }

    /**
     * Sets the value of the blobContentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setBlobContentType(MIMKey3 value) {
        this.blobContentType = value;
    }

    /**
     * Gets the value of the blobDataType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getBlobDataType() {
        return blobDataType;
    }

    /**
     * Sets the value of the blobDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setBlobDataType(MIMKey3 value) {
        this.blobDataType = value;
    }

    /**
     * Gets the value of the imageData property.
     * 
     * @return
     *     possible object is
     *     {@link BLOB }
     *     
     */
    public BLOB getImageData() {
        return imageData;
    }

    /**
     * Sets the value of the imageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BLOB }
     *     
     */
    public void setImageData(BLOB value) {
        this.imageData = value;
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
     * Gets the value of the ordSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrdSeq() {
        return ordSeq;
    }

    /**
     * Sets the value of the ordSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrdSeq(Long value) {
        this.ordSeq = value;
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
            String theAssocFileName;
            theAssocFileName = this.getAssocFileName();
            strategy.appendField(locator, this, "assocFileName", buffer, theAssocFileName);
        }
        {
            MIMKey3 theBlobContentType;
            theBlobContentType = this.getBlobContentType();
            strategy.appendField(locator, this, "blobContentType", buffer, theBlobContentType);
        }
        {
            MIMKey3 theBlobDataType;
            theBlobDataType = this.getBlobDataType();
            strategy.appendField(locator, this, "blobDataType", buffer, theBlobDataType);
        }
        {
            BLOB theImageData;
            theImageData = this.getImageData();
            strategy.appendField(locator, this, "imageData", buffer, theImageData);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            Long theOrdSeq;
            theOrdSeq = this.getOrdSeq();
            strategy.appendField(locator, this, "ordSeq", buffer, theOrdSeq);
        }
        {
            String theUserTag;
            theUserTag = this.getUserTag();
            strategy.appendField(locator, this, "userTag", buffer, theUserTag);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ItemEventBLOB)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ItemEventBLOB that = ((ItemEventBLOB) object);
        {
            String lhsAssocFileName;
            lhsAssocFileName = this.getAssocFileName();
            String rhsAssocFileName;
            rhsAssocFileName = that.getAssocFileName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assocFileName", lhsAssocFileName), LocatorUtils.property(thatLocator, "assocFileName", rhsAssocFileName), lhsAssocFileName, rhsAssocFileName)) {
                return false;
            }
        }
        {
            MIMKey3 lhsBlobContentType;
            lhsBlobContentType = this.getBlobContentType();
            MIMKey3 rhsBlobContentType;
            rhsBlobContentType = that.getBlobContentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "blobContentType", lhsBlobContentType), LocatorUtils.property(thatLocator, "blobContentType", rhsBlobContentType), lhsBlobContentType, rhsBlobContentType)) {
                return false;
            }
        }
        {
            MIMKey3 lhsBlobDataType;
            lhsBlobDataType = this.getBlobDataType();
            MIMKey3 rhsBlobDataType;
            rhsBlobDataType = that.getBlobDataType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "blobDataType", lhsBlobDataType), LocatorUtils.property(thatLocator, "blobDataType", rhsBlobDataType), lhsBlobDataType, rhsBlobDataType)) {
                return false;
            }
        }
        {
            BLOB lhsImageData;
            lhsImageData = this.getImageData();
            BLOB rhsImageData;
            rhsImageData = that.getImageData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "imageData", lhsImageData), LocatorUtils.property(thatLocator, "imageData", rhsImageData), lhsImageData, rhsImageData)) {
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
            Long lhsOrdSeq;
            lhsOrdSeq = this.getOrdSeq();
            Long rhsOrdSeq;
            rhsOrdSeq = that.getOrdSeq();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ordSeq", lhsOrdSeq), LocatorUtils.property(thatLocator, "ordSeq", rhsOrdSeq), lhsOrdSeq, rhsOrdSeq)) {
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
            String theAssocFileName;
            theAssocFileName = this.getAssocFileName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assocFileName", theAssocFileName), currentHashCode, theAssocFileName);
        }
        {
            MIMKey3 theBlobContentType;
            theBlobContentType = this.getBlobContentType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "blobContentType", theBlobContentType), currentHashCode, theBlobContentType);
        }
        {
            MIMKey3 theBlobDataType;
            theBlobDataType = this.getBlobDataType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "blobDataType", theBlobDataType), currentHashCode, theBlobDataType);
        }
        {
            BLOB theImageData;
            theImageData = this.getImageData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "imageData", theImageData), currentHashCode, theImageData);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            Long theOrdSeq;
            theOrdSeq = this.getOrdSeq();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ordSeq", theOrdSeq), currentHashCode, theOrdSeq);
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
