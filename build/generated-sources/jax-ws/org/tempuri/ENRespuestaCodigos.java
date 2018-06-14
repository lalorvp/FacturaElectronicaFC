
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENRespuestaCodigos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENRespuestaCodigos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codigobarra" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="CodigoHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENRespuestaCodigos", propOrder = {
    "codigobarra",
    "codigoHash"
})
public class ENRespuestaCodigos {

    @XmlElement(name = "Codigobarra")
    protected byte[] codigobarra;
    @XmlElement(name = "CodigoHash")
    protected String codigoHash;

    /**
     * Obtiene el valor de la propiedad codigobarra.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCodigobarra() {
        return codigobarra;
    }

    /**
     * Define el valor de la propiedad codigobarra.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCodigobarra(byte[] value) {
        this.codigobarra = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoHash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoHash() {
        return codigoHash;
    }

    /**
     * Define el valor de la propiedad codigoHash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoHash(String value) {
        this.codigoHash = value;
    }

}
