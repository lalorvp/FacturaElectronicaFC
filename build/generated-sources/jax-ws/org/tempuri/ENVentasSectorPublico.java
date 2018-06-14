
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENVentasSectorPublico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENVentasSectorPublico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroExpediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoUnidadEjecutora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENVentasSectorPublico", propOrder = {
    "numeroExpediente",
    "codigoUnidadEjecutora",
    "numeroContrato",
    "numeroProceso"
})
public class ENVentasSectorPublico {

    @XmlElement(name = "NumeroExpediente")
    protected String numeroExpediente;
    @XmlElement(name = "CodigoUnidadEjecutora")
    protected String codigoUnidadEjecutora;
    @XmlElement(name = "NumeroContrato")
    protected String numeroContrato;
    @XmlElement(name = "NumeroProceso")
    protected String numeroProceso;

    /**
     * Obtiene el valor de la propiedad numeroExpediente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    /**
     * Define el valor de la propiedad numeroExpediente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroExpediente(String value) {
        this.numeroExpediente = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUnidadEjecutora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUnidadEjecutora() {
        return codigoUnidadEjecutora;
    }

    /**
     * Define el valor de la propiedad codigoUnidadEjecutora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUnidadEjecutora(String value) {
        this.codigoUnidadEjecutora = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroContrato() {
        return numeroContrato;
    }

    /**
     * Define el valor de la propiedad numeroContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroContrato(String value) {
        this.numeroContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroProceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProceso() {
        return numeroProceso;
    }

    /**
     * Define el valor de la propiedad numeroProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProceso(String value) {
        this.numeroProceso = value;
    }

}
