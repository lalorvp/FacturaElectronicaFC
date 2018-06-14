
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecepcionarRespuestasResult" type="{http://tempuri.org/}ArrayOfENRespuesta" minOccurs="0"/>
 *         &lt;element name="Cadena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "recepcionarRespuestasResult",
    "cadena"
})
@XmlRootElement(name = "RecepcionarRespuestasResponse")
public class RecepcionarRespuestasResponse {

    @XmlElement(name = "RecepcionarRespuestasResult")
    protected ArrayOfENRespuesta recepcionarRespuestasResult;
    @XmlElement(name = "Cadena")
    protected String cadena;

    /**
     * Obtiene el valor de la propiedad recepcionarRespuestasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENRespuesta }
     *     
     */
    public ArrayOfENRespuesta getRecepcionarRespuestasResult() {
        return recepcionarRespuestasResult;
    }

    /**
     * Define el valor de la propiedad recepcionarRespuestasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENRespuesta }
     *     
     */
    public void setRecepcionarRespuestasResult(ArrayOfENRespuesta value) {
        this.recepcionarRespuestasResult = value;
    }

    /**
     * Obtiene el valor de la propiedad cadena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * Define el valor de la propiedad cadena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadena(String value) {
        this.cadena = value;
    }

}
