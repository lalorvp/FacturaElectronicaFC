
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENRespuestaEstadoCorreoComprobante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENRespuestaEstadoCorreoComprobante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comprobante" type="{http://tempuri.org/}ENRespuestaComprobante" minOccurs="0"/>
 *         &lt;element name="Correos" type="{http://tempuri.org/}ArrayOfENCorreoConsulta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENRespuestaEstadoCorreoComprobante", propOrder = {
    "codigo",
    "mensaje",
    "comprobante",
    "correos"
})
public class ENRespuestaEstadoCorreoComprobante {

    @XmlElement(name = "Codigo")
    protected int codigo;
    @XmlElement(name = "Mensaje")
    protected String mensaje;
    @XmlElement(name = "Comprobante")
    protected ENRespuestaComprobante comprobante;
    @XmlElement(name = "Correos")
    protected ArrayOfENCorreoConsulta correos;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     */
    public void setCodigo(int value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobante.
     * 
     * @return
     *     possible object is
     *     {@link ENRespuestaComprobante }
     *     
     */
    public ENRespuestaComprobante getComprobante() {
        return comprobante;
    }

    /**
     * Define el valor de la propiedad comprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link ENRespuestaComprobante }
     *     
     */
    public void setComprobante(ENRespuestaComprobante value) {
        this.comprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad correos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENCorreoConsulta }
     *     
     */
    public ArrayOfENCorreoConsulta getCorreos() {
        return correos;
    }

    /**
     * Define el valor de la propiedad correos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENCorreoConsulta }
     *     
     */
    public void setCorreos(ArrayOfENCorreoConsulta value) {
        this.correos = value;
    }

}
