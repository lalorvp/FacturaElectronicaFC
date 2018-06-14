
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENPeticionEstadoComprobante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENPeticionEstadoComprobante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RucEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CantidadComprobantes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENPeticionEstadoComprobante", propOrder = {
    "rucEmpresa",
    "cantidadComprobantes"
})
public class ENPeticionEstadoComprobante {

    @XmlElement(name = "RucEmpresa")
    protected String rucEmpresa;
    @XmlElement(name = "CantidadComprobantes")
    protected int cantidadComprobantes;

    /**
     * Obtiene el valor de la propiedad rucEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucEmpresa() {
        return rucEmpresa;
    }

    /**
     * Define el valor de la propiedad rucEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucEmpresa(String value) {
        this.rucEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadComprobantes.
     * 
     */
    public int getCantidadComprobantes() {
        return cantidadComprobantes;
    }

    /**
     * Define el valor de la propiedad cantidadComprobantes.
     * 
     */
    public void setCantidadComprobantes(int value) {
        this.cantidadComprobantes = value;
    }

}
