
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENRespuestaXML complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENRespuestaXML">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NombreXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArchivoXML" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENRespuestaXML", propOrder = {
    "nombreXML",
    "archivoXML"
})
public class ENRespuestaXML {

    @XmlElement(name = "NombreXML")
    protected String nombreXML;
    @XmlElement(name = "ArchivoXML")
    protected byte[] archivoXML;

    /**
     * Obtiene el valor de la propiedad nombreXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreXML() {
        return nombreXML;
    }

    /**
     * Define el valor de la propiedad nombreXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreXML(String value) {
        this.nombreXML = value;
    }

    /**
     * Obtiene el valor de la propiedad archivoXML.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getArchivoXML() {
        return archivoXML;
    }

    /**
     * Define el valor de la propiedad archivoXML.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setArchivoXML(byte[] value) {
        this.archivoXML = value;
    }

}
