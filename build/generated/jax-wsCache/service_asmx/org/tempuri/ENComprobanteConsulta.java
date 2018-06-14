
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENComprobanteConsulta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENComprobanteConsulta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NComunicacionBaja" type="{http://tempuri.org/}ENComprobanteComunicadoBaja" minOccurs="0"/>
 *         &lt;element name="NResumenDiario" type="{http://tempuri.org/}ENComprobanteResumenDiario" minOccurs="0"/>
 *         &lt;element name="NComprobante" type="{http://tempuri.org/}ENComprobanteN" minOccurs="0"/>
 *         &lt;element name="TipoConsulta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RucEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PuntoVentaConfiguracion" type="{http://tempuri.org/}ENPuntoVentaConfiguracion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENComprobanteConsulta", propOrder = {
    "nComunicacionBaja",
    "nResumenDiario",
    "nComprobante",
    "tipoConsulta",
    "rucEmpresa",
    "puntoVentaConfiguracion"
})
public class ENComprobanteConsulta {

    @XmlElement(name = "NComunicacionBaja")
    protected ENComprobanteComunicadoBaja nComunicacionBaja;
    @XmlElement(name = "NResumenDiario")
    protected ENComprobanteResumenDiario nResumenDiario;
    @XmlElement(name = "NComprobante")
    protected ENComprobanteN nComprobante;
    @XmlElement(name = "TipoConsulta")
    protected int tipoConsulta;
    @XmlElement(name = "RucEmpresa")
    protected String rucEmpresa;
    @XmlElement(name = "PuntoVentaConfiguracion")
    protected ENPuntoVentaConfiguracion puntoVentaConfiguracion;

    /**
     * Obtiene el valor de la propiedad nComunicacionBaja.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobanteComunicadoBaja }
     *     
     */
    public ENComprobanteComunicadoBaja getNComunicacionBaja() {
        return nComunicacionBaja;
    }

    /**
     * Define el valor de la propiedad nComunicacionBaja.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobanteComunicadoBaja }
     *     
     */
    public void setNComunicacionBaja(ENComprobanteComunicadoBaja value) {
        this.nComunicacionBaja = value;
    }

    /**
     * Obtiene el valor de la propiedad nResumenDiario.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobanteResumenDiario }
     *     
     */
    public ENComprobanteResumenDiario getNResumenDiario() {
        return nResumenDiario;
    }

    /**
     * Define el valor de la propiedad nResumenDiario.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobanteResumenDiario }
     *     
     */
    public void setNResumenDiario(ENComprobanteResumenDiario value) {
        this.nResumenDiario = value;
    }

    /**
     * Obtiene el valor de la propiedad nComprobante.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobanteN }
     *     
     */
    public ENComprobanteN getNComprobante() {
        return nComprobante;
    }

    /**
     * Define el valor de la propiedad nComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobanteN }
     *     
     */
    public void setNComprobante(ENComprobanteN value) {
        this.nComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoConsulta.
     * 
     */
    public int getTipoConsulta() {
        return tipoConsulta;
    }

    /**
     * Define el valor de la propiedad tipoConsulta.
     * 
     */
    public void setTipoConsulta(int value) {
        this.tipoConsulta = value;
    }

    /**
     * Obtiene el valor de la propiedad rucEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucEmpresa() {
        return rucEmpresa;
    }

    /**
     * Define el valor de la propiedad rucEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucEmpresa(String value) {
        this.rucEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad puntoVentaConfiguracion.
     * 
     * @return
     *     possible object is
     *     {@link ENPuntoVentaConfiguracion }
     *     
     */
    public ENPuntoVentaConfiguracion getPuntoVentaConfiguracion() {
        return puntoVentaConfiguracion;
    }

    /**
     * Define el valor de la propiedad puntoVentaConfiguracion.
     * 
     * @param value
     *     allowed object is
     *     {@link ENPuntoVentaConfiguracion }
     *     
     */
    public void setPuntoVentaConfiguracion(ENPuntoVentaConfiguracion value) {
        this.puntoVentaConfiguracion = value;
    }

}
