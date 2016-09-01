package br.com.afirmanet.core.persistence.type;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;

import br.com.afirmanet.core.persistence.enumeration.PromptEnum;
import br.com.afirmanet.core.persistence.enumeration.SelectionEnum;


/**
 * <p>Classe Java de promptType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="promptType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="selectionType" type="{}selectionTypeType" />
 *       &lt;attribute name="type" type="{}promptTypeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promptType", propOrder = {
    "content"
})
public class PromptType {

    @XmlElementRef(name = "item", type = JAXBElement.class, required = false)
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "selectionType")
    protected SelectionEnum selectionType;
    @XmlAttribute(name = "type")
    protected PromptEnum type;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Obtém o valor da propriedade selectionType.
     * 
     * @return
     *     possible object is
     *     {@link SelectionTypeType }
     *     
     */
    public SelectionEnum getSelectionType() {
        return selectionType;
    }

    /**
     * Define o valor da propriedade selectionType.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionTypeType }
     *     
     */
    public void setSelectionType(SelectionEnum value) {
        this.selectionType = value;
    }

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link PromptEnum }
     *     
     */
    public PromptEnum getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link PromptEnum }
     *     
     */
    public void setType(PromptEnum value) {
        this.type = value;
    }

}
