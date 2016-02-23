
package com.ge.dsp.pm.fielddatahandler.entity.putfielddata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.fielddata.FieldData;
import com.ge.dsp.pm.ext.entity.selectionfilter.SelectionFilter;
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
 * <p>Java class for PutFieldDataCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PutFieldDataCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/fielddata}fieldData" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/selectionfilter}selectionFilter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PutFieldDataCriteria", propOrder = {
    "fieldData",
    "selectionFilter"
})
public class PutFieldDataCriteria
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/fielddata")
    protected FieldData fieldData;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/selectionfilter")
    protected SelectionFilter selectionFilter;

    /**
     * Gets the value of the fieldData property.
     * 
     * @return
     *     possible object is
     *     {@link FieldData }
     *     
     */
    public FieldData getFieldData() {
        return fieldData;
    }

    /**
     * Sets the value of the fieldData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldData }
     *     
     */
    public void setFieldData(FieldData value) {
        this.fieldData = value;
    }

    /**
     * Gets the value of the selectionFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionFilter }
     *     
     */
    public SelectionFilter getSelectionFilter() {
        return selectionFilter;
    }

    /**
     * Sets the value of the selectionFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionFilter }
     *     
     */
    public void setSelectionFilter(SelectionFilter value) {
        this.selectionFilter = value;
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
            FieldData theFieldData;
            theFieldData = this.getFieldData();
            strategy.appendField(locator, this, "fieldData", buffer, theFieldData);
        }
        {
            SelectionFilter theSelectionFilter;
            theSelectionFilter = this.getSelectionFilter();
            strategy.appendField(locator, this, "selectionFilter", buffer, theSelectionFilter);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PutFieldDataCriteria)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PutFieldDataCriteria that = ((PutFieldDataCriteria) object);
        {
            FieldData lhsFieldData;
            lhsFieldData = this.getFieldData();
            FieldData rhsFieldData;
            rhsFieldData = that.getFieldData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldData", lhsFieldData), LocatorUtils.property(thatLocator, "fieldData", rhsFieldData), lhsFieldData, rhsFieldData)) {
                return false;
            }
        }
        {
            SelectionFilter lhsSelectionFilter;
            lhsSelectionFilter = this.getSelectionFilter();
            SelectionFilter rhsSelectionFilter;
            rhsSelectionFilter = that.getSelectionFilter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "selectionFilter", lhsSelectionFilter), LocatorUtils.property(thatLocator, "selectionFilter", rhsSelectionFilter), lhsSelectionFilter, rhsSelectionFilter)) {
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
            FieldData theFieldData;
            theFieldData = this.getFieldData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldData", theFieldData), currentHashCode, theFieldData);
        }
        {
            SelectionFilter theSelectionFilter;
            theSelectionFilter = this.getSelectionFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "selectionFilter", theSelectionFilter), currentHashCode, theSelectionFilter);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
