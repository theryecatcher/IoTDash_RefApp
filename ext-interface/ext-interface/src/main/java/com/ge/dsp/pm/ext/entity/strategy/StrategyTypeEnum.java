
package com.ge.dsp.pm.ext.entity.strategy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StrategyTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StrategyTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RETRIEVAL"/>
 *     &lt;enumeration value="STORAGE"/>
 *     &lt;enumeration value="CREATE"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StrategyTypeEnum")
@XmlEnum
public enum StrategyTypeEnum {

    RETRIEVAL,
    STORAGE,
    CREATE,
    OTHER;

    public String value() {
        return name();
    }

    public static StrategyTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
