
package org.mimosa.osacbmv3_3;

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
 * <p>Java class for SDTestReal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SDTestReal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}SDDataEvent">
 *       &lt;sequence>
 *         &lt;element name="evaluation" type="{http://www.mimosa.org/OSACBMV3.3.1}EnumValue"/>
 *         &lt;element name="measure" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SDTestReal", propOrder = {
    "evaluation",
    "measure"
})
public class SDTestReal
    extends SDDataEvent
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected EnumValue evaluation;
    protected double measure;

    /**
     * Gets the value of the evaluation property.
     * 
     * @return
     *     possible object is
     *     {@link EnumValue }
     *     
     */
    public EnumValue getEvaluation() {
        return evaluation;
    }

    /**
     * Sets the value of the evaluation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumValue }
     *     
     */
    public void setEvaluation(EnumValue value) {
        this.evaluation = value;
    }

    /**
     * Gets the value of the measure property.
     * 
     */
    public double getMeasure() {
        return measure;
    }

    /**
     * Sets the value of the measure property.
     * 
     */
    public void setMeasure(double value) {
        this.measure = value;
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
            EnumValue theEvaluation;
            theEvaluation = this.getEvaluation();
            strategy.appendField(locator, this, "evaluation", buffer, theEvaluation);
        }
        {
            double theMeasure;
            theMeasure = (true?this.getMeasure(): 0.0D);
            strategy.appendField(locator, this, "measure", buffer, theMeasure);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SDTestReal)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SDTestReal that = ((SDTestReal) object);
        {
            EnumValue lhsEvaluation;
            lhsEvaluation = this.getEvaluation();
            EnumValue rhsEvaluation;
            rhsEvaluation = that.getEvaluation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "evaluation", lhsEvaluation), LocatorUtils.property(thatLocator, "evaluation", rhsEvaluation), lhsEvaluation, rhsEvaluation)) {
                return false;
            }
        }
        {
            double lhsMeasure;
            lhsMeasure = (true?this.getMeasure(): 0.0D);
            double rhsMeasure;
            rhsMeasure = (true?that.getMeasure(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measure", lhsMeasure), LocatorUtils.property(thatLocator, "measure", rhsMeasure), lhsMeasure, rhsMeasure)) {
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
            EnumValue theEvaluation;
            theEvaluation = this.getEvaluation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "evaluation", theEvaluation), currentHashCode, theEvaluation);
        }
        {
            double theMeasure;
            theMeasure = (true?this.getMeasure(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measure", theMeasure), currentHashCode, theMeasure);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
