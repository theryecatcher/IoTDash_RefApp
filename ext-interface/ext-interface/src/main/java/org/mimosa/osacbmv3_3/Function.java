
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
 * <p>Java class for Function complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Function">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="by_agent" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey2" minOccurs="0"/>
 *         &lt;element name="func_db_id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="func_db_site" type="{http://www.mimosa.org/OSACBMV3.3.1}Site"/>
 *         &lt;element name="item_id" type="{http://www.mimosa.org/OSACBMV3.3.1}ItemId"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seq" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
@XmlType(name = "Function", propOrder = {
    "byAgent",
    "funcDbId",
    "funcDbSite",
    "itemId",
    "name",
    "seq",
    "userTag"
})
public class Function
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(name = "by_agent")
    protected MIMKey2 byAgent;
    @XmlElement(name = "func_db_id")
    @XmlSchemaType(name = "unsignedInt")
    protected long funcDbId;
    @XmlElement(name = "func_db_site", required = true)
    protected Site funcDbSite;
    @XmlElement(name = "item_id", required = true)
    protected ItemId itemId;
    protected String name;
    @XmlSchemaType(name = "unsignedInt")
    protected long seq;
    protected String userTag;

    /**
     * Gets the value of the byAgent property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey2 }
     *     
     */
    public MIMKey2 getByAgent() {
        return byAgent;
    }

    /**
     * Sets the value of the byAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey2 }
     *     
     */
    public void setByAgent(MIMKey2 value) {
        this.byAgent = value;
    }

    /**
     * Gets the value of the funcDbId property.
     * 
     */
    public long getFuncDbId() {
        return funcDbId;
    }

    /**
     * Sets the value of the funcDbId property.
     * 
     */
    public void setFuncDbId(long value) {
        this.funcDbId = value;
    }

    /**
     * Gets the value of the funcDbSite property.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getFuncDbSite() {
        return funcDbSite;
    }

    /**
     * Sets the value of the funcDbSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setFuncDbSite(Site value) {
        this.funcDbSite = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemId }
     *     
     */
    public ItemId getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemId }
     *     
     */
    public void setItemId(ItemId value) {
        this.itemId = value;
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
     * Gets the value of the seq property.
     * 
     */
    public long getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     */
    public void setSeq(long value) {
        this.seq = value;
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
            MIMKey2 theByAgent;
            theByAgent = this.getByAgent();
            strategy.appendField(locator, this, "byAgent", buffer, theByAgent);
        }
        {
            long theFuncDbId;
            theFuncDbId = (true?this.getFuncDbId(): 0L);
            strategy.appendField(locator, this, "funcDbId", buffer, theFuncDbId);
        }
        {
            Site theFuncDbSite;
            theFuncDbSite = this.getFuncDbSite();
            strategy.appendField(locator, this, "funcDbSite", buffer, theFuncDbSite);
        }
        {
            ItemId theItemId;
            theItemId = this.getItemId();
            strategy.appendField(locator, this, "itemId", buffer, theItemId);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            long theSeq;
            theSeq = (true?this.getSeq(): 0L);
            strategy.appendField(locator, this, "seq", buffer, theSeq);
        }
        {
            String theUserTag;
            theUserTag = this.getUserTag();
            strategy.appendField(locator, this, "userTag", buffer, theUserTag);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Function)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Function that = ((Function) object);
        {
            MIMKey2 lhsByAgent;
            lhsByAgent = this.getByAgent();
            MIMKey2 rhsByAgent;
            rhsByAgent = that.getByAgent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "byAgent", lhsByAgent), LocatorUtils.property(thatLocator, "byAgent", rhsByAgent), lhsByAgent, rhsByAgent)) {
                return false;
            }
        }
        {
            long lhsFuncDbId;
            lhsFuncDbId = (true?this.getFuncDbId(): 0L);
            long rhsFuncDbId;
            rhsFuncDbId = (true?that.getFuncDbId(): 0L);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "funcDbId", lhsFuncDbId), LocatorUtils.property(thatLocator, "funcDbId", rhsFuncDbId), lhsFuncDbId, rhsFuncDbId)) {
                return false;
            }
        }
        {
            Site lhsFuncDbSite;
            lhsFuncDbSite = this.getFuncDbSite();
            Site rhsFuncDbSite;
            rhsFuncDbSite = that.getFuncDbSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "funcDbSite", lhsFuncDbSite), LocatorUtils.property(thatLocator, "funcDbSite", rhsFuncDbSite), lhsFuncDbSite, rhsFuncDbSite)) {
                return false;
            }
        }
        {
            ItemId lhsItemId;
            lhsItemId = this.getItemId();
            ItemId rhsItemId;
            rhsItemId = that.getItemId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemId", lhsItemId), LocatorUtils.property(thatLocator, "itemId", rhsItemId), lhsItemId, rhsItemId)) {
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
            long lhsSeq;
            lhsSeq = (true?this.getSeq(): 0L);
            long rhsSeq;
            rhsSeq = (true?that.getSeq(): 0L);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "seq", lhsSeq), LocatorUtils.property(thatLocator, "seq", rhsSeq), lhsSeq, rhsSeq)) {
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
            MIMKey2 theByAgent;
            theByAgent = this.getByAgent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "byAgent", theByAgent), currentHashCode, theByAgent);
        }
        {
            long theFuncDbId;
            theFuncDbId = (true?this.getFuncDbId(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "funcDbId", theFuncDbId), currentHashCode, theFuncDbId);
        }
        {
            Site theFuncDbSite;
            theFuncDbSite = this.getFuncDbSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "funcDbSite", theFuncDbSite), currentHashCode, theFuncDbSite);
        }
        {
            ItemId theItemId;
            theItemId = this.getItemId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemId", theItemId), currentHashCode, theItemId);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            long theSeq;
            theSeq = (true?this.getSeq(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "seq", theSeq), currentHashCode, theSeq);
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
