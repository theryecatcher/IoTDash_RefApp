
package com.ge.dsp.aaas.entity.resultinfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.aaas.entity.message.Message;
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
 * <p>Java class for ResultInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="warnings" type="{http://dsp.ge.com/aaas/entity/message}Message" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="errorEvents" type="{http://dsp.ge.com/aaas/entity/message}Message" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultInfo", propOrder = {
    "warnings",
    "errorEvents"
})
public class ResultInfo
    implements Serializable, Equals, HashCode, ToString
{

    protected List<Message> warnings;
    protected List<Message> errorEvents;

    /**
     * Gets the value of the warnings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warnings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarnings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Message }
     * 
     * 
     */
    public List<Message> getWarnings() {
        if (warnings == null) {
            warnings = new ArrayList<Message>();
        }
        return this.warnings;
    }

    /**
     * Gets the value of the errorEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Message }
     * 
     * 
     */
    public List<Message> getErrorEvents() {
        if (errorEvents == null) {
            errorEvents = new ArrayList<Message>();
        }
        return this.errorEvents;
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
            List<Message> theWarnings;
            theWarnings = (((this.warnings!= null)&&(!this.warnings.isEmpty()))?this.getWarnings():null);
            strategy.appendField(locator, this, "warnings", buffer, theWarnings);
        }
        {
            List<Message> theErrorEvents;
            theErrorEvents = (((this.errorEvents!= null)&&(!this.errorEvents.isEmpty()))?this.getErrorEvents():null);
            strategy.appendField(locator, this, "errorEvents", buffer, theErrorEvents);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ResultInfo)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ResultInfo that = ((ResultInfo) object);
        {
            List<Message> lhsWarnings;
            lhsWarnings = (((this.warnings!= null)&&(!this.warnings.isEmpty()))?this.getWarnings():null);
            List<Message> rhsWarnings;
            rhsWarnings = (((that.warnings!= null)&&(!that.warnings.isEmpty()))?that.getWarnings():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warnings", lhsWarnings), LocatorUtils.property(thatLocator, "warnings", rhsWarnings), lhsWarnings, rhsWarnings)) {
                return false;
            }
        }
        {
            List<Message> lhsErrorEvents;
            lhsErrorEvents = (((this.errorEvents!= null)&&(!this.errorEvents.isEmpty()))?this.getErrorEvents():null);
            List<Message> rhsErrorEvents;
            rhsErrorEvents = (((that.errorEvents!= null)&&(!that.errorEvents.isEmpty()))?that.getErrorEvents():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errorEvents", lhsErrorEvents), LocatorUtils.property(thatLocator, "errorEvents", rhsErrorEvents), lhsErrorEvents, rhsErrorEvents)) {
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
            List<Message> theWarnings;
            theWarnings = (((this.warnings!= null)&&(!this.warnings.isEmpty()))?this.getWarnings():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warnings", theWarnings), currentHashCode, theWarnings);
        }
        {
            List<Message> theErrorEvents;
            theErrorEvents = (((this.errorEvents!= null)&&(!this.errorEvents.isEmpty()))?this.getErrorEvents():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errorEvents", theErrorEvents), currentHashCode, theErrorEvents);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
