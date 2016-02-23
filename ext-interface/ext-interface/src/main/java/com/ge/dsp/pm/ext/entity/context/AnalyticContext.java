
package com.ge.dsp.pm.ext.entity.context;

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
 * This object contains the context information about the
 * 				running analytic.
 * 			
 * 
 * <p>Java class for AnalyticContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnalyticContext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processActivityID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalyticContext", propOrder = {
    "processActivityID"
})
public class AnalyticContext
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String processActivityID;

    /**
     * Gets the value of the processActivityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessActivityID() {
        return processActivityID;
    }

    /**
     * Sets the value of the processActivityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessActivityID(String value) {
        this.processActivityID = value;
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
            String theProcessActivityID;
            theProcessActivityID = this.getProcessActivityID();
            strategy.appendField(locator, this, "processActivityID", buffer, theProcessActivityID);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AnalyticContext)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AnalyticContext that = ((AnalyticContext) object);
        {
            String lhsProcessActivityID;
            lhsProcessActivityID = this.getProcessActivityID();
            String rhsProcessActivityID;
            rhsProcessActivityID = that.getProcessActivityID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processActivityID", lhsProcessActivityID), LocatorUtils.property(thatLocator, "processActivityID", rhsProcessActivityID), lhsProcessActivityID, rhsProcessActivityID)) {
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
            String theProcessActivityID;
            theProcessActivityID = this.getProcessActivityID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processActivityID", theProcessActivityID), currentHashCode, theProcessActivityID);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}