
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENSalud complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENSalud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Empresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Paciente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Titular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CartaGarantia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Poliza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdenAtencion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aseguradora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Historia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coaseguro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Medico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Consultorio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Concepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Liquidacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Habitacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdenServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModalidadPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VigenciaOa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalBruto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PagoPaciente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CopagoVariable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaCita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoAsegurado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENSalud", propOrder = {
    "empresa",
    "paciente",
    "titular",
    "cartaGarantia",
    "poliza",
    "oam",
    "ordenAtencion",
    "vigencia",
    "aseguradora",
    "historia",
    "coaseguro",
    "medico",
    "consultorio",
    "usuario",
    "transaccion",
    "concepto",
    "liquidacion",
    "habitacion",
    "codigo",
    "ordenServicio",
    "expediente",
    "modalidadPago",
    "vigenciaOa",
    "totalBruto",
    "pagoPaciente",
    "copagoVariable",
    "cobertura",
    "fechaCita",
    "codigoAsegurado"
})
public class ENSalud {

    @XmlElement(name = "Empresa")
    protected String empresa;
    @XmlElement(name = "Paciente")
    protected String paciente;
    @XmlElement(name = "Titular")
    protected String titular;
    @XmlElement(name = "CartaGarantia")
    protected String cartaGarantia;
    @XmlElement(name = "Poliza")
    protected String poliza;
    @XmlElement(name = "OAM")
    protected String oam;
    @XmlElement(name = "OrdenAtencion")
    protected String ordenAtencion;
    @XmlElement(name = "Vigencia")
    protected String vigencia;
    @XmlElement(name = "Aseguradora")
    protected String aseguradora;
    @XmlElement(name = "Historia")
    protected String historia;
    @XmlElement(name = "Coaseguro")
    protected String coaseguro;
    @XmlElement(name = "Medico")
    protected String medico;
    @XmlElement(name = "Consultorio")
    protected String consultorio;
    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Transaccion")
    protected String transaccion;
    @XmlElement(name = "Concepto")
    protected String concepto;
    @XmlElement(name = "Liquidacion")
    protected String liquidacion;
    @XmlElement(name = "Habitacion")
    protected String habitacion;
    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "OrdenServicio")
    protected String ordenServicio;
    @XmlElement(name = "Expediente")
    protected String expediente;
    @XmlElement(name = "ModalidadPago")
    protected String modalidadPago;
    @XmlElement(name = "VigenciaOa")
    protected String vigenciaOa;
    @XmlElement(name = "TotalBruto")
    protected String totalBruto;
    @XmlElement(name = "PagoPaciente")
    protected String pagoPaciente;
    @XmlElement(name = "CopagoVariable")
    protected String copagoVariable;
    @XmlElement(name = "Cobertura")
    protected String cobertura;
    @XmlElement(name = "FechaCita")
    protected String fechaCita;
    @XmlElement(name = "CodigoAsegurado")
    protected String codigoAsegurado;

    /**
     * Obtiene el valor de la propiedad empresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Define el valor de la propiedad empresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpresa(String value) {
        this.empresa = value;
    }

    /**
     * Obtiene el valor de la propiedad paciente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaciente() {
        return paciente;
    }

    /**
     * Define el valor de la propiedad paciente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaciente(String value) {
        this.paciente = value;
    }

    /**
     * Obtiene el valor de la propiedad titular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Define el valor de la propiedad titular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitular(String value) {
        this.titular = value;
    }

    /**
     * Obtiene el valor de la propiedad cartaGarantia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartaGarantia() {
        return cartaGarantia;
    }

    /**
     * Define el valor de la propiedad cartaGarantia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartaGarantia(String value) {
        this.cartaGarantia = value;
    }

    /**
     * Obtiene el valor de la propiedad poliza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliza() {
        return poliza;
    }

    /**
     * Define el valor de la propiedad poliza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliza(String value) {
        this.poliza = value;
    }

    /**
     * Obtiene el valor de la propiedad oam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOAM() {
        return oam;
    }

    /**
     * Define el valor de la propiedad oam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOAM(String value) {
        this.oam = value;
    }

    /**
     * Obtiene el valor de la propiedad ordenAtencion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdenAtencion() {
        return ordenAtencion;
    }

    /**
     * Define el valor de la propiedad ordenAtencion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdenAtencion(String value) {
        this.ordenAtencion = value;
    }

    /**
     * Obtiene el valor de la propiedad vigencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVigencia() {
        return vigencia;
    }

    /**
     * Define el valor de la propiedad vigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVigencia(String value) {
        this.vigencia = value;
    }

    /**
     * Obtiene el valor de la propiedad aseguradora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAseguradora() {
        return aseguradora;
    }

    /**
     * Define el valor de la propiedad aseguradora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAseguradora(String value) {
        this.aseguradora = value;
    }

    /**
     * Obtiene el valor de la propiedad historia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoria() {
        return historia;
    }

    /**
     * Define el valor de la propiedad historia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoria(String value) {
        this.historia = value;
    }

    /**
     * Obtiene el valor de la propiedad coaseguro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoaseguro() {
        return coaseguro;
    }

    /**
     * Define el valor de la propiedad coaseguro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoaseguro(String value) {
        this.coaseguro = value;
    }

    /**
     * Obtiene el valor de la propiedad medico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedico() {
        return medico;
    }

    /**
     * Define el valor de la propiedad medico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedico(String value) {
        this.medico = value;
    }

    /**
     * Obtiene el valor de la propiedad consultorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultorio() {
        return consultorio;
    }

    /**
     * Define el valor de la propiedad consultorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultorio(String value) {
        this.consultorio = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad transaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransaccion() {
        return transaccion;
    }

    /**
     * Define el valor de la propiedad transaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransaccion(String value) {
        this.transaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad concepto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * Define el valor de la propiedad concepto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcepto(String value) {
        this.concepto = value;
    }

    /**
     * Obtiene el valor de la propiedad liquidacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiquidacion() {
        return liquidacion;
    }

    /**
     * Define el valor de la propiedad liquidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiquidacion(String value) {
        this.liquidacion = value;
    }

    /**
     * Obtiene el valor de la propiedad habitacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabitacion() {
        return habitacion;
    }

    /**
     * Define el valor de la propiedad habitacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabitacion(String value) {
        this.habitacion = value;
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
     * Obtiene el valor de la propiedad ordenServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdenServicio() {
        return ordenServicio;
    }

    /**
     * Define el valor de la propiedad ordenServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdenServicio(String value) {
        this.ordenServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad expediente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpediente() {
        return expediente;
    }

    /**
     * Define el valor de la propiedad expediente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpediente(String value) {
        this.expediente = value;
    }

    /**
     * Obtiene el valor de la propiedad modalidadPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModalidadPago() {
        return modalidadPago;
    }

    /**
     * Define el valor de la propiedad modalidadPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModalidadPago(String value) {
        this.modalidadPago = value;
    }

    /**
     * Obtiene el valor de la propiedad vigenciaOa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVigenciaOa() {
        return vigenciaOa;
    }

    /**
     * Define el valor de la propiedad vigenciaOa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVigenciaOa(String value) {
        this.vigenciaOa = value;
    }

    /**
     * Obtiene el valor de la propiedad totalBruto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalBruto() {
        return totalBruto;
    }

    /**
     * Define el valor de la propiedad totalBruto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalBruto(String value) {
        this.totalBruto = value;
    }

    /**
     * Obtiene el valor de la propiedad pagoPaciente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagoPaciente() {
        return pagoPaciente;
    }

    /**
     * Define el valor de la propiedad pagoPaciente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagoPaciente(String value) {
        this.pagoPaciente = value;
    }

    /**
     * Obtiene el valor de la propiedad copagoVariable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopagoVariable() {
        return copagoVariable;
    }

    /**
     * Define el valor de la propiedad copagoVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopagoVariable(String value) {
        this.copagoVariable = value;
    }

    /**
     * Obtiene el valor de la propiedad cobertura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCobertura() {
        return cobertura;
    }

    /**
     * Define el valor de la propiedad cobertura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCobertura(String value) {
        this.cobertura = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCita() {
        return fechaCita;
    }

    /**
     * Define el valor de la propiedad fechaCita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCita(String value) {
        this.fechaCita = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoAsegurado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAsegurado() {
        return codigoAsegurado;
    }

    /**
     * Define el valor de la propiedad codigoAsegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAsegurado(String value) {
        this.codigoAsegurado = value;
    }

}
