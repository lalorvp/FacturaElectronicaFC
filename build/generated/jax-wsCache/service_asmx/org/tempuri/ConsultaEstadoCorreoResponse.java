
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
 *         &lt;element name="ConsultaEstadoCorreoResult" type="{http://tempuri.org/}ENRespuestaEstadoCorreo" minOccurs="0"/>
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
    "consultaEstadoCorreoResult"
})
@XmlRootElement(name = "ConsultaEstadoCorreoResponse")
public class ConsultaEstadoCorreoResponse {

    @XmlElement(name = "ConsultaEstadoCorreoResult")
    protected ENRespuestaEstadoCorreo consultaEstadoCorreoResult;

    /**
     * Obtiene el valor de la propiedad consultaEstadoCorreoResult.
     * 
     * @return
     *     possible object is
     *     {@link ENRespuestaEstadoCorreo }
     *     
     */
    public ENRespuestaEstadoCorreo getConsultaEstadoCorreoResult() {
        return consultaEstadoCorreoResult;
    }

    /**
     * Define el valor de la propiedad consultaEstadoCorreoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ENRespuestaEstadoCorreo }
     *     
     */
    public void setConsultaEstadoCorreoResult(ENRespuestaEstadoCorreo value) {
        this.consultaEstadoCorreoResult = value;
    }

}
