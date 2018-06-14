
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENRespuestaPDF complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENRespuestaPDF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NombrePDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArchivoPDF" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENRespuestaPDF", propOrder = {
    "nombrePDF",
    "archivoPDF"
})
public class ENRespuestaPDF {

    @XmlElement(name = "NombrePDF")
    protected String nombrePDF;
    @XmlElement(name = "ArchivoPDF")
    protected byte[] archivoPDF;

    /**
     * Obtiene el valor de la propiedad nombrePDF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePDF() {
        return nombrePDF;
    }

    /**
     * Define el valor de la propiedad nombrePDF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePDF(String value) {
        this.nombrePDF = value;
    }

    /**
     * Obtiene el valor de la propiedad archivoPDF.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getArchivoPDF() {
        return archivoPDF;
    }

    /**
     * Define el valor de la propiedad archivoPDF.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setArchivoPDF(byte[] value) {
        this.archivoPDF = value;
    }

}
