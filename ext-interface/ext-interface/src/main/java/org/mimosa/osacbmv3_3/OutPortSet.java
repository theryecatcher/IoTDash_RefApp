
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for OutPortSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutPortSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="lastUpdate" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime" minOccurs="0"/>
 *         &lt;element name="outPorts" type="{http://www.mimosa.org/OSACBMV3.3.1}Port" maxOccurs="unbounded"/>
 *         &lt;element name="site" type="{http://www.mimosa.org/OSACBMV3.3.1}Site"/>
 *         &lt;element name="templateSite" type="{http://www.mimosa.org/OSACBMV3.3.1}Site" minOccurs="0"/>
 *         &lt;element name="verId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutPortSet", propOrder = {
    "id",
    "lastUpdate",
    "outPorts",
    "site",
    "templateSite",
    "verId"
})
public class OutPortSet
    implements Serializable, Equals, HashCode, ToString
{

    @XmlSchemaType(name = "unsignedInt")
    protected long id;
    protected OsacbmTime lastUpdate;
    @XmlElement(required = true)
    protected List<Port> outPorts;
    @XmlElement(required = true)
    protected Site site;
    protected Site templateSite;
    @XmlSchemaType(name = "unsignedInt")
    protected long verId;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
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
     * Gets the value of the outPorts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outPorts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutPorts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Port }
     * 
     * 
     */
    public List<Port> getOutPorts() {
        if (outPorts == null) {
            outPorts = new ArrayList<Port>();
        }
        return this.outPorts;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setSite(Site value) {
        this.site = value;
    }

    /**
     * Gets the value of the templateSite property.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getTemplateSite() {
        return templateSite;
    }

    /**
     * Sets the value of the templateSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setTemplateSite(Site value) {
        this.templateSite = value;
    }

    /**
     * Gets the value of the verId property.
     * 
     */
    public long getVerId() {
        return verId;
    }

    /**
     * Sets the value of the verId property.
     * 
     */
    public void setVerId(long value) {
        this.verId = value;
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
            long theId;
            theId = (true?this.getId(): 0L);
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            OsacbmTime theLastUpdate;
            theLastUpdate = this.getLastUpdate();
            strategy.appendField(locator, this, "lastUpdate", buffer, theLastUpdate);
        }
        {
            List<Port> theOutPorts;
            theOutPorts = (((this.outPorts!= null)&&(!this.outPorts.isEmpty()))?this.getOutPorts():null);
            strategy.appendField(locator, this, "outPorts", buffer, theOutPorts);
        }
        {
            Site theSite;
            theSite = this.getSite();
            strategy.appendField(locator, this, "site", buffer, theSite);
        }
        {
            Site theTemplateSite;
            theTemplateSite = this.getTemplateSite();
            strategy.appendField(locator, this, "templateSite", buffer, theTemplateSite);
        }
        {
            long theVerId;
            theVerId = (true?this.getVerId(): 0L);
            strategy.appendField(locator, this, "verId", buffer, theVerId);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OutPortSet)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OutPortSet that = ((OutPortSet) object);
        {
            long lhsId;
            lhsId = (true?this.getId(): 0L);
            long rhsId;
            rhsId = (true?that.getId(): 0L);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
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
            List<Port> lhsOutPorts;
            lhsOutPorts = (((this.outPorts!= null)&&(!this.outPorts.isEmpty()))?this.getOutPorts():null);
            List<Port> rhsOutPorts;
            rhsOutPorts = (((that.outPorts!= null)&&(!that.outPorts.isEmpty()))?that.getOutPorts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outPorts", lhsOutPorts), LocatorUtils.property(thatLocator, "outPorts", rhsOutPorts), lhsOutPorts, rhsOutPorts)) {
                return false;
            }
        }
        {
            Site lhsSite;
            lhsSite = this.getSite();
            Site rhsSite;
            rhsSite = that.getSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "site", lhsSite), LocatorUtils.property(thatLocator, "site", rhsSite), lhsSite, rhsSite)) {
                return false;
            }
        }
        {
            Site lhsTemplateSite;
            lhsTemplateSite = this.getTemplateSite();
            Site rhsTemplateSite;
            rhsTemplateSite = that.getTemplateSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "templateSite", lhsTemplateSite), LocatorUtils.property(thatLocator, "templateSite", rhsTemplateSite), lhsTemplateSite, rhsTemplateSite)) {
                return false;
            }
        }
        {
            long lhsVerId;
            lhsVerId = (true?this.getVerId(): 0L);
            long rhsVerId;
            rhsVerId = (true?that.getVerId(): 0L);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verId", lhsVerId), LocatorUtils.property(thatLocator, "verId", rhsVerId), lhsVerId, rhsVerId)) {
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
            long theId;
            theId = (true?this.getId(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            OsacbmTime theLastUpdate;
            theLastUpdate = this.getLastUpdate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastUpdate", theLastUpdate), currentHashCode, theLastUpdate);
        }
        {
            List<Port> theOutPorts;
            theOutPorts = (((this.outPorts!= null)&&(!this.outPorts.isEmpty()))?this.getOutPorts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outPorts", theOutPorts), currentHashCode, theOutPorts);
        }
        {
            Site theSite;
            theSite = this.getSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "site", theSite), currentHashCode, theSite);
        }
        {
            Site theTemplateSite;
            theTemplateSite = this.getTemplateSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "templateSite", theTemplateSite), currentHashCode, theTemplateSite);
        }
        {
            long theVerId;
            theVerId = (true?this.getVerId(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "verId", theVerId), currentHashCode, theVerId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
