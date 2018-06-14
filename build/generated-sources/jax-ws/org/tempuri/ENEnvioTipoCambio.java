
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ENEnvioTipoCambio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENEnvioTipoCambio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ruc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaTipoCambio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TipoCambio" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TipoIntegracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENEnvioTipoCambio", propOrder = {
    "ruc",
    "codigoMoneda",
    "fechaTipoCambio",
    "tipoCambio",
    "tipoIntegracion"
})
public class ENEnvioTipoCambio {

    @XmlElement(name = "Ruc")
    protected String ruc;
    @XmlElement(name = "CodigoMoneda")
    protected String codigoMoneda;
    @XmlElement(name = "FechaTipoCambio", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaTipoCambio;
    @XmlElement(name = "TipoCambio", required = true)
    protected BigDecimal tipoCambio;
    @XmlElement(name = "TipoIntegracion")
    protected String tipoIntegracion;

    /**
     * Obtiene el valor de la propiedad ruc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * Define el valor de la propiedad ruc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuc(String value) {
        this.ruc = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMoneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    /**
     * Define el valor de la propiedad codigoMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMoneda(String value) {
        this.codigoMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaTipoCambio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaTipoCambio() {
        return fechaTipoCambio;
    }

    /**
     * Define el valor de la propiedad fechaTipoCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaTipoCambio(XMLGregorianCalendar value) {
        this.fechaTipoCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Define el valor de la propiedad tipoCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTipoCambio(BigDecimal value) {
        this.tipoCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIntegracion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIntegracion() {
        return tipoIntegracion;
    }

    /**
     * Define el valor de la propiedad tipoIntegracion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIntegracion(String value) {
        this.tipoIntegracion = value;
    }

}
