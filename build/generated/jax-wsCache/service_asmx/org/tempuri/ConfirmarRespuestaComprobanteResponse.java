
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
 *         &lt;element name="ConfirmarRespuestaComprobanteResult" type="{http://tempuri.org/}ENRConfirmarRespuestaComprobante" minOccurs="0"/>
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
    "confirmarRespuestaComprobanteResult"
})
@XmlRootElement(name = "ConfirmarRespuestaComprobanteResponse")
public class ConfirmarRespuestaComprobanteResponse {

    @XmlElement(name = "ConfirmarRespuestaComprobanteResult")
    protected ENRConfirmarRespuestaComprobante confirmarRespuestaComprobanteResult;

    /**
     * Obtiene el valor de la propiedad confirmarRespuestaComprobanteResult.
     * 
     * @return
     *     possible object is
     *     {@link ENRConfirmarRespuestaComprobante }
     *     
     */
    public ENRConfirmarRespuestaComprobante getConfirmarRespuestaComprobanteResult() {
        return confirmarRespuestaComprobanteResult;
    }

    /**
     * Define el valor de la propiedad confirmarRespuestaComprobanteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ENRConfirmarRespuestaComprobante }
     *     
     */
    public void setConfirmarRespuestaComprobanteResult(ENRConfirmarRespuestaComprobante value) {
        this.confirmarRespuestaComprobanteResult = value;
    }

}
