
package com.ge.dsp.pm.ext.entity.field;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FieldTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASSETGROUPINGFIELD"/>
 *     &lt;enumeration value="GENERALFIELD"/>
 *     &lt;enumeration value="TEMPORARYFIELD"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FieldTypeEnum")
@XmlEnum
public enum FieldTypeEnum {

    ASSETGROUPINGFIELD,
    GENERALFIELD,
    TEMPORARYFIELD,
    OTHER;

    public String value() {
        return name();
    }

    public static FieldTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
