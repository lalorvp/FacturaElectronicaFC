
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="enEntradaCorreoReenvio" type="{http://tempuri.org/}ENEntradaReenvio" minOccurs="0"/>
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
    "enEntradaCorreoReenvio"
})
@XmlRootElement(name = "ReenviarCorreo")
public class ReenviarCorreo {

    protected ENEntradaReenvio enEntradaCorreoReenvio;

    /**
     * Obtiene el valor de la propiedad enEntradaCorreoReenvio.
     * 
     * @return
     *     possible object is
     *     {@link ENEntradaReenvio }
     *     
     */
    public ENEntradaReenvio getEnEntradaCorreoReenvio() {
        return enEntradaCorreoReenvio;
    }

    /**
     * Define el valor de la propiedad enEntradaCorreoReenvio.
     * 
     * @param value
     *     allowed object is
     *     {@link ENEntradaReenvio }
     *     
     */
    public void setEnEntradaCorreoReenvio(ENEntradaReenvio value) {
        this.enEntradaCorreoReenvio = value;
    }

}
