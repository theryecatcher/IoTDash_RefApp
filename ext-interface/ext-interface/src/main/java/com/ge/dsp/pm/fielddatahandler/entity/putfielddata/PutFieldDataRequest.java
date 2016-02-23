
package com.ge.dsp.pm.fielddatahandler.entity.putfielddata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.solution.identifier.solutionidentifier.SolutionIdentifier;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/solution/identifier/solutionidentifier}solutionIdentifier" minOccurs="0"/>
 *         &lt;element name="correlationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="putFieldDataCriteria" type="{http://dsp.ge.com/pm/fielddatahandler/entity/putfielddata}PutFieldDataCriteria" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/util/map}externalAttributeMap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "solutionIdentifier",
    "correlationId",
    "putFieldDataCriteria",
    "externalAttributeMap"
})
@XmlRootElement(name = "putFieldDataRequest")
public class PutFieldDataRequest
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/solution/identifier/solutionidentifier")
    protected SolutionIdentifier solutionIdentifier;
    protected String correlationId;
    protected List<PutFieldDataCriteria> putFieldDataCriteria;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/util/map")
    protected Map externalAttributeMap;

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
     * Gets the value of the correlationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationId(String value) {
        this.correlationId = value;
    }

    /**
     * Gets the value of the putFieldDataCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the putFieldDataCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPutFieldDataCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PutFieldDataCriteria }
     * 
     * 
     */
    public List<PutFieldDataCriteria> getPutFieldDataCriteria() {
        if (putFieldDataCriteria == null) {
            putFieldDataCriteria = new ArrayList<PutFieldDataCriteria>();
        }
        return this.putFieldDataCriteria;
    }

    /**
     * Gets the value of the externalAttributeMap property.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getExternalAttributeMap() {
        return externalAttributeMap;
    }

    /**
     * Sets the value of the externalAttributeMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setExternalAttributeMap(Map value) {
        this.externalAttributeMap = value;
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
            SolutionIdentifier theSolutionIdentifier;
            theSolutionIdentifier = this.getSolutionIdentifier();
            strategy.appendField(locator, this, "solutionIdentifier", buffer, theSolutionIdentifier);
        }
        {
            String theCorrelationId;
            theCorrelationId = this.getCorrelationId();
            strategy.appendField(locator, this, "correlationId", buffer, theCorrelationId);
        }
        {
            List<PutFieldDataCriteria> thePutFieldDataCriteria;
            thePutFieldDataCriteria = (((this.putFieldDataCriteria!= null)&&(!this.putFieldDataCriteria.isEmpty()))?this.getPutFieldDataCriteria():null);
            strategy.appendField(locator, this, "putFieldDataCriteria", buffer, thePutFieldDataCriteria);
        }
        {
            Map theExternalAttributeMap;
            theExternalAttributeMap = this.getExternalAttributeMap();
            strategy.appendField(locator, this, "externalAttributeMap", buffer, theExternalAttributeMap);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PutFieldDataRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PutFieldDataRequest that = ((PutFieldDataRequest) object);
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
            String lhsCorrelationId;
            lhsCorrelationId = this.getCorrelationId();
            String rhsCorrelationId;
            rhsCorrelationId = that.getCorrelationId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "correlationId", lhsCorrelationId), LocatorUtils.property(thatLocator, "correlationId", rhsCorrelationId), lhsCorrelationId, rhsCorrelationId)) {
                return false;
            }
        }
        {
            List<PutFieldDataCriteria> lhsPutFieldDataCriteria;
            lhsPutFieldDataCriteria = (((this.putFieldDataCriteria!= null)&&(!this.putFieldDataCriteria.isEmpty()))?this.getPutFieldDataCriteria():null);
            List<PutFieldDataCriteria> rhsPutFieldDataCriteria;
            rhsPutFieldDataCriteria = (((that.putFieldDataCriteria!= null)&&(!that.putFieldDataCriteria.isEmpty()))?that.getPutFieldDataCriteria():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "putFieldDataCriteria", lhsPutFieldDataCriteria), LocatorUtils.property(thatLocator, "putFieldDataCriteria", rhsPutFieldDataCriteria), lhsPutFieldDataCriteria, rhsPutFieldDataCriteria)) {
                return false;
            }
        }
        {
            Map lhsExternalAttributeMap;
            lhsExternalAttributeMap = this.getExternalAttributeMap();
            Map rhsExternalAttributeMap;
            rhsExternalAttributeMap = that.getExternalAttributeMap();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "externalAttributeMap", lhsExternalAttributeMap), LocatorUtils.property(thatLocator, "externalAttributeMap", rhsExternalAttributeMap), lhsExternalAttributeMap, rhsExternalAttributeMap)) {
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
            SolutionIdentifier theSolutionIdentifier;
            theSolutionIdentifier = this.getSolutionIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "solutionIdentifier", theSolutionIdentifier), currentHashCode, theSolutionIdentifier);
        }
        {
            String theCorrelationId;
            theCorrelationId = this.getCorrelationId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "correlationId", theCorrelationId), currentHashCode, theCorrelationId);
        }
        {
            List<PutFieldDataCriteria> thePutFieldDataCriteria;
            thePutFieldDataCriteria = (((this.putFieldDataCriteria!= null)&&(!this.putFieldDataCriteria.isEmpty()))?this.getPutFieldDataCriteria():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "putFieldDataCriteria", thePutFieldDataCriteria), currentHashCode, thePutFieldDataCriteria);
        }
        {
            Map theExternalAttributeMap;
            theExternalAttributeMap = this.getExternalAttributeMap();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "externalAttributeMap", theExternalAttributeMap), currentHashCode, theExternalAttributeMap);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
