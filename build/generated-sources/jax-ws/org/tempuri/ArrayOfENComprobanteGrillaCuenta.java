
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENComprobanteGrillaCuenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENComprobanteGrillaCuenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENComprobanteGrillaCuenta" type="{http://tempuri.org/}ENComprobanteGrillaCuenta" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENComprobanteGrillaCuenta", propOrder = {
    "enComprobanteGrillaCuenta"
})
public class ArrayOfENComprobanteGrillaCuenta {

    @XmlElement(name = "ENComprobanteGrillaCuenta", nillable = true)
    protected List<ENComprobanteGrillaCuenta> enComprobanteGrillaCuenta;

    /**
     * Gets the value of the enComprobanteGrillaCuenta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enComprobanteGrillaCuenta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENComprobanteGrillaCuenta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENComprobanteGrillaCuenta }
     * 
     * 
     */
    public List<ENComprobanteGrillaCuenta> getENComprobanteGrillaCuenta() {
        if (enComprobanteGrillaCuenta == null) {
            enComprobanteGrillaCuenta = new ArrayList<ENComprobanteGrillaCuenta>();
        }
        return this.enComprobanteGrillaCuenta;
    }

}
