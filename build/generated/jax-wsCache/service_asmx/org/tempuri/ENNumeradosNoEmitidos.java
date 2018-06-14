
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENNumeradosNoEmitidos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENNumeradosNoEmitidos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MotivoBaja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Item" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SerieDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ENNumeradosNoEmitidos", propOrder = {
    "id",
    "motivoBaja",
    "codigoTipoDocumento",
    "item",
    "serieDocumento",
    "numeroDocumento"
})
public class ENNumeradosNoEmitidos {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "MotivoBaja")
    protected String motivoBaja;
    @XmlElement(name = "CodigoTipoDocumento")
    protected String codigoTipoDocumento;
    @XmlElement(name = "Item")
    protected int item;
    @XmlElement(name = "SerieDocumento")
    protected String serieDocumento;
    @XmlElement(name = "NumeroDocumento")
    protected String numeroDocumento;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoBaja.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoBaja() {
        return motivoBaja;
    }

    /**
     * Define el valor de la propiedad motivoBaja.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoBaja(String value) {
        this.motivoBaja = value;
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
     * Obtiene el valor de la propiedad item.
     * 
     */
    public int getItem() {
        return item;
    }

    /**
     * Define el valor de la propiedad item.
     * 
     */
    public void setItem(int value) {
        this.item = value;
    }

    /**
     * Obtiene el valor de la propiedad serieDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieDocumento() {
        return serieDocumento;
    }

    /**
     * Define el valor de la propiedad serieDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieDocumento(String value) {
        this.serieDocumento = value;
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
