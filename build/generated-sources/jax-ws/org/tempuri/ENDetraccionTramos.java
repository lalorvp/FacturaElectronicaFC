
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENDetraccionTramos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENDetraccionTramos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoUbigeoOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoUbigeoDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorReferencial" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENDetraccionTramos", propOrder = {
    "codigoUbigeoOrigen",
    "codigoUbigeoDestino",
    "descripcion",
    "valorReferencial"
})
public class ENDetraccionTramos {

    @XmlElement(name = "CodigoUbigeoOrigen")
    protected String codigoUbigeoOrigen;
    @XmlElement(name = "CodigoUbigeoDestino")
    protected String codigoUbigeoDestino;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "ValorReferencial")
    protected double valorReferencial;

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
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad valorReferencial.
     * 
     */
    public double getValorReferencial() {
        return valorReferencial;
    }

    /**
     * Define el valor de la propiedad valorReferencial.
     * 
     */
    public void setValorReferencial(double value) {
        this.valorReferencial = value;
    }

}
