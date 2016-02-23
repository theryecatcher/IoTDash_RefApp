
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
 * <p>Java class for DMBLOBData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DMBLOBData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}DMDataEvent">
 *       &lt;sequence>
 *         &lt;element name="mEventBlobType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.mimosa.org/OSACBMV3.3.1}BLOB"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DMBLOBData", propOrder = {
    "mEventBlobType",
    "value"
})
public class DMBLOBData
    extends DMDataEvent
    implements Serializable, Equals, HashCode, ToString
{

    protected MIMKey3 mEventBlobType;
    @XmlElement(required = true)
    protected BLOB value;

    /**
     * Gets the value of the mEventBlobType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getMEventBlobType() {
        return mEventBlobType;
    }

    /**
     * Sets the value of the mEventBlobType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setMEventBlobType(MIMKey3 value) {
        this.mEventBlobType = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BLOB }
     *     
     */
    public BLOB getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BLOB }
     *     
     */
    public void setValue(BLOB value) {
        this.value = value;
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
            MIMKey3 theMEventBlobType;
            theMEventBlobType = this.getMEventBlobType();
            strategy.appendField(locator, this, "mEventBlobType", buffer, theMEventBlobType);
        }
        {
            BLOB theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DMBLOBData)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DMBLOBData that = ((DMBLOBData) object);
        {
            MIMKey3 lhsMEventBlobType;
            lhsMEventBlobType = this.getMEventBlobType();
            MIMKey3 rhsMEventBlobType;
            rhsMEventBlobType = that.getMEventBlobType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mEventBlobType", lhsMEventBlobType), LocatorUtils.property(thatLocator, "mEventBlobType", rhsMEventBlobType), lhsMEventBlobType, rhsMEventBlobType)) {
                return false;
            }
        }
        {
            BLOB lhsValue;
            lhsValue = this.getValue();
            BLOB rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
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
            MIMKey3 theMEventBlobType;
            theMEventBlobType = this.getMEventBlobType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mEventBlobType", theMEventBlobType), currentHashCode, theMEventBlobType);
        }
        {
            BLOB theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
