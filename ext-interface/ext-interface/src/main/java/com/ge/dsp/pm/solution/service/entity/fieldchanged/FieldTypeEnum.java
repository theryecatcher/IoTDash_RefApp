//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.07 at 07:40:51 PM IST 
//


package com.ge.dsp.pm.solution.service.entity.fieldchanged;

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
 *     &lt;enumeration value="ASSETMODEL"/>
 *     &lt;enumeration value="PARAMETERMODEL"/>
 *     &lt;enumeration value="PARAMETER"/>
 *     &lt;enumeration value="ASSETDATA"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FieldTypeEnum")
@XmlEnum
public enum FieldTypeEnum {

    ASSETMODEL,
    PARAMETERMODEL,
    PARAMETER,
    ASSETDATA,
    OTHER;

    public String value() {
        return name();
    }

    public static FieldTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
