
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENGravadoIGV complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENGravadoIGV">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Base" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ValorImpuesto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Porcentaje" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENGravadoIGV", propOrder = {
    "base",
    "valorImpuesto",
    "porcentaje"
})
public class ENGravadoIGV {

    @XmlElement(name = "Base")
    protected double base;
    @XmlElement(name = "ValorImpuesto")
    protected double valorImpuesto;
    @XmlElement(name = "Porcentaje")
    protected double porcentaje;

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

    /**
     * Obtiene el valor de la propiedad porcentaje.
     * 
     */
    public double getPorcentaje() {
        return porcentaje;
    }

    /**
     * Define el valor de la propiedad porcentaje.
     * 
     */
    public void setPorcentaje(double value) {
        this.porcentaje = value;
    }

}
