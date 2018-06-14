
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENConsolidadoBoletasDetalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENConsolidadoBoletasDetalle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdConsolidadoDetalle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdConsolidado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Item" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodigoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Importe" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroInicial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumeroFinal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsolidadoBoletasDetalleImportes" type="{http://tempuri.org/}ArrayOfENConsolidadoBoletasDetalleAfectacionIgv" minOccurs="0"/>
 *         &lt;element name="ConsolidadoBoletasDetalleImpuestos" type="{http://tempuri.org/}ArrayOfENConsolidadoBoletasDetalleTributos" minOccurs="0"/>
 *         &lt;element name="ConsolidadoBoletasDetalleOtrosCargos" type="{http://tempuri.org/}ArrayOfENConsolidadoBoletasDetalleOtrosCargos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENConsolidadoBoletasDetalle", propOrder = {
    "idConsolidadoDetalle",
    "idConsolidado",
    "item",
    "idTipoDocumento",
    "codigoTipoDocumento",
    "importe",
    "serie",
    "numeroInicial",
    "numeroFinal",
    "moneda",
    "consolidadoBoletasDetalleImportes",
    "consolidadoBoletasDetalleImpuestos",
    "consolidadoBoletasDetalleOtrosCargos"
})
public class ENConsolidadoBoletasDetalle {

    @XmlElement(name = "IdConsolidadoDetalle")
    protected int idConsolidadoDetalle;
    @XmlElement(name = "IdConsolidado")
    protected int idConsolidado;
    @XmlElement(name = "Item")
    protected int item;
    @XmlElement(name = "IdTipoDocumento")
    protected int idTipoDocumento;
    @XmlElement(name = "CodigoTipoDocumento")
    protected String codigoTipoDocumento;
    @XmlElement(name = "Importe", required = true)
    protected BigDecimal importe;
    @XmlElement(name = "Serie")
    protected String serie;
    @XmlElement(name = "NumeroInicial")
    protected int numeroInicial;
    @XmlElement(name = "NumeroFinal")
    protected int numeroFinal;
    @XmlElement(name = "Moneda")
    protected String moneda;
    @XmlElement(name = "ConsolidadoBoletasDetalleImportes")
    protected ArrayOfENConsolidadoBoletasDetalleAfectacionIgv consolidadoBoletasDetalleImportes;
    @XmlElement(name = "ConsolidadoBoletasDetalleImpuestos")
    protected ArrayOfENConsolidadoBoletasDetalleTributos consolidadoBoletasDetalleImpuestos;
    @XmlElement(name = "ConsolidadoBoletasDetalleOtrosCargos")
    protected ArrayOfENConsolidadoBoletasDetalleOtrosCargos consolidadoBoletasDetalleOtrosCargos;

    /**
     * Obtiene el valor de la propiedad idConsolidadoDetalle.
     * 
     */
    public int getIdConsolidadoDetalle() {
        return idConsolidadoDetalle;
    }

    /**
     * Define el valor de la propiedad idConsolidadoDetalle.
     * 
     */
    public void setIdConsolidadoDetalle(int value) {
        this.idConsolidadoDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad idConsolidado.
     * 
     */
    public int getIdConsolidado() {
        return idConsolidado;
    }

    /**
     * Define el valor de la propiedad idConsolidado.
     * 
     */
    public void setIdConsolidado(int value) {
        this.idConsolidado = value;
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
     * Obtiene el valor de la propiedad idTipoDocumento.
     * 
     */
    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    /**
     * Define el valor de la propiedad idTipoDocumento.
     * 
     */
    public void setIdTipoDocumento(int value) {
        this.idTipoDocumento = value;
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
     * Obtiene el valor de la propiedad importe.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporte(BigDecimal value) {
        this.importe = value;
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
     * Obtiene el valor de la propiedad numeroInicial.
     * 
     */
    public int getNumeroInicial() {
        return numeroInicial;
    }

    /**
     * Define el valor de la propiedad numeroInicial.
     * 
     */
    public void setNumeroInicial(int value) {
        this.numeroInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroFinal.
     * 
     */
    public int getNumeroFinal() {
        return numeroFinal;
    }

    /**
     * Define el valor de la propiedad numeroFinal.
     * 
     */
    public void setNumeroFinal(int value) {
        this.numeroFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad consolidadoBoletasDetalleImportes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENConsolidadoBoletasDetalleAfectacionIgv }
     *     
     */
    public ArrayOfENConsolidadoBoletasDetalleAfectacionIgv getConsolidadoBoletasDetalleImportes() {
        return consolidadoBoletasDetalleImportes;
    }

    /**
     * Define el valor de la propiedad consolidadoBoletasDetalleImportes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENConsolidadoBoletasDetalleAfectacionIgv }
     *     
     */
    public void setConsolidadoBoletasDetalleImportes(ArrayOfENConsolidadoBoletasDetalleAfectacionIgv value) {
        this.consolidadoBoletasDetalleImportes = value;
    }

    /**
     * Obtiene el valor de la propiedad consolidadoBoletasDetalleImpuestos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENConsolidadoBoletasDetalleTributos }
     *     
     */
    public ArrayOfENConsolidadoBoletasDetalleTributos getConsolidadoBoletasDetalleImpuestos() {
        return consolidadoBoletasDetalleImpuestos;
    }

    /**
     * Define el valor de la propiedad consolidadoBoletasDetalleImpuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENConsolidadoBoletasDetalleTributos }
     *     
     */
    public void setConsolidadoBoletasDetalleImpuestos(ArrayOfENConsolidadoBoletasDetalleTributos value) {
        this.consolidadoBoletasDetalleImpuestos = value;
    }

    /**
     * Obtiene el valor de la propiedad consolidadoBoletasDetalleOtrosCargos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENConsolidadoBoletasDetalleOtrosCargos }
     *     
     */
    public ArrayOfENConsolidadoBoletasDetalleOtrosCargos getConsolidadoBoletasDetalleOtrosCargos() {
        return consolidadoBoletasDetalleOtrosCargos;
    }

    /**
     * Define el valor de la propiedad consolidadoBoletasDetalleOtrosCargos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENConsolidadoBoletasDetalleOtrosCargos }
     *     
     */
    public void setConsolidadoBoletasDetalleOtrosCargos(ArrayOfENConsolidadoBoletasDetalleOtrosCargos value) {
        this.consolidadoBoletasDetalleOtrosCargos = value;
    }

}
