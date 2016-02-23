
package com.ge.dsp.pm.ext.entity.strategydetail;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.action.Action;
import com.ge.dsp.pm.ext.entity.sourceinfo.SourceInfo;
import com.ge.dsp.pm.ext.entity.strategydetail.identifier.strategydetailidentifier.StrategyDetailIdentifier;
import com.ge.dsp.pm.ext.entity.util.map.Map;
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
 * 
 * 				StrategyDetail is the behavior that is driven within a
 * 				Strategy
 * 			
 * 
 * <p>Java class for StrategyDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrategyDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strategyDetailIdentifier" type="{http://dsp.ge.com/pm/ext/entity/strategydetail/identifier/strategydetailidentifier}StrategyDetailIdentifier" minOccurs="0"/>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/sourceinfo}sourceInfo" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/action}action" minOccurs="0"/>
 *         &lt;element name="defaultOutboundDataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/util/map}map" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategyDetail", propOrder = {
    "strategyDetailIdentifier",
    "sequence",
    "sourceInfo",
    "action",
    "defaultOutboundDataType",
    "map"
})
public class StrategyDetail
    implements Serializable, Equals, HashCode, ToString
{

    protected StrategyDetailIdentifier strategyDetailIdentifier;
    protected Integer sequence;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/sourceinfo")
    protected SourceInfo sourceInfo;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/action")
    protected Action action;
    protected String defaultOutboundDataType;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/util/map")
    protected Map map;

    /**
     * Gets the value of the strategyDetailIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link StrategyDetailIdentifier }
     *     
     */
    public StrategyDetailIdentifier getStrategyDetailIdentifier() {
        return strategyDetailIdentifier;
    }

    /**
     * Sets the value of the strategyDetailIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategyDetailIdentifier }
     *     
     */
    public void setStrategyDetailIdentifier(StrategyDetailIdentifier value) {
        this.strategyDetailIdentifier = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequence(Integer value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the sourceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SourceInfo }
     *     
     */
    public SourceInfo getSourceInfo() {
        return sourceInfo;
    }

    /**
     * Sets the value of the sourceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceInfo }
     *     
     */
    public void setSourceInfo(SourceInfo value) {
        this.sourceInfo = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setAction(Action value) {
        this.action = value;
    }

    /**
     * Gets the value of the defaultOutboundDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultOutboundDataType() {
        return defaultOutboundDataType;
    }

    /**
     * Sets the value of the defaultOutboundDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultOutboundDataType(String value) {
        this.defaultOutboundDataType = value;
    }

    /**
     * Gets the value of the map property.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getMap() {
        return map;
    }

    /**
     * Sets the value of the map property.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setMap(Map value) {
        this.map = value;
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
            StrategyDetailIdentifier theStrategyDetailIdentifier;
            theStrategyDetailIdentifier = this.getStrategyDetailIdentifier();
            strategy.appendField(locator, this, "strategyDetailIdentifier", buffer, theStrategyDetailIdentifier);
        }
        {
            Integer theSequence;
            theSequence = this.getSequence();
            strategy.appendField(locator, this, "sequence", buffer, theSequence);
        }
        {
            SourceInfo theSourceInfo;
            theSourceInfo = this.getSourceInfo();
            strategy.appendField(locator, this, "sourceInfo", buffer, theSourceInfo);
        }
        {
            Action theAction;
            theAction = this.getAction();
            strategy.appendField(locator, this, "action", buffer, theAction);
        }
        {
            String theDefaultOutboundDataType;
            theDefaultOutboundDataType = this.getDefaultOutboundDataType();
            strategy.appendField(locator, this, "defaultOutboundDataType", buffer, theDefaultOutboundDataType);
        }
        {
            Map theMap;
            theMap = this.getMap();
            strategy.appendField(locator, this, "map", buffer, theMap);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof StrategyDetail)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final StrategyDetail that = ((StrategyDetail) object);
        {
            StrategyDetailIdentifier lhsStrategyDetailIdentifier;
            lhsStrategyDetailIdentifier = this.getStrategyDetailIdentifier();
            StrategyDetailIdentifier rhsStrategyDetailIdentifier;
            rhsStrategyDetailIdentifier = that.getStrategyDetailIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strategyDetailIdentifier", lhsStrategyDetailIdentifier), LocatorUtils.property(thatLocator, "strategyDetailIdentifier", rhsStrategyDetailIdentifier), lhsStrategyDetailIdentifier, rhsStrategyDetailIdentifier)) {
                return false;
            }
        }
        {
            Integer lhsSequence;
            lhsSequence = this.getSequence();
            Integer rhsSequence;
            rhsSequence = that.getSequence();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequence", lhsSequence), LocatorUtils.property(thatLocator, "sequence", rhsSequence), lhsSequence, rhsSequence)) {
                return false;
            }
        }
        {
            SourceInfo lhsSourceInfo;
            lhsSourceInfo = this.getSourceInfo();
            SourceInfo rhsSourceInfo;
            rhsSourceInfo = that.getSourceInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceInfo", lhsSourceInfo), LocatorUtils.property(thatLocator, "sourceInfo", rhsSourceInfo), lhsSourceInfo, rhsSourceInfo)) {
                return false;
            }
        }
        {
            Action lhsAction;
            lhsAction = this.getAction();
            Action rhsAction;
            rhsAction = that.getAction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "action", lhsAction), LocatorUtils.property(thatLocator, "action", rhsAction), lhsAction, rhsAction)) {
                return false;
            }
        }
        {
            String lhsDefaultOutboundDataType;
            lhsDefaultOutboundDataType = this.getDefaultOutboundDataType();
            String rhsDefaultOutboundDataType;
            rhsDefaultOutboundDataType = that.getDefaultOutboundDataType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultOutboundDataType", lhsDefaultOutboundDataType), LocatorUtils.property(thatLocator, "defaultOutboundDataType", rhsDefaultOutboundDataType), lhsDefaultOutboundDataType, rhsDefaultOutboundDataType)) {
                return false;
            }
        }
        {
            Map lhsMap;
            lhsMap = this.getMap();
            Map rhsMap;
            rhsMap = that.getMap();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "map", lhsMap), LocatorUtils.property(thatLocator, "map", rhsMap), lhsMap, rhsMap)) {
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
            StrategyDetailIdentifier theStrategyDetailIdentifier;
            theStrategyDetailIdentifier = this.getStrategyDetailIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strategyDetailIdentifier", theStrategyDetailIdentifier), currentHashCode, theStrategyDetailIdentifier);
        }
        {
            Integer theSequence;
            theSequence = this.getSequence();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequence", theSequence), currentHashCode, theSequence);
        }
        {
            SourceInfo theSourceInfo;
            theSourceInfo = this.getSourceInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceInfo", theSourceInfo), currentHashCode, theSourceInfo);
        }
        {
            Action theAction;
            theAction = this.getAction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "action", theAction), currentHashCode, theAction);
        }
        {
            String theDefaultOutboundDataType;
            theDefaultOutboundDataType = this.getDefaultOutboundDataType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultOutboundDataType", theDefaultOutboundDataType), currentHashCode, theDefaultOutboundDataType);
        }
        {
            Map theMap;
            theMap = this.getMap();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "map", theMap), currentHashCode, theMap);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
