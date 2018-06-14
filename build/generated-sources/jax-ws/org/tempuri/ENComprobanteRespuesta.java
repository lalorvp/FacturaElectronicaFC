
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ENComprobanteRespuesta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENComprobanteRespuesta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdComprobanteCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DescripcionRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaRespuesta" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DetalleRespuesta" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENComprobanteRespuesta", propOrder = {
    "tipoComprobante",
    "serie",
    "numero",
    "idComprobanteCliente",
    "codigoRespuesta",
    "descripcionRespuesta",
    "fechaRespuesta",
    "detalleRespuesta"
})
public class ENComprobanteRespuesta {

    @XmlElement(name = "TipoComprobante")
    protected String tipoComprobante;
    @XmlElement(name = "Serie")
    protected String serie;
    @XmlElement(name = "Numero")
    protected String numero;
    @XmlElement(name = "IdComprobanteCliente")
    protected String idComprobanteCliente;
    @XmlElement(name = "CodigoRespuesta")
    protected int codigoRespuesta;
    @XmlElement(name = "DescripcionRespuesta")
    protected String descripcionRespuesta;
    @XmlElement(name = "FechaRespuesta", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRespuesta;
    @XmlElement(name = "DetalleRespuesta")
    protected ArrayOfString detalleRespuesta;

    /**
     * Obtiene el valor de la propiedad tipoComprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoComprobante() {
        return tipoComprobante;
    }

    /**
     * Define el valor de la propiedad tipoComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoComprobante(String value) {
        this.tipoComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Define el valor de la propiedad serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad idComprobanteCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdComprobanteCliente() {
        return idComprobanteCliente;
    }

    /**
     * Define el valor de la propiedad idComprobanteCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdComprobanteCliente(String value) {
        this.idComprobanteCliente = value;
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

}
