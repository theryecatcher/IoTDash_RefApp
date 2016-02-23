
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
 * <p>Java class for ExplanationDataSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExplanationDataSet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}Explanation">
 *       &lt;sequence>
 *         &lt;element name="explData" type="{http://www.mimosa.org/OSACBMV3.3.1}ExplanationData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExplanationDataSet", propOrder = {
    "explData"
})
public class ExplanationDataSet
    extends Explanation
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(nillable = true)
    protected List<ExplanationData> explData;

    /**
     * Gets the value of the explData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the explData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExplData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExplanationData }
     * 
     * 
     */
    public List<ExplanationData> getExplData() {
        if (explData == null) {
            explData = new ArrayList<ExplanationData>();
        }
        return this.explData;
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
            List<ExplanationData> theExplData;
            theExplData = (((this.explData!= null)&&(!this.explData.isEmpty()))?this.getExplData():null);
            strategy.appendField(locator, this, "explData", buffer, theExplData);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ExplanationDataSet)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ExplanationDataSet that = ((ExplanationDataSet) object);
        {
            List<ExplanationData> lhsExplData;
            lhsExplData = (((this.explData!= null)&&(!this.explData.isEmpty()))?this.getExplData():null);
            List<ExplanationData> rhsExplData;
            rhsExplData = (((that.explData!= null)&&(!that.explData.isEmpty()))?that.getExplData():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "explData", lhsExplData), LocatorUtils.property(thatLocator, "explData", rhsExplData), lhsExplData, rhsExplData)) {
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
            List<ExplanationData> theExplData;
            theExplData = (((this.explData!= null)&&(!this.explData.isEmpty()))?this.getExplData():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "explData", theExplData), currentHashCode, theExplData);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
