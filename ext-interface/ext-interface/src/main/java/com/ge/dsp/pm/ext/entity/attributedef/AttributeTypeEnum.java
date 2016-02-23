
package com.ge.dsp.pm.ext.entity.attributedef;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttributeTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="BOOLEAN"/>
 *     &lt;enumeration value="DECIMAL"/>
 *     &lt;enumeration value="FLOAT"/>
 *     &lt;enumeration value="DOUBLE"/>
 *     &lt;enumeration value="DURATION"/>
 *     &lt;enumeration value="DATETIME"/>
 *     &lt;enumeration value="TIME"/>
 *     &lt;enumeration value="DATE"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttributeTypeEnum")
@XmlEnum
public enum AttributeTypeEnum {

    STRING,
    BOOLEAN,
    DECIMAL,
    FLOAT,
    DOUBLE,
    DURATION,
    DATETIME,
    TIME,
    DATE,
    OTHER;

    public String value() {
        return name();
    }

    public static AttributeTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
