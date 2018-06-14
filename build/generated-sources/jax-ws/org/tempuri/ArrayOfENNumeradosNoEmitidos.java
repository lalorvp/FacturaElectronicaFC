
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENNumeradosNoEmitidos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENNumeradosNoEmitidos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENNumeradosNoEmitidos" type="{http://tempuri.org/}ENNumeradosNoEmitidos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENNumeradosNoEmitidos", propOrder = {
    "enNumeradosNoEmitidos"
})
public class ArrayOfENNumeradosNoEmitidos {

    @XmlElement(name = "ENNumeradosNoEmitidos", nillable = true)
    protected List<ENNumeradosNoEmitidos> enNumeradosNoEmitidos;

    /**
     * Gets the value of the enNumeradosNoEmitidos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enNumeradosNoEmitidos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENNumeradosNoEmitidos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENNumeradosNoEmitidos }
     * 
     * 
     */
    public List<ENNumeradosNoEmitidos> getENNumeradosNoEmitidos() {
        if (enNumeradosNoEmitidos == null) {
            enNumeradosNoEmitidos = new ArrayList<ENNumeradosNoEmitidos>();
        }
        return this.enNumeradosNoEmitidos;
    }

}
