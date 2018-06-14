
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ENCorreoConsulta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENCorreoConsulta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoCorreo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="De" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Para" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Asunto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaRegistro" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaEnvio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MensajeCancelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENCorreoConsulta", propOrder = {
    "tipoCorreo",
    "de",
    "para",
    "asunto",
    "fechaRegistro",
    "fechaEnvio",
    "estado",
    "mensajeCancelacion"
})
public class ENCorreoConsulta {

    @XmlElement(name = "TipoCorreo")
    protected String tipoCorreo;
    @XmlElement(name = "De")
    protected String de;
    @XmlElement(name = "Para")
    protected String para;
    @XmlElement(name = "Asunto")
    protected String asunto;
    @XmlElement(name = "FechaRegistro", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElement(name = "FechaEnvio", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEnvio;
    @XmlElement(name = "Estado")
    protected int estado;
    @XmlElement(name = "MensajeCancelacion")
    protected String mensajeCancelacion;

    /**
     * Obtiene el valor de la propiedad tipoCorreo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCorreo() {
        return tipoCorreo;
    }

    /**
     * Define el valor de la propiedad tipoCorreo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCorreo(String value) {
        this.tipoCorreo = value;
    }

    /**
     * Obtiene el valor de la propiedad de.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDe() {
        return de;
    }

    /**
     * Define el valor de la propiedad de.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDe(String value) {
        this.de = value;
    }

    /**
     * Obtiene el valor de la propiedad para.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPara() {
        return para;
    }

    /**
     * Define el valor de la propiedad para.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPara(String value) {
        this.para = value;
    }

    /**
     * Obtiene el valor de la propiedad asunto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsunto() {
        return asunto;
    }

    /**
     * Define el valor de la propiedad asunto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsunto(String value) {
        this.asunto = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRegistro.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Define el valor de la propiedad fechaRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRegistro(XMLGregorianCalendar value) {
        this.fechaRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEnvio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEnvio() {
        return fechaEnvio;
    }

    /**
     * Define el valor de la propiedad fechaEnvio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEnvio(XMLGregorianCalendar value) {
        this.fechaEnvio = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     */
    public int getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     */
    public void setEstado(int value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajeCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeCancelacion() {
        return mensajeCancelacion;
    }

    /**
     * Define el valor de la propiedad mensajeCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeCancelacion(String value) {
        this.mensajeCancelacion = value;
    }

}
