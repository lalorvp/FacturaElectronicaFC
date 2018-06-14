
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENRedondeo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENRedondeo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MontoRedondeo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalAPagar" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENRedondeo", propOrder = {
    "montoRedondeo",
    "totalAPagar"
})
public class ENRedondeo {

    @XmlElement(name = "MontoRedondeo")
    protected double montoRedondeo;
    @XmlElement(name = "TotalAPagar")
    protected double totalAPagar;

    /**
     * Obtiene el valor de la propiedad montoRedondeo.
     * 
     */
    public double getMontoRedondeo() {
        return montoRedondeo;
    }

    /**
     * Define el valor de la propiedad montoRedondeo.
     * 
     */
    public void setMontoRedondeo(double value) {
        this.montoRedondeo = value;
    }

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

}
