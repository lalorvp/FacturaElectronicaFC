
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Clase Java para ENNumeradosNoEmitidosCab complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENNumeradosNoEmitidosCab">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdNumeradoNoEmitido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Periodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaGeneracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeradosNoEmitidos" type="{http://tempuri.org/}ArrayOfENNumeradosNoEmitidos" minOccurs="0"/>
 *         &lt;element name="dtNumeradosNoEmitidosDetalle" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax' namespace='http://www.w3.org/2001/XMLSchema' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ArchivoXML" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="NombreArchivoXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigodeBarras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Empresa_RUC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Empresa_TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Empresa_RazonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PuntoVentaConfiguracion" type="{http://tempuri.org/}ENPuntoVentaConfiguracion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENNumeradosNoEmitidosCab", propOrder = {
    "idNumeradoNoEmitido",
    "periodo",
    "codigo",
    "fechaEmision",
    "fechaGeneracion",
    "notas",
    "numeradosNoEmitidos",
    "dtNumeradosNoEmitidosDetalle",
    "archivoXML",
    "nombreArchivoXML",
    "codigodeBarras",
    "valorHash",
    "empresaRUC",
    "empresaTipoDocumento",
    "empresaRazonSocial",
    "puntoVentaConfiguracion"
})
public class ENNumeradosNoEmitidosCab {

