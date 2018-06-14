
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oGeneral" type="{http://tempuri.org/}General" minOccurs="0"/>
 *         &lt;element name="oTipoComprobante" type="{http://tempuri.org/}TipoDocumento"/>
 *         &lt;element name="Cadena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoCodigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodigoBarras" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="CodigoHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListaError" type="{http://tempuri.org/}ArrayOfENErrorComunicacion" minOccurs="0"/>
 *         &lt;element name="IdComprobanteCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Otorgar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "oGeneral",
    "oTipoComprobante",
    "cadena",
    "tipoCodigo",
    "codigoBarras",
    "codigoHash",
    "listaError",
    "idComprobanteCliente",
    "otorgar"
})
@XmlRootElement(name = "Registrar")
public class Registrar {

    protected General oGeneral;
    @XmlElement(required = true)
    protected TipoDocumento oTipoComprobante;
    @XmlElement(name = "Cadena")
    protected String cadena;
    @XmlElement(name = "TipoCodigo")
    protected int tipoCodigo;
    @XmlElement(name = "CodigoBarras")
    protected byte[] codigoBarras;
    @XmlElement(name = "CodigoHash")
    protected String codigoHash;
    @XmlElement(name = "ListaError")
    protected ArrayOfENErrorComunicacion listaError;
    @XmlElement(name = "IdComprobanteCliente")
    protected int idComprobanteCliente;
    @XmlElement(name = "Otorgar")
    protected String otorgar;

    /**
     * Obtiene el valor de la propiedad oGeneral.
     * 
     * @return
     *     possible object is
     *     {@link General }
     *     
     */
    public General getOGeneral() {
        return oGeneral;
    }

    /**
     * Define el valor de la propiedad oGeneral.
     * 
     * @param value
     *     allowed object is
     *     {@link General }
     *     
     */
    public void setOGeneral(General value) {
        this.oGeneral = value;
    }

    /**
     * Obtiene el valor de la propiedad oTipoComprobante.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumento }
     *     
     */
    public TipoDocumento getOTipoComprobante() {
        return oTipoComprobante;
    }

    /**
     * Define el valor de la propiedad oTipoComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumento }
     *     
     */
    public void setOTipoComprobante(TipoDocumento value) {
        this.oTipoComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad cadena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * Define el valor de la propiedad cadena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadena(String value) {
        this.cadena = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCodigo.
     * 
     */
    public int getTipoCodigo() {
        return tipoCodigo;
    }

    /**
     * Define el valor de la propiedad tipoCodigo.
     * 
     */
    public void setTipoCodigo(int value) {
        this.tipoCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoBarras.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCodigoBarras() {
        return codigoBarras;
    }

    /**
     * Define el valor de la propiedad codigoBarras.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCodigoBarras(byte[] value) {
        this.codigoBarras = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoHash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoHash() {
        return codigoHash;
    }

    /**
     * Define el valor de la propiedad codigoHash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoHash(String value) {
        this.codigoHash = value;
    }

    /**
     * Obtiene el valor de la propiedad listaError.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENErrorComunicacion }
     *     
     */
    public ArrayOfENErrorComunicacion getListaError() {
        return listaError;
    }

    /**
     * Define el valor de la propiedad listaError.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENErrorComunicacion }
     *     
     */
    public void setListaError(ArrayOfENErrorComunicacion value) {
        this.listaError = value;
    }

    /**
     * Obtiene el valor de la propiedad idComprobanteCliente.
     * 
     */
    public int getIdComprobanteCliente() {
        return idComprobanteCliente;
    }

    /**
     * Define el valor de la propiedad idComprobanteCliente.
     * 
     */
    public void setIdComprobanteCliente(int value) {
        this.idComprobanteCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad otorgar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtorgar() {
        return otorgar;
    }

    /**
     * Define el valor de la propiedad otorgar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtorgar(String value) {
        this.otorgar = value;
    }

}
