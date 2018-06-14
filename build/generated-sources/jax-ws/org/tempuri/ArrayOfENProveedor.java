
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENProveedor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENProveedor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENProveedor" type="{http://tempuri.org/}ENProveedor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENProveedor", propOrder = {
    "enProveedor"
})
public class ArrayOfENProveedor {

    @XmlElement(name = "ENProveedor", nillable = true)
    protected List<ENProveedor> enProveedor;

    /**
     * Gets the value of the enProveedor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enProveedor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENProveedor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENProveedor }
     * 
     * 
     */
    public List<ENProveedor> getENProveedor() {
        if (enProveedor == null) {
            enProveedor = new ArrayList<ENProveedor>();
        }
        return this.enProveedor;
    }

}
