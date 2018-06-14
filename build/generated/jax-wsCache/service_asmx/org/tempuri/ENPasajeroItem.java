
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENPasajeroItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENPasajeroItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RazonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoUbigeoOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DireccionOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoUbigeoDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DireccionDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Asiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaProgramado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoraProgramado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroAutorizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENPasajeroItem", propOrder = {
    "razonSocial",
    "numeroDocumento",
    "codigoTipoDocumento",
    "codigoUbigeoOrigen",
    "direccionOrigen",
    "codigoUbigeoDestino",
    "direccionDestino",
    "asiento",
    "fechaProgramado",
    "horaProgramado",
    "formaPago",
    "numeroAutorizacion"
})
public class ENPasajeroItem {

    @XmlElement(name = "RazonSocial")
    protected String razonSocial;
    @XmlElement(name = "NumeroDocumento")
    protected String numeroDocumento;
    @XmlElement(name = "CodigoTipoDocumento")
    protected String codigoTipoDocumento;
    @XmlElement(name = "CodigoUbigeoOrigen")
    protected String codigoUbigeoOrigen;
    @XmlElement(name = "DireccionOrigen")
    protected String direccionOrigen;
    @XmlElement(name = "CodigoUbigeoDestino")
    protected String codigoUbigeoDestino;
    @XmlElement(name = "DireccionDestino")
    protected String direccionDestino;
    @XmlElement(name = "Asiento")
    protected String asiento;
    @XmlElement(name = "FechaProgramado")
    protected String fechaProgramado;
    @XmlElement(name = "HoraProgramado")
    protected String horaProgramado;
    @XmlElement(name = "FormaPago")
    protected String formaPago;
    @XmlElement(name = "NumeroAutorizacion")
    protected String numeroAutorizacion;

    /**
     * Obtiene el valor de la propiedad razonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Define el valor de la propiedad razonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define el valor de la propiedad numeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoDocumento() {
        return codigoTipoDocumento;
    }

    /**
     * Define el valor de la propiedad codigoTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoDocumento(String value) {
        this.codigoTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUbigeoOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUbigeoOrigen() {
        return codigoUbigeoOrigen;
    }

    /**
     * Define el valor de la propiedad codigoUbigeoOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUbigeoOrigen(String value) {
        this.codigoUbigeoOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionOrigen() {
        return direccionOrigen;
    }

    /**
     * Define el valor de la propiedad direccionOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionOrigen(String value) {
        this.direccionOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUbigeoDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUbigeoDestino() {
        return codigoUbigeoDestino;
    }

    /**
     * Define el valor de la propiedad codigoUbigeoDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUbigeoDestino(String value) {
        this.codigoUbigeoDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionDestino() {
        return direccionDestino;
    }

    /**
     * Define el valor de la propiedad direccionDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionDestino(String value) {
        this.direccionDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad asiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiento() {
        return asiento;
    }

    /**
     * Define el valor de la propiedad asiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiento(String value) {
        this.asiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaProgramado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaProgramado() {
        return fechaProgramado;
    }

    /**
     * Define el valor de la propiedad fechaProgramado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaProgramado(String value) {
        this.fechaProgramado = value;
    }

    /**
     * Obtiene el valor de la propiedad horaProgramado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraProgramado() {
        return horaProgramado;
    }

    /**
     * Define el valor de la propiedad horaProgramado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraProgramado(String value) {
        this.horaProgramado = value;
    }

    /**
     * Obtiene el valor de la propiedad formaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * Define el valor de la propiedad formaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPago(String value) {
        this.formaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroAutorizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAutorizacion() {
        return numeroAutorizacion;
    }

    /**
     * Define el valor de la propiedad numeroAutorizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAutorizacion(String value) {
        this.numeroAutorizacion = value;
    }

}
