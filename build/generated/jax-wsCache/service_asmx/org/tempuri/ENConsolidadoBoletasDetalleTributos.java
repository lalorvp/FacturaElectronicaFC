
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENConsolidadoBoletasDetalleTributos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENConsolidadoBoletasDetalleTributos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdConsolidadoDetalleTributo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdConsolidadoDetalle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodigoTributo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesTributo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoUN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImporteTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ImporteExplicito" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
@XmlType(name = "ENConsolidadoBoletasDetalleTributos", propOrder = {
    "idConsolidadoDetalleTributo",
    "idConsolidadoDetalle",
    "codigoTributo",
    "desTributo",
    "codigoUN",
    "importeTotal",
    "importeExplicito",
    "moneda"
})
public class ENConsolidadoBoletasDetalleTributos {

    @XmlElement(name = "IdConsolidadoDetalleTributo")
    protected int idConsolidadoDetalleTributo;
    @XmlElement(name = "IdConsolidadoDetalle")
    protected int idConsolidadoDetalle;
    @XmlElement(name = "CodigoTributo")
    protected String codigoTributo;
    @XmlElement(name = "DesTributo")
    protected String desTributo;
    @XmlElement(name = "CodigoUN")
    protected String codigoUN;
    @XmlElement(name = "ImporteTotal", required = true)
    protected BigDecimal importeTotal;
    @XmlElement(name = "ImporteExplicito", required = true)
    protected BigDecimal importeExplicito;
    @XmlElement(name = "Moneda")
    protected String moneda;

    /**
     * Obtiene el valor de la propiedad idConsolidadoDetalleTributo.
     * 
     */
    public int getIdConsolidadoDetalleTributo() {
        return idConsolidadoDetalleTributo;
    }

    /**
     * Define el valor de la propiedad idConsolidadoDetalleTributo.
     * 
     */
    public void setIdConsolidadoDetalleTributo(int value) {
        this.idConsolidadoDetalleTributo = value;
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
     * Obtiene el valor de la propiedad importeTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteTotal() {
        return importeTotal;
    }

    /**
     * Define el valor de la propiedad importeTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteTotal(BigDecimal value) {
        this.importeTotal = value;
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
