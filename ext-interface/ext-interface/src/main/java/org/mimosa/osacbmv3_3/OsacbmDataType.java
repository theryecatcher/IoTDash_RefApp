
package org.mimosa.osacbmv3_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OsacbmDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OsacbmDataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InvalidUnsetType"/>
 *     &lt;enumeration value="DAWaveform"/>
 *     &lt;enumeration value="DABLOBData"/>
 *     &lt;enumeration value="DAVector"/>
 *     &lt;enumeration value="DADataSeq"/>
 *     &lt;enumeration value="DAReal"/>
 *     &lt;enumeration value="DAInt"/>
 *     &lt;enumeration value="DABool"/>
 *     &lt;enumeration value="DMAmpl"/>
 *     &lt;enumeration value="DMVector"/>
 *     &lt;enumeration value="DMRealFrqSpect"/>
 *     &lt;enumeration value="DMCmplxFrqSpect"/>
 *     &lt;enumeration value="DMCPB"/>
 *     &lt;enumeration value="DMReal"/>
 *     &lt;enumeration value="DMInt"/>
 *     &lt;enumeration value="DMBool"/>
 *     &lt;enumeration value="DMRealWaveform"/>
 *     &lt;enumeration value="DMCmplxWaveform"/>
 *     &lt;enumeration value="DMDataSeq"/>
 *     &lt;enumeration value="DMUserDef"/>
 *     &lt;enumeration value="SDReal"/>
 *     &lt;enumeration value="SDInt"/>
 *     &lt;enumeration value="SDBool"/>
 *     &lt;enumeration value="SDEnum"/>
 *     &lt;enumeration value="HADataEvent"/>
 *     &lt;enumeration value="PADataEvent"/>
 *     &lt;enumeration value="PARUL"/>
 *     &lt;enumeration value="PARULDist"/>
 *     &lt;enumeration value="PAFutureHlth"/>
 *     &lt;enumeration value="PAFutureHlthTrend"/>
 *     &lt;enumeration value="AGDataEvent"/>
 *     &lt;enumeration value="DAUnknown"/>
 *     &lt;enumeration value="DMUnknown"/>
 *     &lt;enumeration value="SDUnknown"/>
 *     &lt;enumeration value="HAUnknown"/>
 *     &lt;enumeration value="PAUnknown"/>
 *     &lt;enumeration value="AGUnknown"/>
 *     &lt;enumeration value="DAInvalid"/>
 *     &lt;enumeration value="DMInvalid"/>
 *     &lt;enumeration value="SDInvalid"/>
 *     &lt;enumeration value="HAInvalid"/>
 *     &lt;enumeration value="PAInvalid"/>
 *     &lt;enumeration value="AGInvalid"/>
 *     &lt;enumeration value="DEUser"/>
 *     &lt;enumeration value="SDEnumSet"/>
 *     &lt;enumeration value="SDTestReal"/>
 *     &lt;enumeration value="SDTestInt"/>
 *     &lt;enumeration value="DMBLOBData"/>
 *     &lt;enumeration value="DAString"/>
 *     &lt;enumeration value="SDEvent"/>
 *     &lt;enumeration value="DAValueWaveform"/>
 *     &lt;enumeration value="DAValueDataSeq"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OsacbmDataType")
@XmlEnum
public enum OsacbmDataType {

