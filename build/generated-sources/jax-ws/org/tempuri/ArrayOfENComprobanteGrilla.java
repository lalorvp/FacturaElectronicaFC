
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENComprobanteGrilla complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENComprobanteGrilla">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENComprobanteGrilla" type="{http://tempuri.org/}ENComprobanteGrilla" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENComprobanteGrilla", propOrder = {
    "enComprobanteGrilla"
})
public class ArrayOfENComprobanteGrilla {

    @XmlElement(name = "ENComprobanteGrilla", nillable = true)
    protected List<ENComprobanteGrilla> enComprobanteGrilla;

    /**
     * Gets the value of the enComprobanteGrilla property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enComprobanteGrilla property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENComprobanteGrilla().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENComprobanteGrilla }
     * 
     * 
     */
    public List<ENComprobanteGrilla> getENComprobanteGrilla() {
        if (enComprobanteGrilla == null) {
            enComprobanteGrilla = new ArrayList<ENComprobanteGrilla>();
        }
        return this.enComprobanteGrilla;
    }

}
