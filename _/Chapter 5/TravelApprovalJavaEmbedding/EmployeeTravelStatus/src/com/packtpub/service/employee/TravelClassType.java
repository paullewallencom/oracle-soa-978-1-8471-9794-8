
package com.packtpub.service.employee;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelClassType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TravelClassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Economy"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="First"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TravelClassType")
@XmlEnum
public enum TravelClassType {

    @XmlEnumValue("Economy")
    ECONOMY("Economy"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("First")
    FIRST("First");
    private final String value;

    TravelClassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelClassType fromValue(String v) {
        for (TravelClassType c: TravelClassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
