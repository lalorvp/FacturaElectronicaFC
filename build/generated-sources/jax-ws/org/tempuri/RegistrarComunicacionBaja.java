
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
 *         &lt;element name="oGeneral" type="{http://tempuri.org/}General" minOccurs="0"/>
 *         &lt;element name="Cadena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListaError" type="{http://tempuri.org/}ArrayOfENErrorComunicacion" minOccurs="0"/>
 *         &lt;element name="IdCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "oGeneral",
    "cadena",
    "listaError",
    "idCliente"
})
@XmlRootElement(name = "RegistrarComunicacionBaja")
public class RegistrarComunicacionBaja {

    protected General oGeneral;
    @XmlElement(name = "Cadena")
    protected String cadena;
    @XmlElement(name = "ListaError")
    protected ArrayOfENErrorComunicacion listaError;
    @XmlElement(name = "IdCliente")
    protected int idCliente;

    /**
     * Obtiene el valor de la propiedad oGeneral.
     * 
     * @return
     *     possible object is
     *     {@link General }
     *     
     */
    public General getOGeneral() {
        return oGeneral;
    }

    /**
     * Define el valor de la propiedad oGeneral.
     * 
     * @param value
     *     allowed object is
     *     {@link General }
     *     
     */
    public void setOGeneral(General value) {
        this.oGeneral = value;
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

    /**
     * Obtiene el valor de la propiedad idCliente.
     * 
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     */
    public void setIdCliente(int value) {
        this.idCliente = value;
    }

}