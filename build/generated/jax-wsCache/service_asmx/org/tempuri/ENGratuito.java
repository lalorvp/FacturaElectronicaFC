
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENGratuito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENGratuito">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="GratuitoImpuesto" type="{http://tempuri.org/}ENGratuitoImpuesto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENGratuito", propOrder = {
    "total",
    "gratuitoImpuesto"
})
public class ENGratuito {

    @XmlElement(name = "Total")
    protected double total;
    @XmlElement(name = "GratuitoImpuesto")
    protected ENGratuitoImpuesto gratuitoImpuesto;

    /**
     * Obtiene el valor de la propiedad total.
     * 
     */
    public double getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     */
    public void setTotal(double value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad gratuitoImpuesto.
     * 
     * @return
     *     possible object is
     *     {@link ENGratuitoImpuesto }
     *     
     */
    public ENGratuitoImpuesto getGratuitoImpuesto() {
        return gratuitoImpuesto;
    }

    /**
     * Define el valor de la propiedad gratuitoImpuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link ENGratuitoImpuesto }
     *     
     */
    public void setGratuitoImpuesto(ENGratuitoImpuesto value) {
        this.gratuitoImpuesto = value;
    }

}
