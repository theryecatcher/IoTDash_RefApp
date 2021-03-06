//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.07 at 07:40:43 PM IST 
//


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
 * <p>Java class for ItemEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventStart" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime"/>
 *         &lt;element name="eventStop" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime" minOccurs="0"/>
 *         &lt;element name="eventType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3"/>
 *         &lt;element name="itemId" type="{http://www.mimosa.org/OSACBMV3.3.1}ItemId"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemEventChar" type="{http://www.mimosa.org/OSACBMV3.3.1}ItemEventChar" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="itemEventNumInt" type="{http://www.mimosa.org/OSACBMV3.3.1}ItemEventNumInt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="itemEventNumReal" type="{http://www.mimosa.org/OSACBMV3.3.1}ItemEventNumReal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="itemEventBLOB" type="{http://www.mimosa.org/OSACBMV3.3.1}ItemEventBLOB" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemEvent", propOrder = {
    "eventStart",
    "eventStop",
    "eventType",
    "itemId",
    "name",
    "userTag",
    "itemEventChar",
    "itemEventNumInt",
    "itemEventNumReal",
    "itemEventBLOB"
})
public class ItemEvent
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected OsacbmTime eventStart;
    protected OsacbmTime eventStop;
    @XmlElement(required = true)
    protected MIMKey3 eventType;
    @XmlElement(required = true)
    protected ItemId itemId;
    protected String name;
    protected String userTag;
    @XmlElement(nillable = true)
    protected List<ItemEventChar> itemEventChar;
    @XmlElement(nillable = true)
    protected List<ItemEventNumInt> itemEventNumInt;
    @XmlElement(nillable = true)
    protected List<ItemEventNumReal> itemEventNumReal;
    @XmlElement(nillable = true)
    protected List<ItemEventBLOB> itemEventBLOB;

    /**
     * Gets the value of the eventStart property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getEventStart() {
        return eventStart;
    }

    /**
     * Sets the value of the eventStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setEventStart(OsacbmTime value) {
        this.eventStart = value;
    }

    /**
     * Gets the value of the eventStop property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getEventStop() {
        return eventStop;
    }

    /**
     * Sets the value of the eventStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setEventStop(OsacbmTime value) {
        this.eventStop = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setEventType(MIMKey3 value) {
        this.eventType = value;
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
     * Gets the value of the itemEventChar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemEventChar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemEventChar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemEventChar }
     * 
     * 
     */
    public List<ItemEventChar> getItemEventChar() {
        if (itemEventChar == null) {
            itemEventChar = new ArrayList<ItemEventChar>();
        }
        return this.itemEventChar;
    }

    /**
     * Gets the value of the itemEventNumInt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemEventNumInt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemEventNumInt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemEventNumInt }
     * 
     * 
     */
    public List<ItemEventNumInt> getItemEventNumInt() {
        if (itemEventNumInt == null) {
            itemEventNumInt = new ArrayList<ItemEventNumInt>();
        }
        return this.itemEventNumInt;
    }

    /**
     * Gets the value of the itemEventNumReal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemEventNumReal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemEventNumReal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemEventNumReal }
     * 
     * 
     */
    public List<ItemEventNumReal> getItemEventNumReal() {
        if (itemEventNumReal == null) {
            itemEventNumReal = new ArrayList<ItemEventNumReal>();
        }
        return this.itemEventNumReal;
    }

    /**
     * Gets the value of the itemEventBLOB property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemEventBLOB property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemEventBLOB().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemEventBLOB }
     * 
     * 
     */
    public List<ItemEventBLOB> getItemEventBLOB() {
        if (itemEventBLOB == null) {
            itemEventBLOB = new ArrayList<ItemEventBLOB>();
        }
        return this.itemEventBLOB;
    }

    /**
     * Sets the value of the itemEventChar property.
     * 
     * @param itemEventChar
     *     allowed object is
     *     {@link ItemEventChar }
     *     
     */
    public void setItemEventChar(List<ItemEventChar> itemEventChar) {
        this.itemEventChar = itemEventChar;
    }

    /**
     * Sets the value of the itemEventNumInt property.
     * 
     * @param itemEventNumInt
     *     allowed object is
     *     {@link ItemEventNumInt }
     *     
     */
    public void setItemEventNumInt(List<ItemEventNumInt> itemEventNumInt) {
        this.itemEventNumInt = itemEventNumInt;
    }

    /**
     * Sets the value of the itemEventNumReal property.
     * 
     * @param itemEventNumReal
     *     allowed object is
     *     {@link ItemEventNumReal }
     *     
     */
    public void setItemEventNumReal(List<ItemEventNumReal> itemEventNumReal) {
        this.itemEventNumReal = itemEventNumReal;
    }

    /**
     * Sets the value of the itemEventBLOB property.
     * 
     * @param itemEventBLOB
     *     allowed object is
     *     {@link ItemEventBLOB }
     *     
     */
    public void setItemEventBLOB(List<ItemEventBLOB> itemEventBLOB) {
        this.itemEventBLOB = itemEventBLOB;
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
            OsacbmTime theEventStart;
            theEventStart = this.getEventStart();
            strategy.appendField(locator, this, "eventStart", buffer, theEventStart);
        }
        {
            OsacbmTime theEventStop;
            theEventStop = this.getEventStop();
            strategy.appendField(locator, this, "eventStop", buffer, theEventStop);
        }
        {
            MIMKey3 theEventType;
            theEventType = this.getEventType();
            strategy.appendField(locator, this, "eventType", buffer, theEventType);
        }
        {
            ItemId theItemId;
            theItemId = this.getItemId();
            strategy.appendField(locator, this, "itemId", buffer, theItemId);
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
            List<ItemEventChar> theItemEventChar;
            theItemEventChar = (((this.itemEventChar!= null)&&(!this.itemEventChar.isEmpty()))?this.getItemEventChar():null);
            strategy.appendField(locator, this, "itemEventChar", buffer, theItemEventChar);
        }
        {
            List<ItemEventNumInt> theItemEventNumInt;
            theItemEventNumInt = (((this.itemEventNumInt!= null)&&(!this.itemEventNumInt.isEmpty()))?this.getItemEventNumInt():null);
            strategy.appendField(locator, this, "itemEventNumInt", buffer, theItemEventNumInt);
        }
        {
            List<ItemEventNumReal> theItemEventNumReal;
            theItemEventNumReal = (((this.itemEventNumReal!= null)&&(!this.itemEventNumReal.isEmpty()))?this.getItemEventNumReal():null);
            strategy.appendField(locator, this, "itemEventNumReal", buffer, theItemEventNumReal);
        }
        {
            List<ItemEventBLOB> theItemEventBLOB;
            theItemEventBLOB = (((this.itemEventBLOB!= null)&&(!this.itemEventBLOB.isEmpty()))?this.getItemEventBLOB():null);
            strategy.appendField(locator, this, "itemEventBLOB", buffer, theItemEventBLOB);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ItemEvent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ItemEvent that = ((ItemEvent) object);
        {
            OsacbmTime lhsEventStart;
            lhsEventStart = this.getEventStart();
            OsacbmTime rhsEventStart;
            rhsEventStart = that.getEventStart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventStart", lhsEventStart), LocatorUtils.property(thatLocator, "eventStart", rhsEventStart), lhsEventStart, rhsEventStart)) {
                return false;
            }
        }
        {
            OsacbmTime lhsEventStop;
            lhsEventStop = this.getEventStop();
            OsacbmTime rhsEventStop;
            rhsEventStop = that.getEventStop();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventStop", lhsEventStop), LocatorUtils.property(thatLocator, "eventStop", rhsEventStop), lhsEventStop, rhsEventStop)) {
                return false;
            }
        }
        {
            MIMKey3 lhsEventType;
            lhsEventType = this.getEventType();
            MIMKey3 rhsEventType;
            rhsEventType = that.getEventType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventType", lhsEventType), LocatorUtils.property(thatLocator, "eventType", rhsEventType), lhsEventType, rhsEventType)) {
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
            List<ItemEventChar> lhsItemEventChar;
            lhsItemEventChar = (((this.itemEventChar!= null)&&(!this.itemEventChar.isEmpty()))?this.getItemEventChar():null);
            List<ItemEventChar> rhsItemEventChar;
            rhsItemEventChar = (((that.itemEventChar!= null)&&(!that.itemEventChar.isEmpty()))?that.getItemEventChar():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemEventChar", lhsItemEventChar), LocatorUtils.property(thatLocator, "itemEventChar", rhsItemEventChar), lhsItemEventChar, rhsItemEventChar)) {
                return false;
            }
        }
        {
            List<ItemEventNumInt> lhsItemEventNumInt;
            lhsItemEventNumInt = (((this.itemEventNumInt!= null)&&(!this.itemEventNumInt.isEmpty()))?this.getItemEventNumInt():null);
            List<ItemEventNumInt> rhsItemEventNumInt;
            rhsItemEventNumInt = (((that.itemEventNumInt!= null)&&(!that.itemEventNumInt.isEmpty()))?that.getItemEventNumInt():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemEventNumInt", lhsItemEventNumInt), LocatorUtils.property(thatLocator, "itemEventNumInt", rhsItemEventNumInt), lhsItemEventNumInt, rhsItemEventNumInt)) {
                return false;
            }
        }
        {
            List<ItemEventNumReal> lhsItemEventNumReal;
            lhsItemEventNumReal = (((this.itemEventNumReal!= null)&&(!this.itemEventNumReal.isEmpty()))?this.getItemEventNumReal():null);
            List<ItemEventNumReal> rhsItemEventNumReal;
            rhsItemEventNumReal = (((that.itemEventNumReal!= null)&&(!that.itemEventNumReal.isEmpty()))?that.getItemEventNumReal():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemEventNumReal", lhsItemEventNumReal), LocatorUtils.property(thatLocator, "itemEventNumReal", rhsItemEventNumReal), lhsItemEventNumReal, rhsItemEventNumReal)) {
                return false;
            }
        }
        {
            List<ItemEventBLOB> lhsItemEventBLOB;
            lhsItemEventBLOB = (((this.itemEventBLOB!= null)&&(!this.itemEventBLOB.isEmpty()))?this.getItemEventBLOB():null);
            List<ItemEventBLOB> rhsItemEventBLOB;
            rhsItemEventBLOB = (((that.itemEventBLOB!= null)&&(!that.itemEventBLOB.isEmpty()))?that.getItemEventBLOB():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemEventBLOB", lhsItemEventBLOB), LocatorUtils.property(thatLocator, "itemEventBLOB", rhsItemEventBLOB), lhsItemEventBLOB, rhsItemEventBLOB)) {
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
            OsacbmTime theEventStart;
            theEventStart = this.getEventStart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventStart", theEventStart), currentHashCode, theEventStart);
        }
        {
            OsacbmTime theEventStop;
            theEventStop = this.getEventStop();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventStop", theEventStop), currentHashCode, theEventStop);
        }
        {
            MIMKey3 theEventType;
            theEventType = this.getEventType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventType", theEventType), currentHashCode, theEventType);
        }
        {
            ItemId theItemId;
            theItemId = this.getItemId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemId", theItemId), currentHashCode, theItemId);
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
            List<ItemEventChar> theItemEventChar;
            theItemEventChar = (((this.itemEventChar!= null)&&(!this.itemEventChar.isEmpty()))?this.getItemEventChar():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemEventChar", theItemEventChar), currentHashCode, theItemEventChar);
        }
        {
            List<ItemEventNumInt> theItemEventNumInt;
            theItemEventNumInt = (((this.itemEventNumInt!= null)&&(!this.itemEventNumInt.isEmpty()))?this.getItemEventNumInt():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemEventNumInt", theItemEventNumInt), currentHashCode, theItemEventNumInt);
        }
        {
            List<ItemEventNumReal> theItemEventNumReal;
            theItemEventNumReal = (((this.itemEventNumReal!= null)&&(!this.itemEventNumReal.isEmpty()))?this.getItemEventNumReal():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemEventNumReal", theItemEventNumReal), currentHashCode, theItemEventNumReal);
        }
        {
            List<ItemEventBLOB> theItemEventBLOB;
            theItemEventBLOB = (((this.itemEventBLOB!= null)&&(!this.itemEventBLOB.isEmpty()))?this.getItemEventBLOB():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemEventBLOB", theItemEventBLOB), currentHashCode, theItemEventBLOB);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
