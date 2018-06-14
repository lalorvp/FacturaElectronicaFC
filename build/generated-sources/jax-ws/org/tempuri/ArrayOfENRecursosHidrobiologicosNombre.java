
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENRecursosHidrobiologicos_Nombre complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENRecursosHidrobiologicos_Nombre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENRecursosHidrobiologicos_Nombre" type="{http://tempuri.org/}ENRecursosHidrobiologicos_Nombre" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENRecursosHidrobiologicos_Nombre", propOrder = {
    "enRecursosHidrobiologicosNombre"
})
public class ArrayOfENRecursosHidrobiologicosNombre {

    @XmlElement(name = "ENRecursosHidrobiologicos_Nombre", nillable = true)
    protected List<ENRecursosHidrobiologicosNombre> enRecursosHidrobiologicosNombre;

    /**
     * Gets the value of the enRecursosHidrobiologicosNombre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enRecursosHidrobiologicosNombre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENRecursosHidrobiologicosNombre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENRecursosHidrobiologicosNombre }
     * 
     * 
     */
    public List<ENRecursosHidrobiologicosNombre> getENRecursosHidrobiologicosNombre() {
        if (enRecursosHidrobiologicosNombre == null) {
            enRecursosHidrobiologicosNombre = new ArrayList<ENRecursosHidrobiologicosNombre>();
        }
        return this.enRecursosHidrobiologicosNombre;
    }

}
