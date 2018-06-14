
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para General complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="General">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oENComprobante" type="{http://tempuri.org/}ENComprobante" minOccurs="0"/>
 *         &lt;element name="oENEmpresa" type="{http://tempuri.org/}ENEmpresa" minOccurs="0"/>
 *         &lt;element name="oENvendedor" type="{http://tempuri.org/}ENVendedor" minOccurs="0"/>
 *         &lt;element name="oENConsolidadoBoletas" type="{http://tempuri.org/}ENConsolidadoBoletas" minOccurs="0"/>
 *         &lt;element name="oENNumeradosNoEmitidosCab" type="{http://tempuri.org/}ENNumeradosNoEmitidosCab" minOccurs="0"/>
 *         &lt;element name="oENComprobanteSeguimiento" type="{http://tempuri.org/}ENComprobanteSeguimiento" minOccurs="0"/>
 *         &lt;element name="RutaParametro" type="{http://tempuri.org/}ENRutaParametro" minOccurs="0"/>
 *         &lt;element name="IdSeguimiento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UsuarioCertificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContrasenaCertificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContrasenaRepositorio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "General", propOrder = {
    "oenComprobante",
    "oenEmpresa",
    "oeNvendedor",
    "oenConsolidadoBoletas",
    "oenNumeradosNoEmitidosCab",
    "oenComprobanteSeguimiento",
    "rutaParametro",
    "idSeguimiento",
    "usuarioCertificado",
    "contrasenaCertificado",
    "contrasenaRepositorio"
})
public class General {

    @XmlElement(name = "oENComprobante")
    protected ENComprobante oenComprobante;
    @XmlElement(name = "oENEmpresa")
    protected ENEmpresa oenEmpresa;
    @XmlElement(name = "oENvendedor")
    protected ENVendedor oeNvendedor;
    @XmlElement(name = "oENConsolidadoBoletas")
    protected ENConsolidadoBoletas oenConsolidadoBoletas;
    @XmlElement(name = "oENNumeradosNoEmitidosCab")
    protected ENNumeradosNoEmitidosCab oenNumeradosNoEmitidosCab;
    @XmlElement(name = "oENComprobanteSeguimiento")
    protected ENComprobanteSeguimiento oenComprobanteSeguimiento;
    @XmlElement(name = "RutaParametro")
    protected ENRutaParametro rutaParametro;
    @XmlElement(name = "IdSeguimiento")
    protected int idSeguimiento;
    @XmlElement(name = "UsuarioCertificado")
    protected String usuarioCertificado;
    @XmlElement(name = "ContrasenaCertificado")
    protected String contrasenaCertificado;
    @XmlElement(name = "ContrasenaRepositorio")
    protected String contrasenaRepositorio;

    /**
     * Obtiene el valor de la propiedad oenComprobante.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante }
     *     
     */
    public ENComprobante getOENComprobante() {
        return oenComprobante;
    }

    /**
     * Define el valor de la propiedad oenComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante }
     *     
     */
    public void setOENComprobante(ENComprobante value) {
        this.oenComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad oenEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link ENEmpresa }
     *     
     */
    public ENEmpresa getOENEmpresa() {
        return oenEmpresa;
    }

    /**
     * Define el valor de la propiedad oenEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link ENEmpresa }
     *     
     */
    public void setOENEmpresa(ENEmpresa value) {
        this.oenEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad oeNvendedor.
     * 
     * @return
     *     possible object is
     *     {@link ENVendedor }
     *     
     */
    public ENVendedor getOENvendedor() {
        return oeNvendedor;
    }

    /**
     * Define el valor de la propiedad oeNvendedor.
     * 
     * @param value
     *     allowed object is
     *     {@link ENVendedor }
     *     
     */
    public void setOENvendedor(ENVendedor value) {
        this.oeNvendedor = value;
    }

    /**
     * Obtiene el valor de la propiedad oenConsolidadoBoletas.
     * 
     * @return
     *     possible object is
     *     {@link ENConsolidadoBoletas }
     *     
     */
    public ENConsolidadoBoletas getOENConsolidadoBoletas() {
        return oenConsolidadoBoletas;
    }

    /**
     * Define el valor de la propiedad oenConsolidadoBoletas.
     * 
     * @param value
     *     allowed object is
     *     {@link ENConsolidadoBoletas }
     *     
     */
    public void setOENConsolidadoBoletas(ENConsolidadoBoletas value) {
        this.oenConsolidadoBoletas = value;
    }

    /**
     * Obtiene el valor de la propiedad oenNumeradosNoEmitidosCab.
     * 
     * @return
     *     possible object is
     *     {@link ENNumeradosNoEmitidosCab }
     *     
     */
    public ENNumeradosNoEmitidosCab getOENNumeradosNoEmitidosCab() {
        return oenNumeradosNoEmitidosCab;
    }

    /**
     * Define el valor de la propiedad oenNumeradosNoEmitidosCab.
     * 
     * @param value
     *     allowed object is
     *     {@link ENNumeradosNoEmitidosCab }
     *     
     */
    public void setOENNumeradosNoEmitidosCab(ENNumeradosNoEmitidosCab value) {
        this.oenNumeradosNoEmitidosCab = value;
    }

    /**
     * Obtiene el valor de la propiedad oenComprobanteSeguimiento.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobanteSeguimiento }
     *     
     */
    public ENComprobanteSeguimiento getOENComprobanteSeguimiento() {
        return oenComprobanteSeguimiento;
    }

    /**
     * Define el valor de la propiedad oenComprobanteSeguimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobanteSeguimiento }
     *     
     */
    public void setOENComprobanteSeguimiento(ENComprobanteSeguimiento value) {
        this.oenComprobanteSeguimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad rutaParametro.
     * 
     * @return
     *     possible object is
     *     {@link ENRutaParametro }
     *     
     */
    public ENRutaParametro getRutaParametro() {
        return rutaParametro;
    }

    /**
     * Define el valor de la propiedad rutaParametro.
     * 
     * @param value
     *     allowed object is
     *     {@link ENRutaParametro }
     *     
     */
    public void setRutaParametro(ENRutaParametro value) {
        this.rutaParametro = value;
    }

    /**
     * Obtiene el valor de la propiedad idSeguimiento.
     * 
     */
    public int getIdSeguimiento() {
        return idSeguimiento;
    }

    /**
     * Define el valor de la propiedad idSeguimiento.
     * 
     */
    public void setIdSeguimiento(int value) {
        this.idSeguimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioCertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioCertificado() {
        return usuarioCertificado;
    }

    /**
     * Define el valor de la propiedad usuarioCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioCertificado(String value) {
        this.usuarioCertificado = value;
    }

    /**
     * Obtiene el valor de la propiedad contrasenaCertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasenaCertificado() {
        return contrasenaCertificado;
    }

    /**
     * Define el valor de la propiedad contrasenaCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasenaCertificado(String value) {
        this.contrasenaCertificado = value;
    }

    /**
     * Obtiene el valor de la propiedad contrasenaRepositorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasenaRepositorio() {
        return contrasenaRepositorio;
    }

    /**
     * Define el valor de la propiedad contrasenaRepositorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasenaRepositorio(String value) {
        this.contrasenaRepositorio = value;
    }

}
