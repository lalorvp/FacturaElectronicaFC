
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
 *         &lt;element name="enConsultarResumen" type="{http://tempuri.org/}ENConsultaComprobante" minOccurs="0"/>
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
    "enConsultarResumen"
})
@XmlRootElement(name = "ConsultarComprobanteResumen")
public class ConsultarComprobanteResumen {

    protected ENConsultaComprobante enConsultarResumen;

    /**
     * Obtiene el valor de la propiedad enConsultarResumen.
     * 
     * @return
     *     possible object is
     *     {@link ENConsultaComprobante }
     *     
     */
    public ENConsultaComprobante getEnConsultarResumen() {
        return enConsultarResumen;
    }

    /**
     * Define el valor de la propiedad enConsultarResumen.
     * 
     * @param value
     *     allowed object is
     *     {@link ENConsultaComprobante }
     *     
     */
    public void setEnConsultarResumen(ENConsultaComprobante value) {
        this.enConsultarResumen = value;
    }

}
