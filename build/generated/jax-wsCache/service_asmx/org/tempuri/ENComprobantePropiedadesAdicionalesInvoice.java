
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENComprobantePropiedadesAdicionalesInvoice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENComprobantePropiedadesAdicionalesInvoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdComprobantePropiedadesAdicionalesInvoice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdComprobante" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENComprobantePropiedadesAdicionalesInvoice", propOrder = {
    "idComprobantePropiedadesAdicionalesInvoice",
    "idComprobante",
    "codigo",
    "valor"
})
public class ENComprobantePropiedadesAdicionalesInvoice {

    @XmlElement(name = "IdComprobantePropiedadesAdicionalesInvoice")
    protected int idComprobantePropiedadesAdicionalesInvoice;
    @XmlElement(name = "IdComprobante")
    protected int idComprobante;
    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "Valor")
    protected String valor;

    /**
     * Obtiene el valor de la propiedad idComprobantePropiedadesAdicionalesInvoice.
     * 
     */
    public int getIdComprobantePropiedadesAdicionalesInvoice() {
        return idComprobantePropiedadesAdicionalesInvoice;
    }

    /**
     * Define el valor de la propiedad idComprobantePropiedadesAdicionalesInvoice.
     * 
     */
    public void setIdComprobantePropiedadesAdicionalesInvoice(int value) {
        this.idComprobantePropiedadesAdicionalesInvoice = value;
    }

    /**
     * Obtiene el valor de la propiedad idComprobante.
     * 
     */
    public int getIdComprobante() {
        return idComprobante;
    }

    /**
     * Define el valor de la propiedad idComprobante.
     * 
     */
    public void setIdComprobante(int value) {
        this.idComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValor(String value) {
        this.valor = value;
    }

}
