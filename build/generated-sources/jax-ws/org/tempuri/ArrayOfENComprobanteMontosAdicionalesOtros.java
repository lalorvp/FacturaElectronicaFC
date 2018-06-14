
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENComprobanteMontosAdicionalesOtros complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENComprobanteMontosAdicionalesOtros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENComprobanteMontosAdicionalesOtros" type="{http://tempuri.org/}ENComprobanteMontosAdicionalesOtros" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENComprobanteMontosAdicionalesOtros", propOrder = {
    "enComprobanteMontosAdicionalesOtros"
})
public class ArrayOfENComprobanteMontosAdicionalesOtros {

    @XmlElement(name = "ENComprobanteMontosAdicionalesOtros", nillable = true)
    protected List<ENComprobanteMontosAdicionalesOtros> enComprobanteMontosAdicionalesOtros;

    /**
     * Gets the value of the enComprobanteMontosAdicionalesOtros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enComprobanteMontosAdicionalesOtros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENComprobanteMontosAdicionalesOtros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENComprobanteMontosAdicionalesOtros }
     * 
     * 
     */
    public List<ENComprobanteMontosAdicionalesOtros> getENComprobanteMontosAdicionalesOtros() {
        if (enComprobanteMontosAdicionalesOtros == null) {
            enComprobanteMontosAdicionalesOtros = new ArrayList<ENComprobanteMontosAdicionalesOtros>();
        }
        return this.enComprobanteMontosAdicionalesOtros;
    }

}
