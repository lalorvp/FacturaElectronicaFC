
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENHospedajeDetalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENHospedajeDetalle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoPaisPasaporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoPaisResidencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaIngresoPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaIngreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaSalida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiasPermanencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FechaConsumo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RazonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENHospedajeDetalle", propOrder = {
    "codigoPaisPasaporte",
    "codigoPaisResidencia",
    "fechaIngresoPais",
    "fechaIngreso",
    "fechaSalida",
    "diasPermanencia",
    "fechaConsumo",
    "razonSocial",
    "codigoTipoDocumento",
    "numeroDocumento"
})
public class ENHospedajeDetalle {

    @XmlElement(name = "CodigoPaisPasaporte")
    protected String codigoPaisPasaporte;
    @XmlElement(name = "CodigoPaisResidencia")
    protected String codigoPaisResidencia;
    @XmlElement(name = "FechaIngresoPais")
    protected String fechaIngresoPais;
    @XmlElement(name = "FechaIngreso")
    protected String fechaIngreso;
    @XmlElement(name = "FechaSalida")
    protected String fechaSalida;
    @XmlElement(name = "DiasPermanencia")
    protected int diasPermanencia;
    @XmlElement(name = "FechaConsumo")
    protected String fechaConsumo;
    @XmlElement(name = "RazonSocial")
    protected String razonSocial;
    @XmlElement(name = "CodigoTipoDocumento")
    protected String codigoTipoDocumento;
    @XmlElement(name = "NumeroDocumento")
    protected String numeroDocumento;

    /**
     * Obtiene el valor de la propiedad codigoPaisPasaporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPaisPasaporte() {
        return codigoPaisPasaporte;
    }

    /**
     * Define el valor de la propiedad codigoPaisPasaporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPaisPasaporte(String value) {
        this.codigoPaisPasaporte = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPaisResidencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPaisResidencia() {
        return codigoPaisResidencia;
    }

    /**
     * Define el valor de la propiedad codigoPaisResidencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPaisResidencia(String value) {
        this.codigoPaisResidencia = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaIngresoPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaIngresoPais() {
        return fechaIngresoPais;
    }

    /**
     * Define el valor de la propiedad fechaIngresoPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaIngresoPais(String value) {
        this.fechaIngresoPais = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaIngreso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Define el valor de la propiedad fechaIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaIngreso(String value) {
        this.fechaIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaSalida() {
        return fechaSalida;
    }

    /**
     * Define el valor de la propiedad fechaSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaSalida(String value) {
        this.fechaSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad diasPermanencia.
     * 
     */
    public int getDiasPermanencia() {
        return diasPermanencia;
    }

    /**
     * Define el valor de la propiedad diasPermanencia.
     * 
     */
    public void setDiasPermanencia(int value) {
        this.diasPermanencia = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaConsumo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaConsumo() {
        return fechaConsumo;
    }

    /**
     * Define el valor de la propiedad fechaConsumo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaConsumo(String value) {
        this.fechaConsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Define el valor de la propiedad razonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoDocumento() {
        return codigoTipoDocumento;
    }

    /**
     * Define el valor de la propiedad codigoTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoDocumento(String value) {
        this.codigoTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define el valor de la propiedad numeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

}
