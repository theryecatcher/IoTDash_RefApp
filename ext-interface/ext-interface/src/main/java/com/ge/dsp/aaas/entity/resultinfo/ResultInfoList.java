
package com.ge.dsp.aaas.entity.resultinfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for ResultInfoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultInfoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/aaas/entity/resultinfo}resultInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultInfoList", propOrder = {
    "resultInfo"
})
public class ResultInfoList
    implements Serializable, Equals, HashCode, ToString
{

    protected List<ResultInfo> resultInfo;

    /**
     * Gets the value of the resultInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultInfo }
     * 
     * 
     */
    public List<ResultInfo> getResultInfo() {
        if (resultInfo == null) {
            resultInfo = new ArrayList<ResultInfo>();
        }
        return this.resultInfo;
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
            List<ResultInfo> theResultInfo;
            theResultInfo = (((this.resultInfo!= null)&&(!this.resultInfo.isEmpty()))?this.getResultInfo():null);
            strategy.appendField(locator, this, "resultInfo", buffer, theResultInfo);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ResultInfoList)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ResultInfoList that = ((ResultInfoList) object);
        {
            List<ResultInfo> lhsResultInfo;
            lhsResultInfo = (((this.resultInfo!= null)&&(!this.resultInfo.isEmpty()))?this.getResultInfo():null);
            List<ResultInfo> rhsResultInfo;
            rhsResultInfo = (((that.resultInfo!= null)&&(!that.resultInfo.isEmpty()))?that.getResultInfo():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resultInfo", lhsResultInfo), LocatorUtils.property(thatLocator, "resultInfo", rhsResultInfo), lhsResultInfo, rhsResultInfo)) {
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
            List<ResultInfo> theResultInfo;
            theResultInfo = (((this.resultInfo!= null)&&(!this.resultInfo.isEmpty()))?this.getResultInfo():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resultInfo", theResultInfo), currentHashCode, theResultInfo);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
