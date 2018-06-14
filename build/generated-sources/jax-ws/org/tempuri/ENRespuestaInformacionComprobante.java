
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENRespuestaInformacionComprobante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENRespuestaInformacionComprobante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigorespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionrespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="respuesta" type="{http://tempuri.org/}ArrayOfENRespuestaCodigos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENRespuestaInformacionComprobante", propOrder = {
    "codigorespuesta",
    "descripcionrespuesta",
    "respuesta"
})
public class ENRespuestaInformacionComprobante {

    protected String codigorespuesta;
    protected String descripcionrespuesta;
    protected ArrayOfENRespuestaCodigos respuesta;

    /**
     * Obtiene el valor de la propiedad codigorespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigorespuesta() {
        return codigorespuesta;
    }

    /**
     * Define el valor de la propiedad codigorespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigorespuesta(String value) {
        this.codigorespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionrespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionrespuesta() {
        return descripcionrespuesta;
    }

    /**
     * Define el valor de la propiedad descripcionrespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionrespuesta(String value) {
        this.descripcionrespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENRespuestaCodigos }
     *     
     */
    public ArrayOfENRespuestaCodigos getRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENRespuestaCodigos }
     *     
     */
    public void setRespuesta(ArrayOfENRespuestaCodigos value) {
        this.respuesta = value;
    }

}
