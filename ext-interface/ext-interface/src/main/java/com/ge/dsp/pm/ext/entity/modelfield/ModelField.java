
package com.ge.dsp.pm.ext.entity.modelfield;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.app.appidentifier.AppIdentifier;
import com.ge.dsp.pm.ext.entity.engunit.EngUnit;
import com.ge.dsp.pm.ext.entity.field.Field;
import com.ge.dsp.pm.ext.entity.solution.identifier.solutionidentifier.SolutionIdentifier;
import com.ge.dsp.pm.ext.entity.sourceinfo.SourceInfo;
import com.ge.dsp.pm.ext.entity.strategy.Strategy;
import com.ge.dsp.pm.ext.entity.tenant.tenantidentifier.TenantIdentifier;
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
 * <p>Java class for ModelField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModelField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tenantIdentifier" type="{http://dsp.ge.com/pm/ext/entity/tenant/tenantidentifier}TenantIdentifier" minOccurs="0"/>
 *         &lt;element name="appIdentifier" type="{http://dsp.ge.com/pm/ext/entity/app/appidentifier}AppIdentifier" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/solution/identifier/solutionidentifier}solutionIdentifier" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/field}field"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/strategy}strategy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/sourceinfo}sourceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="engUnit" type="{http://dsp.ge.com/pm/ext/entity/engunit}EngUnit" minOccurs="0"/>
 *         &lt;element name="map" type="{http://dsp.ge.com/pm/ext/entity/util/map}Map" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelField", propOrder = {
    "tenantIdentifier",
    "appIdentifier",
    "solutionIdentifier",
    "field",
    "strategy",
    "sourceInfo",
    "engUnit",
    "map"
})
public class ModelField
    implements Serializable, Equals, HashCode, ToString
{

    protected TenantIdentifier tenantIdentifier;
    protected AppIdentifier appIdentifier;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/solution/identifier/solutionidentifier")
    protected SolutionIdentifier solutionIdentifier;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/field", required = true)
    protected Field field;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/strategy")
    protected List<Strategy> strategy;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/sourceinfo")
    protected List<SourceInfo> sourceInfo;
    protected EngUnit engUnit;
    protected Map map;

    /**
     * Gets the value of the tenantIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link TenantIdentifier }
     *     
     */
    public TenantIdentifier getTenantIdentifier() {
        return tenantIdentifier;
    }

    /**
     * Sets the value of the tenantIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenantIdentifier }
     *     
     */
    public void setTenantIdentifier(TenantIdentifier value) {
        this.tenantIdentifier = value;
    }

    /**
     * Gets the value of the appIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link AppIdentifier }
     *     
     */
    public AppIdentifier getAppIdentifier() {
        return appIdentifier;
    }

    /**
     * Sets the value of the appIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppIdentifier }
     *     
     */
    public void setAppIdentifier(AppIdentifier value) {
        this.appIdentifier = value;
    }

    /**
     * Gets the value of the solutionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SolutionIdentifier }
     *     
     */
    public SolutionIdentifier getSolutionIdentifier() {
        return solutionIdentifier;
    }

    /**
     * Sets the value of the solutionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionIdentifier }
     *     
     */
    public void setSolutionIdentifier(SolutionIdentifier value) {
        this.solutionIdentifier = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setField(Field value) {
        this.field = value;
    }

    /**
     * Gets the value of the strategy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strategy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrategy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Strategy }
     * 
     * 
     */
    public List<Strategy> getStrategy() {
        if (strategy == null) {
            strategy = new ArrayList<Strategy>();
        }
        return this.strategy;
    }

    /**
     * Gets the value of the sourceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceInfo }
     * 
     * 
     */
    public List<SourceInfo> getSourceInfo() {
        if (sourceInfo == null) {
            sourceInfo = new ArrayList<SourceInfo>();
        }
        return this.sourceInfo;
    }

    /**
     * Gets the value of the engUnit property.
     * 
     * @return
     *     possible object is
     *     {@link EngUnit }
     *     
     */
    public EngUnit getEngUnit() {
        return engUnit;
    }

    /**
     * Sets the value of the engUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngUnit }
     *     
     */
    public void setEngUnit(EngUnit value) {
        this.engUnit = value;
    }

    /**
     * Gets the value of the map property.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getMap() {
        return map;
    }

    /**
     * Sets the value of the map property.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setMap(Map value) {
        this.map = value;
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
            TenantIdentifier theTenantIdentifier;
            theTenantIdentifier = this.getTenantIdentifier();
            strategy.appendField(locator, this, "tenantIdentifier", buffer, theTenantIdentifier);
        }
        {
            AppIdentifier theAppIdentifier;
            theAppIdentifier = this.getAppIdentifier();
            strategy.appendField(locator, this, "appIdentifier", buffer, theAppIdentifier);
        }
        {
            SolutionIdentifier theSolutionIdentifier;
            theSolutionIdentifier = this.getSolutionIdentifier();
            strategy.appendField(locator, this, "solutionIdentifier", buffer, theSolutionIdentifier);
        }
        {
            Field theField;
            theField = this.getField();
            strategy.appendField(locator, this, "field", buffer, theField);
        }
        {
            List<Strategy> theStrategy;
            theStrategy = (((this.strategy!= null)&&(!this.strategy.isEmpty()))?this.getStrategy():null);
            strategy.appendField(locator, this, "strategy", buffer, theStrategy);
        }
        {
            List<SourceInfo> theSourceInfo;
            theSourceInfo = (((this.sourceInfo!= null)&&(!this.sourceInfo.isEmpty()))?this.getSourceInfo():null);
            strategy.appendField(locator, this, "sourceInfo", buffer, theSourceInfo);
        }
        {
            EngUnit theEngUnit;
            theEngUnit = this.getEngUnit();
            strategy.appendField(locator, this, "engUnit", buffer, theEngUnit);
        }
        {
            Map theMap;
            theMap = this.getMap();
            strategy.appendField(locator, this, "map", buffer, theMap);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ModelField)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ModelField that = ((ModelField) object);
        {
            TenantIdentifier lhsTenantIdentifier;
            lhsTenantIdentifier = this.getTenantIdentifier();
            TenantIdentifier rhsTenantIdentifier;
            rhsTenantIdentifier = that.getTenantIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tenantIdentifier", lhsTenantIdentifier), LocatorUtils.property(thatLocator, "tenantIdentifier", rhsTenantIdentifier), lhsTenantIdentifier, rhsTenantIdentifier)) {
                return false;
            }
        }
        {
            AppIdentifier lhsAppIdentifier;
            lhsAppIdentifier = this.getAppIdentifier();
            AppIdentifier rhsAppIdentifier;
            rhsAppIdentifier = that.getAppIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "appIdentifier", lhsAppIdentifier), LocatorUtils.property(thatLocator, "appIdentifier", rhsAppIdentifier), lhsAppIdentifier, rhsAppIdentifier)) {
                return false;
            }
        }
        {
            SolutionIdentifier lhsSolutionIdentifier;
            lhsSolutionIdentifier = this.getSolutionIdentifier();
            SolutionIdentifier rhsSolutionIdentifier;
            rhsSolutionIdentifier = that.getSolutionIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "solutionIdentifier", lhsSolutionIdentifier), LocatorUtils.property(thatLocator, "solutionIdentifier", rhsSolutionIdentifier), lhsSolutionIdentifier, rhsSolutionIdentifier)) {
                return false;
            }
        }
        {
            Field lhsField;
            lhsField = this.getField();
            Field rhsField;
            rhsField = that.getField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "field", lhsField), LocatorUtils.property(thatLocator, "field", rhsField), lhsField, rhsField)) {
                return false;
            }
        }
        {
            List<Strategy> lhsStrategy;
            lhsStrategy = (((this.strategy!= null)&&(!this.strategy.isEmpty()))?this.getStrategy():null);
            List<Strategy> rhsStrategy;
            rhsStrategy = (((that.strategy!= null)&&(!that.strategy.isEmpty()))?that.getStrategy():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strategy", lhsStrategy), LocatorUtils.property(thatLocator, "strategy", rhsStrategy), lhsStrategy, rhsStrategy)) {
                return false;
            }
        }
        {
            List<SourceInfo> lhsSourceInfo;
            lhsSourceInfo = (((this.sourceInfo!= null)&&(!this.sourceInfo.isEmpty()))?this.getSourceInfo():null);
            List<SourceInfo> rhsSourceInfo;
            rhsSourceInfo = (((that.sourceInfo!= null)&&(!that.sourceInfo.isEmpty()))?that.getSourceInfo():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceInfo", lhsSourceInfo), LocatorUtils.property(thatLocator, "sourceInfo", rhsSourceInfo), lhsSourceInfo, rhsSourceInfo)) {
                return false;
            }
        }
        {
            EngUnit lhsEngUnit;
            lhsEngUnit = this.getEngUnit();
            EngUnit rhsEngUnit;
            rhsEngUnit = that.getEngUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "engUnit", lhsEngUnit), LocatorUtils.property(thatLocator, "engUnit", rhsEngUnit), lhsEngUnit, rhsEngUnit)) {
                return false;
            }
        }
        {
            Map lhsMap;
            lhsMap = this.getMap();
            Map rhsMap;
            rhsMap = that.getMap();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "map", lhsMap), LocatorUtils.property(thatLocator, "map", rhsMap), lhsMap, rhsMap)) {
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
            TenantIdentifier theTenantIdentifier;
            theTenantIdentifier = this.getTenantIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tenantIdentifier", theTenantIdentifier), currentHashCode, theTenantIdentifier);
        }
        {
            AppIdentifier theAppIdentifier;
            theAppIdentifier = this.getAppIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "appIdentifier", theAppIdentifier), currentHashCode, theAppIdentifier);
        }
        {
            SolutionIdentifier theSolutionIdentifier;
            theSolutionIdentifier = this.getSolutionIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "solutionIdentifier", theSolutionIdentifier), currentHashCode, theSolutionIdentifier);
        }
        {
            Field theField;
            theField = this.getField();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "field", theField), currentHashCode, theField);
        }
        {
            List<Strategy> theStrategy;
            theStrategy = (((this.strategy!= null)&&(!this.strategy.isEmpty()))?this.getStrategy():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strategy", theStrategy), currentHashCode, theStrategy);
        }
        {
            List<SourceInfo> theSourceInfo;
            theSourceInfo = (((this.sourceInfo!= null)&&(!this.sourceInfo.isEmpty()))?this.getSourceInfo():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceInfo", theSourceInfo), currentHashCode, theSourceInfo);
        }
        {
            EngUnit theEngUnit;
            theEngUnit = this.getEngUnit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "engUnit", theEngUnit), currentHashCode, theEngUnit);
        }
        {
            Map theMap;
            theMap = this.getMap();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "map", theMap), currentHashCode, theMap);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
