
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
 * <p>Java class for ExplanationDataRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExplanationDataRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="explDataRefSrcs" type="{http://www.mimosa.org/OSACBMV3.3.1}DataRef" maxOccurs="unbounded"/>
 *         &lt;element name="explType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3"/>
 *         &lt;element name="explTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultDataRef" type="{http://www.mimosa.org/OSACBMV3.3.1}DataRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExplanationDataRef", propOrder = {
    "explDataRefSrcs",
    "explType",
    "explTypeDesc",
    "resultDataRef"
})
public class ExplanationDataRef
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<DataRef> explDataRefSrcs;
    @XmlElement(required = true)
    protected MIMKey3 explType;
    protected String explTypeDesc;
    protected DataRef resultDataRef;

    /**
     * Gets the value of the explDataRefSrcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the explDataRefSrcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExplDataRefSrcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataRef }
     * 
     * 
     */
    public List<DataRef> getExplDataRefSrcs() {
        if (explDataRefSrcs == null) {
            explDataRefSrcs = new ArrayList<DataRef>();
        }
        return this.explDataRefSrcs;
    }

    /**
     * Gets the value of the explType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getExplType() {
        return explType;
    }

    /**
     * Sets the value of the explType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setExplType(MIMKey3 value) {
        this.explType = value;
    }

    /**
     * Gets the value of the explTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplTypeDesc() {
        return explTypeDesc;
    }

    /**
     * Sets the value of the explTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplTypeDesc(String value) {
        this.explTypeDesc = value;
    }

    /**
     * Gets the value of the resultDataRef property.
     * 
     * @return
     *     possible object is
     *     {@link DataRef }
     *     
     */
    public DataRef getResultDataRef() {
        return resultDataRef;
    }

    /**
     * Sets the value of the resultDataRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataRef }
     *     
     */
    public void setResultDataRef(DataRef value) {
        this.resultDataRef = value;
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
            List<DataRef> theExplDataRefSrcs;
            theExplDataRefSrcs = (((this.explDataRefSrcs!= null)&&(!this.explDataRefSrcs.isEmpty()))?this.getExplDataRefSrcs():null);
            strategy.appendField(locator, this, "explDataRefSrcs", buffer, theExplDataRefSrcs);
        }
        {
            MIMKey3 theExplType;
            theExplType = this.getExplType();
            strategy.appendField(locator, this, "explType", buffer, theExplType);
        }
        {
            String theExplTypeDesc;
            theExplTypeDesc = this.getExplTypeDesc();
            strategy.appendField(locator, this, "explTypeDesc", buffer, theExplTypeDesc);
        }
        {
            DataRef theResultDataRef;
            theResultDataRef = this.getResultDataRef();
            strategy.appendField(locator, this, "resultDataRef", buffer, theResultDataRef);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ExplanationDataRef)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ExplanationDataRef that = ((ExplanationDataRef) object);
        {
            List<DataRef> lhsExplDataRefSrcs;
            lhsExplDataRefSrcs = (((this.explDataRefSrcs!= null)&&(!this.explDataRefSrcs.isEmpty()))?this.getExplDataRefSrcs():null);
            List<DataRef> rhsExplDataRefSrcs;
            rhsExplDataRefSrcs = (((that.explDataRefSrcs!= null)&&(!that.explDataRefSrcs.isEmpty()))?that.getExplDataRefSrcs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "explDataRefSrcs", lhsExplDataRefSrcs), LocatorUtils.property(thatLocator, "explDataRefSrcs", rhsExplDataRefSrcs), lhsExplDataRefSrcs, rhsExplDataRefSrcs)) {
                return false;
            }
        }
        {
            MIMKey3 lhsExplType;
            lhsExplType = this.getExplType();
            MIMKey3 rhsExplType;
            rhsExplType = that.getExplType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "explType", lhsExplType), LocatorUtils.property(thatLocator, "explType", rhsExplType), lhsExplType, rhsExplType)) {
                return false;
            }
        }
        {
            String lhsExplTypeDesc;
            lhsExplTypeDesc = this.getExplTypeDesc();
            String rhsExplTypeDesc;
            rhsExplTypeDesc = that.getExplTypeDesc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "explTypeDesc", lhsExplTypeDesc), LocatorUtils.property(thatLocator, "explTypeDesc", rhsExplTypeDesc), lhsExplTypeDesc, rhsExplTypeDesc)) {
                return false;
            }
        }
        {
            DataRef lhsResultDataRef;
            lhsResultDataRef = this.getResultDataRef();
            DataRef rhsResultDataRef;
            rhsResultDataRef = that.getResultDataRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resultDataRef", lhsResultDataRef), LocatorUtils.property(thatLocator, "resultDataRef", rhsResultDataRef), lhsResultDataRef, rhsResultDataRef)) {
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
            List<DataRef> theExplDataRefSrcs;
            theExplDataRefSrcs = (((this.explDataRefSrcs!= null)&&(!this.explDataRefSrcs.isEmpty()))?this.getExplDataRefSrcs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "explDataRefSrcs", theExplDataRefSrcs), currentHashCode, theExplDataRefSrcs);
        }
        {
            MIMKey3 theExplType;
            theExplType = this.getExplType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "explType", theExplType), currentHashCode, theExplType);
        }
        {
            String theExplTypeDesc;
            theExplTypeDesc = this.getExplTypeDesc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "explTypeDesc", theExplTypeDesc), currentHashCode, theExplTypeDesc);
        }
        {
            DataRef theResultDataRef;
            theResultDataRef = this.getResultDataRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resultDataRef", theResultDataRef), currentHashCode, theResultDataRef);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
