
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENRespuestaEstadoComprobante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENRespuestaEstadoComprobante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Respuesta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListaEstadoComprobante" type="{http://tempuri.org/}ArrayOfENListaEstadoComprobante" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENRespuestaEstadoComprobante", propOrder = {
    "respuesta",
    "descripcion",
    "listaEstadoComprobante"
})
public class ENRespuestaEstadoComprobante {

    @XmlElement(name = "Respuesta")
    protected int respuesta;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "ListaEstadoComprobante")
    protected ArrayOfENListaEstadoComprobante listaEstadoComprobante;

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     */
    public int getRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     */
    public void setRespuesta(int value) {
        this.respuesta = value;
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
     * Obtiene el valor de la propiedad listaEstadoComprobante.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENListaEstadoComprobante }
     *     
     */
    public ArrayOfENListaEstadoComprobante getListaEstadoComprobante() {
        return listaEstadoComprobante;
    }

    /**
     * Define el valor de la propiedad listaEstadoComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENListaEstadoComprobante }
     *     
     */
    public void setListaEstadoComprobante(ArrayOfENListaEstadoComprobante value) {
        this.listaEstadoComprobante = value;
    }

}
