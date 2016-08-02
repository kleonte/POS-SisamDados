
package com.mycompany.sisam.tabulacao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VariaveisView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariaveisView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aeros" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="aeros_incert" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="capital" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="conc_co_max" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="conc_co_med" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="conc_co_min" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="conc_pm_max" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="conc_pm_med" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="conc_pm_min" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dg_elet" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="focoq" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="geada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="geocodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="mesoregiao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="microregia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ondas_calor_max" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ondas_calor_med" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ondas_calor_min" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prec_acum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="rad_uv" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="regiao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tempestade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tmp_ar_max" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tmp_ar_med" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tmp_ar_min" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="umid_ar_max" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="umid_ar_med" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="umid_ar_min" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="vento_dir" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vento_vel" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariaveisView", namespace = "urn:br.inpe.dsa.sisam.view", propOrder = {
    "aeros",
    "aerosIncert",
    "capital",
    "concCoMax",
    "concCoMed",
    "concCoMin",
    "concPmMax",
    "concPmMed",
    "concPmMin",
    "data",
    "dgElet",
    "estado",
    "focoq",
    "geada",
    "geocodigo",
    "gid",
    "latitude",
    "longitude",
    "mesoregiao",
    "microregia",
    "nome",
    "ondasCalorMax",
    "ondasCalorMed",
    "ondasCalorMin",
    "precAcum",
    "radUv",
    "regiao",
    "tempestade",
    "tmpArMax",
    "tmpArMed",
    "tmpArMin",
    "uf",
    "umidArMax",
    "umidArMed",
    "umidArMin",
    "ventoDir",
    "ventoVel"
})
public class VariaveisView {

    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double aeros;
    @XmlElement(name = "aeros_incert", required = true, type = Double.class, nillable = true)
    protected Double aerosIncert;
    @XmlElement(required = true, nillable = true)
    protected String capital;
    @XmlElement(name = "conc_co_max", required = true, type = Double.class, nillable = true)
    protected Double concCoMax;
    @XmlElement(name = "conc_co_med", required = true, type = Double.class, nillable = true)
    protected Double concCoMed;
    @XmlElement(name = "conc_co_min", required = true, type = Double.class, nillable = true)
    protected Double concCoMin;
    @XmlElement(name = "conc_pm_max", required = true, type = Double.class, nillable = true)
    protected Double concPmMax;
    @XmlElement(name = "conc_pm_med", required = true, type = Double.class, nillable = true)
    protected Double concPmMed;
    @XmlElement(name = "conc_pm_min", required = true, type = Double.class, nillable = true)
    protected Double concPmMin;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    @XmlElement(name = "dg_elet", required = true, type = Double.class, nillable = true)
    protected Double dgElet;
    @XmlElement(required = true, nillable = true)
    protected String estado;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double focoq;
    @XmlElement(required = true, nillable = true)
    protected String geada;
    @XmlElement(required = true, nillable = true)
    protected String geocodigo;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long gid;
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
    @XmlElement(name = "ondas_calor_max", required = true, nillable = true)
    protected String ondasCalorMax;
    @XmlElement(name = "ondas_calor_med", required = true, nillable = true)
    protected String ondasCalorMed;
    @XmlElement(name = "ondas_calor_min", required = true, nillable = true)
    protected String ondasCalorMin;
    @XmlElement(name = "prec_acum", required = true, type = Double.class, nillable = true)
    protected Double precAcum;
    @XmlElement(name = "rad_uv", required = true, type = Double.class, nillable = true)
    protected Double radUv;
    @XmlElement(required = true, nillable = true)
    protected String regiao;
    @XmlElement(required = true, nillable = true)
    protected String tempestade;
    @XmlElement(name = "tmp_ar_max", required = true, type = Double.class, nillable = true)
    protected Double tmpArMax;
    @XmlElement(name = "tmp_ar_med", required = true, type = Double.class, nillable = true)
    protected Double tmpArMed;
    @XmlElement(name = "tmp_ar_min", required = true, type = Double.class, nillable = true)
    protected Double tmpArMin;
    @XmlElement(required = true, nillable = true)
    protected String uf;
    @XmlElement(name = "umid_ar_max", required = true, type = Double.class, nillable = true)
    protected Double umidArMax;
    @XmlElement(name = "umid_ar_med", required = true, type = Double.class, nillable = true)
    protected Double umidArMed;
    @XmlElement(name = "umid_ar_min", required = true, type = Double.class, nillable = true)
    protected Double umidArMin;
    @XmlElement(name = "vento_dir", required = true, nillable = true)
    protected String ventoDir;
    @XmlElement(name = "vento_vel", required = true, type = Double.class, nillable = true)
    protected Double ventoVel;

