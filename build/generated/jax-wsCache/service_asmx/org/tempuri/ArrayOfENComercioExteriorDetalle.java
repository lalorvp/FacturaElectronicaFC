
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENComercioExteriorDetalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENComercioExteriorDetalle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENComercioExteriorDetalle" type="{http://tempuri.org/}ENComercioExteriorDetalle" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENComercioExteriorDetalle", propOrder = {
    "enComercioExteriorDetalle"
})
public class ArrayOfENComercioExteriorDetalle {

    @XmlElement(name = "ENComercioExteriorDetalle", nillable = true)
    protected List<ENComercioExteriorDetalle> enComercioExteriorDetalle;

    /**
     * Gets the value of the enComercioExteriorDetalle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enComercioExteriorDetalle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENComercioExteriorDetalle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENComercioExteriorDetalle }
     * 
     * 
     */
    public List<ENComercioExteriorDetalle> getENComercioExteriorDetalle() {
        if (enComercioExteriorDetalle == null) {
            enComercioExteriorDetalle = new ArrayList<ENComercioExteriorDetalle>();
        }
        return this.enComercioExteriorDetalle;
    }

}
