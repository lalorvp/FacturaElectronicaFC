
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENRespuestaOtorgamiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENRespuestaOtorgamiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Resultado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENComprobanteOtorgado" type="{http://tempuri.org/}ArrayOfENComprobanteOtorgado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENRespuestaOtorgamiento", propOrder = {
    "resultado",
    "mensaje",
    "enComprobanteOtorgado"
})
public class ENRespuestaOtorgamiento {

    @XmlElement(name = "Resultado")
    protected int resultado;
    @XmlElement(name = "Mensaje")
    protected String mensaje;
    @XmlElement(name = "ENComprobanteOtorgado")
    protected ArrayOfENComprobanteOtorgado enComprobanteOtorgado;

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     */
    public void setResultado(int value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad enComprobanteOtorgado.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComprobanteOtorgado }
     *     
     */
    public ArrayOfENComprobanteOtorgado getENComprobanteOtorgado() {
        return enComprobanteOtorgado;
    }

    /**
     * Define el valor de la propiedad enComprobanteOtorgado.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComprobanteOtorgado }
     *     
     */
    public void setENComprobanteOtorgado(ArrayOfENComprobanteOtorgado value) {
        this.enComprobanteOtorgado = value;
    }

}
