//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 02:16:43 AM PST 
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
 * <p>Java class for ModuleRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModuleRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chType" type="{http://www.mimosa.org/OSACBMV3.3.1}ChannelType" minOccurs="0"/>
 *         &lt;element name="inportRefs" type="{http://www.mimosa.org/OSACBMV3.3.1}PortRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="modId" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModuleRef", propOrder = {
    "chType",
    "inportRefs",
    "modId"
})
public class ModuleRef
    implements Serializable, Equals, HashCode, ToString
{

    protected ChannelType chType;
    @XmlElement(nillable = true)
    protected List<PortRef> inportRefs;
    @XmlElement(required = true)
    protected MIMKey2 modId;

    /**
     * Gets the value of the chType property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelType }
     *     
     */
    public ChannelType getChType() {
        return chType;
    }

    /**
     * Sets the value of the chType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelType }
     *     
     */
    public void setChType(ChannelType value) {
        this.chType = value;
    }

    /**
     * Gets the value of the inportRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inportRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInportRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortRef }
     * 
     * 
     */
    public List<PortRef> getInportRefs() {
        if (inportRefs == null) {
            inportRefs = new ArrayList<PortRef>();
        }
        return this.inportRefs;
    }

    /**
     * Gets the value of the modId property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey2 }
     *     
     */
    public MIMKey2 getModId() {
        return modId;
    }

    /**
     * Sets the value of the modId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey2 }
     *     
     */
    public void setModId(MIMKey2 value) {
        this.modId = value;
    }

    /**
     * Sets the value of the inportRefs property.
     * 
     * @param inportRefs
     *     allowed object is
     *     {@link PortRef }
     *     
     */
    public void setInportRefs(List<PortRef> inportRefs) {
        this.inportRefs = inportRefs;
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
            ChannelType theChType;
            theChType = this.getChType();
            strategy.appendField(locator, this, "chType", buffer, theChType);
        }
        {
            List<PortRef> theInportRefs;
            theInportRefs = (((this.inportRefs!= null)&&(!this.inportRefs.isEmpty()))?this.getInportRefs():null);
            strategy.appendField(locator, this, "inportRefs", buffer, theInportRefs);
        }
        {
            MIMKey2 theModId;
            theModId = this.getModId();
            strategy.appendField(locator, this, "modId", buffer, theModId);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ModuleRef)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ModuleRef that = ((ModuleRef) object);
        {
            ChannelType lhsChType;
            lhsChType = this.getChType();
            ChannelType rhsChType;
            rhsChType = that.getChType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chType", lhsChType), LocatorUtils.property(thatLocator, "chType", rhsChType), lhsChType, rhsChType)) {
                return false;
            }
        }
        {
            List<PortRef> lhsInportRefs;
            lhsInportRefs = (((this.inportRefs!= null)&&(!this.inportRefs.isEmpty()))?this.getInportRefs():null);
            List<PortRef> rhsInportRefs;
            rhsInportRefs = (((that.inportRefs!= null)&&(!that.inportRefs.isEmpty()))?that.getInportRefs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inportRefs", lhsInportRefs), LocatorUtils.property(thatLocator, "inportRefs", rhsInportRefs), lhsInportRefs, rhsInportRefs)) {
                return false;
            }
        }
        {
            MIMKey2 lhsModId;
            lhsModId = this.getModId();
            MIMKey2 rhsModId;
            rhsModId = that.getModId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modId", lhsModId), LocatorUtils.property(thatLocator, "modId", rhsModId), lhsModId, rhsModId)) {
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
            ChannelType theChType;
            theChType = this.getChType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chType", theChType), currentHashCode, theChType);
        }
        {
            List<PortRef> theInportRefs;
            theInportRefs = (((this.inportRefs!= null)&&(!this.inportRefs.isEmpty()))?this.getInportRefs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inportRefs", theInportRefs), currentHashCode, theInportRefs);
        }
        {
            MIMKey2 theModId;
            theModId = this.getModId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "modId", theModId), currentHashCode, theModId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
