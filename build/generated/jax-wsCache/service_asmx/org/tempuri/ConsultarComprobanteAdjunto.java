
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
 *         &lt;element name="oENPeticionComprobanteAdjunto" type="{http://tempuri.org/}ENPeticionComprobanteAdjunto" minOccurs="0"/>
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
    "oenPeticionComprobanteAdjunto"
})
@XmlRootElement(name = "ConsultarComprobanteAdjunto")
public class ConsultarComprobanteAdjunto {

    @XmlElement(name = "oENPeticionComprobanteAdjunto")
    protected ENPeticionComprobanteAdjunto oenPeticionComprobanteAdjunto;

    /**
     * Obtiene el valor de la propiedad oenPeticionComprobanteAdjunto.
     * 
     * @return
     *     possible object is
     *     {@link ENPeticionComprobanteAdjunto }
     *     
     */
    public ENPeticionComprobanteAdjunto getOENPeticionComprobanteAdjunto() {
        return oenPeticionComprobanteAdjunto;
    }

    /**
     * Define el valor de la propiedad oenPeticionComprobanteAdjunto.
     * 
     * @param value
     *     allowed object is
     *     {@link ENPeticionComprobanteAdjunto }
     *     
     */
    public void setOENPeticionComprobanteAdjunto(ENPeticionComprobanteAdjunto value) {
        this.oenPeticionComprobanteAdjunto = value;
    }

}
