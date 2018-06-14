
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
 *         &lt;element name="ConfirmarRespuestaResumenResult" type="{http://tempuri.org/}ENRConfirmarRespuestaResumen" minOccurs="0"/>
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
    "confirmarRespuestaResumenResult"
})
@XmlRootElement(name = "ConfirmarRespuestaResumenResponse")
public class ConfirmarRespuestaResumenResponse {

    @XmlElement(name = "ConfirmarRespuestaResumenResult")
    protected ENRConfirmarRespuestaResumen confirmarRespuestaResumenResult;

    /**
     * Obtiene el valor de la propiedad confirmarRespuestaResumenResult.
     * 
     * @return
     *     possible object is
     *     {@link ENRConfirmarRespuestaResumen }
     *     
     */
    public ENRConfirmarRespuestaResumen getConfirmarRespuestaResumenResult() {
        return confirmarRespuestaResumenResult;
    }

    /**
     * Define el valor de la propiedad confirmarRespuestaResumenResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ENRConfirmarRespuestaResumen }
     *     
     */
    public void setConfirmarRespuestaResumenResult(ENRConfirmarRespuestaResumen value) {
        this.confirmarRespuestaResumenResult = value;
    }

}
