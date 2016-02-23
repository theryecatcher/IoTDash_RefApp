
package org.mimosa.osacbmv3_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OsacbmTimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OsacbmTimeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OSACBM_TIME_MIMOSA"/>
 *     &lt;enumeration value="OSACBM_TIME_POSIX_NSEC_8"/>
 *     &lt;enumeration value="OSACBM_TIME_POSIX_USEC_8"/>
 *     &lt;enumeration value="OSACBM_TIME_POSIX_USEC_6"/>
 *     &lt;enumeration value="OSACBM_TIME_POSIX_MSEC_6"/>
 *     &lt;enumeration value="OSACBM_TIME_POSIX_SEC_4"/>
 *     &lt;enumeration value="OSACBM_TIME_TICK_NSEC"/>
 *     &lt;enumeration value="OSACBM_TIME_TICK_USEC"/>
 *     &lt;enumeration value="OSACBM_TIME_TICK_MSEC"/>
 *     &lt;enumeration value="OSACBM_TIME_SYSTEM_TICK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OsacbmTimeType")
@XmlEnum
public enum OsacbmTimeType {

    OSACBM_TIME_MIMOSA,
    OSACBM_TIME_POSIX_NSEC_8,
    OSACBM_TIME_POSIX_USEC_8,
    OSACBM_TIME_POSIX_USEC_6,
    OSACBM_TIME_POSIX_MSEC_6,
    OSACBM_TIME_POSIX_SEC_4,
    OSACBM_TIME_TICK_NSEC,
    OSACBM_TIME_TICK_USEC,
    OSACBM_TIME_TICK_MSEC,
    OSACBM_TIME_SYSTEM_TICK;

    public String value() {
        return name();
    }

    public static OsacbmTimeType fromValue(String v) {
        return valueOf(v);
    }

}
