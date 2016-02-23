
package com.ge.dsp.pm.ext.entity.selectionfilter;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AND"/>
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="BETWEEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperatorEnum")
@XmlEnum
public enum OperatorEnum {

    AND,
    OR,
    EQUALS,
    BETWEEN;

    public String value() {
        return name();
    }

    public static OperatorEnum fromValue(String v) {
        return valueOf(v);
    }

}
