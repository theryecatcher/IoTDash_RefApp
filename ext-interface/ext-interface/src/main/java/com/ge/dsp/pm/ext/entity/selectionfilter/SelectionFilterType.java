
package com.ge.dsp.pm.ext.entity.selectionfilter;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectionFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SelectionFilterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TimeSelectionFilter"/>
 *     &lt;enumeration value="RowSelectionFilter"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SelectionFilterType")
@XmlEnum
public enum SelectionFilterType {

    @XmlEnumValue("TimeSelectionFilter")
    TIME_SELECTION_FILTER("TimeSelectionFilter"),
    @XmlEnumValue("RowSelectionFilter")
    ROW_SELECTION_FILTER("RowSelectionFilter");
    private final String value;

    SelectionFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SelectionFilterType fromValue(String v) {
        for (SelectionFilterType c: SelectionFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
