
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
 *         &lt;element name="ConsultarXMLComprobanteResult" type="{http://tempuri.org/}ENRConsultarXMLComprobante" minOccurs="0"/>
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
    "consultarXMLComprobanteResult"
})
@XmlRootElement(name = "ConsultarXMLComprobanteResponse")
public class ConsultarXMLComprobanteResponse {

    @XmlElement(name = "ConsultarXMLComprobanteResult")
    protected ENRConsultarXMLComprobante consultarXMLComprobanteResult;

    /**
     * Obtiene el valor de la propiedad consultarXMLComprobanteResult.
     * 
     * @return
     *     possible object is
     *     {@link ENRConsultarXMLComprobante }
     *     
     */
    public ENRConsultarXMLComprobante getConsultarXMLComprobanteResult() {
        return consultarXMLComprobanteResult;
    }

    /**
     * Define el valor de la propiedad consultarXMLComprobanteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ENRConsultarXMLComprobante }
     *     
     */
    public void setConsultarXMLComprobanteResult(ENRConsultarXMLComprobante value) {
        this.consultarXMLComprobanteResult = value;
    }

}
