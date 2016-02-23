
package com.ge.dsp.pm.ext.entity.sourceinfo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.property.Property;
import com.ge.dsp.pm.ext.entity.source.Source;
import com.ge.dsp.pm.ext.entity.sourceinfo.sourceinfoidentifier.SourceInfoIdentifier;
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
 * <p>Java class for SourceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/sourceinfo/sourceinfoidentifier}sourceInfoIdentifier" minOccurs="0"/>
 *         &lt;element name="source" type="{http://dsp.ge.com/pm/ext/entity/source}Source" minOccurs="0"/>
 *         &lt;element name="property" type="{http://dsp.ge.com/pm/ext/entity/property}Property" minOccurs="0"/>
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryKeyProperty" type="{http://dsp.ge.com/pm/ext/entity/property}Property" minOccurs="0"/>
 *         &lt;element name="timeProperty" type="{http://dsp.ge.com/pm/ext/entity/property}Property" minOccurs="0"/>
 *         &lt;element name="joinProperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourcecodeProperty" type="{http://dsp.ge.com/pm/ext/entity/property}Property" minOccurs="0"/>
 *         &lt;element name="referenceProperty" type="{http://dsp.ge.com/pm/ext/entity/property}Property" minOccurs="0"/>
 *         &lt;element name="discriminatorPropertyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discriminatorValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="queryDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updateDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/util/map}map" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceInfo", propOrder = {
    "sourceInfoIdentifier",
    "source",
    "property",
    "alias",
    "primaryKeyProperty",
    "timeProperty",
    "joinProperty",
    "sourcecodeProperty",
    "referenceProperty",
    "discriminatorPropertyName",
    "discriminatorValue",
    "queryDetail",
    "updateDetail",
    "map"
})
public class SourceInfo
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/sourceinfo/sourceinfoidentifier")
    protected SourceInfoIdentifier sourceInfoIdentifier;
    protected Source source;
    protected Property property;
    protected String alias;
    protected Property primaryKeyProperty;
    protected Property timeProperty;
    protected String joinProperty;
    protected Property sourcecodeProperty;
    protected Property referenceProperty;
    protected String discriminatorPropertyName;
    protected String discriminatorValue;
    protected String queryDetail;
    protected String updateDetail;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/util/map")
    protected Map map;

    /**
     * Gets the value of the sourceInfoIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SourceInfoIdentifier }
     *     
     */
    public SourceInfoIdentifier getSourceInfoIdentifier() {
        return sourceInfoIdentifier;
    }

    /**
     * Sets the value of the sourceInfoIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceInfoIdentifier }
     *     
     */
    public void setSourceInfoIdentifier(SourceInfoIdentifier value) {
        this.sourceInfoIdentifier = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    public Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    public void setSource(Source value) {
        this.source = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link Property }
     *     
     */
    public Property getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link Property }
     *     
     */
    public void setProperty(Property value) {
        this.property = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the primaryKeyProperty property.
     * 
     * @return
     *     possible object is
     *     {@link Property }
     *     
     */
    public Property getPrimaryKeyProperty() {
        return primaryKeyProperty;
    }

    /**
     * Sets the value of the primaryKeyProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Property }
     *     
     */
    public void setPrimaryKeyProperty(Property value) {
        this.primaryKeyProperty = value;
    }

    /**
     * Gets the value of the timeProperty property.
     * 
     * @return
     *     possible object is
     *     {@link Property }
     *     
     */
    public Property getTimeProperty() {
        return timeProperty;
    }

    /**
     * Sets the value of the timeProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Property }
     *     
     */
    public void setTimeProperty(Property value) {
        this.timeProperty = value;
    }

    /**
     * Gets the value of the joinProperty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJoinProperty() {
        return joinProperty;
    }

    /**
     * Sets the value of the joinProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJoinProperty(String value) {
        this.joinProperty = value;
    }

    /**
     * Gets the value of the sourcecodeProperty property.
     * 
     * @return
     *     possible object is
     *     {@link Property }
     *     
     */
    public Property getSourcecodeProperty() {
        return sourcecodeProperty;
    }

    /**
     * Sets the value of the sourcecodeProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Property }
     *     
     */
    public void setSourcecodeProperty(Property value) {
        this.sourcecodeProperty = value;
    }

    /**
     * Gets the value of the referenceProperty property.
     * 
     * @return
     *     possible object is
     *     {@link Property }
     *     
     */
    public Property getReferenceProperty() {
        return referenceProperty;
    }

    /**
     * Sets the value of the referenceProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Property }
     *     
     */
    public void setReferenceProperty(Property value) {
        this.referenceProperty = value;
    }

    /**
     * Gets the value of the discriminatorPropertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscriminatorPropertyName() {
        return discriminatorPropertyName;
    }

    /**
     * Sets the value of the discriminatorPropertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscriminatorPropertyName(String value) {
        this.discriminatorPropertyName = value;
    }

    /**
     * Gets the value of the discriminatorValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscriminatorValue() {
        return discriminatorValue;
    }

    /**
     * Sets the value of the discriminatorValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscriminatorValue(String value) {
        this.discriminatorValue = value;
    }

    /**
     * Gets the value of the queryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryDetail() {
        return queryDetail;
    }

    /**
     * Sets the value of the queryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryDetail(String value) {
        this.queryDetail = value;
    }

    /**
     * Gets the value of the updateDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateDetail() {
        return updateDetail;
    }

    /**
     * Sets the value of the updateDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDetail(String value) {
        this.updateDetail = value;
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
            SourceInfoIdentifier theSourceInfoIdentifier;
            theSourceInfoIdentifier = this.getSourceInfoIdentifier();
            strategy.appendField(locator, this, "sourceInfoIdentifier", buffer, theSourceInfoIdentifier);
        }
        {
            Source theSource;
            theSource = this.getSource();
            strategy.appendField(locator, this, "source", buffer, theSource);
        }
        {
            Property theProperty;
            theProperty = this.getProperty();
            strategy.appendField(locator, this, "property", buffer, theProperty);
        }
        {
            String theAlias;
            theAlias = this.getAlias();
            strategy.appendField(locator, this, "alias", buffer, theAlias);
        }
        {
            Property thePrimaryKeyProperty;
            thePrimaryKeyProperty = this.getPrimaryKeyProperty();
            strategy.appendField(locator, this, "primaryKeyProperty", buffer, thePrimaryKeyProperty);
        }
        {
            Property theTimeProperty;
            theTimeProperty = this.getTimeProperty();
            strategy.appendField(locator, this, "timeProperty", buffer, theTimeProperty);
        }
        {
            String theJoinProperty;
            theJoinProperty = this.getJoinProperty();
            strategy.appendField(locator, this, "joinProperty", buffer, theJoinProperty);
        }
        {
            Property theSourcecodeProperty;
            theSourcecodeProperty = this.getSourcecodeProperty();
            strategy.appendField(locator, this, "sourcecodeProperty", buffer, theSourcecodeProperty);
        }
        {
            Property theReferenceProperty;
            theReferenceProperty = this.getReferenceProperty();
            strategy.appendField(locator, this, "referenceProperty", buffer, theReferenceProperty);
        }
        {
            String theDiscriminatorPropertyName;
            theDiscriminatorPropertyName = this.getDiscriminatorPropertyName();
            strategy.appendField(locator, this, "discriminatorPropertyName", buffer, theDiscriminatorPropertyName);
        }
        {
            String theDiscriminatorValue;
            theDiscriminatorValue = this.getDiscriminatorValue();
            strategy.appendField(locator, this, "discriminatorValue", buffer, theDiscriminatorValue);
        }
        {
            String theQueryDetail;
            theQueryDetail = this.getQueryDetail();
            strategy.appendField(locator, this, "queryDetail", buffer, theQueryDetail);
        }
        {
            String theUpdateDetail;
            theUpdateDetail = this.getUpdateDetail();
            strategy.appendField(locator, this, "updateDetail", buffer, theUpdateDetail);
        }
        {
            Map theMap;
            theMap = this.getMap();
            strategy.appendField(locator, this, "map", buffer, theMap);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SourceInfo)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SourceInfo that = ((SourceInfo) object);
        {
            SourceInfoIdentifier lhsSourceInfoIdentifier;
            lhsSourceInfoIdentifier = this.getSourceInfoIdentifier();
            SourceInfoIdentifier rhsSourceInfoIdentifier;
            rhsSourceInfoIdentifier = that.getSourceInfoIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceInfoIdentifier", lhsSourceInfoIdentifier), LocatorUtils.property(thatLocator, "sourceInfoIdentifier", rhsSourceInfoIdentifier), lhsSourceInfoIdentifier, rhsSourceInfoIdentifier)) {
                return false;
            }
        }
        {
            Source lhsSource;
            lhsSource = this.getSource();
            Source rhsSource;
            rhsSource = that.getSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "source", lhsSource), LocatorUtils.property(thatLocator, "source", rhsSource), lhsSource, rhsSource)) {
                return false;
            }
        }
        {
            Property lhsProperty;
            lhsProperty = this.getProperty();
            Property rhsProperty;
            rhsProperty = that.getProperty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "property", lhsProperty), LocatorUtils.property(thatLocator, "property", rhsProperty), lhsProperty, rhsProperty)) {
                return false;
            }
        }
        {
            String lhsAlias;
            lhsAlias = this.getAlias();
            String rhsAlias;
            rhsAlias = that.getAlias();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alias", lhsAlias), LocatorUtils.property(thatLocator, "alias", rhsAlias), lhsAlias, rhsAlias)) {
                return false;
            }
        }
        {
            Property lhsPrimaryKeyProperty;
            lhsPrimaryKeyProperty = this.getPrimaryKeyProperty();
            Property rhsPrimaryKeyProperty;
            rhsPrimaryKeyProperty = that.getPrimaryKeyProperty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "primaryKeyProperty", lhsPrimaryKeyProperty), LocatorUtils.property(thatLocator, "primaryKeyProperty", rhsPrimaryKeyProperty), lhsPrimaryKeyProperty, rhsPrimaryKeyProperty)) {
                return false;
            }
        }
        {
            Property lhsTimeProperty;
            lhsTimeProperty = this.getTimeProperty();
            Property rhsTimeProperty;
            rhsTimeProperty = that.getTimeProperty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeProperty", lhsTimeProperty), LocatorUtils.property(thatLocator, "timeProperty", rhsTimeProperty), lhsTimeProperty, rhsTimeProperty)) {
                return false;
            }
        }
        {
            String lhsJoinProperty;
            lhsJoinProperty = this.getJoinProperty();
            String rhsJoinProperty;
            rhsJoinProperty = that.getJoinProperty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "joinProperty", lhsJoinProperty), LocatorUtils.property(thatLocator, "joinProperty", rhsJoinProperty), lhsJoinProperty, rhsJoinProperty)) {
                return false;
            }
        }
        {
            Property lhsSourcecodeProperty;
            lhsSourcecodeProperty = this.getSourcecodeProperty();
            Property rhsSourcecodeProperty;
            rhsSourcecodeProperty = that.getSourcecodeProperty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourcecodeProperty", lhsSourcecodeProperty), LocatorUtils.property(thatLocator, "sourcecodeProperty", rhsSourcecodeProperty), lhsSourcecodeProperty, rhsSourcecodeProperty)) {
                return false;
            }
        }
        {
            Property lhsReferenceProperty;
            lhsReferenceProperty = this.getReferenceProperty();
            Property rhsReferenceProperty;
            rhsReferenceProperty = that.getReferenceProperty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceProperty", lhsReferenceProperty), LocatorUtils.property(thatLocator, "referenceProperty", rhsReferenceProperty), lhsReferenceProperty, rhsReferenceProperty)) {
                return false;
            }
        }
        {
            String lhsDiscriminatorPropertyName;
            lhsDiscriminatorPropertyName = this.getDiscriminatorPropertyName();
            String rhsDiscriminatorPropertyName;
            rhsDiscriminatorPropertyName = that.getDiscriminatorPropertyName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discriminatorPropertyName", lhsDiscriminatorPropertyName), LocatorUtils.property(thatLocator, "discriminatorPropertyName", rhsDiscriminatorPropertyName), lhsDiscriminatorPropertyName, rhsDiscriminatorPropertyName)) {
                return false;
            }
        }
        {
            String lhsDiscriminatorValue;
            lhsDiscriminatorValue = this.getDiscriminatorValue();
            String rhsDiscriminatorValue;
            rhsDiscriminatorValue = that.getDiscriminatorValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discriminatorValue", lhsDiscriminatorValue), LocatorUtils.property(thatLocator, "discriminatorValue", rhsDiscriminatorValue), lhsDiscriminatorValue, rhsDiscriminatorValue)) {
                return false;
            }
        }
        {
            String lhsQueryDetail;
            lhsQueryDetail = this.getQueryDetail();
            String rhsQueryDetail;
            rhsQueryDetail = that.getQueryDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queryDetail", lhsQueryDetail), LocatorUtils.property(thatLocator, "queryDetail", rhsQueryDetail), lhsQueryDetail, rhsQueryDetail)) {
                return false;
            }
        }
        {
            String lhsUpdateDetail;
            lhsUpdateDetail = this.getUpdateDetail();
            String rhsUpdateDetail;
            rhsUpdateDetail = that.getUpdateDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updateDetail", lhsUpdateDetail), LocatorUtils.property(thatLocator, "updateDetail", rhsUpdateDetail), lhsUpdateDetail, rhsUpdateDetail)) {
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
            SourceInfoIdentifier theSourceInfoIdentifier;
            theSourceInfoIdentifier = this.getSourceInfoIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceInfoIdentifier", theSourceInfoIdentifier), currentHashCode, theSourceInfoIdentifier);
        }
        {
            Source theSource;
            theSource = this.getSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "source", theSource), currentHashCode, theSource);
        }
        {
            Property theProperty;
            theProperty = this.getProperty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "property", theProperty), currentHashCode, theProperty);
        }
        {
            String theAlias;
            theAlias = this.getAlias();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alias", theAlias), currentHashCode, theAlias);
        }
        {
            Property thePrimaryKeyProperty;
            thePrimaryKeyProperty = this.getPrimaryKeyProperty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primaryKeyProperty", thePrimaryKeyProperty), currentHashCode, thePrimaryKeyProperty);
        }
        {
            Property theTimeProperty;
            theTimeProperty = this.getTimeProperty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeProperty", theTimeProperty), currentHashCode, theTimeProperty);
        }
        {
            String theJoinProperty;
            theJoinProperty = this.getJoinProperty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "joinProperty", theJoinProperty), currentHashCode, theJoinProperty);
        }
        {
            Property theSourcecodeProperty;
            theSourcecodeProperty = this.getSourcecodeProperty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourcecodeProperty", theSourcecodeProperty), currentHashCode, theSourcecodeProperty);
        }
        {
            Property theReferenceProperty;
            theReferenceProperty = this.getReferenceProperty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceProperty", theReferenceProperty), currentHashCode, theReferenceProperty);
        }
        {
            String theDiscriminatorPropertyName;
            theDiscriminatorPropertyName = this.getDiscriminatorPropertyName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discriminatorPropertyName", theDiscriminatorPropertyName), currentHashCode, theDiscriminatorPropertyName);
        }
        {
            String theDiscriminatorValue;
            theDiscriminatorValue = this.getDiscriminatorValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discriminatorValue", theDiscriminatorValue), currentHashCode, theDiscriminatorValue);
        }
        {
            String theQueryDetail;
            theQueryDetail = this.getQueryDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queryDetail", theQueryDetail), currentHashCode, theQueryDetail);
        }
        {
            String theUpdateDetail;
            theUpdateDetail = this.getUpdateDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateDetail", theUpdateDetail), currentHashCode, theUpdateDetail);
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
