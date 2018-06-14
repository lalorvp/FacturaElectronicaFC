
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENComprobanteMotivoDocumentoSustento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENComprobanteMotivoDocumentoSustento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdComprobanteSustentoMotivoDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdComprobanteMotivoDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Sustento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENComprobanteMotivoDocumentoSustento", propOrder = {
    "idComprobanteSustentoMotivoDocumento",
    "idComprobanteMotivoDocumento",
    "sustento"
})
public class ENComprobanteMotivoDocumentoSustento {

    @XmlElement(name = "IdComprobanteSustentoMotivoDocumento")
    protected int idComprobanteSustentoMotivoDocumento;
    @XmlElement(name = "IdComprobanteMotivoDocumento")
    protected int idComprobanteMotivoDocumento;
    @XmlElement(name = "Sustento")
    protected String sustento;

    /**
     * Obtiene el valor de la propiedad idComprobanteSustentoMotivoDocumento.
     * 
     */
    public int getIdComprobanteSustentoMotivoDocumento() {
        return idComprobanteSustentoMotivoDocumento;
    }

    /**
     * Define el valor de la propiedad idComprobanteSustentoMotivoDocumento.
     * 
     */
    public void setIdComprobanteSustentoMotivoDocumento(int value) {
        this.idComprobanteSustentoMotivoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad idComprobanteMotivoDocumento.
     * 
     */
    public int getIdComprobanteMotivoDocumento() {
        return idComprobanteMotivoDocumento;
    }

    /**
     * Define el valor de la propiedad idComprobanteMotivoDocumento.
     * 
     */
    public void setIdComprobanteMotivoDocumento(int value) {
        this.idComprobanteMotivoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad sustento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSustento() {
        return sustento;
    }

    /**
     * Define el valor de la propiedad sustento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSustento(String value) {
        this.sustento = value;
    }

}
