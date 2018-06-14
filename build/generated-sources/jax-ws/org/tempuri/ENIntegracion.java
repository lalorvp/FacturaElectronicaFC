
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENIntegracion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENIntegracion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArchivoPlano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoIntegracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENIntegracion", propOrder = {
    "archivoPlano",
    "tipoIntegracion"
})
public class ENIntegracion {

    @XmlElement(name = "ArchivoPlano")
    protected String archivoPlano;
    @XmlElement(name = "TipoIntegracion")
    protected String tipoIntegracion;

    /**
     * Obtiene el valor de la propiedad archivoPlano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchivoPlano() {
        return archivoPlano;
    }

    /**
     * Define el valor de la propiedad archivoPlano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchivoPlano(String value) {
        this.archivoPlano = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIntegracion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIntegracion() {
        return tipoIntegracion;
    }

    /**
     * Define el valor de la propiedad tipoIntegracion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIntegracion(String value) {
        this.tipoIntegracion = value;
    }

}
