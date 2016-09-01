package br.com.afirmanet.core.persistence.enumeration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de promptTypeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="promptTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VARIATIONS"/>
 *     &lt;enumeration value="NLG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "promptEnum")
@XmlEnum
public enum PromptEnum {

    VARIATIONS,
    NLG;

    public String value() {
        return name();
    }

    public static PromptEnum fromValue(String v) {
        return valueOf(v);
    }

}
