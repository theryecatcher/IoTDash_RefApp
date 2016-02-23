
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for AlgorithmInputValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlgorithmInputValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="argId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="constant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eu" type="{http://www.mimosa.org/OSACBMV3.3.1}EngUnit" minOccurs="0"/>
 *         &lt;element name="lastUpdate" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compositeValues" type="{http://www.mimosa.org/OSACBMV3.3.1}AlgorithmInputValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlgorithmInputValue", propOrder = {
    "argId",
    "constant",
    "desc",
    "eu",
    "lastUpdate",
    "name",
    "userTag",
    "compositeValues"
})
@XmlSeeAlso({
    AlgorithmInputReal.class,
    AlgorithmInputChar.class,
    AlgorithmInputInt.class
})
public class AlgorithmInputValue
    implements Serializable, Equals, HashCode, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected long argId;
    protected boolean constant;
    protected String desc;
    protected EngUnit eu;
    protected OsacbmTime lastUpdate;
    protected String name;
    protected String userTag;
    @XmlElement(nillable = true)
    protected List<AlgorithmInputValue> compositeValues;

    /**
     * Gets the value of the argId property.
     * 
     */
    public long getArgId() {
        return argId;
    }

    /**
     * Sets the value of the argId property.
     * 
     */
    public void setArgId(long value) {
        this.argId = value;
    }

    /**
     * Gets the value of the constant property.
     * 
     */
    public boolean isConstant() {
        return constant;
    }

    /**
     * Sets the value of the constant property.
     * 
     */
    public void setConstant(boolean value) {
        this.constant = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the eu property.
     * 
     * @return
     *     possible object is
     *     {@link EngUnit }
     *     
     */
    public EngUnit getEu() {
        return eu;
    }

    /**
     * Sets the value of the eu property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngUnit }
     *     
     */
    public void setEu(EngUnit value) {
        this.eu = value;
    }

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setLastUpdate(OsacbmTime value) {
        this.lastUpdate = value;
    }

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
     * Gets the value of the userTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserTag() {
        return userTag;
    }

    /**
     * Sets the value of the userTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserTag(String value) {
        this.userTag = value;
    }

    /**
     * Gets the value of the compositeValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositeValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositeValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlgorithmInputValue }
     * 
     * 
     */
    public List<AlgorithmInputValue> getCompositeValues() {
        if (compositeValues == null) {
            compositeValues = new ArrayList<AlgorithmInputValue>();
        }
        return this.compositeValues;
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
            long theArgId;
            theArgId = (true?this.getArgId(): 0L);
            strategy.appendField(locator, this, "argId", buffer, theArgId);
        }
        {
            boolean theConstant;
            theConstant = (true?this.isConstant():false);
            strategy.appendField(locator, this, "constant", buffer, theConstant);
        }
        {
            String theDesc;
            theDesc = this.getDesc();
            strategy.appendField(locator, this, "desc", buffer, theDesc);
        }
        {
            EngUnit theEu;
            theEu = this.getEu();
            strategy.appendField(locator, this, "eu", buffer, theEu);
        }
        {
            OsacbmTime theLastUpdate;
            theLastUpdate = this.getLastUpdate();
            strategy.appendField(locator, this, "lastUpdate", buffer, theLastUpdate);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theUserTag;
            theUserTag = this.getUserTag();
            strategy.appendField(locator, this, "userTag", buffer, theUserTag);
        }
        {
            List<AlgorithmInputValue> theCompositeValues;
            theCompositeValues = (((this.compositeValues!= null)&&(!this.compositeValues.isEmpty()))?this.getCompositeValues():null);
            strategy.appendField(locator, this, "compositeValues", buffer, theCompositeValues);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AlgorithmInputValue)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AlgorithmInputValue that = ((AlgorithmInputValue) object);
        {
            long lhsArgId;
            lhsArgId = (true?this.getArgId(): 0L);
            long rhsArgId;
            rhsArgId = (true?that.getArgId(): 0L);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "argId", lhsArgId), LocatorUtils.property(thatLocator, "argId", rhsArgId), lhsArgId, rhsArgId)) {
                return false;
            }
        }
        {
            boolean lhsConstant;
            lhsConstant = (true?this.isConstant():false);
            boolean rhsConstant;
            rhsConstant = (true?that.isConstant():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constant", lhsConstant), LocatorUtils.property(thatLocator, "constant", rhsConstant), lhsConstant, rhsConstant)) {
                return false;
            }
        }
        {
            String lhsDesc;
            lhsDesc = this.getDesc();
            String rhsDesc;
            rhsDesc = that.getDesc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "desc", lhsDesc), LocatorUtils.property(thatLocator, "desc", rhsDesc), lhsDesc, rhsDesc)) {
                return false;
            }
        }
        {
            EngUnit lhsEu;
            lhsEu = this.getEu();
            EngUnit rhsEu;
            rhsEu = that.getEu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eu", lhsEu), LocatorUtils.property(thatLocator, "eu", rhsEu), lhsEu, rhsEu)) {
                return false;
            }
        }
        {
            OsacbmTime lhsLastUpdate;
            lhsLastUpdate = this.getLastUpdate();
            OsacbmTime rhsLastUpdate;
            rhsLastUpdate = that.getLastUpdate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastUpdate", lhsLastUpdate), LocatorUtils.property(thatLocator, "lastUpdate", rhsLastUpdate), lhsLastUpdate, rhsLastUpdate)) {
                return false;
            }
        }
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
            String lhsUserTag;
            lhsUserTag = this.getUserTag();
            String rhsUserTag;
            rhsUserTag = that.getUserTag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userTag", lhsUserTag), LocatorUtils.property(thatLocator, "userTag", rhsUserTag), lhsUserTag, rhsUserTag)) {
                return false;
            }
        }
        {
            List<AlgorithmInputValue> lhsCompositeValues;
            lhsCompositeValues = (((this.compositeValues!= null)&&(!this.compositeValues.isEmpty()))?this.getCompositeValues():null);
            List<AlgorithmInputValue> rhsCompositeValues;
            rhsCompositeValues = (((that.compositeValues!= null)&&(!that.compositeValues.isEmpty()))?that.getCompositeValues():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "compositeValues", lhsCompositeValues), LocatorUtils.property(thatLocator, "compositeValues", rhsCompositeValues), lhsCompositeValues, rhsCompositeValues)) {
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
            long theArgId;
            theArgId = (true?this.getArgId(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "argId", theArgId), currentHashCode, theArgId);
        }
        {
            boolean theConstant;
            theConstant = (true?this.isConstant():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "constant", theConstant), currentHashCode, theConstant);
        }
        {
            String theDesc;
            theDesc = this.getDesc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "desc", theDesc), currentHashCode, theDesc);
        }
        {
            EngUnit theEu;
            theEu = this.getEu();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eu", theEu), currentHashCode, theEu);
        }
        {
            OsacbmTime theLastUpdate;
            theLastUpdate = this.getLastUpdate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastUpdate", theLastUpdate), currentHashCode, theLastUpdate);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theUserTag;
            theUserTag = this.getUserTag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userTag", theUserTag), currentHashCode, theUserTag);
        }
        {
            List<AlgorithmInputValue> theCompositeValues;
            theCompositeValues = (((this.compositeValues!= null)&&(!this.compositeValues.isEmpty()))?this.getCompositeValues():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compositeValues", theCompositeValues), currentHashCode, theCompositeValues);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
