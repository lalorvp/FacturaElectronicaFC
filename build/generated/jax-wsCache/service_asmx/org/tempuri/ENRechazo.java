
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ENRechazo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENRechazo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Activo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FechaRechazo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MotivoRechazo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENRechazo", propOrder = {
    "activo",
    "fechaRechazo",
    "motivoRechazo"
})
public class ENRechazo {

    @XmlElement(name = "Activo")
    protected boolean activo;
    @XmlElement(name = "FechaRechazo", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRechazo;
    @XmlElement(name = "MotivoRechazo")
    protected String motivoRechazo;

    /**
     * Obtiene el valor de la propiedad activo.
     * 
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * Define el valor de la propiedad activo.
     * 
     */
    public void setActivo(boolean value) {
        this.activo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRechazo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRechazo() {
        return fechaRechazo;
    }

    /**
     * Define el valor de la propiedad fechaRechazo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRechazo(XMLGregorianCalendar value) {
        this.fechaRechazo = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoRechazo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoRechazo() {
        return motivoRechazo;
    }

    /**
     * Define el valor de la propiedad motivoRechazo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoRechazo(String value) {
        this.motivoRechazo = value;
    }

}
