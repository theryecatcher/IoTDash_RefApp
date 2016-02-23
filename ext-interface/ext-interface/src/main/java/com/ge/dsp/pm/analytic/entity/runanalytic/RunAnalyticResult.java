
package com.ge.dsp.pm.analytic.entity.runanalytic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.analytic.port.Port;
import com.ge.dsp.pm.ext.entity.util.map.Map;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outputPort" type="{http://dsp.ge.com/pm/ext/entity/analytic/port}Port" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="errorEvent" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/util/map}externalAttributeMap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "outputPort",
    "errorEvent",
    "externalAttributeMap"
})
@XmlRootElement(name = "runAnalyticResult")
public class RunAnalyticResult
    implements Serializable, Equals, HashCode, ToString
{

    protected List<Port> outputPort;
    protected List<String> errorEvent;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/util/map")
    protected Map externalAttributeMap;

    /**
     * Gets the value of the outputPort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputPort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Port }
     * 
     * 
     */
    public List<Port> getOutputPort() {
        if (outputPort == null) {
            outputPort = new ArrayList<Port>();
        }
        return this.outputPort;
    }

    /**
     * Gets the value of the errorEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getErrorEvent() {
        if (errorEvent == null) {
            errorEvent = new ArrayList<String>();
        }
        return this.errorEvent;
    }

    /**
     * Gets the value of the externalAttributeMap property.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getExternalAttributeMap() {
        return externalAttributeMap;
    }

    /**
     * Sets the value of the externalAttributeMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setExternalAttributeMap(Map value) {
        this.externalAttributeMap = value;
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
            List<Port> theOutputPort;
            theOutputPort = (((this.outputPort!= null)&&(!this.outputPort.isEmpty()))?this.getOutputPort():null);
            strategy.appendField(locator, this, "outputPort", buffer, theOutputPort);
        }
        {
            List<String> theErrorEvent;
            theErrorEvent = (((this.errorEvent!= null)&&(!this.errorEvent.isEmpty()))?this.getErrorEvent():null);
            strategy.appendField(locator, this, "errorEvent", buffer, theErrorEvent);
        }
        {
            Map theExternalAttributeMap;
            theExternalAttributeMap = this.getExternalAttributeMap();
            strategy.appendField(locator, this, "externalAttributeMap", buffer, theExternalAttributeMap);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RunAnalyticResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RunAnalyticResult that = ((RunAnalyticResult) object);
        {
            List<Port> lhsOutputPort;
            lhsOutputPort = (((this.outputPort!= null)&&(!this.outputPort.isEmpty()))?this.getOutputPort():null);
            List<Port> rhsOutputPort;
            rhsOutputPort = (((that.outputPort!= null)&&(!that.outputPort.isEmpty()))?that.getOutputPort():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outputPort", lhsOutputPort), LocatorUtils.property(thatLocator, "outputPort", rhsOutputPort), lhsOutputPort, rhsOutputPort)) {
                return false;
            }
        }
        {
            List<String> lhsErrorEvent;
            lhsErrorEvent = (((this.errorEvent!= null)&&(!this.errorEvent.isEmpty()))?this.getErrorEvent():null);
            List<String> rhsErrorEvent;
            rhsErrorEvent = (((that.errorEvent!= null)&&(!that.errorEvent.isEmpty()))?that.getErrorEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errorEvent", lhsErrorEvent), LocatorUtils.property(thatLocator, "errorEvent", rhsErrorEvent), lhsErrorEvent, rhsErrorEvent)) {
                return false;
            }
        }
        {
            Map lhsExternalAttributeMap;
            lhsExternalAttributeMap = this.getExternalAttributeMap();
            Map rhsExternalAttributeMap;
            rhsExternalAttributeMap = that.getExternalAttributeMap();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "externalAttributeMap", lhsExternalAttributeMap), LocatorUtils.property(thatLocator, "externalAttributeMap", rhsExternalAttributeMap), lhsExternalAttributeMap, rhsExternalAttributeMap)) {
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
            List<Port> theOutputPort;
            theOutputPort = (((this.outputPort!= null)&&(!this.outputPort.isEmpty()))?this.getOutputPort():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outputPort", theOutputPort), currentHashCode, theOutputPort);
        }
        {
            List<String> theErrorEvent;
            theErrorEvent = (((this.errorEvent!= null)&&(!this.errorEvent.isEmpty()))?this.getErrorEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errorEvent", theErrorEvent), currentHashCode, theErrorEvent);
        }
        {
            Map theExternalAttributeMap;
            theExternalAttributeMap = this.getExternalAttributeMap();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "externalAttributeMap", theExternalAttributeMap), currentHashCode, theExternalAttributeMap);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
