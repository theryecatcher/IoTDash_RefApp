
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
 * <p>Java class for PortRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inPort" type="{http://www.mimosa.org/OSACBMV3.3.1}Port" minOccurs="0"/>
 *         &lt;element name="monitorId" type="{http://www.mimosa.org/OSACBMV3.3.1}MonitorId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortRef", propOrder = {
    "inPort",
    "monitorId"
})
public class PortRef
    implements Serializable, Equals, HashCode, ToString
{

    protected Port inPort;
    @XmlElement(required = true)
    protected MonitorId monitorId;

    /**
     * Gets the value of the inPort property.
     * 
     * @return
     *     possible object is
     *     {@link Port }
     *     
     */
    public Port getInPort() {
        return inPort;
    }

    /**
     * Sets the value of the inPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Port }
     *     
     */
    public void setInPort(Port value) {
        this.inPort = value;
    }

    /**
     * Gets the value of the monitorId property.
     * 
     * @return
     *     possible object is
     *     {@link MonitorId }
     *     
     */
    public MonitorId getMonitorId() {
        return monitorId;
    }

    /**
     * Sets the value of the monitorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitorId }
     *     
     */
    public void setMonitorId(MonitorId value) {
        this.monitorId = value;
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
            Port theInPort;
            theInPort = this.getInPort();
            strategy.appendField(locator, this, "inPort", buffer, theInPort);
        }
        {
            MonitorId theMonitorId;
            theMonitorId = this.getMonitorId();
            strategy.appendField(locator, this, "monitorId", buffer, theMonitorId);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PortRef)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PortRef that = ((PortRef) object);
        {
            Port lhsInPort;
            lhsInPort = this.getInPort();
            Port rhsInPort;
            rhsInPort = that.getInPort();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inPort", lhsInPort), LocatorUtils.property(thatLocator, "inPort", rhsInPort), lhsInPort, rhsInPort)) {
                return false;
            }
        }
        {
            MonitorId lhsMonitorId;
            lhsMonitorId = this.getMonitorId();
            MonitorId rhsMonitorId;
            rhsMonitorId = that.getMonitorId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "monitorId", lhsMonitorId), LocatorUtils.property(thatLocator, "monitorId", rhsMonitorId), lhsMonitorId, rhsMonitorId)) {
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
            Port theInPort;
            theInPort = this.getInPort();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inPort", theInPort), currentHashCode, theInPort);
        }
        {
            MonitorId theMonitorId;
            theMonitorId = this.getMonitorId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "monitorId", theMonitorId), currentHashCode, theMonitorId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
