
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENRecursosHidrobiologicos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENRecursosHidrobiologicos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecursosHidrobiologicos_Nombre" type="{http://tempuri.org/}ArrayOfENRecursosHidrobiologicos_Nombre" minOccurs="0"/>
 *         &lt;element name="RecursosHidrobiologicos_Descripcion" type="{http://tempuri.org/}ArrayOfENRecursosHidrobiologicos_Descripcion" minOccurs="0"/>
 *         &lt;element name="RecursosHidrobiologicos_LugarDescarga" type="{http://tempuri.org/}ArrayOfENRecursosHidrobiologicos_LugarDescarga" minOccurs="0"/>
 *         &lt;element name="RecursosHidrobiologicos_FechaDescarga" type="{http://tempuri.org/}ArrayOfENRecursosHidrobiologicos_FechaDescarga" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENRecursosHidrobiologicos", propOrder = {
    "recursosHidrobiologicosNombre",
    "recursosHidrobiologicosDescripcion",
    "recursosHidrobiologicosLugarDescarga",
    "recursosHidrobiologicosFechaDescarga"
})
public class ENRecursosHidrobiologicos {

    @XmlElement(name = "RecursosHidrobiologicos_Nombre")
    protected ArrayOfENRecursosHidrobiologicosNombre recursosHidrobiologicosNombre;
    @XmlElement(name = "RecursosHidrobiologicos_Descripcion")
    protected ArrayOfENRecursosHidrobiologicosDescripcion recursosHidrobiologicosDescripcion;
    @XmlElement(name = "RecursosHidrobiologicos_LugarDescarga")
    protected ArrayOfENRecursosHidrobiologicosLugarDescarga recursosHidrobiologicosLugarDescarga;
    @XmlElement(name = "RecursosHidrobiologicos_FechaDescarga")
    protected ArrayOfENRecursosHidrobiologicosFechaDescarga recursosHidrobiologicosFechaDescarga;

    /**
     * Obtiene el valor de la propiedad recursosHidrobiologicosNombre.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENRecursosHidrobiologicosNombre }
     *     
     */
    public ArrayOfENRecursosHidrobiologicosNombre getRecursosHidrobiologicosNombre() {
        return recursosHidrobiologicosNombre;
    }

    /**
     * Define el valor de la propiedad recursosHidrobiologicosNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENRecursosHidrobiologicosNombre }
     *     
     */
    public void setRecursosHidrobiologicosNombre(ArrayOfENRecursosHidrobiologicosNombre value) {
        this.recursosHidrobiologicosNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad recursosHidrobiologicosDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENRecursosHidrobiologicosDescripcion }
     *     
     */
    public ArrayOfENRecursosHidrobiologicosDescripcion getRecursosHidrobiologicosDescripcion() {
        return recursosHidrobiologicosDescripcion;
    }

    /**
     * Define el valor de la propiedad recursosHidrobiologicosDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENRecursosHidrobiologicosDescripcion }
     *     
     */
    public void setRecursosHidrobiologicosDescripcion(ArrayOfENRecursosHidrobiologicosDescripcion value) {
        this.recursosHidrobiologicosDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad recursosHidrobiologicosLugarDescarga.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENRecursosHidrobiologicosLugarDescarga }
     *     
     */
    public ArrayOfENRecursosHidrobiologicosLugarDescarga getRecursosHidrobiologicosLugarDescarga() {
        return recursosHidrobiologicosLugarDescarga;
    }

    /**
     * Define el valor de la propiedad recursosHidrobiologicosLugarDescarga.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENRecursosHidrobiologicosLugarDescarga }
     *     
     */
    public void setRecursosHidrobiologicosLugarDescarga(ArrayOfENRecursosHidrobiologicosLugarDescarga value) {
        this.recursosHidrobiologicosLugarDescarga = value;
    }

    /**
     * Obtiene el valor de la propiedad recursosHidrobiologicosFechaDescarga.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENRecursosHidrobiologicosFechaDescarga }
     *     
     */
    public ArrayOfENRecursosHidrobiologicosFechaDescarga getRecursosHidrobiologicosFechaDescarga() {
        return recursosHidrobiologicosFechaDescarga;
    }

    /**
     * Define el valor de la propiedad recursosHidrobiologicosFechaDescarga.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENRecursosHidrobiologicosFechaDescarga }
     *     
     */
    public void setRecursosHidrobiologicosFechaDescarga(ArrayOfENRecursosHidrobiologicosFechaDescarga value) {
        this.recursosHidrobiologicosFechaDescarga = value;
    }

}
