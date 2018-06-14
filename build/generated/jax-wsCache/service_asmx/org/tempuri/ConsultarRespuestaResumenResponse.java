
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
 *         &lt;element name="ConsultarRespuestaResumenResult" type="{http://tempuri.org/}ENRConsultarRespuestaResumen" minOccurs="0"/>
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
    "consultarRespuestaResumenResult"
})
@XmlRootElement(name = "ConsultarRespuestaResumenResponse")
public class ConsultarRespuestaResumenResponse {

    @XmlElement(name = "ConsultarRespuestaResumenResult")
    protected ENRConsultarRespuestaResumen consultarRespuestaResumenResult;

    /**
     * Obtiene el valor de la propiedad consultarRespuestaResumenResult.
     * 
     * @return
     *     possible object is
     *     {@link ENRConsultarRespuestaResumen }
     *     
     */
    public ENRConsultarRespuestaResumen getConsultarRespuestaResumenResult() {
        return consultarRespuestaResumenResult;
    }

    /**
     * Define el valor de la propiedad consultarRespuestaResumenResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ENRConsultarRespuestaResumen }
     *     
     */
    public void setConsultarRespuestaResumenResult(ENRConsultarRespuestaResumen value) {
        this.consultarRespuestaResumenResult = value;
    }

}
