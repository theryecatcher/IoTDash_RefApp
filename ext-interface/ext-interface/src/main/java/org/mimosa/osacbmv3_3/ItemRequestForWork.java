
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
 * <p>Java class for ItemRequestForWork complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemRequestForWork">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auto_approve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="end_after" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime" minOccurs="0"/>
 *         &lt;element name="end_before" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime" minOccurs="0"/>
 *         &lt;element name="interval_eu" type="{http://www.mimosa.org/OSACBMV3.3.1}EngUnit" minOccurs="0"/>
 *         &lt;element name="long_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rec_by" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMAgent" minOccurs="0"/>
 *         &lt;element name="rec_gmt" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime" minOccurs="0"/>
 *         &lt;element name="rec_segment" type="{http://www.mimosa.org/OSACBMV3.3.1}ItemId"/>
 *         &lt;element name="repeat_interval" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="requestId" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="solution_package" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="start_after" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime" minOccurs="0"/>
 *         &lt;element name="start_before" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime" minOccurs="0"/>
 *         &lt;element name="to" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMAgent" minOccurs="0"/>
 *         &lt;element name="work_manage_type" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3"/>
 *         &lt;element name="work_order" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="work_request" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="work_task_type" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemRequestForWork", propOrder = {
    "autoApprove",
    "endAfter",
    "endBefore",
    "intervalEu",
    "longDescription",
    "name",
    "recBy",
    "recGmt",
    "recSegment",
    "repeatInterval",
    "requestId",
    "solutionPackage",
    "startAfter",
    "startBefore",
    "to",
    "workManageType",
    "workOrder",
    "workRequest",
    "workTaskType"
})
public class ItemRequestForWork
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(name = "auto_approve")
    protected String autoApprove;
    @XmlElement(name = "end_after")
    protected OsacbmTime endAfter;
    @XmlElement(name = "end_before")
    protected OsacbmTime endBefore;
    @XmlElement(name = "interval_eu")
    protected EngUnit intervalEu;
    @XmlElement(name = "long_description")
    protected String longDescription;
    protected String name;
    @XmlElement(name = "rec_by")
    protected MIMAgent recBy;
    @XmlElement(name = "rec_gmt")
    protected OsacbmTime recGmt;
    @XmlElement(name = "rec_segment", required = true)
    protected ItemId recSegment;
    @XmlElement(name = "repeat_interval")
    @XmlSchemaType(name = "unsignedInt")
    protected Long repeatInterval;
    protected MIMKey3 requestId;
    @XmlElement(name = "solution_package")
    protected MIMKey3 solutionPackage;
    @XmlElement(name = "start_after")
    protected OsacbmTime startAfter;
    @XmlElement(name = "start_before")
    protected OsacbmTime startBefore;
    protected MIMAgent to;
    @XmlElement(name = "work_manage_type", required = true)
    protected MIMKey3 workManageType;
    @XmlElement(name = "work_order")
    protected MIMKey3 workOrder;
    @XmlElement(name = "work_request")
    protected MIMKey3 workRequest;
    @XmlElement(name = "work_task_type", required = true)
    protected MIMKey3 workTaskType;

    /**
     * Gets the value of the autoApprove property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoApprove() {
        return autoApprove;
    }

    /**
     * Sets the value of the autoApprove property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoApprove(String value) {
        this.autoApprove = value;
    }

    /**
     * Gets the value of the endAfter property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getEndAfter() {
        return endAfter;
    }

    /**
     * Sets the value of the endAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setEndAfter(OsacbmTime value) {
        this.endAfter = value;
    }

    /**
     * Gets the value of the endBefore property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getEndBefore() {
        return endBefore;
    }

    /**
     * Sets the value of the endBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setEndBefore(OsacbmTime value) {
        this.endBefore = value;
    }

    /**
     * Gets the value of the intervalEu property.
     * 
     * @return
     *     possible object is
     *     {@link EngUnit }
     *     
     */
    public EngUnit getIntervalEu() {
        return intervalEu;
    }

    /**
     * Sets the value of the intervalEu property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngUnit }
     *     
     */
    public void setIntervalEu(EngUnit value) {
        this.intervalEu = value;
    }

    /**
     * Gets the value of the longDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Sets the value of the longDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongDescription(String value) {
        this.longDescription = value;
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
     * Gets the value of the recBy property.
     * 
     * @return
     *     possible object is
     *     {@link MIMAgent }
     *     
     */
    public MIMAgent getRecBy() {
        return recBy;
    }

    /**
     * Sets the value of the recBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMAgent }
     *     
     */
    public void setRecBy(MIMAgent value) {
        this.recBy = value;
    }

    /**
     * Gets the value of the recGmt property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getRecGmt() {
        return recGmt;
    }

    /**
     * Sets the value of the recGmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setRecGmt(OsacbmTime value) {
        this.recGmt = value;
    }

    /**
     * Gets the value of the recSegment property.
     * 
     * @return
     *     possible object is
     *     {@link ItemId }
     *     
     */
    public ItemId getRecSegment() {
        return recSegment;
    }

    /**
     * Sets the value of the recSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemId }
     *     
     */
    public void setRecSegment(ItemId value) {
        this.recSegment = value;
    }

    /**
     * Gets the value of the repeatInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRepeatInterval() {
        return repeatInterval;
    }

    /**
     * Sets the value of the repeatInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRepeatInterval(Long value) {
        this.repeatInterval = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setRequestId(MIMKey3 value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the solutionPackage property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getSolutionPackage() {
        return solutionPackage;
    }

    /**
     * Sets the value of the solutionPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setSolutionPackage(MIMKey3 value) {
        this.solutionPackage = value;
    }

    /**
     * Gets the value of the startAfter property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getStartAfter() {
        return startAfter;
    }

    /**
     * Sets the value of the startAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setStartAfter(OsacbmTime value) {
        this.startAfter = value;
    }

    /**
     * Gets the value of the startBefore property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getStartBefore() {
        return startBefore;
    }

    /**
     * Sets the value of the startBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setStartBefore(OsacbmTime value) {
        this.startBefore = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link MIMAgent }
     *     
     */
    public MIMAgent getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMAgent }
     *     
     */
    public void setTo(MIMAgent value) {
        this.to = value;
    }

    /**
     * Gets the value of the workManageType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getWorkManageType() {
        return workManageType;
    }

    /**
     * Sets the value of the workManageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setWorkManageType(MIMKey3 value) {
        this.workManageType = value;
    }

    /**
     * Gets the value of the workOrder property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getWorkOrder() {
        return workOrder;
    }

    /**
     * Sets the value of the workOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setWorkOrder(MIMKey3 value) {
        this.workOrder = value;
    }

    /**
     * Gets the value of the workRequest property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getWorkRequest() {
        return workRequest;
    }

    /**
     * Sets the value of the workRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setWorkRequest(MIMKey3 value) {
        this.workRequest = value;
    }

    /**
     * Gets the value of the workTaskType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getWorkTaskType() {
        return workTaskType;
    }

    /**
     * Sets the value of the workTaskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setWorkTaskType(MIMKey3 value) {
        this.workTaskType = value;
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
            String theAutoApprove;
            theAutoApprove = this.getAutoApprove();
            strategy.appendField(locator, this, "autoApprove", buffer, theAutoApprove);
        }
        {
            OsacbmTime theEndAfter;
            theEndAfter = this.getEndAfter();
            strategy.appendField(locator, this, "endAfter", buffer, theEndAfter);
        }
        {
            OsacbmTime theEndBefore;
            theEndBefore = this.getEndBefore();
            strategy.appendField(locator, this, "endBefore", buffer, theEndBefore);
        }
        {
            EngUnit theIntervalEu;
            theIntervalEu = this.getIntervalEu();
            strategy.appendField(locator, this, "intervalEu", buffer, theIntervalEu);
        }
        {
            String theLongDescription;
            theLongDescription = this.getLongDescription();
            strategy.appendField(locator, this, "longDescription", buffer, theLongDescription);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            MIMAgent theRecBy;
            theRecBy = this.getRecBy();
            strategy.appendField(locator, this, "recBy", buffer, theRecBy);
        }
        {
            OsacbmTime theRecGmt;
            theRecGmt = this.getRecGmt();
            strategy.appendField(locator, this, "recGmt", buffer, theRecGmt);
        }
        {
            ItemId theRecSegment;
            theRecSegment = this.getRecSegment();
            strategy.appendField(locator, this, "recSegment", buffer, theRecSegment);
        }
        {
            Long theRepeatInterval;
            theRepeatInterval = this.getRepeatInterval();
            strategy.appendField(locator, this, "repeatInterval", buffer, theRepeatInterval);
        }
        {
            MIMKey3 theRequestId;
            theRequestId = this.getRequestId();
            strategy.appendField(locator, this, "requestId", buffer, theRequestId);
        }
        {
            MIMKey3 theSolutionPackage;
            theSolutionPackage = this.getSolutionPackage();
            strategy.appendField(locator, this, "solutionPackage", buffer, theSolutionPackage);
        }
        {
            OsacbmTime theStartAfter;
            theStartAfter = this.getStartAfter();
            strategy.appendField(locator, this, "startAfter", buffer, theStartAfter);
        }
        {
            OsacbmTime theStartBefore;
            theStartBefore = this.getStartBefore();
            strategy.appendField(locator, this, "startBefore", buffer, theStartBefore);
        }
        {
            MIMAgent theTo;
            theTo = this.getTo();
            strategy.appendField(locator, this, "to", buffer, theTo);
        }
        {
            MIMKey3 theWorkManageType;
            theWorkManageType = this.getWorkManageType();
            strategy.appendField(locator, this, "workManageType", buffer, theWorkManageType);
        }
        {
            MIMKey3 theWorkOrder;
            theWorkOrder = this.getWorkOrder();
            strategy.appendField(locator, this, "workOrder", buffer, theWorkOrder);
        }
        {
            MIMKey3 theWorkRequest;
            theWorkRequest = this.getWorkRequest();
            strategy.appendField(locator, this, "workRequest", buffer, theWorkRequest);
        }
        {
            MIMKey3 theWorkTaskType;
            theWorkTaskType = this.getWorkTaskType();
            strategy.appendField(locator, this, "workTaskType", buffer, theWorkTaskType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ItemRequestForWork)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ItemRequestForWork that = ((ItemRequestForWork) object);
        {
            String lhsAutoApprove;
            lhsAutoApprove = this.getAutoApprove();
            String rhsAutoApprove;
            rhsAutoApprove = that.getAutoApprove();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "autoApprove", lhsAutoApprove), LocatorUtils.property(thatLocator, "autoApprove", rhsAutoApprove), lhsAutoApprove, rhsAutoApprove)) {
                return false;
            }
        }
        {
            OsacbmTime lhsEndAfter;
            lhsEndAfter = this.getEndAfter();
            OsacbmTime rhsEndAfter;
            rhsEndAfter = that.getEndAfter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endAfter", lhsEndAfter), LocatorUtils.property(thatLocator, "endAfter", rhsEndAfter), lhsEndAfter, rhsEndAfter)) {
                return false;
            }
        }
        {
            OsacbmTime lhsEndBefore;
            lhsEndBefore = this.getEndBefore();
            OsacbmTime rhsEndBefore;
            rhsEndBefore = that.getEndBefore();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endBefore", lhsEndBefore), LocatorUtils.property(thatLocator, "endBefore", rhsEndBefore), lhsEndBefore, rhsEndBefore)) {
                return false;
            }
        }
        {
            EngUnit lhsIntervalEu;
            lhsIntervalEu = this.getIntervalEu();
            EngUnit rhsIntervalEu;
            rhsIntervalEu = that.getIntervalEu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intervalEu", lhsIntervalEu), LocatorUtils.property(thatLocator, "intervalEu", rhsIntervalEu), lhsIntervalEu, rhsIntervalEu)) {
                return false;
            }
        }
        {
            String lhsLongDescription;
            lhsLongDescription = this.getLongDescription();
            String rhsLongDescription;
            rhsLongDescription = that.getLongDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "longDescription", lhsLongDescription), LocatorUtils.property(thatLocator, "longDescription", rhsLongDescription), lhsLongDescription, rhsLongDescription)) {
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
            MIMAgent lhsRecBy;
            lhsRecBy = this.getRecBy();
            MIMAgent rhsRecBy;
            rhsRecBy = that.getRecBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recBy", lhsRecBy), LocatorUtils.property(thatLocator, "recBy", rhsRecBy), lhsRecBy, rhsRecBy)) {
                return false;
            }
        }
        {
            OsacbmTime lhsRecGmt;
            lhsRecGmt = this.getRecGmt();
            OsacbmTime rhsRecGmt;
            rhsRecGmt = that.getRecGmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recGmt", lhsRecGmt), LocatorUtils.property(thatLocator, "recGmt", rhsRecGmt), lhsRecGmt, rhsRecGmt)) {
                return false;
            }
        }
        {
            ItemId lhsRecSegment;
            lhsRecSegment = this.getRecSegment();
            ItemId rhsRecSegment;
            rhsRecSegment = that.getRecSegment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recSegment", lhsRecSegment), LocatorUtils.property(thatLocator, "recSegment", rhsRecSegment), lhsRecSegment, rhsRecSegment)) {
                return false;
            }
        }
        {
            Long lhsRepeatInterval;
            lhsRepeatInterval = this.getRepeatInterval();
            Long rhsRepeatInterval;
            rhsRepeatInterval = that.getRepeatInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "repeatInterval", lhsRepeatInterval), LocatorUtils.property(thatLocator, "repeatInterval", rhsRepeatInterval), lhsRepeatInterval, rhsRepeatInterval)) {
                return false;
            }
        }
        {
            MIMKey3 lhsRequestId;
            lhsRequestId = this.getRequestId();
            MIMKey3 rhsRequestId;
            rhsRequestId = that.getRequestId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestId", lhsRequestId), LocatorUtils.property(thatLocator, "requestId", rhsRequestId), lhsRequestId, rhsRequestId)) {
                return false;
            }
        }
        {
            MIMKey3 lhsSolutionPackage;
            lhsSolutionPackage = this.getSolutionPackage();
            MIMKey3 rhsSolutionPackage;
            rhsSolutionPackage = that.getSolutionPackage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "solutionPackage", lhsSolutionPackage), LocatorUtils.property(thatLocator, "solutionPackage", rhsSolutionPackage), lhsSolutionPackage, rhsSolutionPackage)) {
                return false;
            }
        }
        {
            OsacbmTime lhsStartAfter;
            lhsStartAfter = this.getStartAfter();
            OsacbmTime rhsStartAfter;
            rhsStartAfter = that.getStartAfter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startAfter", lhsStartAfter), LocatorUtils.property(thatLocator, "startAfter", rhsStartAfter), lhsStartAfter, rhsStartAfter)) {
                return false;
            }
        }
        {
            OsacbmTime lhsStartBefore;
            lhsStartBefore = this.getStartBefore();
            OsacbmTime rhsStartBefore;
            rhsStartBefore = that.getStartBefore();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startBefore", lhsStartBefore), LocatorUtils.property(thatLocator, "startBefore", rhsStartBefore), lhsStartBefore, rhsStartBefore)) {
                return false;
            }
        }
        {
            MIMAgent lhsTo;
            lhsTo = this.getTo();
            MIMAgent rhsTo;
            rhsTo = that.getTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "to", lhsTo), LocatorUtils.property(thatLocator, "to", rhsTo), lhsTo, rhsTo)) {
                return false;
            }
        }
        {
            MIMKey3 lhsWorkManageType;
            lhsWorkManageType = this.getWorkManageType();
            MIMKey3 rhsWorkManageType;
            rhsWorkManageType = that.getWorkManageType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workManageType", lhsWorkManageType), LocatorUtils.property(thatLocator, "workManageType", rhsWorkManageType), lhsWorkManageType, rhsWorkManageType)) {
                return false;
            }
        }
        {
            MIMKey3 lhsWorkOrder;
            lhsWorkOrder = this.getWorkOrder();
            MIMKey3 rhsWorkOrder;
            rhsWorkOrder = that.getWorkOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workOrder", lhsWorkOrder), LocatorUtils.property(thatLocator, "workOrder", rhsWorkOrder), lhsWorkOrder, rhsWorkOrder)) {
                return false;
            }
        }
        {
            MIMKey3 lhsWorkRequest;
            lhsWorkRequest = this.getWorkRequest();
            MIMKey3 rhsWorkRequest;
            rhsWorkRequest = that.getWorkRequest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workRequest", lhsWorkRequest), LocatorUtils.property(thatLocator, "workRequest", rhsWorkRequest), lhsWorkRequest, rhsWorkRequest)) {
                return false;
            }
        }
        {
            MIMKey3 lhsWorkTaskType;
            lhsWorkTaskType = this.getWorkTaskType();
            MIMKey3 rhsWorkTaskType;
            rhsWorkTaskType = that.getWorkTaskType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workTaskType", lhsWorkTaskType), LocatorUtils.property(thatLocator, "workTaskType", rhsWorkTaskType), lhsWorkTaskType, rhsWorkTaskType)) {
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
            String theAutoApprove;
            theAutoApprove = this.getAutoApprove();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "autoApprove", theAutoApprove), currentHashCode, theAutoApprove);
        }
        {
            OsacbmTime theEndAfter;
            theEndAfter = this.getEndAfter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endAfter", theEndAfter), currentHashCode, theEndAfter);
        }
        {
            OsacbmTime theEndBefore;
            theEndBefore = this.getEndBefore();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endBefore", theEndBefore), currentHashCode, theEndBefore);
        }
        {
            EngUnit theIntervalEu;
            theIntervalEu = this.getIntervalEu();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intervalEu", theIntervalEu), currentHashCode, theIntervalEu);
        }
        {
            String theLongDescription;
            theLongDescription = this.getLongDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "longDescription", theLongDescription), currentHashCode, theLongDescription);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            MIMAgent theRecBy;
            theRecBy = this.getRecBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recBy", theRecBy), currentHashCode, theRecBy);
        }
        {
            OsacbmTime theRecGmt;
            theRecGmt = this.getRecGmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recGmt", theRecGmt), currentHashCode, theRecGmt);
        }
        {
            ItemId theRecSegment;
            theRecSegment = this.getRecSegment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recSegment", theRecSegment), currentHashCode, theRecSegment);
        }
        {
            Long theRepeatInterval;
            theRepeatInterval = this.getRepeatInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "repeatInterval", theRepeatInterval), currentHashCode, theRepeatInterval);
        }
        {
            MIMKey3 theRequestId;
            theRequestId = this.getRequestId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestId", theRequestId), currentHashCode, theRequestId);
        }
        {
            MIMKey3 theSolutionPackage;
            theSolutionPackage = this.getSolutionPackage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "solutionPackage", theSolutionPackage), currentHashCode, theSolutionPackage);
        }
        {
            OsacbmTime theStartAfter;
            theStartAfter = this.getStartAfter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startAfter", theStartAfter), currentHashCode, theStartAfter);
        }
        {
            OsacbmTime theStartBefore;
            theStartBefore = this.getStartBefore();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startBefore", theStartBefore), currentHashCode, theStartBefore);
        }
        {
            MIMAgent theTo;
            theTo = this.getTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "to", theTo), currentHashCode, theTo);
        }
        {
            MIMKey3 theWorkManageType;
            theWorkManageType = this.getWorkManageType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workManageType", theWorkManageType), currentHashCode, theWorkManageType);
        }
        {
            MIMKey3 theWorkOrder;
            theWorkOrder = this.getWorkOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workOrder", theWorkOrder), currentHashCode, theWorkOrder);
        }
        {
            MIMKey3 theWorkRequest;
            theWorkRequest = this.getWorkRequest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workRequest", theWorkRequest), currentHashCode, theWorkRequest);
        }
        {
            MIMKey3 theWorkTaskType;
            theWorkTaskType = this.getWorkTaskType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workTaskType", theWorkTaskType), currentHashCode, theWorkTaskType);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
