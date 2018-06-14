
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENCamposComerciales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENCamposComerciales">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConstanciaProduce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Etanol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENCamposComerciales", propOrder = {
    "constanciaProduce",
    "etanol"
})
public class ENCamposComerciales {

    @XmlElement(name = "ConstanciaProduce")
    protected String constanciaProduce;
    @XmlElement(name = "Etanol")
    protected String etanol;

    /**
     * Obtiene el valor de la propiedad constanciaProduce.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstanciaProduce() {
        return constanciaProduce;
    }

    /**
     * Define el valor de la propiedad constanciaProduce.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstanciaProduce(String value) {
        this.constanciaProduce = value;
    }

    /**
     * Obtiene el valor de la propiedad etanol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtanol() {
        return etanol;
    }

    /**
     * Define el valor de la propiedad etanol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtanol(String value) {
        this.etanol = value;
    }

}
