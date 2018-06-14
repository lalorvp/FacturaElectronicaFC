
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
 *         &lt;element name="oENPeticionConfirmacion" type="{http://tempuri.org/}ENPeticionConfirmacion" minOccurs="0"/>
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
    "oenPeticionConfirmacion"
})
@XmlRootElement(name = "ConfirmarEstadoComprobante")
public class ConfirmarEstadoComprobante {

    @XmlElement(name = "oENPeticionConfirmacion")
    protected ENPeticionConfirmacion oenPeticionConfirmacion;

    /**
     * Obtiene el valor de la propiedad oenPeticionConfirmacion.
     * 
     * @return
     *     possible object is
     *     {@link ENPeticionConfirmacion }
     *     
     */
    public ENPeticionConfirmacion getOENPeticionConfirmacion() {
        return oenPeticionConfirmacion;
    }

    /**
     * Define el valor de la propiedad oenPeticionConfirmacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ENPeticionConfirmacion }
     *     
     */
    public void setOENPeticionConfirmacion(ENPeticionConfirmacion value) {
        this.oenPeticionConfirmacion = value;
    }

}
