
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENDetalleComprobante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENDetalleComprobante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENDetalleComprobante" type="{http://tempuri.org/}ENDetalleComprobante" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENDetalleComprobante", propOrder = {
    "enDetalleComprobante"
})
public class ArrayOfENDetalleComprobante {

    @XmlElement(name = "ENDetalleComprobante", nillable = true)
    protected List<ENDetalleComprobante> enDetalleComprobante;

    /**
     * Gets the value of the enDetalleComprobante property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enDetalleComprobante property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENDetalleComprobante().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENDetalleComprobante }
     * 
     * 
     */
    public List<ENDetalleComprobante> getENDetalleComprobante() {
        if (enDetalleComprobante == null) {
            enDetalleComprobante = new ArrayList<ENDetalleComprobante>();
        }
        return this.enDetalleComprobante;
    }

}
