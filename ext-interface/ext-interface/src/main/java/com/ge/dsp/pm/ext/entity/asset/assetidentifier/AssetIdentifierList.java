
package com.ge.dsp.pm.ext.entity.asset.assetidentifier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for AssetIdentifierList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetIdentifierList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/asset/assetidentifier}assetIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetIdentifierList", propOrder = {
    "assetIdentifier"
})
public class AssetIdentifierList
    implements Serializable, Equals, HashCode, ToString
{

    protected List<AssetIdentifier> assetIdentifier;

    /**
     * Gets the value of the assetIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetIdentifier }
     * 
     * 
     */
    public List<AssetIdentifier> getAssetIdentifier() {
        if (assetIdentifier == null) {
            assetIdentifier = new ArrayList<AssetIdentifier>();
        }
        return this.assetIdentifier;
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
            List<AssetIdentifier> theAssetIdentifier;
            theAssetIdentifier = (((this.assetIdentifier!= null)&&(!this.assetIdentifier.isEmpty()))?this.getAssetIdentifier():null);
            strategy.appendField(locator, this, "assetIdentifier", buffer, theAssetIdentifier);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AssetIdentifierList)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AssetIdentifierList that = ((AssetIdentifierList) object);
        {
            List<AssetIdentifier> lhsAssetIdentifier;
            lhsAssetIdentifier = (((this.assetIdentifier!= null)&&(!this.assetIdentifier.isEmpty()))?this.getAssetIdentifier():null);
            List<AssetIdentifier> rhsAssetIdentifier;
            rhsAssetIdentifier = (((that.assetIdentifier!= null)&&(!that.assetIdentifier.isEmpty()))?that.getAssetIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assetIdentifier", lhsAssetIdentifier), LocatorUtils.property(thatLocator, "assetIdentifier", rhsAssetIdentifier), lhsAssetIdentifier, rhsAssetIdentifier)) {
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
            List<AssetIdentifier> theAssetIdentifier;
            theAssetIdentifier = (((this.assetIdentifier!= null)&&(!this.assetIdentifier.isEmpty()))?this.getAssetIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assetIdentifier", theAssetIdentifier), currentHashCode, theAssetIdentifier);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
