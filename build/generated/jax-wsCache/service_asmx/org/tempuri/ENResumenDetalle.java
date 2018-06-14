
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENResumenDetalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENResumenDetalle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalCargos" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalGravadas" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalExonerada" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalInafectas" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalExportacion" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalGratuito" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResumenDetalleImpuesto" type="{http://tempuri.org/}ArrayOfENResumenDetalleImpuesto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENResumenDetalle", propOrder = {
    "tipoDocumento",
    "serie",
    "numeroInicial",
    "numeroFinal",
    "total",
    "totalCargos",
    "totalGravadas",
    "totalExonerada",
    "totalInafectas",
    "totalExportacion",
    "totalGratuito",
    "moneda",
    "resumenDetalleImpuesto"
})
public class ENResumenDetalle {

    @XmlElement(name = "TipoDocumento")
    protected String tipoDocumento;
    @XmlElement(name = "Serie")
    protected String serie;
    @XmlElement(name = "NumeroInicial")
    protected String numeroInicial;
    @XmlElement(name = "NumeroFinal")
    protected String numeroFinal;
    @XmlElement(name = "Total", required = true)
    protected BigDecimal total;
    @XmlElement(name = "TotalCargos", required = true)
    protected BigDecimal totalCargos;
    @XmlElement(name = "TotalGravadas", required = true)
    protected BigDecimal totalGravadas;
    @XmlElement(name = "TotalExonerada", required = true)
    protected BigDecimal totalExonerada;
    @XmlElement(name = "TotalInafectas", required = true)
    protected BigDecimal totalInafectas;
    @XmlElement(name = "TotalExportacion", required = true)
    protected BigDecimal totalExportacion;
    @XmlElement(name = "TotalGratuito", required = true)
    protected BigDecimal totalGratuito;
    @XmlElement(name = "Moneda")
    protected String moneda;
    @XmlElement(name = "ResumenDetalleImpuesto")
    protected ArrayOfENResumenDetalleImpuesto resumenDetalleImpuesto;

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroInicial() {
        return numeroInicial;
    }

    /**
     * Define el valor de la propiedad numeroInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroInicial(String value) {
        this.numeroInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFinal() {
        return numeroFinal;
    }

    /**
     * Define el valor de la propiedad numeroFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFinal(String value) {
        this.numeroFinal = value;
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
     * Obtiene el valor de la propiedad totalCargos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCargos() {
        return totalCargos;
    }

    /**
     * Define el valor de la propiedad totalCargos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCargos(BigDecimal value) {
        this.totalCargos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalGravadas.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalGravadas() {
        return totalGravadas;
    }

    /**
     * Define el valor de la propiedad totalGravadas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalGravadas(BigDecimal value) {
        this.totalGravadas = value;
    }

    /**
     * Obtiene el valor de la propiedad totalExonerada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalExonerada() {
        return totalExonerada;
    }

    /**
     * Define el valor de la propiedad totalExonerada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalExonerada(BigDecimal value) {
        this.totalExonerada = value;
    }

    /**
     * Obtiene el valor de la propiedad totalInafectas.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalInafectas() {
        return totalInafectas;
    }

    /**
     * Define el valor de la propiedad totalInafectas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalInafectas(BigDecimal value) {
        this.totalInafectas = value;
    }

    /**
     * Obtiene el valor de la propiedad totalExportacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalExportacion() {
        return totalExportacion;
    }

    /**
     * Define el valor de la propiedad totalExportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalExportacion(BigDecimal value) {
        this.totalExportacion = value;
    }

    /**
     * Obtiene el valor de la propiedad totalGratuito.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalGratuito() {
        return totalGratuito;
    }

    /**
     * Define el valor de la propiedad totalGratuito.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalGratuito(BigDecimal value) {
        this.totalGratuito = value;
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
     * Obtiene el valor de la propiedad resumenDetalleImpuesto.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENResumenDetalleImpuesto }
     *     
     */
    public ArrayOfENResumenDetalleImpuesto getResumenDetalleImpuesto() {
        return resumenDetalleImpuesto;
    }

    /**
     * Define el valor de la propiedad resumenDetalleImpuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENResumenDetalleImpuesto }
     *     
     */
    public void setResumenDetalleImpuesto(ArrayOfENResumenDetalleImpuesto value) {
        this.resumenDetalleImpuesto = value;
    }

}
