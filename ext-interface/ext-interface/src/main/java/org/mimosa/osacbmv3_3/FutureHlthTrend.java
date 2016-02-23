
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
 * <p>Java class for FutureHlthTrend complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FutureHlthTrend">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}ItemPrognosis">
 *       &lt;sequence>
 *         &lt;element name="atRefs" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="errors" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hlthGrades" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="postConfids" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FutureHlthTrend", propOrder = {
    "atRefs",
    "errors",
    "hlthGrades",
    "postConfids"
})
public class FutureHlthTrend
    extends ItemPrognosis
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(type = Double.class)
    protected List<Double> atRefs;
    @XmlElement(type = Double.class)
    protected List<Double> errors;
    @XmlElement(type = Double.class)
    protected List<Double> hlthGrades;
    @XmlElement(type = Double.class)
    protected List<Double> postConfids;

    /**
     * Gets the value of the atRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getAtRefs() {
        if (atRefs == null) {
            atRefs = new ArrayList<Double>();
        }
        return this.atRefs;
    }

    /**
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getErrors() {
        if (errors == null) {
            errors = new ArrayList<Double>();
        }
        return this.errors;
    }

    /**
     * Gets the value of the hlthGrades property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hlthGrades property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHlthGrades().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getHlthGrades() {
        if (hlthGrades == null) {
            hlthGrades = new ArrayList<Double>();
        }
        return this.hlthGrades;
    }

    /**
     * Gets the value of the postConfids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postConfids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostConfids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getPostConfids() {
        if (postConfids == null) {
            postConfids = new ArrayList<Double>();
        }
        return this.postConfids;
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
            List<Double> theAtRefs;
            theAtRefs = (((this.atRefs!= null)&&(!this.atRefs.isEmpty()))?this.getAtRefs():null);
            strategy.appendField(locator, this, "atRefs", buffer, theAtRefs);
        }
        {
            List<Double> theErrors;
            theErrors = (((this.errors!= null)&&(!this.errors.isEmpty()))?this.getErrors():null);
            strategy.appendField(locator, this, "errors", buffer, theErrors);
        }
        {
            List<Double> theHlthGrades;
            theHlthGrades = (((this.hlthGrades!= null)&&(!this.hlthGrades.isEmpty()))?this.getHlthGrades():null);
            strategy.appendField(locator, this, "hlthGrades", buffer, theHlthGrades);
        }
        {
            List<Double> thePostConfids;
            thePostConfids = (((this.postConfids!= null)&&(!this.postConfids.isEmpty()))?this.getPostConfids():null);
            strategy.appendField(locator, this, "postConfids", buffer, thePostConfids);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FutureHlthTrend)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final FutureHlthTrend that = ((FutureHlthTrend) object);
        {
            List<Double> lhsAtRefs;
            lhsAtRefs = (((this.atRefs!= null)&&(!this.atRefs.isEmpty()))?this.getAtRefs():null);
            List<Double> rhsAtRefs;
            rhsAtRefs = (((that.atRefs!= null)&&(!that.atRefs.isEmpty()))?that.getAtRefs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "atRefs", lhsAtRefs), LocatorUtils.property(thatLocator, "atRefs", rhsAtRefs), lhsAtRefs, rhsAtRefs)) {
                return false;
            }
        }
        {
            List<Double> lhsErrors;
            lhsErrors = (((this.errors!= null)&&(!this.errors.isEmpty()))?this.getErrors():null);
            List<Double> rhsErrors;
            rhsErrors = (((that.errors!= null)&&(!that.errors.isEmpty()))?that.getErrors():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errors", lhsErrors), LocatorUtils.property(thatLocator, "errors", rhsErrors), lhsErrors, rhsErrors)) {
                return false;
            }
        }
        {
            List<Double> lhsHlthGrades;
            lhsHlthGrades = (((this.hlthGrades!= null)&&(!this.hlthGrades.isEmpty()))?this.getHlthGrades():null);
            List<Double> rhsHlthGrades;
            rhsHlthGrades = (((that.hlthGrades!= null)&&(!that.hlthGrades.isEmpty()))?that.getHlthGrades():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hlthGrades", lhsHlthGrades), LocatorUtils.property(thatLocator, "hlthGrades", rhsHlthGrades), lhsHlthGrades, rhsHlthGrades)) {
                return false;
            }
        }
        {
            List<Double> lhsPostConfids;
            lhsPostConfids = (((this.postConfids!= null)&&(!this.postConfids.isEmpty()))?this.getPostConfids():null);
            List<Double> rhsPostConfids;
            rhsPostConfids = (((that.postConfids!= null)&&(!that.postConfids.isEmpty()))?that.getPostConfids():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postConfids", lhsPostConfids), LocatorUtils.property(thatLocator, "postConfids", rhsPostConfids), lhsPostConfids, rhsPostConfids)) {
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
            List<Double> theAtRefs;
            theAtRefs = (((this.atRefs!= null)&&(!this.atRefs.isEmpty()))?this.getAtRefs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "atRefs", theAtRefs), currentHashCode, theAtRefs);
        }
        {
            List<Double> theErrors;
            theErrors = (((this.errors!= null)&&(!this.errors.isEmpty()))?this.getErrors():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errors", theErrors), currentHashCode, theErrors);
        }
        {
            List<Double> theHlthGrades;
            theHlthGrades = (((this.hlthGrades!= null)&&(!this.hlthGrades.isEmpty()))?this.getHlthGrades():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hlthGrades", theHlthGrades), currentHashCode, theHlthGrades);
        }
        {
            List<Double> thePostConfids;
            thePostConfids = (((this.postConfids!= null)&&(!this.postConfids.isEmpty()))?this.getPostConfids():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postConfids", thePostConfids), currentHashCode, thePostConfids);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
