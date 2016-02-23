
package com.ge.dsp.pm.fielddatahandler.entity.fielddatacriteria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.fieldselection.FieldSelection;
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
 * 
 * 				the criteria for requesting one field from the asset
 * 				data handler
 * 			
 * 
 * <p>Java class for FieldDataCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldDataCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/fieldselection}fieldSelection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/selectionfilter}selectionFilter" minOccurs="0"/>
 *         &lt;element name="resultId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldDataCriteria", propOrder = {
    "fieldSelection",
    "selectionFilter",
    "resultId"
})
public class FieldDataCriteria
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/fieldselection")
    protected List<FieldSelection> fieldSelection;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/selectionfilter")
    protected SelectionFilter selectionFilter;
    protected String resultId;

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

    /**
     * Gets the value of the resultId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultId() {
        return resultId;
    }

    /**
     * Sets the value of the resultId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultId(String value) {
        this.resultId = value;
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
        {
            SelectionFilter theSelectionFilter;
            theSelectionFilter = this.getSelectionFilter();
            strategy.appendField(locator, this, "selectionFilter", buffer, theSelectionFilter);
        }
        {
            String theResultId;
            theResultId = this.getResultId();
            strategy.appendField(locator, this, "resultId", buffer, theResultId);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FieldDataCriteria)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FieldDataCriteria that = ((FieldDataCriteria) object);
        {
            List<FieldSelection> lhsFieldSelection;
            lhsFieldSelection = (((this.fieldSelection!= null)&&(!this.fieldSelection.isEmpty()))?this.getFieldSelection():null);
            List<FieldSelection> rhsFieldSelection;
            rhsFieldSelection = (((that.fieldSelection!= null)&&(!that.fieldSelection.isEmpty()))?that.getFieldSelection():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldSelection", lhsFieldSelection), LocatorUtils.property(thatLocator, "fieldSelection", rhsFieldSelection), lhsFieldSelection, rhsFieldSelection)) {
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
        {
            String lhsResultId;
            lhsResultId = this.getResultId();
            String rhsResultId;
            rhsResultId = that.getResultId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resultId", lhsResultId), LocatorUtils.property(thatLocator, "resultId", rhsResultId), lhsResultId, rhsResultId)) {
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
        {
            SelectionFilter theSelectionFilter;
            theSelectionFilter = this.getSelectionFilter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "selectionFilter", theSelectionFilter), currentHashCode, theSelectionFilter);
        }
        {
            String theResultId;
            theResultId = this.getResultId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resultId", theResultId), currentHashCode, theResultId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
