
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENEmpresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENEmpresa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoDocumentoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdEmpresa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ruc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RazonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodDepartamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodProvincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Distrito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodDistrito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Urbanizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Calle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdPais" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdEstado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Buscar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodigoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Web" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoEstablecimientoSUNAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENEmpresa", propOrder = {
    "tipoDocumentoIdentificacion",
    "idEmpresa",
    "ruc",
    "nombreComercial",
    "razonSocial",
    "departamento",
    "codDepartamento",
    "provincia",
    "codProvincia",
    "distrito",
    "codDistrito",
    "urbanizacion",
    "calle",
    "idPais",
    "idEstado",
    "idUsuario",
    "buscar",
    "codPais",
    "idTipoDocumento",
    "codigoTipoDocumento",
    "telefono",
    "web",
    "fax",
    "correo",
    "codigoEstablecimientoSUNAT"
})
public class ENEmpresa {

    @XmlElement(name = "TipoDocumentoIdentificacion")
    protected String tipoDocumentoIdentificacion;
    @XmlElement(name = "IdEmpresa")
    protected int idEmpresa;
    @XmlElement(name = "Ruc")
    protected String ruc;
    @XmlElement(name = "NombreComercial")
    protected String nombreComercial;
    @XmlElement(name = "RazonSocial")
    protected String razonSocial;
    @XmlElement(name = "Departamento")
    protected String departamento;
    @XmlElement(name = "CodDepartamento")
    protected String codDepartamento;
    @XmlElement(name = "Provincia")
    protected String provincia;
    @XmlElement(name = "CodProvincia")
    protected String codProvincia;
    @XmlElement(name = "Distrito")
    protected String distrito;
    @XmlElement(name = "CodDistrito")
    protected String codDistrito;
    @XmlElement(name = "Urbanizacion")
    protected String urbanizacion;
    @XmlElement(name = "Calle")
    protected String calle;
    @XmlElement(name = "IdPais")
    protected int idPais;
    @XmlElement(name = "IdEstado")
    protected int idEstado;
    @XmlElement(name = "IdUsuario")
    protected int idUsuario;
    @XmlElement(name = "Buscar")
    protected String buscar;
    @XmlElement(name = "CodPais")
    protected String codPais;
    @XmlElement(name = "IdTipoDocumento")
    protected int idTipoDocumento;
    @XmlElement(name = "CodigoTipoDocumento")
    protected String codigoTipoDocumento;
    @XmlElement(name = "Telefono")
    protected String telefono;
    @XmlElement(name = "Web")
    protected String web;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Correo")
    protected String correo;
    @XmlElement(name = "CodigoEstablecimientoSUNAT")
    protected String codigoEstablecimientoSUNAT;

    /**
     * Obtiene el valor de la propiedad tipoDocumentoIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumentoIdentificacion() {
        return tipoDocumentoIdentificacion;
    }

    /**
     * Define el valor de la propiedad tipoDocumentoIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumentoIdentificacion(String value) {
        this.tipoDocumentoIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idEmpresa.
     * 
     */
    public int getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * Define el valor de la propiedad idEmpresa.
     * 
     */
    public void setIdEmpresa(int value) {
        this.idEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad ruc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * Define el valor de la propiedad ruc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuc(String value) {
        this.ruc = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreComercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreComercial() {
        return nombreComercial;
    }

    /**
     * Define el valor de la propiedad nombreComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreComercial(String value) {
        this.nombreComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Define el valor de la propiedad razonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
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
     * Obtiene el valor de la propiedad codDepartamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDepartamento() {
        return codDepartamento;
    }

    /**
     * Define el valor de la propiedad codDepartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDepartamento(String value) {
        this.codDepartamento = value;
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
     * Obtiene el valor de la propiedad codProvincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodProvincia() {
        return codProvincia;
    }

    /**
     * Define el valor de la propiedad codProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodProvincia(String value) {
        this.codProvincia = value;
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
     * Obtiene el valor de la propiedad codDistrito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDistrito() {
        return codDistrito;
    }

    /**
     * Define el valor de la propiedad codDistrito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDistrito(String value) {
        this.codDistrito = value;
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
     * Obtiene el valor de la propiedad idPais.
     * 
     */
    public int getIdPais() {
        return idPais;
    }

    /**
     * Define el valor de la propiedad idPais.
     * 
     */
    public void setIdPais(int value) {
        this.idPais = value;
    }

    /**
     * Obtiene el valor de la propiedad idEstado.
     * 
     */
    public int getIdEstado() {
        return idEstado;
    }

    /**
     * Define el valor de la propiedad idEstado.
     * 
     */
    public void setIdEstado(int value) {
        this.idEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     */
    public void setIdUsuario(int value) {
        this.idUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad buscar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuscar() {
        return buscar;
    }

    /**
     * Define el valor de la propiedad buscar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuscar(String value) {
        this.buscar = value;
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
     * Obtiene el valor de la propiedad idTipoDocumento.
     * 
     */
    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    /**
     * Define el valor de la propiedad idTipoDocumento.
     * 
     */
    public void setIdTipoDocumento(int value) {
        this.idTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoDocumento() {
        return codigoTipoDocumento;
    }

    /**
     * Define el valor de la propiedad codigoTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoDocumento(String value) {
        this.codigoTipoDocumento = value;
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
     * Obtiene el valor de la propiedad web.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeb() {
        return web;
    }

    /**
     * Define el valor de la propiedad web.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeb(String value) {
        this.web = value;
    }

    /**
     * Obtiene el valor de la propiedad fax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Define el valor de la propiedad fax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreo(String value) {
        this.correo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEstablecimientoSUNAT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEstablecimientoSUNAT() {
        return codigoEstablecimientoSUNAT;
    }

    /**
     * Define el valor de la propiedad codigoEstablecimientoSUNAT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEstablecimientoSUNAT(String value) {
        this.codigoEstablecimientoSUNAT = value;
    }

}
