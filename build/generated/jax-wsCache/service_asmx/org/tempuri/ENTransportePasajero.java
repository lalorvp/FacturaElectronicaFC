
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENTransportePasajero complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENTransportePasajero">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NroAsiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InformacionManifiesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoUbigeoDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DireccionDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoUbigeoOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DireccionOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaProgramado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoraProgramado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENTransportePasajero", propOrder = {
    "nroAsiento",
    "informacionManifiesto",
    "numeroDocumento",
    "codigoTipoDocumento",
    "nombre",
    "codigoUbigeoDestino",
    "direccionDestino",
    "codigoUbigeoOrigen",
    "direccionOrigen",
    "fechaProgramado",
    "horaProgramado"
})
public class ENTransportePasajero {

    @XmlElement(name = "NroAsiento")
    protected String nroAsiento;
    @XmlElement(name = "InformacionManifiesto")
    protected String informacionManifiesto;
    @XmlElement(name = "NumeroDocumento")
    protected String numeroDocumento;
    @XmlElement(name = "CodigoTipoDocumento")
    protected String codigoTipoDocumento;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "CodigoUbigeoDestino")
    protected String codigoUbigeoDestino;
    @XmlElement(name = "DireccionDestino")
    protected String direccionDestino;
    @XmlElement(name = "CodigoUbigeoOrigen")
    protected String codigoUbigeoOrigen;
    @XmlElement(name = "DireccionOrigen")
    protected String direccionOrigen;
    @XmlElement(name = "FechaProgramado")
    protected String fechaProgramado;
    @XmlElement(name = "HoraProgramado")
    protected String horaProgramado;

    /**
     * Obtiene el valor de la propiedad nroAsiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroAsiento() {
        return nroAsiento;
    }

    /**
     * Define el valor de la propiedad nroAsiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroAsiento(String value) {
        this.nroAsiento = value;
    }

    /**
     * Obtiene el valor de la propiedad informacionManifiesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformacionManifiesto() {
        return informacionManifiesto;
    }

    /**
     * Define el valor de la propiedad informacionManifiesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformacionManifiesto(String value) {
        this.informacionManifiesto = value;
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
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
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

}
