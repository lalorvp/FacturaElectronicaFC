
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENListaEstadoComprobante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENListaEstadoComprobante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENListaEstadoComprobante" type="{http://tempuri.org/}ENListaEstadoComprobante" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENListaEstadoComprobante", propOrder = {
    "enListaEstadoComprobante"
})
public class ArrayOfENListaEstadoComprobante {

    @XmlElement(name = "ENListaEstadoComprobante", nillable = true)
    protected List<ENListaEstadoComprobante> enListaEstadoComprobante;

    /**
     * Gets the value of the enListaEstadoComprobante property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enListaEstadoComprobante property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENListaEstadoComprobante().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENListaEstadoComprobante }
     * 
     * 
     */
    public List<ENListaEstadoComprobante> getENListaEstadoComprobante() {
        if (enListaEstadoComprobante == null) {
            enListaEstadoComprobante = new ArrayList<ENListaEstadoComprobante>();
        }
        return this.enListaEstadoComprobante;
    }

}
