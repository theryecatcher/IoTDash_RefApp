
package com.ge.dsp.pm.fielddatahandler.entity.createfields;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ge.dsp.pm.ext.entity.asset.Asset;
import com.ge.dsp.pm.ext.entity.modelfield.ModelField;
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
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/modelfield}modelField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/asset}asset" maxOccurs="unbounded" minOccurs="0"/>
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
    "modelField",
    "asset"
})
@XmlRootElement(name = "createFieldsRequest")
public class CreateFieldsRequest
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/modelfield")
    protected List<ModelField> modelField;
    @XmlElement(namespace = "http://dsp.ge.com/pm/ext/entity/asset")
    protected List<Asset> asset;

    /**
     * Gets the value of the modelField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modelField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModelField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelField }
     * 
     * 
     */
    public List<ModelField> getModelField() {
        if (modelField == null) {
            modelField = new ArrayList<ModelField>();
        }
        return this.modelField;
    }

    /**
     * Gets the value of the asset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Asset }
     * 
     * 
     */
    public List<Asset> getAsset() {
        if (asset == null) {
            asset = new ArrayList<Asset>();
        }
        return this.asset;
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
            List<ModelField> theModelField;
            theModelField = (((this.modelField!= null)&&(!this.modelField.isEmpty()))?this.getModelField():null);
            strategy.appendField(locator, this, "modelField", buffer, theModelField);
        }
        {
            List<Asset> theAsset;
            theAsset = (((this.asset!= null)&&(!this.asset.isEmpty()))?this.getAsset():null);
            strategy.appendField(locator, this, "asset", buffer, theAsset);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CreateFieldsRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CreateFieldsRequest that = ((CreateFieldsRequest) object);
        {
            List<ModelField> lhsModelField;
            lhsModelField = (((this.modelField!= null)&&(!this.modelField.isEmpty()))?this.getModelField():null);
            List<ModelField> rhsModelField;
            rhsModelField = (((that.modelField!= null)&&(!that.modelField.isEmpty()))?that.getModelField():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modelField", lhsModelField), LocatorUtils.property(thatLocator, "modelField", rhsModelField), lhsModelField, rhsModelField)) {
                return false;
            }
        }
        {
            List<Asset> lhsAsset;
            lhsAsset = (((this.asset!= null)&&(!this.asset.isEmpty()))?this.getAsset():null);
            List<Asset> rhsAsset;
            rhsAsset = (((that.asset!= null)&&(!that.asset.isEmpty()))?that.getAsset():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "asset", lhsAsset), LocatorUtils.property(thatLocator, "asset", rhsAsset), lhsAsset, rhsAsset)) {
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
            List<ModelField> theModelField;
            theModelField = (((this.modelField!= null)&&(!this.modelField.isEmpty()))?this.getModelField():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "modelField", theModelField), currentHashCode, theModelField);
        }
        {
            List<Asset> theAsset;
            theAsset = (((this.asset!= null)&&(!this.asset.isEmpty()))?this.getAsset():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "asset", theAsset), currentHashCode, theAsset);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
