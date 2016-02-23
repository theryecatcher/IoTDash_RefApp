
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for ItemAlertRegions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemAlertRegions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertRegs" type="{http://www.mimosa.org/OSACBMV3.3.1}AlertRegion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="itemId" type="{http://www.mimosa.org/OSACBMV3.3.1}ItemId"/>
 *         &lt;element name="monitorType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemAlertRegions", propOrder = {
    "alertRegs",
    "itemId",
    "monitorType"
})
public class ItemAlertRegions
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(nillable = true)
    protected List<AlertRegion> alertRegs;
    @XmlElement(required = true)
    protected ItemId itemId;
    protected MIMKey3 monitorType;

    /**
     * Gets the value of the alertRegs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alertRegs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertRegs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertRegion }
     * 
     * 
     */
    public List<AlertRegion> getAlertRegs() {
        if (alertRegs == null) {
            alertRegs = new ArrayList<AlertRegion>();
        }
        return this.alertRegs;
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

    /**
     * Gets the value of the monitorType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getMonitorType() {
        return monitorType;
    }

    /**
     * Sets the value of the monitorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setMonitorType(MIMKey3 value) {
        this.monitorType = value;
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
            List<AlertRegion> theAlertRegs;
            theAlertRegs = (((this.alertRegs!= null)&&(!this.alertRegs.isEmpty()))?this.getAlertRegs():null);
            strategy.appendField(locator, this, "alertRegs", buffer, theAlertRegs);
        }
        {
            ItemId theItemId;
            theItemId = this.getItemId();
            strategy.appendField(locator, this, "itemId", buffer, theItemId);
        }
        {
            MIMKey3 theMonitorType;
            theMonitorType = this.getMonitorType();
            strategy.appendField(locator, this, "monitorType", buffer, theMonitorType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ItemAlertRegions)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ItemAlertRegions that = ((ItemAlertRegions) object);
        {
            List<AlertRegion> lhsAlertRegs;
            lhsAlertRegs = (((this.alertRegs!= null)&&(!this.alertRegs.isEmpty()))?this.getAlertRegs():null);
            List<AlertRegion> rhsAlertRegs;
            rhsAlertRegs = (((that.alertRegs!= null)&&(!that.alertRegs.isEmpty()))?that.getAlertRegs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alertRegs", lhsAlertRegs), LocatorUtils.property(thatLocator, "alertRegs", rhsAlertRegs), lhsAlertRegs, rhsAlertRegs)) {
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
        {
            MIMKey3 lhsMonitorType;
            lhsMonitorType = this.getMonitorType();
            MIMKey3 rhsMonitorType;
            rhsMonitorType = that.getMonitorType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "monitorType", lhsMonitorType), LocatorUtils.property(thatLocator, "monitorType", rhsMonitorType), lhsMonitorType, rhsMonitorType)) {
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
            List<AlertRegion> theAlertRegs;
            theAlertRegs = (((this.alertRegs!= null)&&(!this.alertRegs.isEmpty()))?this.getAlertRegs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alertRegs", theAlertRegs), currentHashCode, theAlertRegs);
        }
        {
            ItemId theItemId;
            theItemId = this.getItemId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemId", theItemId), currentHashCode, theItemId);
        }
        {
            MIMKey3 theMonitorType;
            theMonitorType = this.getMonitorType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "monitorType", theMonitorType), currentHashCode, theMonitorType);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
