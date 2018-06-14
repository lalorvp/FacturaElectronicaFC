
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ENLeido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENLeido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Activo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FechaLeido" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENLeido", propOrder = {
    "activo",
    "fechaLeido"
})
public class ENLeido {

    @XmlElement(name = "Activo")
    protected boolean activo;
    @XmlElement(name = "FechaLeido", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaLeido;

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
     * Obtiene el valor de la propiedad fechaLeido.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaLeido() {
        return fechaLeido;
    }

    /**
     * Define el valor de la propiedad fechaLeido.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaLeido(XMLGregorianCalendar value) {
        this.fechaLeido = value;
    }

}
