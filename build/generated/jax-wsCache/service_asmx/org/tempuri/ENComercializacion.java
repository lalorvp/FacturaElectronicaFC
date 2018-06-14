
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENComercializacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENComercializacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LeyMineral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NroResolucionAutoriza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NroRegistroEspecial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NroDeclaracionCompromiso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoConcesionMinera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENComercializacion", propOrder = {
    "leyMineral",
    "nroResolucionAutoriza",
    "nroRegistroEspecial",
    "nroDeclaracionCompromiso",
    "codigoConcesionMinera"
})
public class ENComercializacion {

    @XmlElement(name = "LeyMineral")
    protected String leyMineral;
    @XmlElement(name = "NroResolucionAutoriza")
    protected String nroResolucionAutoriza;
    @XmlElement(name = "NroRegistroEspecial")
    protected String nroRegistroEspecial;
    @XmlElement(name = "NroDeclaracionCompromiso")
    protected String nroDeclaracionCompromiso;
    @XmlElement(name = "CodigoConcesionMinera")
    protected String codigoConcesionMinera;

    /**
     * Obtiene el valor de la propiedad leyMineral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeyMineral() {
        return leyMineral;
    }

    /**
     * Define el valor de la propiedad leyMineral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeyMineral(String value) {
        this.leyMineral = value;
    }

    /**
     * Obtiene el valor de la propiedad nroResolucionAutoriza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroResolucionAutoriza() {
        return nroResolucionAutoriza;
    }

    /**
     * Define el valor de la propiedad nroResolucionAutoriza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroResolucionAutoriza(String value) {
        this.nroResolucionAutoriza = value;
    }

    /**
     * Obtiene el valor de la propiedad nroRegistroEspecial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroRegistroEspecial() {
        return nroRegistroEspecial;
    }

    /**
     * Define el valor de la propiedad nroRegistroEspecial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroRegistroEspecial(String value) {
        this.nroRegistroEspecial = value;
    }

    /**
     * Obtiene el valor de la propiedad nroDeclaracionCompromiso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroDeclaracionCompromiso() {
        return nroDeclaracionCompromiso;
    }

    /**
     * Define el valor de la propiedad nroDeclaracionCompromiso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroDeclaracionCompromiso(String value) {
        this.nroDeclaracionCompromiso = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoConcesionMinera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoConcesionMinera() {
        return codigoConcesionMinera;
    }

    /**
     * Define el valor de la propiedad codigoConcesionMinera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoConcesionMinera(String value) {
        this.codigoConcesionMinera = value;
    }

}
