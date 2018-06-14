
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENDetraccionVehiculo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENDetraccionVehiculo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoMTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CargaUtil" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CargaTM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ValorTM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ValorPreliminar" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Indicador" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENDetraccionVehiculo", propOrder = {
    "codigoMTC",
    "cargaUtil",
    "cargaTM",
    "valorTM",
    "valorPreliminar",
    "indicador"
})
public class ENDetraccionVehiculo {

    @XmlElement(name = "CodigoMTC")
    protected String codigoMTC;
    @XmlElement(name = "CargaUtil")
    protected double cargaUtil;
    @XmlElement(name = "CargaTM")
    protected double cargaTM;
    @XmlElement(name = "ValorTM")
    protected double valorTM;
    @XmlElement(name = "ValorPreliminar")
    protected double valorPreliminar;
    @XmlElement(name = "Indicador")
    protected int indicador;

    /**
     * Obtiene el valor de la propiedad codigoMTC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMTC() {
        return codigoMTC;
    }

    /**
     * Define el valor de la propiedad codigoMTC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMTC(String value) {
        this.codigoMTC = value;
    }

    /**
     * Obtiene el valor de la propiedad cargaUtil.
     * 
     */
    public double getCargaUtil() {
        return cargaUtil;
    }

    /**
     * Define el valor de la propiedad cargaUtil.
     * 
     */
    public void setCargaUtil(double value) {
        this.cargaUtil = value;
    }

    /**
     * Obtiene el valor de la propiedad cargaTM.
     * 
     */
    public double getCargaTM() {
        return cargaTM;
    }

    /**
     * Define el valor de la propiedad cargaTM.
     * 
     */
    public void setCargaTM(double value) {
        this.cargaTM = value;
    }

    /**
     * Obtiene el valor de la propiedad valorTM.
     * 
     */
    public double getValorTM() {
        return valorTM;
    }

    /**
     * Define el valor de la propiedad valorTM.
     * 
     */
    public void setValorTM(double value) {
        this.valorTM = value;
    }

    /**
     * Obtiene el valor de la propiedad valorPreliminar.
     * 
     */
    public double getValorPreliminar() {
        return valorPreliminar;
    }

    /**
     * Define el valor de la propiedad valorPreliminar.
     * 
     */
    public void setValorPreliminar(double value) {
        this.valorPreliminar = value;
    }

    /**
     * Obtiene el valor de la propiedad indicador.
     * 
     */
    public int getIndicador() {
        return indicador;
    }

    /**
     * Define el valor de la propiedad indicador.
     * 
     */
    public void setIndicador(int value) {
        this.indicador = value;
    }

}
