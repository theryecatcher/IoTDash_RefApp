
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
 * <p>Java class for TransducerMeasInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransducerMeasInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mim_loc_seq" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="motion_direction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ta_orient_deg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="transdType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3"/>
 *         &lt;element name="trAxDirType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransducerMeasInfo", propOrder = {
    "mimLocSeq",
    "motionDirection",
    "taOrientDeg",
    "transdType",
    "trAxDirType"
})
public class TransducerMeasInfo
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(name = "mim_loc_seq")
    @XmlSchemaType(name = "unsignedInt")
    protected Long mimLocSeq;
    @XmlElement(name = "motion_direction")
    protected String motionDirection;
    @XmlElement(name = "ta_orient_deg")
    protected Integer taOrientDeg;
    @XmlElement(required = true)
    protected MIMKey3 transdType;
    protected MIMKey3 trAxDirType;

    /**
     * Gets the value of the mimLocSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMimLocSeq() {
        return mimLocSeq;
    }

    /**
     * Sets the value of the mimLocSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMimLocSeq(Long value) {
        this.mimLocSeq = value;
    }

    /**
     * Gets the value of the motionDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotionDirection() {
        return motionDirection;
    }

    /**
     * Sets the value of the motionDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotionDirection(String value) {
        this.motionDirection = value;
    }

    /**
     * Gets the value of the taOrientDeg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaOrientDeg() {
        return taOrientDeg;
    }

    /**
     * Sets the value of the taOrientDeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaOrientDeg(Integer value) {
        this.taOrientDeg = value;
    }

    /**
     * Gets the value of the transdType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getTransdType() {
        return transdType;
    }

    /**
     * Sets the value of the transdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setTransdType(MIMKey3 value) {
        this.transdType = value;
    }

    /**
     * Gets the value of the trAxDirType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getTrAxDirType() {
        return trAxDirType;
    }

    /**
     * Sets the value of the trAxDirType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setTrAxDirType(MIMKey3 value) {
        this.trAxDirType = value;
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
            Long theMimLocSeq;
            theMimLocSeq = this.getMimLocSeq();
            strategy.appendField(locator, this, "mimLocSeq", buffer, theMimLocSeq);
        }
        {
            String theMotionDirection;
            theMotionDirection = this.getMotionDirection();
            strategy.appendField(locator, this, "motionDirection", buffer, theMotionDirection);
        }
        {
            Integer theTaOrientDeg;
            theTaOrientDeg = this.getTaOrientDeg();
            strategy.appendField(locator, this, "taOrientDeg", buffer, theTaOrientDeg);
        }
        {
            MIMKey3 theTransdType;
            theTransdType = this.getTransdType();
            strategy.appendField(locator, this, "transdType", buffer, theTransdType);
        }
        {
            MIMKey3 theTrAxDirType;
            theTrAxDirType = this.getTrAxDirType();
            strategy.appendField(locator, this, "trAxDirType", buffer, theTrAxDirType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TransducerMeasInfo)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TransducerMeasInfo that = ((TransducerMeasInfo) object);
        {
            Long lhsMimLocSeq;
            lhsMimLocSeq = this.getMimLocSeq();
            Long rhsMimLocSeq;
            rhsMimLocSeq = that.getMimLocSeq();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mimLocSeq", lhsMimLocSeq), LocatorUtils.property(thatLocator, "mimLocSeq", rhsMimLocSeq), lhsMimLocSeq, rhsMimLocSeq)) {
                return false;
            }
        }
        {
            String lhsMotionDirection;
            lhsMotionDirection = this.getMotionDirection();
            String rhsMotionDirection;
            rhsMotionDirection = that.getMotionDirection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "motionDirection", lhsMotionDirection), LocatorUtils.property(thatLocator, "motionDirection", rhsMotionDirection), lhsMotionDirection, rhsMotionDirection)) {
                return false;
            }
        }
        {
            Integer lhsTaOrientDeg;
            lhsTaOrientDeg = this.getTaOrientDeg();
            Integer rhsTaOrientDeg;
            rhsTaOrientDeg = that.getTaOrientDeg();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taOrientDeg", lhsTaOrientDeg), LocatorUtils.property(thatLocator, "taOrientDeg", rhsTaOrientDeg), lhsTaOrientDeg, rhsTaOrientDeg)) {
                return false;
            }
        }
        {
            MIMKey3 lhsTransdType;
            lhsTransdType = this.getTransdType();
            MIMKey3 rhsTransdType;
            rhsTransdType = that.getTransdType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transdType", lhsTransdType), LocatorUtils.property(thatLocator, "transdType", rhsTransdType), lhsTransdType, rhsTransdType)) {
                return false;
            }
        }
        {
            MIMKey3 lhsTrAxDirType;
            lhsTrAxDirType = this.getTrAxDirType();
            MIMKey3 rhsTrAxDirType;
            rhsTrAxDirType = that.getTrAxDirType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trAxDirType", lhsTrAxDirType), LocatorUtils.property(thatLocator, "trAxDirType", rhsTrAxDirType), lhsTrAxDirType, rhsTrAxDirType)) {
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
            Long theMimLocSeq;
            theMimLocSeq = this.getMimLocSeq();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mimLocSeq", theMimLocSeq), currentHashCode, theMimLocSeq);
        }
        {
            String theMotionDirection;
            theMotionDirection = this.getMotionDirection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "motionDirection", theMotionDirection), currentHashCode, theMotionDirection);
        }
        {
            Integer theTaOrientDeg;
            theTaOrientDeg = this.getTaOrientDeg();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taOrientDeg", theTaOrientDeg), currentHashCode, theTaOrientDeg);
        }
        {
            MIMKey3 theTransdType;
            theTransdType = this.getTransdType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transdType", theTransdType), currentHashCode, theTransdType);
        }
        {
            MIMKey3 theTrAxDirType;
            theTrAxDirType = this.getTrAxDirType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trAxDirType", theTrAxDirType), currentHashCode, theTrAxDirType);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
