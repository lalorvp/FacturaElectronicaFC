
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENTransporteBienes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENTransporteBienes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENTransporteBienes" type="{http://tempuri.org/}ENTransporteBienes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENTransporteBienes", propOrder = {
    "enTransporteBienes"
})
public class ArrayOfENTransporteBienes {

    @XmlElement(name = "ENTransporteBienes", nillable = true)
    protected List<ENTransporteBienes> enTransporteBienes;

    /**
     * Gets the value of the enTransporteBienes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enTransporteBienes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENTransporteBienes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENTransporteBienes }
     * 
     * 
     */
    public List<ENTransporteBienes> getENTransporteBienes() {
        if (enTransporteBienes == null) {
            enTransporteBienes = new ArrayList<ENTransporteBienes>();
        }
        return this.enTransporteBienes;
    }

}
