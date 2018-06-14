
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
 *         &lt;element name="oENPeticionRespuestaResumen" type="{http://tempuri.org/}ENPeticionRespuestaResumen" minOccurs="0"/>
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
    "oenPeticionRespuestaResumen",
    "msgError"
})
@XmlRootElement(name = "RecepcionarRespuestaResumen")
public class RecepcionarRespuestaResumen {

    @XmlElement(name = "oENPeticionRespuestaResumen")
    protected ENPeticionRespuestaResumen oenPeticionRespuestaResumen;
    @XmlElement(name = "MsgError")
    protected String msgError;

    /**
     * Obtiene el valor de la propiedad oenPeticionRespuestaResumen.
     * 
     * @return
     *     possible object is
     *     {@link ENPeticionRespuestaResumen }
     *     
     */
    public ENPeticionRespuestaResumen getOENPeticionRespuestaResumen() {
        return oenPeticionRespuestaResumen;
    }

    /**
     * Define el valor de la propiedad oenPeticionRespuestaResumen.
     * 
     * @param value
     *     allowed object is
     *     {@link ENPeticionRespuestaResumen }
     *     
     */
    public void setOENPeticionRespuestaResumen(ENPeticionRespuestaResumen value) {
        this.oenPeticionRespuestaResumen = value;
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
