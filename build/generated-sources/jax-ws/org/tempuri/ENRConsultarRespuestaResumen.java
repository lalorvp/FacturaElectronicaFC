
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENRConsultarRespuestaResumen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENRConsultarRespuestaResumen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoResultado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResumenRespuesta" type="{http://tempuri.org/}ArrayOfENResumenRespuesta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENRConsultarRespuestaResumen", propOrder = {
    "codigoResultado",
    "descripcion",
    "resumenRespuesta"
})
public class ENRConsultarRespuestaResumen {

    @XmlElement(name = "CodigoResultado")
    protected int codigoResultado;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "ResumenRespuesta")
    protected ArrayOfENResumenRespuesta resumenRespuesta;

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
     * Obtiene el valor de la propiedad resumenRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENResumenRespuesta }
     *     
     */
    public ArrayOfENResumenRespuesta getResumenRespuesta() {
        return resumenRespuesta;
    }

    /**
     * Define el valor de la propiedad resumenRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENResumenRespuesta }
     *     
     */
    public void setResumenRespuesta(ArrayOfENResumenRespuesta value) {
        this.resumenRespuesta = value;
    }

}
