
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENGravado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENGravado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="GravadoIGV" type="{http://tempuri.org/}ENGravadoIGV" minOccurs="0"/>
 *         &lt;element name="GravadoISC" type="{http://tempuri.org/}ENGravadoISC" minOccurs="0"/>
 *         &lt;element name="GravadoOTROS" type="{http://tempuri.org/}ENGravadoOTROS" minOccurs="0"/>
 *         &lt;element name="GravadoIVAP" type="{http://tempuri.org/}ENGravadoIVAP" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENGravado", propOrder = {
    "total",
    "gravadoIGV",
    "gravadoISC",
    "gravadoOTROS",
    "gravadoIVAP"
})
public class ENGravado {

    @XmlElement(name = "Total")
    protected double total;
    @XmlElement(name = "GravadoIGV")
    protected ENGravadoIGV gravadoIGV;
    @XmlElement(name = "GravadoISC")
    protected ENGravadoISC gravadoISC;
    @XmlElement(name = "GravadoOTROS")
    protected ENGravadoOTROS gravadoOTROS;
    @XmlElement(name = "GravadoIVAP")
    protected ENGravadoIVAP gravadoIVAP;

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
     * Obtiene el valor de la propiedad gravadoIGV.
     * 
     * @return
     *     possible object is
     *     {@link ENGravadoIGV }
     *     
     */
    public ENGravadoIGV getGravadoIGV() {
        return gravadoIGV;
    }

    /**
     * Define el valor de la propiedad gravadoIGV.
     * 
     * @param value
     *     allowed object is
     *     {@link ENGravadoIGV }
     *     
     */
    public void setGravadoIGV(ENGravadoIGV value) {
        this.gravadoIGV = value;
    }

    /**
     * Obtiene el valor de la propiedad gravadoISC.
     * 
     * @return
     *     possible object is
     *     {@link ENGravadoISC }
     *     
     */
    public ENGravadoISC getGravadoISC() {
        return gravadoISC;
    }

    /**
     * Define el valor de la propiedad gravadoISC.
     * 
     * @param value
     *     allowed object is
     *     {@link ENGravadoISC }
     *     
     */
    public void setGravadoISC(ENGravadoISC value) {
        this.gravadoISC = value;
    }

    /**
     * Obtiene el valor de la propiedad gravadoOTROS.
     * 
     * @return
     *     possible object is
     *     {@link ENGravadoOTROS }
     *     
     */
    public ENGravadoOTROS getGravadoOTROS() {
        return gravadoOTROS;
    }

    /**
     * Define el valor de la propiedad gravadoOTROS.
     * 
     * @param value
     *     allowed object is
     *     {@link ENGravadoOTROS }
     *     
     */
    public void setGravadoOTROS(ENGravadoOTROS value) {
        this.gravadoOTROS = value;
    }

    /**
     * Obtiene el valor de la propiedad gravadoIVAP.
     * 
     * @return
     *     possible object is
     *     {@link ENGravadoIVAP }
     *     
     */
    public ENGravadoIVAP getGravadoIVAP() {
        return gravadoIVAP;
    }

    /**
     * Define el valor de la propiedad gravadoIVAP.
     * 
     * @param value
     *     allowed object is
     *     {@link ENGravadoIVAP }
     *     
     */
    public void setGravadoIVAP(ENGravadoIVAP value) {
        this.gravadoIVAP = value;
    }

}
