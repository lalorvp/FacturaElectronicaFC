
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EnCasoNegocio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EnCasoNegocio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoAfectacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoCaso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnCasoNegocio", propOrder = {
    "codigoAfectacion",
    "codigoCaso"
})
public class EnCasoNegocio {

    @XmlElement(name = "CodigoAfectacion")
    protected String codigoAfectacion;
    @XmlElement(name = "CodigoCaso")
    protected String codigoCaso;

    /**
     * Obtiene el valor de la propiedad codigoAfectacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAfectacion() {
        return codigoAfectacion;
    }

    /**
     * Define el valor de la propiedad codigoAfectacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAfectacion(String value) {
        this.codigoAfectacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCaso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCaso() {
        return codigoCaso;
    }

    /**
     * Define el valor de la propiedad codigoCaso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCaso(String value) {
        this.codigoCaso = value;
    }

}
