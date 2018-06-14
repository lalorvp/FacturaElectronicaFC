
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENConsolidadoBoletasDetalleOtrosCargos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENConsolidadoBoletasDetalleOtrosCargos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdOtrosCargos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdConsolidadoDetalle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Indicador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ENConsolidadoBoletasDetalleOtrosCargos", propOrder = {
    "idOtrosCargos",
    "idConsolidadoDetalle",
    "indicador",
    "importe",
    "moneda"
})
public class ENConsolidadoBoletasDetalleOtrosCargos {

    @XmlElement(name = "IdOtrosCargos")
    protected int idOtrosCargos;
    @XmlElement(name = "IdConsolidadoDetalle")
    protected int idConsolidadoDetalle;
    @XmlElement(name = "Indicador")
    protected String indicador;
    @XmlElement(name = "Importe", required = true)
    protected BigDecimal importe;
    @XmlElement(name = "Moneda")
    protected String moneda;

    /**
     * Obtiene el valor de la propiedad idOtrosCargos.
     * 
     */
    public int getIdOtrosCargos() {
        return idOtrosCargos;
    }

    /**
     * Define el valor de la propiedad idOtrosCargos.
     * 
     */
    public void setIdOtrosCargos(int value) {
        this.idOtrosCargos = value;
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
     * Obtiene el valor de la propiedad indicador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicador() {
        return indicador;
    }

    /**
     * Define el valor de la propiedad indicador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicador(String value) {
        this.indicador = value;
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
