
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
 * <p>Java class for AlertRegion_CBM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertRegion_CBM">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}AlertRegion">
 *       &lt;sequence>
 *         &lt;element name="amplEU" type="{http://www.mimosa.org/OSACBMV3.3.1}EngUnit"/>
 *         &lt;element name="bandDelay" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="bandDelayEU" type="{http://www.mimosa.org/OSACBMV3.3.1}EngUnit" minOccurs="0"/>
 *         &lt;element name="hiLowSideUsed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hysteresisEU" type="{http://www.mimosa.org/OSACBMV3.3.1}EngUnit" minOccurs="0"/>
 *         &lt;element name="maxAmpl" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="maxAmplHysteresis" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="maxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="meas_loc_type" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="minAmpl" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="minAmplHysteresis" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="minInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="mloc_calc_type" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="regionEnum" type="{http://www.mimosa.org/OSACBMV3.3.1}EnumValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertRegion_CBM", propOrder = {
    "amplEU",
    "bandDelay",
    "bandDelayEU",
    "hiLowSideUsed",
    "hysteresisEU",
    "maxAmpl",
    "maxAmplHysteresis",
    "maxInclusive",
    "measLocType",
    "minAmpl",
    "minAmplHysteresis",
    "minInclusive",
    "mlocCalcType",
    "regionEnum"
})
public class AlertRegionCBM
    extends AlertRegion
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected EngUnit amplEU;
    protected Double bandDelay;
    protected EngUnit bandDelayEU;
    protected boolean hiLowSideUsed;
    protected EngUnit hysteresisEU;
    protected Double maxAmpl;
    protected Double maxAmplHysteresis;
    protected Boolean maxInclusive;
    @XmlElement(name = "meas_loc_type")
    protected MIMKey3 measLocType;
    protected Double minAmpl;
    protected Double minAmplHysteresis;
    protected Boolean minInclusive;
    @XmlElement(name = "mloc_calc_type")
    protected MIMKey3 mlocCalcType;
    protected EnumValue regionEnum;

    /**
     * Gets the value of the amplEU property.
     * 
     * @return
     *     possible object is
     *     {@link EngUnit }
     *     
     */
    public EngUnit getAmplEU() {
        return amplEU;
    }

    /**
     * Sets the value of the amplEU property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngUnit }
     *     
     */
    public void setAmplEU(EngUnit value) {
        this.amplEU = value;
    }

    /**
     * Gets the value of the bandDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBandDelay() {
        return bandDelay;
    }

    /**
     * Sets the value of the bandDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBandDelay(Double value) {
        this.bandDelay = value;
    }

    /**
     * Gets the value of the bandDelayEU property.
     * 
     * @return
     *     possible object is
     *     {@link EngUnit }
     *     
     */
    public EngUnit getBandDelayEU() {
        return bandDelayEU;
    }

    /**
     * Sets the value of the bandDelayEU property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngUnit }
     *     
     */
    public void setBandDelayEU(EngUnit value) {
        this.bandDelayEU = value;
    }

    /**
     * Gets the value of the hiLowSideUsed property.
     * 
     */
    public boolean isHiLowSideUsed() {
        return hiLowSideUsed;
    }

    /**
     * Sets the value of the hiLowSideUsed property.
     * 
     */
    public void setHiLowSideUsed(boolean value) {
        this.hiLowSideUsed = value;
    }

    /**
     * Gets the value of the hysteresisEU property.
     * 
     * @return
     *     possible object is
     *     {@link EngUnit }
     *     
     */
    public EngUnit getHysteresisEU() {
        return hysteresisEU;
    }

    /**
     * Sets the value of the hysteresisEU property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngUnit }
     *     
     */
    public void setHysteresisEU(EngUnit value) {
        this.hysteresisEU = value;
    }

    /**
     * Gets the value of the maxAmpl property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxAmpl() {
        return maxAmpl;
    }

    /**
     * Sets the value of the maxAmpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxAmpl(Double value) {
        this.maxAmpl = value;
    }

    /**
     * Gets the value of the maxAmplHysteresis property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxAmplHysteresis() {
        return maxAmplHysteresis;
    }

    /**
     * Sets the value of the maxAmplHysteresis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxAmplHysteresis(Double value) {
        this.maxAmplHysteresis = value;
    }

    /**
     * Gets the value of the maxInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxInclusive() {
        return maxInclusive;
    }

    /**
     * Sets the value of the maxInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxInclusive(Boolean value) {
        this.maxInclusive = value;
    }

    /**
     * Gets the value of the measLocType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getMeasLocType() {
        return measLocType;
    }

    /**
     * Sets the value of the measLocType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setMeasLocType(MIMKey3 value) {
        this.measLocType = value;
    }

    /**
     * Gets the value of the minAmpl property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinAmpl() {
        return minAmpl;
    }

    /**
     * Sets the value of the minAmpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinAmpl(Double value) {
        this.minAmpl = value;
    }

    /**
     * Gets the value of the minAmplHysteresis property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinAmplHysteresis() {
        return minAmplHysteresis;
    }

    /**
     * Sets the value of the minAmplHysteresis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinAmplHysteresis(Double value) {
        this.minAmplHysteresis = value;
    }

    /**
     * Gets the value of the minInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinInclusive() {
        return minInclusive;
    }

    /**
     * Sets the value of the minInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinInclusive(Boolean value) {
        this.minInclusive = value;
    }

    /**
     * Gets the value of the mlocCalcType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getMlocCalcType() {
        return mlocCalcType;
    }

    /**
     * Sets the value of the mlocCalcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setMlocCalcType(MIMKey3 value) {
        this.mlocCalcType = value;
    }

    /**
     * Gets the value of the regionEnum property.
     * 
     * @return
     *     possible object is
     *     {@link EnumValue }
     *     
     */
    public EnumValue getRegionEnum() {
        return regionEnum;
    }

    /**
     * Sets the value of the regionEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumValue }
     *     
     */
    public void setRegionEnum(EnumValue value) {
        this.regionEnum = value;
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
            EngUnit theAmplEU;
            theAmplEU = this.getAmplEU();
            strategy.appendField(locator, this, "amplEU", buffer, theAmplEU);
        }
        {
            Double theBandDelay;
            theBandDelay = this.getBandDelay();
            strategy.appendField(locator, this, "bandDelay", buffer, theBandDelay);
        }
        {
            EngUnit theBandDelayEU;
            theBandDelayEU = this.getBandDelayEU();
            strategy.appendField(locator, this, "bandDelayEU", buffer, theBandDelayEU);
        }
        {
            boolean theHiLowSideUsed;
            theHiLowSideUsed = (true?this.isHiLowSideUsed():false);
            strategy.appendField(locator, this, "hiLowSideUsed", buffer, theHiLowSideUsed);
        }
        {
            EngUnit theHysteresisEU;
            theHysteresisEU = this.getHysteresisEU();
            strategy.appendField(locator, this, "hysteresisEU", buffer, theHysteresisEU);
        }
        {
            Double theMaxAmpl;
            theMaxAmpl = this.getMaxAmpl();
            strategy.appendField(locator, this, "maxAmpl", buffer, theMaxAmpl);
        }
        {
            Double theMaxAmplHysteresis;
            theMaxAmplHysteresis = this.getMaxAmplHysteresis();
            strategy.appendField(locator, this, "maxAmplHysteresis", buffer, theMaxAmplHysteresis);
        }
        {
            Boolean theMaxInclusive;
            theMaxInclusive = this.isMaxInclusive();
            strategy.appendField(locator, this, "maxInclusive", buffer, theMaxInclusive);
        }
        {
            MIMKey3 theMeasLocType;
            theMeasLocType = this.getMeasLocType();
            strategy.appendField(locator, this, "measLocType", buffer, theMeasLocType);
        }
        {
            Double theMinAmpl;
            theMinAmpl = this.getMinAmpl();
            strategy.appendField(locator, this, "minAmpl", buffer, theMinAmpl);
        }
        {
            Double theMinAmplHysteresis;
            theMinAmplHysteresis = this.getMinAmplHysteresis();
            strategy.appendField(locator, this, "minAmplHysteresis", buffer, theMinAmplHysteresis);
        }
        {
            Boolean theMinInclusive;
            theMinInclusive = this.isMinInclusive();
            strategy.appendField(locator, this, "minInclusive", buffer, theMinInclusive);
        }
        {
            MIMKey3 theMlocCalcType;
            theMlocCalcType = this.getMlocCalcType();
            strategy.appendField(locator, this, "mlocCalcType", buffer, theMlocCalcType);
        }
        {
            EnumValue theRegionEnum;
            theRegionEnum = this.getRegionEnum();
            strategy.appendField(locator, this, "regionEnum", buffer, theRegionEnum);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AlertRegionCBM)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AlertRegionCBM that = ((AlertRegionCBM) object);
        {
            EngUnit lhsAmplEU;
            lhsAmplEU = this.getAmplEU();
            EngUnit rhsAmplEU;
            rhsAmplEU = that.getAmplEU();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amplEU", lhsAmplEU), LocatorUtils.property(thatLocator, "amplEU", rhsAmplEU), lhsAmplEU, rhsAmplEU)) {
                return false;
            }
        }
        {
            Double lhsBandDelay;
            lhsBandDelay = this.getBandDelay();
            Double rhsBandDelay;
            rhsBandDelay = that.getBandDelay();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bandDelay", lhsBandDelay), LocatorUtils.property(thatLocator, "bandDelay", rhsBandDelay), lhsBandDelay, rhsBandDelay)) {
                return false;
            }
        }
        {
            EngUnit lhsBandDelayEU;
            lhsBandDelayEU = this.getBandDelayEU();
            EngUnit rhsBandDelayEU;
            rhsBandDelayEU = that.getBandDelayEU();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bandDelayEU", lhsBandDelayEU), LocatorUtils.property(thatLocator, "bandDelayEU", rhsBandDelayEU), lhsBandDelayEU, rhsBandDelayEU)) {
                return false;
            }
        }
        {
            boolean lhsHiLowSideUsed;
            lhsHiLowSideUsed = (true?this.isHiLowSideUsed():false);
            boolean rhsHiLowSideUsed;
            rhsHiLowSideUsed = (true?that.isHiLowSideUsed():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hiLowSideUsed", lhsHiLowSideUsed), LocatorUtils.property(thatLocator, "hiLowSideUsed", rhsHiLowSideUsed), lhsHiLowSideUsed, rhsHiLowSideUsed)) {
                return false;
            }
        }
        {
            EngUnit lhsHysteresisEU;
            lhsHysteresisEU = this.getHysteresisEU();
            EngUnit rhsHysteresisEU;
            rhsHysteresisEU = that.getHysteresisEU();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hysteresisEU", lhsHysteresisEU), LocatorUtils.property(thatLocator, "hysteresisEU", rhsHysteresisEU), lhsHysteresisEU, rhsHysteresisEU)) {
                return false;
            }
        }
        {
            Double lhsMaxAmpl;
            lhsMaxAmpl = this.getMaxAmpl();
            Double rhsMaxAmpl;
            rhsMaxAmpl = that.getMaxAmpl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxAmpl", lhsMaxAmpl), LocatorUtils.property(thatLocator, "maxAmpl", rhsMaxAmpl), lhsMaxAmpl, rhsMaxAmpl)) {
                return false;
            }
        }
        {
            Double lhsMaxAmplHysteresis;
            lhsMaxAmplHysteresis = this.getMaxAmplHysteresis();
            Double rhsMaxAmplHysteresis;
            rhsMaxAmplHysteresis = that.getMaxAmplHysteresis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxAmplHysteresis", lhsMaxAmplHysteresis), LocatorUtils.property(thatLocator, "maxAmplHysteresis", rhsMaxAmplHysteresis), lhsMaxAmplHysteresis, rhsMaxAmplHysteresis)) {
                return false;
            }
        }
        {
            Boolean lhsMaxInclusive;
            lhsMaxInclusive = this.isMaxInclusive();
            Boolean rhsMaxInclusive;
            rhsMaxInclusive = that.isMaxInclusive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxInclusive", lhsMaxInclusive), LocatorUtils.property(thatLocator, "maxInclusive", rhsMaxInclusive), lhsMaxInclusive, rhsMaxInclusive)) {
                return false;
            }
        }
        {
            MIMKey3 lhsMeasLocType;
            lhsMeasLocType = this.getMeasLocType();
            MIMKey3 rhsMeasLocType;
            rhsMeasLocType = that.getMeasLocType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measLocType", lhsMeasLocType), LocatorUtils.property(thatLocator, "measLocType", rhsMeasLocType), lhsMeasLocType, rhsMeasLocType)) {
                return false;
            }
        }
        {
            Double lhsMinAmpl;
            lhsMinAmpl = this.getMinAmpl();
            Double rhsMinAmpl;
            rhsMinAmpl = that.getMinAmpl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minAmpl", lhsMinAmpl), LocatorUtils.property(thatLocator, "minAmpl", rhsMinAmpl), lhsMinAmpl, rhsMinAmpl)) {
                return false;
            }
        }
        {
            Double lhsMinAmplHysteresis;
            lhsMinAmplHysteresis = this.getMinAmplHysteresis();
            Double rhsMinAmplHysteresis;
            rhsMinAmplHysteresis = that.getMinAmplHysteresis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minAmplHysteresis", lhsMinAmplHysteresis), LocatorUtils.property(thatLocator, "minAmplHysteresis", rhsMinAmplHysteresis), lhsMinAmplHysteresis, rhsMinAmplHysteresis)) {
                return false;
            }
        }
        {
            Boolean lhsMinInclusive;
            lhsMinInclusive = this.isMinInclusive();
            Boolean rhsMinInclusive;
            rhsMinInclusive = that.isMinInclusive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minInclusive", lhsMinInclusive), LocatorUtils.property(thatLocator, "minInclusive", rhsMinInclusive), lhsMinInclusive, rhsMinInclusive)) {
                return false;
            }
        }
        {
            MIMKey3 lhsMlocCalcType;
            lhsMlocCalcType = this.getMlocCalcType();
            MIMKey3 rhsMlocCalcType;
            rhsMlocCalcType = that.getMlocCalcType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mlocCalcType", lhsMlocCalcType), LocatorUtils.property(thatLocator, "mlocCalcType", rhsMlocCalcType), lhsMlocCalcType, rhsMlocCalcType)) {
                return false;
            }
        }
        {
            EnumValue lhsRegionEnum;
            lhsRegionEnum = this.getRegionEnum();
            EnumValue rhsRegionEnum;
            rhsRegionEnum = that.getRegionEnum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regionEnum", lhsRegionEnum), LocatorUtils.property(thatLocator, "regionEnum", rhsRegionEnum), lhsRegionEnum, rhsRegionEnum)) {
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
            EngUnit theAmplEU;
            theAmplEU = this.getAmplEU();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amplEU", theAmplEU), currentHashCode, theAmplEU);
        }
        {
            Double theBandDelay;
            theBandDelay = this.getBandDelay();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bandDelay", theBandDelay), currentHashCode, theBandDelay);
        }
        {
            EngUnit theBandDelayEU;
            theBandDelayEU = this.getBandDelayEU();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bandDelayEU", theBandDelayEU), currentHashCode, theBandDelayEU);
        }
        {
            boolean theHiLowSideUsed;
            theHiLowSideUsed = (true?this.isHiLowSideUsed():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hiLowSideUsed", theHiLowSideUsed), currentHashCode, theHiLowSideUsed);
        }
        {
            EngUnit theHysteresisEU;
            theHysteresisEU = this.getHysteresisEU();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hysteresisEU", theHysteresisEU), currentHashCode, theHysteresisEU);
        }
        {
            Double theMaxAmpl;
            theMaxAmpl = this.getMaxAmpl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxAmpl", theMaxAmpl), currentHashCode, theMaxAmpl);
        }
        {
            Double theMaxAmplHysteresis;
            theMaxAmplHysteresis = this.getMaxAmplHysteresis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxAmplHysteresis", theMaxAmplHysteresis), currentHashCode, theMaxAmplHysteresis);
        }
        {
            Boolean theMaxInclusive;
            theMaxInclusive = this.isMaxInclusive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxInclusive", theMaxInclusive), currentHashCode, theMaxInclusive);
        }
        {
            MIMKey3 theMeasLocType;
            theMeasLocType = this.getMeasLocType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measLocType", theMeasLocType), currentHashCode, theMeasLocType);
        }
        {
            Double theMinAmpl;
            theMinAmpl = this.getMinAmpl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minAmpl", theMinAmpl), currentHashCode, theMinAmpl);
        }
        {
            Double theMinAmplHysteresis;
            theMinAmplHysteresis = this.getMinAmplHysteresis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minAmplHysteresis", theMinAmplHysteresis), currentHashCode, theMinAmplHysteresis);
        }
        {
            Boolean theMinInclusive;
            theMinInclusive = this.isMinInclusive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minInclusive", theMinInclusive), currentHashCode, theMinInclusive);
        }
        {
            MIMKey3 theMlocCalcType;
            theMlocCalcType = this.getMlocCalcType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mlocCalcType", theMlocCalcType), currentHashCode, theMlocCalcType);
        }
        {
            EnumValue theRegionEnum;
            theRegionEnum = this.getRegionEnum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "regionEnum", theRegionEnum), currentHashCode, theRegionEnum);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
