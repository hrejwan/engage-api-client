//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.25 at 11:03:15 AM EDT 
//


package com.silverpop.api.client.command.elements;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpressionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExpressionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TE"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="DE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExpressionType")
@XmlEnum
public enum ExpressionType {

    TE,
    NE,
    DE;

    public String value() {
        return name();
    }

    public static ExpressionType fromValue(String v) {
        return valueOf(v);
    }

}
