
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENAnticipo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENAnticipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalAPagar" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PrecioReal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalAnticipo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AnticipoDetalle" type="{http://tempuri.org/}ArrayOfENAnticipoDetalle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENAnticipo", propOrder = {
    "totalAPagar",
    "precioReal",
    "totalAnticipo",
    "anticipoDetalle"
})
public class ENAnticipo {

    @XmlElement(name = "TotalAPagar")
    protected double totalAPagar;
    @XmlElement(name = "PrecioReal")
    protected double precioReal;
    @XmlElement(name = "TotalAnticipo")
    protected double totalAnticipo;
    @XmlElement(name = "AnticipoDetalle")
    protected ArrayOfENAnticipoDetalle anticipoDetalle;

    /**
     * Obtiene el valor de la propiedad totalAPagar.
     * 
     */
    public double getTotalAPagar() {
        return totalAPagar;
    }

    /**
     * Define el valor de la propiedad totalAPagar.
     * 
     */
    public void setTotalAPagar(double value) {
        this.totalAPagar = value;
    }

    /**
     * Obtiene el valor de la propiedad precioReal.
     * 
     */
    public double getPrecioReal() {
        return precioReal;
    }

    /**
     * Define el valor de la propiedad precioReal.
     * 
     */
    public void setPrecioReal(double value) {
        this.precioReal = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAnticipo.
     * 
     */
    public double getTotalAnticipo() {
        return totalAnticipo;
    }

    /**
     * Define el valor de la propiedad totalAnticipo.
     * 
     */
    public void setTotalAnticipo(double value) {
        this.totalAnticipo = value;
    }

    /**
     * Obtiene el valor de la propiedad anticipoDetalle.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENAnticipoDetalle }
     *     
     */
    public ArrayOfENAnticipoDetalle getAnticipoDetalle() {
        return anticipoDetalle;
    }

    /**
     * Define el valor de la propiedad anticipoDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENAnticipoDetalle }
     *     
     */
    public void setAnticipoDetalle(ArrayOfENAnticipoDetalle value) {
        this.anticipoDetalle = value;
    }

}
