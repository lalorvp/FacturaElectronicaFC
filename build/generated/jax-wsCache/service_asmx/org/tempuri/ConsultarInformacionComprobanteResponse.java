
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
 *         &lt;element name="ConsultarInformacionComprobanteResult" type="{http://tempuri.org/}ENRespuestaInformacionComprobante" minOccurs="0"/>
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
    "consultarInformacionComprobanteResult"
})
@XmlRootElement(name = "ConsultarInformacionComprobanteResponse")
public class ConsultarInformacionComprobanteResponse {

    @XmlElement(name = "ConsultarInformacionComprobanteResult")
    protected ENRespuestaInformacionComprobante consultarInformacionComprobanteResult;

    /**
     * Obtiene el valor de la propiedad consultarInformacionComprobanteResult.
     * 
     * @return
     *     possible object is
     *     {@link ENRespuestaInformacionComprobante }
     *     
     */
    public ENRespuestaInformacionComprobante getConsultarInformacionComprobanteResult() {
        return consultarInformacionComprobanteResult;
    }

    /**
     * Define el valor de la propiedad consultarInformacionComprobanteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ENRespuestaInformacionComprobante }
     *     
     */
    public void setConsultarInformacionComprobanteResult(ENRespuestaInformacionComprobante value) {
        this.consultarInformacionComprobanteResult = value;
    }

}
