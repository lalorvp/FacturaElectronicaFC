
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENFondoGarantia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENFondoGarantia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Porcentaje" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalPagar" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENFondoGarantia", propOrder = {
    "porcentaje",
    "totalPagar",
    "monto"
})
public class ENFondoGarantia {

    @XmlElement(name = "Porcentaje")
    protected double porcentaje;
    @XmlElement(name = "TotalPagar")
    protected double totalPagar;
    @XmlElement(name = "Monto")
    protected double monto;

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

    /**
     * Obtiene el valor de la propiedad totalPagar.
     * 
     */
    public double getTotalPagar() {
        return totalPagar;
    }

    /**
     * Define el valor de la propiedad totalPagar.
     * 
     */
    public void setTotalPagar(double value) {
        this.totalPagar = value;
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

}
