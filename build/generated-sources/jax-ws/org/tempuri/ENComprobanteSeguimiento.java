
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ENComprobanteSeguimiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENComprobanteSeguimiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdSeguimiento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdComprobante" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ArchivoXML" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="NombreArchivoXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaGeneracion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IdTransaccion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdTransaccionDetalle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Enviado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Respuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArchivoRespuesta" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Ticket" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="TipoRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoTipoComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoFecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdEmpresa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumeroPagina" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CantidadRegistros" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OpcionBuscar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoRespuestaSunat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescripcionRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENComprobanteSeguimiento", propOrder = {
    "idSeguimiento",
    "idComprobante",
    "archivoXML",
    "nombreArchivoXML",
    "fechaGeneracion",
    "idTransaccion",
    "idTransaccionDetalle",
    "enviado",
    "fecha",
    "respuesta",
    "archivoRespuesta",
    "ticket",
    "tipoRespuesta",
    "codigoTipoComprobante",
    "serie",
    "numero",
    "tipoFecha",
    "tipoComprobante",
    "fechaDesde",
    "fechaHasta",
    "idEmpresa",
    "numeroPagina",
    "cantidadRegistros",
    "opcionBuscar",
    "codigoRespuestaSunat",
    "codigoRespuesta",
    "descripcionRespuesta"
})
public class ENComprobanteSeguimiento {

