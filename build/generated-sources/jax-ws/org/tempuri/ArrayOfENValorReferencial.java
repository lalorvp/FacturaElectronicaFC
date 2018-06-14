
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENValorReferencial complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENValorReferencial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENValorReferencial" type="{http://tempuri.org/}ENValorReferencial" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENValorReferencial", propOrder = {
    "enValorReferencial"
})
public class ArrayOfENValorReferencial {

    @XmlElement(name = "ENValorReferencial", nillable = true)
    protected List<ENValorReferencial> enValorReferencial;

    /**
     * Gets the value of the enValorReferencial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enValorReferencial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENValorReferencial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENValorReferencial }
     * 
     * 
     */
    public List<ENValorReferencial> getENValorReferencial() {
        if (enValorReferencial == null) {
            enValorReferencial = new ArrayList<ENValorReferencial>();
        }
        return this.enValorReferencial;
    }

}
