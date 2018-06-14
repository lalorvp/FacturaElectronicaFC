
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENConsignatario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENConsignatario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENConsignatario" type="{http://tempuri.org/}ENConsignatario" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENConsignatario", propOrder = {
    "enConsignatario"
})
public class ArrayOfENConsignatario {

    @XmlElement(name = "ENConsignatario", nillable = true)
    protected List<ENConsignatario> enConsignatario;

    /**
     * Gets the value of the enConsignatario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enConsignatario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENConsignatario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENConsignatario }
     * 
     * 
     */
    public List<ENConsignatario> getENConsignatario() {
        if (enConsignatario == null) {
            enConsignatario = new ArrayList<ENConsignatario>();
        }
        return this.enConsignatario;
    }

}
