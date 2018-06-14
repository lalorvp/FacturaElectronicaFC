
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
 *         &lt;element name="RegistrarComunicacionBajaResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ListaError" type="{http://tempuri.org/}ArrayOfENErrorComunicacion" minOccurs="0"/>
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
    "registrarComunicacionBajaResult",
    "listaError"
})
@XmlRootElement(name = "RegistrarComunicacionBajaResponse")
public class RegistrarComunicacionBajaResponse {

    @XmlElement(name = "RegistrarComunicacionBajaResult")
    protected boolean registrarComunicacionBajaResult;
    @XmlElement(name = "ListaError")
    protected ArrayOfENErrorComunicacion listaError;

    /**
     * Obtiene el valor de la propiedad registrarComunicacionBajaResult.
     * 
     */
    public boolean isRegistrarComunicacionBajaResult() {
        return registrarComunicacionBajaResult;
    }

    /**
     * Define el valor de la propiedad registrarComunicacionBajaResult.
     * 
     */
    public void setRegistrarComunicacionBajaResult(boolean value) {
        this.registrarComunicacionBajaResult = value;
    }

    /**
     * Obtiene el valor de la propiedad listaError.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENErrorComunicacion }
     *     
     */
    public ArrayOfENErrorComunicacion getListaError() {
        return listaError;
    }

    /**
     * Define el valor de la propiedad listaError.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENErrorComunicacion }
     *     
     */
    public void setListaError(ArrayOfENErrorComunicacion value) {
        this.listaError = value;
    }

}
