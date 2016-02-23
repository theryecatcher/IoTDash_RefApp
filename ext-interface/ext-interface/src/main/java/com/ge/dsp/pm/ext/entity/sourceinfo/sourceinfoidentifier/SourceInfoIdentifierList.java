
package com.ge.dsp.pm.ext.entity.sourceinfo.sourceinfoidentifier;

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
 * <p>Java class for SourceInfoIdentifierList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceInfoIdentifierList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dsp.ge.com/pm/ext/entity/sourceinfo/sourceinfoidentifier}sourceInfoIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceInfoIdentifierList", propOrder = {
    "sourceInfoIdentifier"
})
public class SourceInfoIdentifierList
    implements Serializable, Equals, HashCode, ToString
{

    protected List<SourceInfoIdentifier> sourceInfoIdentifier;

    /**
     * Gets the value of the sourceInfoIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceInfoIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceInfoIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceInfoIdentifier }
     * 
     * 
     */
    public List<SourceInfoIdentifier> getSourceInfoIdentifier() {
        if (sourceInfoIdentifier == null) {
            sourceInfoIdentifier = new ArrayList<SourceInfoIdentifier>();
        }
        return this.sourceInfoIdentifier;
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
            List<SourceInfoIdentifier> theSourceInfoIdentifier;
            theSourceInfoIdentifier = (((this.sourceInfoIdentifier!= null)&&(!this.sourceInfoIdentifier.isEmpty()))?this.getSourceInfoIdentifier():null);
            strategy.appendField(locator, this, "sourceInfoIdentifier", buffer, theSourceInfoIdentifier);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SourceInfoIdentifierList)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SourceInfoIdentifierList that = ((SourceInfoIdentifierList) object);
        {
            List<SourceInfoIdentifier> lhsSourceInfoIdentifier;
            lhsSourceInfoIdentifier = (((this.sourceInfoIdentifier!= null)&&(!this.sourceInfoIdentifier.isEmpty()))?this.getSourceInfoIdentifier():null);
            List<SourceInfoIdentifier> rhsSourceInfoIdentifier;
            rhsSourceInfoIdentifier = (((that.sourceInfoIdentifier!= null)&&(!that.sourceInfoIdentifier.isEmpty()))?that.getSourceInfoIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceInfoIdentifier", lhsSourceInfoIdentifier), LocatorUtils.property(thatLocator, "sourceInfoIdentifier", rhsSourceInfoIdentifier), lhsSourceInfoIdentifier, rhsSourceInfoIdentifier)) {
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
            List<SourceInfoIdentifier> theSourceInfoIdentifier;
            theSourceInfoIdentifier = (((this.sourceInfoIdentifier!= null)&&(!this.sourceInfoIdentifier.isEmpty()))?this.getSourceInfoIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceInfoIdentifier", theSourceInfoIdentifier), currentHashCode, theSourceInfoIdentifier);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
