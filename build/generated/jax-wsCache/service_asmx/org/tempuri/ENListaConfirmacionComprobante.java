
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENListaConfirmacionComprobante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENListaConfirmacionComprobante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdComprobanteEmisor" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Otorgado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Leido" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Rechazo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENListaConfirmacionComprobante", propOrder = {
    "tipoComprobante",
    "serie",
    "numero",
    "idComprobanteEmisor",
    "otorgado",
    "leido",
    "rechazo"
})
public class ENListaConfirmacionComprobante {

    @XmlElement(name = "TipoComprobante")
    protected String tipoComprobante;
    @XmlElement(name = "Serie")
    protected String serie;
    @XmlElement(name = "Numero")
    protected int numero;
    @XmlElement(name = "IdComprobanteEmisor")
    protected long idComprobanteEmisor;
    @XmlElement(name = "Otorgado")
    protected boolean otorgado;
    @XmlElement(name = "Leido")
    protected boolean leido;
    @XmlElement(name = "Rechazo")
    protected boolean rechazo;

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
     * Obtiene el valor de la propiedad idComprobanteEmisor.
     * 
     */
    public long getIdComprobanteEmisor() {
        return idComprobanteEmisor;
    }

    /**
     * Define el valor de la propiedad idComprobanteEmisor.
     * 
     */
    public void setIdComprobanteEmisor(long value) {
        this.idComprobanteEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad otorgado.
     * 
     */
    public boolean isOtorgado() {
        return otorgado;
    }

    /**
     * Define el valor de la propiedad otorgado.
     * 
     */
    public void setOtorgado(boolean value) {
        this.otorgado = value;
    }

    /**
     * Obtiene el valor de la propiedad leido.
     * 
     */
    public boolean isLeido() {
        return leido;
    }

    /**
     * Define el valor de la propiedad leido.
     * 
     */
    public void setLeido(boolean value) {
        this.leido = value;
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

}