    @XmlEnumValue("InvalidUnsetType")
    INVALID_UNSET_TYPE("InvalidUnsetType"),
    @XmlEnumValue("DAWaveform")
    DA_WAVEFORM("DAWaveform"),
    @XmlEnumValue("DABLOBData")
    DABLOB_DATA("DABLOBData"),
    @XmlEnumValue("DAVector")
    DA_VECTOR("DAVector"),
    @XmlEnumValue("DADataSeq")
    DA_DATA_SEQ("DADataSeq"),
    @XmlEnumValue("DAReal")
    DA_REAL("DAReal"),
    @XmlEnumValue("DAInt")
    DA_INT("DAInt"),
    @XmlEnumValue("DABool")
    DA_BOOL("DABool"),
    @XmlEnumValue("DMAmpl")
    DM_AMPL("DMAmpl"),
    @XmlEnumValue("DMVector")
    DM_VECTOR("DMVector"),
    @XmlEnumValue("DMRealFrqSpect")
    DM_REAL_FRQ_SPECT("DMRealFrqSpect"),
    @XmlEnumValue("DMCmplxFrqSpect")
    DM_CMPLX_FRQ_SPECT("DMCmplxFrqSpect"),
    DMCPB("DMCPB"),
    @XmlEnumValue("DMReal")
    DM_REAL("DMReal"),
    @XmlEnumValue("DMInt")
    DM_INT("DMInt"),
    @XmlEnumValue("DMBool")
    DM_BOOL("DMBool"),
    @XmlEnumValue("DMRealWaveform")
    DM_REAL_WAVEFORM("DMRealWaveform"),
    @XmlEnumValue("DMCmplxWaveform")
    DM_CMPLX_WAVEFORM("DMCmplxWaveform"),
    @XmlEnumValue("DMDataSeq")
    DM_DATA_SEQ("DMDataSeq"),
    @XmlEnumValue("DMUserDef")
    DM_USER_DEF("DMUserDef"),
    @XmlEnumValue("SDReal")
    SD_REAL("SDReal"),
    @XmlEnumValue("SDInt")
    SD_INT("SDInt"),
    @XmlEnumValue("SDBool")
    SD_BOOL("SDBool"),
    @XmlEnumValue("SDEnum")
    SD_ENUM("SDEnum"),
    @XmlEnumValue("HADataEvent")
    HA_DATA_EVENT("HADataEvent"),
    @XmlEnumValue("PADataEvent")
    PA_DATA_EVENT("PADataEvent"),
    PARUL("PARUL"),
    @XmlEnumValue("PARULDist")
    PARUL_DIST("PARULDist"),
    @XmlEnumValue("PAFutureHlth")
    PA_FUTURE_HLTH("PAFutureHlth"),
    @XmlEnumValue("PAFutureHlthTrend")
    PA_FUTURE_HLTH_TREND("PAFutureHlthTrend"),
    @XmlEnumValue("AGDataEvent")
    AG_DATA_EVENT("AGDataEvent"),
    @XmlEnumValue("DAUnknown")
    DA_UNKNOWN("DAUnknown"),
    @XmlEnumValue("DMUnknown")
    DM_UNKNOWN("DMUnknown"),
    @XmlEnumValue("SDUnknown")
    SD_UNKNOWN("SDUnknown"),
    @XmlEnumValue("HAUnknown")
    HA_UNKNOWN("HAUnknown"),
    @XmlEnumValue("PAUnknown")
    PA_UNKNOWN("PAUnknown"),
    @XmlEnumValue("AGUnknown")
    AG_UNKNOWN("AGUnknown"),
    @XmlEnumValue("DAInvalid")
    DA_INVALID("DAInvalid"),
    @XmlEnumValue("DMInvalid")
    DM_INVALID("DMInvalid"),
    @XmlEnumValue("SDInvalid")
    SD_INVALID("SDInvalid"),
    @XmlEnumValue("HAInvalid")
    HA_INVALID("HAInvalid"),
    @XmlEnumValue("PAInvalid")
    PA_INVALID("PAInvalid"),
    @XmlEnumValue("AGInvalid")
    AG_INVALID("AGInvalid"),
    @XmlEnumValue("DEUser")
    DE_USER("DEUser"),
    @XmlEnumValue("SDEnumSet")
    SD_ENUM_SET("SDEnumSet"),
    @XmlEnumValue("SDTestReal")
    SD_TEST_REAL("SDTestReal"),
    @XmlEnumValue("SDTestInt")
    SD_TEST_INT("SDTestInt"),
    @XmlEnumValue("DMBLOBData")
    DMBLOB_DATA("DMBLOBData"),
    @XmlEnumValue("DAString")
    DA_STRING("DAString"),
    @XmlEnumValue("SDEvent")
    SD_EVENT("SDEvent"),
    @XmlEnumValue("DAValueWaveform")
    DA_VALUE_WAVEFORM("DAValueWaveform"),
    @XmlEnumValue("DAValueDataSeq")
    DA_VALUE_DATA_SEQ("DAValueDataSeq");
    private final String value;

    OsacbmDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OsacbmDataType fromValue(String v) {
        for (OsacbmDataType c: OsacbmDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
