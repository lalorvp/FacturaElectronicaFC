
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENComprobanteDetalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENComprobanteDetalle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENComprobanteDetalle" type="{http://tempuri.org/}ENComprobanteDetalle" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENComprobanteDetalle", propOrder = {
    "enComprobanteDetalle"
})
public class ArrayOfENComprobanteDetalle {

    @XmlElement(name = "ENComprobanteDetalle", nillable = true)
    protected List<ENComprobanteDetalle> enComprobanteDetalle;

    /**
     * Gets the value of the enComprobanteDetalle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enComprobanteDetalle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENComprobanteDetalle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENComprobanteDetalle }
     * 
     * 
     */
    public List<ENComprobanteDetalle> getENComprobanteDetalle() {
        if (enComprobanteDetalle == null) {
            enComprobanteDetalle = new ArrayList<ENComprobanteDetalle>();
        }
        return this.enComprobanteDetalle;
    }

}
