
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
 *         &lt;element name="objConsultaComprobante" type="{http://tempuri.org/}ENSConsultarRespuestaComprobante" minOccurs="0"/>
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
    "objConsultaComprobante"
})
@XmlRootElement(name = "ConsultarRespuestaComprobante")
public class ConsultarRespuestaComprobante {

    protected ENSConsultarRespuestaComprobante objConsultaComprobante;

    /**
     * Obtiene el valor de la propiedad objConsultaComprobante.
     * 
     * @return
     *     possible object is
     *     {@link ENSConsultarRespuestaComprobante }
     *     
     */
    public ENSConsultarRespuestaComprobante getObjConsultaComprobante() {
        return objConsultaComprobante;
    }

    /**
     * Define el valor de la propiedad objConsultaComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link ENSConsultarRespuestaComprobante }
     *     
     */
    public void setObjConsultaComprobante(ENSConsultarRespuestaComprobante value) {
        this.objConsultaComprobante = value;
    }

}
