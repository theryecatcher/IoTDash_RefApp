
package com.ge.dsp.pm.ext.entity.action;

import java.io.Serializable;
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
 * A way to qualify a set of items.  For example, a StrategyDetail uses Actions to drive behavior within a Strategy.
 * 
 * The ActionInstruction instructs a Process how to behave.  This is useful when setting up ActionTypes, Behaviors, Conditions and Outcomes.  
 * For example, some Actions are used to create data.  But the Instruction can qualify that Create Behavior.
 * 
 * The ActionType creates a Set.  So within the Set we evaluate Behaviors and Conditions to pick the right outcome.
 * The ActionBehavior and ActionCondition are meant to be used as key/value pairs.  If they match a situation, the ActionOutcome is used.
 * 
 * There are many permutations that are possible, the API is flexible to allow for creativity. 
 * 
 * <p>Java class for Action complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Action">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionBehavior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionOutcome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Action", propOrder = {
    "actionType",
    "actionInstruction",
    "actionBehavior",
    "actionCondition",
    "actionOutcome"
})
public class Action
    implements Serializable, Equals, HashCode, ToString
{

    protected String actionType;
    protected String actionInstruction;
    protected String actionBehavior;
    protected String actionCondition;
    protected String actionOutcome;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionType(String value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the actionInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionInstruction() {
        return actionInstruction;
    }

    /**
     * Sets the value of the actionInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionInstruction(String value) {
        this.actionInstruction = value;
    }

    /**
     * Gets the value of the actionBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionBehavior() {
        return actionBehavior;
    }

    /**
     * Sets the value of the actionBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionBehavior(String value) {
        this.actionBehavior = value;
    }

    /**
     * Gets the value of the actionCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCondition() {
        return actionCondition;
    }

    /**
     * Sets the value of the actionCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCondition(String value) {
        this.actionCondition = value;
    }

    /**
     * Gets the value of the actionOutcome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionOutcome() {
        return actionOutcome;
    }

    /**
     * Sets the value of the actionOutcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionOutcome(String value) {
        this.actionOutcome = value;
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
            String theActionType;
            theActionType = this.getActionType();
            strategy.appendField(locator, this, "actionType", buffer, theActionType);
        }
        {
            String theActionInstruction;
            theActionInstruction = this.getActionInstruction();
            strategy.appendField(locator, this, "actionInstruction", buffer, theActionInstruction);
        }
        {
            String theActionBehavior;
            theActionBehavior = this.getActionBehavior();
            strategy.appendField(locator, this, "actionBehavior", buffer, theActionBehavior);
        }
        {
            String theActionCondition;
            theActionCondition = this.getActionCondition();
            strategy.appendField(locator, this, "actionCondition", buffer, theActionCondition);
        }
        {
            String theActionOutcome;
            theActionOutcome = this.getActionOutcome();
            strategy.appendField(locator, this, "actionOutcome", buffer, theActionOutcome);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Action)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Action that = ((Action) object);
        {
            String lhsActionType;
            lhsActionType = this.getActionType();
            String rhsActionType;
            rhsActionType = that.getActionType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actionType", lhsActionType), LocatorUtils.property(thatLocator, "actionType", rhsActionType), lhsActionType, rhsActionType)) {
                return false;
            }
        }
        {
            String lhsActionInstruction;
            lhsActionInstruction = this.getActionInstruction();
            String rhsActionInstruction;
            rhsActionInstruction = that.getActionInstruction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actionInstruction", lhsActionInstruction), LocatorUtils.property(thatLocator, "actionInstruction", rhsActionInstruction), lhsActionInstruction, rhsActionInstruction)) {
                return false;
            }
        }
        {
            String lhsActionBehavior;
            lhsActionBehavior = this.getActionBehavior();
            String rhsActionBehavior;
            rhsActionBehavior = that.getActionBehavior();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actionBehavior", lhsActionBehavior), LocatorUtils.property(thatLocator, "actionBehavior", rhsActionBehavior), lhsActionBehavior, rhsActionBehavior)) {
                return false;
            }
        }
        {
            String lhsActionCondition;
            lhsActionCondition = this.getActionCondition();
            String rhsActionCondition;
            rhsActionCondition = that.getActionCondition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actionCondition", lhsActionCondition), LocatorUtils.property(thatLocator, "actionCondition", rhsActionCondition), lhsActionCondition, rhsActionCondition)) {
                return false;
            }
        }
        {
            String lhsActionOutcome;
            lhsActionOutcome = this.getActionOutcome();
            String rhsActionOutcome;
            rhsActionOutcome = that.getActionOutcome();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actionOutcome", lhsActionOutcome), LocatorUtils.property(thatLocator, "actionOutcome", rhsActionOutcome), lhsActionOutcome, rhsActionOutcome)) {
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
            String theActionType;
            theActionType = this.getActionType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actionType", theActionType), currentHashCode, theActionType);
        }
        {
            String theActionInstruction;
            theActionInstruction = this.getActionInstruction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actionInstruction", theActionInstruction), currentHashCode, theActionInstruction);
        }
        {
            String theActionBehavior;
            theActionBehavior = this.getActionBehavior();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actionBehavior", theActionBehavior), currentHashCode, theActionBehavior);
        }
        {
            String theActionCondition;
            theActionCondition = this.getActionCondition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actionCondition", theActionCondition), currentHashCode, theActionCondition);
        }
        {
            String theActionOutcome;
            theActionOutcome = this.getActionOutcome();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actionOutcome", theActionOutcome), currentHashCode, theActionOutcome);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
