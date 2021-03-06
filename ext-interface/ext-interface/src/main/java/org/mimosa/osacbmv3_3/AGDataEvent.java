
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
 * <p>Java class for AGDataEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AGDataEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}DataEvent">
 *       &lt;sequence>
 *         &lt;element name="itemRecommendation" type="{http://www.mimosa.org/OSACBMV3.3.1}ItemRecommendation" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGDataEvent", propOrder = {
    "itemRecommendation"
})
public class AGDataEvent
    extends DataEvent
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<ItemRecommendation> itemRecommendation;

    /**
     * Gets the value of the itemRecommendation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemRecommendation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemRecommendation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemRecommendation }
     * 
     * 
     */
    public List<ItemRecommendation> getItemRecommendation() {
        if (itemRecommendation == null) {
            itemRecommendation = new ArrayList<ItemRecommendation>();
        }
        return this.itemRecommendation;
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
            List<ItemRecommendation> theItemRecommendation;
            theItemRecommendation = (((this.itemRecommendation!= null)&&(!this.itemRecommendation.isEmpty()))?this.getItemRecommendation():null);
            strategy.appendField(locator, this, "itemRecommendation", buffer, theItemRecommendation);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AGDataEvent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AGDataEvent that = ((AGDataEvent) object);
        {
            List<ItemRecommendation> lhsItemRecommendation;
            lhsItemRecommendation = (((this.itemRecommendation!= null)&&(!this.itemRecommendation.isEmpty()))?this.getItemRecommendation():null);
            List<ItemRecommendation> rhsItemRecommendation;
            rhsItemRecommendation = (((that.itemRecommendation!= null)&&(!that.itemRecommendation.isEmpty()))?that.getItemRecommendation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemRecommendation", lhsItemRecommendation), LocatorUtils.property(thatLocator, "itemRecommendation", rhsItemRecommendation), lhsItemRecommendation, rhsItemRecommendation)) {
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
            List<ItemRecommendation> theItemRecommendation;
            theItemRecommendation = (((this.itemRecommendation!= null)&&(!this.itemRecommendation.isEmpty()))?this.getItemRecommendation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemRecommendation", theItemRecommendation), currentHashCode, theItemRecommendation);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
