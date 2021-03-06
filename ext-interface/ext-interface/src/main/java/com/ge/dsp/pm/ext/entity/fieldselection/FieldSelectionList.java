
package com.ge.dsp.pm.ext.entity.fieldselection;

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
 * 
 * 				FIXME - This field may be deprecated- we need to verify
 * 				that it isn't being used an remove it
 * 			
 * 
 * <p>Java class for FieldSelectionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldSelectionList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/fieldselection}fieldSelection" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldSelectionList", propOrder = {
    "fieldSelection"
})
public class FieldSelectionList
    implements Serializable, Equals, HashCode, ToString
{

    protected List<FieldSelection> fieldSelection;

    /**
     * Gets the value of the fieldSelection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldSelection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldSelection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldSelection }
     * 
     * 
     */
    public List<FieldSelection> getFieldSelection() {
        if (fieldSelection == null) {
            fieldSelection = new ArrayList<FieldSelection>();
        }
        return this.fieldSelection;
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
            List<FieldSelection> theFieldSelection;
            theFieldSelection = (((this.fieldSelection!= null)&&(!this.fieldSelection.isEmpty()))?this.getFieldSelection():null);
            strategy.appendField(locator, this, "fieldSelection", buffer, theFieldSelection);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FieldSelectionList)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FieldSelectionList that = ((FieldSelectionList) object);
        {
            List<FieldSelection> lhsFieldSelection;
            lhsFieldSelection = (((this.fieldSelection!= null)&&(!this.fieldSelection.isEmpty()))?this.getFieldSelection():null);
            List<FieldSelection> rhsFieldSelection;
            rhsFieldSelection = (((that.fieldSelection!= null)&&(!that.fieldSelection.isEmpty()))?that.getFieldSelection():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldSelection", lhsFieldSelection), LocatorUtils.property(thatLocator, "fieldSelection", rhsFieldSelection), lhsFieldSelection, rhsFieldSelection)) {
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
            List<FieldSelection> theFieldSelection;
            theFieldSelection = (((this.fieldSelection!= null)&&(!this.fieldSelection.isEmpty()))?this.getFieldSelection():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldSelection", theFieldSelection), currentHashCode, theFieldSelection);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
