
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENAdjunto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENAdjunto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArchivoAdjunto" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="NombreAdjunto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENAdjunto", propOrder = {
    "archivoAdjunto",
    "nombreAdjunto"
})
public class ENAdjunto {

    @XmlElement(name = "ArchivoAdjunto")
    protected byte[] archivoAdjunto;
    @XmlElement(name = "NombreAdjunto")
    protected String nombreAdjunto;

    /**
     * Obtiene el valor de la propiedad archivoAdjunto.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getArchivoAdjunto() {
        return archivoAdjunto;
    }

    /**
     * Define el valor de la propiedad archivoAdjunto.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setArchivoAdjunto(byte[] value) {
        this.archivoAdjunto = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAdjunto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAdjunto() {
        return nombreAdjunto;
    }

    /**
     * Define el valor de la propiedad nombreAdjunto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAdjunto(String value) {
        this.nombreAdjunto = value;
    }

}
