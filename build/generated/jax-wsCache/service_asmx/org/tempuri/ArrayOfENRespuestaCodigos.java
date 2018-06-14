
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENRespuestaCodigos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENRespuestaCodigos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENRespuestaCodigos" type="{http://tempuri.org/}ENRespuestaCodigos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENRespuestaCodigos", propOrder = {
    "enRespuestaCodigos"
})
public class ArrayOfENRespuestaCodigos {

    @XmlElement(name = "ENRespuestaCodigos", nillable = true)
    protected List<ENRespuestaCodigos> enRespuestaCodigos;

    /**
     * Gets the value of the enRespuestaCodigos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enRespuestaCodigos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENRespuestaCodigos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENRespuestaCodigos }
     * 
     * 
     */
    public List<ENRespuestaCodigos> getENRespuestaCodigos() {
        if (enRespuestaCodigos == null) {
            enRespuestaCodigos = new ArrayList<ENRespuestaCodigos>();
        }
        return this.enRespuestaCodigos;
    }

}
