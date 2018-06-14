
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENDescuentoCargoDetalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENDescuentoCargoDetalle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdDescuentoCargoCabecera" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdComprobanteDetalle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Indicador" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Porcentaje" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CodigoAplicado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ENDescuentoCargoDetalle", propOrder = {
    "idDescuentoCargoCabecera",
    "idComprobanteDetalle",
    "monto",
    "descripcion",
    "indicador",
    "porcentaje",
    "codigoAplicado",
    "montoBase"
})
public class ENDescuentoCargoDetalle {

    @XmlElement(name = "IdDescuentoCargoCabecera")
    protected int idDescuentoCargoCabecera;
    @XmlElement(name = "IdComprobanteDetalle")
    protected int idComprobanteDetalle;
    @XmlElement(name = "Monto", required = true)
    protected BigDecimal monto;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "Indicador")
    protected int indicador;
    @XmlElement(name = "Porcentaje", required = true)
    protected BigDecimal porcentaje;
    @XmlElement(name = "CodigoAplicado")
    protected String codigoAplicado;
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
     * Obtiene el valor de la propiedad porcentaje.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    /**
     * Define el valor de la propiedad porcentaje.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentaje(BigDecimal value) {
        this.porcentaje = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoAplicado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAplicado() {
        return codigoAplicado;
    }

    /**
     * Define el valor de la propiedad codigoAplicado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAplicado(String value) {
        this.codigoAplicado = value;
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
