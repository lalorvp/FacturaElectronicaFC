
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
 *         &lt;element name="oResumen" type="{http://tempuri.org/}ENResumen" minOccurs="0"/>
 *         &lt;element name="Cadena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdResumenCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "oResumen",
    "cadena",
    "idResumenCliente"
})
@XmlRootElement(name = "RegistrarResumen")
public class RegistrarResumen {

    protected ENResumen oResumen;
    @XmlElement(name = "Cadena")
    protected String cadena;
    @XmlElement(name = "IdResumenCliente")
    protected int idResumenCliente;

    /**
     * Obtiene el valor de la propiedad oResumen.
     * 
     * @return
     *     possible object is
     *     {@link ENResumen }
     *     
     */
    public ENResumen getOResumen() {
        return oResumen;
    }

    /**
     * Define el valor de la propiedad oResumen.
     * 
     * @param value
     *     allowed object is
     *     {@link ENResumen }
     *     
     */
    public void setOResumen(ENResumen value) {
        this.oResumen = value;
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

    /**
     * Obtiene el valor de la propiedad idResumenCliente.
     * 
     */
    public int getIdResumenCliente() {
        return idResumenCliente;
    }

    /**
     * Define el valor de la propiedad idResumenCliente.
     * 
     */
    public void setIdResumenCliente(int value) {
        this.idResumenCliente = value;
    }

}
