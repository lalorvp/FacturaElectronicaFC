
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
 *         &lt;element name="oENPeticionAdjunto" type="{http://tempuri.org/}ENPeticionAdjunto" minOccurs="0"/>
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
    "oenPeticionAdjunto"
})
@XmlRootElement(name = "ConsultarAdjunto")
public class ConsultarAdjunto {

    @XmlElement(name = "oENPeticionAdjunto")
    protected ENPeticionAdjunto oenPeticionAdjunto;

    /**
     * Obtiene el valor de la propiedad oenPeticionAdjunto.
     * 
     * @return
     *     possible object is
     *     {@link ENPeticionAdjunto }
     *     
     */
    public ENPeticionAdjunto getOENPeticionAdjunto() {
        return oenPeticionAdjunto;
    }

    /**
     * Define el valor de la propiedad oenPeticionAdjunto.
     * 
     * @param value
     *     allowed object is
     *     {@link ENPeticionAdjunto }
     *     
     */
    public void setOENPeticionAdjunto(ENPeticionAdjunto value) {
        this.oenPeticionAdjunto = value;
    }

}
