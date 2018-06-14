
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENDescuentoCargoCabecera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENDescuentoCargoCabecera">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdDescuentoCargoCabecera" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdComprobante" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Indicador" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodigoMotivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PorcentajeAplicado" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
@XmlType(name = "ENDescuentoCargoCabecera", propOrder = {
    "idDescuentoCargoCabecera",
    "idComprobante",
    "monto",
    "descripcion",
    "indicador",
    "codigoMotivo",
    "porcentajeAplicado",
    "montoBase"
})
public class ENDescuentoCargoCabecera {

    @XmlElement(name = "IdDescuentoCargoCabecera")
    protected int idDescuentoCargoCabecera;
    @XmlElement(name = "IdComprobante")
    protected int idComprobante;
    @XmlElement(name = "Monto", required = true)
    protected BigDecimal monto;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "Indicador")
    protected int indicador;
    @XmlElement(name = "CodigoMotivo")
    protected String codigoMotivo;
    @XmlElement(name = "PorcentajeAplicado")
    protected double porcentajeAplicado;
    @XmlElement(name = "MontoBase")
    protected double montoBase;

    /**
     * Obtiene el valor de la propiedad idDescuentoCargoCabecera.
     * 
     */
    public int getIdDescuentoCargoCabecera() {
        return idDescuentoCargoCabecera;
    }

    /**
     * Define el valor de la propiedad idDescuentoCargoCabecera.
     * 
     */
    public void setIdDescuentoCargoCabecera(int value) {
        this.idDescuentoCargoCabecera = value;
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
     * Obtiene el valor de la propiedad monto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonto(BigDecimal value) {
        this.monto = value;
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
     * Obtiene el valor de la propiedad indicador.
     * 
     */
    public int getIndicador() {
        return indicador;
    }

    /**
     * Define el valor de la propiedad indicador.
     * 
     */
    public void setIndicador(int value) {
        this.indicador = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMotivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMotivo() {
        return codigoMotivo;
    }

    /**
     * Define el valor de la propiedad codigoMotivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMotivo(String value) {
        this.codigoMotivo = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeAplicado.
     * 
     */
    public double getPorcentajeAplicado() {
        return porcentajeAplicado;
    }

    /**
     * Define el valor de la propiedad porcentajeAplicado.
     * 
     */
    public void setPorcentajeAplicado(double value) {
        this.porcentajeAplicado = value;
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
