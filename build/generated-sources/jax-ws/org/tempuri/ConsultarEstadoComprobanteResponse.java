
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
 *         &lt;element name="ConsultarEstadoComprobanteResult" type="{http://tempuri.org/}ENRespuestaEstadoComprobante" minOccurs="0"/>
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
    "consultarEstadoComprobanteResult"
})
@XmlRootElement(name = "ConsultarEstadoComprobanteResponse")
public class ConsultarEstadoComprobanteResponse {

    @XmlElement(name = "ConsultarEstadoComprobanteResult")
    protected ENRespuestaEstadoComprobante consultarEstadoComprobanteResult;

    /**
     * Obtiene el valor de la propiedad consultarEstadoComprobanteResult.
     * 
     * @return
     *     possible object is
     *     {@link ENRespuestaEstadoComprobante }
     *     
     */
    public ENRespuestaEstadoComprobante getConsultarEstadoComprobanteResult() {
        return consultarEstadoComprobanteResult;
    }

    /**
     * Define el valor de la propiedad consultarEstadoComprobanteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ENRespuestaEstadoComprobante }
     *     
     */
    public void setConsultarEstadoComprobanteResult(ENRespuestaEstadoComprobante value) {
        this.consultarEstadoComprobanteResult = value;
    }

}
