
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENComprobanteNotaDocRef complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENComprobanteNotaDocRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENComprobanteNotaDocRef" type="{http://tempuri.org/}ENComprobanteNotaDocRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENComprobanteNotaDocRef", propOrder = {
    "enComprobanteNotaDocRef"
})
public class ArrayOfENComprobanteNotaDocRef {

    @XmlElement(name = "ENComprobanteNotaDocRef", nillable = true)
    protected List<ENComprobanteNotaDocRef> enComprobanteNotaDocRef;

    /**
     * Gets the value of the enComprobanteNotaDocRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enComprobanteNotaDocRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENComprobanteNotaDocRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENComprobanteNotaDocRef }
     * 
     * 
     */
    public List<ENComprobanteNotaDocRef> getENComprobanteNotaDocRef() {
        if (enComprobanteNotaDocRef == null) {
            enComprobanteNotaDocRef = new ArrayList<ENComprobanteNotaDocRef>();
        }
        return this.enComprobanteNotaDocRef;
    }

}
