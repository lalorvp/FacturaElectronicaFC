
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
 *         &lt;element name="ConsultarComprobanteAdjuntoResult" type="{http://tempuri.org/}ENRespuestaComprobanteAdjunto" minOccurs="0"/>
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
    "consultarComprobanteAdjuntoResult"
})
@XmlRootElement(name = "ConsultarComprobanteAdjuntoResponse")
public class ConsultarComprobanteAdjuntoResponse {

    @XmlElement(name = "ConsultarComprobanteAdjuntoResult")
    protected ENRespuestaComprobanteAdjunto consultarComprobanteAdjuntoResult;

    /**
     * Obtiene el valor de la propiedad consultarComprobanteAdjuntoResult.
     * 
     * @return
     *     possible object is
     *     {@link ENRespuestaComprobanteAdjunto }
     *     
     */
    public ENRespuestaComprobanteAdjunto getConsultarComprobanteAdjuntoResult() {
        return consultarComprobanteAdjuntoResult;
    }

    /**
     * Define el valor de la propiedad consultarComprobanteAdjuntoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ENRespuestaComprobanteAdjunto }
     *     
     */
    public void setConsultarComprobanteAdjuntoResult(ENRespuestaComprobanteAdjunto value) {
        this.consultarComprobanteAdjuntoResult = value;
    }

}
