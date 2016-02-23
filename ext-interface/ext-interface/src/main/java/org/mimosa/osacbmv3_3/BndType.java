
package org.mimosa.osacbmv3_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BndType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BndType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="octave"/>
 *     &lt;enumeration value="percent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BndType")
@XmlEnum
public enum BndType {

    @XmlEnumValue("octave")
    OCTAVE("octave"),
    @XmlEnumValue("percent")
    PERCENT("percent");
    private final String value;

    BndType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BndType fromValue(String v) {
        for (BndType c: BndType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
