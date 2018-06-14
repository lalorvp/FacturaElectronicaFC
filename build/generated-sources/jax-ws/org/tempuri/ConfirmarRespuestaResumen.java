
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
 *         &lt;element name="objENConfirmarRespuestaResumen" type="{http://tempuri.org/}ENSConfirmarRespuestaResumen" minOccurs="0"/>
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
    "objENConfirmarRespuestaResumen"
})
@XmlRootElement(name = "ConfirmarRespuestaResumen")
public class ConfirmarRespuestaResumen {

    protected ENSConfirmarRespuestaResumen objENConfirmarRespuestaResumen;

    /**
     * Obtiene el valor de la propiedad objENConfirmarRespuestaResumen.
     * 
     * @return
     *     possible object is
     *     {@link ENSConfirmarRespuestaResumen }
     *     
     */
    public ENSConfirmarRespuestaResumen getObjENConfirmarRespuestaResumen() {
        return objENConfirmarRespuestaResumen;
    }

    /**
     * Define el valor de la propiedad objENConfirmarRespuestaResumen.
     * 
     * @param value
     *     allowed object is
     *     {@link ENSConfirmarRespuestaResumen }
     *     
     */
    public void setObjENConfirmarRespuestaResumen(ENSConfirmarRespuestaResumen value) {
        this.objENConfirmarRespuestaResumen = value;
    }

}
