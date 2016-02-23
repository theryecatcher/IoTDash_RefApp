
package com.ge.dsp.pm.ext.entity.selectionfilter;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnchorTimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnchorTimeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSOLUTE"/>
 *     &lt;enumeration value="DISPATCHER"/>
 *     &lt;enumeration value="NOW"/>
 *     &lt;enumeration value="FIELD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AnchorTimeType")
@XmlEnum
public enum AnchorTimeType {

    ABSOLUTE,
    DISPATCHER,
    NOW,
    FIELD;

    public String value() {
        return name();
    }

    public static AnchorTimeType fromValue(String v) {
        return valueOf(v);
    }

}
