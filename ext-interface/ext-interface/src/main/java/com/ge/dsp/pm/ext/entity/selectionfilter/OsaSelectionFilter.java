
package com.ge.dsp.pm.ext.entity.selectionfilter;

import java.io.Serializable;
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
 * <p>Java class for OsaSelectionFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OsaSelectionFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dsp.ge.com/pm/ext/entity/selectionfilter}SelectionFilter">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.mimosa.org/OSACBMV3.3.1}SelectionFilter"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OsaSelectionFilter", propOrder = {
    "selectionFilter"
})
public class OsaSelectionFilter
    extends com.ge.dsp.pm.ext.entity.selectionfilter.SelectionFilter
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(name = "SelectionFilter", namespace = "http://www.mimosa.org/OSACBMV3.3.1", required = true, nillable = true)
    protected org.mimosa.osacbmv3_3.SelectionFilter selectionFilter;

    /**
     * Gets the value of the selectionFilter property.
     * 
     * @return
     *     possible object is
     *     {@link org.mimosa.osacbmv3_3.SelectionFilter }
     *     
     */
    public org.mimosa.osacbmv3_3.SelectionFilter getSelectionFilter() {
        return selectionFilter;
    }

    /**
     * Sets the value of the selectionFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.mimosa.osacbmv3_3.SelectionFilter }
     *     
     */
    public void setSelectionFilter(org.mimosa.osacbmv3_3.SelectionFilter value) {
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
        super.appendFields(locator, buffer, strategy);
        {
            org.mimosa.osacbmv3_3.SelectionFilter theSelectionFilter;
            theSelectionFilter = this.getSelectionFilter();
            strategy.appendField(locator, this, "selectionFilter", buffer, theSelectionFilter);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OsaSelectionFilter)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final OsaSelectionFilter that = ((OsaSelectionFilter) object);
        {
            org.mimosa.osacbmv3_3.SelectionFilter lhsSelectionFilter;
            lhsSelectionFilter = this.getSelectionFilter();
            org.mimosa.osacbmv3_3.SelectionFilter rhsSelectionFilter;
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            org.mimosa.osacbmv3_3.SelectionFilter theSelectionFilter;
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
