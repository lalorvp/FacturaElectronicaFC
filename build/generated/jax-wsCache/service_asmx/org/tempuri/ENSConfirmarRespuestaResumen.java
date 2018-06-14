
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENSConfirmarRespuestaResumen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENSConfirmarRespuestaResumen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RucEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetalleResumen" type="{http://tempuri.org/}ArrayOfENDetalleResumen" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENSConfirmarRespuestaResumen", propOrder = {
    "rucEmisor",
    "detalleResumen"
})
public class ENSConfirmarRespuestaResumen {

    @XmlElement(name = "RucEmisor")
    protected String rucEmisor;
    @XmlElement(name = "DetalleResumen")
    protected ArrayOfENDetalleResumen detalleResumen;

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
     * Obtiene el valor de la propiedad detalleResumen.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENDetalleResumen }
     *     
     */
    public ArrayOfENDetalleResumen getDetalleResumen() {
        return detalleResumen;
    }

    /**
     * Define el valor de la propiedad detalleResumen.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENDetalleResumen }
     *     
     */
    public void setDetalleResumen(ArrayOfENDetalleResumen value) {
        this.detalleResumen = value;
    }

}
