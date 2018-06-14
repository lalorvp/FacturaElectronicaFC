
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENTipoCambio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENTipoCambio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MonedaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonedaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoCambio" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENTipoCambio", propOrder = {
    "monedaOrigen",
    "monedaDestino",
    "tipoCambio"
})
public class ENTipoCambio {

    @XmlElement(name = "MonedaOrigen")
    protected String monedaOrigen;
    @XmlElement(name = "MonedaDestino")
    protected String monedaDestino;
    @XmlElement(name = "TipoCambio", required = true)
    protected BigDecimal tipoCambio;

    /**
     * Obtiene el valor de la propiedad monedaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    /**
     * Define el valor de la propiedad monedaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonedaOrigen(String value) {
        this.monedaOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonedaDestino() {
        return monedaDestino;
    }

    /**
     * Define el valor de la propiedad monedaDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonedaDestino(String value) {
        this.monedaDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Define el valor de la propiedad tipoCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTipoCambio(BigDecimal value) {
        this.tipoCambio = value;
    }

}
