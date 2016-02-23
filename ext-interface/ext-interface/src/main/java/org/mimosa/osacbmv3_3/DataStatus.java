
package org.mimosa.osacbmv3_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="FAILED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="NOT_USED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataStatus")
@XmlEnum
public enum DataStatus {

    OK,
    FAILED,
    UNKNOWN,
    NOT_USED;

    public String value() {
        return name();
    }

    public static DataStatus fromValue(String v) {
        return valueOf(v);
    }

}
