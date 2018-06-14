
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ENRespuestaResumen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENRespuestaResumen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdResumenCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TipoResumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Respuesta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FechaRespuesta" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DescripcionRespuesta" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Motivo" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENRespuestaResumen", propOrder = {
    "idResumenCliente",
    "tipoResumen",
    "respuesta",
    "fechaRespuesta",
    "descripcionRespuesta",
    "motivo"
})
public class ENRespuestaResumen {

    @XmlElement(name = "IdResumenCliente")
    protected int idResumenCliente;
    @XmlElement(name = "TipoResumen")
    protected String tipoResumen;
    @XmlElement(name = "Respuesta")
    protected int respuesta;
    @XmlElement(name = "FechaRespuesta", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRespuesta;
    @XmlElement(name = "DescripcionRespuesta")
    protected ArrayOfString descripcionRespuesta;
    @XmlElement(name = "Motivo")
    protected ArrayOfString motivo;

    /**
     * Obtiene el valor de la propiedad idResumenCliente.
     * 
     */
    public int getIdResumenCliente() {
        return idResumenCliente;
    }

    /**
     * Define el valor de la propiedad idResumenCliente.
     * 
     */
    public void setIdResumenCliente(int value) {
        this.idResumenCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoResumen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoResumen() {
        return tipoResumen;
    }

    /**
     * Define el valor de la propiedad tipoResumen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoResumen(String value) {
        this.tipoResumen = value;
    }

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     */
    public int getRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     */
    public void setRespuesta(int value) {
        this.respuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRespuesta() {
        return fechaRespuesta;
    }

    /**
     * Define el valor de la propiedad fechaRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRespuesta(XMLGregorianCalendar value) {
        this.fechaRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getDescripcionRespuesta() {
        return descripcionRespuesta;
    }

    /**
     * Define el valor de la propiedad descripcionRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setDescripcionRespuesta(ArrayOfString value) {
        this.descripcionRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad motivo.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getMotivo() {
        return motivo;
    }

    /**
     * Define el valor de la propiedad motivo.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setMotivo(ArrayOfString value) {
        this.motivo = value;
    }

}
