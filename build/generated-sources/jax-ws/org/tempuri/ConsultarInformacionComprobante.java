
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
 *         &lt;element name="oENPeticion" type="{http://tempuri.org/}ENPeticionInformacionComprobante" minOccurs="0"/>
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
    "oenPeticion"
})
@XmlRootElement(name = "ConsultarInformacionComprobante")
public class ConsultarInformacionComprobante {

    @XmlElement(name = "oENPeticion")
    protected ENPeticionInformacionComprobante oenPeticion;

    /**
     * Obtiene el valor de la propiedad oenPeticion.
     * 
     * @return
     *     possible object is
     *     {@link ENPeticionInformacionComprobante }
     *     
     */
    public ENPeticionInformacionComprobante getOENPeticion() {
        return oenPeticion;
    }

    /**
     * Define el valor de la propiedad oenPeticion.
     * 
     * @param value
     *     allowed object is
     *     {@link ENPeticionInformacionComprobante }
     *     
     */
    public void setOENPeticion(ENPeticionInformacionComprobante value) {
        this.oenPeticion = value;
    }

}
