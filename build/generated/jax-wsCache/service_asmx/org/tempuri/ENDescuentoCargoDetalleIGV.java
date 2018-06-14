
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENDescuentoCargoDetalleIGV complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENDescuentoCargoDetalleIGV">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Indicador" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Porcentaje" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENDescuentoCargoDetalleIGV", propOrder = {
    "indicador",
    "porcentaje",
    "monto"
})
public class ENDescuentoCargoDetalleIGV {

    @XmlElement(name = "Indicador")
    protected int indicador;
    @XmlElement(name = "Porcentaje", required = true)
    protected BigDecimal porcentaje;
    @XmlElement(name = "Monto", required = true)
    protected BigDecimal monto;

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

    /**
     * Obtiene el valor de la propiedad porcentaje.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    /**
     * Define el valor de la propiedad porcentaje.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentaje(BigDecimal value) {
        this.porcentaje = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonto(BigDecimal value) {
        this.monto = value;
    }

}
