
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
 * <p>Java class for Algorithm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Algorithm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="algorithmOutputs" type="{http://www.mimosa.org/OSACBMV3.3.1}AlgorithmOutput" maxOccurs="unbounded"/>
 *         &lt;element name="algorithmType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3"/>
 *         &lt;element name="algProcType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3"/>
 *         &lt;element name="inputValues" type="{http://www.mimosa.org/OSACBMV3.3.1}AlgorithmInputValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inputData" type="{http://www.mimosa.org/OSACBMV3.3.1}AlgorithmInputData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="models" type="{http://www.mimosa.org/OSACBMV3.3.1}AlgorithmModel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="procBdType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="processDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processDescBinary" type="{http://www.w3.org/2001/XMLSchema}byte" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.mimosa.org/OSACBMV3.3.1}OsacbmTime"/>
 *         &lt;element name="URIaprocType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="URIbdType" type="{http://www.mimosa.org/OSACBMV3.3.1}MIMKey3" minOccurs="0"/>
 *         &lt;element name="URIprocessDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verNum" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Algorithm", propOrder = {
    "algorithmOutputs",
    "algorithmType",
    "algProcType",
    "description",
    "id",
    "inputValues",
    "inputData",
    "models",
    "name",
    "procBdType",
    "processDesc",
    "processDescBinary",
    "startTime",
    "urIaprocType",
    "urIbdType",
    "urIprocessDesc",
    "userTag",
    "verNum"
})
public class Algorithm
    implements Serializable, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<AlgorithmOutput> algorithmOutputs;
    @XmlElement(required = true)
    protected MIMKey3 algorithmType;
    protected MIMKey3 algProcType;
    protected String description;
    @XmlElement(required = true)
    protected MIMKey3 id;
    @XmlElement(nillable = true)
    protected List<AlgorithmInputValue> inputValues;
    @XmlElement(nillable = true)
    protected List<AlgorithmInputData> inputData;
    @XmlElement(nillable = true)
    protected List<AlgorithmModel> models;
    protected String name;
    protected MIMKey3 procBdType;
    protected String processDesc;
    @XmlElement(type = Byte.class)
    protected List<Byte> processDescBinary;
    @XmlElement(required = true)
    protected OsacbmTime startTime;
    @XmlElement(name = "URIaprocType")
    protected MIMKey3 urIaprocType;
    @XmlElement(name = "URIbdType")
    protected MIMKey3 urIbdType;
    @XmlElement(name = "URIprocessDesc")
    protected String urIprocessDesc;
    protected String userTag;
    @XmlSchemaType(name = "unsignedInt")
    protected long verNum;

    /**
     * Gets the value of the algorithmOutputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the algorithmOutputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlgorithmOutputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlgorithmOutput }
     * 
     * 
     */
    public List<AlgorithmOutput> getAlgorithmOutputs() {
        if (algorithmOutputs == null) {
            algorithmOutputs = new ArrayList<AlgorithmOutput>();
        }
        return this.algorithmOutputs;
    }

    /**
     * Gets the value of the algorithmType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getAlgorithmType() {
        return algorithmType;
    }

    /**
     * Sets the value of the algorithmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setAlgorithmType(MIMKey3 value) {
        this.algorithmType = value;
    }

    /**
     * Gets the value of the algProcType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getAlgProcType() {
        return algProcType;
    }

    /**
     * Sets the value of the algProcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setAlgProcType(MIMKey3 value) {
        this.algProcType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setId(MIMKey3 value) {
        this.id = value;
    }

    /**
     * Gets the value of the inputValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlgorithmInputValue }
     * 
     * 
     */
    public List<AlgorithmInputValue> getInputValues() {
        if (inputValues == null) {
            inputValues = new ArrayList<AlgorithmInputValue>();
        }
        return this.inputValues;
    }

    /**
     * Gets the value of the inputData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlgorithmInputData }
     * 
     * 
     */
    public List<AlgorithmInputData> getInputData() {
        if (inputData == null) {
            inputData = new ArrayList<AlgorithmInputData>();
        }
        return this.inputData;
    }

    /**
     * Gets the value of the models property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the models property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlgorithmModel }
     * 
     * 
     */
    public List<AlgorithmModel> getModels() {
        if (models == null) {
            models = new ArrayList<AlgorithmModel>();
        }
        return this.models;
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
     * Gets the value of the procBdType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getProcBdType() {
        return procBdType;
    }

    /**
     * Sets the value of the procBdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setProcBdType(MIMKey3 value) {
        this.procBdType = value;
    }

    /**
     * Gets the value of the processDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessDesc() {
        return processDesc;
    }

    /**
     * Sets the value of the processDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessDesc(String value) {
        this.processDesc = value;
    }

    /**
     * Gets the value of the processDescBinary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processDescBinary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessDescBinary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Byte }
     * 
     * 
     */
    public List<Byte> getProcessDescBinary() {
        if (processDescBinary == null) {
            processDescBinary = new ArrayList<Byte>();
        }
        return this.processDescBinary;
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
     * Gets the value of the urIaprocType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getURIaprocType() {
        return urIaprocType;
    }

    /**
     * Sets the value of the urIaprocType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setURIaprocType(MIMKey3 value) {
        this.urIaprocType = value;
    }

    /**
     * Gets the value of the urIbdType property.
     * 
     * @return
     *     possible object is
     *     {@link MIMKey3 }
     *     
     */
    public MIMKey3 getURIbdType() {
        return urIbdType;
    }

    /**
     * Sets the value of the urIbdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMKey3 }
     *     
     */
    public void setURIbdType(MIMKey3 value) {
        this.urIbdType = value;
    }

    /**
     * Gets the value of the urIprocessDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURIprocessDesc() {
        return urIprocessDesc;
    }

    /**
     * Sets the value of the urIprocessDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURIprocessDesc(String value) {
        this.urIprocessDesc = value;
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
     * Gets the value of the verNum property.
     * 
     */
    public long getVerNum() {
        return verNum;
    }

    /**
     * Sets the value of the verNum property.
     * 
     */
    public void setVerNum(long value) {
        this.verNum = value;
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
            List<AlgorithmOutput> theAlgorithmOutputs;
            theAlgorithmOutputs = (((this.algorithmOutputs!= null)&&(!this.algorithmOutputs.isEmpty()))?this.getAlgorithmOutputs():null);
            strategy.appendField(locator, this, "algorithmOutputs", buffer, theAlgorithmOutputs);
        }
        {
            MIMKey3 theAlgorithmType;
            theAlgorithmType = this.getAlgorithmType();
            strategy.appendField(locator, this, "algorithmType", buffer, theAlgorithmType);
        }
        {
            MIMKey3 theAlgProcType;
            theAlgProcType = this.getAlgProcType();
            strategy.appendField(locator, this, "algProcType", buffer, theAlgProcType);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            MIMKey3 theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            List<AlgorithmInputValue> theInputValues;
            theInputValues = (((this.inputValues!= null)&&(!this.inputValues.isEmpty()))?this.getInputValues():null);
            strategy.appendField(locator, this, "inputValues", buffer, theInputValues);
        }
        {
            List<AlgorithmInputData> theInputData;
            theInputData = (((this.inputData!= null)&&(!this.inputData.isEmpty()))?this.getInputData():null);
            strategy.appendField(locator, this, "inputData", buffer, theInputData);
        }
        {
            List<AlgorithmModel> theModels;
            theModels = (((this.models!= null)&&(!this.models.isEmpty()))?this.getModels():null);
            strategy.appendField(locator, this, "models", buffer, theModels);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            MIMKey3 theProcBdType;
            theProcBdType = this.getProcBdType();
            strategy.appendField(locator, this, "procBdType", buffer, theProcBdType);
        }
        {
            String theProcessDesc;
            theProcessDesc = this.getProcessDesc();
            strategy.appendField(locator, this, "processDesc", buffer, theProcessDesc);
        }
        {
            List<Byte> theProcessDescBinary;
            theProcessDescBinary = (((this.processDescBinary!= null)&&(!this.processDescBinary.isEmpty()))?this.getProcessDescBinary():null);
            strategy.appendField(locator, this, "processDescBinary", buffer, theProcessDescBinary);
        }
        {
            OsacbmTime theStartTime;
            theStartTime = this.getStartTime();
            strategy.appendField(locator, this, "startTime", buffer, theStartTime);
        }
        {
            MIMKey3 theURIaprocType;
            theURIaprocType = this.getURIaprocType();
            strategy.appendField(locator, this, "urIaprocType", buffer, theURIaprocType);
        }
        {
            MIMKey3 theURIbdType;
            theURIbdType = this.getURIbdType();
            strategy.appendField(locator, this, "urIbdType", buffer, theURIbdType);
        }
        {
            String theURIprocessDesc;
            theURIprocessDesc = this.getURIprocessDesc();
            strategy.appendField(locator, this, "urIprocessDesc", buffer, theURIprocessDesc);
        }
        {
            String theUserTag;
            theUserTag = this.getUserTag();
            strategy.appendField(locator, this, "userTag", buffer, theUserTag);
        }
        {
            long theVerNum;
            theVerNum = (true?this.getVerNum(): 0L);
            strategy.appendField(locator, this, "verNum", buffer, theVerNum);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Algorithm)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Algorithm that = ((Algorithm) object);
        {
            List<AlgorithmOutput> lhsAlgorithmOutputs;
            lhsAlgorithmOutputs = (((this.algorithmOutputs!= null)&&(!this.algorithmOutputs.isEmpty()))?this.getAlgorithmOutputs():null);
            List<AlgorithmOutput> rhsAlgorithmOutputs;
            rhsAlgorithmOutputs = (((that.algorithmOutputs!= null)&&(!that.algorithmOutputs.isEmpty()))?that.getAlgorithmOutputs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "algorithmOutputs", lhsAlgorithmOutputs), LocatorUtils.property(thatLocator, "algorithmOutputs", rhsAlgorithmOutputs), lhsAlgorithmOutputs, rhsAlgorithmOutputs)) {
                return false;
            }
        }
        {
            MIMKey3 lhsAlgorithmType;
            lhsAlgorithmType = this.getAlgorithmType();
            MIMKey3 rhsAlgorithmType;
            rhsAlgorithmType = that.getAlgorithmType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "algorithmType", lhsAlgorithmType), LocatorUtils.property(thatLocator, "algorithmType", rhsAlgorithmType), lhsAlgorithmType, rhsAlgorithmType)) {
                return false;
            }
        }
        {
            MIMKey3 lhsAlgProcType;
            lhsAlgProcType = this.getAlgProcType();
            MIMKey3 rhsAlgProcType;
            rhsAlgProcType = that.getAlgProcType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "algProcType", lhsAlgProcType), LocatorUtils.property(thatLocator, "algProcType", rhsAlgProcType), lhsAlgProcType, rhsAlgProcType)) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            MIMKey3 lhsId;
            lhsId = this.getId();
            MIMKey3 rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            List<AlgorithmInputValue> lhsInputValues;
            lhsInputValues = (((this.inputValues!= null)&&(!this.inputValues.isEmpty()))?this.getInputValues():null);
            List<AlgorithmInputValue> rhsInputValues;
            rhsInputValues = (((that.inputValues!= null)&&(!that.inputValues.isEmpty()))?that.getInputValues():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inputValues", lhsInputValues), LocatorUtils.property(thatLocator, "inputValues", rhsInputValues), lhsInputValues, rhsInputValues)) {
                return false;
            }
        }
        {
            List<AlgorithmInputData> lhsInputData;
            lhsInputData = (((this.inputData!= null)&&(!this.inputData.isEmpty()))?this.getInputData():null);
            List<AlgorithmInputData> rhsInputData;
            rhsInputData = (((that.inputData!= null)&&(!that.inputData.isEmpty()))?that.getInputData():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inputData", lhsInputData), LocatorUtils.property(thatLocator, "inputData", rhsInputData), lhsInputData, rhsInputData)) {
                return false;
            }
        }
        {
            List<AlgorithmModel> lhsModels;
            lhsModels = (((this.models!= null)&&(!this.models.isEmpty()))?this.getModels():null);
            List<AlgorithmModel> rhsModels;
            rhsModels = (((that.models!= null)&&(!that.models.isEmpty()))?that.getModels():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "models", lhsModels), LocatorUtils.property(thatLocator, "models", rhsModels), lhsModels, rhsModels)) {
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
            MIMKey3 lhsProcBdType;
            lhsProcBdType = this.getProcBdType();
            MIMKey3 rhsProcBdType;
            rhsProcBdType = that.getProcBdType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "procBdType", lhsProcBdType), LocatorUtils.property(thatLocator, "procBdType", rhsProcBdType), lhsProcBdType, rhsProcBdType)) {
                return false;
            }
        }
        {
            String lhsProcessDesc;
            lhsProcessDesc = this.getProcessDesc();
            String rhsProcessDesc;
            rhsProcessDesc = that.getProcessDesc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processDesc", lhsProcessDesc), LocatorUtils.property(thatLocator, "processDesc", rhsProcessDesc), lhsProcessDesc, rhsProcessDesc)) {
                return false;
            }
        }
        {
            List<Byte> lhsProcessDescBinary;
            lhsProcessDescBinary = (((this.processDescBinary!= null)&&(!this.processDescBinary.isEmpty()))?this.getProcessDescBinary():null);
            List<Byte> rhsProcessDescBinary;
            rhsProcessDescBinary = (((that.processDescBinary!= null)&&(!that.processDescBinary.isEmpty()))?that.getProcessDescBinary():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processDescBinary", lhsProcessDescBinary), LocatorUtils.property(thatLocator, "processDescBinary", rhsProcessDescBinary), lhsProcessDescBinary, rhsProcessDescBinary)) {
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
            MIMKey3 lhsURIaprocType;
            lhsURIaprocType = this.getURIaprocType();
            MIMKey3 rhsURIaprocType;
            rhsURIaprocType = that.getURIaprocType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "urIaprocType", lhsURIaprocType), LocatorUtils.property(thatLocator, "urIaprocType", rhsURIaprocType), lhsURIaprocType, rhsURIaprocType)) {
                return false;
            }
        }
        {
            MIMKey3 lhsURIbdType;
            lhsURIbdType = this.getURIbdType();
            MIMKey3 rhsURIbdType;
            rhsURIbdType = that.getURIbdType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "urIbdType", lhsURIbdType), LocatorUtils.property(thatLocator, "urIbdType", rhsURIbdType), lhsURIbdType, rhsURIbdType)) {
                return false;
            }
        }
        {
            String lhsURIprocessDesc;
            lhsURIprocessDesc = this.getURIprocessDesc();
            String rhsURIprocessDesc;
            rhsURIprocessDesc = that.getURIprocessDesc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "urIprocessDesc", lhsURIprocessDesc), LocatorUtils.property(thatLocator, "urIprocessDesc", rhsURIprocessDesc), lhsURIprocessDesc, rhsURIprocessDesc)) {
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
            long lhsVerNum;
            lhsVerNum = (true?this.getVerNum(): 0L);
            long rhsVerNum;
            rhsVerNum = (true?that.getVerNum(): 0L);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verNum", lhsVerNum), LocatorUtils.property(thatLocator, "verNum", rhsVerNum), lhsVerNum, rhsVerNum)) {
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
            List<AlgorithmOutput> theAlgorithmOutputs;
            theAlgorithmOutputs = (((this.algorithmOutputs!= null)&&(!this.algorithmOutputs.isEmpty()))?this.getAlgorithmOutputs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "algorithmOutputs", theAlgorithmOutputs), currentHashCode, theAlgorithmOutputs);
        }
        {
            MIMKey3 theAlgorithmType;
            theAlgorithmType = this.getAlgorithmType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "algorithmType", theAlgorithmType), currentHashCode, theAlgorithmType);
        }
        {
            MIMKey3 theAlgProcType;
            theAlgProcType = this.getAlgProcType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "algProcType", theAlgProcType), currentHashCode, theAlgProcType);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            MIMKey3 theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            List<AlgorithmInputValue> theInputValues;
            theInputValues = (((this.inputValues!= null)&&(!this.inputValues.isEmpty()))?this.getInputValues():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inputValues", theInputValues), currentHashCode, theInputValues);
        }
        {
            List<AlgorithmInputData> theInputData;
            theInputData = (((this.inputData!= null)&&(!this.inputData.isEmpty()))?this.getInputData():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inputData", theInputData), currentHashCode, theInputData);
        }
        {
            List<AlgorithmModel> theModels;
            theModels = (((this.models!= null)&&(!this.models.isEmpty()))?this.getModels():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "models", theModels), currentHashCode, theModels);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            MIMKey3 theProcBdType;
            theProcBdType = this.getProcBdType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "procBdType", theProcBdType), currentHashCode, theProcBdType);
        }
        {
            String theProcessDesc;
            theProcessDesc = this.getProcessDesc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processDesc", theProcessDesc), currentHashCode, theProcessDesc);
        }
        {
            List<Byte> theProcessDescBinary;
            theProcessDescBinary = (((this.processDescBinary!= null)&&(!this.processDescBinary.isEmpty()))?this.getProcessDescBinary():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processDescBinary", theProcessDescBinary), currentHashCode, theProcessDescBinary);
        }
        {
            OsacbmTime theStartTime;
            theStartTime = this.getStartTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startTime", theStartTime), currentHashCode, theStartTime);
        }
        {
            MIMKey3 theURIaprocType;
            theURIaprocType = this.getURIaprocType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "urIaprocType", theURIaprocType), currentHashCode, theURIaprocType);
        }
        {
            MIMKey3 theURIbdType;
            theURIbdType = this.getURIbdType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "urIbdType", theURIbdType), currentHashCode, theURIbdType);
        }
        {
            String theURIprocessDesc;
            theURIprocessDesc = this.getURIprocessDesc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "urIprocessDesc", theURIprocessDesc), currentHashCode, theURIprocessDesc);
        }
        {
            String theUserTag;
            theUserTag = this.getUserTag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userTag", theUserTag), currentHashCode, theUserTag);
        }
        {
            long theVerNum;
            theVerNum = (true?this.getVerNum(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "verNum", theVerNum), currentHashCode, theVerNum);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
