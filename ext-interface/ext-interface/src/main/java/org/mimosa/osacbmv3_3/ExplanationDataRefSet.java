
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
 * <p>Java class for ExplanationDataRefSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExplanationDataRefSet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}Explanation">
 *       &lt;sequence>
 *         &lt;element name="explDataRefs" type="{http://www.mimosa.org/OSACBMV3.3.1}ExplanationDataRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExplanationDataRefSet", propOrder = {
    "explDataRefs"
})
public class ExplanationDataRefSet
    extends Explanation
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(nillable = true)
    protected List<ExplanationDataRef> explDataRefs;

    /**
     * Gets the value of the explDataRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the explDataRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExplDataRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExplanationDataRef }
     * 
     * 
     */
    public List<ExplanationDataRef> getExplDataRefs() {
        if (explDataRefs == null) {
            explDataRefs = new ArrayList<ExplanationDataRef>();
        }
        return this.explDataRefs;
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
            List<ExplanationDataRef> theExplDataRefs;
            theExplDataRefs = (((this.explDataRefs!= null)&&(!this.explDataRefs.isEmpty()))?this.getExplDataRefs():null);
            strategy.appendField(locator, this, "explDataRefs", buffer, theExplDataRefs);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ExplanationDataRefSet)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ExplanationDataRefSet that = ((ExplanationDataRefSet) object);
        {
            List<ExplanationDataRef> lhsExplDataRefs;
            lhsExplDataRefs = (((this.explDataRefs!= null)&&(!this.explDataRefs.isEmpty()))?this.getExplDataRefs():null);
            List<ExplanationDataRef> rhsExplDataRefs;
            rhsExplDataRefs = (((that.explDataRefs!= null)&&(!that.explDataRefs.isEmpty()))?that.getExplDataRefs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "explDataRefs", lhsExplDataRefs), LocatorUtils.property(thatLocator, "explDataRefs", rhsExplDataRefs), lhsExplDataRefs, rhsExplDataRefs)) {
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
            List<ExplanationDataRef> theExplDataRefs;
            theExplDataRefs = (((this.explDataRefs!= null)&&(!this.explDataRefs.isEmpty()))?this.getExplDataRefs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "explDataRefs", theExplDataRefs), currentHashCode, theExplDataRefs);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
