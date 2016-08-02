
package com.mycompany.sisam.cidades;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pontos_municipais complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pontos_municipais">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geocodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="id_previsao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="mesoregiao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="microregia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regiao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sede" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pontos_municipais", namespace = "urn:br.inpe.dsa.sisam.modelo", propOrder = {
    "geocodigo",
    "gid",
    "idPrevisao",
    "idUf",
    "latitude",
    "longitude",
    "mesoregiao",
    "microregia",
    "nome",
    "regiao",
    "sede",
    "uf"
})
public class PontosMunicipais {

    @XmlElement(required = true, nillable = true)
    protected String geocodigo;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long gid;
    @XmlElement(name = "id_previsao", required = true, type = Integer.class, nillable = true)
    protected Integer idPrevisao;
    @XmlElement(name = "id_uf", required = true, nillable = true)
    protected String idUf;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double latitude;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double longitude;
    @XmlElement(required = true, nillable = true)
    protected String mesoregiao;
    @XmlElement(required = true, nillable = true)
    protected String microregia;
    @XmlElement(required = true, nillable = true)
    protected String nome;
    @XmlElement(required = true, nillable = true)
    protected String regiao;
    @XmlElement(required = true, nillable = true)
    protected String sede;
    @XmlElement(required = true, nillable = true)
    protected String uf;

    /**
     * Gets the value of the geocodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeocodigo() {
        return geocodigo;
    }

    /**
     * Sets the value of the geocodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeocodigo(String value) {
        this.geocodigo = value;
    }

    /**
     * Gets the value of the gid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGid() {
        return gid;
    }

    /**
     * Sets the value of the gid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGid(Long value) {
        this.gid = value;
    }

    /**
     * Gets the value of the idPrevisao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdPrevisao() {
        return idPrevisao;
    }

    /**
     * Sets the value of the idPrevisao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdPrevisao(Integer value) {
        this.idPrevisao = value;
    }

    /**
     * Gets the value of the idUf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUf() {
        return idUf;
    }

    /**
     * Sets the value of the idUf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUf(String value) {
        this.idUf = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the mesoregiao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesoregiao() {
        return mesoregiao;
    }

    /**
     * Sets the value of the mesoregiao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesoregiao(String value) {
        this.mesoregiao = value;
    }

    /**
     * Gets the value of the microregia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMicroregia() {
        return microregia;
    }

    /**
     * Sets the value of the microregia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMicroregia(String value) {
        this.microregia = value;
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
     * Gets the value of the regiao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegiao() {
        return regiao;
    }

    /**
     * Sets the value of the regiao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegiao(String value) {
        this.regiao = value;
    }

    /**
     * Gets the value of the sede property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSede() {
        return sede;
    }

    /**
     * Sets the value of the sede property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSede(String value) {
        this.sede = value;
    }

    /**
     * Gets the value of the uf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUf() {
        return uf;
    }

    /**
     * Sets the value of the uf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUf(String value) {
        this.uf = value;
    }

}
