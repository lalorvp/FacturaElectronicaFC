
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENPuntoVentaConfiguracion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENPuntoVentaConfiguracion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoIntegracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoPuntoVenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENPuntoVentaConfiguracion", propOrder = {
    "mac",
    "tipoIntegracion",
    "codigoPuntoVenta"
})
public class ENPuntoVentaConfiguracion {

    @XmlElement(name = "Mac")
    protected String mac;
    @XmlElement(name = "TipoIntegracion")
    protected String tipoIntegracion;
    @XmlElement(name = "CodigoPuntoVenta")
    protected String codigoPuntoVenta;

    /**
     * Obtiene el valor de la propiedad mac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMac() {
        return mac;
    }

    /**
     * Define el valor de la propiedad mac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(String value) {
        this.mac = value;
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

    /**
     * Obtiene el valor de la propiedad codigoPuntoVenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPuntoVenta() {
        return codigoPuntoVenta;
    }

    /**
     * Define el valor de la propiedad codigoPuntoVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPuntoVenta(String value) {
        this.codigoPuntoVenta = value;
    }

}
