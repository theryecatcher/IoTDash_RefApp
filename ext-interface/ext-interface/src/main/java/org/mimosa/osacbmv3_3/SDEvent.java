
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
 * <p>Java class for SDEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SDEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}SDDataEvent">
 *       &lt;sequence>
 *         &lt;element name="itemEvents" type="{http://www.mimosa.org/OSACBMV3.3.1}ItemEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SDEvent", propOrder = {
    "itemEvents"
})
public class SDEvent
    extends SDDataEvent
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(nillable = true)
    protected List<ItemEvent> itemEvents;

    /**
     * Gets the value of the itemEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemEvent }
     * 
     * 
     */
    public List<ItemEvent> getItemEvents() {
        if (itemEvents == null) {
            itemEvents = new ArrayList<ItemEvent>();
        }
        return this.itemEvents;
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
            List<ItemEvent> theItemEvents;
            theItemEvents = (((this.itemEvents!= null)&&(!this.itemEvents.isEmpty()))?this.getItemEvents():null);
            strategy.appendField(locator, this, "itemEvents", buffer, theItemEvents);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SDEvent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SDEvent that = ((SDEvent) object);
        {
            List<ItemEvent> lhsItemEvents;
            lhsItemEvents = (((this.itemEvents!= null)&&(!this.itemEvents.isEmpty()))?this.getItemEvents():null);
            List<ItemEvent> rhsItemEvents;
            rhsItemEvents = (((that.itemEvents!= null)&&(!that.itemEvents.isEmpty()))?that.getItemEvents():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemEvents", lhsItemEvents), LocatorUtils.property(thatLocator, "itemEvents", rhsItemEvents), lhsItemEvents, rhsItemEvents)) {
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
            List<ItemEvent> theItemEvents;
            theItemEvents = (((this.itemEvents!= null)&&(!this.itemEvents.isEmpty()))?this.getItemEvents():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemEvents", theItemEvents), currentHashCode, theItemEvents);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
