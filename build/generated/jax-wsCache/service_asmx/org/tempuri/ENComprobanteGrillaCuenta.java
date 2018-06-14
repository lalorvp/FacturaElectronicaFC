
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENComprobanteGrillaCuenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENComprobanteGrillaCuenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Valor1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Valor2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Valor3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Valor4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENComprobanteGrillaCuenta", propOrder = {
    "descripcion",
    "valor1",
    "valor2",
    "valor3",
    "valor4"
})
public class ENComprobanteGrillaCuenta {

    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "Valor1")
    protected String valor1;
    @XmlElement(name = "Valor2")
    protected String valor2;
    @XmlElement(name = "Valor3")
    protected String valor3;
    @XmlElement(name = "Valor4")
    protected String valor4;

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
     * Obtiene el valor de la propiedad valor1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValor1() {
        return valor1;
    }

    /**
     * Define el valor de la propiedad valor1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValor1(String value) {
        this.valor1 = value;
    }

    /**
     * Obtiene el valor de la propiedad valor2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValor2() {
        return valor2;
    }

    /**
     * Define el valor de la propiedad valor2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValor2(String value) {
        this.valor2 = value;
    }

    /**
     * Obtiene el valor de la propiedad valor3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValor3() {
        return valor3;
    }

    /**
     * Define el valor de la propiedad valor3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValor3(String value) {
        this.valor3 = value;
    }

    /**
     * Obtiene el valor de la propiedad valor4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValor4() {
        return valor4;
    }

    /**
     * Define el valor de la propiedad valor4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValor4(String value) {
        this.valor4 = value;
    }

}
