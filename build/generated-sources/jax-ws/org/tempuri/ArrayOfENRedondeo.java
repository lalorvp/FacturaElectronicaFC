
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENRedondeo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENRedondeo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENRedondeo" type="{http://tempuri.org/}ENRedondeo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENRedondeo", propOrder = {
    "enRedondeo"
})
public class ArrayOfENRedondeo {

    @XmlElement(name = "ENRedondeo", nillable = true)
    protected List<ENRedondeo> enRedondeo;

    /**
     * Gets the value of the enRedondeo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enRedondeo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENRedondeo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENRedondeo }
     * 
     * 
     */
    public List<ENRedondeo> getENRedondeo() {
        if (enRedondeo == null) {
            enRedondeo = new ArrayList<ENRedondeo>();
        }
        return this.enRedondeo;
    }

}
