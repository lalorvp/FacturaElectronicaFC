
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ENFormaPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENFormaPago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoFormaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DiasVencimiento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Nota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotaInstruccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumerodeCheque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroAutorizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENFormaPago", propOrder = {
    "codigoFormaPago",
    "fechaVencimiento",
    "diasVencimiento",
    "nota",
    "codigoBanco",
    "notaInstruccion",
    "numerodeCheque",
    "nombreBanco",
    "monto",
    "moneda",
    "numeroAutorizacion"
})
public class ENFormaPago {

    @XmlElement(name = "CodigoFormaPago")
    protected String codigoFormaPago;
    @XmlElement(name = "FechaVencimiento", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVencimiento;
    @XmlElement(name = "DiasVencimiento")
    protected int diasVencimiento;
    @XmlElement(name = "Nota")
    protected String nota;
    @XmlElement(name = "CodigoBanco")
    protected String codigoBanco;
    @XmlElement(name = "NotaInstruccion")
    protected String notaInstruccion;
    @XmlElement(name = "NumerodeCheque")
    protected String numerodeCheque;
    @XmlElement(name = "NombreBanco")
    protected String nombreBanco;
    @XmlElement(name = "Monto")
    protected String monto;
    @XmlElement(name = "Moneda")
    protected String moneda;
    @XmlElement(name = "NumeroAutorizacion")
    protected String numeroAutorizacion;

    /**
     * Obtiene el valor de la propiedad codigoFormaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoFormaPago() {
        return codigoFormaPago;
    }

    /**
     * Define el valor de la propiedad codigoFormaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoFormaPago(String value) {
        this.codigoFormaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Define el valor de la propiedad fechaVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimiento(XMLGregorianCalendar value) {
        this.fechaVencimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad diasVencimiento.
     * 
     */
    public int getDiasVencimiento() {
        return diasVencimiento;
    }

    /**
     * Define el valor de la propiedad diasVencimiento.
     * 
     */
    public void setDiasVencimiento(int value) {
        this.diasVencimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad nota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNota() {
        return nota;
    }

    /**
     * Define el valor de la propiedad nota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNota(String value) {
        this.nota = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoBanco() {
        return codigoBanco;
    }

    /**
     * Define el valor de la propiedad codigoBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoBanco(String value) {
        this.codigoBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad notaInstruccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaInstruccion() {
        return notaInstruccion;
    }

    /**
     * Define el valor de la propiedad notaInstruccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaInstruccion(String value) {
        this.notaInstruccion = value;
    }

    /**
     * Obtiene el valor de la propiedad numerodeCheque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerodeCheque() {
        return numerodeCheque;
    }

    /**
     * Define el valor de la propiedad numerodeCheque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerodeCheque(String value) {
        this.numerodeCheque = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreBanco() {
        return nombreBanco;
    }

    /**
     * Define el valor de la propiedad nombreBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreBanco(String value) {
        this.nombreBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonto(String value) {
        this.monto = value;
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
     * Obtiene el valor de la propiedad numeroAutorizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAutorizacion() {
        return numeroAutorizacion;
    }

    /**
     * Define el valor de la propiedad numeroAutorizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAutorizacion(String value) {
        this.numeroAutorizacion = value;
    }

}
