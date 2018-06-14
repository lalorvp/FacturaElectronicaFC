
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENMontosTotales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENMontosTotales">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Gravado" type="{http://tempuri.org/}ENGravado" minOccurs="0"/>
 *         &lt;element name="Inafecto" type="{http://tempuri.org/}ENInafecto" minOccurs="0"/>
 *         &lt;element name="Exonerado" type="{http://tempuri.org/}ENExonerado" minOccurs="0"/>
 *         &lt;element name="Gratuito" type="{http://tempuri.org/}ENGratuito" minOccurs="0"/>
 *         &lt;element name="Exportacion" type="{http://tempuri.org/}ENExportacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENMontosTotales", propOrder = {
    "gravado",
    "inafecto",
    "exonerado",
    "gratuito",
    "exportacion"
})
public class ENMontosTotales {

    @XmlElement(name = "Gravado")
    protected ENGravado gravado;
    @XmlElement(name = "Inafecto")
    protected ENInafecto inafecto;
    @XmlElement(name = "Exonerado")
    protected ENExonerado exonerado;
    @XmlElement(name = "Gratuito")
    protected ENGratuito gratuito;
    @XmlElement(name = "Exportacion")
    protected ENExportacion exportacion;

    /**
     * Obtiene el valor de la propiedad gravado.
     * 
     * @return
     *     possible object is
     *     {@link ENGravado }
     *     
     */
    public ENGravado getGravado() {
        return gravado;
    }

    /**
     * Define el valor de la propiedad gravado.
     * 
     * @param value
     *     allowed object is
     *     {@link ENGravado }
     *     
     */
    public void setGravado(ENGravado value) {
        this.gravado = value;
    }

    /**
     * Obtiene el valor de la propiedad inafecto.
     * 
     * @return
     *     possible object is
     *     {@link ENInafecto }
     *     
     */
    public ENInafecto getInafecto() {
        return inafecto;
    }

    /**
     * Define el valor de la propiedad inafecto.
     * 
     * @param value
     *     allowed object is
     *     {@link ENInafecto }
     *     
     */
    public void setInafecto(ENInafecto value) {
        this.inafecto = value;
    }

    /**
     * Obtiene el valor de la propiedad exonerado.
     * 
     * @return
     *     possible object is
     *     {@link ENExonerado }
     *     
     */
    public ENExonerado getExonerado() {
        return exonerado;
    }

    /**
     * Define el valor de la propiedad exonerado.
     * 
     * @param value
     *     allowed object is
     *     {@link ENExonerado }
     *     
     */
    public void setExonerado(ENExonerado value) {
        this.exonerado = value;
    }

    /**
     * Obtiene el valor de la propiedad gratuito.
     * 
     * @return
     *     possible object is
     *     {@link ENGratuito }
     *     
     */
    public ENGratuito getGratuito() {
        return gratuito;
    }

    /**
     * Define el valor de la propiedad gratuito.
     * 
     * @param value
     *     allowed object is
     *     {@link ENGratuito }
     *     
     */
    public void setGratuito(ENGratuito value) {
        this.gratuito = value;
    }

    /**
     * Obtiene el valor de la propiedad exportacion.
     * 
     * @return
     *     possible object is
     *     {@link ENExportacion }
     *     
     */
    public ENExportacion getExportacion() {
        return exportacion;
    }

    /**
     * Define el valor de la propiedad exportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ENExportacion }
     *     
     */
    public void setExportacion(ENExportacion value) {
        this.exportacion = value;
    }

}
