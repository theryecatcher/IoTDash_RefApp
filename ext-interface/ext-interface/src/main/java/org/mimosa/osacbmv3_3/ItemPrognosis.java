
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
 * <p>Java class for ItemPrognosis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemPrognosis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estUTC" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime" minOccurs="0"/>
 *         &lt;element name="item_id" type="{http://www.mimosa.org/OSACBMV3.3.1}ItemId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemPrognosis", propOrder = {
    "estUTC",
    "itemId"
})
@XmlSeeAlso({
    FutureHealth.class,
    RUL.class,
    RULDistrbn.class,
    FutureHlthTrend.class
})
public class ItemPrognosis
    implements Serializable, Equals, HashCode, ToString
{

    protected OsacbmTime estUTC;
    @XmlElement(name = "item_id", required = true)
    protected ItemId itemId;

    /**
     * Gets the value of the estUTC property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getEstUTC() {
        return estUTC;
    }

    /**
     * Sets the value of the estUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setEstUTC(OsacbmTime value) {
        this.estUTC = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemId }
     *     
     */
    public ItemId getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemId }
     *     
     */
    public void setItemId(ItemId value) {
        this.itemId = value;
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
            OsacbmTime theEstUTC;
            theEstUTC = this.getEstUTC();
            strategy.appendField(locator, this, "estUTC", buffer, theEstUTC);
        }
        {
            ItemId theItemId;
            theItemId = this.getItemId();
            strategy.appendField(locator, this, "itemId", buffer, theItemId);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ItemPrognosis)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ItemPrognosis that = ((ItemPrognosis) object);
        {
            OsacbmTime lhsEstUTC;
            lhsEstUTC = this.getEstUTC();
            OsacbmTime rhsEstUTC;
            rhsEstUTC = that.getEstUTC();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estUTC", lhsEstUTC), LocatorUtils.property(thatLocator, "estUTC", rhsEstUTC), lhsEstUTC, rhsEstUTC)) {
                return false;
            }
        }
        {
            ItemId lhsItemId;
            lhsItemId = this.getItemId();
            ItemId rhsItemId;
            rhsItemId = that.getItemId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemId", lhsItemId), LocatorUtils.property(thatLocator, "itemId", rhsItemId), lhsItemId, rhsItemId)) {
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
            OsacbmTime theEstUTC;
            theEstUTC = this.getEstUTC();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estUTC", theEstUTC), currentHashCode, theEstUTC);
        }
        {
            ItemId theItemId;
            theItemId = this.getItemId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemId", theItemId), currentHashCode, theItemId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
