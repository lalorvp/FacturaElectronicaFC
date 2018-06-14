
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ENEstadoTransmision complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENEstadoTransmision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EstadoTransmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaEstado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CodigoComunicado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MotivoBaja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENEstadoTransmision", propOrder = {
    "estadoTransmision",
    "fechaEstado",
    "codigoComunicado",
    "motivoBaja"
})
public class ENEstadoTransmision {

    @XmlElement(name = "EstadoTransmision")
    protected String estadoTransmision;
    @XmlElement(name = "FechaEstado", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEstado;
    @XmlElement(name = "CodigoComunicado")
    protected String codigoComunicado;
    @XmlElement(name = "MotivoBaja")
    protected String motivoBaja;

    /**
     * Obtiene el valor de la propiedad estadoTransmision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoTransmision() {
        return estadoTransmision;
    }

    /**
     * Define el valor de la propiedad estadoTransmision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoTransmision(String value) {
        this.estadoTransmision = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEstado.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEstado() {
        return fechaEstado;
    }

    /**
     * Define el valor de la propiedad fechaEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEstado(XMLGregorianCalendar value) {
        this.fechaEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoComunicado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoComunicado() {
        return codigoComunicado;
    }

    /**
     * Define el valor de la propiedad codigoComunicado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoComunicado(String value) {
        this.codigoComunicado = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoBaja.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoBaja() {
        return motivoBaja;
    }

    /**
     * Define el valor de la propiedad motivoBaja.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoBaja(String value) {
        this.motivoBaja = value;
    }

}
