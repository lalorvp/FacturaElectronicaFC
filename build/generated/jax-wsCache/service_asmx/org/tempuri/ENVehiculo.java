
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ENVehiculo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENVehiculo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MedidaLlantas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Peso" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Clase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CargaUtil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PesoBruto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pasajeros" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Asiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Puertas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Alto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DistribucionEjes" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="largo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Ancho" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TipoNeumatico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ejes" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PotenciaKW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PotenciaHP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ruedas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Transmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Traccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cilindrada" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Cilindros" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Carroceria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Combustible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Motor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnioFabricacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AnioModelo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Modelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kilometro" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NroOrdenTrabajo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Zona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NroPedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormulaRodante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PotenciaMotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Asegurado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Siniestro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Poliza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Propietario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModeloMotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerieMotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CentroCarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENVehiculo", propOrder = {
    "medidaLlantas",
    "aro",
    "peso",
    "clase",
    "cargaUtil",
    "pesoBruto",
    "pasajeros",
    "asiento",
    "categoria",
    "puertas",
    "alto",
    "distribucionEjes",
    "largo",
    "ancho",
    "tipoNeumatico",
    "ejes",
    "potenciaKW",
    "potenciaHP",
    "ruedas",
    "transmision",
    "traccion",
    "cilindrada",
    "cilindros",
    "carroceria",
    "combustible",
    "color",
    "motor",
    "anioFabricacion",
    "anioModelo",
    "serie",
    "placa",
    "modelo",
    "marca",
    "kilometro",
    "nroOrdenTrabajo",
    "zona",
    "nroPedido",
    "version",
    "formulaRodante",
    "potenciaMotor",
    "asegurado",
    "siniestro",
    "poliza",
    "propietario",
    "modeloMotor",
    "serieMotor",
    "vin",
    "centroCarga"
})
public class ENVehiculo {

