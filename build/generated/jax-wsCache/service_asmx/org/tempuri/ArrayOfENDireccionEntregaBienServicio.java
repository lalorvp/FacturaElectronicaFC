
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENDireccionEntregaBienServicio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENDireccionEntregaBienServicio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENDireccionEntregaBienServicio" type="{http://tempuri.org/}ENDireccionEntregaBienServicio" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENDireccionEntregaBienServicio", propOrder = {
    "enDireccionEntregaBienServicio"
})
public class ArrayOfENDireccionEntregaBienServicio {

    @XmlElement(name = "ENDireccionEntregaBienServicio", nillable = true)
    protected List<ENDireccionEntregaBienServicio> enDireccionEntregaBienServicio;

    /**
     * Gets the value of the enDireccionEntregaBienServicio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enDireccionEntregaBienServicio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENDireccionEntregaBienServicio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENDireccionEntregaBienServicio }
     * 
     * 
     */
    public List<ENDireccionEntregaBienServicio> getENDireccionEntregaBienServicio() {
        if (enDireccionEntregaBienServicio == null) {
            enDireccionEntregaBienServicio = new ArrayList<ENDireccionEntregaBienServicio>();
        }
        return this.enDireccionEntregaBienServicio;
    }

}
