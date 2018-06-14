
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENComprobanteMontosAdicionales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENComprobanteMontosAdicionales">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdComprobanteMontosAdicionales" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdComprobante" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MontoPercepcion" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MontoTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="BasePercepcion" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENComprobanteMontosAdicionales", propOrder = {
    "idComprobanteMontosAdicionales",
    "idComprobante",
    "codigo",
    "montoPercepcion",
    "montoTotal",
    "basePercepcion"
})
public class ENComprobanteMontosAdicionales {

    @XmlElement(name = "IdComprobanteMontosAdicionales")
    protected int idComprobanteMontosAdicionales;
    @XmlElement(name = "IdComprobante")
    protected int idComprobante;
    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "MontoPercepcion", required = true)
    protected BigDecimal montoPercepcion;
    @XmlElement(name = "MontoTotal", required = true)
    protected BigDecimal montoTotal;
    @XmlElement(name = "BasePercepcion", required = true)
    protected BigDecimal basePercepcion;

    /**
     * Obtiene el valor de la propiedad idComprobanteMontosAdicionales.
     * 
     */
    public int getIdComprobanteMontosAdicionales() {
        return idComprobanteMontosAdicionales;
    }

    /**
     * Define el valor de la propiedad idComprobanteMontosAdicionales.
     * 
     */
    public void setIdComprobanteMontosAdicionales(int value) {
        this.idComprobanteMontosAdicionales = value;
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
     * Obtiene el valor de la propiedad montoPercepcion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoPercepcion() {
        return montoPercepcion;
    }

    /**
     * Define el valor de la propiedad montoPercepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoPercepcion(BigDecimal value) {
        this.montoPercepcion = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    /**
     * Define el valor de la propiedad montoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoTotal(BigDecimal value) {
        this.montoTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad basePercepcion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBasePercepcion() {
        return basePercepcion;
    }

    /**
     * Define el valor de la propiedad basePercepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBasePercepcion(BigDecimal value) {
        this.basePercepcion = value;
    }

}
