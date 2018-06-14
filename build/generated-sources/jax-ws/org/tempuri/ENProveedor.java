
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENProveedor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENProveedor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroProcesoSeleccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoUnidadEjecutora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENProveedor", propOrder = {
    "numeroContrato",
    "numeroProcesoSeleccion",
    "codigoUnidadEjecutora",
    "numeroExpediente"
})
public class ENProveedor {

    @XmlElement(name = "NumeroContrato")
    protected String numeroContrato;
    @XmlElement(name = "NumeroProcesoSeleccion")
    protected String numeroProcesoSeleccion;
    @XmlElement(name = "CodigoUnidadEjecutora")
    protected String codigoUnidadEjecutora;
    @XmlElement(name = "NumeroExpediente")
    protected String numeroExpediente;

    /**
     * Obtiene el valor de la propiedad numeroContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroContrato() {
        return numeroContrato;
    }

    /**
     * Define el valor de la propiedad numeroContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroContrato(String value) {
        this.numeroContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroProcesoSeleccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProcesoSeleccion() {
        return numeroProcesoSeleccion;
    }

    /**
     * Define el valor de la propiedad numeroProcesoSeleccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProcesoSeleccion(String value) {
        this.numeroProcesoSeleccion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUnidadEjecutora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUnidadEjecutora() {
        return codigoUnidadEjecutora;
    }

    /**
     * Define el valor de la propiedad codigoUnidadEjecutora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUnidadEjecutora(String value) {
        this.codigoUnidadEjecutora = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroExpediente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    /**
     * Define el valor de la propiedad numeroExpediente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroExpediente(String value) {
        this.numeroExpediente = value;
    }

}
