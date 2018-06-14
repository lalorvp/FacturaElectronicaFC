
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
 *         &lt;element name="RegistrarAdjuntoResult" type="{http://tempuri.org/}ENRRegistrarAdjunto" minOccurs="0"/>
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
    "registrarAdjuntoResult"
})
@XmlRootElement(name = "RegistrarAdjuntoResponse")
public class RegistrarAdjuntoResponse {

    @XmlElement(name = "RegistrarAdjuntoResult")
    protected ENRRegistrarAdjunto registrarAdjuntoResult;

    /**
     * Obtiene el valor de la propiedad registrarAdjuntoResult.
     * 
     * @return
     *     possible object is
     *     {@link ENRRegistrarAdjunto }
     *     
     */
    public ENRRegistrarAdjunto getRegistrarAdjuntoResult() {
        return registrarAdjuntoResult;
    }

    /**
     * Define el valor de la propiedad registrarAdjuntoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ENRRegistrarAdjunto }
     *     
     */
    public void setRegistrarAdjuntoResult(ENRRegistrarAdjunto value) {
        this.registrarAdjuntoResult = value;
    }

}
