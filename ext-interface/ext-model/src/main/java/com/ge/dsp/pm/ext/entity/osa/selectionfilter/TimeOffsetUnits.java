//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 02:16:43 AM PST 
//


package com.ge.dsp.pm.ext.entity.osa.selectionfilter;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeOffsetUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeOffsetUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NANOSECONDS"/>
 *     &lt;enumeration value="MILLISECONDS"/>
 *     &lt;enumeration value="MICROSECONDS"/>
 *     &lt;enumeration value="SECONDS"/>
 *     &lt;enumeration value="MINUTES"/>
 *     &lt;enumeration value="HOURS"/>
 *     &lt;enumeration value="DAYS"/>
 *     &lt;enumeration value="WEEKS"/>
 *     &lt;enumeration value="YEARS"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeOffsetUnits")
@XmlEnum
public enum TimeOffsetUnits {

    NANOSECONDS,
    MILLISECONDS,
    MICROSECONDS,
    SECONDS,
    MINUTES,
    HOURS,
    DAYS,
    WEEKS,
    YEARS,
    OTHER;

    public String value() {
        return name();
    }

    public static TimeOffsetUnits fromValue(String v) {
        return valueOf(v);
    }

}
