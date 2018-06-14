
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENRespuestaDetalleEstadoComprobante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENRespuestaDetalleEstadoComprobante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstadoCE" type="{http://tempuri.org/}ENEstadoCE" minOccurs="0"/>
 *         &lt;element name="EstadoSUNAT" type="{http://tempuri.org/}ENEstadoSUNAT" minOccurs="0"/>
 *         &lt;element name="EstadoTransmision" type="{http://tempuri.org/}ENEstadoTransmision" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENRespuestaDetalleEstadoComprobante", propOrder = {
    "codigo",
    "mensaje",
    "estadoCE",
    "estadoSUNAT",
    "estadoTransmision"
})
public class ENRespuestaDetalleEstadoComprobante {

    @XmlElement(name = "Codigo")
    protected int codigo;
    @XmlElement(name = "Mensaje")
    protected String mensaje;
    @XmlElement(name = "EstadoCE")
    protected ENEstadoCE estadoCE;
    @XmlElement(name = "EstadoSUNAT")
    protected ENEstadoSUNAT estadoSUNAT;
    @XmlElement(name = "EstadoTransmision")
    protected ENEstadoTransmision estadoTransmision;

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
     * Obtiene el valor de la propiedad estadoCE.
     * 
     * @return
     *     possible object is
     *     {@link ENEstadoCE }
     *     
     */
    public ENEstadoCE getEstadoCE() {
        return estadoCE;
    }

    /**
     * Define el valor de la propiedad estadoCE.
     * 
     * @param value
     *     allowed object is
     *     {@link ENEstadoCE }
     *     
     */
    public void setEstadoCE(ENEstadoCE value) {
        this.estadoCE = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoSUNAT.
     * 
     * @return
     *     possible object is
     *     {@link ENEstadoSUNAT }
     *     
     */
    public ENEstadoSUNAT getEstadoSUNAT() {
        return estadoSUNAT;
    }

    /**
     * Define el valor de la propiedad estadoSUNAT.
     * 
     * @param value
     *     allowed object is
     *     {@link ENEstadoSUNAT }
     *     
     */
    public void setEstadoSUNAT(ENEstadoSUNAT value) {
        this.estadoSUNAT = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoTransmision.
     * 
     * @return
     *     possible object is
     *     {@link ENEstadoTransmision }
     *     
     */
    public ENEstadoTransmision getEstadoTransmision() {
        return estadoTransmision;
    }

    /**
     * Define el valor de la propiedad estadoTransmision.
     * 
     * @param value
     *     allowed object is
     *     {@link ENEstadoTransmision }
     *     
     */
    public void setEstadoTransmision(ENEstadoTransmision value) {
        this.estadoTransmision = value;
    }

}
