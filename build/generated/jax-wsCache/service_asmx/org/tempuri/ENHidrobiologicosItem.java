
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENHidrobiologicosItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENHidrobiologicosItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatriculaEmbarcacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreEmbarcacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescripcionEspecie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LugarDescarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaDescarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CantidadEspecie" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="UnidadMedida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENHidrobiologicosItem", propOrder = {
    "matriculaEmbarcacion",
    "nombreEmbarcacion",
    "descripcionEspecie",
    "lugarDescarga",
    "fechaDescarga",
    "cantidadEspecie",
    "unidadMedida"
})
public class ENHidrobiologicosItem {

    @XmlElement(name = "MatriculaEmbarcacion")
    protected String matriculaEmbarcacion;
    @XmlElement(name = "NombreEmbarcacion")
    protected String nombreEmbarcacion;
    @XmlElement(name = "DescripcionEspecie")
    protected String descripcionEspecie;
    @XmlElement(name = "LugarDescarga")
    protected String lugarDescarga;
    @XmlElement(name = "FechaDescarga")
    protected String fechaDescarga;
    @XmlElement(name = "CantidadEspecie")
    protected double cantidadEspecie;
    @XmlElement(name = "UnidadMedida")
    protected String unidadMedida;

    /**
     * Obtiene el valor de la propiedad matriculaEmbarcacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculaEmbarcacion() {
        return matriculaEmbarcacion;
    }

    /**
     * Define el valor de la propiedad matriculaEmbarcacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculaEmbarcacion(String value) {
        this.matriculaEmbarcacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEmbarcacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEmbarcacion() {
        return nombreEmbarcacion;
    }

    /**
     * Define el valor de la propiedad nombreEmbarcacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEmbarcacion(String value) {
        this.nombreEmbarcacion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEspecie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionEspecie() {
        return descripcionEspecie;
    }

    /**
     * Define el valor de la propiedad descripcionEspecie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionEspecie(String value) {
        this.descripcionEspecie = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarDescarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarDescarga() {
        return lugarDescarga;
    }

    /**
     * Define el valor de la propiedad lugarDescarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarDescarga(String value) {
        this.lugarDescarga = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDescarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDescarga() {
        return fechaDescarga;
    }

    /**
     * Define el valor de la propiedad fechaDescarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDescarga(String value) {
        this.fechaDescarga = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadEspecie.
     * 
     */
    public double getCantidadEspecie() {
        return cantidadEspecie;
    }

    /**
     * Define el valor de la propiedad cantidadEspecie.
     * 
     */
    public void setCantidadEspecie(double value) {
        this.cantidadEspecie = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadMedida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadMedida() {
        return unidadMedida;
    }

    /**
     * Define el valor de la propiedad unidadMedida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadMedida(String value) {
        this.unidadMedida = value;
    }

}
