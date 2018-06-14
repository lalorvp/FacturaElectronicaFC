
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENGastosHipotecario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENGastosHipotecario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoTipoPrestamo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoIndicador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroPartidaRegistral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaOtorgaCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoUbigeo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Urbanizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Distrito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENGastosHipotecario", propOrder = {
    "codigoTipoPrestamo",
    "codigoIndicador",
    "numeroPartidaRegistral",
    "numeroContrato",
    "fechaOtorgaCredito",
    "codigoUbigeo",
    "direccion",
    "urbanizacion",
    "provincia",
    "distrito",
    "departamento"
})
public class ENGastosHipotecario {

    @XmlElement(name = "CodigoTipoPrestamo")
    protected String codigoTipoPrestamo;
    @XmlElement(name = "CodigoIndicador")
    protected String codigoIndicador;
    @XmlElement(name = "NumeroPartidaRegistral")
    protected String numeroPartidaRegistral;
    @XmlElement(name = "NumeroContrato")
    protected String numeroContrato;
    @XmlElement(name = "FechaOtorgaCredito")
    protected String fechaOtorgaCredito;
    @XmlElement(name = "CodigoUbigeo")
    protected String codigoUbigeo;
    @XmlElement(name = "Direccion")
    protected String direccion;
    @XmlElement(name = "Urbanizacion")
    protected String urbanizacion;
    @XmlElement(name = "Provincia")
    protected String provincia;
    @XmlElement(name = "Distrito")
    protected String distrito;
    @XmlElement(name = "Departamento")
    protected String departamento;

    /**
     * Obtiene el valor de la propiedad codigoTipoPrestamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoPrestamo() {
        return codigoTipoPrestamo;
    }

    /**
     * Define el valor de la propiedad codigoTipoPrestamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoPrestamo(String value) {
        this.codigoTipoPrestamo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoIndicador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoIndicador() {
        return codigoIndicador;
    }

    /**
     * Define el valor de la propiedad codigoIndicador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoIndicador(String value) {
        this.codigoIndicador = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroPartidaRegistral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPartidaRegistral() {
        return numeroPartidaRegistral;
    }

    /**
     * Define el valor de la propiedad numeroPartidaRegistral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPartidaRegistral(String value) {
        this.numeroPartidaRegistral = value;
    }

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
     * Obtiene el valor de la propiedad fechaOtorgaCredito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOtorgaCredito() {
        return fechaOtorgaCredito;
    }

    /**
     * Define el valor de la propiedad fechaOtorgaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOtorgaCredito(String value) {
        this.fechaOtorgaCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUbigeo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUbigeo() {
        return codigoUbigeo;
    }

    /**
     * Define el valor de la propiedad codigoUbigeo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUbigeo(String value) {
        this.codigoUbigeo = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad urbanizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrbanizacion() {
        return urbanizacion;
    }

    /**
     * Define el valor de la propiedad urbanizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrbanizacion(String value) {
        this.urbanizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Obtiene el valor de la propiedad distrito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrito() {
        return distrito;
    }

    /**
     * Define el valor de la propiedad distrito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrito(String value) {
        this.distrito = value;
    }

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamento(String value) {
        this.departamento = value;
    }

}
