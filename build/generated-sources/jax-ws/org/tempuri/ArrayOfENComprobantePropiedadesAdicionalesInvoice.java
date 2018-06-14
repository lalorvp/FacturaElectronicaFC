
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENComprobantePropiedadesAdicionalesInvoice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENComprobantePropiedadesAdicionalesInvoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENComprobantePropiedadesAdicionalesInvoice" type="{http://tempuri.org/}ENComprobantePropiedadesAdicionalesInvoice" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENComprobantePropiedadesAdicionalesInvoice", propOrder = {
    "enComprobantePropiedadesAdicionalesInvoice"
})
public class ArrayOfENComprobantePropiedadesAdicionalesInvoice {

    @XmlElement(name = "ENComprobantePropiedadesAdicionalesInvoice", nillable = true)
    protected List<ENComprobantePropiedadesAdicionalesInvoice> enComprobantePropiedadesAdicionalesInvoice;

    /**
     * Gets the value of the enComprobantePropiedadesAdicionalesInvoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enComprobantePropiedadesAdicionalesInvoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENComprobantePropiedadesAdicionalesInvoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENComprobantePropiedadesAdicionalesInvoice }
     * 
     * 
     */
    public List<ENComprobantePropiedadesAdicionalesInvoice> getENComprobantePropiedadesAdicionalesInvoice() {
        if (enComprobantePropiedadesAdicionalesInvoice == null) {
            enComprobantePropiedadesAdicionalesInvoice = new ArrayList<ENComprobantePropiedadesAdicionalesInvoice>();
        }
        return this.enComprobantePropiedadesAdicionalesInvoice;
    }

}
