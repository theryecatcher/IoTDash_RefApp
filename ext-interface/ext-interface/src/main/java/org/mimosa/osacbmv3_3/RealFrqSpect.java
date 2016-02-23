
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
 * <p>Java class for RealFrqSpect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealFrqSpect">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}DMDataEvent">
 *       &lt;sequence>
 *         &lt;element name="realValues" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="realValuesList" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}double" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="realValuesBinary" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="xAxisDelta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="xAxisMin" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealFrqSpect", propOrder = {
    "realValues",
    "realValuesList",
    "realValuesBinary",
    "xAxisDelta",
    "xAxisMin"
})
public class RealFrqSpect
    extends DMDataEvent
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(type = Double.class)
    protected List<Double> realValues;
    @XmlList
    @XmlElement(type = Double.class)
    protected List<Double> realValuesList;
    protected byte[] realValuesBinary;
    protected double xAxisDelta;
    protected double xAxisMin;

    /**
     * Gets the value of the realValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getRealValues() {
        if (realValues == null) {
            realValues = new ArrayList<Double>();
        }
        return this.realValues;
    }

    /**
     * Gets the value of the realValuesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realValuesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealValuesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getRealValuesList() {
        if (realValuesList == null) {
            realValuesList = new ArrayList<Double>();
        }
        return this.realValuesList;
    }

    /**
     * Gets the value of the realValuesBinary property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRealValuesBinary() {
        return realValuesBinary;
    }

    /**
     * Sets the value of the realValuesBinary property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRealValuesBinary(byte[] value) {
        this.realValuesBinary = ((byte[]) value);
    }

    /**
     * Gets the value of the xAxisDelta property.
     * 
     */
    public double getXAxisDelta() {
        return xAxisDelta;
    }

    /**
     * Sets the value of the xAxisDelta property.
     * 
     */
    public void setXAxisDelta(double value) {
        this.xAxisDelta = value;
    }

    /**
     * Gets the value of the xAxisMin property.
     * 
     */
    public double getXAxisMin() {
        return xAxisMin;
    }

    /**
     * Sets the value of the xAxisMin property.
     * 
     */
    public void setXAxisMin(double value) {
        this.xAxisMin = value;
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
            List<Double> theRealValues;
            theRealValues = (((this.realValues!= null)&&(!this.realValues.isEmpty()))?this.getRealValues():null);
            strategy.appendField(locator, this, "realValues", buffer, theRealValues);
        }
        {
            List<Double> theRealValuesList;
            theRealValuesList = (((this.realValuesList!= null)&&(!this.realValuesList.isEmpty()))?this.getRealValuesList():null);
            strategy.appendField(locator, this, "realValuesList", buffer, theRealValuesList);
        }
        {
            byte[] theRealValuesBinary;
            theRealValuesBinary = this.getRealValuesBinary();
            strategy.appendField(locator, this, "realValuesBinary", buffer, theRealValuesBinary);
        }
        {
            double theXAxisDelta;
            theXAxisDelta = (true?this.getXAxisDelta(): 0.0D);
            strategy.appendField(locator, this, "xAxisDelta", buffer, theXAxisDelta);
        }
        {
            double theXAxisMin;
            theXAxisMin = (true?this.getXAxisMin(): 0.0D);
            strategy.appendField(locator, this, "xAxisMin", buffer, theXAxisMin);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RealFrqSpect)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RealFrqSpect that = ((RealFrqSpect) object);
        {
            List<Double> lhsRealValues;
            lhsRealValues = (((this.realValues!= null)&&(!this.realValues.isEmpty()))?this.getRealValues():null);
            List<Double> rhsRealValues;
            rhsRealValues = (((that.realValues!= null)&&(!that.realValues.isEmpty()))?that.getRealValues():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realValues", lhsRealValues), LocatorUtils.property(thatLocator, "realValues", rhsRealValues), lhsRealValues, rhsRealValues)) {
                return false;
            }
        }
        {
            List<Double> lhsRealValuesList;
            lhsRealValuesList = (((this.realValuesList!= null)&&(!this.realValuesList.isEmpty()))?this.getRealValuesList():null);
            List<Double> rhsRealValuesList;
            rhsRealValuesList = (((that.realValuesList!= null)&&(!that.realValuesList.isEmpty()))?that.getRealValuesList():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realValuesList", lhsRealValuesList), LocatorUtils.property(thatLocator, "realValuesList", rhsRealValuesList), lhsRealValuesList, rhsRealValuesList)) {
                return false;
            }
        }
        {
            byte[] lhsRealValuesBinary;
            lhsRealValuesBinary = this.getRealValuesBinary();
            byte[] rhsRealValuesBinary;
            rhsRealValuesBinary = that.getRealValuesBinary();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realValuesBinary", lhsRealValuesBinary), LocatorUtils.property(thatLocator, "realValuesBinary", rhsRealValuesBinary), lhsRealValuesBinary, rhsRealValuesBinary)) {
                return false;
            }
        }
        {
            double lhsXAxisDelta;
            lhsXAxisDelta = (true?this.getXAxisDelta(): 0.0D);
            double rhsXAxisDelta;
            rhsXAxisDelta = (true?that.getXAxisDelta(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xAxisDelta", lhsXAxisDelta), LocatorUtils.property(thatLocator, "xAxisDelta", rhsXAxisDelta), lhsXAxisDelta, rhsXAxisDelta)) {
                return false;
            }
        }
        {
            double lhsXAxisMin;
            lhsXAxisMin = (true?this.getXAxisMin(): 0.0D);
            double rhsXAxisMin;
            rhsXAxisMin = (true?that.getXAxisMin(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xAxisMin", lhsXAxisMin), LocatorUtils.property(thatLocator, "xAxisMin", rhsXAxisMin), lhsXAxisMin, rhsXAxisMin)) {
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
            List<Double> theRealValues;
            theRealValues = (((this.realValues!= null)&&(!this.realValues.isEmpty()))?this.getRealValues():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "realValues", theRealValues), currentHashCode, theRealValues);
        }
        {
            List<Double> theRealValuesList;
            theRealValuesList = (((this.realValuesList!= null)&&(!this.realValuesList.isEmpty()))?this.getRealValuesList():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "realValuesList", theRealValuesList), currentHashCode, theRealValuesList);
        }
        {
            byte[] theRealValuesBinary;
            theRealValuesBinary = this.getRealValuesBinary();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "realValuesBinary", theRealValuesBinary), currentHashCode, theRealValuesBinary);
        }
        {
            double theXAxisDelta;
            theXAxisDelta = (true?this.getXAxisDelta(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xAxisDelta", theXAxisDelta), currentHashCode, theXAxisDelta);
        }
        {
            double theXAxisMin;
            theXAxisMin = (true?this.getXAxisMin(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xAxisMin", theXAxisMin), currentHashCode, theXAxisMin);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
