
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
 *         &lt;element name="oENconsulta" type="{http://tempuri.org/}ENComprobanteConsulta" minOccurs="0"/>
 *         &lt;element name="Cadena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "oeNconsulta",
    "cadena"
})
@XmlRootElement(name = "ConsultarComprobanteIndividual")
public class ConsultarComprobanteIndividual {

    @XmlElement(name = "oENconsulta")
    protected ENComprobanteConsulta oeNconsulta;
    @XmlElement(name = "Cadena")
    protected String cadena;

    /**
     * Obtiene el valor de la propiedad oeNconsulta.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobanteConsulta }
     *     
     */
    public ENComprobanteConsulta getOENconsulta() {
        return oeNconsulta;
    }

    /**
     * Define el valor de la propiedad oeNconsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobanteConsulta }
     *     
     */
    public void setOENconsulta(ENComprobanteConsulta value) {
        this.oeNconsulta = value;
    }

    /**
     * Obtiene el valor de la propiedad cadena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * Define el valor de la propiedad cadena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadena(String value) {
        this.cadena = value;
    }

}
