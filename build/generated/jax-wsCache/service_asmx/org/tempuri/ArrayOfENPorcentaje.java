
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENPorcentaje complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENPorcentaje">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENPorcentaje" type="{http://tempuri.org/}ENPorcentaje" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENPorcentaje", propOrder = {
    "enPorcentaje"
})
public class ArrayOfENPorcentaje {

    @XmlElement(name = "ENPorcentaje", nillable = true)
    protected List<ENPorcentaje> enPorcentaje;

    /**
     * Gets the value of the enPorcentaje property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enPorcentaje property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENPorcentaje().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENPorcentaje }
     * 
     * 
     */
    public List<ENPorcentaje> getENPorcentaje() {
        if (enPorcentaje == null) {
            enPorcentaje = new ArrayList<ENPorcentaje>();
        }
        return this.enPorcentaje;
    }

}