    @XmlElement(name = "IdNumeradoNoEmitido")
    protected String idNumeradoNoEmitido;
    @XmlElement(name = "Periodo")
    protected String periodo;
    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "FechaEmision")
    protected String fechaEmision;
    @XmlElement(name = "FechaGeneracion")
    protected String fechaGeneracion;
    @XmlElement(name = "Notas")
    protected String notas;
    @XmlElement(name = "NumeradosNoEmitidos")
    protected ArrayOfENNumeradosNoEmitidos numeradosNoEmitidos;
    protected ENNumeradosNoEmitidosCab.DtNumeradosNoEmitidosDetalle dtNumeradosNoEmitidosDetalle;
    @XmlElement(name = "ArchivoXML")
    protected byte[] archivoXML;
    @XmlElement(name = "NombreArchivoXML")
    protected String nombreArchivoXML;
    @XmlElement(name = "CodigodeBarras")
    protected String codigodeBarras;
    @XmlElement(name = "ValorHash")
    protected String valorHash;
    @XmlElement(name = "Empresa_RUC")
    protected String empresaRUC;
    @XmlElement(name = "Empresa_TipoDocumento")
    protected int empresaTipoDocumento;
    @XmlElement(name = "Empresa_RazonSocial")
    protected String empresaRazonSocial;
    @XmlElement(name = "PuntoVentaConfiguracion")
    protected ENPuntoVentaConfiguracion puntoVentaConfiguracion;

    /**
     * Obtiene el valor de la propiedad idNumeradoNoEmitido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumeradoNoEmitido() {
        return idNumeradoNoEmitido;
    }

    /**
     * Define el valor de la propiedad idNumeradoNoEmitido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumeradoNoEmitido(String value) {
        this.idNumeradoNoEmitido = value;
    }

    /**
     * Obtiene el valor de la propiedad periodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * Define el valor de la propiedad periodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodo(String value) {
        this.periodo = value;
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
     * Obtiene el valor de la propiedad fechaEmision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Define el valor de la propiedad fechaEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEmision(String value) {
        this.fechaEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaGeneracion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaGeneracion() {
        return fechaGeneracion;
    }

    /**
     * Define el valor de la propiedad fechaGeneracion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaGeneracion(String value) {
        this.fechaGeneracion = value;
    }

    /**
     * Obtiene el valor de la propiedad notas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotas() {
        return notas;
    }

    /**
     * Define el valor de la propiedad notas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotas(String value) {
        this.notas = value;
    }

    /**
     * Obtiene el valor de la propiedad numeradosNoEmitidos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENNumeradosNoEmitidos }
     *     
     */
    public ArrayOfENNumeradosNoEmitidos getNumeradosNoEmitidos() {
        return numeradosNoEmitidos;
    }

    /**
     * Define el valor de la propiedad numeradosNoEmitidos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENNumeradosNoEmitidos }
     *     
     */
    public void setNumeradosNoEmitidos(ArrayOfENNumeradosNoEmitidos value) {
        this.numeradosNoEmitidos = value;
    }

    /**
     * Obtiene el valor de la propiedad dtNumeradosNoEmitidosDetalle.
     * 
     * @return
     *     possible object is
     *     {@link ENNumeradosNoEmitidosCab.DtNumeradosNoEmitidosDetalle }
     *     
     */
    public ENNumeradosNoEmitidosCab.DtNumeradosNoEmitidosDetalle getDtNumeradosNoEmitidosDetalle() {
        return dtNumeradosNoEmitidosDetalle;
    }

    /**
     * Define el valor de la propiedad dtNumeradosNoEmitidosDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link ENNumeradosNoEmitidosCab.DtNumeradosNoEmitidosDetalle }
     *     
     */
    public void setDtNumeradosNoEmitidosDetalle(ENNumeradosNoEmitidosCab.DtNumeradosNoEmitidosDetalle value) {
        this.dtNumeradosNoEmitidosDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad archivoXML.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getArchivoXML() {
        return archivoXML;
    }

    /**
     * Define el valor de la propiedad archivoXML.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setArchivoXML(byte[] value) {
        this.archivoXML = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreArchivoXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreArchivoXML() {
        return nombreArchivoXML;
    }

    /**
     * Define el valor de la propiedad nombreArchivoXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreArchivoXML(String value) {
        this.nombreArchivoXML = value;
    }

    /**
     * Obtiene el valor de la propiedad codigodeBarras.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigodeBarras() {
        return codigodeBarras;
    }

    /**
     * Define el valor de la propiedad codigodeBarras.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigodeBarras(String value) {
        this.codigodeBarras = value;
    }

    /**
     * Obtiene el valor de la propiedad valorHash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorHash() {
        return valorHash;
    }

    /**
     * Define el valor de la propiedad valorHash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorHash(String value) {
        this.valorHash = value;
    }

    /**
     * Obtiene el valor de la propiedad empresaRUC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpresaRUC() {
        return empresaRUC;
    }

    /**
     * Define el valor de la propiedad empresaRUC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpresaRUC(String value) {
        this.empresaRUC = value;
    }

    /**
     * Obtiene el valor de la propiedad empresaTipoDocumento.
     * 
     */
    public int getEmpresaTipoDocumento() {
        return empresaTipoDocumento;
    }

    /**
     * Define el valor de la propiedad empresaTipoDocumento.
     * 
     */
    public void setEmpresaTipoDocumento(int value) {
        this.empresaTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad empresaRazonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpresaRazonSocial() {
        return empresaRazonSocial;
    }

    /**
     * Define el valor de la propiedad empresaRazonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpresaRazonSocial(String value) {
        this.empresaRazonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad puntoVentaConfiguracion.
     * 
     * @return
     *     possible object is
     *     {@link ENPuntoVentaConfiguracion }
     *     
     */
    public ENPuntoVentaConfiguracion getPuntoVentaConfiguracion() {
        return puntoVentaConfiguracion;
    }

    /**
     * Define el valor de la propiedad puntoVentaConfiguracion.
     * 
     * @param value
     *     allowed object is
     *     {@link ENPuntoVentaConfiguracion }
     *     
     */
    public void setPuntoVentaConfiguracion(ENPuntoVentaConfiguracion value) {
        this.puntoVentaConfiguracion = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any processContents='lax' namespace='http://www.w3.org/2001/XMLSchema' maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class DtNumeradosNoEmitidosDetalle {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }

}
