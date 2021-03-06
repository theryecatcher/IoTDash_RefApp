
package com.ge.dsp.pm.ext.entity.context;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrchestrationContextMapEntries.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrchestrationContextMapEntries">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SolutionId"/>
 *     &lt;enumeration value="SolutionName"/>
 *     &lt;enumeration value="OrchestrationId"/>
 *     &lt;enumeration value="Asset"/>
 *     &lt;enumeration value="ExternalAttributeMap"/>
 *     &lt;enumeration value="DateTime"/>
 *     &lt;enumeration value="RDRServiceIdentifier"/>
 *     &lt;enumeration value="ADHServiceIdentifier"/>
 *     &lt;enumeration value="BundleDataWithAnalyticCall"/>
 *     &lt;enumeration value="StreamingEnabled"/>
 *     &lt;enumeration value="ProcessDefinitionId"/>
 *     &lt;enumeration value="ProcessInstanceId"/>
 *     &lt;enumeration value="OrchestrationName"/>
 *     &lt;enumeration value="OrchestrationGroupName"/>
 *     &lt;enumeration value="DispatchRuleId"/>
 *     &lt;enumeration value="DispatchRuleName"/>
 *     &lt;enumeration value="UomProviderHostAddress"/>
 *     &lt;enumeration value="UomProviderPortNumber"/>
 *     &lt;enumeration value="AssetGroupId"/>
 *     &lt;enumeration value="AssetGroupName"/>
 *     &lt;enumeration value="LongRunning"/>
 *     &lt;enumeration value="OrchestrationGroupId"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrchestrationContextMapEntries")
@XmlEnum
public enum OrchestrationContextMapEntries {

    @XmlEnumValue("SolutionId")
    SOLUTION_ID("SolutionId"),
    @XmlEnumValue("SolutionName")
    SOLUTION_NAME("SolutionName"),
    @XmlEnumValue("OrchestrationId")
    ORCHESTRATION_ID("OrchestrationId"),
    @XmlEnumValue("Asset")
    ASSET("Asset"),
    @XmlEnumValue("ExternalAttributeMap")
    EXTERNAL_ATTRIBUTE_MAP("ExternalAttributeMap"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("RDRServiceIdentifier")
    RDR_SERVICE_IDENTIFIER("RDRServiceIdentifier"),
    @XmlEnumValue("ADHServiceIdentifier")
    ADH_SERVICE_IDENTIFIER("ADHServiceIdentifier"),
    @XmlEnumValue("BundleDataWithAnalyticCall")
    BUNDLE_DATA_WITH_ANALYTIC_CALL("BundleDataWithAnalyticCall"),
    @XmlEnumValue("StreamingEnabled")
    STREAMING_ENABLED("StreamingEnabled"),
    @XmlEnumValue("ProcessDefinitionId")
    PROCESS_DEFINITION_ID("ProcessDefinitionId"),
    @XmlEnumValue("ProcessInstanceId")
    PROCESS_INSTANCE_ID("ProcessInstanceId"),
    @XmlEnumValue("OrchestrationName")
    ORCHESTRATION_NAME("OrchestrationName"),
    @XmlEnumValue("OrchestrationGroupName")
    ORCHESTRATION_GROUP_NAME("OrchestrationGroupName"),
    @XmlEnumValue("DispatchRuleId")
    DISPATCH_RULE_ID("DispatchRuleId"),
    @XmlEnumValue("DispatchRuleName")
    DISPATCH_RULE_NAME("DispatchRuleName"),
    @XmlEnumValue("UomProviderHostAddress")
    UOM_PROVIDER_HOST_ADDRESS("UomProviderHostAddress"),
    @XmlEnumValue("UomProviderPortNumber")
    UOM_PROVIDER_PORT_NUMBER("UomProviderPortNumber"),
    @XmlEnumValue("AssetGroupId")
    ASSET_GROUP_ID("AssetGroupId"),
    @XmlEnumValue("AssetGroupName")
    ASSET_GROUP_NAME("AssetGroupName"),
    @XmlEnumValue("LongRunning")
    LONG_RUNNING("LongRunning"),
    @XmlEnumValue("OrchestrationGroupId")
    ORCHESTRATION_GROUP_ID("OrchestrationGroupId");
    private final String value;

    OrchestrationContextMapEntries(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrchestrationContextMapEntries fromValue(String v) {
        for (OrchestrationContextMapEntries c: OrchestrationContextMapEntries.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
