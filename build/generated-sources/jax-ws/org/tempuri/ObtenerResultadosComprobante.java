
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="oENComprobante" type="{http://tempuri.org/}ENComprobante" minOccurs="0"/>
 *         &lt;element name="Rechazo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FechaOtorgamiento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RptCDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rpt_Anulacion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="strError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "oenComprobante",
    "rechazo",
    "fechaOtorgamiento",
    "rptCDR",
    "rptAnulacion",
    "strError"
})
@XmlRootElement(name = "Obtener_ResultadosComprobante")
public class ObtenerResultadosComprobante {

    @XmlElement(name = "oENComprobante")
    protected ENComprobante oenComprobante;
    @XmlElement(name = "Rechazo")
    protected boolean rechazo;
    @XmlElement(name = "FechaOtorgamiento", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaOtorgamiento;
    @XmlElement(name = "RptCDR")
    protected String rptCDR;
    @XmlElement(name = "Rpt_Anulacion")
    protected boolean rptAnulacion;
    protected String strError;

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
     * Obtiene el valor de la propiedad rechazo.
     * 
     */
    public boolean isRechazo() {
        return rechazo;
    }

    /**
     * Define el valor de la propiedad rechazo.
     * 
     */
    public void setRechazo(boolean value) {
        this.rechazo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaOtorgamiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaOtorgamiento() {
        return fechaOtorgamiento;
    }

    /**
     * Define el valor de la propiedad fechaOtorgamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaOtorgamiento(XMLGregorianCalendar value) {
        this.fechaOtorgamiento = value;
    }

    /**
     * Obtiene el valor de la propiedad rptCDR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptCDR() {
        return rptCDR;
    }

    /**
     * Define el valor de la propiedad rptCDR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptCDR(String value) {
        this.rptCDR = value;
    }

    /**
     * Obtiene el valor de la propiedad rptAnulacion.
     * 
     */
    public boolean isRptAnulacion() {
        return rptAnulacion;
    }

    /**
     * Define el valor de la propiedad rptAnulacion.
     * 
     */
    public void setRptAnulacion(boolean value) {
        this.rptAnulacion = value;
    }

    /**
     * Obtiene el valor de la propiedad strError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrError() {
        return strError;
    }

    /**
     * Define el valor de la propiedad strError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrError(String value) {
        this.strError = value;
    }

}
