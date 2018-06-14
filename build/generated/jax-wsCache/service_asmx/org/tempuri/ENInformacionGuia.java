
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENInformacionGuia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENInformacionGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PuntoLlegada" type="{http://tempuri.org/}ENPuntoLlegada" minOccurs="0"/>
 *         &lt;element name="PuntoPartida" type="{http://tempuri.org/}ENPuntoPartida" minOccurs="0"/>
 *         &lt;element name="TransportistaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransportistaRuc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transportista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NroLicencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VehiculoMarca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VehiculoConstanciaInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VehiculoPlaca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModalidadTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransportistaDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalPesoBruto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="UnidadPesoBruto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoMotivoTraslado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistroMTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubContratacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Secundarios" type="{http://tempuri.org/}ArrayOfENSecundarios" minOccurs="0"/>
 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENInformacionGuia", propOrder = {
    "puntoLlegada",
    "puntoPartida",
    "transportistaCodigo",
    "transportistaRuc",
    "transportista",
    "nroLicencia",
    "vehiculoMarca",
    "vehiculoConstanciaInscripcion",
    "vehiculoPlaca",
    "modalidadTransporte",
    "transportistaDireccion",
    "totalPesoBruto",
    "unidadPesoBruto",
    "codigoMotivoTraslado",
    "fechaInicio",
    "registroMTC",
    "subContratacion",
    "secundarios",
    "numeroDocumento",
    "codigoTipoDocumento"
})
public class ENInformacionGuia {

    @XmlElement(name = "PuntoLlegada")
    protected ENPuntoLlegada puntoLlegada;
    @XmlElement(name = "PuntoPartida")
    protected ENPuntoPartida puntoPartida;
    @XmlElement(name = "TransportistaCodigo")
    protected String transportistaCodigo;
    @XmlElement(name = "TransportistaRuc")
    protected String transportistaRuc;
    @XmlElement(name = "Transportista")
    protected String transportista;
    @XmlElement(name = "NroLicencia")
    protected String nroLicencia;
    @XmlElement(name = "VehiculoMarca")
    protected String vehiculoMarca;
    @XmlElement(name = "VehiculoConstanciaInscripcion")
    protected String vehiculoConstanciaInscripcion;
    @XmlElement(name = "VehiculoPlaca")
    protected String vehiculoPlaca;
    @XmlElement(name = "ModalidadTransporte")
    protected String modalidadTransporte;
    @XmlElement(name = "TransportistaDireccion")
    protected String transportistaDireccion;
    @XmlElement(name = "TotalPesoBruto")
    protected double totalPesoBruto;
    @XmlElement(name = "UnidadPesoBruto")
    protected String unidadPesoBruto;
    @XmlElement(name = "CodigoMotivoTraslado")
    protected String codigoMotivoTraslado;
    @XmlElement(name = "FechaInicio")
    protected String fechaInicio;
    @XmlElement(name = "RegistroMTC")
    protected String registroMTC;
    @XmlElement(name = "SubContratacion")
    protected int subContratacion;
    @XmlElement(name = "Secundarios")
    protected ArrayOfENSecundarios secundarios;
    @XmlElement(name = "NumeroDocumento")
    protected String numeroDocumento;
    @XmlElement(name = "CodigoTipoDocumento")
    protected String codigoTipoDocumento;

    /**
     * Obtiene el valor de la propiedad puntoLlegada.
     * 
     * @return
     *     possible object is
     *     {@link ENPuntoLlegada }
     *     
     */
    public ENPuntoLlegada getPuntoLlegada() {
        return puntoLlegada;
    }

    /**
     * Define el valor de la propiedad puntoLlegada.
     * 
     * @param value
     *     allowed object is
     *     {@link ENPuntoLlegada }
     *     
     */
    public void setPuntoLlegada(ENPuntoLlegada value) {
        this.puntoLlegada = value;
    }

    /**
     * Obtiene el valor de la propiedad puntoPartida.
     * 
     * @return
     *     possible object is
     *     {@link ENPuntoPartida }
     *     
     */
    public ENPuntoPartida getPuntoPartida() {
        return puntoPartida;
    }

