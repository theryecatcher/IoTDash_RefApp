
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
 * <p>Java class for PropEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}LogicalConnector">
 *       &lt;sequence>
 *         &lt;element name="chgPattType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="criticality" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="estEnd" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime" minOccurs="0"/>
 *         &lt;element name="estStart" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime" minOccurs="0"/>
 *         &lt;element name="eventType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3"/>
 *         &lt;element name="funcs" type="{http://www.mimosa.org/OSACBMV3.3.1}Function" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hypEventType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="itemId" type="{http://www.mimosa.org/OSACBMV3.3.1}ItemId"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="severityType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="userTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropEvent", propOrder = {
    "chgPattType",
    "criticality",
    "estEnd",
    "estStart",
    "eventType",
    "funcs",
    "hypEventType",
    "itemId",
    "name",
    "severityType",
    "userTag"
})
public class PropEvent
    extends LogicalConnector
    implements Serializable, Equals, HashCode, ToString
{

    protected MIMKey3 chgPattType;
    protected Integer criticality;
    protected OsacbmTime estEnd;
    protected OsacbmTime estStart;
    @XmlElement(required = true)
    protected MIMKey3 eventType;
    @XmlElement(nillable = true)
    protected List<Function> funcs;
    @XmlElement(nillable = true)
    protected List<MIMKey3> hypEventType;
    @XmlElement(required = true)
    protected ItemId itemId;
    protected String name;
    protected MIMKey3 severityType;
    protected String userTag;

    /**
     * Gets the value of the chgPattType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getChgPattType() {
        return chgPattType;
    }

    /**
     * Sets the value of the chgPattType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setChgPattType(MIMKey3 value) {
        this.chgPattType = value;
    }

    /**
     * Gets the value of the criticality property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCriticality() {
        return criticality;
    }

    /**
     * Sets the value of the criticality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCriticality(Integer value) {
        this.criticality = value;
    }

    /**
     * Gets the value of the estEnd property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getEstEnd() {
        return estEnd;
    }

    /**
     * Sets the value of the estEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setEstEnd(OsacbmTime value) {
        this.estEnd = value;
    }

    /**
     * Gets the value of the estStart property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getEstStart() {
        return estStart;
    }

    /**
     * Sets the value of the estStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setEstStart(OsacbmTime value) {
        this.estStart = value;
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
     * Gets the value of the funcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the funcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFuncs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Function }
     * 
     * 
     */
    public List<Function> getFuncs() {
        if (funcs == null) {
            funcs = new ArrayList<Function>();
        }
        return this.funcs;
    }

    /**
     * Gets the value of the hypEventType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hypEventType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHypEventType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MIMKey3 }
     * 
     * 
     */
    public List<MIMKey3> getHypEventType() {
        if (hypEventType == null) {
            hypEventType = new ArrayList<MIMKey3>();
        }
        return this.hypEventType;
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
     * Gets the value of the severityType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getSeverityType() {
        return severityType;
    }

    /**
     * Sets the value of the severityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setSeverityType(MIMKey3 value) {
        this.severityType = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            MIMKey3 theChgPattType;
            theChgPattType = this.getChgPattType();
            strategy.appendField(locator, this, "chgPattType", buffer, theChgPattType);
        }
        {
            Integer theCriticality;
            theCriticality = this.getCriticality();
            strategy.appendField(locator, this, "criticality", buffer, theCriticality);
        }
        {
            OsacbmTime theEstEnd;
            theEstEnd = this.getEstEnd();
            strategy.appendField(locator, this, "estEnd", buffer, theEstEnd);
        }
        {
            OsacbmTime theEstStart;
            theEstStart = this.getEstStart();
            strategy.appendField(locator, this, "estStart", buffer, theEstStart);
        }
        {
            MIMKey3 theEventType;
            theEventType = this.getEventType();
            strategy.appendField(locator, this, "eventType", buffer, theEventType);
        }
        {
            List<Function> theFuncs;
            theFuncs = (((this.funcs!= null)&&(!this.funcs.isEmpty()))?this.getFuncs():null);
            strategy.appendField(locator, this, "funcs", buffer, theFuncs);
        }
        {
            List<MIMKey3> theHypEventType;
            theHypEventType = (((this.hypEventType!= null)&&(!this.hypEventType.isEmpty()))?this.getHypEventType():null);
            strategy.appendField(locator, this, "hypEventType", buffer, theHypEventType);
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
            MIMKey3 theSeverityType;
            theSeverityType = this.getSeverityType();
            strategy.appendField(locator, this, "severityType", buffer, theSeverityType);
        }
        {
            String theUserTag;
            theUserTag = this.getUserTag();
            strategy.appendField(locator, this, "userTag", buffer, theUserTag);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PropEvent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final PropEvent that = ((PropEvent) object);
        {
            MIMKey3 lhsChgPattType;
            lhsChgPattType = this.getChgPattType();
            MIMKey3 rhsChgPattType;
            rhsChgPattType = that.getChgPattType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chgPattType", lhsChgPattType), LocatorUtils.property(thatLocator, "chgPattType", rhsChgPattType), lhsChgPattType, rhsChgPattType)) {
                return false;
            }
        }
        {
            Integer lhsCriticality;
            lhsCriticality = this.getCriticality();
            Integer rhsCriticality;
            rhsCriticality = that.getCriticality();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "criticality", lhsCriticality), LocatorUtils.property(thatLocator, "criticality", rhsCriticality), lhsCriticality, rhsCriticality)) {
                return false;
            }
        }
        {
            OsacbmTime lhsEstEnd;
            lhsEstEnd = this.getEstEnd();
            OsacbmTime rhsEstEnd;
            rhsEstEnd = that.getEstEnd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estEnd", lhsEstEnd), LocatorUtils.property(thatLocator, "estEnd", rhsEstEnd), lhsEstEnd, rhsEstEnd)) {
                return false;
            }
        }
        {
            OsacbmTime lhsEstStart;
            lhsEstStart = this.getEstStart();
            OsacbmTime rhsEstStart;
            rhsEstStart = that.getEstStart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estStart", lhsEstStart), LocatorUtils.property(thatLocator, "estStart", rhsEstStart), lhsEstStart, rhsEstStart)) {
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
            List<Function> lhsFuncs;
            lhsFuncs = (((this.funcs!= null)&&(!this.funcs.isEmpty()))?this.getFuncs():null);
            List<Function> rhsFuncs;
            rhsFuncs = (((that.funcs!= null)&&(!that.funcs.isEmpty()))?that.getFuncs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "funcs", lhsFuncs), LocatorUtils.property(thatLocator, "funcs", rhsFuncs), lhsFuncs, rhsFuncs)) {
                return false;
            }
        }
        {
            List<MIMKey3> lhsHypEventType;
            lhsHypEventType = (((this.hypEventType!= null)&&(!this.hypEventType.isEmpty()))?this.getHypEventType():null);
            List<MIMKey3> rhsHypEventType;
            rhsHypEventType = (((that.hypEventType!= null)&&(!that.hypEventType.isEmpty()))?that.getHypEventType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hypEventType", lhsHypEventType), LocatorUtils.property(thatLocator, "hypEventType", rhsHypEventType), lhsHypEventType, rhsHypEventType)) {
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
            MIMKey3 lhsSeverityType;
            lhsSeverityType = this.getSeverityType();
            MIMKey3 rhsSeverityType;
            rhsSeverityType = that.getSeverityType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "severityType", lhsSeverityType), LocatorUtils.property(thatLocator, "severityType", rhsSeverityType), lhsSeverityType, rhsSeverityType)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            MIMKey3 theChgPattType;
            theChgPattType = this.getChgPattType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chgPattType", theChgPattType), currentHashCode, theChgPattType);
        }
        {
            Integer theCriticality;
            theCriticality = this.getCriticality();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "criticality", theCriticality), currentHashCode, theCriticality);
        }
        {
            OsacbmTime theEstEnd;
            theEstEnd = this.getEstEnd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estEnd", theEstEnd), currentHashCode, theEstEnd);
        }
        {
            OsacbmTime theEstStart;
            theEstStart = this.getEstStart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estStart", theEstStart), currentHashCode, theEstStart);
        }
        {
            MIMKey3 theEventType;
            theEventType = this.getEventType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventType", theEventType), currentHashCode, theEventType);
        }
        {
            List<Function> theFuncs;
            theFuncs = (((this.funcs!= null)&&(!this.funcs.isEmpty()))?this.getFuncs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "funcs", theFuncs), currentHashCode, theFuncs);
        }
        {
            List<MIMKey3> theHypEventType;
            theHypEventType = (((this.hypEventType!= null)&&(!this.hypEventType.isEmpty()))?this.getHypEventType():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hypEventType", theHypEventType), currentHashCode, theHypEventType);
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
            MIMKey3 theSeverityType;
            theSeverityType = this.getSeverityType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "severityType", theSeverityType), currentHashCode, theSeverityType);
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
