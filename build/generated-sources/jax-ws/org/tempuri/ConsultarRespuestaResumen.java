
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="objENConsultarRespuestaResumen" type="{http://tempuri.org/}ENSConsultarRespuestaResumen" minOccurs="0"/>
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
    "objENConsultarRespuestaResumen"
})
@XmlRootElement(name = "ConsultarRespuestaResumen")
public class ConsultarRespuestaResumen {

    protected ENSConsultarRespuestaResumen objENConsultarRespuestaResumen;

    /**
     * Obtiene el valor de la propiedad objENConsultarRespuestaResumen.
     * 
     * @return
     *     possible object is
     *     {@link ENSConsultarRespuestaResumen }
     *     
     */
    public ENSConsultarRespuestaResumen getObjENConsultarRespuestaResumen() {
        return objENConsultarRespuestaResumen;
    }

    /**
     * Define el valor de la propiedad objENConsultarRespuestaResumen.
     * 
     * @param value
     *     allowed object is
     *     {@link ENSConsultarRespuestaResumen }
     *     
     */
    public void setObjENConsultarRespuestaResumen(ENSConsultarRespuestaResumen value) {
        this.objENConsultarRespuestaResumen = value;
    }

}
