
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENDetalleResumenError complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENDetalleResumenError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENDetalleResumenError" type="{http://tempuri.org/}ENDetalleResumenError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENDetalleResumenError", propOrder = {
    "enDetalleResumenError"
})
public class ArrayOfENDetalleResumenError {

    @XmlElement(name = "ENDetalleResumenError", nillable = true)
    protected List<ENDetalleResumenError> enDetalleResumenError;

    /**
     * Gets the value of the enDetalleResumenError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enDetalleResumenError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENDetalleResumenError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENDetalleResumenError }
     * 
     * 
     */
    public List<ENDetalleResumenError> getENDetalleResumenError() {
        if (enDetalleResumenError == null) {
            enDetalleResumenError = new ArrayList<ENDetalleResumenError>();
        }
        return this.enDetalleResumenError;
    }

}
