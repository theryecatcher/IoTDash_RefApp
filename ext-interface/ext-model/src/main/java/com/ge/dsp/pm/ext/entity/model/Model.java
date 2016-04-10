//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.07 at 07:40:43 PM IST 
//


package com.ge.dsp.pm.ext.entity.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.attribute.PositionalAttributes;
import com.ge.dsp.pm.ext.entity.fielddata.Data;
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
 * <p>Java class for Model complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Model">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dsp.ge.com/pm/ext/entity/fielddata}Data">
 *       &lt;sequence>
 *         &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="classificationUri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="additionalAttributes" type="{http://dsp.ge.com/pm/ext/entity/attribute}PositionalAttributes"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Model", propOrder = {
    "uri",
    "name",
    "classificationUri",
    "additionalAttributes"
})
@XmlSeeAlso({
    SampleEngine.class
})
public class Model
    extends Data
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String uri;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String classificationUri;
    @XmlElement(required = true)
    protected PositionalAttributes additionalAttributes;

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the classificationUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationUri() {
        return classificationUri;
    }

    /**
     * Sets the value of the classificationUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationUri(String value) {
        this.classificationUri = value;
    }

    /**
     * Gets the value of the additionalAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link PositionalAttributes }
     *     
     */
    public PositionalAttributes getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * Sets the value of the additionalAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionalAttributes }
     *     
     */
    public void setAdditionalAttributes(PositionalAttributes value) {
        this.additionalAttributes = value;
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
            String theUri;
            theUri = this.getUri();
            strategy.appendField(locator, this, "uri", buffer, theUri);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theClassificationUri;
            theClassificationUri = this.getClassificationUri();
            strategy.appendField(locator, this, "classificationUri", buffer, theClassificationUri);
        }
        {
            PositionalAttributes theAdditionalAttributes;
            theAdditionalAttributes = this.getAdditionalAttributes();
            strategy.appendField(locator, this, "additionalAttributes", buffer, theAdditionalAttributes);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Model)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Model that = ((Model) object);
        {
            String lhsUri;
            lhsUri = this.getUri();
            String rhsUri;
            rhsUri = that.getUri();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uri", lhsUri), LocatorUtils.property(thatLocator, "uri", rhsUri), lhsUri, rhsUri)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsClassificationUri;
            lhsClassificationUri = this.getClassificationUri();
            String rhsClassificationUri;
            rhsClassificationUri = that.getClassificationUri();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classificationUri", lhsClassificationUri), LocatorUtils.property(thatLocator, "classificationUri", rhsClassificationUri), lhsClassificationUri, rhsClassificationUri)) {
                return false;
            }
        }
        {
            PositionalAttributes lhsAdditionalAttributes;
            lhsAdditionalAttributes = this.getAdditionalAttributes();
            PositionalAttributes rhsAdditionalAttributes;
            rhsAdditionalAttributes = that.getAdditionalAttributes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalAttributes", lhsAdditionalAttributes), LocatorUtils.property(thatLocator, "additionalAttributes", rhsAdditionalAttributes), lhsAdditionalAttributes, rhsAdditionalAttributes)) {
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
            String theUri;
            theUri = this.getUri();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uri", theUri), currentHashCode, theUri);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theClassificationUri;
            theClassificationUri = this.getClassificationUri();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classificationUri", theClassificationUri), currentHashCode, theClassificationUri);
        }
        {
            PositionalAttributes theAdditionalAttributes;
            theAdditionalAttributes = this.getAdditionalAttributes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalAttributes", theAdditionalAttributes), currentHashCode, theAdditionalAttributes);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
