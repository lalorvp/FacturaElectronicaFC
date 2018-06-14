
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENTransporteBienes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENTransporteBienes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValorReferencial" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PuntoDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PuntoOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfiguracionVehicular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroMTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENTransporteBienes", propOrder = {
    "valorReferencial",
    "puntoDestino",
    "puntoOrigen",
    "configuracionVehicular",
    "numeroMTC"
})
public class ENTransporteBienes {

    @XmlElement(name = "ValorReferencial")
    protected double valorReferencial;
    @XmlElement(name = "PuntoDestino")
    protected String puntoDestino;
    @XmlElement(name = "PuntoOrigen")
    protected String puntoOrigen;
    @XmlElement(name = "ConfiguracionVehicular")
    protected String configuracionVehicular;
    @XmlElement(name = "NumeroMTC")
    protected String numeroMTC;

    /**
     * Obtiene el valor de la propiedad valorReferencial.
     * 
     */
    public double getValorReferencial() {
        return valorReferencial;
    }

    /**
     * Define el valor de la propiedad valorReferencial.
     * 
     */
    public void setValorReferencial(double value) {
        this.valorReferencial = value;
    }

    /**
     * Obtiene el valor de la propiedad puntoDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPuntoDestino() {
        return puntoDestino;
    }

    /**
     * Define el valor de la propiedad puntoDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPuntoDestino(String value) {
        this.puntoDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad puntoOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPuntoOrigen() {
        return puntoOrigen;
    }

    /**
     * Define el valor de la propiedad puntoOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPuntoOrigen(String value) {
        this.puntoOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad configuracionVehicular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfiguracionVehicular() {
        return configuracionVehicular;
    }

    /**
     * Define el valor de la propiedad configuracionVehicular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfiguracionVehicular(String value) {
        this.configuracionVehicular = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroMTC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroMTC() {
        return numeroMTC;
    }

    /**
     * Define el valor de la propiedad numeroMTC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroMTC(String value) {
        this.numeroMTC = value;
    }

}
