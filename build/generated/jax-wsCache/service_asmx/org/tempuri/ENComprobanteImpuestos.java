
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENComprobanteImpuestos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENComprobanteImpuestos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdComprobanteImpuestos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdComprobante" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ImporteTributo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ImporteExplicito" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoTributo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesTributo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoUN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Porcentaje" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MontoBase" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENComprobanteImpuestos", propOrder = {
    "idComprobanteImpuestos",
    "idComprobante",
    "importeTributo",
    "importeExplicito",
    "nombre",
    "codigoTributo",
    "desTributo",
    "codigoUN",
    "porcentaje",
    "montoBase"
})
public class ENComprobanteImpuestos {

    @XmlElement(name = "IdComprobanteImpuestos")
    protected int idComprobanteImpuestos;
    @XmlElement(name = "IdComprobante")
    protected int idComprobante;
    @XmlElement(name = "ImporteTributo", required = true)
    protected BigDecimal importeTributo;
    @XmlElement(name = "ImporteExplicito", required = true)
    protected BigDecimal importeExplicito;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "CodigoTributo")
    protected String codigoTributo;
    @XmlElement(name = "DesTributo")
    protected String desTributo;
    @XmlElement(name = "CodigoUN")
    protected String codigoUN;
    @XmlElement(name = "Porcentaje")
    protected double porcentaje;
    @XmlElement(name = "MontoBase")
    protected double montoBase;

    /**
     * Obtiene el valor de la propiedad idComprobanteImpuestos.
     * 
     */
    public int getIdComprobanteImpuestos() {
        return idComprobanteImpuestos;
    }

    /**
     * Define el valor de la propiedad idComprobanteImpuestos.
     * 
     */
    public void setIdComprobanteImpuestos(int value) {
        this.idComprobanteImpuestos = value;
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
     * Obtiene el valor de la propiedad porcentaje.
     * 
     */
    public double getPorcentaje() {
        return porcentaje;
    }

    /**
     * Define el valor de la propiedad porcentaje.
     * 
     */
    public void setPorcentaje(double value) {
        this.porcentaje = value;
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

}
