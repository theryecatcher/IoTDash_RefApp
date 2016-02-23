
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for Configuration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Configuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="algorithms" type="{http://www.mimosa.org/OSACBMV3.3.1}Algorithm" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inportModuleSet" type="{http://www.mimosa.org/OSACBMV3.3.1}ModuleRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="moduleId" type="{http://www.mimosa.org/OSACBMV3.3.1}ModuleDescriptor" maxOccurs="unbounded"/>
 *         &lt;element name="outPortSet" type="{http://www.mimosa.org/OSACBMV3.3.1}OutPortSet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="supportingData" type="{http://www.mimosa.org/OSACBMV3.3.1}SupportingData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Configuration", propOrder = {
    "algorithms",
    "inportModuleSet",
    "moduleId",
    "outPortSet",
    "supportingData"
})
public class Configuration
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(nillable = true)
    protected List<Algorithm> algorithms;
    @XmlElement(nillable = true)
    protected List<ModuleRef> inportModuleSet;
    @XmlElement(required = true)
    protected List<ModuleDescriptor> moduleId;
    @XmlElement(nillable = true)
    protected List<OutPortSet> outPortSet;
    protected SupportingData supportingData;

    /**
     * Gets the value of the algorithms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the algorithms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlgorithms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Algorithm }
     * 
     * 
     */
    public List<Algorithm> getAlgorithms() {
        if (algorithms == null) {
            algorithms = new ArrayList<Algorithm>();
        }
        return this.algorithms;
    }

    /**
     * Gets the value of the inportModuleSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inportModuleSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInportModuleSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModuleRef }
     * 
     * 
     */
    public List<ModuleRef> getInportModuleSet() {
        if (inportModuleSet == null) {
            inportModuleSet = new ArrayList<ModuleRef>();
        }
        return this.inportModuleSet;
    }

    /**
     * Gets the value of the moduleId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moduleId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModuleId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModuleDescriptor }
     * 
     * 
     */
    public List<ModuleDescriptor> getModuleId() {
        if (moduleId == null) {
            moduleId = new ArrayList<ModuleDescriptor>();
        }
        return this.moduleId;
    }

    /**
     * Gets the value of the outPortSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outPortSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutPortSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutPortSet }
     * 
     * 
     */
    public List<OutPortSet> getOutPortSet() {
        if (outPortSet == null) {
            outPortSet = new ArrayList<OutPortSet>();
        }
        return this.outPortSet;
    }

    /**
     * Gets the value of the supportingData property.
     * 
     * @return
     *     possible object is
     *     {@link SupportingData }
     *     
     */
    public SupportingData getSupportingData() {
        return supportingData;
    }

    /**
     * Sets the value of the supportingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportingData }
     *     
     */
    public void setSupportingData(SupportingData value) {
        this.supportingData = value;
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
            List<Algorithm> theAlgorithms;
            theAlgorithms = (((this.algorithms!= null)&&(!this.algorithms.isEmpty()))?this.getAlgorithms():null);
            strategy.appendField(locator, this, "algorithms", buffer, theAlgorithms);
        }
        {
            List<ModuleRef> theInportModuleSet;
            theInportModuleSet = (((this.inportModuleSet!= null)&&(!this.inportModuleSet.isEmpty()))?this.getInportModuleSet():null);
            strategy.appendField(locator, this, "inportModuleSet", buffer, theInportModuleSet);
        }
        {
            List<ModuleDescriptor> theModuleId;
            theModuleId = (((this.moduleId!= null)&&(!this.moduleId.isEmpty()))?this.getModuleId():null);
            strategy.appendField(locator, this, "moduleId", buffer, theModuleId);
        }
        {
            List<OutPortSet> theOutPortSet;
            theOutPortSet = (((this.outPortSet!= null)&&(!this.outPortSet.isEmpty()))?this.getOutPortSet():null);
            strategy.appendField(locator, this, "outPortSet", buffer, theOutPortSet);
        }
        {
            SupportingData theSupportingData;
            theSupportingData = this.getSupportingData();
            strategy.appendField(locator, this, "supportingData", buffer, theSupportingData);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Configuration)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Configuration that = ((Configuration) object);
        {
            List<Algorithm> lhsAlgorithms;
            lhsAlgorithms = (((this.algorithms!= null)&&(!this.algorithms.isEmpty()))?this.getAlgorithms():null);
            List<Algorithm> rhsAlgorithms;
            rhsAlgorithms = (((that.algorithms!= null)&&(!that.algorithms.isEmpty()))?that.getAlgorithms():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "algorithms", lhsAlgorithms), LocatorUtils.property(thatLocator, "algorithms", rhsAlgorithms), lhsAlgorithms, rhsAlgorithms)) {
                return false;
            }
        }
        {
            List<ModuleRef> lhsInportModuleSet;
            lhsInportModuleSet = (((this.inportModuleSet!= null)&&(!this.inportModuleSet.isEmpty()))?this.getInportModuleSet():null);
            List<ModuleRef> rhsInportModuleSet;
            rhsInportModuleSet = (((that.inportModuleSet!= null)&&(!that.inportModuleSet.isEmpty()))?that.getInportModuleSet():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inportModuleSet", lhsInportModuleSet), LocatorUtils.property(thatLocator, "inportModuleSet", rhsInportModuleSet), lhsInportModuleSet, rhsInportModuleSet)) {
                return false;
            }
        }
        {
            List<ModuleDescriptor> lhsModuleId;
            lhsModuleId = (((this.moduleId!= null)&&(!this.moduleId.isEmpty()))?this.getModuleId():null);
            List<ModuleDescriptor> rhsModuleId;
            rhsModuleId = (((that.moduleId!= null)&&(!that.moduleId.isEmpty()))?that.getModuleId():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "moduleId", lhsModuleId), LocatorUtils.property(thatLocator, "moduleId", rhsModuleId), lhsModuleId, rhsModuleId)) {
                return false;
            }
        }
        {
            List<OutPortSet> lhsOutPortSet;
            lhsOutPortSet = (((this.outPortSet!= null)&&(!this.outPortSet.isEmpty()))?this.getOutPortSet():null);
            List<OutPortSet> rhsOutPortSet;
            rhsOutPortSet = (((that.outPortSet!= null)&&(!that.outPortSet.isEmpty()))?that.getOutPortSet():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outPortSet", lhsOutPortSet), LocatorUtils.property(thatLocator, "outPortSet", rhsOutPortSet), lhsOutPortSet, rhsOutPortSet)) {
                return false;
            }
        }
        {
            SupportingData lhsSupportingData;
            lhsSupportingData = this.getSupportingData();
            SupportingData rhsSupportingData;
            rhsSupportingData = that.getSupportingData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supportingData", lhsSupportingData), LocatorUtils.property(thatLocator, "supportingData", rhsSupportingData), lhsSupportingData, rhsSupportingData)) {
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
            List<Algorithm> theAlgorithms;
            theAlgorithms = (((this.algorithms!= null)&&(!this.algorithms.isEmpty()))?this.getAlgorithms():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "algorithms", theAlgorithms), currentHashCode, theAlgorithms);
        }
        {
            List<ModuleRef> theInportModuleSet;
            theInportModuleSet = (((this.inportModuleSet!= null)&&(!this.inportModuleSet.isEmpty()))?this.getInportModuleSet():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inportModuleSet", theInportModuleSet), currentHashCode, theInportModuleSet);
        }
        {
            List<ModuleDescriptor> theModuleId;
            theModuleId = (((this.moduleId!= null)&&(!this.moduleId.isEmpty()))?this.getModuleId():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "moduleId", theModuleId), currentHashCode, theModuleId);
        }
        {
            List<OutPortSet> theOutPortSet;
            theOutPortSet = (((this.outPortSet!= null)&&(!this.outPortSet.isEmpty()))?this.getOutPortSet():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outPortSet", theOutPortSet), currentHashCode, theOutPortSet);
        }
        {
            SupportingData theSupportingData;
            theSupportingData = this.getSupportingData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supportingData", theSupportingData), currentHashCode, theSupportingData);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
