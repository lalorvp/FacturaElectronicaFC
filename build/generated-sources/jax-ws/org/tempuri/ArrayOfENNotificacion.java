
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENNotificacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENNotificacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENNotificacion" type="{http://tempuri.org/}ENNotificacion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENNotificacion", propOrder = {
    "enNotificacion"
})
public class ArrayOfENNotificacion {

    @XmlElement(name = "ENNotificacion", nillable = true)
    protected List<ENNotificacion> enNotificacion;

    /**
     * Gets the value of the enNotificacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enNotificacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENNotificacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENNotificacion }
     * 
     * 
     */
    public List<ENNotificacion> getENNotificacion() {
        if (enNotificacion == null) {
            enNotificacion = new ArrayList<ENNotificacion>();
        }
        return this.enNotificacion;
    }

}
