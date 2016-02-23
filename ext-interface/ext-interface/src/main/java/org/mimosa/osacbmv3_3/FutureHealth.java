
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for FutureHealth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FutureHealth">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}ItemPrognosis">
 *       &lt;sequence>
 *         &lt;element name="atRef" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="hlthGrade" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="postConfid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FutureHealth", propOrder = {
    "atRef",
    "error",
    "hlthGrade",
    "postConfid"
})
public class FutureHealth
    extends ItemPrognosis
    implements Serializable, Equals, HashCode, ToString
{

    protected double atRef;
    protected Double error;
    protected double hlthGrade;
    protected Double postConfid;

    /**
     * Gets the value of the atRef property.
     * 
     */
    public double getAtRef() {
        return atRef;
    }

    /**
     * Sets the value of the atRef property.
     * 
     */
    public void setAtRef(double value) {
        this.atRef = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setError(Double value) {
        this.error = value;
    }

    /**
     * Gets the value of the hlthGrade property.
     * 
     */
    public double getHlthGrade() {
        return hlthGrade;
    }

    /**
     * Sets the value of the hlthGrade property.
     * 
     */
    public void setHlthGrade(double value) {
        this.hlthGrade = value;
    }

    /**
     * Gets the value of the postConfid property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPostConfid() {
        return postConfid;
    }

    /**
     * Sets the value of the postConfid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPostConfid(Double value) {
        this.postConfid = value;
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
            double theAtRef;
            theAtRef = (true?this.getAtRef(): 0.0D);
            strategy.appendField(locator, this, "atRef", buffer, theAtRef);
        }
        {
            Double theError;
            theError = this.getError();
            strategy.appendField(locator, this, "error", buffer, theError);
        }
        {
            double theHlthGrade;
            theHlthGrade = (true?this.getHlthGrade(): 0.0D);
            strategy.appendField(locator, this, "hlthGrade", buffer, theHlthGrade);
        }
        {
            Double thePostConfid;
            thePostConfid = this.getPostConfid();
            strategy.appendField(locator, this, "postConfid", buffer, thePostConfid);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FutureHealth)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final FutureHealth that = ((FutureHealth) object);
        {
            double lhsAtRef;
            lhsAtRef = (true?this.getAtRef(): 0.0D);
            double rhsAtRef;
            rhsAtRef = (true?that.getAtRef(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "atRef", lhsAtRef), LocatorUtils.property(thatLocator, "atRef", rhsAtRef), lhsAtRef, rhsAtRef)) {
                return false;
            }
        }
        {
            Double lhsError;
            lhsError = this.getError();
            Double rhsError;
            rhsError = that.getError();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "error", lhsError), LocatorUtils.property(thatLocator, "error", rhsError), lhsError, rhsError)) {
                return false;
            }
        }
        {
            double lhsHlthGrade;
            lhsHlthGrade = (true?this.getHlthGrade(): 0.0D);
            double rhsHlthGrade;
            rhsHlthGrade = (true?that.getHlthGrade(): 0.0D);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hlthGrade", lhsHlthGrade), LocatorUtils.property(thatLocator, "hlthGrade", rhsHlthGrade), lhsHlthGrade, rhsHlthGrade)) {
                return false;
            }
        }
        {
            Double lhsPostConfid;
            lhsPostConfid = this.getPostConfid();
            Double rhsPostConfid;
            rhsPostConfid = that.getPostConfid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postConfid", lhsPostConfid), LocatorUtils.property(thatLocator, "postConfid", rhsPostConfid), lhsPostConfid, rhsPostConfid)) {
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
            double theAtRef;
            theAtRef = (true?this.getAtRef(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "atRef", theAtRef), currentHashCode, theAtRef);
        }
        {
            Double theError;
            theError = this.getError();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "error", theError), currentHashCode, theError);
        }
        {
            double theHlthGrade;
            theHlthGrade = (true?this.getHlthGrade(): 0.0D);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hlthGrade", theHlthGrade), currentHashCode, theHlthGrade);
        }
        {
            Double thePostConfid;
            thePostConfid = this.getPostConfid();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postConfid", thePostConfid), currentHashCode, thePostConfid);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
