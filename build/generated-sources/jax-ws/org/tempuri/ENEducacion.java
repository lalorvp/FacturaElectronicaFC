
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENEducacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENEducacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodAlumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Facultad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ciclo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroCuota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreAlumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarreraAcademica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENEducacion", propOrder = {
    "codAlumno",
    "facultad",
    "sede",
    "ciclo",
    "numeroCuota",
    "nombreAlumno",
    "carreraAcademica"
})
public class ENEducacion {

    @XmlElement(name = "CodAlumno")
    protected String codAlumno;
    @XmlElement(name = "Facultad")
    protected String facultad;
    @XmlElement(name = "Sede")
    protected String sede;
    @XmlElement(name = "Ciclo")
    protected String ciclo;
    @XmlElement(name = "NumeroCuota")
    protected String numeroCuota;
    @XmlElement(name = "NombreAlumno")
    protected String nombreAlumno;
    @XmlElement(name = "CarreraAcademica")
    protected String carreraAcademica;

    /**
     * Obtiene el valor de la propiedad codAlumno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAlumno() {
        return codAlumno;
    }

    /**
     * Define el valor de la propiedad codAlumno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAlumno(String value) {
        this.codAlumno = value;
    }

    /**
     * Obtiene el valor de la propiedad facultad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacultad() {
        return facultad;
    }

    /**
     * Define el valor de la propiedad facultad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacultad(String value) {
        this.facultad = value;
    }

    /**
     * Obtiene el valor de la propiedad sede.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSede() {
        return sede;
    }

    /**
     * Define el valor de la propiedad sede.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSede(String value) {
        this.sede = value;
    }

    /**
     * Obtiene el valor de la propiedad ciclo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiclo() {
        return ciclo;
    }

    /**
     * Define el valor de la propiedad ciclo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiclo(String value) {
        this.ciclo = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCuota() {
        return numeroCuota;
    }

    /**
     * Define el valor de la propiedad numeroCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCuota(String value) {
        this.numeroCuota = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAlumno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    /**
     * Define el valor de la propiedad nombreAlumno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAlumno(String value) {
        this.nombreAlumno = value;
    }

    /**
     * Obtiene el valor de la propiedad carreraAcademica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarreraAcademica() {
        return carreraAcademica;
    }

    /**
     * Define el valor de la propiedad carreraAcademica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarreraAcademica(String value) {
        this.carreraAcademica = value;
    }

}
