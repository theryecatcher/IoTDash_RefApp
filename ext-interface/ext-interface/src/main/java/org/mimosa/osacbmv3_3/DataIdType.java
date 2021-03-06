
package org.mimosa.osacbmv3_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataIdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataIdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="meas_location"/>
 *     &lt;enumeration value="agent_id"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataIdType")
@XmlEnum
public enum DataIdType {

    @XmlEnumValue("meas_location")
    MEAS_LOCATION("meas_location"),
    @XmlEnumValue("agent_id")
    AGENT_ID("agent_id");
    private final String value;

    DataIdType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataIdType fromValue(String v) {
        for (DataIdType c: DataIdType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
