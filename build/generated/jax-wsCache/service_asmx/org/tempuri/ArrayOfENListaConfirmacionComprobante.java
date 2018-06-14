
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENListaConfirmacionComprobante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENListaConfirmacionComprobante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENListaConfirmacionComprobante" type="{http://tempuri.org/}ENListaConfirmacionComprobante" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENListaConfirmacionComprobante", propOrder = {
    "enListaConfirmacionComprobante"
})
public class ArrayOfENListaConfirmacionComprobante {

    @XmlElement(name = "ENListaConfirmacionComprobante", nillable = true)
    protected List<ENListaConfirmacionComprobante> enListaConfirmacionComprobante;

    /**
     * Gets the value of the enListaConfirmacionComprobante property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enListaConfirmacionComprobante property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENListaConfirmacionComprobante().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENListaConfirmacionComprobante }
     * 
     * 
     */
    public List<ENListaConfirmacionComprobante> getENListaConfirmacionComprobante() {
        if (enListaConfirmacionComprobante == null) {
            enListaConfirmacionComprobante = new ArrayList<ENListaConfirmacionComprobante>();
        }
        return this.enListaConfirmacionComprobante;
    }

}
