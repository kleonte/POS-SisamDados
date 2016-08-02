
package com.mycompany.sisam.tabulacao;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getDadosTabuladosReturn" type="{urn:br.inpe.dsa.sisam.view}VariaveisView" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getDadosTabuladosReturn"
})
@XmlRootElement(name = "getDadosTabuladosResponse")
public class GetDadosTabuladosResponse {

    @XmlElement(required = true)
    protected List<VariaveisView> getDadosTabuladosReturn;

    /**
     * Gets the value of the getDadosTabuladosReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getDadosTabuladosReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetDadosTabuladosReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariaveisView }
     * 
     * 
     */
    public List<VariaveisView> getGetDadosTabuladosReturn() {
        if (getDadosTabuladosReturn == null) {
            getDadosTabuladosReturn = new ArrayList<VariaveisView>();
        }
        return this.getDadosTabuladosReturn;
    }

}
