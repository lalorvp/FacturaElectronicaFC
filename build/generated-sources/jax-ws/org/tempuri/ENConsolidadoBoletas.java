
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ENConsolidadoBoletas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENConsolidadoBoletas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdConsolidado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodigoGenerado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaGeneracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImporteTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigodeBarras" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="ConsolidadoBoletasDetalle" type="{http://tempuri.org/}ArrayOfENConsolidadoBoletasDetalle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENConsolidadoBoletas", propOrder = {
    "idConsolidado",
    "codigoGenerado",
    "fecha",
    "fechaEmision",
    "fechaGeneracion",
    "notas",
    "importeTotal",
    "moneda",
    "codigodeBarras",
    "consolidadoBoletasDetalle"
})
public class ENConsolidadoBoletas {

    @XmlElement(name = "IdConsolidado")
    protected int idConsolidado;
    @XmlElement(name = "CodigoGenerado")
    protected String codigoGenerado;
    @XmlElement(name = "Fecha", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "FechaEmision")
    protected String fechaEmision;
    @XmlElement(name = "FechaGeneracion")
    protected String fechaGeneracion;
    @XmlElement(name = "Notas")
    protected String notas;
    @XmlElement(name = "ImporteTotal", required = true)
    protected BigDecimal importeTotal;
    @XmlElement(name = "Moneda")
    protected String moneda;
    @XmlElement(name = "CodigodeBarras")
    protected byte[] codigodeBarras;
    @XmlElement(name = "ConsolidadoBoletasDetalle")
    protected ArrayOfENConsolidadoBoletasDetalle consolidadoBoletasDetalle;

    /**
     * Obtiene el valor de la propiedad idConsolidado.
     * 
     */
    public int getIdConsolidado() {
        return idConsolidado;
    }

    /**
     * Define el valor de la propiedad idConsolidado.
     * 
     */
    public void setIdConsolidado(int value) {
        this.idConsolidado = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoGenerado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoGenerado() {
        return codigoGenerado;
    }

    /**
     * Define el valor de la propiedad codigoGenerado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoGenerado(String value) {
        this.codigoGenerado = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
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
     * Obtiene el valor de la propiedad importeTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteTotal() {
        return importeTotal;
    }

    /**
     * Define el valor de la propiedad importeTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteTotal(BigDecimal value) {
        this.importeTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad codigodeBarras.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCodigodeBarras() {
        return codigodeBarras;
    }

    /**
     * Define el valor de la propiedad codigodeBarras.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCodigodeBarras(byte[] value) {
        this.codigodeBarras = value;
    }

    /**
     * Obtiene el valor de la propiedad consolidadoBoletasDetalle.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENConsolidadoBoletasDetalle }
     *     
     */
    public ArrayOfENConsolidadoBoletasDetalle getConsolidadoBoletasDetalle() {
        return consolidadoBoletasDetalle;
    }

    /**
     * Define el valor de la propiedad consolidadoBoletasDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENConsolidadoBoletasDetalle }
     *     
     */
    public void setConsolidadoBoletasDetalle(ArrayOfENConsolidadoBoletasDetalle value) {
        this.consolidadoBoletasDetalle = value;
    }

}
