
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
 * <p>Java class for ItemRecommendation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemRecommendation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="by" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMAgent" minOccurs="0"/>
 *         &lt;element name="item_id" type="{http://www.mimosa.org/OSACBMV3.3.1}ItemId"/>
 *         &lt;element name="itemRecommendationRemark" type="{http://www.mimosa.org/OSACBMV3.3.1}ItemRecommendationRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="itemRequestForWork" type="{http://www.mimosa.org/OSACBMV3.3.1}ItemRequestForWork" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority_type_code" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="userTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="utc_recommendation" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemRecommendation", propOrder = {
    "by",
    "itemId",
    "itemRecommendationRemark",
    "itemRequestForWork",
    "name",
    "priorityTypeCode",
    "userTag",
    "utcRecommendation"
})
public class ItemRecommendation
    implements Serializable, Equals, HashCode, ToString
{

    protected MIMAgent by;
    @XmlElement(name = "item_id", required = true)
    protected ItemId itemId;
    @XmlElement(nillable = true)
    protected List<ItemRecommendationRemark> itemRecommendationRemark;
    protected ItemRequestForWork itemRequestForWork;
    protected String name;
    @XmlElement(name = "priority_type_code")
    protected MIMKey3 priorityTypeCode;
    protected String userTag;
    @XmlElement(name = "utc_recommendation")
    protected OsacbmTime utcRecommendation;

    /**
     * Gets the value of the by property.
     * 
     * @return
     *     possible object is
     *     {@link MIMAgent }
     *     
     */
    public MIMAgent getBy() {
        return by;
    }

    /**
     * Sets the value of the by property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMAgent }
     *     
     */
    public void setBy(MIMAgent value) {
        this.by = value;
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
     * Gets the value of the itemRecommendationRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemRecommendationRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemRecommendationRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemRecommendationRemark }
     * 
     * 
     */
    public List<ItemRecommendationRemark> getItemRecommendationRemark() {
        if (itemRecommendationRemark == null) {
            itemRecommendationRemark = new ArrayList<ItemRecommendationRemark>();
        }
        return this.itemRecommendationRemark;
    }

    /**
     * Gets the value of the itemRequestForWork property.
     * 
     * @return
     *     possible object is
     *     {@link ItemRequestForWork }
     *     
     */
    public ItemRequestForWork getItemRequestForWork() {
        return itemRequestForWork;
    }

    /**
     * Sets the value of the itemRequestForWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRequestForWork }
     *     
     */
    public void setItemRequestForWork(ItemRequestForWork value) {
        this.itemRequestForWork = value;
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
     * Gets the value of the priorityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getPriorityTypeCode() {
        return priorityTypeCode;
    }

    /**
     * Sets the value of the priorityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setPriorityTypeCode(MIMKey3 value) {
        this.priorityTypeCode = value;
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
     * Gets the value of the utcRecommendation property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getUtcRecommendation() {
        return utcRecommendation;
    }

    /**
     * Sets the value of the utcRecommendation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setUtcRecommendation(OsacbmTime value) {
        this.utcRecommendation = value;
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
            MIMAgent theBy;
            theBy = this.getBy();
            strategy.appendField(locator, this, "by", buffer, theBy);
        }
        {
            ItemId theItemId;
            theItemId = this.getItemId();
            strategy.appendField(locator, this, "itemId", buffer, theItemId);
        }
        {
            List<ItemRecommendationRemark> theItemRecommendationRemark;
            theItemRecommendationRemark = (((this.itemRecommendationRemark!= null)&&(!this.itemRecommendationRemark.isEmpty()))?this.getItemRecommendationRemark():null);
            strategy.appendField(locator, this, "itemRecommendationRemark", buffer, theItemRecommendationRemark);
        }
        {
            ItemRequestForWork theItemRequestForWork;
            theItemRequestForWork = this.getItemRequestForWork();
            strategy.appendField(locator, this, "itemRequestForWork", buffer, theItemRequestForWork);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            MIMKey3 thePriorityTypeCode;
            thePriorityTypeCode = this.getPriorityTypeCode();
            strategy.appendField(locator, this, "priorityTypeCode", buffer, thePriorityTypeCode);
        }
        {
            String theUserTag;
            theUserTag = this.getUserTag();
            strategy.appendField(locator, this, "userTag", buffer, theUserTag);
        }
        {
            OsacbmTime theUtcRecommendation;
            theUtcRecommendation = this.getUtcRecommendation();
            strategy.appendField(locator, this, "utcRecommendation", buffer, theUtcRecommendation);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ItemRecommendation)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ItemRecommendation that = ((ItemRecommendation) object);
        {
            MIMAgent lhsBy;
            lhsBy = this.getBy();
            MIMAgent rhsBy;
            rhsBy = that.getBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "by", lhsBy), LocatorUtils.property(thatLocator, "by", rhsBy), lhsBy, rhsBy)) {
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
            List<ItemRecommendationRemark> lhsItemRecommendationRemark;
            lhsItemRecommendationRemark = (((this.itemRecommendationRemark!= null)&&(!this.itemRecommendationRemark.isEmpty()))?this.getItemRecommendationRemark():null);
            List<ItemRecommendationRemark> rhsItemRecommendationRemark;
            rhsItemRecommendationRemark = (((that.itemRecommendationRemark!= null)&&(!that.itemRecommendationRemark.isEmpty()))?that.getItemRecommendationRemark():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemRecommendationRemark", lhsItemRecommendationRemark), LocatorUtils.property(thatLocator, "itemRecommendationRemark", rhsItemRecommendationRemark), lhsItemRecommendationRemark, rhsItemRecommendationRemark)) {
                return false;
            }
        }
        {
            ItemRequestForWork lhsItemRequestForWork;
            lhsItemRequestForWork = this.getItemRequestForWork();
            ItemRequestForWork rhsItemRequestForWork;
            rhsItemRequestForWork = that.getItemRequestForWork();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemRequestForWork", lhsItemRequestForWork), LocatorUtils.property(thatLocator, "itemRequestForWork", rhsItemRequestForWork), lhsItemRequestForWork, rhsItemRequestForWork)) {
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
            MIMKey3 lhsPriorityTypeCode;
            lhsPriorityTypeCode = this.getPriorityTypeCode();
            MIMKey3 rhsPriorityTypeCode;
            rhsPriorityTypeCode = that.getPriorityTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priorityTypeCode", lhsPriorityTypeCode), LocatorUtils.property(thatLocator, "priorityTypeCode", rhsPriorityTypeCode), lhsPriorityTypeCode, rhsPriorityTypeCode)) {
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
            OsacbmTime lhsUtcRecommendation;
            lhsUtcRecommendation = this.getUtcRecommendation();
            OsacbmTime rhsUtcRecommendation;
            rhsUtcRecommendation = that.getUtcRecommendation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "utcRecommendation", lhsUtcRecommendation), LocatorUtils.property(thatLocator, "utcRecommendation", rhsUtcRecommendation), lhsUtcRecommendation, rhsUtcRecommendation)) {
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
            MIMAgent theBy;
            theBy = this.getBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "by", theBy), currentHashCode, theBy);
        }
        {
            ItemId theItemId;
            theItemId = this.getItemId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemId", theItemId), currentHashCode, theItemId);
        }
        {
            List<ItemRecommendationRemark> theItemRecommendationRemark;
            theItemRecommendationRemark = (((this.itemRecommendationRemark!= null)&&(!this.itemRecommendationRemark.isEmpty()))?this.getItemRecommendationRemark():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemRecommendationRemark", theItemRecommendationRemark), currentHashCode, theItemRecommendationRemark);
        }
        {
            ItemRequestForWork theItemRequestForWork;
            theItemRequestForWork = this.getItemRequestForWork();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemRequestForWork", theItemRequestForWork), currentHashCode, theItemRequestForWork);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            MIMKey3 thePriorityTypeCode;
            thePriorityTypeCode = this.getPriorityTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priorityTypeCode", thePriorityTypeCode), currentHashCode, thePriorityTypeCode);
        }
        {
            String theUserTag;
            theUserTag = this.getUserTag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userTag", theUserTag), currentHashCode, theUserTag);
        }
        {
            OsacbmTime theUtcRecommendation;
            theUtcRecommendation = this.getUtcRecommendation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "utcRecommendation", theUtcRecommendation), currentHashCode, theUtcRecommendation);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}