
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENGravadoOTROS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENGravadoOTROS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Base" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ValorImpuesto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENGravadoOTROS", propOrder = {
    "base",
    "valorImpuesto"
})
public class ENGravadoOTROS {

    @XmlElement(name = "Base")
    protected double base;
    @XmlElement(name = "ValorImpuesto")
    protected double valorImpuesto;

    /**
     * Obtiene el valor de la propiedad base.
     * 
     */
    public double getBase() {
        return base;
    }

    /**
     * Define el valor de la propiedad base.
     * 
     */
    public void setBase(double value) {
        this.base = value;
    }

    /**
     * Obtiene el valor de la propiedad valorImpuesto.
     * 
     */
    public double getValorImpuesto() {
        return valorImpuesto;
    }

    /**
     * Define el valor de la propiedad valorImpuesto.
     * 
     */
    public void setValorImpuesto(double value) {
        this.valorImpuesto = value;
    }

}
