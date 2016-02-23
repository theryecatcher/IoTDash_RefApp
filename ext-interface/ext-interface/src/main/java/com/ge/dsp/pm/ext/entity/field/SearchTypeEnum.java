
package com.ge.dsp.pm.ext.entity.field;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FIELDINFO"/>
 *     &lt;enumeration value="INNERFIELDS"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchTypeEnum")
@XmlEnum
public enum SearchTypeEnum {

    FIELDINFO,
    INNERFIELDS,
    OTHER;

    public String value() {
        return name();
    }

    public static SearchTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
