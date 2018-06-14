
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENDescuentoCargoDetalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENDescuentoCargoDetalle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENDescuentoCargoDetalle" type="{http://tempuri.org/}ENDescuentoCargoDetalle" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENDescuentoCargoDetalle", propOrder = {
    "enDescuentoCargoDetalle"
})
public class ArrayOfENDescuentoCargoDetalle {

    @XmlElement(name = "ENDescuentoCargoDetalle", nillable = true)
    protected List<ENDescuentoCargoDetalle> enDescuentoCargoDetalle;

    /**
     * Gets the value of the enDescuentoCargoDetalle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enDescuentoCargoDetalle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENDescuentoCargoDetalle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENDescuentoCargoDetalle }
     * 
     * 
     */
    public List<ENDescuentoCargoDetalle> getENDescuentoCargoDetalle() {
        if (enDescuentoCargoDetalle == null) {
            enDescuentoCargoDetalle = new ArrayList<ENDescuentoCargoDetalle>();
        }
        return this.enDescuentoCargoDetalle;
    }

}
