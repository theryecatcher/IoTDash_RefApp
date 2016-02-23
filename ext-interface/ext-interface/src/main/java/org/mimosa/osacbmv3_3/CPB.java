
package org.mimosa.osacbmv3_3;

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


/**
 * <p>Java class for CPB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPB">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}DMDataEvent">
 *       &lt;sequence>
 *         &lt;element name="bndWidth" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cntrBnd1Hz" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cpbBndType" type="{http://www.mimosa.org/OSACBMV3.3.1}BndType"/>
 *         &lt;element name="values" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="valuesList" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valuesBinary" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPB", propOrder = {
    "bndWidth",
    "cntrBnd1Hz",
    "cpbBndType",
    "values",
    "valuesList",
    "valuesBinary"
})
public class CPB
    extends DMDataEvent
    implements Serializable, Equals, HashCode, ToString
{

    protected double bndWidth;
    protected double cntrBnd1Hz;
    @XmlElement(required = true)
    protected BndType cpbBndType;
    @XmlElement(type = Double.class)
    protected List<Double> values;
    @XmlList
    @XmlElement(type = Double.class)
    protected List<Double> valuesList;
    protected byte[] valuesBinary;

    /**
     * Gets the value of the bndWidth property.
     * 
     */
    public double getBndWidth() {
        return bndWidth;
    }

    /**
     * Sets the value of the bndWidth property.
     * 
     */
    public void setBndWidth(double value) {
        this.bndWidth = value;
    }

    /**
     * Gets the value of the cntrBnd1Hz property.
     * 
     */
    public double getCntrBnd1Hz() {
        return cntrBnd1Hz;
    }

    /**
     * Sets the value of the cntrBnd1Hz property.
     * 
     */
    public void setCntrBnd1Hz(double value) {
        this.cntrBnd1Hz = value;
    }

    /**
     * Gets the value of the cpbBndType property.
     * 
     * @return
     *     possible object is
     *     {@link BndType }
     *     
     */
    public BndType getCpbBndType() {
        return cpbBndType;
    }

    /**
     * Sets the value of the cpbBndType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BndType }
     *     
     */
    public void setCpbBndType(BndType value) {
        this.cpbBndType = value;
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
     * {@link Double }
     * 
     * 
     */
    public List<Double> getValuesList() {
        if (valuesList == null) {
            valuesList = new ArrayList<Double>();
        }
        return this.valuesList;
    }

    /**
     * Gets the value of the valuesBinary property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValuesBinary() {
        return valuesBinary;
    }

    /**
     * Sets the value of the valuesBinary property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValuesBinary(byte[] value) {
        this.valuesBinary = ((byte[]) value);
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
            double theBndWidth;
            theBndWidth = (true?this.getBndWidth(): 0.0D);
            strategy.appendField(locator, this, "bndWidth", buffer, theBndWidth);
        }
        {
            double theCntrBnd1Hz;
            theCntrBnd1Hz = (true?this.getCntrBnd1Hz(): 0.0D);
            strategy.appendField(locator, this, "cntrBnd1Hz", buffer, theCntrBnd1Hz);
        }
        {
            BndType theCpbBndType;
            theCpbBndType = this.getCpbBndType();
            strategy.appendField(locator, this, "cpbBndType", buffer, theCpbBndType);
        }
        {
            List<Double> theValues;
            theValues = (((this.values!= null)&&(!this.values.isEmpty()))?this.getValues():null);
            strategy.appendField(locator, this, "values", buffer, theValues);
        }
        {
            List<Double> theValuesList;
            theValuesList = (((this.valuesList!= null)&&(!this.valuesList.isEmpty()))?this.getValuesList():null);
            strategy.appendField(locator, this, "valuesList", buffer, theValuesList);
        }
        {
            byte[] theValuesBinary;
            theValuesBinary = this.getValuesBinary();
            strategy.appendField(locator, this, "valuesBinary", buffer, theValuesBinary);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CPB)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CPB that = ((CPB) object);
        {
            double lhsBndWidth;
            lhsBndWidth = (true?this.getBndWidth(): 0.0D);
            double rhsBndWidth;
            rhsBndWidth = (true?that.getBndWidth(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bndWidth", lhsBndWidth), LocatorUtils.property(thatLocator, "bndWidth", rhsBndWidth), lhsBndWidth, rhsBndWidth)) {
                return false;
            }
        }
        {
            double lhsCntrBnd1Hz;
            lhsCntrBnd1Hz = (true?this.getCntrBnd1Hz(): 0.0D);
            double rhsCntrBnd1Hz;
            rhsCntrBnd1Hz = (true?that.getCntrBnd1Hz(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cntrBnd1Hz", lhsCntrBnd1Hz), LocatorUtils.property(thatLocator, "cntrBnd1Hz", rhsCntrBnd1Hz), lhsCntrBnd1Hz, rhsCntrBnd1Hz)) {
                return false;
            }
        }
        {
            BndType lhsCpbBndType;
            lhsCpbBndType = this.getCpbBndType();
            BndType rhsCpbBndType;
            rhsCpbBndType = that.getCpbBndType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cpbBndType", lhsCpbBndType), LocatorUtils.property(thatLocator, "cpbBndType", rhsCpbBndType), lhsCpbBndType, rhsCpbBndType)) {
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
            List<Double> lhsValuesList;
            lhsValuesList = (((this.valuesList!= null)&&(!this.valuesList.isEmpty()))?this.getValuesList():null);
            List<Double> rhsValuesList;
            rhsValuesList = (((that.valuesList!= null)&&(!that.valuesList.isEmpty()))?that.getValuesList():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valuesList", lhsValuesList), LocatorUtils.property(thatLocator, "valuesList", rhsValuesList), lhsValuesList, rhsValuesList)) {
                return false;
            }
        }
        {
            byte[] lhsValuesBinary;
            lhsValuesBinary = this.getValuesBinary();
            byte[] rhsValuesBinary;
            rhsValuesBinary = that.getValuesBinary();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valuesBinary", lhsValuesBinary), LocatorUtils.property(thatLocator, "valuesBinary", rhsValuesBinary), lhsValuesBinary, rhsValuesBinary)) {
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
            double theBndWidth;
            theBndWidth = (true?this.getBndWidth(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bndWidth", theBndWidth), currentHashCode, theBndWidth);
        }
        {
            double theCntrBnd1Hz;
            theCntrBnd1Hz = (true?this.getCntrBnd1Hz(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cntrBnd1Hz", theCntrBnd1Hz), currentHashCode, theCntrBnd1Hz);
        }
        {
            BndType theCpbBndType;
            theCpbBndType = this.getCpbBndType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cpbBndType", theCpbBndType), currentHashCode, theCpbBndType);
        }
        {
            List<Double> theValues;
            theValues = (((this.values!= null)&&(!this.values.isEmpty()))?this.getValues():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "values", theValues), currentHashCode, theValues);
        }
        {
            List<Double> theValuesList;
            theValuesList = (((this.valuesList!= null)&&(!this.valuesList.isEmpty()))?this.getValuesList():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valuesList", theValuesList), currentHashCode, theValuesList);
        }
        {
            byte[] theValuesBinary;
            theValuesBinary = this.getValuesBinary();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valuesBinary", theValuesBinary), currentHashCode, theValuesBinary);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
