
package com.mycompany.sisam.variaveis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VarDescWebServiceView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VarDescWebServiceView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="altitude_nivel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="medida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nome_banco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="origem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="periodicidade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resolucao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VarDescWebServiceView", namespace = "urn:br.inpe.dsa.sisam.view", propOrder = {
    "altitudeNivel",
    "medida",
    "nome",
    "nomeBanco",
    "origem",
    "periodicidade",
    "resolucao"
})
public class VarDescWebServiceView {

    @XmlElement(name = "altitude_nivel", required = true, nillable = true)
    protected String altitudeNivel;
    @XmlElement(required = true, nillable = true)
    protected String medida;
    @XmlElement(required = true, nillable = true)
    protected String nome;
    @XmlElement(name = "nome_banco", required = true, nillable = true)
    protected String nomeBanco;
    @XmlElement(required = true, nillable = true)
    protected String origem;
    @XmlElement(required = true, nillable = true)
    protected String periodicidade;
    @XmlElement(required = true, nillable = true)
    protected String resolucao;

    /**
     * Gets the value of the altitudeNivel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltitudeNivel() {
        return altitudeNivel;
    }

    /**
     * Sets the value of the altitudeNivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltitudeNivel(String value) {
        this.altitudeNivel = value;
    }

    /**
     * Gets the value of the medida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedida() {
        return medida;
    }

    /**
     * Sets the value of the medida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedida(String value) {
        this.medida = value;
    }

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

    /**
     * Gets the value of the origem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigem() {
        return origem;
    }

    /**
     * Sets the value of the origem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigem(String value) {
        this.origem = value;
    }

    /**
     * Gets the value of the periodicidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicidade() {
        return periodicidade;
    }

    /**
     * Sets the value of the periodicidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicidade(String value) {
        this.periodicidade = value;
    }

    /**
     * Gets the value of the resolucao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolucao() {
        return resolucao;
    }

    /**
     * Sets the value of the resolucao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolucao(String value) {
        this.resolucao = value;
    }

}
