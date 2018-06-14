
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENRecursosHidrobiologicos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENRecursosHidrobiologicos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENRecursosHidrobiologicos" type="{http://tempuri.org/}ENRecursosHidrobiologicos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENRecursosHidrobiologicos", propOrder = {
    "enRecursosHidrobiologicos"
})
public class ArrayOfENRecursosHidrobiologicos {

    @XmlElement(name = "ENRecursosHidrobiologicos", nillable = true)
    protected List<ENRecursosHidrobiologicos> enRecursosHidrobiologicos;

    /**
     * Gets the value of the enRecursosHidrobiologicos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enRecursosHidrobiologicos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENRecursosHidrobiologicos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENRecursosHidrobiologicos }
     * 
     * 
     */
    public List<ENRecursosHidrobiologicos> getENRecursosHidrobiologicos() {
        if (enRecursosHidrobiologicos == null) {
            enRecursosHidrobiologicos = new ArrayList<ENRecursosHidrobiologicos>();
        }
        return this.enRecursosHidrobiologicos;
    }

}
