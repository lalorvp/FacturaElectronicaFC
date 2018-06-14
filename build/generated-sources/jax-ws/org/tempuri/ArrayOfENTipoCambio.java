
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENTipoCambio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENTipoCambio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENTipoCambio" type="{http://tempuri.org/}ENTipoCambio" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENTipoCambio", propOrder = {
    "enTipoCambio"
})
public class ArrayOfENTipoCambio {

    @XmlElement(name = "ENTipoCambio", nillable = true)
    protected List<ENTipoCambio> enTipoCambio;

    /**
     * Gets the value of the enTipoCambio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enTipoCambio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENTipoCambio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENTipoCambio }
     * 
     * 
     */
    public List<ENTipoCambio> getENTipoCambio() {
        if (enTipoCambio == null) {
            enTipoCambio = new ArrayList<ENTipoCambio>();
        }
        return this.enTipoCambio;
    }

}
