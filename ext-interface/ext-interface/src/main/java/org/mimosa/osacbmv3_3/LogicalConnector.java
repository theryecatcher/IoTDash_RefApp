
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for LogicalConnector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogicalConnector">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="likelihood" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="nodeEventExplanation" type="{http://www.mimosa.org/OSACBMV3.3.1}Explanation" minOccurs="0"/>
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Metric" type="{http://www.mimosa.org/OSACBMV3.3.1}Metric" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogicalConnector", propOrder = {
    "likelihood",
    "nodeEventExplanation",
    "nodeId",
    "metric"
})
@XmlSeeAlso({
    PropEvent.class,
    NotConnector.class,
    AndConnector.class,
    OrConnector.class
})
public class LogicalConnector
    implements Serializable, Equals, HashCode, ToString
{

    protected Double likelihood;
    protected Explanation nodeEventExplanation;
    protected int nodeId;
    @XmlElement(name = "Metric")
    protected List<Metric> metric;

    /**
     * Gets the value of the likelihood property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLikelihood() {
        return likelihood;
    }

    /**
     * Sets the value of the likelihood property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLikelihood(Double value) {
        this.likelihood = value;
    }

    /**
     * Gets the value of the nodeEventExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link Explanation }
     *     
     */
    public Explanation getNodeEventExplanation() {
        return nodeEventExplanation;
    }

    /**
     * Sets the value of the nodeEventExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Explanation }
     *     
     */
    public void setNodeEventExplanation(Explanation value) {
        this.nodeEventExplanation = value;
    }

    /**
     * Gets the value of the nodeId property.
     * 
     */
    public int getNodeId() {
        return nodeId;
    }

    /**
     * Sets the value of the nodeId property.
     * 
     */
    public void setNodeId(int value) {
        this.nodeId = value;
    }

    /**
     * Gets the value of the metric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetric().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Metric }
     * 
     * 
     */
    public List<Metric> getMetric() {
        if (metric == null) {
            metric = new ArrayList<Metric>();
        }
        return this.metric;
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
            Double theLikelihood;
            theLikelihood = this.getLikelihood();
            strategy.appendField(locator, this, "likelihood", buffer, theLikelihood);
        }
        {
            Explanation theNodeEventExplanation;
            theNodeEventExplanation = this.getNodeEventExplanation();
            strategy.appendField(locator, this, "nodeEventExplanation", buffer, theNodeEventExplanation);
        }
        {
            int theNodeId;
            theNodeId = (true?this.getNodeId(): 0);
            strategy.appendField(locator, this, "nodeId", buffer, theNodeId);
        }
        {
            List<Metric> theMetric;
            theMetric = (((this.metric!= null)&&(!this.metric.isEmpty()))?this.getMetric():null);
            strategy.appendField(locator, this, "metric", buffer, theMetric);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LogicalConnector)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LogicalConnector that = ((LogicalConnector) object);
        {
            Double lhsLikelihood;
            lhsLikelihood = this.getLikelihood();
            Double rhsLikelihood;
            rhsLikelihood = that.getLikelihood();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "likelihood", lhsLikelihood), LocatorUtils.property(thatLocator, "likelihood", rhsLikelihood), lhsLikelihood, rhsLikelihood)) {
                return false;
            }
        }
        {
            Explanation lhsNodeEventExplanation;
            lhsNodeEventExplanation = this.getNodeEventExplanation();
            Explanation rhsNodeEventExplanation;
            rhsNodeEventExplanation = that.getNodeEventExplanation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nodeEventExplanation", lhsNodeEventExplanation), LocatorUtils.property(thatLocator, "nodeEventExplanation", rhsNodeEventExplanation), lhsNodeEventExplanation, rhsNodeEventExplanation)) {
                return false;
            }
        }
        {
            int lhsNodeId;
            lhsNodeId = (true?this.getNodeId(): 0);
            int rhsNodeId;
            rhsNodeId = (true?that.getNodeId(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nodeId", lhsNodeId), LocatorUtils.property(thatLocator, "nodeId", rhsNodeId), lhsNodeId, rhsNodeId)) {
                return false;
            }
        }
        {
            List<Metric> lhsMetric;
            lhsMetric = (((this.metric!= null)&&(!this.metric.isEmpty()))?this.getMetric():null);
            List<Metric> rhsMetric;
            rhsMetric = (((that.metric!= null)&&(!that.metric.isEmpty()))?that.getMetric():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "metric", lhsMetric), LocatorUtils.property(thatLocator, "metric", rhsMetric), lhsMetric, rhsMetric)) {
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
            Double theLikelihood;
            theLikelihood = this.getLikelihood();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "likelihood", theLikelihood), currentHashCode, theLikelihood);
        }
        {
            Explanation theNodeEventExplanation;
            theNodeEventExplanation = this.getNodeEventExplanation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nodeEventExplanation", theNodeEventExplanation), currentHashCode, theNodeEventExplanation);
        }
        {
            int theNodeId;
            theNodeId = (true?this.getNodeId(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nodeId", theNodeId), currentHashCode, theNodeId);
        }
        {
            List<Metric> theMetric;
            theMetric = (((this.metric!= null)&&(!this.metric.isEmpty()))?this.getMetric():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "metric", theMetric), currentHashCode, theMetric);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
