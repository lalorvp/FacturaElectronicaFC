
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENCorreoComprobanteConsulta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENCorreoComprobanteConsulta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENCorreoComprobanteConsulta" type="{http://tempuri.org/}ENCorreoComprobanteConsulta" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENCorreoComprobanteConsulta", propOrder = {
    "enCorreoComprobanteConsulta"
})
public class ArrayOfENCorreoComprobanteConsulta {

    @XmlElement(name = "ENCorreoComprobanteConsulta", nillable = true)
    protected List<ENCorreoComprobanteConsulta> enCorreoComprobanteConsulta;

    /**
     * Gets the value of the enCorreoComprobanteConsulta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enCorreoComprobanteConsulta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENCorreoComprobanteConsulta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENCorreoComprobanteConsulta }
     * 
     * 
     */
    public List<ENCorreoComprobanteConsulta> getENCorreoComprobanteConsulta() {
        if (enCorreoComprobanteConsulta == null) {
            enCorreoComprobanteConsulta = new ArrayList<ENCorreoComprobanteConsulta>();
        }
        return this.enCorreoComprobanteConsulta;
    }

}
