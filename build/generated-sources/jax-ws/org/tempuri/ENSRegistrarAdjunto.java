
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENSRegistrarAdjunto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENSRegistrarAdjunto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListaAdjunto" type="{http://tempuri.org/}ArrayOfENAdjunto" minOccurs="0"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ruc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENSRegistrarAdjunto", propOrder = {
    "listaAdjunto",
    "numero",
    "serie",
    "tipoComprobante",
    "ruc"
})
public class ENSRegistrarAdjunto {

    @XmlElement(name = "ListaAdjunto")
    protected ArrayOfENAdjunto listaAdjunto;
    @XmlElement(name = "Numero")
    protected String numero;
    @XmlElement(name = "Serie")
    protected String serie;
    @XmlElement(name = "TipoComprobante")
    protected String tipoComprobante;
    @XmlElement(name = "Ruc")
    protected String ruc;

    /**
     * Obtiene el valor de la propiedad listaAdjunto.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENAdjunto }
     *     
     */
    public ArrayOfENAdjunto getListaAdjunto() {
        return listaAdjunto;
    }

    /**
     * Define el valor de la propiedad listaAdjunto.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENAdjunto }
     *     
     */
    public void setListaAdjunto(ArrayOfENAdjunto value) {
        this.listaAdjunto = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
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

}
