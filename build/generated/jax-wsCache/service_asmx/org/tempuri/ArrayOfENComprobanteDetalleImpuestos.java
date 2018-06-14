
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENComprobanteDetalleImpuestos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENComprobanteDetalleImpuestos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENComprobanteDetalleImpuestos" type="{http://tempuri.org/}ENComprobanteDetalleImpuestos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENComprobanteDetalleImpuestos", propOrder = {
    "enComprobanteDetalleImpuestos"
})
public class ArrayOfENComprobanteDetalleImpuestos {

    @XmlElement(name = "ENComprobanteDetalleImpuestos", nillable = true)
    protected List<ENComprobanteDetalleImpuestos> enComprobanteDetalleImpuestos;

    /**
     * Gets the value of the enComprobanteDetalleImpuestos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enComprobanteDetalleImpuestos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENComprobanteDetalleImpuestos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENComprobanteDetalleImpuestos }
     * 
     * 
     */
    public List<ENComprobanteDetalleImpuestos> getENComprobanteDetalleImpuestos() {
        if (enComprobanteDetalleImpuestos == null) {
            enComprobanteDetalleImpuestos = new ArrayList<ENComprobanteDetalleImpuestos>();
        }
        return this.enComprobanteDetalleImpuestos;
    }

}
