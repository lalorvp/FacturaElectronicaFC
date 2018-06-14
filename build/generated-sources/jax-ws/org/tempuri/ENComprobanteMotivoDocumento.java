
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENComprobanteMotivoDocumento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENComprobanteMotivoDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdComprobanteMotivoDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdComprobante" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SerieDocRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroDocRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoMotivoEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sustentos" type="{http://tempuri.org/}ArrayOfENComprobanteMotivoDocumentoSustento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENComprobanteMotivoDocumento", propOrder = {
    "idComprobanteMotivoDocumento",
    "idComprobante",
    "serieDocRef",
    "numeroDocRef",
    "codigoMotivoEmision",
    "sustentos"
})
public class ENComprobanteMotivoDocumento {

    @XmlElement(name = "IdComprobanteMotivoDocumento")
    protected int idComprobanteMotivoDocumento;
    @XmlElement(name = "IdComprobante")
    protected int idComprobante;
    @XmlElement(name = "SerieDocRef")
    protected String serieDocRef;
    @XmlElement(name = "NumeroDocRef")
    protected String numeroDocRef;
    @XmlElement(name = "CodigoMotivoEmision")
    protected String codigoMotivoEmision;
    @XmlElement(name = "Sustentos")
    protected ArrayOfENComprobanteMotivoDocumentoSustento sustentos;

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
     * Obtiene el valor de la propiedad serieDocRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieDocRef() {
        return serieDocRef;
    }

    /**
     * Define el valor de la propiedad serieDocRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieDocRef(String value) {
        this.serieDocRef = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocRef() {
        return numeroDocRef;
    }

    /**
     * Define el valor de la propiedad numeroDocRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocRef(String value) {
        this.numeroDocRef = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMotivoEmision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMotivoEmision() {
        return codigoMotivoEmision;
    }

    /**
     * Define el valor de la propiedad codigoMotivoEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMotivoEmision(String value) {
        this.codigoMotivoEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad sustentos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComprobanteMotivoDocumentoSustento }
     *     
     */
    public ArrayOfENComprobanteMotivoDocumentoSustento getSustentos() {
        return sustentos;
    }

    /**
     * Define el valor de la propiedad sustentos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComprobanteMotivoDocumentoSustento }
     *     
     */
    public void setSustentos(ArrayOfENComprobanteMotivoDocumentoSustento value) {
        this.sustentos = value;
    }

}
