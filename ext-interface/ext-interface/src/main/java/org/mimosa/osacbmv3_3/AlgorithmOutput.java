
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for AlgorithmOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlgorithmOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="argId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outputEu" type="{http://www.mimosa.org/OSACBMV3.3.1}EngUnit"/>
 *         &lt;element name="outputRef" type="{http://www.mimosa.org/OSACBMV3.3.1}MonitorId"/>
 *         &lt;element name="startTime" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime"/>
 *         &lt;element name="userTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlgorithmOutput", propOrder = {
    "argId",
    "desc",
    "name",
    "outputEu",
    "outputRef",
    "startTime",
    "userTag"
})
public class AlgorithmOutput
    implements Serializable, Equals, HashCode, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected long argId;
    protected String desc;
    protected String name;
    @XmlElement(required = true)
    protected EngUnit outputEu;
    @XmlElement(required = true)
    protected MonitorId outputRef;
    @XmlElement(required = true)
    protected OsacbmTime startTime;
    protected String userTag;

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
     * Gets the value of the outputEu property.
     * 
     * @return
     *     possible object is
     *     {@link EngUnit }
     *     
     */
    public EngUnit getOutputEu() {
        return outputEu;
    }

    /**
     * Sets the value of the outputEu property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngUnit }
     *     
     */
    public void setOutputEu(EngUnit value) {
        this.outputEu = value;
    }

    /**
     * Gets the value of the outputRef property.
     * 
     * @return
     *     possible object is
     *     {@link MonitorId }
     *     
     */
    public MonitorId getOutputRef() {
        return outputRef;
    }

    /**
     * Sets the value of the outputRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitorId }
     *     
     */
    public void setOutputRef(MonitorId value) {
        this.outputRef = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link OsacbmTime }
     *     
     */
    public OsacbmTime getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsacbmTime }
     *     
     */
    public void setStartTime(OsacbmTime value) {
        this.startTime = value;
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
            String theDesc;
            theDesc = this.getDesc();
            strategy.appendField(locator, this, "desc", buffer, theDesc);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            EngUnit theOutputEu;
            theOutputEu = this.getOutputEu();
            strategy.appendField(locator, this, "outputEu", buffer, theOutputEu);
        }
        {
            MonitorId theOutputRef;
            theOutputRef = this.getOutputRef();
            strategy.appendField(locator, this, "outputRef", buffer, theOutputRef);
        }
        {
            OsacbmTime theStartTime;
            theStartTime = this.getStartTime();
            strategy.appendField(locator, this, "startTime", buffer, theStartTime);
        }
        {
            String theUserTag;
            theUserTag = this.getUserTag();
            strategy.appendField(locator, this, "userTag", buffer, theUserTag);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AlgorithmOutput)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AlgorithmOutput that = ((AlgorithmOutput) object);
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
            String lhsDesc;
            lhsDesc = this.getDesc();
            String rhsDesc;
            rhsDesc = that.getDesc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "desc", lhsDesc), LocatorUtils.property(thatLocator, "desc", rhsDesc), lhsDesc, rhsDesc)) {
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
            EngUnit lhsOutputEu;
            lhsOutputEu = this.getOutputEu();
            EngUnit rhsOutputEu;
            rhsOutputEu = that.getOutputEu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outputEu", lhsOutputEu), LocatorUtils.property(thatLocator, "outputEu", rhsOutputEu), lhsOutputEu, rhsOutputEu)) {
                return false;
            }
        }
        {
            MonitorId lhsOutputRef;
            lhsOutputRef = this.getOutputRef();
            MonitorId rhsOutputRef;
            rhsOutputRef = that.getOutputRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outputRef", lhsOutputRef), LocatorUtils.property(thatLocator, "outputRef", rhsOutputRef), lhsOutputRef, rhsOutputRef)) {
                return false;
            }
        }
        {
            OsacbmTime lhsStartTime;
            lhsStartTime = this.getStartTime();
            OsacbmTime rhsStartTime;
            rhsStartTime = that.getStartTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startTime", lhsStartTime), LocatorUtils.property(thatLocator, "startTime", rhsStartTime), lhsStartTime, rhsStartTime)) {
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
            String theDesc;
            theDesc = this.getDesc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "desc", theDesc), currentHashCode, theDesc);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            EngUnit theOutputEu;
            theOutputEu = this.getOutputEu();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outputEu", theOutputEu), currentHashCode, theOutputEu);
        }
        {
            MonitorId theOutputRef;
            theOutputRef = this.getOutputRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outputRef", theOutputRef), currentHashCode, theOutputRef);
        }
        {
            OsacbmTime theStartTime;
            theStartTime = this.getStartTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startTime", theStartTime), currentHashCode, theStartTime);
        }
        {
            String theUserTag;
            theUserTag = this.getUserTag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userTag", theUserTag), currentHashCode, theUserTag);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
