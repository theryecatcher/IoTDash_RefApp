
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
 * <p>Java class for AssetInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataSource" type="{http://www.mimosa.org/OSACBMV3.3.1}DataSource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transd" type="{http://www.mimosa.org/OSACBMV3.3.1}Transducer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetInfo", propOrder = {
    "dataSource",
    "transd"
})
public class AssetInfo
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(nillable = true)
    protected List<DataSource> dataSource;
    @XmlElement(nillable = true)
    protected List<Transducer> transd;

    /**
     * Gets the value of the dataSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSource }
     * 
     * 
     */
    public List<DataSource> getDataSource() {
        if (dataSource == null) {
            dataSource = new ArrayList<DataSource>();
        }
        return this.dataSource;
    }

    /**
     * Gets the value of the transd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transducer }
     * 
     * 
     */
    public List<Transducer> getTransd() {
        if (transd == null) {
            transd = new ArrayList<Transducer>();
        }
        return this.transd;
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
            List<DataSource> theDataSource;
            theDataSource = (((this.dataSource!= null)&&(!this.dataSource.isEmpty()))?this.getDataSource():null);
            strategy.appendField(locator, this, "dataSource", buffer, theDataSource);
        }
        {
            List<Transducer> theTransd;
            theTransd = (((this.transd!= null)&&(!this.transd.isEmpty()))?this.getTransd():null);
            strategy.appendField(locator, this, "transd", buffer, theTransd);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AssetInfo)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AssetInfo that = ((AssetInfo) object);
        {
            List<DataSource> lhsDataSource;
            lhsDataSource = (((this.dataSource!= null)&&(!this.dataSource.isEmpty()))?this.getDataSource():null);
            List<DataSource> rhsDataSource;
            rhsDataSource = (((that.dataSource!= null)&&(!that.dataSource.isEmpty()))?that.getDataSource():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataSource", lhsDataSource), LocatorUtils.property(thatLocator, "dataSource", rhsDataSource), lhsDataSource, rhsDataSource)) {
                return false;
            }
        }
        {
            List<Transducer> lhsTransd;
            lhsTransd = (((this.transd!= null)&&(!this.transd.isEmpty()))?this.getTransd():null);
            List<Transducer> rhsTransd;
            rhsTransd = (((that.transd!= null)&&(!that.transd.isEmpty()))?that.getTransd():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transd", lhsTransd), LocatorUtils.property(thatLocator, "transd", rhsTransd), lhsTransd, rhsTransd)) {
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
            List<DataSource> theDataSource;
            theDataSource = (((this.dataSource!= null)&&(!this.dataSource.isEmpty()))?this.getDataSource():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataSource", theDataSource), currentHashCode, theDataSource);
        }
        {
            List<Transducer> theTransd;
            theTransd = (((this.transd!= null)&&(!this.transd.isEmpty()))?this.getTransd():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transd", theTransd), currentHashCode, theTransd);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
