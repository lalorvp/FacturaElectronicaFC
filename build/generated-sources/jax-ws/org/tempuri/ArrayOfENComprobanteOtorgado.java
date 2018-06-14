
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENComprobanteOtorgado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENComprobanteOtorgado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENComprobanteOtorgado" type="{http://tempuri.org/}ENComprobanteOtorgado" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENComprobanteOtorgado", propOrder = {
    "enComprobanteOtorgado"
})
public class ArrayOfENComprobanteOtorgado {

    @XmlElement(name = "ENComprobanteOtorgado", nillable = true)
    protected List<ENComprobanteOtorgado> enComprobanteOtorgado;

    /**
     * Gets the value of the enComprobanteOtorgado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enComprobanteOtorgado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENComprobanteOtorgado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENComprobanteOtorgado }
     * 
     * 
     */
    public List<ENComprobanteOtorgado> getENComprobanteOtorgado() {
        if (enComprobanteOtorgado == null) {
            enComprobanteOtorgado = new ArrayList<ENComprobanteOtorgado>();
        }
        return this.enComprobanteOtorgado;
    }

}
