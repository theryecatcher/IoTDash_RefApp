
package com.ge.dsp.pm.ext.entity.strategydetail.identifier.strategydetailidentifier;

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
 * <p>Java class for StrategyDetailIdentifierList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrategyDetailIdentifierList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strategyDetailIdentifier" type="{http://dsp.ge.com/pm/ext/entity/strategydetail/identifier/strategydetailidentifier}StrategyDetailIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategyDetailIdentifierList", propOrder = {
    "strategyDetailIdentifier"
})
public class StrategyDetailIdentifierList
    implements Serializable, Equals, HashCode, ToString
{

    protected List<StrategyDetailIdentifier> strategyDetailIdentifier;

    /**
     * Gets the value of the strategyDetailIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strategyDetailIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrategyDetailIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrategyDetailIdentifier }
     * 
     * 
     */
    public List<StrategyDetailIdentifier> getStrategyDetailIdentifier() {
        if (strategyDetailIdentifier == null) {
            strategyDetailIdentifier = new ArrayList<StrategyDetailIdentifier>();
        }
        return this.strategyDetailIdentifier;
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
            List<StrategyDetailIdentifier> theStrategyDetailIdentifier;
            theStrategyDetailIdentifier = (((this.strategyDetailIdentifier!= null)&&(!this.strategyDetailIdentifier.isEmpty()))?this.getStrategyDetailIdentifier():null);
            strategy.appendField(locator, this, "strategyDetailIdentifier", buffer, theStrategyDetailIdentifier);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof StrategyDetailIdentifierList)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final StrategyDetailIdentifierList that = ((StrategyDetailIdentifierList) object);
        {
            List<StrategyDetailIdentifier> lhsStrategyDetailIdentifier;
            lhsStrategyDetailIdentifier = (((this.strategyDetailIdentifier!= null)&&(!this.strategyDetailIdentifier.isEmpty()))?this.getStrategyDetailIdentifier():null);
            List<StrategyDetailIdentifier> rhsStrategyDetailIdentifier;
            rhsStrategyDetailIdentifier = (((that.strategyDetailIdentifier!= null)&&(!that.strategyDetailIdentifier.isEmpty()))?that.getStrategyDetailIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strategyDetailIdentifier", lhsStrategyDetailIdentifier), LocatorUtils.property(thatLocator, "strategyDetailIdentifier", rhsStrategyDetailIdentifier), lhsStrategyDetailIdentifier, rhsStrategyDetailIdentifier)) {
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
            List<StrategyDetailIdentifier> theStrategyDetailIdentifier;
            theStrategyDetailIdentifier = (((this.strategyDetailIdentifier!= null)&&(!this.strategyDetailIdentifier.isEmpty()))?this.getStrategyDetailIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strategyDetailIdentifier", theStrategyDetailIdentifier), currentHashCode, theStrategyDetailIdentifier);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