    /**
     * Gets the value of the aeros property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAeros() {
        return aeros;
    }

    /**
     * Sets the value of the aeros property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAeros(Double value) {
        this.aeros = value;
    }

    /**
     * Gets the value of the aerosIncert property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAerosIncert() {
        return aerosIncert;
    }

    /**
     * Sets the value of the aerosIncert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAerosIncert(Double value) {
        this.aerosIncert = value;
    }

    /**
     * Gets the value of the capital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapital() {
        return capital;
    }

    /**
     * Sets the value of the capital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapital(String value) {
        this.capital = value;
    }

    /**
     * Gets the value of the concCoMax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConcCoMax() {
        return concCoMax;
    }

    /**
     * Sets the value of the concCoMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConcCoMax(Double value) {
        this.concCoMax = value;
    }

    /**
     * Gets the value of the concCoMed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConcCoMed() {
        return concCoMed;
    }

    /**
     * Sets the value of the concCoMed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConcCoMed(Double value) {
        this.concCoMed = value;
    }

    /**
     * Gets the value of the concCoMin property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConcCoMin() {
        return concCoMin;
    }

    /**
     * Sets the value of the concCoMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConcCoMin(Double value) {
        this.concCoMin = value;
    }

    /**
     * Gets the value of the concPmMax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConcPmMax() {
        return concPmMax;
    }

    /**
     * Sets the value of the concPmMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConcPmMax(Double value) {
        this.concPmMax = value;
    }

    /**
     * Gets the value of the concPmMed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConcPmMed() {
        return concPmMed;
    }

    /**
     * Sets the value of the concPmMed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConcPmMed(Double value) {
        this.concPmMed = value;
    }

    /**
     * Gets the value of the concPmMin property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConcPmMin() {
        return concPmMin;
    }

    /**
     * Sets the value of the concPmMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConcPmMin(Double value) {
        this.concPmMin = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Gets the value of the dgElet property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDgElet() {
        return dgElet;
    }

    /**
     * Sets the value of the dgElet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDgElet(Double value) {
        this.dgElet = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the focoq property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFocoq() {
        return focoq;
    }

    /**
     * Sets the value of the focoq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFocoq(Double value) {
        this.focoq = value;
    }

    /**
     * Gets the value of the geada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeada() {
        return geada;
    }

    /**
     * Sets the value of the geada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeada(String value) {
        this.geada = value;
    }

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
     * Gets the value of the ondasCalorMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOndasCalorMax() {
        return ondasCalorMax;
    }

    /**
     * Sets the value of the ondasCalorMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOndasCalorMax(String value) {
        this.ondasCalorMax = value;
    }

    /**
     * Gets the value of the ondasCalorMed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOndasCalorMed() {
        return ondasCalorMed;
    }

    /**
     * Sets the value of the ondasCalorMed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOndasCalorMed(String value) {
        this.ondasCalorMed = value;
    }

    /**
     * Gets the value of the ondasCalorMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOndasCalorMin() {
        return ondasCalorMin;
    }

    /**
     * Sets the value of the ondasCalorMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOndasCalorMin(String value) {
        this.ondasCalorMin = value;
    }

    /**
     * Gets the value of the precAcum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrecAcum() {
        return precAcum;
    }

    /**
     * Sets the value of the precAcum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrecAcum(Double value) {
        this.precAcum = value;
    }

    /**
     * Gets the value of the radUv property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRadUv() {
        return radUv;
    }

    /**
     * Sets the value of the radUv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRadUv(Double value) {
        this.radUv = value;
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
     * Gets the value of the tempestade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempestade() {
        return tempestade;
    }

    /**
     * Sets the value of the tempestade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempestade(String value) {
        this.tempestade = value;
    }

    /**
     * Gets the value of the tmpArMax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTmpArMax() {
        return tmpArMax;
    }

    /**
     * Sets the value of the tmpArMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTmpArMax(Double value) {
        this.tmpArMax = value;
    }

    /**
     * Gets the value of the tmpArMed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTmpArMed() {
        return tmpArMed;
    }

    /**
     * Sets the value of the tmpArMed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTmpArMed(Double value) {
        this.tmpArMed = value;
    }

    /**
     * Gets the value of the tmpArMin property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTmpArMin() {
        return tmpArMin;
    }

    /**
     * Sets the value of the tmpArMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTmpArMin(Double value) {
        this.tmpArMin = value;
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

    /**
     * Gets the value of the umidArMax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUmidArMax() {
        return umidArMax;
    }

    /**
     * Sets the value of the umidArMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUmidArMax(Double value) {
        this.umidArMax = value;
    }

    /**
     * Gets the value of the umidArMed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUmidArMed() {
        return umidArMed;
    }

    /**
     * Sets the value of the umidArMed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUmidArMed(Double value) {
        this.umidArMed = value;
    }

    /**
     * Gets the value of the umidArMin property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUmidArMin() {
        return umidArMin;
    }

    /**
     * Sets the value of the umidArMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUmidArMin(Double value) {
        this.umidArMin = value;
    }

    /**
     * Gets the value of the ventoDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVentoDir() {
        return ventoDir;
    }

    /**
     * Sets the value of the ventoDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVentoDir(String value) {
        this.ventoDir = value;
    }

    /**
     * Gets the value of the ventoVel property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVentoVel() {
        return ventoVel;
    }

    /**
     * Sets the value of the ventoVel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVentoVel(Double value) {
        this.ventoVel = value;
    }

}
