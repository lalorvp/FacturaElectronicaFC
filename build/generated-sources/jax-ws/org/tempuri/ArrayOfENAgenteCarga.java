
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENAgenteCarga complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENAgenteCarga">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENAgenteCarga" type="{http://tempuri.org/}ENAgenteCarga" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENAgenteCarga", propOrder = {
    "enAgenteCarga"
})
public class ArrayOfENAgenteCarga {

    @XmlElement(name = "ENAgenteCarga", nillable = true)
    protected List<ENAgenteCarga> enAgenteCarga;

    /**
     * Gets the value of the enAgenteCarga property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enAgenteCarga property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENAgenteCarga().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENAgenteCarga }
     * 
     * 
     */
    public List<ENAgenteCarga> getENAgenteCarga() {
        if (enAgenteCarga == null) {
            enAgenteCarga = new ArrayList<ENAgenteCarga>();
        }
        return this.enAgenteCarga;
    }

}
