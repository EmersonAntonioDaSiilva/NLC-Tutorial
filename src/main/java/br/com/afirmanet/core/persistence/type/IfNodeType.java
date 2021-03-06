package br.com.afirmanet.core.persistence.type;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.deploy.shared.ActionType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

import br.com.afirmanet.core.persistence.enumeration.MatchEnum;
import br.com.afirmanet.core.persistence.node.ChatflowNode;


/**
 * <p>Classe Java de ifNodeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ifNodeType">
 *   &lt;complexContent>
 *     &lt;extension base="{}chatflowNode">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;group ref="{}commonChatflowNodePropertiesChilds"/>
 *           &lt;element name="cond" type="{}condType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;group ref="{}commonChatflowNodeChilds"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="matchType" type="{}matchTypeType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ifNodeType", propOrder = {
    "actionOrScriptOrCond",
    "inputOrOutputOrDefault"
})
public class IfNodeType
    extends ChatflowNode
{

    @XmlElements({
        @XmlElement(name = "action", type = ActionType.class),
        @XmlElement(name = "script", type = ScriptType.class),
        @XmlElement(name = "cond", type = CondType.class)
    })
    protected List<Object> actionOrScriptOrCond;
    @XmlElements({
        @XmlElement(name = "input", type = InputNodeType.class),
        @XmlElement(name = "output", type = OutputNodeType.class),
        @XmlElement(name = "default", type = DefaultNodeType.class),
        @XmlElement(name = "function", type = FunctionNodeType.class),
        @XmlElement(name = "getUserInput", type = GetUserInputNodeType.class),
        @XmlElement(name = "goto", type = GotoNodeType.class),
        @XmlElement(name = "if", type = IfNodeType.class),
        @XmlElement(name = "random", type = RandomNodeType.class),
        @XmlElement(name = "search", type = SearchNodeType.class),
        @XmlElement(name = "folder", type = FolderNodeType.class)
    })
    protected List<ChatflowNode> inputOrOutputOrDefault;
    @XmlAttribute(name = "matchType")
    protected MatchEnum matchType;

    /**
     * Gets the value of the actionOrScriptOrCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionOrScriptOrCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionOrScriptOrCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionType }
     * {@link ScriptType }
     * {@link CondType }
     * 
     * 
     */
    public List<Object> getActionOrScriptOrCond() {
        if (actionOrScriptOrCond == null) {
            actionOrScriptOrCond = new ArrayList<Object>();
        }
        return this.actionOrScriptOrCond;
    }

    /**
     * Gets the value of the inputOrOutputOrDefault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputOrOutputOrDefault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputOrOutputOrDefault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InputNodeType }
     * {@link OutputNodeType }
     * {@link DefaultNodeType }
     * {@link FunctionNodeType }
     * {@link GetUserInputNodeType }
     * {@link GotoNodeType }
     * {@link IfNodeType }
     * {@link RandomNodeType }
     * {@link SearchNodeType }
     * {@link FolderNodeType }
     * 
     * 
     */
    public List<ChatflowNode> getInputOrOutputOrDefault() {
        if (inputOrOutputOrDefault == null) {
            inputOrOutputOrDefault = new ArrayList<ChatflowNode>();
        }
        return this.inputOrOutputOrDefault;
    }

    /**
     * Obt�m o valor da propriedade matchType.
     * 
     * @return
     *     possible object is
     *     {@link MatchEnum }
     *     
     */
    public MatchEnum getMatchType() {
        return matchType;
    }

    /**
     * Define o valor da propriedade matchType.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchEnum }
     *     
     */
    public void setMatchType(MatchEnum value) {
        this.matchType = value;
    }

}
