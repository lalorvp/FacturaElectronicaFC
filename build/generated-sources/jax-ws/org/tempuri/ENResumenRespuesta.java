
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ENResumenRespuesta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENResumenRespuesta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NombreResumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaEmisionResumen" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaRespuesta" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IdResumenCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DescripcionRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetalleRespuesta" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="TipoResumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENResumenRespuesta", propOrder = {
    "nombreResumen",
    "fechaEmisionResumen",
    "fechaRespuesta",
    "idResumenCliente",
    "codigoRespuesta",
    "descripcionRespuesta",
    "detalleRespuesta",
    "tipoResumen"
})
public class ENResumenRespuesta {

    @XmlElement(name = "NombreResumen")
    protected String nombreResumen;
    @XmlElement(name = "FechaEmisionResumen", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEmisionResumen;
    @XmlElement(name = "FechaRespuesta", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRespuesta;
    @XmlElement(name = "IdResumenCliente")
    protected int idResumenCliente;
    @XmlElement(name = "CodigoRespuesta")
    protected int codigoRespuesta;
    @XmlElement(name = "DescripcionRespuesta")
    protected String descripcionRespuesta;
    @XmlElement(name = "DetalleRespuesta")
    protected ArrayOfString detalleRespuesta;
    @XmlElement(name = "TipoResumen")
    protected String tipoResumen;

    /**
     * Obtiene el valor de la propiedad nombreResumen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreResumen() {
        return nombreResumen;
    }

    /**
     * Define el valor de la propiedad nombreResumen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreResumen(String value) {
        this.nombreResumen = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmisionResumen.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEmisionResumen() {
        return fechaEmisionResumen;
    }

    /**
     * Define el valor de la propiedad fechaEmisionResumen.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEmisionResumen(XMLGregorianCalendar value) {
        this.fechaEmisionResumen = value;
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
     * Obtiene el valor de la propiedad codigoRespuesta.
     * 
     */
    public int getCodigoRespuesta() {
        return codigoRespuesta;
    }

    /**
     * Define el valor de la propiedad codigoRespuesta.
     * 
     */
    public void setCodigoRespuesta(int value) {
        this.codigoRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionRespuesta() {
        return descripcionRespuesta;
    }

    /**
     * Define el valor de la propiedad descripcionRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionRespuesta(String value) {
        this.descripcionRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getDetalleRespuesta() {
        return detalleRespuesta;
    }

    /**
     * Define el valor de la propiedad detalleRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setDetalleRespuesta(ArrayOfString value) {
        this.detalleRespuesta = value;
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

}
