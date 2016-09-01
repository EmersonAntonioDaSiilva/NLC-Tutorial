package br.com.afirmanet.core.persistence.enumeration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de conditionOperatorType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="conditionOperatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="CONTAINS"/>
 *     &lt;enumeration value="MATCHES_PATTERN"/>
 *     &lt;enumeration value="LESS_THEN"/>
 *     &lt;enumeration value="GREATER_THEN"/>
 *     &lt;enumeration value="EQUAL_TO_YES"/>
 *     &lt;enumeration value="EQUAL_TO_NO"/>
 *     &lt;enumeration value="IS_BLANK"/>
 *     &lt;enumeration value="HAS_VALUE"/>
 *     &lt;enumeration value="SET_TO"/>
 *     &lt;enumeration value="SET_TO_BLANK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "conditionOperatorEnum")
@XmlEnum
public enum ConditionOperatorEnum {

    EQUALS,
    CONTAINS,
    MATCHES_PATTERN,
    LESS_THEN,
    GREATER_THEN,
    EQUAL_TO_YES,
    EQUAL_TO_NO,
    IS_BLANK,
    HAS_VALUE,
    SET_TO,
    SET_TO_BLANK;

    public String value() {
        return name();
    }

    public static ConditionOperatorEnum fromValue(String v) {
        return valueOf(v);
    }

}
