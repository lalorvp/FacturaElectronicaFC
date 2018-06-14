
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
 *         &lt;element name="ConsultarComprobanteResumenResult" type="{http://tempuri.org/}ENRespuestaComprobanteResumen" minOccurs="0"/>
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
    "consultarComprobanteResumenResult"
})
@XmlRootElement(name = "ConsultarComprobanteResumenResponse")
public class ConsultarComprobanteResumenResponse {

    @XmlElement(name = "ConsultarComprobanteResumenResult")
    protected ENRespuestaComprobanteResumen consultarComprobanteResumenResult;

    /**
     * Obtiene el valor de la propiedad consultarComprobanteResumenResult.
     * 
     * @return
     *     possible object is
     *     {@link ENRespuestaComprobanteResumen }
     *     
     */
    public ENRespuestaComprobanteResumen getConsultarComprobanteResumenResult() {
        return consultarComprobanteResumenResult;
    }

    /**
     * Define el valor de la propiedad consultarComprobanteResumenResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ENRespuestaComprobanteResumen }
     *     
     */
    public void setConsultarComprobanteResumenResult(ENRespuestaComprobanteResumen value) {
        this.consultarComprobanteResumenResult = value;
    }

}
