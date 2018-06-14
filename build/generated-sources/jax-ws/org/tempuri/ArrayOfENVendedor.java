
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENVendedor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENVendedor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENVendedor" type="{http://tempuri.org/}ENVendedor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENVendedor", propOrder = {
    "enVendedor"
})
public class ArrayOfENVendedor {

    @XmlElement(name = "ENVendedor", nillable = true)
    protected List<ENVendedor> enVendedor;

    /**
     * Gets the value of the enVendedor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enVendedor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENVendedor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENVendedor }
     * 
     * 
     */
    public List<ENVendedor> getENVendedor() {
        if (enVendedor == null) {
            enVendedor = new ArrayList<ENVendedor>();
        }
        return this.enVendedor;
    }

}
