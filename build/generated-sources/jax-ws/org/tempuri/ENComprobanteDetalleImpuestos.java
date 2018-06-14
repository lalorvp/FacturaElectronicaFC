
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENComprobanteDetalleImpuestos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENComprobanteDetalleImpuestos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdComprobanteDetalleImpuestos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdComprobanteDetalle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ImporteTributo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ImpGratuito" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ImpuestoPorcentual" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ImporteExplicito" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AfectacionIGV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SistemaISC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoriaTributo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoTributo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoTributo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesTributo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoUN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoCategoriaTributo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TasaAplicada" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENComprobanteDetalleImpuestos", propOrder = {
    "idComprobanteDetalleImpuestos",
    "idComprobanteDetalle",
    "importeTributo",
    "impGratuito",
    "impuestoPorcentual",
    "importeExplicito",
    "afectacionIGV",
    "sistemaISC",
    "categoriaTributo",
    "tipoTributo",
    "codigoTributo",
    "desTributo",
    "codigoUN",
    "codigoCategoriaTributo",
    "montoBase",
    "tasaAplicada"
})
public class ENComprobanteDetalleImpuestos {

    @XmlElement(name = "IdComprobanteDetalleImpuestos")
    protected int idComprobanteDetalleImpuestos;
    @XmlElement(name = "IdComprobanteDetalle")
    protected int idComprobanteDetalle;
    @XmlElement(name = "ImporteTributo", required = true)
    protected BigDecimal importeTributo;
    @XmlElement(name = "ImpGratuito")
    protected int impGratuito;
    @XmlElement(name = "ImpuestoPorcentual", required = true)
    protected BigDecimal impuestoPorcentual;
    @XmlElement(name = "ImporteExplicito", required = true)
    protected BigDecimal importeExplicito;
    @XmlElement(name = "AfectacionIGV")
    protected String afectacionIGV;
    @XmlElement(name = "SistemaISC")
    protected String sistemaISC;
    @XmlElement(name = "CategoriaTributo")
    protected String categoriaTributo;
    @XmlElement(name = "TipoTributo")
    protected String tipoTributo;
    @XmlElement(name = "CodigoTributo")
    protected String codigoTributo;
    @XmlElement(name = "DesTributo")
    protected String desTributo;
    @XmlElement(name = "CodigoUN")
    protected String codigoUN;
    @XmlElement(name = "CodigoCategoriaTributo")
    protected String codigoCategoriaTributo;
    @XmlElement(name = "MontoBase")
    protected double montoBase;
    @XmlElement(name = "TasaAplicada")
    protected double tasaAplicada;

    /**
     * Obtiene el valor de la propiedad idComprobanteDetalleImpuestos.
     * 
     */
    public int getIdComprobanteDetalleImpuestos() {
        return idComprobanteDetalleImpuestos;
    }

    /**
     * Define el valor de la propiedad idComprobanteDetalleImpuestos.
     * 
     */
    public void setIdComprobanteDetalleImpuestos(int value) {
        this.idComprobanteDetalleImpuestos = value;
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
     * Obtiene el valor de la propiedad importeTributo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteTributo() {
        return importeTributo;
    }

    /**
     * Define el valor de la propiedad importeTributo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteTributo(BigDecimal value) {
        this.importeTributo = value;
    }

    /**
     * Obtiene el valor de la propiedad impGratuito.
     * 
     */
    public int getImpGratuito() {
        return impGratuito;
    }

    /**
     * Define el valor de la propiedad impGratuito.
     * 
     */
    public void setImpGratuito(int value) {
        this.impGratuito = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestoPorcentual.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImpuestoPorcentual() {
        return impuestoPorcentual;
    }

    /**
     * Define el valor de la propiedad impuestoPorcentual.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImpuestoPorcentual(BigDecimal value) {
        this.impuestoPorcentual = value;
    }

    /**
     * Obtiene el valor de la propiedad importeExplicito.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteExplicito() {
        return importeExplicito;
    }

    /**
     * Define el valor de la propiedad importeExplicito.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteExplicito(BigDecimal value) {
        this.importeExplicito = value;
    }

    /**
     * Obtiene el valor de la propiedad afectacionIGV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfectacionIGV() {
        return afectacionIGV;
    }

    /**
     * Define el valor de la propiedad afectacionIGV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfectacionIGV(String value) {
        this.afectacionIGV = value;
    }

    /**
     * Obtiene el valor de la propiedad sistemaISC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemaISC() {
        return sistemaISC;
    }

    /**
     * Define el valor de la propiedad sistemaISC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaISC(String value) {
        this.sistemaISC = value;
    }

    /**
     * Obtiene el valor de la propiedad categoriaTributo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoriaTributo() {
        return categoriaTributo;
    }

    /**
     * Define el valor de la propiedad categoriaTributo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoriaTributo(String value) {
        this.categoriaTributo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTributo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTributo() {
        return tipoTributo;
    }

    /**
     * Define el valor de la propiedad tipoTributo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTributo(String value) {
        this.tipoTributo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTributo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTributo() {
        return codigoTributo;
    }

    /**
     * Define el valor de la propiedad codigoTributo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTributo(String value) {
        this.codigoTributo = value;
    }

    /**
     * Obtiene el valor de la propiedad desTributo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesTributo() {
        return desTributo;
    }

    /**
     * Define el valor de la propiedad desTributo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesTributo(String value) {
        this.desTributo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUN() {
        return codigoUN;
    }

    /**
     * Define el valor de la propiedad codigoUN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUN(String value) {
        this.codigoUN = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCategoriaTributo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCategoriaTributo() {
        return codigoCategoriaTributo;
    }

    /**
     * Define el valor de la propiedad codigoCategoriaTributo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCategoriaTributo(String value) {
        this.codigoCategoriaTributo = value;
    }

    /**
     * Obtiene el valor de la propiedad montoBase.
     * 
     */
    public double getMontoBase() {
        return montoBase;
    }

    /**
     * Define el valor de la propiedad montoBase.
     * 
     */
    public void setMontoBase(double value) {
        this.montoBase = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaAplicada.
     * 
     */
    public double getTasaAplicada() {
        return tasaAplicada;
    }

    /**
     * Define el valor de la propiedad tasaAplicada.
     * 
     */
    public void setTasaAplicada(double value) {
        this.tasaAplicada = value;
    }

}
