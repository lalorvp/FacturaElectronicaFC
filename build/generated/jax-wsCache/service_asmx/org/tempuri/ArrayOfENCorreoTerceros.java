
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENCorreoTerceros complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENCorreoTerceros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENCorreoTerceros" type="{http://tempuri.org/}ENCorreoTerceros" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENCorreoTerceros", propOrder = {
    "enCorreoTerceros"
})
public class ArrayOfENCorreoTerceros {

    @XmlElement(name = "ENCorreoTerceros", nillable = true)
    protected List<ENCorreoTerceros> enCorreoTerceros;

    /**
     * Gets the value of the enCorreoTerceros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enCorreoTerceros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENCorreoTerceros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENCorreoTerceros }
     * 
     * 
     */
    public List<ENCorreoTerceros> getENCorreoTerceros() {
        if (enCorreoTerceros == null) {
            enCorreoTerceros = new ArrayList<ENCorreoTerceros>();
        }
        return this.enCorreoTerceros;
    }

}
