
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
 * <p>Java class for DMPort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DMPort">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}Port">
 *       &lt;sequence>
 *         &lt;element name="alertRegs" type="{http://www.mimosa.org/OSACBMV3.3.1}AlertRegion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="measLoc" type="{http://www.mimosa.org/OSACBMV3.3.1}MeasLoc" minOccurs="0"/>
 *         &lt;element name="phaseEU" type="{http://www.mimosa.org/OSACBMV3.3.1}EngUnit" minOccurs="0"/>
 *         &lt;element name="types" type="{http://www.mimosa.org/OSACBMV3.3.1}MimTypeDescriptors" minOccurs="0"/>
 *         &lt;element name="valueEU" type="{http://www.mimosa.org/OSACBMV3.3.1}EngUnit" minOccurs="0"/>
 *         &lt;element name="xAxisEU" type="{http://www.mimosa.org/OSACBMV3.3.1}EngUnit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DMPort", propOrder = {
    "alertRegs",
    "measLoc",
    "phaseEU",
    "types",
    "valueEU",
    "xAxisEU"
})
public class DMPort
    extends Port
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(nillable = true)
    protected List<AlertRegion> alertRegs;
    protected MeasLoc measLoc;
    protected EngUnit phaseEU;
    protected MimTypeDescriptors types;
    protected EngUnit valueEU;
    protected EngUnit xAxisEU;

    /**
     * Gets the value of the alertRegs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alertRegs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertRegs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertRegion }
     * 
     * 
     */
    public List<AlertRegion> getAlertRegs() {
        if (alertRegs == null) {
            alertRegs = new ArrayList<AlertRegion>();
        }
        return this.alertRegs;
    }

    /**
     * Gets the value of the measLoc property.
     * 
     * @return
     *     possible object is
     *     {@link MeasLoc }
     *     
     */
    public MeasLoc getMeasLoc() {
        return measLoc;
    }

    /**
     * Sets the value of the measLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasLoc }
     *     
     */
    public void setMeasLoc(MeasLoc value) {
        this.measLoc = value;
    }

    /**
     * Gets the value of the phaseEU property.
     * 
     * @return
     *     possible object is
     *     {@link EngUnit }
     *     
     */
    public EngUnit getPhaseEU() {
        return phaseEU;
    }

    /**
     * Sets the value of the phaseEU property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngUnit }
     *     
     */
    public void setPhaseEU(EngUnit value) {
        this.phaseEU = value;
    }

    /**
     * Gets the value of the types property.
     * 
     * @return
     *     possible object is
     *     {@link MimTypeDescriptors }
     *     
     */
    public MimTypeDescriptors getTypes() {
        return types;
    }

    /**
     * Sets the value of the types property.
     * 
     * @param value
     *     allowed object is
     *     {@link MimTypeDescriptors }
     *     
     */
    public void setTypes(MimTypeDescriptors value) {
        this.types = value;
    }

    /**
     * Gets the value of the valueEU property.
     * 
     * @return
     *     possible object is
     *     {@link EngUnit }
     *     
     */
    public EngUnit getValueEU() {
        return valueEU;
    }

    /**
     * Sets the value of the valueEU property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngUnit }
     *     
     */
    public void setValueEU(EngUnit value) {
        this.valueEU = value;
    }

    /**
     * Gets the value of the xAxisEU property.
     * 
     * @return
     *     possible object is
     *     {@link EngUnit }
     *     
     */
    public EngUnit getXAxisEU() {
        return xAxisEU;
    }

    /**
     * Sets the value of the xAxisEU property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngUnit }
     *     
     */
    public void setXAxisEU(EngUnit value) {
        this.xAxisEU = value;
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
            List<AlertRegion> theAlertRegs;
            theAlertRegs = (((this.alertRegs!= null)&&(!this.alertRegs.isEmpty()))?this.getAlertRegs():null);
            strategy.appendField(locator, this, "alertRegs", buffer, theAlertRegs);
        }
        {
            MeasLoc theMeasLoc;
            theMeasLoc = this.getMeasLoc();
            strategy.appendField(locator, this, "measLoc", buffer, theMeasLoc);
        }
        {
            EngUnit thePhaseEU;
            thePhaseEU = this.getPhaseEU();
            strategy.appendField(locator, this, "phaseEU", buffer, thePhaseEU);
        }
        {
            MimTypeDescriptors theTypes;
            theTypes = this.getTypes();
            strategy.appendField(locator, this, "types", buffer, theTypes);
        }
        {
            EngUnit theValueEU;
            theValueEU = this.getValueEU();
            strategy.appendField(locator, this, "valueEU", buffer, theValueEU);
        }
        {
            EngUnit theXAxisEU;
            theXAxisEU = this.getXAxisEU();
            strategy.appendField(locator, this, "xAxisEU", buffer, theXAxisEU);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DMPort)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DMPort that = ((DMPort) object);
        {
            List<AlertRegion> lhsAlertRegs;
            lhsAlertRegs = (((this.alertRegs!= null)&&(!this.alertRegs.isEmpty()))?this.getAlertRegs():null);
            List<AlertRegion> rhsAlertRegs;
            rhsAlertRegs = (((that.alertRegs!= null)&&(!that.alertRegs.isEmpty()))?that.getAlertRegs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alertRegs", lhsAlertRegs), LocatorUtils.property(thatLocator, "alertRegs", rhsAlertRegs), lhsAlertRegs, rhsAlertRegs)) {
                return false;
            }
        }
        {
            MeasLoc lhsMeasLoc;
            lhsMeasLoc = this.getMeasLoc();
            MeasLoc rhsMeasLoc;
            rhsMeasLoc = that.getMeasLoc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measLoc", lhsMeasLoc), LocatorUtils.property(thatLocator, "measLoc", rhsMeasLoc), lhsMeasLoc, rhsMeasLoc)) {
                return false;
            }
        }
        {
            EngUnit lhsPhaseEU;
            lhsPhaseEU = this.getPhaseEU();
            EngUnit rhsPhaseEU;
            rhsPhaseEU = that.getPhaseEU();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phaseEU", lhsPhaseEU), LocatorUtils.property(thatLocator, "phaseEU", rhsPhaseEU), lhsPhaseEU, rhsPhaseEU)) {
                return false;
            }
        }
        {
            MimTypeDescriptors lhsTypes;
            lhsTypes = this.getTypes();
            MimTypeDescriptors rhsTypes;
            rhsTypes = that.getTypes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "types", lhsTypes), LocatorUtils.property(thatLocator, "types", rhsTypes), lhsTypes, rhsTypes)) {
                return false;
            }
        }
        {
            EngUnit lhsValueEU;
            lhsValueEU = this.getValueEU();
            EngUnit rhsValueEU;
            rhsValueEU = that.getValueEU();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueEU", lhsValueEU), LocatorUtils.property(thatLocator, "valueEU", rhsValueEU), lhsValueEU, rhsValueEU)) {
                return false;
            }
        }
        {
            EngUnit lhsXAxisEU;
            lhsXAxisEU = this.getXAxisEU();
            EngUnit rhsXAxisEU;
            rhsXAxisEU = that.getXAxisEU();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xAxisEU", lhsXAxisEU), LocatorUtils.property(thatLocator, "xAxisEU", rhsXAxisEU), lhsXAxisEU, rhsXAxisEU)) {
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
            List<AlertRegion> theAlertRegs;
            theAlertRegs = (((this.alertRegs!= null)&&(!this.alertRegs.isEmpty()))?this.getAlertRegs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alertRegs", theAlertRegs), currentHashCode, theAlertRegs);
        }
        {
            MeasLoc theMeasLoc;
            theMeasLoc = this.getMeasLoc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measLoc", theMeasLoc), currentHashCode, theMeasLoc);
        }
        {
            EngUnit thePhaseEU;
            thePhaseEU = this.getPhaseEU();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "phaseEU", thePhaseEU), currentHashCode, thePhaseEU);
        }
        {
            MimTypeDescriptors theTypes;
            theTypes = this.getTypes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "types", theTypes), currentHashCode, theTypes);
        }
        {
            EngUnit theValueEU;
            theValueEU = this.getValueEU();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueEU", theValueEU), currentHashCode, theValueEU);
        }
        {
            EngUnit theXAxisEU;
            theXAxisEU = this.getXAxisEU();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xAxisEU", theXAxisEU), currentHashCode, theXAxisEU);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
