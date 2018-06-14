
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENAdjunto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENAdjunto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENAdjunto" type="{http://tempuri.org/}ENAdjunto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENAdjunto", propOrder = {
    "enAdjunto"
})
public class ArrayOfENAdjunto {

    @XmlElement(name = "ENAdjunto", nillable = true)
    protected List<ENAdjunto> enAdjunto;

    /**
     * Gets the value of the enAdjunto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enAdjunto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENAdjunto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENAdjunto }
     * 
     * 
     */
    public List<ENAdjunto> getENAdjunto() {
        if (enAdjunto == null) {
            enAdjunto = new ArrayList<ENAdjunto>();
        }
        return this.enAdjunto;
    }

}
