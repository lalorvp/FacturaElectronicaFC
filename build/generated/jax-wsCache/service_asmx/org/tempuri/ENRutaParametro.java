
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENRutaParametro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENRutaParametro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParamConfRutaLog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParamConfCertificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParamConfArchivoXSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParamConfRutaError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParamConfRutaProcesaOk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParamConfRutaMailbox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParamConfCasillaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParamConfCasillaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParamConfRutaSAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParamConfRutaBandejaSalida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParamConfRutaRptaProcesado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParamConfRutaAdjuntos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParamConfRutaRepositorio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParamConfClaveRepositorio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParamConfClaveCertificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENRutaParametro", propOrder = {
    "paramConfRutaLog",
    "paramConfCertificado",
    "paramConfArchivoXSD",
    "paramConfRutaError",
    "paramConfRutaProcesaOk",
    "paramConfRutaMailbox",
    "paramConfCasillaOrigen",
    "paramConfCasillaDestino",
    "paramConfRutaSAT",
    "paramConfRutaBandejaSalida",
    "paramConfRutaRptaProcesado",
    "paramConfRutaAdjuntos",
    "paramConfRutaRepositorio",
    "paramConfClaveRepositorio",
    "paramConfClaveCertificado"
})
public class ENRutaParametro {

    @XmlElement(name = "ParamConfRutaLog")
    protected String paramConfRutaLog;
    @XmlElement(name = "ParamConfCertificado")
    protected String paramConfCertificado;
    @XmlElement(name = "ParamConfArchivoXSD")
    protected String paramConfArchivoXSD;
    @XmlElement(name = "ParamConfRutaError")
    protected String paramConfRutaError;
    @XmlElement(name = "ParamConfRutaProcesaOk")
    protected String paramConfRutaProcesaOk;
    @XmlElement(name = "ParamConfRutaMailbox")
    protected String paramConfRutaMailbox;
    @XmlElement(name = "ParamConfCasillaOrigen")
    protected String paramConfCasillaOrigen;
    @XmlElement(name = "ParamConfCasillaDestino")
    protected String paramConfCasillaDestino;
    @XmlElement(name = "ParamConfRutaSAT")
    protected String paramConfRutaSAT;
    @XmlElement(name = "ParamConfRutaBandejaSalida")
    protected String paramConfRutaBandejaSalida;
    @XmlElement(name = "ParamConfRutaRptaProcesado")
    protected String paramConfRutaRptaProcesado;
    @XmlElement(name = "ParamConfRutaAdjuntos")
    protected String paramConfRutaAdjuntos;
    @XmlElement(name = "ParamConfRutaRepositorio")
    protected String paramConfRutaRepositorio;
    @XmlElement(name = "ParamConfClaveRepositorio")
    protected String paramConfClaveRepositorio;
    @XmlElement(name = "ParamConfClaveCertificado")
    protected String paramConfClaveCertificado;

    /**
     * Obtiene el valor de la propiedad paramConfRutaLog.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamConfRutaLog() {
        return paramConfRutaLog;
    }

    /**
     * Define el valor de la propiedad paramConfRutaLog.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamConfRutaLog(String value) {
        this.paramConfRutaLog = value;
    }

    /**
     * Obtiene el valor de la propiedad paramConfCertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamConfCertificado() {
        return paramConfCertificado;
    }

    /**
     * Define el valor de la propiedad paramConfCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamConfCertificado(String value) {
        this.paramConfCertificado = value;
    }

    /**
     * Obtiene el valor de la propiedad paramConfArchivoXSD.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamConfArchivoXSD() {
        return paramConfArchivoXSD;
    }

    /**
     * Define el valor de la propiedad paramConfArchivoXSD.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamConfArchivoXSD(String value) {
        this.paramConfArchivoXSD = value;
    }

    /**
     * Obtiene el valor de la propiedad paramConfRutaError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamConfRutaError() {
        return paramConfRutaError;
    }

    /**
     * Define el valor de la propiedad paramConfRutaError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamConfRutaError(String value) {
        this.paramConfRutaError = value;
    }

    /**
     * Obtiene el valor de la propiedad paramConfRutaProcesaOk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamConfRutaProcesaOk() {
        return paramConfRutaProcesaOk;
    }

    /**
     * Define el valor de la propiedad paramConfRutaProcesaOk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamConfRutaProcesaOk(String value) {
        this.paramConfRutaProcesaOk = value;
    }

    /**
     * Obtiene el valor de la propiedad paramConfRutaMailbox.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamConfRutaMailbox() {
        return paramConfRutaMailbox;
    }

    /**
     * Define el valor de la propiedad paramConfRutaMailbox.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamConfRutaMailbox(String value) {
        this.paramConfRutaMailbox = value;
    }

    /**
     * Obtiene el valor de la propiedad paramConfCasillaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamConfCasillaOrigen() {
        return paramConfCasillaOrigen;
    }

    /**
     * Define el valor de la propiedad paramConfCasillaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamConfCasillaOrigen(String value) {
        this.paramConfCasillaOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad paramConfCasillaDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamConfCasillaDestino() {
        return paramConfCasillaDestino;
    }

    /**
     * Define el valor de la propiedad paramConfCasillaDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamConfCasillaDestino(String value) {
        this.paramConfCasillaDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad paramConfRutaSAT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamConfRutaSAT() {
        return paramConfRutaSAT;
    }

    /**
     * Define el valor de la propiedad paramConfRutaSAT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamConfRutaSAT(String value) {
        this.paramConfRutaSAT = value;
    }

    /**
     * Obtiene el valor de la propiedad paramConfRutaBandejaSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamConfRutaBandejaSalida() {
        return paramConfRutaBandejaSalida;
    }

    /**
     * Define el valor de la propiedad paramConfRutaBandejaSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamConfRutaBandejaSalida(String value) {
        this.paramConfRutaBandejaSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad paramConfRutaRptaProcesado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamConfRutaRptaProcesado() {
        return paramConfRutaRptaProcesado;
    }

    /**
     * Define el valor de la propiedad paramConfRutaRptaProcesado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamConfRutaRptaProcesado(String value) {
        this.paramConfRutaRptaProcesado = value;
    }

    /**
     * Obtiene el valor de la propiedad paramConfRutaAdjuntos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamConfRutaAdjuntos() {
        return paramConfRutaAdjuntos;
    }

    /**
     * Define el valor de la propiedad paramConfRutaAdjuntos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamConfRutaAdjuntos(String value) {
        this.paramConfRutaAdjuntos = value;
    }

    /**
     * Obtiene el valor de la propiedad paramConfRutaRepositorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamConfRutaRepositorio() {
        return paramConfRutaRepositorio;
    }

    /**
     * Define el valor de la propiedad paramConfRutaRepositorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamConfRutaRepositorio(String value) {
        this.paramConfRutaRepositorio = value;
    }

    /**
     * Obtiene el valor de la propiedad paramConfClaveRepositorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamConfClaveRepositorio() {
        return paramConfClaveRepositorio;
    }

    /**
     * Define el valor de la propiedad paramConfClaveRepositorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamConfClaveRepositorio(String value) {
        this.paramConfClaveRepositorio = value;
    }

    /**
     * Obtiene el valor de la propiedad paramConfClaveCertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamConfClaveCertificado() {
        return paramConfClaveCertificado;
    }

    /**
     * Define el valor de la propiedad paramConfClaveCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamConfClaveCertificado(String value) {
        this.paramConfClaveCertificado = value;
    }

}
