
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENRecursosHidrobiologicos_FechaDescarga complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENRecursosHidrobiologicos_FechaDescarga">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENRecursosHidrobiologicos_FechaDescarga" type="{http://tempuri.org/}ENRecursosHidrobiologicos_FechaDescarga" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENRecursosHidrobiologicos_FechaDescarga", propOrder = {
    "enRecursosHidrobiologicosFechaDescarga"
})
public class ArrayOfENRecursosHidrobiologicosFechaDescarga {

    @XmlElement(name = "ENRecursosHidrobiologicos_FechaDescarga", nillable = true)
    protected List<ENRecursosHidrobiologicosFechaDescarga> enRecursosHidrobiologicosFechaDescarga;

    /**
     * Gets the value of the enRecursosHidrobiologicosFechaDescarga property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enRecursosHidrobiologicosFechaDescarga property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENRecursosHidrobiologicosFechaDescarga().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENRecursosHidrobiologicosFechaDescarga }
     * 
     * 
     */
    public List<ENRecursosHidrobiologicosFechaDescarga> getENRecursosHidrobiologicosFechaDescarga() {
        if (enRecursosHidrobiologicosFechaDescarga == null) {
            enRecursosHidrobiologicosFechaDescarga = new ArrayList<ENRecursosHidrobiologicosFechaDescarga>();
        }
        return this.enRecursosHidrobiologicosFechaDescarga;
    }

}
