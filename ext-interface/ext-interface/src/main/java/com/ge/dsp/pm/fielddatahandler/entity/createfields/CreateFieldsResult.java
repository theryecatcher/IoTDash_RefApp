
package com.ge.dsp.pm.fielddatahandler.entity.createfields;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.aaas.entity.resultinfo.ResultInfo;
import com.ge.dsp.pm.ext.entity.field.Field;
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
 *         &lt;element ref="{http://dsp.ge.com/aaas/entity/resultinfo}resultInfo"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/field}field" maxOccurs="unbounded" minOccurs="0"/>
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
    "resultInfo",
    "field"
})
@XmlRootElement(name = "createFieldsResult")
public class CreateFieldsResult
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(namespace = "http://dsp.ge.com/aaas/entity/resultinfo", required = true)
    protected ResultInfo resultInfo;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/field")
    protected List<Field> field;

    /**
     * Gets the value of the resultInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getResultInfo() {
        return resultInfo;
    }

    /**
     * Sets the value of the resultInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setResultInfo(ResultInfo value) {
        this.resultInfo = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Field }
     * 
     * 
     */
    public List<Field> getField() {
        if (field == null) {
            field = new ArrayList<Field>();
        }
        return this.field;
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
            ResultInfo theResultInfo;
            theResultInfo = this.getResultInfo();
            strategy.appendField(locator, this, "resultInfo", buffer, theResultInfo);
        }
        {
            List<Field> theField;
            theField = (((this.field!= null)&&(!this.field.isEmpty()))?this.getField():null);
            strategy.appendField(locator, this, "field", buffer, theField);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CreateFieldsResult)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CreateFieldsResult that = ((CreateFieldsResult) object);
        {
            ResultInfo lhsResultInfo;
            lhsResultInfo = this.getResultInfo();
            ResultInfo rhsResultInfo;
            rhsResultInfo = that.getResultInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resultInfo", lhsResultInfo), LocatorUtils.property(thatLocator, "resultInfo", rhsResultInfo), lhsResultInfo, rhsResultInfo)) {
                return false;
            }
        }
        {
            List<Field> lhsField;
            lhsField = (((this.field!= null)&&(!this.field.isEmpty()))?this.getField():null);
            List<Field> rhsField;
            rhsField = (((that.field!= null)&&(!that.field.isEmpty()))?that.getField():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "field", lhsField), LocatorUtils.property(thatLocator, "field", rhsField), lhsField, rhsField)) {
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
            ResultInfo theResultInfo;
            theResultInfo = this.getResultInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resultInfo", theResultInfo), currentHashCode, theResultInfo);
        }
        {
            List<Field> theField;
            theField = (((this.field!= null)&&(!this.field.isEmpty()))?this.getField():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "field", theField), currentHashCode, theField);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
