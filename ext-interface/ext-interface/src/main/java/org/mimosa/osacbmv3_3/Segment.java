
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
 * <p>Java class for Segment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Segment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}Item">
 *       &lt;sequence>
 *         &lt;element name="segmentType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="segmGroup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Segment", propOrder = {
    "segmentType",
    "segmGroup"
})
public class Segment
    extends Item
    implements Serializable, Equals, HashCode, ToString
{

    protected MIMKey3 segmentType;
    protected Boolean segmGroup;

    /**
     * Gets the value of the segmentType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getSegmentType() {
        return segmentType;
    }

    /**
     * Sets the value of the segmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setSegmentType(MIMKey3 value) {
        this.segmentType = value;
    }

    /**
     * Gets the value of the segmGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSegmGroup() {
        return segmGroup;
    }

    /**
     * Sets the value of the segmGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSegmGroup(Boolean value) {
        this.segmGroup = value;
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
            MIMKey3 theSegmentType;
            theSegmentType = this.getSegmentType();
            strategy.appendField(locator, this, "segmentType", buffer, theSegmentType);
        }
        {
            Boolean theSegmGroup;
            theSegmGroup = this.isSegmGroup();
            strategy.appendField(locator, this, "segmGroup", buffer, theSegmGroup);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Segment)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Segment that = ((Segment) object);
        {
            MIMKey3 lhsSegmentType;
            lhsSegmentType = this.getSegmentType();
            MIMKey3 rhsSegmentType;
            rhsSegmentType = that.getSegmentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "segmentType", lhsSegmentType), LocatorUtils.property(thatLocator, "segmentType", rhsSegmentType), lhsSegmentType, rhsSegmentType)) {
                return false;
            }
        }
        {
            Boolean lhsSegmGroup;
            lhsSegmGroup = this.isSegmGroup();
            Boolean rhsSegmGroup;
            rhsSegmGroup = that.isSegmGroup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "segmGroup", lhsSegmGroup), LocatorUtils.property(thatLocator, "segmGroup", rhsSegmGroup), lhsSegmGroup, rhsSegmGroup)) {
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
            MIMKey3 theSegmentType;
            theSegmentType = this.getSegmentType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "segmentType", theSegmentType), currentHashCode, theSegmentType);
        }
        {
            Boolean theSegmGroup;
            theSegmGroup = this.isSegmGroup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "segmGroup", theSegmGroup), currentHashCode, theSegmGroup);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
