
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENSConsultarRespuestaResumen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENSConsultarRespuestaResumen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RucEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CantidadResumen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENSConsultarRespuestaResumen", propOrder = {
    "rucEmisor",
    "cantidadResumen"
})
public class ENSConsultarRespuestaResumen {

    @XmlElement(name = "RucEmisor")
    protected String rucEmisor;
    @XmlElement(name = "CantidadResumen")
    protected int cantidadResumen;

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
     * Obtiene el valor de la propiedad cantidadResumen.
     * 
     */
    public int getCantidadResumen() {
        return cantidadResumen;
    }

    /**
     * Define el valor de la propiedad cantidadResumen.
     * 
     */
    public void setCantidadResumen(int value) {
        this.cantidadResumen = value;
    }

}
