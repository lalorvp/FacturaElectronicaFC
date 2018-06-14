
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENRConfirmarRespuestaResumen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENRConfirmarRespuestaResumen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoResultado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetalleRespuestaError" type="{http://tempuri.org/}ArrayOfENDetalleResumenError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENRConfirmarRespuestaResumen", propOrder = {
    "codigoResultado",
    "descripcion",
    "detalleRespuestaError"
})
public class ENRConfirmarRespuestaResumen {

    @XmlElement(name = "CodigoResultado")
    protected int codigoResultado;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "DetalleRespuestaError")
    protected ArrayOfENDetalleResumenError detalleRespuestaError;

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
     * Obtiene el valor de la propiedad detalleRespuestaError.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENDetalleResumenError }
     *     
     */
    public ArrayOfENDetalleResumenError getDetalleRespuestaError() {
        return detalleRespuestaError;
    }

    /**
     * Define el valor de la propiedad detalleRespuestaError.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENDetalleResumenError }
     *     
     */
    public void setDetalleRespuestaError(ArrayOfENDetalleResumenError value) {
        this.detalleRespuestaError = value;
    }

}
