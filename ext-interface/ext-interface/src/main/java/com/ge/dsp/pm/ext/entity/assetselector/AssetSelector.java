
package com.ge.dsp.pm.ext.entity.assetselector;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.fieldidentifiervalue.FieldIdentifierValue;
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
 * <p>Java class for AssetSelector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetSelector">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/fieldidentifiervalue}fieldIdentifierValue" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetSelector", propOrder = {
    "fieldIdentifierValue"
})
public class AssetSelector
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/fieldidentifiervalue", required = true)
    protected List<FieldIdentifierValue> fieldIdentifierValue;

    /**
     * Gets the value of the fieldIdentifierValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldIdentifierValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldIdentifierValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldIdentifierValue }
     * 
     * 
     */
    public List<FieldIdentifierValue> getFieldIdentifierValue() {
        if (fieldIdentifierValue == null) {
            fieldIdentifierValue = new ArrayList<FieldIdentifierValue>();
        }
        return this.fieldIdentifierValue;
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
            List<FieldIdentifierValue> theFieldIdentifierValue;
            theFieldIdentifierValue = (((this.fieldIdentifierValue!= null)&&(!this.fieldIdentifierValue.isEmpty()))?this.getFieldIdentifierValue():null);
            strategy.appendField(locator, this, "fieldIdentifierValue", buffer, theFieldIdentifierValue);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AssetSelector)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AssetSelector that = ((AssetSelector) object);
        {
            List<FieldIdentifierValue> lhsFieldIdentifierValue;
            lhsFieldIdentifierValue = (((this.fieldIdentifierValue!= null)&&(!this.fieldIdentifierValue.isEmpty()))?this.getFieldIdentifierValue():null);
            List<FieldIdentifierValue> rhsFieldIdentifierValue;
            rhsFieldIdentifierValue = (((that.fieldIdentifierValue!= null)&&(!that.fieldIdentifierValue.isEmpty()))?that.getFieldIdentifierValue():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldIdentifierValue", lhsFieldIdentifierValue), LocatorUtils.property(thatLocator, "fieldIdentifierValue", rhsFieldIdentifierValue), lhsFieldIdentifierValue, rhsFieldIdentifierValue)) {
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
            List<FieldIdentifierValue> theFieldIdentifierValue;
            theFieldIdentifierValue = (((this.fieldIdentifierValue!= null)&&(!this.fieldIdentifierValue.isEmpty()))?this.getFieldIdentifierValue():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldIdentifierValue", theFieldIdentifierValue), currentHashCode, theFieldIdentifierValue);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
