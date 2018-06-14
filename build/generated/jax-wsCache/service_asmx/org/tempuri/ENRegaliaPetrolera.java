
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENRegaliaPetrolera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENRegaliaPetrolera">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AprobacionContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AreaContratada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENRegaliaPetrolera", propOrder = {
    "aprobacionContrato",
    "areaContratada",
    "fechaInicio",
    "fechaFin",
    "fechaPago"
})
public class ENRegaliaPetrolera {

    @XmlElement(name = "AprobacionContrato")
    protected String aprobacionContrato;
    @XmlElement(name = "AreaContratada")
    protected String areaContratada;
    @XmlElement(name = "FechaInicio")
    protected String fechaInicio;
    @XmlElement(name = "FechaFin")
    protected String fechaFin;
    @XmlElement(name = "FechaPago")
    protected String fechaPago;

    /**
     * Obtiene el valor de la propiedad aprobacionContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAprobacionContrato() {
        return aprobacionContrato;
    }

    /**
     * Define el valor de la propiedad aprobacionContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAprobacionContrato(String value) {
        this.aprobacionContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad areaContratada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaContratada() {
        return areaContratada;
    }

    /**
     * Define el valor de la propiedad areaContratada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaContratada(String value) {
        this.areaContratada = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Define el valor de la propiedad fechaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicio(String value) {
        this.fechaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFin() {
        return fechaFin;
    }

    /**
     * Define el valor de la propiedad fechaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFin(String value) {
        this.fechaFin = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * Define el valor de la propiedad fechaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPago(String value) {
        this.fechaPago = value;
    }

}
