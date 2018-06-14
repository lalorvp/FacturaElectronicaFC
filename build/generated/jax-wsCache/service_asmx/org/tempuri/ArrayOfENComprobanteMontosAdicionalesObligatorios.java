
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENComprobanteMontosAdicionalesObligatorios complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENComprobanteMontosAdicionalesObligatorios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENComprobanteMontosAdicionalesObligatorios" type="{http://tempuri.org/}ENComprobanteMontosAdicionalesObligatorios" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENComprobanteMontosAdicionalesObligatorios", propOrder = {
    "enComprobanteMontosAdicionalesObligatorios"
})
public class ArrayOfENComprobanteMontosAdicionalesObligatorios {

    @XmlElement(name = "ENComprobanteMontosAdicionalesObligatorios", nillable = true)
    protected List<ENComprobanteMontosAdicionalesObligatorios> enComprobanteMontosAdicionalesObligatorios;

    /**
     * Gets the value of the enComprobanteMontosAdicionalesObligatorios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enComprobanteMontosAdicionalesObligatorios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENComprobanteMontosAdicionalesObligatorios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENComprobanteMontosAdicionalesObligatorios }
     * 
     * 
     */
    public List<ENComprobanteMontosAdicionalesObligatorios> getENComprobanteMontosAdicionalesObligatorios() {
        if (enComprobanteMontosAdicionalesObligatorios == null) {
            enComprobanteMontosAdicionalesObligatorios = new ArrayList<ENComprobanteMontosAdicionalesObligatorios>();
        }
        return this.enComprobanteMontosAdicionalesObligatorios;
    }

}
