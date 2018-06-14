
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
 *         &lt;element name="objENConfirmarRespuestaComprobante" type="{http://tempuri.org/}ENSConfirmarRespuestaComprobante" minOccurs="0"/>
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
    "objENConfirmarRespuestaComprobante"
})
@XmlRootElement(name = "ConfirmarRespuestaComprobante")
public class ConfirmarRespuestaComprobante {

    protected ENSConfirmarRespuestaComprobante objENConfirmarRespuestaComprobante;

    /**
     * Obtiene el valor de la propiedad objENConfirmarRespuestaComprobante.
     * 
     * @return
     *     possible object is
     *     {@link ENSConfirmarRespuestaComprobante }
     *     
     */
    public ENSConfirmarRespuestaComprobante getObjENConfirmarRespuestaComprobante() {
        return objENConfirmarRespuestaComprobante;
    }

    /**
     * Define el valor de la propiedad objENConfirmarRespuestaComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link ENSConfirmarRespuestaComprobante }
     *     
     */
    public void setObjENConfirmarRespuestaComprobante(ENSConfirmarRespuestaComprobante value) {
        this.objENConfirmarRespuestaComprobante = value;
    }

}
