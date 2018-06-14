
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENComprobanteMontosAdicionales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENComprobanteMontosAdicionales">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENComprobanteMontosAdicionales" type="{http://tempuri.org/}ENComprobanteMontosAdicionales" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENComprobanteMontosAdicionales", propOrder = {
    "enComprobanteMontosAdicionales"
})
public class ArrayOfENComprobanteMontosAdicionales {

    @XmlElement(name = "ENComprobanteMontosAdicionales", nillable = true)
    protected List<ENComprobanteMontosAdicionales> enComprobanteMontosAdicionales;

    /**
     * Gets the value of the enComprobanteMontosAdicionales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enComprobanteMontosAdicionales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENComprobanteMontosAdicionales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENComprobanteMontosAdicionales }
     * 
     * 
     */
    public List<ENComprobanteMontosAdicionales> getENComprobanteMontosAdicionales() {
        if (enComprobanteMontosAdicionales == null) {
            enComprobanteMontosAdicionales = new ArrayList<ENComprobanteMontosAdicionales>();
        }
        return this.enComprobanteMontosAdicionales;
    }

}
