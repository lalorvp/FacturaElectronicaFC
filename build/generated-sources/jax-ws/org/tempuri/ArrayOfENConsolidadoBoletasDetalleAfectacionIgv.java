
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENConsolidadoBoletasDetalleAfectacionIgv complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENConsolidadoBoletasDetalleAfectacionIgv">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENConsolidadoBoletasDetalleAfectacionIgv" type="{http://tempuri.org/}ENConsolidadoBoletasDetalleAfectacionIgv" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENConsolidadoBoletasDetalleAfectacionIgv", propOrder = {
    "enConsolidadoBoletasDetalleAfectacionIgv"
})
public class ArrayOfENConsolidadoBoletasDetalleAfectacionIgv {

    @XmlElement(name = "ENConsolidadoBoletasDetalleAfectacionIgv", nillable = true)
    protected List<ENConsolidadoBoletasDetalleAfectacionIgv> enConsolidadoBoletasDetalleAfectacionIgv;

    /**
     * Gets the value of the enConsolidadoBoletasDetalleAfectacionIgv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enConsolidadoBoletasDetalleAfectacionIgv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENConsolidadoBoletasDetalleAfectacionIgv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENConsolidadoBoletasDetalleAfectacionIgv }
     * 
     * 
     */
    public List<ENConsolidadoBoletasDetalleAfectacionIgv> getENConsolidadoBoletasDetalleAfectacionIgv() {
        if (enConsolidadoBoletasDetalleAfectacionIgv == null) {
            enConsolidadoBoletasDetalleAfectacionIgv = new ArrayList<ENConsolidadoBoletasDetalleAfectacionIgv>();
        }
        return this.enConsolidadoBoletasDetalleAfectacionIgv;
    }

}
