
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENReceptor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENReceptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENReceptor" type="{http://tempuri.org/}ENReceptor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENReceptor", propOrder = {
    "enReceptor"
})
public class ArrayOfENReceptor {

    @XmlElement(name = "ENReceptor", nillable = true)
    protected List<ENReceptor> enReceptor;

    /**
     * Gets the value of the enReceptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enReceptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENReceptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENReceptor }
     * 
     * 
     */
    public List<ENReceptor> getENReceptor() {
        if (enReceptor == null) {
            enReceptor = new ArrayList<ENReceptor>();
        }
        return this.enReceptor;
    }

}
