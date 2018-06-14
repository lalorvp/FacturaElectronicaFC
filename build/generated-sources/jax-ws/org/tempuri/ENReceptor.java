
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENReceptor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENReceptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Segmento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ruta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Zona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ubigeo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Calle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Urbanizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Distrito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactoTelefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactoFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactoNota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENReceptor", propOrder = {
    "categoria",
    "codigo",
    "segmento",
    "ruta",
    "zona",
    "region",
    "ubigeo",
    "calle",
    "urbanizacion",
    "provincia",
    "departamento",
    "distrito",
    "codPais",
    "telefono",
    "contactoCodigo",
    "contactoNombre",
    "contactoTelefono",
    "contactoFax",
    "contactoNota"
})
public class ENReceptor {

    @XmlElement(name = "Categoria")
    protected String categoria;
    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "Segmento")
    protected String segmento;
    @XmlElement(name = "Ruta")
    protected String ruta;
    @XmlElement(name = "Zona")
    protected String zona;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "Ubigeo")
    protected String ubigeo;
    @XmlElement(name = "Calle")
    protected String calle;
    @XmlElement(name = "Urbanizacion")
    protected String urbanizacion;
    @XmlElement(name = "Provincia")
    protected String provincia;
    @XmlElement(name = "Departamento")
    protected String departamento;
    @XmlElement(name = "Distrito")
    protected String distrito;
    @XmlElement(name = "CodPais")
    protected String codPais;
    @XmlElement(name = "Telefono")
    protected String telefono;
    @XmlElement(name = "ContactoCodigo")
    protected String contactoCodigo;
    @XmlElement(name = "ContactoNombre")
    protected String contactoNombre;
    @XmlElement(name = "ContactoTelefono")
    protected String contactoTelefono;
    @XmlElement(name = "ContactoFax")
    protected String contactoFax;
    @XmlElement(name = "ContactoNota")
    protected String contactoNota;

    /**
     * Obtiene el valor de la propiedad categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad segmento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmento() {
        return segmento;
    }

    /**
     * Define el valor de la propiedad segmento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmento(String value) {
        this.segmento = value;
    }

    /**
     * Obtiene el valor de la propiedad ruta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * Define el valor de la propiedad ruta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuta(String value) {
        this.ruta = value;
    }

    /**
     * Obtiene el valor de la propiedad zona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZona() {
        return zona;
    }

    /**
     * Define el valor de la propiedad zona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZona(String value) {
        this.zona = value;
    }

    /**
     * Obtiene el valor de la propiedad region.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Define el valor de la propiedad region.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Obtiene el valor de la propiedad ubigeo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbigeo() {
        return ubigeo;
    }

    /**
     * Define el valor de la propiedad ubigeo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbigeo(String value) {
        this.ubigeo = value;
    }

    /**
     * Obtiene el valor de la propiedad calle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Define el valor de la propiedad calle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalle(String value) {
        this.calle = value;
    }

    /**
     * Obtiene el valor de la propiedad urbanizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrbanizacion() {
        return urbanizacion;
    }

    /**
     * Define el valor de la propiedad urbanizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrbanizacion(String value) {
        this.urbanizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamento(String value) {
        this.departamento = value;
    }

    /**
     * Obtiene el valor de la propiedad distrito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrito() {
        return distrito;
    }

    /**
     * Define el valor de la propiedad distrito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrito(String value) {
        this.distrito = value;
    }

    /**
     * Obtiene el valor de la propiedad codPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPais() {
        return codPais;
    }

    /**
     * Define el valor de la propiedad codPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPais(String value) {
        this.codPais = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad contactoCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactoCodigo() {
        return contactoCodigo;
    }

    /**
     * Define el valor de la propiedad contactoCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactoCodigo(String value) {
        this.contactoCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad contactoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactoNombre() {
        return contactoNombre;
    }

    /**
     * Define el valor de la propiedad contactoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactoNombre(String value) {
        this.contactoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad contactoTelefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactoTelefono() {
        return contactoTelefono;
    }

    /**
     * Define el valor de la propiedad contactoTelefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactoTelefono(String value) {
        this.contactoTelefono = value;
    }

    /**
     * Obtiene el valor de la propiedad contactoFax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactoFax() {
        return contactoFax;
    }

    /**
     * Define el valor de la propiedad contactoFax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactoFax(String value) {
        this.contactoFax = value;
    }

    /**
     * Obtiene el valor de la propiedad contactoNota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactoNota() {
        return contactoNota;
    }

    /**
     * Define el valor de la propiedad contactoNota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactoNota(String value) {
        this.contactoNota = value;
    }

}
