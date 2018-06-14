
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENRespuestaComprobanteAdjunto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENRespuestaComprobanteAdjunto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Respuesta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListaAdjuntos" type="{http://tempuri.org/}ArrayOfENListaAdjutos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENRespuestaComprobanteAdjunto", propOrder = {
    "respuesta",
    "descripcion",
    "listaAdjuntos"
})
public class ENRespuestaComprobanteAdjunto {

    @XmlElement(name = "Respuesta")
    protected int respuesta;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "ListaAdjuntos")
    protected ArrayOfENListaAdjutos listaAdjuntos;

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
     * Obtiene el valor de la propiedad listaAdjuntos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENListaAdjutos }
     *     
     */
    public ArrayOfENListaAdjutos getListaAdjuntos() {
        return listaAdjuntos;
    }

    /**
     * Define el valor de la propiedad listaAdjuntos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENListaAdjutos }
     *     
     */
    public void setListaAdjuntos(ArrayOfENListaAdjutos value) {
        this.listaAdjuntos = value;
    }

}
