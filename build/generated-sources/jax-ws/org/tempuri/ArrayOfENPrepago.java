
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENPrepago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENPrepago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENPrepago" type="{http://tempuri.org/}ENPrepago" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENPrepago", propOrder = {
    "enPrepago"
})
public class ArrayOfENPrepago {

    @XmlElement(name = "ENPrepago", nillable = true)
    protected List<ENPrepago> enPrepago;

    /**
     * Gets the value of the enPrepago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enPrepago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENPrepago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENPrepago }
     * 
     * 
     */
    public List<ENPrepago> getENPrepago() {
        if (enPrepago == null) {
            enPrepago = new ArrayList<ENPrepago>();
        }
        return this.enPrepago;
    }

}
