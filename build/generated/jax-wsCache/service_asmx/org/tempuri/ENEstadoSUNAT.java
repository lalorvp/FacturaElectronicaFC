
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ENEstadoSUNAT complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENEstadoSUNAT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EstadoSUNAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaEstado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MensajeEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENEstadoSUNAT", propOrder = {
    "estadoSUNAT",
    "fechaEstado",
    "mensajeEstado"
})
public class ENEstadoSUNAT {

    @XmlElement(name = "EstadoSUNAT")
    protected String estadoSUNAT;
    @XmlElement(name = "FechaEstado", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEstado;
    @XmlElement(name = "MensajeEstado")
    protected String mensajeEstado;

    /**
     * Obtiene el valor de la propiedad estadoSUNAT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoSUNAT() {
        return estadoSUNAT;
    }

    /**
     * Define el valor de la propiedad estadoSUNAT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoSUNAT(String value) {
        this.estadoSUNAT = value;
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
     * Obtiene el valor de la propiedad mensajeEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeEstado() {
        return mensajeEstado;
    }

    /**
     * Define el valor de la propiedad mensajeEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeEstado(String value) {
        this.mensajeEstado = value;
    }

}
