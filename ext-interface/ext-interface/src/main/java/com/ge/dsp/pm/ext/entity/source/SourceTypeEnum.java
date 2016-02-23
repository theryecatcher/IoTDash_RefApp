
package com.ge.dsp.pm.ext.entity.source;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SourceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CSV"/>
 *     &lt;enumeration value="RELATIONAL"/>
 *     &lt;enumeration value="TIMESERIES"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SourceTypeEnum")
@XmlEnum
public enum SourceTypeEnum {

    CSV,
    RELATIONAL,
    TIMESERIES,
    OTHER;

    public String value() {
        return name();
    }

    public static SourceTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
