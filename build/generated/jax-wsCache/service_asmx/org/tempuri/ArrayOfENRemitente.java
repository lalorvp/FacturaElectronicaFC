
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENRemitente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENRemitente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENRemitente" type="{http://tempuri.org/}ENRemitente" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENRemitente", propOrder = {
    "enRemitente"
})
public class ArrayOfENRemitente {

    @XmlElement(name = "ENRemitente", nillable = true)
    protected List<ENRemitente> enRemitente;

    /**
     * Gets the value of the enRemitente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enRemitente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENRemitente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENRemitente }
     * 
     * 
     */
    public List<ENRemitente> getENRemitente() {
        if (enRemitente == null) {
            enRemitente = new ArrayList<ENRemitente>();
        }
        return this.enRemitente;
    }

}
