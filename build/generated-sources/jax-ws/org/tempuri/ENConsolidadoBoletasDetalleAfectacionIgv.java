
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENConsolidadoBoletasDetalleAfectacionIgv complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENConsolidadoBoletasDetalleAfectacionIgv">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdConsolidadoDetalleAfectacionIgv" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdConsolidadoDetalle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodigoTipoAfectacionIgv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Importe" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENConsolidadoBoletasDetalleAfectacionIgv", propOrder = {
    "idConsolidadoDetalleAfectacionIgv",
    "idConsolidadoDetalle",
    "codigoTipoAfectacionIgv",
    "importe",
    "moneda"
})
public class ENConsolidadoBoletasDetalleAfectacionIgv {

    @XmlElement(name = "IdConsolidadoDetalleAfectacionIgv")
    protected int idConsolidadoDetalleAfectacionIgv;
    @XmlElement(name = "IdConsolidadoDetalle")
    protected int idConsolidadoDetalle;
    @XmlElement(name = "CodigoTipoAfectacionIgv")
    protected String codigoTipoAfectacionIgv;
    @XmlElement(name = "Importe", required = true)
    protected BigDecimal importe;
    @XmlElement(name = "Moneda")
    protected String moneda;

    /**
     * Obtiene el valor de la propiedad idConsolidadoDetalleAfectacionIgv.
     * 
     */
    public int getIdConsolidadoDetalleAfectacionIgv() {
        return idConsolidadoDetalleAfectacionIgv;
    }

    /**
     * Define el valor de la propiedad idConsolidadoDetalleAfectacionIgv.
     * 
     */
    public void setIdConsolidadoDetalleAfectacionIgv(int value) {
        this.idConsolidadoDetalleAfectacionIgv = value;
    }

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
     * Obtiene el valor de la propiedad codigoTipoAfectacionIgv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoAfectacionIgv() {
        return codigoTipoAfectacionIgv;
    }

    /**
     * Define el valor de la propiedad codigoTipoAfectacionIgv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoAfectacionIgv(String value) {
        this.codigoTipoAfectacionIgv = value;
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

}
