
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsultarComprobanteIndividualResult" type="{http://tempuri.org/}ENRespuesta" minOccurs="0"/>
 *         &lt;element name="Cadena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "consultarComprobanteIndividualResult",
    "cadena"
})
@XmlRootElement(name = "ConsultarComprobanteIndividualResponse")
public class ConsultarComprobanteIndividualResponse {

    @XmlElement(name = "ConsultarComprobanteIndividualResult")
    protected ENRespuesta consultarComprobanteIndividualResult;
    @XmlElement(name = "Cadena")
    protected String cadena;

    /**
     * Obtiene el valor de la propiedad consultarComprobanteIndividualResult.
     * 
     * @return
     *     possible object is
     *     {@link ENRespuesta }
     *     
     */
    public ENRespuesta getConsultarComprobanteIndividualResult() {
        return consultarComprobanteIndividualResult;
    }

    /**
     * Define el valor de la propiedad consultarComprobanteIndividualResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ENRespuesta }
     *     
     */
    public void setConsultarComprobanteIndividualResult(ENRespuesta value) {
        this.consultarComprobanteIndividualResult = value;
    }

    /**
     * Obtiene el valor de la propiedad cadena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * Define el valor de la propiedad cadena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadena(String value) {
        this.cadena = value;
    }

}
