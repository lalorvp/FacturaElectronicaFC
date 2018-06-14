
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENRConsultarRespuestaComprobante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENRConsultarRespuestaComprobante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoResultado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComprobanteRespuesta" type="{http://tempuri.org/}ArrayOfENComprobanteRespuesta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENRConsultarRespuestaComprobante", propOrder = {
    "codigoResultado",
    "descripcion",
    "comprobanteRespuesta"
})
public class ENRConsultarRespuestaComprobante {

    @XmlElement(name = "CodigoResultado")
    protected int codigoResultado;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "ComprobanteRespuesta")
    protected ArrayOfENComprobanteRespuesta comprobanteRespuesta;

    /**
     * Obtiene el valor de la propiedad codigoResultado.
     * 
     */
    public int getCodigoResultado() {
        return codigoResultado;
    }

    /**
     * Define el valor de la propiedad codigoResultado.
     * 
     */
    public void setCodigoResultado(int value) {
        this.codigoResultado = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobanteRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComprobanteRespuesta }
     *     
     */
    public ArrayOfENComprobanteRespuesta getComprobanteRespuesta() {
        return comprobanteRespuesta;
    }

    /**
     * Define el valor de la propiedad comprobanteRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComprobanteRespuesta }
     *     
     */
    public void setComprobanteRespuesta(ArrayOfENComprobanteRespuesta value) {
        this.comprobanteRespuesta = value;
    }

}
