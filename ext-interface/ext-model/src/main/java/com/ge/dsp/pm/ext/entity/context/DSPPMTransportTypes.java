//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 02:16:43 AM PST 
//


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
