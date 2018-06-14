
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENFise complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENFise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoMotivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
@XmlType(name = "ENFise", propOrder = {
    "codigoMotivo",
    "monto",
    "montoBase"
})
public class ENFise {

    @XmlElement(name = "CodigoMotivo")
    protected String codigoMotivo;
    @XmlElement(name = "Monto")
    protected double monto;
    @XmlElement(name = "MontoBase")
    protected double montoBase;

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
     * Obtiene el valor de la propiedad monto.
     * 
     */
    public double getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     */
    public void setMonto(double value) {
        this.monto = value;
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
