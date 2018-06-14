
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENDetraccionCarga complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENDetraccionCarga">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoUbigeoOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DireccionOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoUbigeoDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DireccionDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetalleViaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorReferencialTrans" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ValorReferencialEfectiva" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ValorReferencialUtil" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENDetraccionCarga", propOrder = {
    "codigoUbigeoOrigen",
    "direccionOrigen",
    "codigoUbigeoDestino",
    "direccionDestino",
    "detalleViaje",
    "valorReferencialTrans",
    "valorReferencialEfectiva",
    "valorReferencialUtil"
})
public class ENDetraccionCarga {

    @XmlElement(name = "CodigoUbigeoOrigen")
    protected String codigoUbigeoOrigen;
    @XmlElement(name = "DireccionOrigen")
    protected String direccionOrigen;
    @XmlElement(name = "CodigoUbigeoDestino")
    protected String codigoUbigeoDestino;
    @XmlElement(name = "DireccionDestino")
    protected String direccionDestino;
    @XmlElement(name = "DetalleViaje")
    protected String detalleViaje;
    @XmlElement(name = "ValorReferencialTrans")
    protected double valorReferencialTrans;
    @XmlElement(name = "ValorReferencialEfectiva")
    protected double valorReferencialEfectiva;
    @XmlElement(name = "ValorReferencialUtil")
    protected double valorReferencialUtil;

    /**
     * Obtiene el valor de la propiedad codigoUbigeoOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUbigeoOrigen() {
        return codigoUbigeoOrigen;
    }

    /**
     * Define el valor de la propiedad codigoUbigeoOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUbigeoOrigen(String value) {
        this.codigoUbigeoOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionOrigen() {
        return direccionOrigen;
    }

    /**
     * Define el valor de la propiedad direccionOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionOrigen(String value) {
        this.direccionOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUbigeoDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUbigeoDestino() {
        return codigoUbigeoDestino;
    }

    /**
     * Define el valor de la propiedad codigoUbigeoDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUbigeoDestino(String value) {
        this.codigoUbigeoDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionDestino() {
        return direccionDestino;
    }

    /**
     * Define el valor de la propiedad direccionDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionDestino(String value) {
        this.direccionDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleViaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalleViaje() {
        return detalleViaje;
    }

    /**
     * Define el valor de la propiedad detalleViaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalleViaje(String value) {
        this.detalleViaje = value;
    }

    /**
     * Obtiene el valor de la propiedad valorReferencialTrans.
     * 
     */
    public double getValorReferencialTrans() {
        return valorReferencialTrans;
    }

    /**
     * Define el valor de la propiedad valorReferencialTrans.
     * 
     */
    public void setValorReferencialTrans(double value) {
        this.valorReferencialTrans = value;
    }

    /**
     * Obtiene el valor de la propiedad valorReferencialEfectiva.
     * 
     */
    public double getValorReferencialEfectiva() {
        return valorReferencialEfectiva;
    }

    /**
     * Define el valor de la propiedad valorReferencialEfectiva.
     * 
     */
    public void setValorReferencialEfectiva(double value) {
        this.valorReferencialEfectiva = value;
    }

    /**
     * Obtiene el valor de la propiedad valorReferencialUtil.
     * 
     */
    public double getValorReferencialUtil() {
        return valorReferencialUtil;
    }

    /**
     * Define el valor de la propiedad valorReferencialUtil.
     * 
     */
    public void setValorReferencialUtil(double value) {
        this.valorReferencialUtil = value;
    }

}
