
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for HlthLevelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HlthLevelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="health_scale" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="id" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HlthLevelType", propOrder = {
    "healthScale",
    "id"
})
public class HlthLevelType
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(name = "health_scale")
    @XmlSchemaType(name = "unsignedShort")
    protected int healthScale;
    @XmlElement(required = true)
    protected MIMKey3 id;

    /**
     * Gets the value of the healthScale property.
     * 
     */
    public int getHealthScale() {
        return healthScale;
    }

    /**
     * Sets the value of the healthScale property.
     * 
     */
    public void setHealthScale(int value) {
        this.healthScale = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setId(MIMKey3 value) {
        this.id = value;
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
            int theHealthScale;
            theHealthScale = (true?this.getHealthScale(): 0);
            strategy.appendField(locator, this, "healthScale", buffer, theHealthScale);
        }
        {
            MIMKey3 theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof HlthLevelType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HlthLevelType that = ((HlthLevelType) object);
        {
            int lhsHealthScale;
            lhsHealthScale = (true?this.getHealthScale(): 0);
            int rhsHealthScale;
            rhsHealthScale = (true?that.getHealthScale(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "healthScale", lhsHealthScale), LocatorUtils.property(thatLocator, "healthScale", rhsHealthScale), lhsHealthScale, rhsHealthScale)) {
                return false;
            }
        }
        {
            MIMKey3 lhsId;
            lhsId = this.getId();
            MIMKey3 rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
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
            int theHealthScale;
            theHealthScale = (true?this.getHealthScale(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "healthScale", theHealthScale), currentHashCode, theHealthScale);
        }
        {
            MIMKey3 theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
