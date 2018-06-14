
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
 *         &lt;element name="oENPeticionEstadoComprobante" type="{http://tempuri.org/}ENPeticionEstadoComprobante" minOccurs="0"/>
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
    "oenPeticionEstadoComprobante"
})
@XmlRootElement(name = "ConsultarEstadoComprobante")
public class ConsultarEstadoComprobante {

    @XmlElement(name = "oENPeticionEstadoComprobante")
    protected ENPeticionEstadoComprobante oenPeticionEstadoComprobante;

    /**
     * Obtiene el valor de la propiedad oenPeticionEstadoComprobante.
     * 
     * @return
     *     possible object is
     *     {@link ENPeticionEstadoComprobante }
     *     
     */
    public ENPeticionEstadoComprobante getOENPeticionEstadoComprobante() {
        return oenPeticionEstadoComprobante;
    }

    /**
     * Define el valor de la propiedad oenPeticionEstadoComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link ENPeticionEstadoComprobante }
     *     
     */
    public void setOENPeticionEstadoComprobante(ENPeticionEstadoComprobante value) {
        this.oenPeticionEstadoComprobante = value;
    }

}
