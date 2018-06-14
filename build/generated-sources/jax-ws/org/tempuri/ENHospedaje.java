
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ENHospedaje complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENHospedaje">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FechaIngresoPais" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaIngresoHospedaje" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaSalidaHospedaje" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaConsumo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DiasPermanencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PaisPasaporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaisResidencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaqueteTuristico" type="{http://tempuri.org/}ENPaqueteTuristico" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENHospedaje", propOrder = {
    "fechaIngresoPais",
    "fechaIngresoHospedaje",
    "fechaSalidaHospedaje",
    "fechaConsumo",
    "diasPermanencia",
    "paisPasaporte",
    "paisResidencia",
    "paqueteTuristico"
})
public class ENHospedaje {

    @XmlElement(name = "FechaIngresoPais", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaIngresoPais;
    @XmlElement(name = "FechaIngresoHospedaje", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaIngresoHospedaje;
    @XmlElement(name = "FechaSalidaHospedaje", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaSalidaHospedaje;
    @XmlElement(name = "FechaConsumo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaConsumo;
    @XmlElement(name = "DiasPermanencia")
    protected int diasPermanencia;
    @XmlElement(name = "PaisPasaporte")
    protected String paisPasaporte;
    @XmlElement(name = "PaisResidencia")
    protected String paisResidencia;
    @XmlElement(name = "PaqueteTuristico")
    protected ENPaqueteTuristico paqueteTuristico;

    /**
     * Obtiene el valor de la propiedad fechaIngresoPais.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaIngresoPais() {
        return fechaIngresoPais;
    }

    /**
     * Define el valor de la propiedad fechaIngresoPais.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaIngresoPais(XMLGregorianCalendar value) {
        this.fechaIngresoPais = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaIngresoHospedaje.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaIngresoHospedaje() {
        return fechaIngresoHospedaje;
    }

    /**
     * Define el valor de la propiedad fechaIngresoHospedaje.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaIngresoHospedaje(XMLGregorianCalendar value) {
        this.fechaIngresoHospedaje = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSalidaHospedaje.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaSalidaHospedaje() {
        return fechaSalidaHospedaje;
    }

    /**
     * Define el valor de la propiedad fechaSalidaHospedaje.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaSalidaHospedaje(XMLGregorianCalendar value) {
        this.fechaSalidaHospedaje = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaConsumo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaConsumo() {
        return fechaConsumo;
    }

    /**
     * Define el valor de la propiedad fechaConsumo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaConsumo(XMLGregorianCalendar value) {
        this.fechaConsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad diasPermanencia.
     * 
     */
    public int getDiasPermanencia() {
        return diasPermanencia;
    }

    /**
     * Define el valor de la propiedad diasPermanencia.
     * 
     */
    public void setDiasPermanencia(int value) {
        this.diasPermanencia = value;
    }

    /**
     * Obtiene el valor de la propiedad paisPasaporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisPasaporte() {
        return paisPasaporte;
    }

    /**
     * Define el valor de la propiedad paisPasaporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisPasaporte(String value) {
        this.paisPasaporte = value;
    }

    /**
     * Obtiene el valor de la propiedad paisResidencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisResidencia() {
        return paisResidencia;
    }

    /**
     * Define el valor de la propiedad paisResidencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisResidencia(String value) {
        this.paisResidencia = value;
    }

    /**
     * Obtiene el valor de la propiedad paqueteTuristico.
     * 
     * @return
     *     possible object is
     *     {@link ENPaqueteTuristico }
     *     
     */
    public ENPaqueteTuristico getPaqueteTuristico() {
        return paqueteTuristico;
    }

    /**
     * Define el valor de la propiedad paqueteTuristico.
     * 
     * @param value
     *     allowed object is
     *     {@link ENPaqueteTuristico }
     *     
     */
    public void setPaqueteTuristico(ENPaqueteTuristico value) {
        this.paqueteTuristico = value;
    }

}
