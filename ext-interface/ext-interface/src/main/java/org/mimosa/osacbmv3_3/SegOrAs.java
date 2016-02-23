
package org.mimosa.osacbmv3_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegOrAs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SegOrAs">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SEGMENT"/>
 *     &lt;enumeration value="ASSET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SegOrAs")
@XmlEnum
public enum SegOrAs {

    SEGMENT,
    ASSET;

    public String value() {
        return name();
    }

    public static SegOrAs fromValue(String v) {
        return valueOf(v);
    }

}
