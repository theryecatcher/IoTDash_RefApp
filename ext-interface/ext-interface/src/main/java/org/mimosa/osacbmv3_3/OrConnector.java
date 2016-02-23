
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
 * <p>Java class for OrConnector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrConnector">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}LogicalConnector">
 *       &lt;sequence>
 *         &lt;element name="disjuncts" type="{http://www.mimosa.org/OSACBMV3.3.1}LogicalConnector" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrConnector", propOrder = {
    "disjuncts"
})
public class OrConnector
    extends LogicalConnector
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<LogicalConnector> disjuncts;

    /**
     * Gets the value of the disjuncts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disjuncts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisjuncts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogicalConnector }
     * 
     * 
     */
    public List<LogicalConnector> getDisjuncts() {
        if (disjuncts == null) {
            disjuncts = new ArrayList<LogicalConnector>();
        }
        return this.disjuncts;
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
            List<LogicalConnector> theDisjuncts;
            theDisjuncts = (((this.disjuncts!= null)&&(!this.disjuncts.isEmpty()))?this.getDisjuncts():null);
            strategy.appendField(locator, this, "disjuncts", buffer, theDisjuncts);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OrConnector)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final OrConnector that = ((OrConnector) object);
        {
            List<LogicalConnector> lhsDisjuncts;
            lhsDisjuncts = (((this.disjuncts!= null)&&(!this.disjuncts.isEmpty()))?this.getDisjuncts():null);
            List<LogicalConnector> rhsDisjuncts;
            rhsDisjuncts = (((that.disjuncts!= null)&&(!that.disjuncts.isEmpty()))?that.getDisjuncts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "disjuncts", lhsDisjuncts), LocatorUtils.property(thatLocator, "disjuncts", rhsDisjuncts), lhsDisjuncts, rhsDisjuncts)) {
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
            List<LogicalConnector> theDisjuncts;
            theDisjuncts = (((this.disjuncts!= null)&&(!this.disjuncts.isEmpty()))?this.getDisjuncts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "disjuncts", theDisjuncts), currentHashCode, theDisjuncts);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
