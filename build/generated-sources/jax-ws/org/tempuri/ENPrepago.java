
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ENPrepago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENPrepago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrecioReal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoInstruccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoraPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaPago" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaRecepcion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RucEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDocumentoIdentidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENPrepago", propOrder = {
    "precioReal",
    "descripcion",
    "codigoInstruccion",
    "horaPago",
    "fechaPago",
    "fechaRecepcion",
    "monto",
    "valor",
    "codigo",
    "rucEmisor",
    "tipoDocumentoIdentidad"
})
public class ENPrepago {

    @XmlElement(name = "PrecioReal")
    protected double precioReal;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "CodigoInstruccion")
    protected String codigoInstruccion;
    @XmlElement(name = "HoraPago")
    protected String horaPago;
    @XmlElement(name = "FechaPago", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaPago;
    @XmlElement(name = "FechaRecepcion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRecepcion;
    @XmlElement(name = "Monto")
    protected double monto;
    protected double valor;
    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "RucEmisor")
    protected String rucEmisor;
    @XmlElement(name = "TipoDocumentoIdentidad")
    protected String tipoDocumentoIdentidad;

    /**
     * Obtiene el valor de la propiedad precioReal.
     * 
     */
    public double getPrecioReal() {
        return precioReal;
    }

    /**
     * Define el valor de la propiedad precioReal.
     * 
     */
    public void setPrecioReal(double value) {
        this.precioReal = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoInstruccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoInstruccion() {
        return codigoInstruccion;
    }

    /**
     * Define el valor de la propiedad codigoInstruccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoInstruccion(String value) {
        this.codigoInstruccion = value;
    }

    /**
     * Obtiene el valor de la propiedad horaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraPago() {
        return horaPago;
    }

    /**
     * Define el valor de la propiedad horaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraPago(String value) {
        this.horaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPago.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaPago() {
        return fechaPago;
    }

    /**
     * Define el valor de la propiedad fechaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaPago(XMLGregorianCalendar value) {
        this.fechaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRecepcion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * Define el valor de la propiedad fechaRecepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRecepcion(XMLGregorianCalendar value) {
        this.fechaRecepcion = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     */
    public double getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     */
    public void setMonto(double value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     */
    public void setValor(double value) {
        this.valor = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad rucEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucEmisor() {
        return rucEmisor;
    }

    /**
     * Define el valor de la propiedad rucEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucEmisor(String value) {
        this.rucEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumentoIdentidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumentoIdentidad() {
        return tipoDocumentoIdentidad;
    }

    /**
     * Define el valor de la propiedad tipoDocumentoIdentidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumentoIdentidad(String value) {
        this.tipoDocumentoIdentidad = value;
    }

}
