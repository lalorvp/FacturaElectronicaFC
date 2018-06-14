
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENRespuestaEstadoCorreo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENRespuestaEstadoCorreo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Correos" type="{http://tempuri.org/}ArrayOfENCorreoComprobanteConsulta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENRespuestaEstadoCorreo", propOrder = {
    "codigo",
    "mensaje",
    "cantidad",
    "correos"
})
public class ENRespuestaEstadoCorreo {

    @XmlElement(name = "Codigo")
    protected int codigo;
    @XmlElement(name = "Mensaje")
    protected String mensaje;
    @XmlElement(name = "Cantidad")
    protected int cantidad;
    @XmlElement(name = "Correos")
    protected ArrayOfENCorreoComprobanteConsulta correos;

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
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad correos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENCorreoComprobanteConsulta }
     *     
     */
    public ArrayOfENCorreoComprobanteConsulta getCorreos() {
        return correos;
    }

    /**
     * Define el valor de la propiedad correos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENCorreoComprobanteConsulta }
     *     
     */
    public void setCorreos(ArrayOfENCorreoComprobanteConsulta value) {
        this.correos = value;
    }

}
