
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENPeticionInformacionComprobante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENPeticionInformacionComprobante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoBarra" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CodigoHash" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RucEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENPeticionInformacionComprobante", propOrder = {
    "codigoBarra",
    "codigoHash",
    "numero",
    "serie",
    "tipoComprobante",
    "rucEmisor"
})
public class ENPeticionInformacionComprobante {

    @XmlElement(name = "CodigoBarra")
    protected boolean codigoBarra;
    @XmlElement(name = "CodigoHash")
    protected boolean codigoHash;
    protected String numero;
    protected String serie;
    @XmlElement(name = "TipoComprobante")
    protected String tipoComprobante;
    @XmlElement(name = "RucEmisor")
    protected String rucEmisor;

    /**
     * Obtiene el valor de la propiedad codigoBarra.
     * 
     */
    public boolean isCodigoBarra() {
        return codigoBarra;
    }

    /**
     * Define el valor de la propiedad codigoBarra.
     * 
     */
    public void setCodigoBarra(boolean value) {
        this.codigoBarra = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoHash.
     * 
     */
    public boolean isCodigoHash() {
        return codigoHash;
    }

    /**
     * Define el valor de la propiedad codigoHash.
     * 
     */
    public void setCodigoHash(boolean value) {
        this.codigoHash = value;
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
     * Obtiene el valor de la propiedad rucEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucEmisor() {
        return rucEmisor;
    }

    /**
     * Define el valor de la propiedad rucEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucEmisor(String value) {
        this.rucEmisor = value;
    }

}
