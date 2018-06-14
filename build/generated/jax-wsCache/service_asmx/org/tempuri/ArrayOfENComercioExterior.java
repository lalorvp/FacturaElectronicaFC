
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENComercioExterior complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENComercioExterior">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENComercioExterior" type="{http://tempuri.org/}ENComercioExterior" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENComercioExterior", propOrder = {
    "enComercioExterior"
})
public class ArrayOfENComercioExterior {

    @XmlElement(name = "ENComercioExterior", nillable = true)
    protected List<ENComercioExterior> enComercioExterior;

    /**
     * Gets the value of the enComercioExterior property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enComercioExterior property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENComercioExterior().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENComercioExterior }
     * 
     * 
     */
    public List<ENComercioExterior> getENComercioExterior() {
        if (enComercioExterior == null) {
            enComercioExterior = new ArrayList<ENComercioExterior>();
        }
        return this.enComercioExterior;
    }

}
