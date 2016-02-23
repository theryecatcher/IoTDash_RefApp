//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 02:16:43 AM PST 
//


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
 * <p>Java class for MeasLoc_MIM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasLoc_MIM">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}MeasLoc">
 *       &lt;sequence>
 *         &lt;element name="asset" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey2" minOccurs="0"/>
 *         &lt;element name="barCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collect_duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="collectEU" type="{http://www.mimosa.org/OSACBMV3.3.1}EngUnit" minOccurs="0"/>
 *         &lt;element name="dataSrc" type="{http://www.mimosa.org/OSACBMV3.3.1}DataSourceMeasInfo" minOccurs="0"/>
 *         &lt;element name="mim_user_prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segment" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey2" minOccurs="0"/>
 *         &lt;element name="segOrAs" type="{http://www.mimosa.org/OSACBMV3.3.1}SegOrAs"/>
 *         &lt;element name="transd" type="{http://www.mimosa.org/OSACBMV3.3.1}TransducerMeasInfo" minOccurs="0"/>
 *         &lt;element name="update_interval" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="updateEU" type="{http://www.mimosa.org/OSACBMV3.3.1}EngUnit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasLoc_MIM", propOrder = {
    "asset",
    "barCode",
    "collectDuration",
    "collectEU",
    "dataSrc",
    "mimUserPrefix",
    "segment",
    "segOrAs",
    "transd",
    "updateInterval",
    "updateEU"
})
public class MeasLocMIM
    extends MeasLoc
    implements Serializable, Equals, HashCode, ToString
{

    protected MIMKey2 asset;
    protected String barCode;
    @XmlElement(name = "collect_duration")
    protected Integer collectDuration;
    protected EngUnit collectEU;
    protected DataSourceMeasInfo dataSrc;
    @XmlElement(name = "mim_user_prefix")
    protected String mimUserPrefix;
    protected MIMKey2 segment;
    @XmlElement(required = true)
    protected SegOrAs segOrAs;
    protected TransducerMeasInfo transd;
    @XmlElement(name = "update_interval")
    protected Double updateInterval;
    protected EngUnit updateEU;

    /**
     * Gets the value of the asset property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey2 }
     *     
     */
    public MIMKey2 getAsset() {
        return asset;
    }

    /**
     * Sets the value of the asset property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey2 }
     *     
     */
    public void setAsset(MIMKey2 value) {
        this.asset = value;
    }

    /**
     * Gets the value of the barCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * Sets the value of the barCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCode(String value) {
        this.barCode = value;
    }

    /**
     * Gets the value of the collectDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCollectDuration() {
        return collectDuration;
    }

    /**
     * Sets the value of the collectDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCollectDuration(Integer value) {
        this.collectDuration = value;
    }

    /**
     * Gets the value of the collectEU property.
     * 
     * @return
     *     possible object is
     *     {@link EngUnit }
     *     
     */
    public EngUnit getCollectEU() {
        return collectEU;
    }

    /**
     * Sets the value of the collectEU property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngUnit }
     *     
     */
    public void setCollectEU(EngUnit value) {
        this.collectEU = value;
    }

    /**
     * Gets the value of the dataSrc property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceMeasInfo }
     *     
     */
    public DataSourceMeasInfo getDataSrc() {
        return dataSrc;
    }

    /**
     * Sets the value of the dataSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceMeasInfo }
     *     
     */
    public void setDataSrc(DataSourceMeasInfo value) {
        this.dataSrc = value;
    }

    /**
     * Gets the value of the mimUserPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimUserPrefix() {
        return mimUserPrefix;
    }

    /**
     * Sets the value of the mimUserPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimUserPrefix(String value) {
        this.mimUserPrefix = value;
    }

    /**
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey2 }
     *     
     */
    public MIMKey2 getSegment() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey2 }
     *     
     */
    public void setSegment(MIMKey2 value) {
        this.segment = value;
    }

    /**
     * Gets the value of the segOrAs property.
     * 
     * @return
     *     possible object is
     *     {@link SegOrAs }
     *     
     */
    public SegOrAs getSegOrAs() {
        return segOrAs;
    }

    /**
     * Sets the value of the segOrAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegOrAs }
     *     
     */
    public void setSegOrAs(SegOrAs value) {
        this.segOrAs = value;
    }

    /**
     * Gets the value of the transd property.
     * 
     * @return
     *     possible object is
     *     {@link TransducerMeasInfo }
     *     
     */
    public TransducerMeasInfo getTransd() {
        return transd;
    }

    /**
     * Sets the value of the transd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransducerMeasInfo }
     *     
     */
    public void setTransd(TransducerMeasInfo value) {
        this.transd = value;
    }

    /**
     * Gets the value of the updateInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUpdateInterval() {
        return updateInterval;
    }

    /**
     * Sets the value of the updateInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUpdateInterval(Double value) {
        this.updateInterval = value;
    }

    /**
     * Gets the value of the updateEU property.
     * 
     * @return
     *     possible object is
     *     {@link EngUnit }
     *     
     */
    public EngUnit getUpdateEU() {
        return updateEU;
    }

    /**
     * Sets the value of the updateEU property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngUnit }
     *     
     */
    public void setUpdateEU(EngUnit value) {
        this.updateEU = value;
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
            MIMKey2 theAsset;
            theAsset = this.getAsset();
            strategy.appendField(locator, this, "asset", buffer, theAsset);
        }
        {
            String theBarCode;
            theBarCode = this.getBarCode();
            strategy.appendField(locator, this, "barCode", buffer, theBarCode);
        }
        {
            Integer theCollectDuration;
            theCollectDuration = this.getCollectDuration();
            strategy.appendField(locator, this, "collectDuration", buffer, theCollectDuration);
        }
        {
            EngUnit theCollectEU;
            theCollectEU = this.getCollectEU();
            strategy.appendField(locator, this, "collectEU", buffer, theCollectEU);
        }
        {
            DataSourceMeasInfo theDataSrc;
            theDataSrc = this.getDataSrc();
            strategy.appendField(locator, this, "dataSrc", buffer, theDataSrc);
        }
        {
            String theMimUserPrefix;
            theMimUserPrefix = this.getMimUserPrefix();
            strategy.appendField(locator, this, "mimUserPrefix", buffer, theMimUserPrefix);
        }
        {
            MIMKey2 theSegment;
            theSegment = this.getSegment();
            strategy.appendField(locator, this, "segment", buffer, theSegment);
        }
        {
            SegOrAs theSegOrAs;
            theSegOrAs = this.getSegOrAs();
            strategy.appendField(locator, this, "segOrAs", buffer, theSegOrAs);
        }
        {
            TransducerMeasInfo theTransd;
            theTransd = this.getTransd();
            strategy.appendField(locator, this, "transd", buffer, theTransd);
        }
        {
            Double theUpdateInterval;
            theUpdateInterval = this.getUpdateInterval();
            strategy.appendField(locator, this, "updateInterval", buffer, theUpdateInterval);
        }
        {
            EngUnit theUpdateEU;
            theUpdateEU = this.getUpdateEU();
            strategy.appendField(locator, this, "updateEU", buffer, theUpdateEU);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MeasLocMIM)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MeasLocMIM that = ((MeasLocMIM) object);
        {
            MIMKey2 lhsAsset;
            lhsAsset = this.getAsset();
            MIMKey2 rhsAsset;
            rhsAsset = that.getAsset();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "asset", lhsAsset), LocatorUtils.property(thatLocator, "asset", rhsAsset), lhsAsset, rhsAsset)) {
                return false;
            }
        }
        {
            String lhsBarCode;
            lhsBarCode = this.getBarCode();
            String rhsBarCode;
            rhsBarCode = that.getBarCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "barCode", lhsBarCode), LocatorUtils.property(thatLocator, "barCode", rhsBarCode), lhsBarCode, rhsBarCode)) {
                return false;
            }
        }
        {
            Integer lhsCollectDuration;
            lhsCollectDuration = this.getCollectDuration();
            Integer rhsCollectDuration;
            rhsCollectDuration = that.getCollectDuration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "collectDuration", lhsCollectDuration), LocatorUtils.property(thatLocator, "collectDuration", rhsCollectDuration), lhsCollectDuration, rhsCollectDuration)) {
                return false;
            }
        }
        {
            EngUnit lhsCollectEU;
            lhsCollectEU = this.getCollectEU();
            EngUnit rhsCollectEU;
            rhsCollectEU = that.getCollectEU();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "collectEU", lhsCollectEU), LocatorUtils.property(thatLocator, "collectEU", rhsCollectEU), lhsCollectEU, rhsCollectEU)) {
                return false;
            }
        }
        {
            DataSourceMeasInfo lhsDataSrc;
            lhsDataSrc = this.getDataSrc();
            DataSourceMeasInfo rhsDataSrc;
            rhsDataSrc = that.getDataSrc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataSrc", lhsDataSrc), LocatorUtils.property(thatLocator, "dataSrc", rhsDataSrc), lhsDataSrc, rhsDataSrc)) {
                return false;
            }
        }
        {
            String lhsMimUserPrefix;
            lhsMimUserPrefix = this.getMimUserPrefix();
            String rhsMimUserPrefix;
            rhsMimUserPrefix = that.getMimUserPrefix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mimUserPrefix", lhsMimUserPrefix), LocatorUtils.property(thatLocator, "mimUserPrefix", rhsMimUserPrefix), lhsMimUserPrefix, rhsMimUserPrefix)) {
                return false;
            }
        }
        {
            MIMKey2 lhsSegment;
            lhsSegment = this.getSegment();
            MIMKey2 rhsSegment;
            rhsSegment = that.getSegment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "segment", lhsSegment), LocatorUtils.property(thatLocator, "segment", rhsSegment), lhsSegment, rhsSegment)) {
                return false;
            }
        }
        {
            SegOrAs lhsSegOrAs;
            lhsSegOrAs = this.getSegOrAs();
            SegOrAs rhsSegOrAs;
            rhsSegOrAs = that.getSegOrAs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "segOrAs", lhsSegOrAs), LocatorUtils.property(thatLocator, "segOrAs", rhsSegOrAs), lhsSegOrAs, rhsSegOrAs)) {
                return false;
            }
        }
        {
            TransducerMeasInfo lhsTransd;
            lhsTransd = this.getTransd();
            TransducerMeasInfo rhsTransd;
            rhsTransd = that.getTransd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transd", lhsTransd), LocatorUtils.property(thatLocator, "transd", rhsTransd), lhsTransd, rhsTransd)) {
                return false;
            }
        }
        {
            Double lhsUpdateInterval;
            lhsUpdateInterval = this.getUpdateInterval();
            Double rhsUpdateInterval;
            rhsUpdateInterval = that.getUpdateInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updateInterval", lhsUpdateInterval), LocatorUtils.property(thatLocator, "updateInterval", rhsUpdateInterval), lhsUpdateInterval, rhsUpdateInterval)) {
                return false;
            }
        }
        {
            EngUnit lhsUpdateEU;
            lhsUpdateEU = this.getUpdateEU();
            EngUnit rhsUpdateEU;
            rhsUpdateEU = that.getUpdateEU();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updateEU", lhsUpdateEU), LocatorUtils.property(thatLocator, "updateEU", rhsUpdateEU), lhsUpdateEU, rhsUpdateEU)) {
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
            MIMKey2 theAsset;
            theAsset = this.getAsset();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "asset", theAsset), currentHashCode, theAsset);
        }
        {
            String theBarCode;
            theBarCode = this.getBarCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "barCode", theBarCode), currentHashCode, theBarCode);
        }
        {
            Integer theCollectDuration;
            theCollectDuration = this.getCollectDuration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "collectDuration", theCollectDuration), currentHashCode, theCollectDuration);
        }
        {
            EngUnit theCollectEU;
            theCollectEU = this.getCollectEU();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "collectEU", theCollectEU), currentHashCode, theCollectEU);
        }
        {
            DataSourceMeasInfo theDataSrc;
            theDataSrc = this.getDataSrc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataSrc", theDataSrc), currentHashCode, theDataSrc);
        }
        {
            String theMimUserPrefix;
            theMimUserPrefix = this.getMimUserPrefix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mimUserPrefix", theMimUserPrefix), currentHashCode, theMimUserPrefix);
        }
        {
            MIMKey2 theSegment;
            theSegment = this.getSegment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "segment", theSegment), currentHashCode, theSegment);
        }
        {
            SegOrAs theSegOrAs;
            theSegOrAs = this.getSegOrAs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "segOrAs", theSegOrAs), currentHashCode, theSegOrAs);
        }
        {
            TransducerMeasInfo theTransd;
            theTransd = this.getTransd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transd", theTransd), currentHashCode, theTransd);
        }
        {
            Double theUpdateInterval;
            theUpdateInterval = this.getUpdateInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateInterval", theUpdateInterval), currentHashCode, theUpdateInterval);
        }
        {
            EngUnit theUpdateEU;
            theUpdateEU = this.getUpdateEU();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateEU", theUpdateEU), currentHashCode, theUpdateEU);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
