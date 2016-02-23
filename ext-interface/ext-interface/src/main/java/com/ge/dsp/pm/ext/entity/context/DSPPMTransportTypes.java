
package com.ge.dsp.pm.ext.entity.context;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DSPPMTransportTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DSPPMTransportTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OSGI"/>
 *     &lt;enumeration value="PointToPoint"/>
 *     &lt;enumeration value="Systinet"/>
 *     &lt;enumeration value="POJO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DSPPMTransportTypes")
@XmlEnum
public enum DSPPMTransportTypes {

    OSGI("OSGI"),
    @XmlEnumValue("PointToPoint")
    POINT_TO_POINT("PointToPoint"),
    @XmlEnumValue("Systinet")
    SYSTINET("Systinet"),
    POJO("POJO");
    private final String value;

    DSPPMTransportTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DSPPMTransportTypes fromValue(String v) {
        for (DSPPMTransportTypes c: DSPPMTransportTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
