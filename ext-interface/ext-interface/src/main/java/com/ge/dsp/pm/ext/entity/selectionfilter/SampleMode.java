
package com.ge.dsp.pm.ext.entity.selectionfilter;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SampleMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SampleMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AVERAGE"/>
 *     &lt;enumeration value="MAXIMUM"/>
 *     &lt;enumeration value="MINIMUM"/>
 *     &lt;enumeration value="LAST"/>
 *     &lt;enumeration value="FIRST"/>
 *     &lt;enumeration value="STDEV"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SampleMode")
@XmlEnum
public enum SampleMode {

    AVERAGE,
    MAXIMUM,
    MINIMUM,
    LAST,
    FIRST,
    STDEV,
    OTHER;

    public String value() {
        return name();
    }

    public static SampleMode fromValue(String v) {
        return valueOf(v);
    }

}
