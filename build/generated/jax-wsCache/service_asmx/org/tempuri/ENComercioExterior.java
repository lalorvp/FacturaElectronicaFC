
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ENComercioExterior complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENComercioExterior">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Linea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Viaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Consignatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Volumen" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VolumenUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RepresentanteAgente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgenciaAduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgAduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoCarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manifiesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sunad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Poliza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoGuia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Lote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aerolinea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncotermBase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescripcionMercaderia" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="FechaExportacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IncotermDetalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CondicionCartaFianza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroCartaFianza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoEmbarque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CantidadUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TamanhoMercaderia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TamanhoMercaderiaUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackingList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManejoCarga" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="paleta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bobina" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Proforma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Operador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Incoterm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BancoIntermediador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CondicionVenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Asegurador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PuertoDesembarque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PuertoEmbarque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Embarcacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdComercioExterior" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PesoBrutoUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PesoBruto" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NumeroConfirmacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Marcas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flete" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Seguro" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ReferenciaExportacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoPuertoEmbarque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoPuertoDesembarque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PesoNetoUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PesoNeto" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Indicador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroBL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaEmbarque" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Partida" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Llegada" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Eslora" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InicioEmbarque" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TerminoDesembarqueNave" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ToneladaRegistroBruto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoViaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstimadoTiempoArribo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="BKNG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Concepto" type="{http://tempuri.org/}ArrayOfENConcepto" minOccurs="0"/>
 *         &lt;element name="GastosDespacho" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="GastosDestino" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="GuiaMAWB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuiaHAWB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacturaComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FOB" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CIF" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NumeroOrdenAduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MawbMbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HawbHbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaServicio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LineaAerolinea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroBooking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contenedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorReferencial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bultos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Regimen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENComercioExterior", propOrder = {
    "linea",
    "viaje",
    "consignatario",
    "volumen",
    "volumenUnidad",
    "representanteAgente",
    "agenciaAduana",
    "agAduana",
    "tipoCarga",
    "dias",
    "manifiesto",
    "sunad",
    "poliza",
    "codigoGuia",
    "fecha",
    "lote",
    "aerolinea",
    "incotermBase",
    "descripcionMercaderia",
    "fechaExportacion",
    "incotermDetalle",
    "condicionCartaFianza",
    "numeroCartaFianza",
    "tipoEmbarque",
    "cantidadUnidad",
    "tamanhoMercaderia",
    "tamanhoMercaderiaUnidad",
    "packingList",
    "manejoCarga",
    "paleta",
    "bobina",
    "cantidad",
    "proforma",
    "operador",
    "incoterm",
    "bancoIntermediador",
    "condicionVenta",
    "asegurador",
    "puertoDesembarque",
    "puertoEmbarque",
    "embarcacion",
    "idComercioExterior",
    "pesoBrutoUnidad",
    "pesoBruto",
    "numeroConfirmacion",
    "marcas",
    "flete",
    "seguro",
    "referenciaExportacion",
    "codigoPuertoEmbarque",
    "codigoPuertoDesembarque",
    "pesoNetoUnidad",
    "pesoNeto",
    "indicador",
    "carrier",
    "numeroBL",
    "fechaEmbarque",
    "operacion",
    "partida",
    "llegada",
    "eslora",
    "inicioEmbarque",
    "terminoDesembarqueNave",
    "toneladaRegistroBruto",
    "codigoViaje",
    "estimadoTiempoArribo",
    "bkng",
    "concepto",
    "gastosDespacho",
    "gastosDestino",
    "guiaMAWB",
    "guiaHAWB",
    "facturaComercial",
    "nave",
    "fob",
    "cif",
    "numeroOrdenAduana",
    "mawbMbl",
    "hawbHbl",
    "fechaServicio",
    "lineaAerolinea",
    "numeroBooking",
    "contenedor",
    "valorReferencial",
    "dua",
    "bultos",
    "regimen"
})
public class ENComercioExterior {

