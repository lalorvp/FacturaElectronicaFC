
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ENOtorgado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENOtorgado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Activo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FechaOtorgado" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENOtorgado", propOrder = {
    "activo",
    "fechaOtorgado"
})
public class ENOtorgado {

    @XmlElement(name = "Activo")
    protected boolean activo;
    @XmlElement(name = "FechaOtorgado", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaOtorgado;

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
     * Obtiene el valor de la propiedad fechaOtorgado.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaOtorgado() {
        return fechaOtorgado;
    }

    /**
     * Define el valor de la propiedad fechaOtorgado.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaOtorgado(XMLGregorianCalendar value) {
        this.fechaOtorgado = value;
    }

}
