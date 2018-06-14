
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENComprobanteOtorgar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENComprobanteOtorgar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENComprobanteOtorgar" type="{http://tempuri.org/}ENComprobanteOtorgar" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENComprobanteOtorgar", propOrder = {
    "enComprobanteOtorgar"
})
public class ArrayOfENComprobanteOtorgar {

    @XmlElement(name = "ENComprobanteOtorgar", nillable = true)
    protected List<ENComprobanteOtorgar> enComprobanteOtorgar;

    /**
     * Gets the value of the enComprobanteOtorgar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enComprobanteOtorgar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENComprobanteOtorgar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENComprobanteOtorgar }
     * 
     * 
     */
    public List<ENComprobanteOtorgar> getENComprobanteOtorgar() {
        if (enComprobanteOtorgar == null) {
            enComprobanteOtorgar = new ArrayList<ENComprobanteOtorgar>();
        }
        return this.enComprobanteOtorgar;
    }

}
