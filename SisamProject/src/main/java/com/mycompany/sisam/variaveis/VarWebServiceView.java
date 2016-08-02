
package com.mycompany.sisam.variaveis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VarWebServiceView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VarWebServiceView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nome_banco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VarWebServiceView", namespace = "urn:br.inpe.dsa.sisam.view", propOrder = {
    "nome",
    "nomeBanco"
})
public class VarWebServiceView {

    @XmlElement(required = true, nillable = true)
    protected String nome;
    @XmlElement(name = "nome_banco", required = true, nillable = true)
    protected String nomeBanco;

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the nomeBanco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeBanco() {
        return nomeBanco;
    }

    /**
     * Sets the value of the nomeBanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeBanco(String value) {
        this.nomeBanco = value;
    }

}
