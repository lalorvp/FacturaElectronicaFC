
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
 *         &lt;element name="ReenviarCorreoResult" type="{http://tempuri.org/}ENSalidaReenvio" minOccurs="0"/>
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
    "reenviarCorreoResult"
})
@XmlRootElement(name = "ReenviarCorreoResponse")
public class ReenviarCorreoResponse {

    @XmlElement(name = "ReenviarCorreoResult")
    protected ENSalidaReenvio reenviarCorreoResult;

    /**
     * Obtiene el valor de la propiedad reenviarCorreoResult.
     * 
     * @return
     *     possible object is
     *     {@link ENSalidaReenvio }
     *     
     */
    public ENSalidaReenvio getReenviarCorreoResult() {
        return reenviarCorreoResult;
    }

    /**
     * Define el valor de la propiedad reenviarCorreoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ENSalidaReenvio }
     *     
     */
    public void setReenviarCorreoResult(ENSalidaReenvio value) {
        this.reenviarCorreoResult = value;
    }

}
