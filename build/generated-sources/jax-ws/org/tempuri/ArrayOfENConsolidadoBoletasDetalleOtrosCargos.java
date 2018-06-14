
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENConsolidadoBoletasDetalleOtrosCargos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENConsolidadoBoletasDetalleOtrosCargos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENConsolidadoBoletasDetalleOtrosCargos" type="{http://tempuri.org/}ENConsolidadoBoletasDetalleOtrosCargos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENConsolidadoBoletasDetalleOtrosCargos", propOrder = {
    "enConsolidadoBoletasDetalleOtrosCargos"
})
public class ArrayOfENConsolidadoBoletasDetalleOtrosCargos {

    @XmlElement(name = "ENConsolidadoBoletasDetalleOtrosCargos", nillable = true)
    protected List<ENConsolidadoBoletasDetalleOtrosCargos> enConsolidadoBoletasDetalleOtrosCargos;

    /**
     * Gets the value of the enConsolidadoBoletasDetalleOtrosCargos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enConsolidadoBoletasDetalleOtrosCargos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENConsolidadoBoletasDetalleOtrosCargos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENConsolidadoBoletasDetalleOtrosCargos }
     * 
     * 
     */
    public List<ENConsolidadoBoletasDetalleOtrosCargos> getENConsolidadoBoletasDetalleOtrosCargos() {
        if (enConsolidadoBoletasDetalleOtrosCargos == null) {
            enConsolidadoBoletasDetalleOtrosCargos = new ArrayList<ENConsolidadoBoletasDetalleOtrosCargos>();
        }
        return this.enConsolidadoBoletasDetalleOtrosCargos;
    }

}
