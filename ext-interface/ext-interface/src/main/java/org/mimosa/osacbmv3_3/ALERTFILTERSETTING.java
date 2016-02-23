
package org.mimosa.osacbmv3_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ALERT_FILTER_SETTING.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ALERT_FILTER_SETTING">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL_EVENTS"/>
 *     &lt;enumeration value="ALERT_EVENTS_ONLY"/>
 *     &lt;enumeration value="CHANGED_VALUE_EVENTS"/>
 *     &lt;enumeration value="NO_EVENTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ALERT_FILTER_SETTING")
@XmlEnum
public enum ALERTFILTERSETTING {

    ALL_EVENTS,
    ALERT_EVENTS_ONLY,
    CHANGED_VALUE_EVENTS,
    NO_EVENTS;

    public String value() {
        return name();
    }

    public static ALERTFILTERSETTING fromValue(String v) {
        return valueOf(v);
    }

}