    @XmlElement(name = "IdSeguimiento")
    protected int idSeguimiento;
    @XmlElement(name = "IdComprobante")
    protected int idComprobante;
    @XmlElement(name = "ArchivoXML")
    protected byte[] archivoXML;
    @XmlElement(name = "NombreArchivoXML")
    protected String nombreArchivoXML;
    @XmlElement(name = "FechaGeneracion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaGeneracion;
    @XmlElement(name = "IdTransaccion")
    protected int idTransaccion;
    @XmlElement(name = "IdTransaccionDetalle")
    protected int idTransaccionDetalle;
    @XmlElement(name = "Enviado")
    protected String enviado;
    @XmlElement(name = "Fecha", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "Respuesta")
    protected String respuesta;
    @XmlElement(name = "ArchivoRespuesta")
    protected byte[] archivoRespuesta;
    @XmlElement(name = "Ticket")
    protected byte[] ticket;
    @XmlElement(name = "TipoRespuesta")
    protected String tipoRespuesta;
    @XmlElement(name = "CodigoTipoComprobante")
    protected String codigoTipoComprobante;
    @XmlElement(name = "Serie")
    protected String serie;
    @XmlElement(name = "Numero")
    protected String numero;
    @XmlElement(name = "TipoFecha")
    protected String tipoFecha;
    @XmlElement(name = "TipoComprobante")
    protected String tipoComprobante;
    @XmlElement(name = "FechaDesde")
    protected String fechaDesde;
    @XmlElement(name = "FechaHasta")
    protected String fechaHasta;
    @XmlElement(name = "IdEmpresa")
    protected int idEmpresa;
    @XmlElement(name = "NumeroPagina")
    protected int numeroPagina;
    @XmlElement(name = "CantidadRegistros")
    protected int cantidadRegistros;
    @XmlElement(name = "OpcionBuscar")
    protected String opcionBuscar;
    protected String codigoRespuestaSunat;
    @XmlElement(name = "CodigoRespuesta")
    protected String codigoRespuesta;
    @XmlElement(name = "DescripcionRespuesta")
    protected String descripcionRespuesta;

    /**
     * Obtiene el valor de la propiedad idSeguimiento.
     * 
     */
    public int getIdSeguimiento() {
        return idSeguimiento;
    }

    /**
     * Define el valor de la propiedad idSeguimiento.
     * 
     */
    public void setIdSeguimiento(int value) {
        this.idSeguimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad idComprobante.
     * 
     */
    public int getIdComprobante() {
        return idComprobante;
    }

    /**
     * Define el valor de la propiedad idComprobante.
     * 
     */
    public void setIdComprobante(int value) {
        this.idComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad archivoXML.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getArchivoXML() {
        return archivoXML;
    }

    /**
     * Define el valor de la propiedad archivoXML.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setArchivoXML(byte[] value) {
        this.archivoXML = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreArchivoXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreArchivoXML() {
        return nombreArchivoXML;
    }

    /**
     * Define el valor de la propiedad nombreArchivoXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreArchivoXML(String value) {
        this.nombreArchivoXML = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaGeneracion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaGeneracion() {
        return fechaGeneracion;
    }

    /**
     * Define el valor de la propiedad fechaGeneracion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaGeneracion(XMLGregorianCalendar value) {
        this.fechaGeneracion = value;
    }

    /**
     * Obtiene el valor de la propiedad idTransaccion.
     * 
     */
    public int getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * Define el valor de la propiedad idTransaccion.
     * 
     */
    public void setIdTransaccion(int value) {
        this.idTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad idTransaccionDetalle.
     * 
     */
    public int getIdTransaccionDetalle() {
        return idTransaccionDetalle;
    }

    /**
     * Define el valor de la propiedad idTransaccionDetalle.
     * 
     */
    public void setIdTransaccionDetalle(int value) {
        this.idTransaccionDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad enviado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnviado() {
        return enviado;
    }

    /**
     * Define el valor de la propiedad enviado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnviado(String value) {
        this.enviado = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespuesta(String value) {
        this.respuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad archivoRespuesta.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getArchivoRespuesta() {
        return archivoRespuesta;
    }

    /**
     * Define el valor de la propiedad archivoRespuesta.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setArchivoRespuesta(byte[] value) {
        this.archivoRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad ticket.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTicket() {
        return ticket;
    }

    /**
     * Define el valor de la propiedad ticket.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTicket(byte[] value) {
        this.ticket = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRespuesta() {
        return tipoRespuesta;
    }

    /**
     * Define el valor de la propiedad tipoRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRespuesta(String value) {
        this.tipoRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoComprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoComprobante() {
        return codigoTipoComprobante;
    }

    /**
     * Define el valor de la propiedad codigoTipoComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoComprobante(String value) {
        this.codigoTipoComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Define el valor de la propiedad serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFecha() {
        return tipoFecha;
    }

    /**
     * Define el valor de la propiedad tipoFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFecha(String value) {
        this.tipoFecha = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoComprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoComprobante() {
        return tipoComprobante;
    }

    /**
     * Define el valor de la propiedad tipoComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoComprobante(String value) {
        this.tipoComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDesde() {
        return fechaDesde;
    }

    /**
     * Define el valor de la propiedad fechaDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDesde(String value) {
        this.fechaDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaHasta() {
        return fechaHasta;
    }

    /**
     * Define el valor de la propiedad fechaHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHasta(String value) {
        this.fechaHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad idEmpresa.
     * 
     */
    public int getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * Define el valor de la propiedad idEmpresa.
     * 
     */
    public void setIdEmpresa(int value) {
        this.idEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroPagina.
     * 
     */
    public int getNumeroPagina() {
        return numeroPagina;
    }

    /**
     * Define el valor de la propiedad numeroPagina.
     * 
     */
    public void setNumeroPagina(int value) {
        this.numeroPagina = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadRegistros.
     * 
     */
    public int getCantidadRegistros() {
        return cantidadRegistros;
    }

    /**
     * Define el valor de la propiedad cantidadRegistros.
     * 
     */
    public void setCantidadRegistros(int value) {
        this.cantidadRegistros = value;
    }

    /**
     * Obtiene el valor de la propiedad opcionBuscar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcionBuscar() {
        return opcionBuscar;
    }

    /**
     * Define el valor de la propiedad opcionBuscar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcionBuscar(String value) {
        this.opcionBuscar = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoRespuestaSunat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRespuestaSunat() {
        return codigoRespuestaSunat;
    }

    /**
     * Define el valor de la propiedad codigoRespuestaSunat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRespuestaSunat(String value) {
        this.codigoRespuestaSunat = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRespuesta() {
        return codigoRespuesta;
    }

    /**
     * Define el valor de la propiedad codigoRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRespuesta(String value) {
        this.codigoRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionRespuesta() {
        return descripcionRespuesta;
    }

    /**
     * Define el valor de la propiedad descripcionRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionRespuesta(String value) {
        this.descripcionRespuesta = value;
    }

}
