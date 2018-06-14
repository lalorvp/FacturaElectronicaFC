
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ENComprobanteDetalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENComprobanteDetalle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BultoUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bulto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CodigoAlmacenItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuiaRemision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdenProduccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Estilo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Modelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdComprobanteDetalle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdComprobante" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Item" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MultiDescripcion" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorVentaUnitario" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="UnidadComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorVentaUnitarioIncIgv" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CodigoTipoPrecio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Determinante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComprobanteDetalleImpuestos" type="{http://tempuri.org/}ArrayOfENComprobanteDetalleImpuestos" minOccurs="0"/>
 *         &lt;element name="DescuentoCargoDetalle" type="{http://tempuri.org/}ArrayOfENDescuentoCargoDetalle" minOccurs="0"/>
 *         &lt;element name="ComprobanteComercioExteriorDetalle" type="{http://tempuri.org/}ArrayOfENComercioExteriorDetalle" minOccurs="0"/>
 *         &lt;element name="Nota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescuentoIncIgv" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PrecioVentaItem" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PorcentajeDescuento" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PesoNeto" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ImporteBrutoItem" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NumeroDeterminado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdenFabricacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdenCompraCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescuentoCargoDetalleIGV" type="{http://tempuri.org/}ArrayOfENDescuentoCargoDetalleIGV" minOccurs="0"/>
 *         &lt;element name="BaseComision" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Costo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Comision" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Poliza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrigenDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UnidadMedidaEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InformacionAdicional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaCaducidad" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Sku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlosaLibreDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoProductoSunat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoProductoGS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImpuestoTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TransportePasajero" type="{http://tempuri.org/}ENTransportePasajero" minOccurs="0"/>
 *         &lt;element name="InformacionAdicionalDetalle" type="{http://tempuri.org/}ENInformacionAdicionalDetalle" minOccurs="0"/>
 *         &lt;element name="HidrobiologicoItem" type="{http://tempuri.org/}ENHidrobiologicosItem" minOccurs="0"/>
 *         &lt;element name="DetraccionCarga" type="{http://tempuri.org/}ENDetraccionCarga" minOccurs="0"/>
 *         &lt;element name="DetraccionTramos" type="{http://tempuri.org/}ENDetraccionTramos" minOccurs="0"/>
 *         &lt;element name="DetraccionVehiculo" type="{http://tempuri.org/}ENDetraccionVehiculo" minOccurs="0"/>
 *         &lt;element name="HospedajeDetalle" type="{http://tempuri.org/}ENHospedajeDetalle" minOccurs="0"/>
 *         &lt;element name="Turismo" type="{http://tempuri.org/}ENTurismo" minOccurs="0"/>
 *         &lt;element name="VentasSectorPublico" type="{http://tempuri.org/}ENVentasSectorPublico" minOccurs="0"/>
 *         &lt;element name="GastosHipotecario" type="{http://tempuri.org/}ENGastosHipotecario" minOccurs="0"/>
 *         &lt;element name="CartaPorteAereoItem" type="{http://tempuri.org/}ENCartaPorteAereoItem" minOccurs="0"/>
 *         &lt;element name="PasajeroItem" type="{http://tempuri.org/}ENPasajeroItem" minOccurs="0"/>
 *         &lt;element name="RegaliaPetrolera" type="{http://tempuri.org/}ENRegaliaPetrolera" minOccurs="0"/>
 *         &lt;element name="EstructuraGTIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENComprobanteDetalle", propOrder = {
    "bultoUnidad",
    "bulto",
    "codigoAlmacenItem",
    "guiaRemision",
    "ordenProduccion",
    "estilo",
    "color",
    "modelo",
    "marca",
    "codigo",
    "idComprobanteDetalle",
    "idComprobante",
    "item",
    "cantidad",
    "total",
    "multiDescripcion",
    "descripcion",
    "valorVentaUnitario",
    "unidadComercial",
    "valorVentaUnitarioIncIgv",
    "codigoTipoPrecio",
    "determinante",
    "comprobanteDetalleImpuestos",
    "descuentoCargoDetalle",
    "comprobanteComercioExteriorDetalle",
    "nota",
    "descuentoIncIgv",
    "precioVentaItem",
    "porcentajeDescuento",
    "pesoNeto",
    "importeBrutoItem",
    "numeroDeterminado",
    "numReferencia",
    "ordenFabricacion",
    "ordenCompraCliente",
    "lote",
    "descuentoCargoDetalleIGV",
    "baseComision",
    "costo",
    "comision",
    "poliza",
    "origenDestino",
    "fecha",
    "unidadMedidaEmisor",
    "informacionAdicional",
    "fechaCaducidad",
    "sku",
    "glosaLibreDescripcion",
    "codigoProductoSunat",
    "codigoProductoGS1",
    "impuestoTotal",
    "transportePasajero",
    "informacionAdicionalDetalle",
    "hidrobiologicoItem",
    "detraccionCarga",
    "detraccionTramos",
    "detraccionVehiculo",
    "hospedajeDetalle",
    "turismo",
    "ventasSectorPublico",
    "gastosHipotecario",
    "cartaPorteAereoItem",
    "pasajeroItem",
    "regaliaPetrolera",
    "estructuraGTIN"
})
public class ENComprobanteDetalle {

    @XmlElement(name = "BultoUnidad")
    protected String bultoUnidad;
    @XmlElement(name = "Bulto")
    protected double bulto;
    @XmlElement(name = "CodigoAlmacenItem")
    protected String codigoAlmacenItem;
    @XmlElement(name = "GuiaRemision")
    protected String guiaRemision;
    @XmlElement(name = "OrdenProduccion")
    protected String ordenProduccion;
    @XmlElement(name = "Estilo")
    protected String estilo;
    @XmlElement(name = "Color")
    protected String color;
    @XmlElement(name = "Modelo")
    protected String modelo;
    @XmlElement(name = "Marca")
    protected String marca;
    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "IdComprobanteDetalle")
    protected int idComprobanteDetalle;
    @XmlElement(name = "IdComprobante")
    protected int idComprobante;
    @XmlElement(name = "Item")
    protected int item;
    @XmlElement(name = "Cantidad", required = true)
    protected BigDecimal cantidad;
    @XmlElement(name = "Total", required = true)
    protected BigDecimal total;
    @XmlElement(name = "MultiDescripcion")
    protected ArrayOfString multiDescripcion;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "ValorVentaUnitario", required = true)
    protected BigDecimal valorVentaUnitario;
    @XmlElement(name = "UnidadComercial")
    protected String unidadComercial;
    @XmlElement(name = "ValorVentaUnitarioIncIgv", required = true)
    protected BigDecimal valorVentaUnitarioIncIgv;
    @XmlElement(name = "CodigoTipoPrecio")
    protected String codigoTipoPrecio;
    @XmlElement(name = "Determinante")
    protected String determinante;
    @XmlElement(name = "ComprobanteDetalleImpuestos")
    protected ArrayOfENComprobanteDetalleImpuestos comprobanteDetalleImpuestos;
    @XmlElement(name = "DescuentoCargoDetalle")
    protected ArrayOfENDescuentoCargoDetalle descuentoCargoDetalle;
    @XmlElement(name = "ComprobanteComercioExteriorDetalle")
    protected ArrayOfENComercioExteriorDetalle comprobanteComercioExteriorDetalle;
    @XmlElement(name = "Nota")
    protected String nota;
    @XmlElement(name = "DescuentoIncIgv")
    protected double descuentoIncIgv;
    @XmlElement(name = "PrecioVentaItem")
    protected double precioVentaItem;
    @XmlElement(name = "PorcentajeDescuento")
    protected double porcentajeDescuento;
    @XmlElement(name = "PesoNeto", required = true)
    protected BigDecimal pesoNeto;
    @XmlElement(name = "ImporteBrutoItem", required = true)
    protected BigDecimal importeBrutoItem;
    @XmlElement(name = "NumeroDeterminado")
    protected String numeroDeterminado;
    @XmlElement(name = "NumReferencia")
    protected String numReferencia;
    @XmlElement(name = "OrdenFabricacion")
    protected String ordenFabricacion;
    @XmlElement(name = "OrdenCompraCliente")
    protected String ordenCompraCliente;
    @XmlElement(name = "Lote")
    protected String lote;
    @XmlElement(name = "DescuentoCargoDetalleIGV")
    protected ArrayOfENDescuentoCargoDetalleIGV descuentoCargoDetalleIGV;
    @XmlElement(name = "BaseComision", required = true)
    protected BigDecimal baseComision;
    @XmlElement(name = "Costo", required = true)
    protected BigDecimal costo;
    @XmlElement(name = "Comision", required = true)
    protected BigDecimal comision;
    @XmlElement(name = "Poliza")
    protected String poliza;
    @XmlElement(name = "OrigenDestino")
    protected String origenDestino;
    @XmlElement(name = "Fecha", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "UnidadMedidaEmisor")
    protected String unidadMedidaEmisor;
    @XmlElement(name = "InformacionAdicional")
    protected String informacionAdicional;
    @XmlElement(name = "FechaCaducidad", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCaducidad;
    @XmlElement(name = "Sku")
    protected String sku;
    @XmlElement(name = "GlosaLibreDescripcion")
    protected String glosaLibreDescripcion;
    @XmlElement(name = "CodigoProductoSunat")
    protected String codigoProductoSunat;
    @XmlElement(name = "CodigoProductoGS1")
    protected String codigoProductoGS1;
    @XmlElement(name = "ImpuestoTotal")
    protected double impuestoTotal;
    @XmlElement(name = "TransportePasajero")
    protected ENTransportePasajero transportePasajero;
    @XmlElement(name = "InformacionAdicionalDetalle")
    protected ENInformacionAdicionalDetalle informacionAdicionalDetalle;
    @XmlElement(name = "HidrobiologicoItem")
    protected ENHidrobiologicosItem hidrobiologicoItem;
    @XmlElement(name = "DetraccionCarga")
    protected ENDetraccionCarga detraccionCarga;
    @XmlElement(name = "DetraccionTramos")
    protected ENDetraccionTramos detraccionTramos;
    @XmlElement(name = "DetraccionVehiculo")
    protected ENDetraccionVehiculo detraccionVehiculo;
    @XmlElement(name = "HospedajeDetalle")
    protected ENHospedajeDetalle hospedajeDetalle;
    @XmlElement(name = "Turismo")
    protected ENTurismo turismo;
    @XmlElement(name = "VentasSectorPublico")
    protected ENVentasSectorPublico ventasSectorPublico;
    @XmlElement(name = "GastosHipotecario")
    protected ENGastosHipotecario gastosHipotecario;
    @XmlElement(name = "CartaPorteAereoItem")
    protected ENCartaPorteAereoItem cartaPorteAereoItem;
    @XmlElement(name = "PasajeroItem")
    protected ENPasajeroItem pasajeroItem;
    @XmlElement(name = "RegaliaPetrolera")
    protected ENRegaliaPetrolera regaliaPetrolera;
    @XmlElement(name = "EstructuraGTIN")
    protected String estructuraGTIN;

    /**
     * Obtiene el valor de la propiedad bultoUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBultoUnidad() {
        return bultoUnidad;
    }

    /**
     * Define el valor de la propiedad bultoUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBultoUnidad(String value) {
        this.bultoUnidad = value;
    }

    /**
     * Obtiene el valor de la propiedad bulto.
     * 
     */
    public double getBulto() {
        return bulto;
    }

    /**
     * Define el valor de la propiedad bulto.
     * 
     */
    public void setBulto(double value) {
        this.bulto = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoAlmacenItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAlmacenItem() {
        return codigoAlmacenItem;
    }

    /**
     * Define el valor de la propiedad codigoAlmacenItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAlmacenItem(String value) {
        this.codigoAlmacenItem = value;
    }

    /**
     * Obtiene el valor de la propiedad guiaRemision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuiaRemision() {
        return guiaRemision;
    }

    /**
     * Define el valor de la propiedad guiaRemision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuiaRemision(String value) {
        this.guiaRemision = value;
    }

    /**
     * Obtiene el valor de la propiedad ordenProduccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdenProduccion() {
        return ordenProduccion;
    }

    /**
     * Define el valor de la propiedad ordenProduccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdenProduccion(String value) {
        this.ordenProduccion = value;
    }

    /**
     * Obtiene el valor de la propiedad estilo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstilo() {
        return estilo;
    }

    /**
     * Define el valor de la propiedad estilo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstilo(String value) {
        this.estilo = value;
    }

    /**
     * Obtiene el valor de la propiedad color.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Define el valor de la propiedad color.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
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
     * Obtiene el valor de la propiedad item.
     * 
     */
    public int getItem() {
        return item;
    }

    /**
     * Define el valor de la propiedad item.
     * 
     */
    public void setItem(int value) {
        this.item = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCantidad(BigDecimal value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad multiDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getMultiDescripcion() {
        return multiDescripcion;
    }

    /**
     * Define el valor de la propiedad multiDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setMultiDescripcion(ArrayOfString value) {
        this.multiDescripcion = value;
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
     * Obtiene el valor de la propiedad valorVentaUnitario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorVentaUnitario() {
        return valorVentaUnitario;
    }

    /**
     * Define el valor de la propiedad valorVentaUnitario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorVentaUnitario(BigDecimal value) {
        this.valorVentaUnitario = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadComercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadComercial() {
        return unidadComercial;
    }

    /**
     * Define el valor de la propiedad unidadComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadComercial(String value) {
        this.unidadComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad valorVentaUnitarioIncIgv.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorVentaUnitarioIncIgv() {
        return valorVentaUnitarioIncIgv;
    }

    /**
     * Define el valor de la propiedad valorVentaUnitarioIncIgv.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorVentaUnitarioIncIgv(BigDecimal value) {
        this.valorVentaUnitarioIncIgv = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoPrecio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoPrecio() {
        return codigoTipoPrecio;
    }

    /**
     * Define el valor de la propiedad codigoTipoPrecio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoPrecio(String value) {
        this.codigoTipoPrecio = value;
    }

    /**
     * Obtiene el valor de la propiedad determinante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeterminante() {
        return determinante;
    }

    /**
     * Define el valor de la propiedad determinante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeterminante(String value) {
        this.determinante = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobanteDetalleImpuestos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComprobanteDetalleImpuestos }
     *     
     */
    public ArrayOfENComprobanteDetalleImpuestos getComprobanteDetalleImpuestos() {
        return comprobanteDetalleImpuestos;
    }

    /**
     * Define el valor de la propiedad comprobanteDetalleImpuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComprobanteDetalleImpuestos }
     *     
     */
    public void setComprobanteDetalleImpuestos(ArrayOfENComprobanteDetalleImpuestos value) {
        this.comprobanteDetalleImpuestos = value;
    }

    /**
     * Obtiene el valor de la propiedad descuentoCargoDetalle.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENDescuentoCargoDetalle }
     *     
     */
    public ArrayOfENDescuentoCargoDetalle getDescuentoCargoDetalle() {
        return descuentoCargoDetalle;
    }

    /**
     * Define el valor de la propiedad descuentoCargoDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENDescuentoCargoDetalle }
     *     
     */
    public void setDescuentoCargoDetalle(ArrayOfENDescuentoCargoDetalle value) {
        this.descuentoCargoDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobanteComercioExteriorDetalle.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComercioExteriorDetalle }
     *     
     */
    public ArrayOfENComercioExteriorDetalle getComprobanteComercioExteriorDetalle() {
        return comprobanteComercioExteriorDetalle;
    }

    /**
     * Define el valor de la propiedad comprobanteComercioExteriorDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComercioExteriorDetalle }
     *     
     */
    public void setComprobanteComercioExteriorDetalle(ArrayOfENComercioExteriorDetalle value) {
        this.comprobanteComercioExteriorDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad nota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNota() {
        return nota;
    }

    /**
     * Define el valor de la propiedad nota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNota(String value) {
        this.nota = value;
    }

    /**
     * Obtiene el valor de la propiedad descuentoIncIgv.
     * 
     */
    public double getDescuentoIncIgv() {
        return descuentoIncIgv;
    }

    /**
     * Define el valor de la propiedad descuentoIncIgv.
     * 
     */
    public void setDescuentoIncIgv(double value) {
        this.descuentoIncIgv = value;
    }

    /**
     * Obtiene el valor de la propiedad precioVentaItem.
     * 
     */
    public double getPrecioVentaItem() {
        return precioVentaItem;
    }

    /**
     * Define el valor de la propiedad precioVentaItem.
     * 
     */
    public void setPrecioVentaItem(double value) {
        this.precioVentaItem = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeDescuento.
     * 
     */
    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    /**
     * Define el valor de la propiedad porcentajeDescuento.
     * 
     */
    public void setPorcentajeDescuento(double value) {
        this.porcentajeDescuento = value;
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
     * Obtiene el valor de la propiedad importeBrutoItem.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteBrutoItem() {
        return importeBrutoItem;
    }

    /**
     * Define el valor de la propiedad importeBrutoItem.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteBrutoItem(BigDecimal value) {
        this.importeBrutoItem = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDeterminado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDeterminado() {
        return numeroDeterminado;
    }

    /**
     * Define el valor de la propiedad numeroDeterminado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDeterminado(String value) {
        this.numeroDeterminado = value;
    }

    /**
     * Obtiene el valor de la propiedad numReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumReferencia() {
        return numReferencia;
    }

    /**
     * Define el valor de la propiedad numReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumReferencia(String value) {
        this.numReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad ordenFabricacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdenFabricacion() {
        return ordenFabricacion;
    }

    /**
     * Define el valor de la propiedad ordenFabricacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdenFabricacion(String value) {
        this.ordenFabricacion = value;
    }

    /**
     * Obtiene el valor de la propiedad ordenCompraCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdenCompraCliente() {
        return ordenCompraCliente;
    }

    /**
     * Define el valor de la propiedad ordenCompraCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdenCompraCliente(String value) {
        this.ordenCompraCliente = value;
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
     * Obtiene el valor de la propiedad descuentoCargoDetalleIGV.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENDescuentoCargoDetalleIGV }
     *     
     */
    public ArrayOfENDescuentoCargoDetalleIGV getDescuentoCargoDetalleIGV() {
        return descuentoCargoDetalleIGV;
    }

    /**
     * Define el valor de la propiedad descuentoCargoDetalleIGV.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENDescuentoCargoDetalleIGV }
     *     
     */
    public void setDescuentoCargoDetalleIGV(ArrayOfENDescuentoCargoDetalleIGV value) {
        this.descuentoCargoDetalleIGV = value;
    }

    /**
     * Obtiene el valor de la propiedad baseComision.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseComision() {
        return baseComision;
    }

    /**
     * Define el valor de la propiedad baseComision.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseComision(BigDecimal value) {
        this.baseComision = value;
    }

    /**
     * Obtiene el valor de la propiedad costo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCosto() {
        return costo;
    }

    /**
     * Define el valor de la propiedad costo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCosto(BigDecimal value) {
        this.costo = value;
    }

    /**
     * Obtiene el valor de la propiedad comision.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getComision() {
        return comision;
    }

    /**
     * Define el valor de la propiedad comision.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setComision(BigDecimal value) {
        this.comision = value;
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
     * Obtiene el valor de la propiedad origenDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigenDestino() {
        return origenDestino;
    }

    /**
     * Define el valor de la propiedad origenDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigenDestino(String value) {
        this.origenDestino = value;
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
     * Obtiene el valor de la propiedad unidadMedidaEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadMedidaEmisor() {
        return unidadMedidaEmisor;
    }

    /**
     * Define el valor de la propiedad unidadMedidaEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadMedidaEmisor(String value) {
        this.unidadMedidaEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad informacionAdicional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformacionAdicional() {
        return informacionAdicional;
    }

    /**
     * Define el valor de la propiedad informacionAdicional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformacionAdicional(String value) {
        this.informacionAdicional = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCaducidad.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * Define el valor de la propiedad fechaCaducidad.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCaducidad(XMLGregorianCalendar value) {
        this.fechaCaducidad = value;
    }

    /**
     * Obtiene el valor de la propiedad sku.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * Define el valor de la propiedad sku.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSku(String value) {
        this.sku = value;
    }

    /**
     * Obtiene el valor de la propiedad glosaLibreDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlosaLibreDescripcion() {
        return glosaLibreDescripcion;
    }

    /**
     * Define el valor de la propiedad glosaLibreDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlosaLibreDescripcion(String value) {
        this.glosaLibreDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProductoSunat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProductoSunat() {
        return codigoProductoSunat;
    }

    /**
     * Define el valor de la propiedad codigoProductoSunat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProductoSunat(String value) {
        this.codigoProductoSunat = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProductoGS1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProductoGS1() {
        return codigoProductoGS1;
    }

    /**
     * Define el valor de la propiedad codigoProductoGS1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProductoGS1(String value) {
        this.codigoProductoGS1 = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestoTotal.
     * 
     */
    public double getImpuestoTotal() {
        return impuestoTotal;
    }

    /**
     * Define el valor de la propiedad impuestoTotal.
     * 
     */
    public void setImpuestoTotal(double value) {
        this.impuestoTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad transportePasajero.
     * 
     * @return
     *     possible object is
     *     {@link ENTransportePasajero }
     *     
     */
    public ENTransportePasajero getTransportePasajero() {
        return transportePasajero;
    }

    /**
     * Define el valor de la propiedad transportePasajero.
     * 
     * @param value
     *     allowed object is
     *     {@link ENTransportePasajero }
     *     
     */
    public void setTransportePasajero(ENTransportePasajero value) {
        this.transportePasajero = value;
    }

    /**
     * Obtiene el valor de la propiedad informacionAdicionalDetalle.
     * 
     * @return
     *     possible object is
     *     {@link ENInformacionAdicionalDetalle }
     *     
     */
    public ENInformacionAdicionalDetalle getInformacionAdicionalDetalle() {
        return informacionAdicionalDetalle;
    }

    /**
     * Define el valor de la propiedad informacionAdicionalDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link ENInformacionAdicionalDetalle }
     *     
     */
    public void setInformacionAdicionalDetalle(ENInformacionAdicionalDetalle value) {
        this.informacionAdicionalDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad hidrobiologicoItem.
     * 
     * @return
     *     possible object is
     *     {@link ENHidrobiologicosItem }
     *     
     */
    public ENHidrobiologicosItem getHidrobiologicoItem() {
        return hidrobiologicoItem;
    }

    /**
     * Define el valor de la propiedad hidrobiologicoItem.
     * 
     * @param value
     *     allowed object is
     *     {@link ENHidrobiologicosItem }
     *     
     */
    public void setHidrobiologicoItem(ENHidrobiologicosItem value) {
        this.hidrobiologicoItem = value;
    }

    /**
     * Obtiene el valor de la propiedad detraccionCarga.
     * 
     * @return
     *     possible object is
     *     {@link ENDetraccionCarga }
     *     
     */
    public ENDetraccionCarga getDetraccionCarga() {
        return detraccionCarga;
    }

    /**
     * Define el valor de la propiedad detraccionCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDetraccionCarga }
     *     
     */
    public void setDetraccionCarga(ENDetraccionCarga value) {
        this.detraccionCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad detraccionTramos.
     * 
     * @return
     *     possible object is
     *     {@link ENDetraccionTramos }
     *     
     */
    public ENDetraccionTramos getDetraccionTramos() {
        return detraccionTramos;
    }

    /**
     * Define el valor de la propiedad detraccionTramos.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDetraccionTramos }
     *     
     */
    public void setDetraccionTramos(ENDetraccionTramos value) {
        this.detraccionTramos = value;
    }

    /**
     * Obtiene el valor de la propiedad detraccionVehiculo.
     * 
     * @return
     *     possible object is
     *     {@link ENDetraccionVehiculo }
     *     
     */
    public ENDetraccionVehiculo getDetraccionVehiculo() {
        return detraccionVehiculo;
    }

    /**
     * Define el valor de la propiedad detraccionVehiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDetraccionVehiculo }
     *     
     */
    public void setDetraccionVehiculo(ENDetraccionVehiculo value) {
        this.detraccionVehiculo = value;
    }

    /**
     * Obtiene el valor de la propiedad hospedajeDetalle.
     * 
     * @return
     *     possible object is
     *     {@link ENHospedajeDetalle }
     *     
     */
    public ENHospedajeDetalle getHospedajeDetalle() {
        return hospedajeDetalle;
    }

    /**
     * Define el valor de la propiedad hospedajeDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link ENHospedajeDetalle }
     *     
     */
    public void setHospedajeDetalle(ENHospedajeDetalle value) {
        this.hospedajeDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad turismo.
     * 
     * @return
     *     possible object is
     *     {@link ENTurismo }
     *     
     */
    public ENTurismo getTurismo() {
        return turismo;
    }

    /**
     * Define el valor de la propiedad turismo.
     * 
     * @param value
     *     allowed object is
     *     {@link ENTurismo }
     *     
     */
    public void setTurismo(ENTurismo value) {
        this.turismo = value;
    }

    /**
     * Obtiene el valor de la propiedad ventasSectorPublico.
     * 
     * @return
     *     possible object is
     *     {@link ENVentasSectorPublico }
     *     
     */
    public ENVentasSectorPublico getVentasSectorPublico() {
        return ventasSectorPublico;
    }

    /**
     * Define el valor de la propiedad ventasSectorPublico.
     * 
     * @param value
     *     allowed object is
     *     {@link ENVentasSectorPublico }
     *     
     */
    public void setVentasSectorPublico(ENVentasSectorPublico value) {
        this.ventasSectorPublico = value;
    }

    /**
     * Obtiene el valor de la propiedad gastosHipotecario.
     * 
     * @return
     *     possible object is
     *     {@link ENGastosHipotecario }
     *     
     */
    public ENGastosHipotecario getGastosHipotecario() {
        return gastosHipotecario;
    }

    /**
     * Define el valor de la propiedad gastosHipotecario.
     * 
     * @param value
     *     allowed object is
     *     {@link ENGastosHipotecario }
     *     
     */
    public void setGastosHipotecario(ENGastosHipotecario value) {
        this.gastosHipotecario = value;
    }

    /**
     * Obtiene el valor de la propiedad cartaPorteAereoItem.
     * 
     * @return
     *     possible object is
     *     {@link ENCartaPorteAereoItem }
     *     
     */
    public ENCartaPorteAereoItem getCartaPorteAereoItem() {
        return cartaPorteAereoItem;
    }

    /**
     * Define el valor de la propiedad cartaPorteAereoItem.
     * 
     * @param value
     *     allowed object is
     *     {@link ENCartaPorteAereoItem }
     *     
     */
    public void setCartaPorteAereoItem(ENCartaPorteAereoItem value) {
        this.cartaPorteAereoItem = value;
    }

    /**
     * Obtiene el valor de la propiedad pasajeroItem.
     * 
     * @return
     *     possible object is
     *     {@link ENPasajeroItem }
     *     
     */
    public ENPasajeroItem getPasajeroItem() {
        return pasajeroItem;
    }

    /**
     * Define el valor de la propiedad pasajeroItem.
     * 
     * @param value
     *     allowed object is
     *     {@link ENPasajeroItem }
     *     
     */
    public void setPasajeroItem(ENPasajeroItem value) {
        this.pasajeroItem = value;
    }

    /**
     * Obtiene el valor de la propiedad regaliaPetrolera.
     * 
     * @return
     *     possible object is
     *     {@link ENRegaliaPetrolera }
     *     
     */
    public ENRegaliaPetrolera getRegaliaPetrolera() {
        return regaliaPetrolera;
    }

    /**
     * Define el valor de la propiedad regaliaPetrolera.
     * 
     * @param value
     *     allowed object is
     *     {@link ENRegaliaPetrolera }
     *     
     */
    public void setRegaliaPetrolera(ENRegaliaPetrolera value) {
        this.regaliaPetrolera = value;
    }

    /**
     * Obtiene el valor de la propiedad estructuraGTIN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstructuraGTIN() {
        return estructuraGTIN;
    }

    /**
     * Define el valor de la propiedad estructuraGTIN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstructuraGTIN(String value) {
        this.estructuraGTIN = value;
    }

}