    @XmlElement(name = "Linea")
    protected String linea;
    @XmlElement(name = "Viaje")
    protected String viaje;
    @XmlElement(name = "Consignatario")
    protected String consignatario;
    @XmlElement(name = "Volumen")
    protected double volumen;
    @XmlElement(name = "VolumenUnidad")
    protected String volumenUnidad;
    @XmlElement(name = "RepresentanteAgente")
    protected String representanteAgente;
    @XmlElement(name = "AgenciaAduana")
    protected String agenciaAduana;
    @XmlElement(name = "AgAduana")
    protected String agAduana;
    @XmlElement(name = "TipoCarga")
    protected String tipoCarga;
    @XmlElement(name = "Dias")
    protected String dias;
    @XmlElement(name = "Manifiesto")
    protected String manifiesto;
    @XmlElement(name = "Sunad")
    protected String sunad;
    @XmlElement(name = "Poliza")
    protected String poliza;
    @XmlElement(name = "CodigoGuia")
    protected String codigoGuia;
    @XmlElement(name = "Fecha", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "Lote")
    protected String lote;
    @XmlElement(name = "Aerolinea")
    protected String aerolinea;
    @XmlElement(name = "IncotermBase")
    protected String incotermBase;
    @XmlElement(name = "DescripcionMercaderia")
    protected ArrayOfString descripcionMercaderia;
    @XmlElement(name = "FechaExportacion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaExportacion;
    @XmlElement(name = "IncotermDetalle")
    protected String incotermDetalle;
    @XmlElement(name = "CondicionCartaFianza")
    protected String condicionCartaFianza;
    @XmlElement(name = "NumeroCartaFianza")
    protected String numeroCartaFianza;
    @XmlElement(name = "TipoEmbarque")
    protected String tipoEmbarque;
    @XmlElement(name = "CantidadUnidad")
    protected String cantidadUnidad;
    @XmlElement(name = "TamanhoMercaderia")
    protected double tamanhoMercaderia;
    @XmlElement(name = "TamanhoMercaderiaUnidad")
    protected String tamanhoMercaderiaUnidad;
    @XmlElement(name = "PackingList")
    protected String packingList;
    @XmlElement(name = "ManejoCarga")
    protected double manejoCarga;
    protected int paleta;
    protected int bobina;
    protected double cantidad;
    @XmlElement(name = "Proforma")
    protected String proforma;
    @XmlElement(name = "Operador")
    protected String operador;
    @XmlElement(name = "Incoterm")
    protected String incoterm;
    @XmlElement(name = "BancoIntermediador")
    protected String bancoIntermediador;
    @XmlElement(name = "CondicionVenta")
    protected String condicionVenta;
    @XmlElement(name = "Asegurador")
    protected String asegurador;
    @XmlElement(name = "PuertoDesembarque")
    protected String puertoDesembarque;
    @XmlElement(name = "PuertoEmbarque")
    protected String puertoEmbarque;
    @XmlElement(name = "Embarcacion")
    protected String embarcacion;
    @XmlElement(name = "IdComercioExterior")
    protected int idComercioExterior;
    @XmlElement(name = "PesoBrutoUnidad")
    protected String pesoBrutoUnidad;
    @XmlElement(name = "PesoBruto", required = true)
    protected BigDecimal pesoBruto;
    @XmlElement(name = "NumeroConfirmacion")
    protected String numeroConfirmacion;
    @XmlElement(name = "Marcas")
    protected String marcas;
    @XmlElement(name = "Flete", required = true)
    protected BigDecimal flete;
    @XmlElement(name = "Seguro", required = true)
    protected BigDecimal seguro;
    @XmlElement(name = "ReferenciaExportacion")
    protected String referenciaExportacion;
    @XmlElement(name = "CodigoPuertoEmbarque")
    protected String codigoPuertoEmbarque;
    @XmlElement(name = "CodigoPuertoDesembarque")
    protected String codigoPuertoDesembarque;
    @XmlElement(name = "PesoNetoUnidad")
    protected String pesoNetoUnidad;
    @XmlElement(name = "PesoNeto", required = true)
    protected BigDecimal pesoNeto;
    @XmlElement(name = "Indicador")
    protected String indicador;
    @XmlElement(name = "Carrier")
    protected String carrier;
    @XmlElement(name = "NumeroBL")
    protected String numeroBL;
    @XmlElement(name = "FechaEmbarque", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEmbarque;
    @XmlElement(name = "Operacion")
    protected String operacion;
    @XmlElement(name = "Partida", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar partida;
    @XmlElement(name = "Llegada", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar llegada;
    @XmlElement(name = "Eslora")
    protected double eslora;
    @XmlElement(name = "InicioEmbarque", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inicioEmbarque;
    @XmlElement(name = "TerminoDesembarqueNave", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar terminoDesembarqueNave;
    @XmlElement(name = "ToneladaRegistroBruto")
    protected String toneladaRegistroBruto;
    @XmlElement(name = "CodigoViaje")
    protected String codigoViaje;
    @XmlElement(name = "EstimadoTiempoArribo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimadoTiempoArribo;
    @XmlElement(name = "BKNG")
    protected String bkng;
    @XmlElement(name = "Concepto")
    protected ArrayOfENConcepto concepto;
    @XmlElement(name = "GastosDespacho")
    protected double gastosDespacho;
    @XmlElement(name = "GastosDestino")
    protected double gastosDestino;
    @XmlElement(name = "GuiaMAWB")
    protected String guiaMAWB;
    @XmlElement(name = "GuiaHAWB")
    protected String guiaHAWB;
    @XmlElement(name = "FacturaComercial")
    protected String facturaComercial;
    @XmlElement(name = "Nave")
    protected String nave;
    @XmlElement(name = "FOB")
    protected double fob;
    @XmlElement(name = "CIF")
    protected double cif;
    @XmlElement(name = "NumeroOrdenAduana")
    protected String numeroOrdenAduana;
    @XmlElement(name = "MawbMbl")
    protected String mawbMbl;
    @XmlElement(name = "HawbHbl")
    protected String hawbHbl;
    @XmlElement(name = "FechaServicio", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaServicio;
    @XmlElement(name = "LineaAerolinea")
    protected String lineaAerolinea;
    @XmlElement(name = "NumeroBooking")
    protected String numeroBooking;
    @XmlElement(name = "Contenedor")
    protected String contenedor;
    @XmlElement(name = "ValorReferencial")
    protected String valorReferencial;
    @XmlElement(name = "DUA")
    protected String dua;
    @XmlElement(name = "Bultos")
    protected String bultos;
    @XmlElement(name = "Regimen")
    protected String regimen;

    /**
     * Obtiene el valor de la propiedad linea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Define el valor de la propiedad linea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinea(String value) {
        this.linea = value;
    }

    /**
     * Obtiene el valor de la propiedad viaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaje() {
        return viaje;
    }

    /**
     * Define el valor de la propiedad viaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaje(String value) {
        this.viaje = value;
    }

    /**
     * Obtiene el valor de la propiedad consignatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignatario() {
        return consignatario;
    }

    /**
     * Define el valor de la propiedad consignatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignatario(String value) {
        this.consignatario = value;
    }

    /**
     * Obtiene el valor de la propiedad volumen.
     * 
     */
    public double getVolumen() {
        return volumen;
    }

    /**
     * Define el valor de la propiedad volumen.
     * 
     */
    public void setVolumen(double value) {
        this.volumen = value;
    }

    /**
     * Obtiene el valor de la propiedad volumenUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumenUnidad() {
        return volumenUnidad;
    }

    /**
     * Define el valor de la propiedad volumenUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumenUnidad(String value) {
        this.volumenUnidad = value;
    }

    /**
     * Obtiene el valor de la propiedad representanteAgente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentanteAgente() {
        return representanteAgente;
    }

    /**
     * Define el valor de la propiedad representanteAgente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentanteAgente(String value) {
        this.representanteAgente = value;
    }

    /**
     * Obtiene el valor de la propiedad agenciaAduana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgenciaAduana() {
        return agenciaAduana;
    }

    /**
     * Define el valor de la propiedad agenciaAduana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgenciaAduana(String value) {
        this.agenciaAduana = value;
    }

    /**
     * Obtiene el valor de la propiedad agAduana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgAduana() {
        return agAduana;
    }

    /**
     * Define el valor de la propiedad agAduana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgAduana(String value) {
        this.agAduana = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCarga() {
        return tipoCarga;
    }

    /**
     * Define el valor de la propiedad tipoCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCarga(String value) {
        this.tipoCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad dias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDias() {
        return dias;
    }

    /**
     * Define el valor de la propiedad dias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDias(String value) {
        this.dias = value;
    }

    /**
     * Obtiene el valor de la propiedad manifiesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManifiesto() {
        return manifiesto;
    }

    /**
     * Define el valor de la propiedad manifiesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManifiesto(String value) {
        this.manifiesto = value;
    }

    /**
     * Obtiene el valor de la propiedad sunad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSunad() {
        return sunad;
    }

    /**
     * Define el valor de la propiedad sunad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSunad(String value) {
        this.sunad = value;
    }

    /**
     * Obtiene el valor de la propiedad poliza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliza() {
        return poliza;
    }

    /**
     * Define el valor de la propiedad poliza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliza(String value) {
        this.poliza = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoGuia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoGuia() {
        return codigoGuia;
    }

    /**
     * Define el valor de la propiedad codigoGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoGuia(String value) {
        this.codigoGuia = value;
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
     * Obtiene el valor de la propiedad lote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLote() {
        return lote;
    }

    /**
     * Define el valor de la propiedad lote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLote(String value) {
        this.lote = value;
    }

    /**
     * Obtiene el valor de la propiedad aerolinea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAerolinea() {
        return aerolinea;
    }

    /**
     * Define el valor de la propiedad aerolinea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAerolinea(String value) {
        this.aerolinea = value;
    }

    /**
     * Obtiene el valor de la propiedad incotermBase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncotermBase() {
        return incotermBase;
    }

    /**
     * Define el valor de la propiedad incotermBase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncotermBase(String value) {
        this.incotermBase = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionMercaderia.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getDescripcionMercaderia() {
        return descripcionMercaderia;
    }

    /**
     * Define el valor de la propiedad descripcionMercaderia.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setDescripcionMercaderia(ArrayOfString value) {
        this.descripcionMercaderia = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExportacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaExportacion() {
        return fechaExportacion;
    }

    /**
     * Define el valor de la propiedad fechaExportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaExportacion(XMLGregorianCalendar value) {
        this.fechaExportacion = value;
    }

    /**
     * Obtiene el valor de la propiedad incotermDetalle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncotermDetalle() {
        return incotermDetalle;
    }

    /**
     * Define el valor de la propiedad incotermDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncotermDetalle(String value) {
        this.incotermDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad condicionCartaFianza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondicionCartaFianza() {
        return condicionCartaFianza;
    }

    /**
     * Define el valor de la propiedad condicionCartaFianza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondicionCartaFianza(String value) {
        this.condicionCartaFianza = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCartaFianza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCartaFianza() {
        return numeroCartaFianza;
    }

    /**
     * Define el valor de la propiedad numeroCartaFianza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCartaFianza(String value) {
        this.numeroCartaFianza = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEmbarque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEmbarque() {
        return tipoEmbarque;
    }

    /**
     * Define el valor de la propiedad tipoEmbarque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEmbarque(String value) {
        this.tipoEmbarque = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadUnidad() {
        return cantidadUnidad;
    }

    /**
     * Define el valor de la propiedad cantidadUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadUnidad(String value) {
        this.cantidadUnidad = value;
    }

    /**
     * Obtiene el valor de la propiedad tamanhoMercaderia.
     * 
     */
    public double getTamanhoMercaderia() {
        return tamanhoMercaderia;
    }

    /**
     * Define el valor de la propiedad tamanhoMercaderia.
     * 
     */
    public void setTamanhoMercaderia(double value) {
        this.tamanhoMercaderia = value;
    }

    /**
     * Obtiene el valor de la propiedad tamanhoMercaderiaUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTamanhoMercaderiaUnidad() {
        return tamanhoMercaderiaUnidad;
    }

    /**
     * Define el valor de la propiedad tamanhoMercaderiaUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTamanhoMercaderiaUnidad(String value) {
        this.tamanhoMercaderiaUnidad = value;
    }

    /**
     * Obtiene el valor de la propiedad packingList.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackingList() {
        return packingList;
    }

    /**
     * Define el valor de la propiedad packingList.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackingList(String value) {
        this.packingList = value;
    }

    /**
     * Obtiene el valor de la propiedad manejoCarga.
     * 
     */
    public double getManejoCarga() {
        return manejoCarga;
    }

    /**
     * Define el valor de la propiedad manejoCarga.
     * 
     */
    public void setManejoCarga(double value) {
        this.manejoCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad paleta.
     * 
     */
    public int getPaleta() {
        return paleta;
    }

    /**
     * Define el valor de la propiedad paleta.
     * 
     */
    public void setPaleta(int value) {
        this.paleta = value;
    }

    /**
     * Obtiene el valor de la propiedad bobina.
     * 
     */
    public int getBobina() {
        return bobina;
    }

    /**
     * Define el valor de la propiedad bobina.
     * 
     */
    public void setBobina(int value) {
        this.bobina = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(double value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad proforma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProforma() {
        return proforma;
    }

    /**
     * Define el valor de la propiedad proforma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProforma(String value) {
        this.proforma = value;
    }

    /**
     * Obtiene el valor de la propiedad operador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperador() {
        return operador;
    }

    /**
     * Define el valor de la propiedad operador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperador(String value) {
        this.operador = value;
    }

    /**
     * Obtiene el valor de la propiedad incoterm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncoterm() {
        return incoterm;
    }

    /**
     * Define el valor de la propiedad incoterm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncoterm(String value) {
        this.incoterm = value;
    }

    /**
     * Obtiene el valor de la propiedad bancoIntermediador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBancoIntermediador() {
        return bancoIntermediador;
    }

    /**
     * Define el valor de la propiedad bancoIntermediador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBancoIntermediador(String value) {
        this.bancoIntermediador = value;
    }

    /**
     * Obtiene el valor de la propiedad condicionVenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondicionVenta() {
        return condicionVenta;
    }

    /**
     * Define el valor de la propiedad condicionVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondicionVenta(String value) {
        this.condicionVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad asegurador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsegurador() {
        return asegurador;
    }

    /**
     * Define el valor de la propiedad asegurador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsegurador(String value) {
        this.asegurador = value;
    }

    /**
     * Obtiene el valor de la propiedad puertoDesembarque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPuertoDesembarque() {
        return puertoDesembarque;
    }

    /**
     * Define el valor de la propiedad puertoDesembarque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPuertoDesembarque(String value) {
        this.puertoDesembarque = value;
    }

    /**
     * Obtiene el valor de la propiedad puertoEmbarque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPuertoEmbarque() {
        return puertoEmbarque;
    }

    /**
     * Define el valor de la propiedad puertoEmbarque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPuertoEmbarque(String value) {
        this.puertoEmbarque = value;
    }

    /**
     * Obtiene el valor de la propiedad embarcacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbarcacion() {
        return embarcacion;
    }

    /**
     * Define el valor de la propiedad embarcacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbarcacion(String value) {
        this.embarcacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idComercioExterior.
     * 
     */
    public int getIdComercioExterior() {
        return idComercioExterior;
    }

    /**
     * Define el valor de la propiedad idComercioExterior.
     * 
     */
    public void setIdComercioExterior(int value) {
        this.idComercioExterior = value;
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

    /**
     * Obtiene el valor de la propiedad numeroConfirmacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroConfirmacion() {
        return numeroConfirmacion;
    }

    /**
     * Define el valor de la propiedad numeroConfirmacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroConfirmacion(String value) {
        this.numeroConfirmacion = value;
    }

    /**
     * Obtiene el valor de la propiedad marcas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcas() {
        return marcas;
    }

    /**
     * Define el valor de la propiedad marcas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcas(String value) {
        this.marcas = value;
    }

    /**
     * Obtiene el valor de la propiedad flete.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlete() {
        return flete;
    }

    /**
     * Define el valor de la propiedad flete.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlete(BigDecimal value) {
        this.flete = value;
    }

    /**
     * Obtiene el valor de la propiedad seguro.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeguro() {
        return seguro;
    }

    /**
     * Define el valor de la propiedad seguro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeguro(BigDecimal value) {
        this.seguro = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaExportacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaExportacion() {
        return referenciaExportacion;
    }

    /**
     * Define el valor de la propiedad referenciaExportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaExportacion(String value) {
        this.referenciaExportacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPuertoEmbarque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPuertoEmbarque() {
        return codigoPuertoEmbarque;
    }

    /**
     * Define el valor de la propiedad codigoPuertoEmbarque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPuertoEmbarque(String value) {
        this.codigoPuertoEmbarque = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPuertoDesembarque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPuertoDesembarque() {
        return codigoPuertoDesembarque;
    }

    /**
     * Define el valor de la propiedad codigoPuertoDesembarque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPuertoDesembarque(String value) {
        this.codigoPuertoDesembarque = value;
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
     * Obtiene el valor de la propiedad indicador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicador() {
        return indicador;
    }

    /**
     * Define el valor de la propiedad indicador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicador(String value) {
        this.indicador = value;
    }

    /**
     * Obtiene el valor de la propiedad carrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Define el valor de la propiedad carrier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroBL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroBL() {
        return numeroBL;
    }

    /**
     * Define el valor de la propiedad numeroBL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroBL(String value) {
        this.numeroBL = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmbarque.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEmbarque() {
        return fechaEmbarque;
    }

    /**
     * Define el valor de la propiedad fechaEmbarque.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEmbarque(XMLGregorianCalendar value) {
        this.fechaEmbarque = value;
    }

    /**
     * Obtiene el valor de la propiedad operacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Define el valor de la propiedad operacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperacion(String value) {
        this.operacion = value;
    }

    /**
     * Obtiene el valor de la propiedad partida.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPartida() {
        return partida;
    }

    /**
     * Define el valor de la propiedad partida.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPartida(XMLGregorianCalendar value) {
        this.partida = value;
    }

    /**
     * Obtiene el valor de la propiedad llegada.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLlegada() {
        return llegada;
    }

    /**
     * Define el valor de la propiedad llegada.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLlegada(XMLGregorianCalendar value) {
        this.llegada = value;
    }

    /**
     * Obtiene el valor de la propiedad eslora.
     * 
     */
    public double getEslora() {
        return eslora;
    }

    /**
     * Define el valor de la propiedad eslora.
     * 
     */
    public void setEslora(double value) {
        this.eslora = value;
    }

    /**
     * Obtiene el valor de la propiedad inicioEmbarque.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInicioEmbarque() {
        return inicioEmbarque;
    }

    /**
     * Define el valor de la propiedad inicioEmbarque.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInicioEmbarque(XMLGregorianCalendar value) {
        this.inicioEmbarque = value;
    }

    /**
     * Obtiene el valor de la propiedad terminoDesembarqueNave.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminoDesembarqueNave() {
        return terminoDesembarqueNave;
    }

    /**
     * Define el valor de la propiedad terminoDesembarqueNave.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminoDesembarqueNave(XMLGregorianCalendar value) {
        this.terminoDesembarqueNave = value;
    }

    /**
     * Obtiene el valor de la propiedad toneladaRegistroBruto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToneladaRegistroBruto() {
        return toneladaRegistroBruto;
    }

    /**
     * Define el valor de la propiedad toneladaRegistroBruto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToneladaRegistroBruto(String value) {
        this.toneladaRegistroBruto = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoViaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoViaje() {
        return codigoViaje;
    }

    /**
     * Define el valor de la propiedad codigoViaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoViaje(String value) {
        this.codigoViaje = value;
    }

    /**
     * Obtiene el valor de la propiedad estimadoTiempoArribo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimadoTiempoArribo() {
        return estimadoTiempoArribo;
    }

    /**
     * Define el valor de la propiedad estimadoTiempoArribo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimadoTiempoArribo(XMLGregorianCalendar value) {
        this.estimadoTiempoArribo = value;
    }

    /**
     * Obtiene el valor de la propiedad bkng.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBKNG() {
        return bkng;
    }

    /**
     * Define el valor de la propiedad bkng.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBKNG(String value) {
        this.bkng = value;
    }

    /**
     * Obtiene el valor de la propiedad concepto.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENConcepto }
     *     
     */
    public ArrayOfENConcepto getConcepto() {
        return concepto;
    }

    /**
     * Define el valor de la propiedad concepto.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENConcepto }
     *     
     */
    public void setConcepto(ArrayOfENConcepto value) {
        this.concepto = value;
    }

    /**
     * Obtiene el valor de la propiedad gastosDespacho.
     * 
     */
    public double getGastosDespacho() {
        return gastosDespacho;
    }

    /**
     * Define el valor de la propiedad gastosDespacho.
     * 
     */
    public void setGastosDespacho(double value) {
        this.gastosDespacho = value;
    }

    /**
     * Obtiene el valor de la propiedad gastosDestino.
     * 
     */
    public double getGastosDestino() {
        return gastosDestino;
    }

    /**
     * Define el valor de la propiedad gastosDestino.
     * 
     */
    public void setGastosDestino(double value) {
        this.gastosDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad guiaMAWB.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuiaMAWB() {
        return guiaMAWB;
    }

    /**
     * Define el valor de la propiedad guiaMAWB.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuiaMAWB(String value) {
        this.guiaMAWB = value;
    }

    /**
     * Obtiene el valor de la propiedad guiaHAWB.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuiaHAWB() {
        return guiaHAWB;
    }

    /**
     * Define el valor de la propiedad guiaHAWB.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuiaHAWB(String value) {
        this.guiaHAWB = value;
    }

    /**
     * Obtiene el valor de la propiedad facturaComercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacturaComercial() {
        return facturaComercial;
    }

    /**
     * Define el valor de la propiedad facturaComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacturaComercial(String value) {
        this.facturaComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad nave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNave() {
        return nave;
    }

    /**
     * Define el valor de la propiedad nave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNave(String value) {
        this.nave = value;
    }

    /**
     * Obtiene el valor de la propiedad fob.
     * 
     */
    public double getFOB() {
        return fob;
    }

    /**
     * Define el valor de la propiedad fob.
     * 
     */
    public void setFOB(double value) {
        this.fob = value;
    }

    /**
     * Obtiene el valor de la propiedad cif.
     * 
     */
    public double getCIF() {
        return cif;
    }

    /**
     * Define el valor de la propiedad cif.
     * 
     */
    public void setCIF(double value) {
        this.cif = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroOrdenAduana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroOrdenAduana() {
        return numeroOrdenAduana;
    }

    /**
     * Define el valor de la propiedad numeroOrdenAduana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroOrdenAduana(String value) {
        this.numeroOrdenAduana = value;
    }

    /**
     * Obtiene el valor de la propiedad mawbMbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMawbMbl() {
        return mawbMbl;
    }

    /**
     * Define el valor de la propiedad mawbMbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMawbMbl(String value) {
        this.mawbMbl = value;
    }

    /**
     * Obtiene el valor de la propiedad hawbHbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHawbHbl() {
        return hawbHbl;
    }

    /**
     * Define el valor de la propiedad hawbHbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHawbHbl(String value) {
        this.hawbHbl = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaServicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaServicio() {
        return fechaServicio;
    }

    /**
     * Define el valor de la propiedad fechaServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaServicio(XMLGregorianCalendar value) {
        this.fechaServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad lineaAerolinea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineaAerolinea() {
        return lineaAerolinea;
    }

    /**
     * Define el valor de la propiedad lineaAerolinea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineaAerolinea(String value) {
        this.lineaAerolinea = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroBooking.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroBooking() {
        return numeroBooking;
    }

    /**
     * Define el valor de la propiedad numeroBooking.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroBooking(String value) {
        this.numeroBooking = value;
    }

    /**
     * Obtiene el valor de la propiedad contenedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContenedor() {
        return contenedor;
    }

    /**
     * Define el valor de la propiedad contenedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContenedor(String value) {
        this.contenedor = value;
    }

    /**
     * Obtiene el valor de la propiedad valorReferencial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorReferencial() {
        return valorReferencial;
    }

    /**
     * Define el valor de la propiedad valorReferencial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorReferencial(String value) {
        this.valorReferencial = value;
    }

    /**
     * Obtiene el valor de la propiedad dua.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUA() {
        return dua;
    }

    /**
     * Define el valor de la propiedad dua.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUA(String value) {
        this.dua = value;
    }

    /**
     * Obtiene el valor de la propiedad bultos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBultos() {
        return bultos;
    }

    /**
     * Define el valor de la propiedad bultos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBultos(String value) {
        this.bultos = value;
    }

    /**
     * Obtiene el valor de la propiedad regimen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimen() {
        return regimen;
    }

    /**
     * Define el valor de la propiedad regimen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimen(String value) {
        this.regimen = value;
    }

}
