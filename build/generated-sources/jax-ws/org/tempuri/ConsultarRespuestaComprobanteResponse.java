
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
 *         &lt;element name="ConsultarRespuestaComprobanteResult" type="{http://tempuri.org/}ENRConsultarRespuestaComprobante" minOccurs="0"/>
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
    "consultarRespuestaComprobanteResult"
})
@XmlRootElement(name = "ConsultarRespuestaComprobanteResponse")
public class ConsultarRespuestaComprobanteResponse {

    @XmlElement(name = "ConsultarRespuestaComprobanteResult")
    protected ENRConsultarRespuestaComprobante consultarRespuestaComprobanteResult;

    /**
     * Obtiene el valor de la propiedad consultarRespuestaComprobanteResult.
     * 
     * @return
     *     possible object is
     *     {@link ENRConsultarRespuestaComprobante }
     *     
     */
    public ENRConsultarRespuestaComprobante getConsultarRespuestaComprobanteResult() {
        return consultarRespuestaComprobanteResult;
    }

    /**
     * Define el valor de la propiedad consultarRespuestaComprobanteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ENRConsultarRespuestaComprobante }
     *     
     */
    public void setConsultarRespuestaComprobanteResult(ENRConsultarRespuestaComprobante value) {
        this.consultarRespuestaComprobanteResult = value;
    }

}
