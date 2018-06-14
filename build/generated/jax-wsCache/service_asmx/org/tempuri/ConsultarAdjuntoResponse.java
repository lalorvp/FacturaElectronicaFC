
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
 *         &lt;element name="ConsultarAdjuntoResult" type="{http://tempuri.org/}ENRespuestaAdjunto" minOccurs="0"/>
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
    "consultarAdjuntoResult"
})
@XmlRootElement(name = "ConsultarAdjuntoResponse")
public class ConsultarAdjuntoResponse {

    @XmlElement(name = "ConsultarAdjuntoResult")
    protected ENRespuestaAdjunto consultarAdjuntoResult;

    /**
     * Obtiene el valor de la propiedad consultarAdjuntoResult.
     * 
     * @return
     *     possible object is
     *     {@link ENRespuestaAdjunto }
     *     
     */
    public ENRespuestaAdjunto getConsultarAdjuntoResult() {
        return consultarAdjuntoResult;
    }

    /**
     * Define el valor de la propiedad consultarAdjuntoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ENRespuestaAdjunto }
     *     
     */
    public void setConsultarAdjuntoResult(ENRespuestaAdjunto value) {
        this.consultarAdjuntoResult = value;
    }

}
