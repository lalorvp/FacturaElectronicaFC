
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENDetraccion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENDetraccion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Porcentaje" type="{http://tempuri.org/}ArrayOfENPorcentaje" minOccurs="0"/>
 *         &lt;element name="BienesServicios" type="{http://tempuri.org/}ArrayOfENBienesServicios" minOccurs="0"/>
 *         &lt;element name="Monto" type="{http://tempuri.org/}ArrayOfENMonto" minOccurs="0"/>
 *         &lt;element name="NumeroCuenta" type="{http://tempuri.org/}ArrayOfENNumeroCuenta" minOccurs="0"/>
 *         &lt;element name="RecursosHidrobiologicos" type="{http://tempuri.org/}ArrayOfENRecursosHidrobiologicos" minOccurs="0"/>
 *         &lt;element name="ValorReferencial" type="{http://tempuri.org/}ArrayOfENValorReferencial" minOccurs="0"/>
 *         &lt;element name="TransporteBienes" type="{http://tempuri.org/}ArrayOfENTransporteBienes" minOccurs="0"/>
 *         &lt;element name="CodigoBienServicio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENDetraccion", propOrder = {
    "porcentaje",
    "bienesServicios",
    "monto",
    "numeroCuenta",
    "recursosHidrobiologicos",
    "valorReferencial",
    "transporteBienes",
    "codigoBienServicio"
})
public class ENDetraccion {

    @XmlElement(name = "Porcentaje")
    protected ArrayOfENPorcentaje porcentaje;
    @XmlElement(name = "BienesServicios")
    protected ArrayOfENBienesServicios bienesServicios;
    @XmlElement(name = "Monto")
    protected ArrayOfENMonto monto;
    @XmlElement(name = "NumeroCuenta")
    protected ArrayOfENNumeroCuenta numeroCuenta;
    @XmlElement(name = "RecursosHidrobiologicos")
    protected ArrayOfENRecursosHidrobiologicos recursosHidrobiologicos;
    @XmlElement(name = "ValorReferencial")
    protected ArrayOfENValorReferencial valorReferencial;
    @XmlElement(name = "TransporteBienes")
    protected ArrayOfENTransporteBienes transporteBienes;
    @XmlElement(name = "CodigoBienServicio")
    protected double codigoBienServicio;

    /**
     * Obtiene el valor de la propiedad porcentaje.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENPorcentaje }
     *     
     */
    public ArrayOfENPorcentaje getPorcentaje() {
        return porcentaje;
    }

    /**
     * Define el valor de la propiedad porcentaje.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENPorcentaje }
     *     
     */
    public void setPorcentaje(ArrayOfENPorcentaje value) {
        this.porcentaje = value;
    }

    /**
     * Obtiene el valor de la propiedad bienesServicios.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENBienesServicios }
     *     
     */
    public ArrayOfENBienesServicios getBienesServicios() {
        return bienesServicios;
    }

    /**
     * Define el valor de la propiedad bienesServicios.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENBienesServicios }
     *     
     */
    public void setBienesServicios(ArrayOfENBienesServicios value) {
        this.bienesServicios = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENMonto }
     *     
     */
    public ArrayOfENMonto getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENMonto }
     *     
     */
    public void setMonto(ArrayOfENMonto value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuenta.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENNumeroCuenta }
     *     
     */
    public ArrayOfENNumeroCuenta getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Define el valor de la propiedad numeroCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENNumeroCuenta }
     *     
     */
    public void setNumeroCuenta(ArrayOfENNumeroCuenta value) {
        this.numeroCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad recursosHidrobiologicos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENRecursosHidrobiologicos }
     *     
     */
    public ArrayOfENRecursosHidrobiologicos getRecursosHidrobiologicos() {
        return recursosHidrobiologicos;
    }

    /**
     * Define el valor de la propiedad recursosHidrobiologicos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENRecursosHidrobiologicos }
     *     
     */
    public void setRecursosHidrobiologicos(ArrayOfENRecursosHidrobiologicos value) {
        this.recursosHidrobiologicos = value;
    }

    /**
     * Obtiene el valor de la propiedad valorReferencial.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENValorReferencial }
     *     
     */
    public ArrayOfENValorReferencial getValorReferencial() {
        return valorReferencial;
    }

    /**
     * Define el valor de la propiedad valorReferencial.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENValorReferencial }
     *     
     */
    public void setValorReferencial(ArrayOfENValorReferencial value) {
        this.valorReferencial = value;
    }

    /**
     * Obtiene el valor de la propiedad transporteBienes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENTransporteBienes }
     *     
     */
    public ArrayOfENTransporteBienes getTransporteBienes() {
        return transporteBienes;
    }

    /**
     * Define el valor de la propiedad transporteBienes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENTransporteBienes }
     *     
     */
    public void setTransporteBienes(ArrayOfENTransporteBienes value) {
        this.transporteBienes = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoBienServicio.
     * 
     */
    public double getCodigoBienServicio() {
        return codigoBienServicio;
    }

    /**
     * Define el valor de la propiedad codigoBienServicio.
     * 
     */
    public void setCodigoBienServicio(double value) {
        this.codigoBienServicio = value;
    }

}
