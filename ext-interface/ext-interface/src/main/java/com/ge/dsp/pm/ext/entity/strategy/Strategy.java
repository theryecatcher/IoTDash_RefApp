
package com.ge.dsp.pm.ext.entity.strategy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.strategy.identifier.strategyidentifier.StrategyIdentifier;
import com.ge.dsp.pm.ext.entity.strategydetail.StrategyDetail;
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
 * <p>Java class for Strategy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Strategy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strategyIdentifier" type="{http://dsp.ge.com/pm/ext/entity/strategy/identifier/strategyidentifier}StrategyIdentifier"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/strategy}strategyType" minOccurs="0"/>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="strategyFactory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strategyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="strategyDetail" type="{http://dsp.ge.com/pm/ext/entity/strategydetail}StrategyDetail" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Strategy", propOrder = {
    "strategyIdentifier",
    "strategyType",
    "sequence",
    "strategyFactory",
    "strategyName",
    "strategyDetail",
    "map"
})
public class Strategy
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected StrategyIdentifier strategyIdentifier;
    protected StrategyType strategyType;
    protected Integer sequence;
    protected String strategyFactory;
    @XmlElement(required = true)
    protected String strategyName;
    protected List<StrategyDetail> strategyDetail;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/util/map")
    protected Map map;

    /**
     * Gets the value of the strategyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link StrategyIdentifier }
     *     
     */
    public StrategyIdentifier getStrategyIdentifier() {
        return strategyIdentifier;
    }

    /**
     * Sets the value of the strategyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategyIdentifier }
     *     
     */
    public void setStrategyIdentifier(StrategyIdentifier value) {
        this.strategyIdentifier = value;
    }

    /**
     * Gets the value of the strategyType property.
     * 
     * @return
     *     possible object is
     *     {@link StrategyType }
     *     
     */
    public StrategyType getStrategyType() {
        return strategyType;
    }

    /**
     * Sets the value of the strategyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategyType }
     *     
     */
    public void setStrategyType(StrategyType value) {
        this.strategyType = value;
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
     * Gets the value of the strategyFactory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrategyFactory() {
        return strategyFactory;
    }

    /**
     * Sets the value of the strategyFactory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrategyFactory(String value) {
        this.strategyFactory = value;
    }

    /**
     * Gets the value of the strategyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrategyName() {
        return strategyName;
    }

    /**
     * Sets the value of the strategyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrategyName(String value) {
        this.strategyName = value;
    }

    /**
     * Gets the value of the strategyDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strategyDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrategyDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrategyDetail }
     * 
     * 
     */
    public List<StrategyDetail> getStrategyDetail() {
        if (strategyDetail == null) {
            strategyDetail = new ArrayList<StrategyDetail>();
        }
        return this.strategyDetail;
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
            StrategyIdentifier theStrategyIdentifier;
            theStrategyIdentifier = this.getStrategyIdentifier();
            strategy.appendField(locator, this, "strategyIdentifier", buffer, theStrategyIdentifier);
        }
        {
            StrategyType theStrategyType;
            theStrategyType = this.getStrategyType();
            strategy.appendField(locator, this, "strategyType", buffer, theStrategyType);
        }
        {
            Integer theSequence;
            theSequence = this.getSequence();
            strategy.appendField(locator, this, "sequence", buffer, theSequence);
        }
        {
            String theStrategyFactory;
            theStrategyFactory = this.getStrategyFactory();
            strategy.appendField(locator, this, "strategyFactory", buffer, theStrategyFactory);
        }
        {
            String theStrategyName;
            theStrategyName = this.getStrategyName();
            strategy.appendField(locator, this, "strategyName", buffer, theStrategyName);
        }
        {
            List<StrategyDetail> theStrategyDetail;
            theStrategyDetail = (((this.strategyDetail!= null)&&(!this.strategyDetail.isEmpty()))?this.getStrategyDetail():null);
            strategy.appendField(locator, this, "strategyDetail", buffer, theStrategyDetail);
        }
        {
            Map theMap;
            theMap = this.getMap();
            strategy.appendField(locator, this, "map", buffer, theMap);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Strategy)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Strategy that = ((Strategy) object);
        {
            StrategyIdentifier lhsStrategyIdentifier;
            lhsStrategyIdentifier = this.getStrategyIdentifier();
            StrategyIdentifier rhsStrategyIdentifier;
            rhsStrategyIdentifier = that.getStrategyIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strategyIdentifier", lhsStrategyIdentifier), LocatorUtils.property(thatLocator, "strategyIdentifier", rhsStrategyIdentifier), lhsStrategyIdentifier, rhsStrategyIdentifier)) {
                return false;
            }
        }
        {
            StrategyType lhsStrategyType;
            lhsStrategyType = this.getStrategyType();
            StrategyType rhsStrategyType;
            rhsStrategyType = that.getStrategyType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strategyType", lhsStrategyType), LocatorUtils.property(thatLocator, "strategyType", rhsStrategyType), lhsStrategyType, rhsStrategyType)) {
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
            String lhsStrategyFactory;
            lhsStrategyFactory = this.getStrategyFactory();
            String rhsStrategyFactory;
            rhsStrategyFactory = that.getStrategyFactory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strategyFactory", lhsStrategyFactory), LocatorUtils.property(thatLocator, "strategyFactory", rhsStrategyFactory), lhsStrategyFactory, rhsStrategyFactory)) {
                return false;
            }
        }
        {
            String lhsStrategyName;
            lhsStrategyName = this.getStrategyName();
            String rhsStrategyName;
            rhsStrategyName = that.getStrategyName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strategyName", lhsStrategyName), LocatorUtils.property(thatLocator, "strategyName", rhsStrategyName), lhsStrategyName, rhsStrategyName)) {
                return false;
            }
        }
        {
            List<StrategyDetail> lhsStrategyDetail;
            lhsStrategyDetail = (((this.strategyDetail!= null)&&(!this.strategyDetail.isEmpty()))?this.getStrategyDetail():null);
            List<StrategyDetail> rhsStrategyDetail;
            rhsStrategyDetail = (((that.strategyDetail!= null)&&(!that.strategyDetail.isEmpty()))?that.getStrategyDetail():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strategyDetail", lhsStrategyDetail), LocatorUtils.property(thatLocator, "strategyDetail", rhsStrategyDetail), lhsStrategyDetail, rhsStrategyDetail)) {
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
            StrategyIdentifier theStrategyIdentifier;
            theStrategyIdentifier = this.getStrategyIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strategyIdentifier", theStrategyIdentifier), currentHashCode, theStrategyIdentifier);
        }
        {
            StrategyType theStrategyType;
            theStrategyType = this.getStrategyType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strategyType", theStrategyType), currentHashCode, theStrategyType);
        }
        {
            Integer theSequence;
            theSequence = this.getSequence();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequence", theSequence), currentHashCode, theSequence);
        }
        {
            String theStrategyFactory;
            theStrategyFactory = this.getStrategyFactory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strategyFactory", theStrategyFactory), currentHashCode, theStrategyFactory);
        }
        {
            String theStrategyName;
            theStrategyName = this.getStrategyName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strategyName", theStrategyName), currentHashCode, theStrategyName);
        }
        {
            List<StrategyDetail> theStrategyDetail;
            theStrategyDetail = (((this.strategyDetail!= null)&&(!this.strategyDetail.isEmpty()))?this.getStrategyDetail():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strategyDetail", theStrategyDetail), currentHashCode, theStrategyDetail);
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
