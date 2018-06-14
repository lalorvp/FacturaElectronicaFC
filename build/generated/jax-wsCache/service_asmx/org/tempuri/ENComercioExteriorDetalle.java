
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENComercioExteriorDetalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENComercioExteriorDetalle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdComercioExteriorDetalle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdComprobanteDetalle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Paquetes" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PesoNetoUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PesoNeto" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PesoBrutoUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PesoBruto" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENComercioExteriorDetalle", propOrder = {
    "idComercioExteriorDetalle",
    "idComprobanteDetalle",
    "paquetes",
    "pesoNetoUnidad",
    "pesoNeto",
    "pesoBrutoUnidad",
    "pesoBruto"
})
public class ENComercioExteriorDetalle {

    @XmlElement(name = "IdComercioExteriorDetalle")
    protected int idComercioExteriorDetalle;
    @XmlElement(name = "IdComprobanteDetalle")
    protected int idComprobanteDetalle;
    @XmlElement(name = "Paquetes", required = true)
    protected BigDecimal paquetes;
    @XmlElement(name = "PesoNetoUnidad")
    protected String pesoNetoUnidad;
    @XmlElement(name = "PesoNeto", required = true)
    protected BigDecimal pesoNeto;
    @XmlElement(name = "PesoBrutoUnidad")
    protected String pesoBrutoUnidad;
    @XmlElement(name = "PesoBruto", required = true)
    protected BigDecimal pesoBruto;

    /**
     * Obtiene el valor de la propiedad idComercioExteriorDetalle.
     * 
     */
    public int getIdComercioExteriorDetalle() {
        return idComercioExteriorDetalle;
    }

    /**
     * Define el valor de la propiedad idComercioExteriorDetalle.
     * 
     */
    public void setIdComercioExteriorDetalle(int value) {
        this.idComercioExteriorDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad idComprobanteDetalle.
     * 
     */
    public int getIdComprobanteDetalle() {
        return idComprobanteDetalle;
    }

    /**
     * Define el valor de la propiedad idComprobanteDetalle.
     * 
     */
    public void setIdComprobanteDetalle(int value) {
        this.idComprobanteDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad paquetes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaquetes() {
        return paquetes;
    }

    /**
     * Define el valor de la propiedad paquetes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaquetes(BigDecimal value) {
        this.paquetes = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoNetoUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoNetoUnidad() {
        return pesoNetoUnidad;
    }

    /**
     * Define el valor de la propiedad pesoNetoUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoNetoUnidad(String value) {
        this.pesoNetoUnidad = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoNeto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoNeto() {
        return pesoNeto;
    }

    /**
     * Define el valor de la propiedad pesoNeto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoNeto(BigDecimal value) {
        this.pesoNeto = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoBrutoUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoBrutoUnidad() {
        return pesoBrutoUnidad;
    }

    /**
     * Define el valor de la propiedad pesoBrutoUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoBrutoUnidad(String value) {
        this.pesoBrutoUnidad = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoBruto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoBruto() {
        return pesoBruto;
    }

    /**
     * Define el valor de la propiedad pesoBruto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoBruto(BigDecimal value) {
        this.pesoBruto = value;
    }

}
