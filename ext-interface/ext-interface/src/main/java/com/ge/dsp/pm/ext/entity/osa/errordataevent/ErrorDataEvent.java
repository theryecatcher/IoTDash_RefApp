
package com.ge.dsp.pm.ext.entity.osa.errordataevent;

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
import org.mimosa.osacbmv3_3.DataEvent;
import org.mimosa.osacbmv3_3.ErrorInfo;


/**
 * <p>Java class for ErrorDataEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorDataEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mimosa.org/OSACBMV3.3.1}DataEvent">
 *       &lt;sequence>
 *         &lt;element name="errorInfo" type="{http://www.mimosa.org/OSACBMV3.3.1}ErrorInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorDataEvent", propOrder = {
    "errorInfo"
})
public class ErrorDataEvent
    extends DataEvent
    implements Serializable, Equals, HashCode, ToString
{

    protected List<ErrorInfo> errorInfo;

    /**
     * Gets the value of the errorInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorInfo }
     * 
     * 
     */
    public List<ErrorInfo> getErrorInfo() {
        if (errorInfo == null) {
            errorInfo = new ArrayList<ErrorInfo>();
        }
        return this.errorInfo;
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
            List<ErrorInfo> theErrorInfo;
            theErrorInfo = (((this.errorInfo!= null)&&(!this.errorInfo.isEmpty()))?this.getErrorInfo():null);
            strategy.appendField(locator, this, "errorInfo", buffer, theErrorInfo);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ErrorDataEvent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ErrorDataEvent that = ((ErrorDataEvent) object);
        {
            List<ErrorInfo> lhsErrorInfo;
            lhsErrorInfo = (((this.errorInfo!= null)&&(!this.errorInfo.isEmpty()))?this.getErrorInfo():null);
            List<ErrorInfo> rhsErrorInfo;
            rhsErrorInfo = (((that.errorInfo!= null)&&(!that.errorInfo.isEmpty()))?that.getErrorInfo():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errorInfo", lhsErrorInfo), LocatorUtils.property(thatLocator, "errorInfo", rhsErrorInfo), lhsErrorInfo, rhsErrorInfo)) {
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
            List<ErrorInfo> theErrorInfo;
            theErrorInfo = (((this.errorInfo!= null)&&(!this.errorInfo.isEmpty()))?this.getErrorInfo():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errorInfo", theErrorInfo), currentHashCode, theErrorInfo);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
