//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.08.25 at 11:03:15 AM EDT
//


package com.silverpop.api.client.result.elements;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrivateShared.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrivateShared">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Private"/>
 *     &lt;enumeration value="Shared"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "PrivateShared")
@XmlEnum
public enum PrivateShared {

    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("Shared")
    SHARED("Shared");
    private final String value;

    PrivateShared(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrivateShared fromValue(String v) {
        for (PrivateShared c: PrivateShared.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
