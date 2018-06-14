
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
 *         &lt;element name="RegistrarResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Cadena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoBarras" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="CodigoHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "registrarResult",
    "cadena",
    "codigoBarras",
    "codigoHash",
    "listaError"
})
@XmlRootElement(name = "RegistrarResponse")
public class RegistrarResponse {

    @XmlElement(name = "RegistrarResult")
    protected boolean registrarResult;
    @XmlElement(name = "Cadena")
    protected String cadena;
    @XmlElement(name = "CodigoBarras")
    protected byte[] codigoBarras;
    @XmlElement(name = "CodigoHash")
    protected String codigoHash;
    @XmlElement(name = "ListaError")
    protected ArrayOfENErrorComunicacion listaError;

    /**
     * Obtiene el valor de la propiedad registrarResult.
     * 
     */
    public boolean isRegistrarResult() {
        return registrarResult;
    }

    /**
     * Define el valor de la propiedad registrarResult.
     * 
     */
    public void setRegistrarResult(boolean value) {
        this.registrarResult = value;
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

    /**
     * Obtiene el valor de la propiedad codigoBarras.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCodigoBarras() {
        return codigoBarras;
    }

    /**
     * Define el valor de la propiedad codigoBarras.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCodigoBarras(byte[] value) {
        this.codigoBarras = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoHash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoHash() {
        return codigoHash;
    }

    /**
     * Define el valor de la propiedad codigoHash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoHash(String value) {
        this.codigoHash = value;
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
