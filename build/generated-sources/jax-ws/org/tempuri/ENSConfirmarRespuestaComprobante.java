
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENSConfirmarRespuestaComprobante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENSConfirmarRespuestaComprobante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RucEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetalleComprobante" type="{http://tempuri.org/}ArrayOfENDetalleComprobante" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENSConfirmarRespuestaComprobante", propOrder = {
    "rucEmisor",
    "detalleComprobante"
})
public class ENSConfirmarRespuestaComprobante {

    @XmlElement(name = "RucEmisor")
    protected String rucEmisor;
    @XmlElement(name = "DetalleComprobante")
    protected ArrayOfENDetalleComprobante detalleComprobante;

    /**
     * Obtiene el valor de la propiedad rucEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucEmisor() {
        return rucEmisor;
    }

    /**
     * Define el valor de la propiedad rucEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucEmisor(String value) {
        this.rucEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleComprobante.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENDetalleComprobante }
     *     
     */
    public ArrayOfENDetalleComprobante getDetalleComprobante() {
        return detalleComprobante;
    }

    /**
     * Define el valor de la propiedad detalleComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENDetalleComprobante }
     *     
     */
    public void setDetalleComprobante(ArrayOfENDetalleComprobante value) {
        this.detalleComprobante = value;
    }

}
