
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
 *         &lt;element name="Obtener_ResultadosComprobanteResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Rechazo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FechaOtorgamiento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RptCDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rpt_Anulacion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "obtenerResultadosComprobanteResult",
    "rechazo",
    "fechaOtorgamiento",
    "rptCDR",
    "rptAnulacion"
})
@XmlRootElement(name = "Obtener_ResultadosComprobanteResponse")
public class ObtenerResultadosComprobanteResponse {

    @XmlElement(name = "Obtener_ResultadosComprobanteResult")
    protected boolean obtenerResultadosComprobanteResult;
    @XmlElement(name = "Rechazo")
    protected boolean rechazo;
    @XmlElement(name = "FechaOtorgamiento", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaOtorgamiento;
    @XmlElement(name = "RptCDR")
    protected String rptCDR;
    @XmlElement(name = "Rpt_Anulacion")
    protected boolean rptAnulacion;

    /**
     * Obtiene el valor de la propiedad obtenerResultadosComprobanteResult.
     * 
     */
    public boolean isObtenerResultadosComprobanteResult() {
        return obtenerResultadosComprobanteResult;
    }

    /**
     * Define el valor de la propiedad obtenerResultadosComprobanteResult.
     * 
     */
    public void setObtenerResultadosComprobanteResult(boolean value) {
        this.obtenerResultadosComprobanteResult = value;
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

}
