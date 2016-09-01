package br.com.afirmanet.core.persistence.enumeration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de grammarTypeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="grammarTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VARIATIONS"/>
 *     &lt;enumeration value="JSGF"/>
 *     &lt;enumeration value="GRXML"/>
 *     &lt;enumeration value="AQL"/>
 *     &lt;enumeration value="DICT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "grammarEnum")
@XmlEnum
public enum GrammarEnum {
    VARIATIONS,
    JSGF,
    GRXML,
    AQL,
    DICT;

    public String value() {
        return name();
    }

    public static GrammarEnum fromValue(String v) {
        return valueOf(v);
    }
}
