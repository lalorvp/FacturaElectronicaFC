
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENResumenDetalleImpuesto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENResumenDetalleImpuesto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImporteTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ImporteExplicito" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CodigoTipoImpuesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENResumenDetalleImpuesto", propOrder = {
    "importeTotal",
    "importeExplicito",
    "codigoTipoImpuesto"
})
public class ENResumenDetalleImpuesto {

    @XmlElement(name = "ImporteTotal", required = true)
    protected BigDecimal importeTotal;
    @XmlElement(name = "ImporteExplicito", required = true)
    protected BigDecimal importeExplicito;
    @XmlElement(name = "CodigoTipoImpuesto")
    protected String codigoTipoImpuesto;

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
     * Obtiene el valor de la propiedad codigoTipoImpuesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoImpuesto() {
        return codigoTipoImpuesto;
    }

    /**
     * Define el valor de la propiedad codigoTipoImpuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoImpuesto(String value) {
        this.codigoTipoImpuesto = value;
    }

}
