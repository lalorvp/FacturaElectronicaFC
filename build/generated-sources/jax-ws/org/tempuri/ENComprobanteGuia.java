
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ENComprobanteGuia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENComprobanteGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdComprobanteGuia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdComprobante" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDocReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENComprobanteGuia", propOrder = {
    "idComprobanteGuia",
    "idComprobante",
    "numero",
    "serie",
    "codigo",
    "tipoDocReferencia",
    "fecha"
})
public class ENComprobanteGuia {

    @XmlElement(name = "IdComprobanteGuia")
    protected int idComprobanteGuia;
    @XmlElement(name = "IdComprobante")
    protected int idComprobante;
    @XmlElement(name = "Numero")
    protected String numero;
    @XmlElement(name = "Serie")
    protected String serie;
    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "TipoDocReferencia")
    protected String tipoDocReferencia;
    @XmlElement(name = "Fecha", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;

    /**
     * Obtiene el valor de la propiedad idComprobanteGuia.
     * 
     */
    public int getIdComprobanteGuia() {
        return idComprobanteGuia;
    }

    /**
     * Define el valor de la propiedad idComprobanteGuia.
     * 
     */
    public void setIdComprobanteGuia(int value) {
        this.idComprobanteGuia = value;
    }

    /**
     * Obtiene el valor de la propiedad idComprobante.
     * 
     */
    public int getIdComprobante() {
        return idComprobante;
    }

    /**
     * Define el valor de la propiedad idComprobante.
     * 
     */
    public void setIdComprobante(int value) {
        this.idComprobante = value;
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
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocReferencia() {
        return tipoDocReferencia;
    }

    /**
     * Define el valor de la propiedad tipoDocReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocReferencia(String value) {
        this.tipoDocReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

}
