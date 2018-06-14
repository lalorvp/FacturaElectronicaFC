
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
 *         &lt;element name="ConfirmaEstadoCorreoResult" type="{http://tempuri.org/}ENRespuestaConfirmaEstadoCorreo" minOccurs="0"/>
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
    "confirmaEstadoCorreoResult"
})
@XmlRootElement(name = "ConfirmaEstadoCorreoResponse")
public class ConfirmaEstadoCorreoResponse {

    @XmlElement(name = "ConfirmaEstadoCorreoResult")
    protected ENRespuestaConfirmaEstadoCorreo confirmaEstadoCorreoResult;

    /**
     * Obtiene el valor de la propiedad confirmaEstadoCorreoResult.
     * 
     * @return
     *     possible object is
     *     {@link ENRespuestaConfirmaEstadoCorreo }
     *     
     */
    public ENRespuestaConfirmaEstadoCorreo getConfirmaEstadoCorreoResult() {
        return confirmaEstadoCorreoResult;
    }

    /**
     * Define el valor de la propiedad confirmaEstadoCorreoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ENRespuestaConfirmaEstadoCorreo }
     *     
     */
    public void setConfirmaEstadoCorreoResult(ENRespuestaConfirmaEstadoCorreo value) {
        this.confirmaEstadoCorreoResult = value;
    }

}
