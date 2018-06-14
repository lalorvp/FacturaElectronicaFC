
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENListaAdjutos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENListaAdjutos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENListaAdjutos" type="{http://tempuri.org/}ENListaAdjutos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENListaAdjutos", propOrder = {
    "enListaAdjutos"
})
public class ArrayOfENListaAdjutos {

    @XmlElement(name = "ENListaAdjutos", nillable = true)
    protected List<ENListaAdjutos> enListaAdjutos;

    /**
     * Gets the value of the enListaAdjutos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enListaAdjutos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENListaAdjutos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENListaAdjutos }
     * 
     * 
     */
    public List<ENListaAdjutos> getENListaAdjutos() {
        if (enListaAdjutos == null) {
            enListaAdjutos = new ArrayList<ENListaAdjutos>();
        }
        return this.enListaAdjutos;
    }

}
