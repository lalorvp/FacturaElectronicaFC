
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENPeticionAdjunto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENPeticionAdjunto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RucEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RucReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TipoPeticion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Item" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENPeticionAdjunto", propOrder = {
    "rucEmisor",
    "rucReceptor",
    "tipoComprobante",
    "serie",
    "numero",
    "tipoPeticion",
    "item"
})
public class ENPeticionAdjunto {

    @XmlElement(name = "RucEmisor")
    protected String rucEmisor;
    @XmlElement(name = "RucReceptor")
    protected String rucReceptor;
    @XmlElement(name = "TipoComprobante")
    protected String tipoComprobante;
    @XmlElement(name = "Serie")
    protected String serie;
    @XmlElement(name = "Numero")
    protected int numero;
    @XmlElement(name = "TipoPeticion")
    protected int tipoPeticion;
    @XmlElement(name = "Item")
    protected int item;

    /**
     * Obtiene el valor de la propiedad rucEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucEmisor() {
        return rucEmisor;
    }

    /**
     * Define el valor de la propiedad rucEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucEmisor(String value) {
        this.rucEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad rucReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucReceptor() {
        return rucReceptor;
    }

    /**
     * Define el valor de la propiedad rucReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucReceptor(String value) {
        this.rucReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoComprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoComprobante() {
        return tipoComprobante;
    }

    /**
     * Define el valor de la propiedad tipoComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoComprobante(String value) {
        this.tipoComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Define el valor de la propiedad serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPeticion.
     * 
     */
    public int getTipoPeticion() {
        return tipoPeticion;
    }

    /**
     * Define el valor de la propiedad tipoPeticion.
     * 
     */
    public void setTipoPeticion(int value) {
        this.tipoPeticion = value;
    }

    /**
     * Obtiene el valor de la propiedad item.
     * 
     */
    public int getItem() {
        return item;
    }

    /**
     * Define el valor de la propiedad item.
     * 
     */
    public void setItem(int value) {
        this.item = value;
    }

}
