
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for SequenceSelect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SequenceSelect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sequenceNumEnd" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="sequenceNumStart" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceSelect", propOrder = {
    "sequenceNumEnd",
    "sequenceNumStart"
})
public class SequenceSelect
    implements Serializable, Equals, HashCode, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected Long sequenceNumEnd;
    @XmlSchemaType(name = "unsignedInt")
    protected Long sequenceNumStart;

    /**
     * Gets the value of the sequenceNumEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceNumEnd() {
        return sequenceNumEnd;
    }

    /**
     * Sets the value of the sequenceNumEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceNumEnd(Long value) {
        this.sequenceNumEnd = value;
    }

    /**
     * Gets the value of the sequenceNumStart property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceNumStart() {
        return sequenceNumStart;
    }

    /**
     * Sets the value of the sequenceNumStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceNumStart(Long value) {
        this.sequenceNumStart = value;
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
            Long theSequenceNumEnd;
            theSequenceNumEnd = this.getSequenceNumEnd();
            strategy.appendField(locator, this, "sequenceNumEnd", buffer, theSequenceNumEnd);
        }
        {
            Long theSequenceNumStart;
            theSequenceNumStart = this.getSequenceNumStart();
            strategy.appendField(locator, this, "sequenceNumStart", buffer, theSequenceNumStart);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SequenceSelect)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SequenceSelect that = ((SequenceSelect) object);
        {
            Long lhsSequenceNumEnd;
            lhsSequenceNumEnd = this.getSequenceNumEnd();
            Long rhsSequenceNumEnd;
            rhsSequenceNumEnd = that.getSequenceNumEnd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequenceNumEnd", lhsSequenceNumEnd), LocatorUtils.property(thatLocator, "sequenceNumEnd", rhsSequenceNumEnd), lhsSequenceNumEnd, rhsSequenceNumEnd)) {
                return false;
            }
        }
        {
            Long lhsSequenceNumStart;
            lhsSequenceNumStart = this.getSequenceNumStart();
            Long rhsSequenceNumStart;
            rhsSequenceNumStart = that.getSequenceNumStart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequenceNumStart", lhsSequenceNumStart), LocatorUtils.property(thatLocator, "sequenceNumStart", rhsSequenceNumStart), lhsSequenceNumStart, rhsSequenceNumStart)) {
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
            Long theSequenceNumEnd;
            theSequenceNumEnd = this.getSequenceNumEnd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceNumEnd", theSequenceNumEnd), currentHashCode, theSequenceNumEnd);
        }
        {
            Long theSequenceNumStart;
            theSequenceNumStart = this.getSequenceNumStart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceNumStart", theSequenceNumStart), currentHashCode, theSequenceNumStart);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
