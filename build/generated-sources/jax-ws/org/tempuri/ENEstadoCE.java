
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENEstadoCE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENEstadoCE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Otorgado" type="{http://tempuri.org/}ENOtorgado" minOccurs="0"/>
 *         &lt;element name="Leido" type="{http://tempuri.org/}ENLeido" minOccurs="0"/>
 *         &lt;element name="Rechazo" type="{http://tempuri.org/}ENRechazo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENEstadoCE", propOrder = {
    "otorgado",
    "leido",
    "rechazo"
})
public class ENEstadoCE {

    @XmlElement(name = "Otorgado")
    protected ENOtorgado otorgado;
    @XmlElement(name = "Leido")
    protected ENLeido leido;
    @XmlElement(name = "Rechazo")
    protected ENRechazo rechazo;

    /**
     * Obtiene el valor de la propiedad otorgado.
     * 
     * @return
     *     possible object is
     *     {@link ENOtorgado }
     *     
     */
    public ENOtorgado getOtorgado() {
        return otorgado;
    }

    /**
     * Define el valor de la propiedad otorgado.
     * 
     * @param value
     *     allowed object is
     *     {@link ENOtorgado }
     *     
     */
    public void setOtorgado(ENOtorgado value) {
        this.otorgado = value;
    }

    /**
     * Obtiene el valor de la propiedad leido.
     * 
     * @return
     *     possible object is
     *     {@link ENLeido }
     *     
     */
    public ENLeido getLeido() {
        return leido;
    }

    /**
     * Define el valor de la propiedad leido.
     * 
     * @param value
     *     allowed object is
     *     {@link ENLeido }
     *     
     */
    public void setLeido(ENLeido value) {
        this.leido = value;
    }

    /**
     * Obtiene el valor de la propiedad rechazo.
     * 
     * @return
     *     possible object is
     *     {@link ENRechazo }
     *     
     */
    public ENRechazo getRechazo() {
        return rechazo;
    }

    /**
     * Define el valor de la propiedad rechazo.
     * 
     * @param value
     *     allowed object is
     *     {@link ENRechazo }
     *     
     */
    public void setRechazo(ENRechazo value) {
        this.rechazo = value;
    }

}
