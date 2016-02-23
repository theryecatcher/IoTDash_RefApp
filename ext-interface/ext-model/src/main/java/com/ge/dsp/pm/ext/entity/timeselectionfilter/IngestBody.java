//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 02:16:43 AM PST 
//


package com.ge.dsp.pm.ext.entity.timeselectionfilter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.util.map.SimpleMap;
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
 * <p>Java class for IngestBody complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IngestBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datapoints" type="{http://dsp.ge.com/pm/ext/entity/timeselectionfilter}Datapoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attributes" type="{http://dsp.ge.com/pm/ext/entity/util/map}SimpleMap" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IngestBody", propOrder = {
    "name",
    "datapoints",
    "attributes"
})
public class IngestBody
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String name;
    protected List<Datapoint> datapoints;
    protected List<SimpleMap> attributes;

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
     * Gets the value of the datapoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datapoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatapoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Datapoint }
     * 
     * 
     */
    public List<Datapoint> getDatapoints() {
        if (datapoints == null) {
            datapoints = new ArrayList<Datapoint>();
        }
        return this.datapoints;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleMap }
     * 
     * 
     */
    public List<SimpleMap> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<SimpleMap>();
        }
        return this.attributes;
    }

    /**
     * Sets the value of the datapoints property.
     * 
     * @param datapoints
     *     allowed object is
     *     {@link Datapoint }
     *     
     */
    public void setDatapoints(List<Datapoint> datapoints) {
        this.datapoints = datapoints;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param attributes
     *     allowed object is
     *     {@link SimpleMap }
     *     
     */
    public void setAttributes(List<SimpleMap> attributes) {
        this.attributes = attributes;
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
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            List<Datapoint> theDatapoints;
            theDatapoints = (((this.datapoints!= null)&&(!this.datapoints.isEmpty()))?this.getDatapoints():null);
            strategy.appendField(locator, this, "datapoints", buffer, theDatapoints);
        }
        {
            List<SimpleMap> theAttributes;
            theAttributes = (((this.attributes!= null)&&(!this.attributes.isEmpty()))?this.getAttributes():null);
            strategy.appendField(locator, this, "attributes", buffer, theAttributes);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof IngestBody)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IngestBody that = ((IngestBody) object);
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
            List<Datapoint> lhsDatapoints;
            lhsDatapoints = (((this.datapoints!= null)&&(!this.datapoints.isEmpty()))?this.getDatapoints():null);
            List<Datapoint> rhsDatapoints;
            rhsDatapoints = (((that.datapoints!= null)&&(!that.datapoints.isEmpty()))?that.getDatapoints():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datapoints", lhsDatapoints), LocatorUtils.property(thatLocator, "datapoints", rhsDatapoints), lhsDatapoints, rhsDatapoints)) {
                return false;
            }
        }
        {
            List<SimpleMap> lhsAttributes;
            lhsAttributes = (((this.attributes!= null)&&(!this.attributes.isEmpty()))?this.getAttributes():null);
            List<SimpleMap> rhsAttributes;
            rhsAttributes = (((that.attributes!= null)&&(!that.attributes.isEmpty()))?that.getAttributes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attributes", lhsAttributes), LocatorUtils.property(thatLocator, "attributes", rhsAttributes), lhsAttributes, rhsAttributes)) {
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
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            List<Datapoint> theDatapoints;
            theDatapoints = (((this.datapoints!= null)&&(!this.datapoints.isEmpty()))?this.getDatapoints():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "datapoints", theDatapoints), currentHashCode, theDatapoints);
        }
        {
            List<SimpleMap> theAttributes;
            theAttributes = (((this.attributes!= null)&&(!this.attributes.isEmpty()))?this.getAttributes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attributes", theAttributes), currentHashCode, theAttributes);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
