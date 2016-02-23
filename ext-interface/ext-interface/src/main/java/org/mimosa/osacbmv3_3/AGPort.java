
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
 * <p>Java class for AGPort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AGPort">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}Port">
 *       &lt;sequence>
 *         &lt;element name="by" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMAgent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGPort", propOrder = {
    "by"
})
public class AGPort
    extends Port
    implements Serializable, Equals, HashCode, ToString
{

    protected MIMAgent by;

    /**
     * Gets the value of the by property.
     * 
     * @return
     *     possible object is
     *     {@link MIMAgent }
     *     
     */
    public MIMAgent getBy() {
        return by;
    }

    /**
     * Sets the value of the by property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMAgent }
     *     
     */
    public void setBy(MIMAgent value) {
        this.by = value;
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
            MIMAgent theBy;
            theBy = this.getBy();
            strategy.appendField(locator, this, "by", buffer, theBy);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AGPort)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AGPort that = ((AGPort) object);
        {
            MIMAgent lhsBy;
            lhsBy = this.getBy();
            MIMAgent rhsBy;
            rhsBy = that.getBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "by", lhsBy), LocatorUtils.property(thatLocator, "by", rhsBy), lhsBy, rhsBy)) {
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
            MIMAgent theBy;
            theBy = this.getBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "by", theBy), currentHashCode, theBy);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
