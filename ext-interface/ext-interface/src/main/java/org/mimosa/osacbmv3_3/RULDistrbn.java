
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
 * <p>Java class for RULDistrbn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RULDistrbn">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}ItemPrognosis">
 *       &lt;sequence>
 *         &lt;element name="cumulProbs" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="postConfids" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ruls" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RULDistrbn", propOrder = {
    "cumulProbs",
    "error",
    "postConfids",
    "ruls"
})
public class RULDistrbn
    extends ItemPrognosis
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(type = Double.class)
    protected List<Double> cumulProbs;
    @XmlElement(type = Double.class)
    protected List<Double> error;
    @XmlElement(type = Double.class)
    protected List<Double> postConfids;
    @XmlElement(type = Double.class)
    protected List<Double> ruls;

    /**
     * Gets the value of the cumulProbs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cumulProbs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCumulProbs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getCumulProbs() {
        if (cumulProbs == null) {
            cumulProbs = new ArrayList<Double>();
        }
        return this.cumulProbs;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getError() {
        if (error == null) {
            error = new ArrayList<Double>();
        }
        return this.error;
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

    /**
     * Gets the value of the ruls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getRuls() {
        if (ruls == null) {
            ruls = new ArrayList<Double>();
        }
        return this.ruls;
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
            List<Double> theCumulProbs;
            theCumulProbs = (((this.cumulProbs!= null)&&(!this.cumulProbs.isEmpty()))?this.getCumulProbs():null);
            strategy.appendField(locator, this, "cumulProbs", buffer, theCumulProbs);
        }
        {
            List<Double> theError;
            theError = (((this.error!= null)&&(!this.error.isEmpty()))?this.getError():null);
            strategy.appendField(locator, this, "error", buffer, theError);
        }
        {
            List<Double> thePostConfids;
            thePostConfids = (((this.postConfids!= null)&&(!this.postConfids.isEmpty()))?this.getPostConfids():null);
            strategy.appendField(locator, this, "postConfids", buffer, thePostConfids);
        }
        {
            List<Double> theRuls;
            theRuls = (((this.ruls!= null)&&(!this.ruls.isEmpty()))?this.getRuls():null);
            strategy.appendField(locator, this, "ruls", buffer, theRuls);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RULDistrbn)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RULDistrbn that = ((RULDistrbn) object);
        {
            List<Double> lhsCumulProbs;
            lhsCumulProbs = (((this.cumulProbs!= null)&&(!this.cumulProbs.isEmpty()))?this.getCumulProbs():null);
            List<Double> rhsCumulProbs;
            rhsCumulProbs = (((that.cumulProbs!= null)&&(!that.cumulProbs.isEmpty()))?that.getCumulProbs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cumulProbs", lhsCumulProbs), LocatorUtils.property(thatLocator, "cumulProbs", rhsCumulProbs), lhsCumulProbs, rhsCumulProbs)) {
                return false;
            }
        }
        {
            List<Double> lhsError;
            lhsError = (((this.error!= null)&&(!this.error.isEmpty()))?this.getError():null);
            List<Double> rhsError;
            rhsError = (((that.error!= null)&&(!that.error.isEmpty()))?that.getError():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "error", lhsError), LocatorUtils.property(thatLocator, "error", rhsError), lhsError, rhsError)) {
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
        {
            List<Double> lhsRuls;
            lhsRuls = (((this.ruls!= null)&&(!this.ruls.isEmpty()))?this.getRuls():null);
            List<Double> rhsRuls;
            rhsRuls = (((that.ruls!= null)&&(!that.ruls.isEmpty()))?that.getRuls():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ruls", lhsRuls), LocatorUtils.property(thatLocator, "ruls", rhsRuls), lhsRuls, rhsRuls)) {
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
            List<Double> theCumulProbs;
            theCumulProbs = (((this.cumulProbs!= null)&&(!this.cumulProbs.isEmpty()))?this.getCumulProbs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cumulProbs", theCumulProbs), currentHashCode, theCumulProbs);
        }
        {
            List<Double> theError;
            theError = (((this.error!= null)&&(!this.error.isEmpty()))?this.getError():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "error", theError), currentHashCode, theError);
        }
        {
            List<Double> thePostConfids;
            thePostConfids = (((this.postConfids!= null)&&(!this.postConfids.isEmpty()))?this.getPostConfids():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postConfids", thePostConfids), currentHashCode, thePostConfids);
        }
        {
            List<Double> theRuls;
            theRuls = (((this.ruls!= null)&&(!this.ruls.isEmpty()))?this.getRuls():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ruls", theRuls), currentHashCode, theRuls);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
