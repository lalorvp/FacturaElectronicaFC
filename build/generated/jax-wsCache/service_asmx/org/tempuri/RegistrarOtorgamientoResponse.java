
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
 *         &lt;element name="RegistrarOtorgamientoResult" type="{http://tempuri.org/}ENRespuestaOtorgamiento" minOccurs="0"/>
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
    "registrarOtorgamientoResult"
})
@XmlRootElement(name = "RegistrarOtorgamientoResponse")
public class RegistrarOtorgamientoResponse {

    @XmlElement(name = "RegistrarOtorgamientoResult")
    protected ENRespuestaOtorgamiento registrarOtorgamientoResult;

    /**
     * Obtiene el valor de la propiedad registrarOtorgamientoResult.
     * 
     * @return
     *     possible object is
     *     {@link ENRespuestaOtorgamiento }
     *     
     */
    public ENRespuestaOtorgamiento getRegistrarOtorgamientoResult() {
        return registrarOtorgamientoResult;
    }

    /**
     * Define el valor de la propiedad registrarOtorgamientoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ENRespuestaOtorgamiento }
     *     
     */
    public void setRegistrarOtorgamientoResult(ENRespuestaOtorgamiento value) {
        this.registrarOtorgamientoResult = value;
    }

}
