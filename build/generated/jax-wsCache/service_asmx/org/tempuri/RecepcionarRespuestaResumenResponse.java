
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
 *         &lt;element name="RecepcionarRespuestaResumenResult" type="{http://tempuri.org/}ArrayOfENRespuestaResumen" minOccurs="0"/>
 *         &lt;element name="MsgError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "recepcionarRespuestaResumenResult",
    "msgError"
})
@XmlRootElement(name = "RecepcionarRespuestaResumenResponse")
public class RecepcionarRespuestaResumenResponse {

    @XmlElement(name = "RecepcionarRespuestaResumenResult")
    protected ArrayOfENRespuestaResumen recepcionarRespuestaResumenResult;
    @XmlElement(name = "MsgError")
    protected String msgError;

    /**
     * Obtiene el valor de la propiedad recepcionarRespuestaResumenResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENRespuestaResumen }
     *     
     */
    public ArrayOfENRespuestaResumen getRecepcionarRespuestaResumenResult() {
        return recepcionarRespuestaResumenResult;
    }

    /**
     * Define el valor de la propiedad recepcionarRespuestaResumenResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENRespuestaResumen }
     *     
     */
    public void setRecepcionarRespuestaResumenResult(ArrayOfENRespuestaResumen value) {
        this.recepcionarRespuestaResumenResult = value;
    }

    /**
     * Obtiene el valor de la propiedad msgError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgError() {
        return msgError;
    }

    /**
     * Define el valor de la propiedad msgError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgError(String value) {
        this.msgError = value;
    }

}