    @XmlElement(name = "MedidaLlantas")
    protected String medidaLlantas;
    @XmlElement(name = "Aro")
    protected String aro;
    @XmlElement(name = "Peso")
    protected double peso;
    @XmlElement(name = "Clase")
    protected String clase;
    @XmlElement(name = "CargaUtil")
    protected String cargaUtil;
    @XmlElement(name = "PesoBruto")
    protected String pesoBruto;
    @XmlElement(name = "Pasajeros")
    protected String pasajeros;
    @XmlElement(name = "Asiento")
    protected String asiento;
    @XmlElement(name = "Categoria")
    protected String categoria;
    @XmlElement(name = "Puertas")
    protected double puertas;
    @XmlElement(name = "Alto")
    protected double alto;
    @XmlElement(name = "DistribucionEjes")
    protected double distribucionEjes;
    protected double largo;
    @XmlElement(name = "Ancho")
    protected double ancho;
    @XmlElement(name = "TipoNeumatico")
    protected String tipoNeumatico;
    @XmlElement(name = "Ejes")
    protected double ejes;
    @XmlElement(name = "PotenciaKW")
    protected String potenciaKW;
    @XmlElement(name = "PotenciaHP")
    protected String potenciaHP;
    @XmlElement(name = "Ruedas")
    protected double ruedas;
    @XmlElement(name = "Transmision")
    protected String transmision;
    @XmlElement(name = "Traccion")
    protected String traccion;
    @XmlElement(name = "Cilindrada")
    protected double cilindrada;
    @XmlElement(name = "Cilindros")
    protected double cilindros;
    @XmlElement(name = "Carroceria")
    protected String carroceria;
    @XmlElement(name = "Combustible")
    protected String combustible;
    @XmlElement(name = "Color")
    protected String color;
    @XmlElement(name = "Motor")
    protected String motor;
    @XmlElement(name = "AnioFabricacion")
    protected int anioFabricacion;
    @XmlElement(name = "AnioModelo")
    protected int anioModelo;
    @XmlElement(name = "Serie")
    protected String serie;
    @XmlElement(name = "Placa")
    protected String placa;
    @XmlElement(name = "Modelo")
    protected String modelo;
    @XmlElement(name = "Marca")
    protected String marca;
    @XmlElement(name = "Kilometro")
    protected double kilometro;
    @XmlElement(name = "NroOrdenTrabajo")
    protected String nroOrdenTrabajo;
    @XmlElement(name = "Zona")
    protected String zona;
    @XmlElement(name = "NroPedido")
    protected String nroPedido;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "FormulaRodante")
    protected String formulaRodante;
    @XmlElement(name = "PotenciaMotor")
    protected String potenciaMotor;
    @XmlElement(name = "Asegurado")
    protected String asegurado;
    @XmlElement(name = "Siniestro")
    protected String siniestro;
    @XmlElement(name = "Poliza")
    protected String poliza;
    @XmlElement(name = "Propietario")
    protected String propietario;
    @XmlElement(name = "ModeloMotor")
    protected String modeloMotor;
    @XmlElement(name = "SerieMotor")
    protected String serieMotor;
    @XmlElement(name = "Vin")
    protected String vin;
    @XmlElement(name = "CentroCarga")
    protected String centroCarga;

    /**
     * Obtiene el valor de la propiedad medidaLlantas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedidaLlantas() {
        return medidaLlantas;
    }

    /**
     * Define el valor de la propiedad medidaLlantas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedidaLlantas(String value) {
        this.medidaLlantas = value;
    }

    /**
     * Obtiene el valor de la propiedad aro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAro() {
        return aro;
    }

    /**
     * Define el valor de la propiedad aro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAro(String value) {
        this.aro = value;
    }

    /**
     * Obtiene el valor de la propiedad peso.
     * 
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Define el valor de la propiedad peso.
     * 
     */
    public void setPeso(double value) {
        this.peso = value;
    }

    /**
     * Obtiene el valor de la propiedad clase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClase() {
        return clase;
    }

    /**
     * Define el valor de la propiedad clase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClase(String value) {
        this.clase = value;
    }

    /**
     * Obtiene el valor de la propiedad cargaUtil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargaUtil() {
        return cargaUtil;
    }

    /**
     * Define el valor de la propiedad cargaUtil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargaUtil(String value) {
        this.cargaUtil = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoBruto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoBruto() {
        return pesoBruto;
    }

    /**
     * Define el valor de la propiedad pesoBruto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoBruto(String value) {
        this.pesoBruto = value;
    }

    /**
     * Obtiene el valor de la propiedad pasajeros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasajeros() {
        return pasajeros;
    }

    /**
     * Define el valor de la propiedad pasajeros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasajeros(String value) {
        this.pasajeros = value;
    }

    /**
     * Obtiene el valor de la propiedad asiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiento() {
        return asiento;
    }

    /**
     * Define el valor de la propiedad asiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiento(String value) {
        this.asiento = value;
    }

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
     * Obtiene el valor de la propiedad puertas.
     * 
     */
    public double getPuertas() {
        return puertas;
    }

    /**
     * Define el valor de la propiedad puertas.
     * 
     */
    public void setPuertas(double value) {
        this.puertas = value;
    }

    /**
     * Obtiene el valor de la propiedad alto.
     * 
     */
    public double getAlto() {
        return alto;
    }

    /**
     * Define el valor de la propiedad alto.
     * 
     */
    public void setAlto(double value) {
        this.alto = value;
    }

    /**
     * Obtiene el valor de la propiedad distribucionEjes.
     * 
     */
    public double getDistribucionEjes() {
        return distribucionEjes;
    }

    /**
     * Define el valor de la propiedad distribucionEjes.
     * 
     */
    public void setDistribucionEjes(double value) {
        this.distribucionEjes = value;
    }

    /**
     * Obtiene el valor de la propiedad largo.
     * 
     */
    public double getLargo() {
        return largo;
    }

    /**
     * Define el valor de la propiedad largo.
     * 
     */
    public void setLargo(double value) {
        this.largo = value;
    }

    /**
     * Obtiene el valor de la propiedad ancho.
     * 
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * Define el valor de la propiedad ancho.
     * 
     */
    public void setAncho(double value) {
        this.ancho = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoNeumatico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoNeumatico() {
        return tipoNeumatico;
    }

    /**
     * Define el valor de la propiedad tipoNeumatico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoNeumatico(String value) {
        this.tipoNeumatico = value;
    }

    /**
     * Obtiene el valor de la propiedad ejes.
     * 
     */
    public double getEjes() {
        return ejes;
    }

    /**
     * Define el valor de la propiedad ejes.
     * 
     */
    public void setEjes(double value) {
        this.ejes = value;
    }

    /**
     * Obtiene el valor de la propiedad potenciaKW.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPotenciaKW() {
        return potenciaKW;
    }

    /**
     * Define el valor de la propiedad potenciaKW.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPotenciaKW(String value) {
        this.potenciaKW = value;
    }

    /**
     * Obtiene el valor de la propiedad potenciaHP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPotenciaHP() {
        return potenciaHP;
    }

    /**
     * Define el valor de la propiedad potenciaHP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPotenciaHP(String value) {
        this.potenciaHP = value;
    }

    /**
     * Obtiene el valor de la propiedad ruedas.
     * 
     */
    public double getRuedas() {
        return ruedas;
    }

    /**
     * Define el valor de la propiedad ruedas.
     * 
     */
    public void setRuedas(double value) {
        this.ruedas = value;
    }

    /**
     * Obtiene el valor de la propiedad transmision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmision() {
        return transmision;
    }

    /**
     * Define el valor de la propiedad transmision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmision(String value) {
        this.transmision = value;
    }

    /**
     * Obtiene el valor de la propiedad traccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraccion() {
        return traccion;
    }

    /**
     * Define el valor de la propiedad traccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraccion(String value) {
        this.traccion = value;
    }

    /**
     * Obtiene el valor de la propiedad cilindrada.
     * 
     */
    public double getCilindrada() {
        return cilindrada;
    }

    /**
     * Define el valor de la propiedad cilindrada.
     * 
     */
    public void setCilindrada(double value) {
        this.cilindrada = value;
    }

    /**
     * Obtiene el valor de la propiedad cilindros.
     * 
     */
    public double getCilindros() {
        return cilindros;
    }

    /**
     * Define el valor de la propiedad cilindros.
     * 
     */
    public void setCilindros(double value) {
        this.cilindros = value;
    }

    /**
     * Obtiene el valor de la propiedad carroceria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarroceria() {
        return carroceria;
    }

    /**
     * Define el valor de la propiedad carroceria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarroceria(String value) {
        this.carroceria = value;
    }

    /**
     * Obtiene el valor de la propiedad combustible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCombustible() {
        return combustible;
    }

    /**
     * Define el valor de la propiedad combustible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCombustible(String value) {
        this.combustible = value;
    }

    /**
     * Obtiene el valor de la propiedad color.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Define el valor de la propiedad color.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Obtiene el valor de la propiedad motor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotor() {
        return motor;
    }

    /**
     * Define el valor de la propiedad motor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotor(String value) {
        this.motor = value;
    }

    /**
     * Obtiene el valor de la propiedad anioFabricacion.
     * 
     */
    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    /**
     * Define el valor de la propiedad anioFabricacion.
     * 
     */
    public void setAnioFabricacion(int value) {
        this.anioFabricacion = value;
    }

    /**
     * Obtiene el valor de la propiedad anioModelo.
     * 
     */
    public int getAnioModelo() {
        return anioModelo;
    }

    /**
     * Define el valor de la propiedad anioModelo.
     * 
     */
    public void setAnioModelo(int value) {
        this.anioModelo = value;
    }

    /**
     * Obtiene el valor de la propiedad serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Define el valor de la propiedad serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Obtiene el valor de la propiedad placa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Define el valor de la propiedad placa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad kilometro.
     * 
     */
    public double getKilometro() {
        return kilometro;
    }

    /**
     * Define el valor de la propiedad kilometro.
     * 
     */
    public void setKilometro(double value) {
        this.kilometro = value;
    }

    /**
     * Obtiene el valor de la propiedad nroOrdenTrabajo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroOrdenTrabajo() {
        return nroOrdenTrabajo;
    }

    /**
     * Define el valor de la propiedad nroOrdenTrabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroOrdenTrabajo(String value) {
        this.nroOrdenTrabajo = value;
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
     * Obtiene el valor de la propiedad nroPedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroPedido() {
        return nroPedido;
    }

    /**
     * Define el valor de la propiedad nroPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroPedido(String value) {
        this.nroPedido = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad formulaRodante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormulaRodante() {
        return formulaRodante;
    }

    /**
     * Define el valor de la propiedad formulaRodante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormulaRodante(String value) {
        this.formulaRodante = value;
    }

    /**
     * Obtiene el valor de la propiedad potenciaMotor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPotenciaMotor() {
        return potenciaMotor;
    }

    /**
     * Define el valor de la propiedad potenciaMotor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPotenciaMotor(String value) {
        this.potenciaMotor = value;
    }

    /**
     * Obtiene el valor de la propiedad asegurado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsegurado() {
        return asegurado;
    }

    /**
     * Define el valor de la propiedad asegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsegurado(String value) {
        this.asegurado = value;
    }

    /**
     * Obtiene el valor de la propiedad siniestro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiniestro() {
        return siniestro;
    }

    /**
     * Define el valor de la propiedad siniestro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiniestro(String value) {
        this.siniestro = value;
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
     * Obtiene el valor de la propiedad propietario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Define el valor de la propiedad propietario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropietario(String value) {
        this.propietario = value;
    }

    /**
     * Obtiene el valor de la propiedad modeloMotor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeloMotor() {
        return modeloMotor;
    }

    /**
     * Define el valor de la propiedad modeloMotor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeloMotor(String value) {
        this.modeloMotor = value;
    }

    /**
     * Obtiene el valor de la propiedad serieMotor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieMotor() {
        return serieMotor;
    }

    /**
     * Define el valor de la propiedad serieMotor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieMotor(String value) {
        this.serieMotor = value;
    }

    /**
     * Obtiene el valor de la propiedad vin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVin() {
        return vin;
    }

    /**
     * Define el valor de la propiedad vin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVin(String value) {
        this.vin = value;
    }

    /**
     * Obtiene el valor de la propiedad centroCarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentroCarga() {
        return centroCarga;
    }

    /**
     * Define el valor de la propiedad centroCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentroCarga(String value) {
        this.centroCarga = value;
    }

}
