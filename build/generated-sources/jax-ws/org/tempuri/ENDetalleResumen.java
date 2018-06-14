
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENDetalleResumen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENDetalleResumen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NombreResumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoResumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdResumenCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENDetalleResumen", propOrder = {
    "nombreResumen",
    "tipoResumen",
    "idResumenCliente"
})
public class ENDetalleResumen {

    @XmlElement(name = "NombreResumen")
    protected String nombreResumen;
    @XmlElement(name = "TipoResumen")
    protected String tipoResumen;
    @XmlElement(name = "IdResumenCliente")
    protected int idResumenCliente;

    /**
     * Obtiene el valor de la propiedad nombreResumen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreResumen() {
        return nombreResumen;
    }

    /**
     * Define el valor de la propiedad nombreResumen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreResumen(String value) {
        this.nombreResumen = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoResumen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoResumen() {
        return tipoResumen;
    }

    /**
     * Define el valor de la propiedad tipoResumen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoResumen(String value) {
        this.tipoResumen = value;
    }

    /**
     * Obtiene el valor de la propiedad idResumenCliente.
     * 
     */
    public int getIdResumenCliente() {
        return idResumenCliente;
    }

    /**
     * Define el valor de la propiedad idResumenCliente.
     * 
     */
    public void setIdResumenCliente(int value) {
        this.idResumenCliente = value;
    }

}
