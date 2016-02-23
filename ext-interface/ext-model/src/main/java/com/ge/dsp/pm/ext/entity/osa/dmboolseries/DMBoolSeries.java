//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 02:16:43 AM PST 
//


package com.ge.dsp.pm.ext.entity.osa.dmboolseries;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
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
import org.mimosa.osacbmv3_3.DMDataEvent;


/**
 * 
 * 					xAxisDeltas and Values can be stored as a list of individual double elements (values or
 * 					xAxisDeltas), as a single space-separated list of doubles which saves space when tranporting the xml
 * 					around (valuesList or xAxisDeltasList), or as a base64 string (which represents binary data in an
 * 					ASCII string format).
 * 				
 * 
 * <p>Java class for DMBoolSeries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DMBoolSeries">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}DMDataEvent">
 *       &lt;sequence>
 *         &lt;element name="xAxisStart" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="values" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="valuesList" type="{http://dsp.ge.com/aaas/entity/xmllist}ListOfBoolean" minOccurs="0"/>
 *           &lt;element name="valuesBinary" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="xAxisOffsets" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="xAxisOffsetsList" type="{http://dsp.ge.com/aaas/entity/xmllist}ListOfBoolean" minOccurs="0"/>
 *           &lt;element name="xAxisOffsetsBinary" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="valueQualities" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DMBoolSeries", propOrder = {
    "xAxisStart",
    "values",
    "valuesList",
    "valuesBinary",
    "xAxisOffsets",
    "xAxisOffsetsList",
    "xAxisOffsetsBinary",
    "valueQualities"
})
public class DMBoolSeries
    extends DMDataEvent
    implements Serializable, Equals, HashCode, ToString
{

    protected Double xAxisStart;
    @XmlElement(type = Double.class)
    protected List<Double> values;
    @XmlList
    @XmlElement(type = Boolean.class)
    protected List<Boolean> valuesList;
    protected List<byte[]> valuesBinary;
    @XmlElement(type = Double.class)
    protected List<Double> xAxisOffsets;
    @XmlList
    @XmlElement(type = Boolean.class)
    protected List<Boolean> xAxisOffsetsList;
    protected List<byte[]> xAxisOffsetsBinary;
    @XmlElement(type = Double.class)
    protected List<Double> valueQualities;

    /**
     * Gets the value of the xAxisStart property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXAxisStart() {
        return xAxisStart;
    }

    /**
     * Sets the value of the xAxisStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXAxisStart(Double value) {
        this.xAxisStart = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getValues() {
        if (values == null) {
            values = new ArrayList<Double>();
        }
        return this.values;
    }

    /**
     * Gets the value of the valuesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valuesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValuesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getValuesList() {
        if (valuesList == null) {
            valuesList = new ArrayList<Boolean>();
        }
        return this.valuesList;
    }

    /**
     * Gets the value of the valuesBinary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valuesBinary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValuesBinary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getValuesBinary() {
        if (valuesBinary == null) {
            valuesBinary = new ArrayList<byte[]>();
        }
        return this.valuesBinary;
    }

    /**
     * Gets the value of the xAxisOffsets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xAxisOffsets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXAxisOffsets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getXAxisOffsets() {
        if (xAxisOffsets == null) {
            xAxisOffsets = new ArrayList<Double>();
        }
        return this.xAxisOffsets;
    }

    /**
     * Gets the value of the xAxisOffsetsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xAxisOffsetsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXAxisOffsetsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getXAxisOffsetsList() {
        if (xAxisOffsetsList == null) {
            xAxisOffsetsList = new ArrayList<Boolean>();
        }
        return this.xAxisOffsetsList;
    }

    /**
     * Gets the value of the xAxisOffsetsBinary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xAxisOffsetsBinary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXAxisOffsetsBinary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getXAxisOffsetsBinary() {
        if (xAxisOffsetsBinary == null) {
            xAxisOffsetsBinary = new ArrayList<byte[]>();
        }
        return this.xAxisOffsetsBinary;
    }

    /**
     * Gets the value of the valueQualities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueQualities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueQualities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getValueQualities() {
        if (valueQualities == null) {
            valueQualities = new ArrayList<Double>();
        }
        return this.valueQualities;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param values
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValues(List<Double> values) {
        this.values = values;
    }

    /**
     * Sets the value of the valuesList property.
     * 
     * @param valuesList
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValuesList(List<Boolean> valuesList) {
        this.valuesList = valuesList;
    }

    /**
     * Sets the value of the valuesBinary property.
     * 
     * @param valuesBinary
     *     allowed object is
     *     byte[]
     */
    public void setValuesBinary(List<byte[]> valuesBinary) {
        this.valuesBinary = valuesBinary;
    }

    /**
     * Sets the value of the xAxisOffsets property.
     * 
     * @param xAxisOffsets
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXAxisOffsets(List<Double> xAxisOffsets) {
        this.xAxisOffsets = xAxisOffsets;
    }

    /**
     * Sets the value of the xAxisOffsetsList property.
     * 
     * @param xAxisOffsetsList
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXAxisOffsetsList(List<Boolean> xAxisOffsetsList) {
        this.xAxisOffsetsList = xAxisOffsetsList;
    }

    /**
     * Sets the value of the xAxisOffsetsBinary property.
     * 
     * @param xAxisOffsetsBinary
     *     allowed object is
     *     byte[]
     */
    public void setXAxisOffsetsBinary(List<byte[]> xAxisOffsetsBinary) {
        this.xAxisOffsetsBinary = xAxisOffsetsBinary;
    }

    /**
     * Sets the value of the valueQualities property.
     * 
     * @param valueQualities
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValueQualities(List<Double> valueQualities) {
        this.valueQualities = valueQualities;
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
            Double theXAxisStart;
            theXAxisStart = this.getXAxisStart();
            strategy.appendField(locator, this, "xAxisStart", buffer, theXAxisStart);
        }
        {
            List<Double> theValues;
            theValues = (((this.values!= null)&&(!this.values.isEmpty()))?this.getValues():null);
            strategy.appendField(locator, this, "values", buffer, theValues);
        }
        {
            List<Boolean> theValuesList;
            theValuesList = (((this.valuesList!= null)&&(!this.valuesList.isEmpty()))?this.getValuesList():null);
            strategy.appendField(locator, this, "valuesList", buffer, theValuesList);
        }
        {
            List<byte[]> theValuesBinary;
            theValuesBinary = (((this.valuesBinary!= null)&&(!this.valuesBinary.isEmpty()))?this.getValuesBinary():null);
            strategy.appendField(locator, this, "valuesBinary", buffer, theValuesBinary);
        }
        {
            List<Double> theXAxisOffsets;
            theXAxisOffsets = (((this.xAxisOffsets!= null)&&(!this.xAxisOffsets.isEmpty()))?this.getXAxisOffsets():null);
            strategy.appendField(locator, this, "xAxisOffsets", buffer, theXAxisOffsets);
        }
        {
            List<Boolean> theXAxisOffsetsList;
            theXAxisOffsetsList = (((this.xAxisOffsetsList!= null)&&(!this.xAxisOffsetsList.isEmpty()))?this.getXAxisOffsetsList():null);
            strategy.appendField(locator, this, "xAxisOffsetsList", buffer, theXAxisOffsetsList);
        }
        {
            List<byte[]> theXAxisOffsetsBinary;
            theXAxisOffsetsBinary = (((this.xAxisOffsetsBinary!= null)&&(!this.xAxisOffsetsBinary.isEmpty()))?this.getXAxisOffsetsBinary():null);
            strategy.appendField(locator, this, "xAxisOffsetsBinary", buffer, theXAxisOffsetsBinary);
        }
        {
            List<Double> theValueQualities;
            theValueQualities = (((this.valueQualities!= null)&&(!this.valueQualities.isEmpty()))?this.getValueQualities():null);
            strategy.appendField(locator, this, "valueQualities", buffer, theValueQualities);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DMBoolSeries)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DMBoolSeries that = ((DMBoolSeries) object);
        {
            Double lhsXAxisStart;
            lhsXAxisStart = this.getXAxisStart();
            Double rhsXAxisStart;
            rhsXAxisStart = that.getXAxisStart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xAxisStart", lhsXAxisStart), LocatorUtils.property(thatLocator, "xAxisStart", rhsXAxisStart), lhsXAxisStart, rhsXAxisStart)) {
                return false;
            }
        }
        {
            List<Double> lhsValues;
            lhsValues = (((this.values!= null)&&(!this.values.isEmpty()))?this.getValues():null);
            List<Double> rhsValues;
            rhsValues = (((that.values!= null)&&(!that.values.isEmpty()))?that.getValues():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "values", lhsValues), LocatorUtils.property(thatLocator, "values", rhsValues), lhsValues, rhsValues)) {
                return false;
            }
        }
        {
            List<Boolean> lhsValuesList;
            lhsValuesList = (((this.valuesList!= null)&&(!this.valuesList.isEmpty()))?this.getValuesList():null);
            List<Boolean> rhsValuesList;
            rhsValuesList = (((that.valuesList!= null)&&(!that.valuesList.isEmpty()))?that.getValuesList():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valuesList", lhsValuesList), LocatorUtils.property(thatLocator, "valuesList", rhsValuesList), lhsValuesList, rhsValuesList)) {
                return false;
            }
        }
        {
            List<byte[]> lhsValuesBinary;
            lhsValuesBinary = (((this.valuesBinary!= null)&&(!this.valuesBinary.isEmpty()))?this.getValuesBinary():null);
            List<byte[]> rhsValuesBinary;
            rhsValuesBinary = (((that.valuesBinary!= null)&&(!that.valuesBinary.isEmpty()))?that.getValuesBinary():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valuesBinary", lhsValuesBinary), LocatorUtils.property(thatLocator, "valuesBinary", rhsValuesBinary), lhsValuesBinary, rhsValuesBinary)) {
                return false;
            }
        }
        {
            List<Double> lhsXAxisOffsets;
            lhsXAxisOffsets = (((this.xAxisOffsets!= null)&&(!this.xAxisOffsets.isEmpty()))?this.getXAxisOffsets():null);
            List<Double> rhsXAxisOffsets;
            rhsXAxisOffsets = (((that.xAxisOffsets!= null)&&(!that.xAxisOffsets.isEmpty()))?that.getXAxisOffsets():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xAxisOffsets", lhsXAxisOffsets), LocatorUtils.property(thatLocator, "xAxisOffsets", rhsXAxisOffsets), lhsXAxisOffsets, rhsXAxisOffsets)) {
                return false;
            }
        }
        {
            List<Boolean> lhsXAxisOffsetsList;
            lhsXAxisOffsetsList = (((this.xAxisOffsetsList!= null)&&(!this.xAxisOffsetsList.isEmpty()))?this.getXAxisOffsetsList():null);
            List<Boolean> rhsXAxisOffsetsList;
            rhsXAxisOffsetsList = (((that.xAxisOffsetsList!= null)&&(!that.xAxisOffsetsList.isEmpty()))?that.getXAxisOffsetsList():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xAxisOffsetsList", lhsXAxisOffsetsList), LocatorUtils.property(thatLocator, "xAxisOffsetsList", rhsXAxisOffsetsList), lhsXAxisOffsetsList, rhsXAxisOffsetsList)) {
                return false;
            }
        }
        {
            List<byte[]> lhsXAxisOffsetsBinary;
            lhsXAxisOffsetsBinary = (((this.xAxisOffsetsBinary!= null)&&(!this.xAxisOffsetsBinary.isEmpty()))?this.getXAxisOffsetsBinary():null);
            List<byte[]> rhsXAxisOffsetsBinary;
            rhsXAxisOffsetsBinary = (((that.xAxisOffsetsBinary!= null)&&(!that.xAxisOffsetsBinary.isEmpty()))?that.getXAxisOffsetsBinary():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xAxisOffsetsBinary", lhsXAxisOffsetsBinary), LocatorUtils.property(thatLocator, "xAxisOffsetsBinary", rhsXAxisOffsetsBinary), lhsXAxisOffsetsBinary, rhsXAxisOffsetsBinary)) {
                return false;
            }
        }
        {
            List<Double> lhsValueQualities;
            lhsValueQualities = (((this.valueQualities!= null)&&(!this.valueQualities.isEmpty()))?this.getValueQualities():null);
            List<Double> rhsValueQualities;
            rhsValueQualities = (((that.valueQualities!= null)&&(!that.valueQualities.isEmpty()))?that.getValueQualities():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueQualities", lhsValueQualities), LocatorUtils.property(thatLocator, "valueQualities", rhsValueQualities), lhsValueQualities, rhsValueQualities)) {
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
            Double theXAxisStart;
            theXAxisStart = this.getXAxisStart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xAxisStart", theXAxisStart), currentHashCode, theXAxisStart);
        }
        {
            List<Double> theValues;
            theValues = (((this.values!= null)&&(!this.values.isEmpty()))?this.getValues():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "values", theValues), currentHashCode, theValues);
        }
        {
            List<Boolean> theValuesList;
            theValuesList = (((this.valuesList!= null)&&(!this.valuesList.isEmpty()))?this.getValuesList():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valuesList", theValuesList), currentHashCode, theValuesList);
        }
        {
            List<byte[]> theValuesBinary;
            theValuesBinary = (((this.valuesBinary!= null)&&(!this.valuesBinary.isEmpty()))?this.getValuesBinary():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valuesBinary", theValuesBinary), currentHashCode, theValuesBinary);
        }
        {
            List<Double> theXAxisOffsets;
            theXAxisOffsets = (((this.xAxisOffsets!= null)&&(!this.xAxisOffsets.isEmpty()))?this.getXAxisOffsets():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xAxisOffsets", theXAxisOffsets), currentHashCode, theXAxisOffsets);
        }
        {
            List<Boolean> theXAxisOffsetsList;
            theXAxisOffsetsList = (((this.xAxisOffsetsList!= null)&&(!this.xAxisOffsetsList.isEmpty()))?this.getXAxisOffsetsList():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xAxisOffsetsList", theXAxisOffsetsList), currentHashCode, theXAxisOffsetsList);
        }
        {
            List<byte[]> theXAxisOffsetsBinary;
            theXAxisOffsetsBinary = (((this.xAxisOffsetsBinary!= null)&&(!this.xAxisOffsetsBinary.isEmpty()))?this.getXAxisOffsetsBinary():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xAxisOffsetsBinary", theXAxisOffsetsBinary), currentHashCode, theXAxisOffsetsBinary);
        }
        {
            List<Double> theValueQualities;
            theValueQualities = (((this.valueQualities!= null)&&(!this.valueQualities.isEmpty()))?this.getValueQualities():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueQualities", theValueQualities), currentHashCode, theValueQualities);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
