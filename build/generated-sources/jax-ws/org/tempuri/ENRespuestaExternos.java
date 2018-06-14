
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENRespuestaExternos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENRespuestaExternos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListaComprobantes" type="{http://tempuri.org/}ArrayOfENComprobanteExternos" minOccurs="0"/>
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENRespuestaExternos", propOrder = {
    "listaComprobantes",
    "respuesta"
})
public class ENRespuestaExternos {

    @XmlElement(name = "ListaComprobantes")
    protected ArrayOfENComprobanteExternos listaComprobantes;
    protected boolean respuesta;

    /**
     * Obtiene el valor de la propiedad listaComprobantes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComprobanteExternos }
     *     
     */
    public ArrayOfENComprobanteExternos getListaComprobantes() {
        return listaComprobantes;
    }

    /**
     * Define el valor de la propiedad listaComprobantes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComprobanteExternos }
     *     
     */
    public void setListaComprobantes(ArrayOfENComprobanteExternos value) {
        this.listaComprobantes = value;
    }

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     */
    public boolean isRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     */
    public void setRespuesta(boolean value) {
        this.respuesta = value;
    }

}
