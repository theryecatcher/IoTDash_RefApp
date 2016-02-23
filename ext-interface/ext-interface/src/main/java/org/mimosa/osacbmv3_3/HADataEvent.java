
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
 * <p>Java class for HADataEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HADataEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}DataEvent">
 *       &lt;sequence>
 *         &lt;element name="diagnosis" type="{http://www.mimosa.org/OSACBMV3.3.1}AmbiguityGroup" minOccurs="0"/>
 *         &lt;element name="healthGood" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="itemHealth" type="{http://www.mimosa.org/OSACBMV3.3.1}ItemHealth" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HADataEvent", propOrder = {
    "diagnosis",
    "healthGood",
    "itemHealth"
})
public class HADataEvent
    extends DataEvent
    implements Serializable, Equals, HashCode, ToString
{

    protected AmbiguityGroup diagnosis;
    protected Boolean healthGood;
    @XmlElement(nillable = true)
    protected List<ItemHealth> itemHealth;

    /**
     * Gets the value of the diagnosis property.
     * 
     * @return
     *     possible object is
     *     {@link AmbiguityGroup }
     *     
     */
    public AmbiguityGroup getDiagnosis() {
        return diagnosis;
    }

    /**
     * Sets the value of the diagnosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmbiguityGroup }
     *     
     */
    public void setDiagnosis(AmbiguityGroup value) {
        this.diagnosis = value;
    }

    /**
     * Gets the value of the healthGood property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHealthGood() {
        return healthGood;
    }

    /**
     * Sets the value of the healthGood property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHealthGood(Boolean value) {
        this.healthGood = value;
    }

    /**
     * Gets the value of the itemHealth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemHealth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemHealth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemHealth }
     * 
     * 
     */
    public List<ItemHealth> getItemHealth() {
        if (itemHealth == null) {
            itemHealth = new ArrayList<ItemHealth>();
        }
        return this.itemHealth;
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
            AmbiguityGroup theDiagnosis;
            theDiagnosis = this.getDiagnosis();
            strategy.appendField(locator, this, "diagnosis", buffer, theDiagnosis);
        }
        {
            Boolean theHealthGood;
            theHealthGood = this.isHealthGood();
            strategy.appendField(locator, this, "healthGood", buffer, theHealthGood);
        }
        {
            List<ItemHealth> theItemHealth;
            theItemHealth = (((this.itemHealth!= null)&&(!this.itemHealth.isEmpty()))?this.getItemHealth():null);
            strategy.appendField(locator, this, "itemHealth", buffer, theItemHealth);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof HADataEvent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final HADataEvent that = ((HADataEvent) object);
        {
            AmbiguityGroup lhsDiagnosis;
            lhsDiagnosis = this.getDiagnosis();
            AmbiguityGroup rhsDiagnosis;
            rhsDiagnosis = that.getDiagnosis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "diagnosis", lhsDiagnosis), LocatorUtils.property(thatLocator, "diagnosis", rhsDiagnosis), lhsDiagnosis, rhsDiagnosis)) {
                return false;
            }
        }
        {
            Boolean lhsHealthGood;
            lhsHealthGood = this.isHealthGood();
            Boolean rhsHealthGood;
            rhsHealthGood = that.isHealthGood();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "healthGood", lhsHealthGood), LocatorUtils.property(thatLocator, "healthGood", rhsHealthGood), lhsHealthGood, rhsHealthGood)) {
                return false;
            }
        }
        {
            List<ItemHealth> lhsItemHealth;
            lhsItemHealth = (((this.itemHealth!= null)&&(!this.itemHealth.isEmpty()))?this.getItemHealth():null);
            List<ItemHealth> rhsItemHealth;
            rhsItemHealth = (((that.itemHealth!= null)&&(!that.itemHealth.isEmpty()))?that.getItemHealth():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemHealth", lhsItemHealth), LocatorUtils.property(thatLocator, "itemHealth", rhsItemHealth), lhsItemHealth, rhsItemHealth)) {
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
            AmbiguityGroup theDiagnosis;
            theDiagnosis = this.getDiagnosis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "diagnosis", theDiagnosis), currentHashCode, theDiagnosis);
        }
        {
            Boolean theHealthGood;
            theHealthGood = this.isHealthGood();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "healthGood", theHealthGood), currentHashCode, theHealthGood);
        }
        {
            List<ItemHealth> theItemHealth;
            theItemHealth = (((this.itemHealth!= null)&&(!this.itemHealth.isEmpty()))?this.getItemHealth():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemHealth", theItemHealth), currentHashCode, theItemHealth);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
