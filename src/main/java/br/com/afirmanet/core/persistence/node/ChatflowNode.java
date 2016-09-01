package br.com.afirmanet.core.persistence.node;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import br.com.afirmanet.core.persistence.type.ConceptNodeType;
import br.com.afirmanet.core.persistence.type.DefaultNodeType;
import br.com.afirmanet.core.persistence.type.FolderNodeType;
import br.com.afirmanet.core.persistence.type.FunctionNodeType;
import br.com.afirmanet.core.persistence.type.GetUserInputNodeType;
import br.com.afirmanet.core.persistence.type.GotoNodeType;
import br.com.afirmanet.core.persistence.type.IfNodeType;
import br.com.afirmanet.core.persistence.type.InputNodeType;
import br.com.afirmanet.core.persistence.type.OutputNodeType;
import br.com.afirmanet.core.persistence.type.RandomNodeType;
import br.com.afirmanet.core.persistence.type.SearchNodeType;


/**
 * <p>Classe Java de chatflowNode complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="chatflowNode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="gid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isOffline" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isShowRelatedNodes" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chatflowNode")
@XmlSeeAlso({
    OutputNodeType.class,
    DefaultNodeType.class,
    IfNodeType.class,
    InputNodeType.class,
    GotoNodeType.class,
    ConceptNodeType.class,
    GetUserInputNodeType.class,
    SearchNodeType.class,
    FolderNodeType.class,
    FunctionNodeType.class,
    RandomNodeType.class
})
public abstract class ChatflowNode {

    @XmlAttribute(name = "gid")
    protected String gid;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "comment")
    protected String comment;
    @XmlAttribute(name = "date")
    protected String date;
    @XmlAttribute(name = "isOffline")
    protected Boolean isOffline;
    @XmlAttribute(name = "isShowRelatedNodes")
    protected Boolean isShowRelatedNodes;

    /**
     * Obtém o valor da propriedade gid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGid() {
        return gid;
    }

    /**
     * Define o valor da propriedade gid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGid(String value) {
        this.gid = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade comment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Define o valor da propriedade comment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Obtém o valor da propriedade date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Define o valor da propriedade date.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Obtém o valor da propriedade isOffline.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOffline() {
        return isOffline;
    }

    /**
     * Define o valor da propriedade isOffline.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOffline(Boolean value) {
        this.isOffline = value;
    }

    /**
     * Obtém o valor da propriedade isShowRelatedNodes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShowRelatedNodes() {
        return isShowRelatedNodes;
    }

    /**
     * Define o valor da propriedade isShowRelatedNodes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShowRelatedNodes(Boolean value) {
        this.isShowRelatedNodes = value;
    }

}
