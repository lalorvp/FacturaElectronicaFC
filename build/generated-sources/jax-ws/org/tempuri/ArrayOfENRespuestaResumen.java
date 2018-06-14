
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfENRespuestaResumen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfENRespuestaResumen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENRespuestaResumen" type="{http://tempuri.org/}ENRespuestaResumen" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfENRespuestaResumen", propOrder = {
    "enRespuestaResumen"
})
public class ArrayOfENRespuestaResumen {

    @XmlElement(name = "ENRespuestaResumen", nillable = true)
    protected List<ENRespuestaResumen> enRespuestaResumen;

    /**
     * Gets the value of the enRespuestaResumen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enRespuestaResumen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENRespuestaResumen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENRespuestaResumen }
     * 
     * 
     */
    public List<ENRespuestaResumen> getENRespuestaResumen() {
        if (enRespuestaResumen == null) {
            enRespuestaResumen = new ArrayList<ENRespuestaResumen>();
        }
        return this.enRespuestaResumen;
    }

}