    /**
     * Define el valor de la propiedad puntoPartida.
     * 
     * @param value
     *     allowed object is
     *     {@link ENPuntoPartida }
     *     
     */
    public void setPuntoPartida(ENPuntoPartida value) {
        this.puntoPartida = value;
    }

    /**
     * Obtiene el valor de la propiedad transportistaCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportistaCodigo() {
        return transportistaCodigo;
    }

    /**
     * Define el valor de la propiedad transportistaCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportistaCodigo(String value) {
        this.transportistaCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad transportistaRuc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportistaRuc() {
        return transportistaRuc;
    }

    /**
     * Define el valor de la propiedad transportistaRuc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportistaRuc(String value) {
        this.transportistaRuc = value;
    }

    /**
     * Obtiene el valor de la propiedad transportista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportista() {
        return transportista;
    }

    /**
     * Define el valor de la propiedad transportista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportista(String value) {
        this.transportista = value;
    }

    /**
     * Obtiene el valor de la propiedad nroLicencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroLicencia() {
        return nroLicencia;
    }

    /**
     * Define el valor de la propiedad nroLicencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroLicencia(String value) {
        this.nroLicencia = value;
    }

    /**
     * Obtiene el valor de la propiedad vehiculoMarca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehiculoMarca() {
        return vehiculoMarca;
    }

    /**
     * Define el valor de la propiedad vehiculoMarca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehiculoMarca(String value) {
        this.vehiculoMarca = value;
    }

    /**
     * Obtiene el valor de la propiedad vehiculoConstanciaInscripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehiculoConstanciaInscripcion() {
        return vehiculoConstanciaInscripcion;
    }

    /**
     * Define el valor de la propiedad vehiculoConstanciaInscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehiculoConstanciaInscripcion(String value) {
        this.vehiculoConstanciaInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad vehiculoPlaca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehiculoPlaca() {
        return vehiculoPlaca;
    }

    /**
     * Define el valor de la propiedad vehiculoPlaca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehiculoPlaca(String value) {
        this.vehiculoPlaca = value;
    }

    /**
     * Obtiene el valor de la propiedad modalidadTransporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModalidadTransporte() {
        return modalidadTransporte;
    }

    /**
     * Define el valor de la propiedad modalidadTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModalidadTransporte(String value) {
        this.modalidadTransporte = value;
    }

    /**
     * Obtiene el valor de la propiedad transportistaDireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportistaDireccion() {
        return transportistaDireccion;
    }

    /**
     * Define el valor de la propiedad transportistaDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportistaDireccion(String value) {
        this.transportistaDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPesoBruto.
     * 
     */
    public double getTotalPesoBruto() {
        return totalPesoBruto;
    }

    /**
     * Define el valor de la propiedad totalPesoBruto.
     * 
     */
    public void setTotalPesoBruto(double value) {
        this.totalPesoBruto = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadPesoBruto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadPesoBruto() {
        return unidadPesoBruto;
    }

    /**
     * Define el valor de la propiedad unidadPesoBruto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadPesoBruto(String value) {
        this.unidadPesoBruto = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMotivoTraslado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMotivoTraslado() {
        return codigoMotivoTraslado;
    }

    /**
     * Define el valor de la propiedad codigoMotivoTraslado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMotivoTraslado(String value) {
        this.codigoMotivoTraslado = value;
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
     * Obtiene el valor de la propiedad registroMTC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistroMTC() {
        return registroMTC;
    }

    /**
     * Define el valor de la propiedad registroMTC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistroMTC(String value) {
        this.registroMTC = value;
    }

    /**
     * Obtiene el valor de la propiedad subContratacion.
     * 
     */
    public int getSubContratacion() {
        return subContratacion;
    }

    /**
     * Define el valor de la propiedad subContratacion.
     * 
     */
    public void setSubContratacion(int value) {
        this.subContratacion = value;
    }

    /**
     * Obtiene el valor de la propiedad secundarios.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENSecundarios }
     *     
     */
    public ArrayOfENSecundarios getSecundarios() {
        return secundarios;
    }

    /**
     * Define el valor de la propiedad secundarios.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENSecundarios }
     *     
     */
    public void setSecundarios(ArrayOfENSecundarios value) {
        this.secundarios = value;
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

}
