package br.com.afirmanet.core.persistence.enumeration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de selectionTypeType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="selectionTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SEQUENTIAL"/>
 *     &lt;enumeration value="RANDOM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "selectionEnum")
@XmlEnum
public enum SelectionEnum {

    SEQUENTIAL,
    RANDOM;

    public String value() {
        return name();
    }

    public static SelectionEnum fromValue(String v) {
        return valueOf(v);
    }

}
