
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for Asset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Asset">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}Item">
 *       &lt;sequence>
 *         &lt;element name="assetInfo" type="{http://www.mimosa.org/OSACBMV3.3.1}AssetInfo" minOccurs="0"/>
 *         &lt;element name="assetType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="serialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asset", propOrder = {
    "assetInfo",
    "assetType",
    "serialNo"
})
public class Asset
    extends Item
    implements Serializable, Equals, HashCode, ToString
{

    protected AssetInfo assetInfo;
    protected MIMKey3 assetType;
    protected String serialNo;

    /**
     * Gets the value of the assetInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AssetInfo }
     *     
     */
    public AssetInfo getAssetInfo() {
        return assetInfo;
    }

    /**
     * Sets the value of the assetInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetInfo }
     *     
     */
    public void setAssetInfo(AssetInfo value) {
        this.assetInfo = value;
    }

    /**
     * Gets the value of the assetType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getAssetType() {
        return assetType;
    }

    /**
     * Sets the value of the assetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setAssetType(MIMKey3 value) {
        this.assetType = value;
    }

    /**
     * Gets the value of the serialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * Sets the value of the serialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNo(String value) {
        this.serialNo = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            AssetInfo theAssetInfo;
            theAssetInfo = this.getAssetInfo();
            strategy.appendField(locator, this, "assetInfo", buffer, theAssetInfo);
        }
        {
            MIMKey3 theAssetType;
            theAssetType = this.getAssetType();
            strategy.appendField(locator, this, "assetType", buffer, theAssetType);
        }
        {
            String theSerialNo;
            theSerialNo = this.getSerialNo();
            strategy.appendField(locator, this, "serialNo", buffer, theSerialNo);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Asset)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Asset that = ((Asset) object);
        {
            AssetInfo lhsAssetInfo;
            lhsAssetInfo = this.getAssetInfo();
            AssetInfo rhsAssetInfo;
            rhsAssetInfo = that.getAssetInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assetInfo", lhsAssetInfo), LocatorUtils.property(thatLocator, "assetInfo", rhsAssetInfo), lhsAssetInfo, rhsAssetInfo)) {
                return false;
            }
        }
        {
            MIMKey3 lhsAssetType;
            lhsAssetType = this.getAssetType();
            MIMKey3 rhsAssetType;
            rhsAssetType = that.getAssetType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assetType", lhsAssetType), LocatorUtils.property(thatLocator, "assetType", rhsAssetType), lhsAssetType, rhsAssetType)) {
                return false;
            }
        }
        {
            String lhsSerialNo;
            lhsSerialNo = this.getSerialNo();
            String rhsSerialNo;
            rhsSerialNo = that.getSerialNo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serialNo", lhsSerialNo), LocatorUtils.property(thatLocator, "serialNo", rhsSerialNo), lhsSerialNo, rhsSerialNo)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            AssetInfo theAssetInfo;
            theAssetInfo = this.getAssetInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assetInfo", theAssetInfo), currentHashCode, theAssetInfo);
        }
        {
            MIMKey3 theAssetType;
            theAssetType = this.getAssetType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assetType", theAssetType), currentHashCode, theAssetType);
        }
        {
            String theSerialNo;
            theSerialNo = this.getSerialNo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serialNo", theSerialNo), currentHashCode, theSerialNo);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
