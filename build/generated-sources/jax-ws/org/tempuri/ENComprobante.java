
package org.tempuri;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * <p>Clase Java para ENComprobante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENComprobante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoLogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComprobanteAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NroOrdenCompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombrepd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="archivopdf" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="TipoSubida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtAdicionales" minOccurs="0">
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
 *         &lt;element name="FechaObtencion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="nrodocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoAImagenCode128" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoPlantilla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtvendedor" minOccurs="0">
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
 *         &lt;element name="Vehiculo" type="{http://tempuri.org/}ArrayOfENVehiculo" minOccurs="0"/>
 *         &lt;element name="IdComprobante" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdEmpresa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdSeguimiento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ruc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RazonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstadoCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstadoSunat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaEmision" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IdTransaccion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DescuentoGlobal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalCargo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ImporteTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Glosa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDocumentoIdentidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClienteDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpcionBuscar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalImporteIncImpuesto" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FecEmisionDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FecEmisionHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaEmisionDesde" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaEmisionHasta" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FiltroFechas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TipoDocumentoReferenciaGuia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoDocumentoReferenciaGuia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDocumentoReferenciaOtroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoDocumentoReferenciaOtroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConceptoDetraccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComprobanteGuia" type="{http://tempuri.org/}ArrayOfENComprobanteGuia" minOccurs="0"/>
 *         &lt;element name="Detraccion" type="{http://tempuri.org/}ArrayOfENDetraccion" minOccurs="0"/>
 *         &lt;element name="ComprobanteImpuestos" type="{http://tempuri.org/}ArrayOfENComprobanteImpuestos" minOccurs="0"/>
 *         &lt;element name="ComprobanteDetalle" type="{http://tempuri.org/}ArrayOfENComprobanteDetalle" minOccurs="0"/>
 *         &lt;element name="DescuentoCargoCabecera" type="{http://tempuri.org/}ArrayOfENDescuentoCargoCabecera" minOccurs="0"/>
 *         &lt;element name="ComprobanteNotaCreditoDocRef" type="{http://tempuri.org/}ArrayOfENComprobanteNotaDocRef" minOccurs="0"/>
 *         &lt;element name="ComprobanteOtrosDocumentos" type="{http://tempuri.org/}ArrayOfENComprobantesOtrosDocumentos" minOccurs="0"/>
 *         &lt;element name="ComprobanteMotivosDocumentos" type="{http://tempuri.org/}ArrayOfENComprobanteMotivoDocumento" minOccurs="0"/>
 *         &lt;element name="Comprobante_MontosAdicionalesGeneral" type="{http://tempuri.org/}ArrayOfENComprobanteMontosAdicionales" minOccurs="0"/>
 *         &lt;element name="ComprobantePropiedadesAdicionales" type="{http://tempuri.org/}ArrayOfENComprobantePropiedadesAdicionales" minOccurs="0"/>
 *         &lt;element name="ComprobanteMontosAdicionalesObligatorios" type="{http://tempuri.org/}ArrayOfENComprobanteMontosAdicionalesObligatorios" minOccurs="0"/>
 *         &lt;element name="ComprobanteMontosAdicionalesOtros" type="{http://tempuri.org/}ArrayOfENComprobanteMontosAdicionalesOtros" minOccurs="0"/>
 *         &lt;element name="ComprobanteMontosAdicionalesPercepcion" type="{http://tempuri.org/}ArrayOfENComprobanteMontosAdicionalesPercepcion" minOccurs="0"/>
 *         &lt;element name="ComprobantePropiedadesAdicionalesInvoice" type="{http://tempuri.org/}ArrayOfENComprobantePropiedadesAdicionalesInvoice" minOccurs="0"/>
 *         &lt;element name="dtvehiculos" minOccurs="0">
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
 *         &lt;element name="dtComprobante" minOccurs="0">
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
 *         &lt;element name="dtComprobanteDetalle" minOccurs="0">
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
 *         &lt;element name="dtComprobanteMotivoDocumento" minOccurs="0">
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
 *         &lt;element name="dtComprobanteMotivoDocumentoSustento" minOccurs="0">
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
 *         &lt;element name="dtComprobanteDescuentoCargo" minOccurs="0">
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
 *         &lt;element name="dtComprobanteGuia" minOccurs="0">
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
 *         &lt;element name="dtComprobanteOtrosDocumentos" minOccurs="0">
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
 *         &lt;element name="dtComprobanteImpuestos" minOccurs="0">
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
 *         &lt;element name="dtComprobanteDetalleDescuentoCargo" minOccurs="0">
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
 *         &lt;element name="dtComprobanteDetalleImpuesto" minOccurs="0">
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
 *         &lt;element name="dtComprobanteNotaCreditoDocRef" minOccurs="0">
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
 *         &lt;element name="dtComprobanteNotaCreditoDocRefDetalle" minOccurs="0">
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
 *         &lt;element name="dtComprobanteNotaCreditoDocRefDetalleDescuentoCargo" minOccurs="0">
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
 *         &lt;element name="dtComprobanteNotaCreditoDetalleDocRef" minOccurs="0">
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
 *         &lt;element name="dtComprobanteNotaCreditoDetalleDocRefDetalle" minOccurs="0">
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
 *         &lt;element name="dtComprobanteNotaCreditoDetalleDocRefDetalleDescuentoCargo" minOccurs="0">
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
 *         &lt;element name="dtComprobanteDescuentoCargoCabecera" minOccurs="0">
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
 *         &lt;element name="dtComprobanteDescuentoCargoDetalle" minOccurs="0">
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
 *         &lt;element name="dtComprobanteMontosAdicionales" minOccurs="0">
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
 *         &lt;element name="dtComprobantePropiedadesAdicionales" minOccurs="0">
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
 *         &lt;element name="dtComprobantePropiedadesAdicionalesInvoice" minOccurs="0">
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
 *         &lt;element name="dtComprobanteHospedaje" minOccurs="0">
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
 *         &lt;element name="dtComprobanteDetraccion" minOccurs="0">
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
 *         &lt;element name="ArchivoXML_No_encriptado" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="CodigodeBarras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreArchivoXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroPagina" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CantidadRegistros" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodMediosPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorreoElectronico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hospedaje" type="{http://tempuri.org/}ENHospedaje" minOccurs="0"/>
 *         &lt;element name="Anticipo" type="{http://tempuri.org/}ArrayOfENAnticipo" minOccurs="0"/>
 *         &lt;element name="Multiglosa" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Sucursal" type="{http://tempuri.org/}ArrayOfENSucursal" minOccurs="0"/>
 *         &lt;element name="Prepago" type="{http://tempuri.org/}ArrayOfENPrepago" minOccurs="0"/>
 *         &lt;element name="FondoGarantia" type="{http://tempuri.org/}ArrayOfENFondoGarantia" minOccurs="0"/>
 *         &lt;element name="Texto" type="{http://tempuri.org/}ArrayOfENTexto" minOccurs="0"/>
 *         &lt;element name="ComprobanteRefActivos" type="{http://tempuri.org/}ArrayOfENComprobanteNotaDocRefActivos" minOccurs="0"/>
 *         &lt;element name="DireccionEntregaBienServicio" type="{http://tempuri.org/}ArrayOfENDireccionEntregaBienServicio" minOccurs="0"/>
 *         &lt;element name="TipoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComercioExterior" type="{http://tempuri.org/}ArrayOfENComercioExterior" minOccurs="0"/>
 *         &lt;element name="dtComercioExterior" minOccurs="0">
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
 *         &lt;element name="dtComercioExteriorDetalle" minOccurs="0">
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
 *         &lt;element name="Receptor" type="{http://tempuri.org/}ArrayOfENReceptor" minOccurs="0"/>
 *         &lt;element name="dtReceptor" minOccurs="0">
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
 *         &lt;element name="Notificacion" type="{http://tempuri.org/}ArrayOfENNotificacion" minOccurs="0"/>
 *         &lt;element name="dtNotificacion" minOccurs="0">
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
 *         &lt;element name="AgenteCarga" type="{http://tempuri.org/}ArrayOfENAgenteCarga" minOccurs="0"/>
 *         &lt;element name="dtAgenteCarga" minOccurs="0">
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
 *         &lt;element name="FormaPago" type="{http://tempuri.org/}ArrayOfENFormaPago" minOccurs="0"/>
 *         &lt;element name="dtFormaPago" minOccurs="0">
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
 *         &lt;element name="dtTerminosFormaPago" minOccurs="0">
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
 *         &lt;element name="redondeo" type="{http://tempuri.org/}ArrayOfENRedondeo" minOccurs="0"/>
 *         &lt;element name="TotalPrepago" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="flagAdjunto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InformacionGuia" type="{http://tempuri.org/}ENInformacionGuia" minOccurs="0"/>
 *         &lt;element name="Proveedor" type="{http://tempuri.org/}ArrayOfENProveedor" minOccurs="0"/>
 *         &lt;element name="Comercializacion" type="{http://tempuri.org/}ArrayOfENComercializacion" minOccurs="0"/>
 *         &lt;element name="TipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Integracion" type="{http://tempuri.org/}ENIntegracion" minOccurs="0"/>
 *         &lt;element name="IdCorreoRecepcion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IdComprobanteCabecera" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IdComp" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IdTipoOrigen" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TablaAdjuntos" minOccurs="0">
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
 *         &lt;element name="TipoCambio" type="{http://tempuri.org/}ArrayOfENTipoCambio" minOccurs="0"/>
 *         &lt;element name="Vendedor" type="{http://tempuri.org/}ArrayOfENVendedor" minOccurs="0"/>
 *         &lt;element name="Consignatario" type="{http://tempuri.org/}ArrayOfENConsignatario" minOccurs="0"/>
 *         &lt;element name="Remitente" type="{http://tempuri.org/}ArrayOfENRemitente" minOccurs="0"/>
 *         &lt;element name="IdPuntoVenta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MontoIGV" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MontoISC" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MontoGratuito" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MontoExonerado" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MontoInafecto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Grabadas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Network" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorreoTerceros" type="{http://tempuri.org/}ArrayOfENCorreoTerceros" minOccurs="0"/>
 *         &lt;element name="CorreoJsonTercero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoPlantillaCorreo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorreoEmisorMascara" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SucursalEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SistemaEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComprobanteGrilla" type="{http://tempuri.org/}ArrayOfENComprobanteGrilla" minOccurs="0"/>
 *         &lt;element name="Salud" type="{http://tempuri.org/}ENSalud" minOccurs="0"/>
 *         &lt;element name="CamposComerciales" type="{http://tempuri.org/}ENCamposComerciales" minOccurs="0"/>
 *         &lt;element name="ComprobanteGrillaCuenta" type="{http://tempuri.org/}ArrayOfENComprobanteGrillaCuenta" minOccurs="0"/>
 *         &lt;element name="Idioma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlosaDescuentos" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Educacion" type="{http://tempuri.org/}ENEducacion" minOccurs="0"/>
 *         &lt;element name="MontoLetrasAdicional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NrodePedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoraEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaPedido" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Supervisor" type="{http://tempuri.org/}ENSupervisor" minOccurs="0"/>
 *         &lt;element name="OtroConceptoPago" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="EstadoTransmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdcomprobanteCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CasoNegocio" type="{http://tempuri.org/}EnCasoNegocio" minOccurs="0"/>
 *         &lt;element name="GlosaAgenteRetencion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutenticacionCorreo" type="{http://tempuri.org/}ENAutenticacionCorreo" minOccurs="0"/>
 *         &lt;element name="TotalImpuesto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalValorVenta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TotalPrecioVenta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VersionUbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fise" type="{http://tempuri.org/}ArrayOfENFise" minOccurs="0"/>
 *         &lt;element name="AgenteVenta" type="{http://tempuri.org/}ENAgenteVenta" minOccurs="0"/>
 *         &lt;element name="MontosTotales" type="{http://tempuri.org/}ENMontosTotales" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENComprobante", propOrder = {
    "codigoLogo",
    "comprobanteAlias",
    "codigoCliente",
    "nroOrdenCompra",
    "nombrepd",
    "archivopdf",
    "tipoSubida",
    "dtAdicionales",
    "fechaObtencion",
    "nrodocumento",
    "campoAImagenCode128",
    "tipoPlantilla",
    "dtvendedor",
    "vehiculo",
    "idComprobante",
    "idEmpresa",
    "idUsuario",
    "idSeguimiento",
    "ruc",
    "razonSocial",
    "serie",
    "numero",
    "numeroDesde",
    "estadoCE",
    "estadoSunat",
    "numeroHasta",
    "fechaEmision",
    "idTransaccion",
    "descuentoGlobal",
    "totalCargo",
    "importeTotal",
    "estado",
    "tipoComprobante",
    "glosa",
    "tipoDocumentoIdentidad",
    "moneda",
    "clienteDireccion",
    "opcionBuscar",
    "totalImporteIncImpuesto",
    "fecEmisionDesde",
    "fecEmisionHasta",
    "fechaEmisionDesde",
    "fechaEmisionHasta",
    "fecha",
    "filtroFechas",
    "tipoDocumentoReferenciaGuia",
    "codigoDocumentoReferenciaGuia",
    "tipoDocumentoReferenciaOtroDocumento",
    "codigoDocumentoReferenciaOtroDocumento",
    "conceptoDetraccion",
    "comprobanteGuia",
    "detraccion",
    "comprobanteImpuestos",
    "comprobanteDetalle",
    "descuentoCargoCabecera",
    "comprobanteNotaCreditoDocRef",
    "comprobanteOtrosDocumentos",
    "comprobanteMotivosDocumentos",
    "comprobanteMontosAdicionalesGeneral",
    "comprobantePropiedadesAdicionales",
    "comprobanteMontosAdicionalesObligatorios",
    "comprobanteMontosAdicionalesOtros",
    "comprobanteMontosAdicionalesPercepcion",
    "comprobantePropiedadesAdicionalesInvoice",
    "dtvehiculos",
    "dtComprobante",
    "dtComprobanteDetalle",
    "dtComprobanteMotivoDocumento",
    "dtComprobanteMotivoDocumentoSustento",
    "dtComprobanteDescuentoCargo",
    "dtComprobanteGuia",
    "dtComprobanteOtrosDocumentos",
    "dtComprobanteImpuestos",
    "dtComprobanteDetalleDescuentoCargo",
    "dtComprobanteDetalleImpuesto",
    "dtComprobanteNotaCreditoDocRef",
    "dtComprobanteNotaCreditoDocRefDetalle",
    "dtComprobanteNotaCreditoDocRefDetalleDescuentoCargo",
    "dtComprobanteNotaCreditoDetalleDocRef",
    "dtComprobanteNotaCreditoDetalleDocRefDetalle",
    "dtComprobanteNotaCreditoDetalleDocRefDetalleDescuentoCargo",
    "dtComprobanteDescuentoCargoCabecera",
    "dtComprobanteDescuentoCargoDetalle",
    "dtComprobanteMontosAdicionales",
    "dtComprobantePropiedadesAdicionales",
    "dtComprobantePropiedadesAdicionalesInvoice",
    "dtComprobanteHospedaje",
    "dtComprobanteDetraccion",
    "archivoXML",
    "archivoXMLNoEncriptado",
    "codigodeBarras",
    "valorHash",
    "nombreArchivoXML",
    "numeroPagina",
    "cantidadRegistros",
    "codMediosPago",
    "correoElectronico",
    "hospedaje",
    "anticipo",
    "multiglosa",
    "sucursal",
    "prepago",
    "fondoGarantia",
    "texto",
    "comprobanteRefActivos",
    "direccionEntregaBienServicio",
    "tipoPago",
    "comercioExterior",
    "dtComercioExterior",
    "dtComercioExteriorDetalle",
    "receptor",
    "dtReceptor",
    "notificacion",
    "dtNotificacion",
    "agenteCarga",
    "dtAgenteCarga",
    "formaPago",
    "dtFormaPago",
    "dtTerminosFormaPago",
    "redondeo",
    "totalPrepago",
    "flagAdjunto",
    "informacionGuia",
    "proveedor",
    "comercializacion",
    "tipoOperacion",
    "integracion",
    "idCorreoRecepcion",
    "idComprobanteCabecera",
    "idComp",
    "idTipoOrigen",
    "tablaAdjuntos",
    "tipoCambio",
    "vendedor",
    "consignatario",
    "remitente",
    "idPuntoVenta",
    "montoIGV",
    "montoISC",
    "montoGratuito",
    "montoExonerado",
    "montoInafecto",
    "grabadas",
    "network",
    "correoTerceros",
    "correoJsonTercero",
    "tipoPlantillaCorreo",
    "correoEmisorMascara",
    "sucursalEmision",
    "sistemaEmision",
    "comprobanteGrilla",
    "salud",
    "camposComerciales",
    "comprobanteGrillaCuenta",
    "idioma",
    "glosaDescuentos",
    "educacion",
    "montoLetrasAdicional",
    "nrodePedido",
    "horaEmision",
    "fechaPedido",
    "supervisor",
    "otroConceptoPago",
    "estadoTransmision",
    "idcomprobanteCliente",
    "casoNegocio",
    "glosaAgenteRetencion",
    "autenticacionCorreo",
    "totalImpuesto",
    "totalValorVenta",
    "totalPrecioVenta",
    "versionUbl",
    "fise",
    "agenteVenta",
    "montosTotales"
})
public class ENComprobante {

    @XmlElement(name = "CodigoLogo")
    protected String codigoLogo;
    @XmlElement(name = "ComprobanteAlias")
    protected String comprobanteAlias;
    @XmlElement(name = "CodigoCliente")
    protected String codigoCliente;
    @XmlElement(name = "NroOrdenCompra")
    protected String nroOrdenCompra;
    protected String nombrepd;
    protected byte[] archivopdf;
    @XmlElement(name = "TipoSubida")
    protected String tipoSubida;
    protected ENComprobante.DtAdicionales dtAdicionales;
    @XmlElement(name = "FechaObtencion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaObtencion;
    protected String nrodocumento;
    protected String campoAImagenCode128;
    @XmlElement(name = "TipoPlantilla")
    protected String tipoPlantilla;
    protected ENComprobante.Dtvendedor dtvendedor;
    @XmlElement(name = "Vehiculo")
    protected ArrayOfENVehiculo vehiculo;
    @XmlElement(name = "IdComprobante")
    protected int idComprobante;
    @XmlElement(name = "IdEmpresa")
    protected int idEmpresa;
    @XmlElement(name = "IdUsuario")
    protected int idUsuario;
    @XmlElement(name = "IdSeguimiento")
    protected int idSeguimiento;
    @XmlElement(name = "Ruc")
    protected String ruc;
    @XmlElement(name = "RazonSocial")
    protected String razonSocial;
    @XmlElement(name = "Serie")
    protected String serie;
    @XmlElement(name = "Numero")
    protected String numero;
    @XmlElement(name = "NumeroDesde")
    protected String numeroDesde;
    @XmlElement(name = "EstadoCE")
    protected String estadoCE;
    @XmlElement(name = "EstadoSunat")
    protected String estadoSunat;
    @XmlElement(name = "NumeroHasta")
    protected String numeroHasta;
    @XmlElement(name = "FechaEmision", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEmision;
    @XmlElement(name = "IdTransaccion")
    protected int idTransaccion;
    @XmlElement(name = "DescuentoGlobal", required = true)
    protected BigDecimal descuentoGlobal;
    @XmlElement(name = "TotalCargo", required = true)
    protected BigDecimal totalCargo;
    @XmlElement(name = "ImporteTotal", required = true)
    protected BigDecimal importeTotal;
    @XmlElement(name = "Estado")
    protected String estado;
    @XmlElement(name = "TipoComprobante")
    protected String tipoComprobante;
    @XmlElement(name = "Glosa")
    protected String glosa;
    @XmlElement(name = "TipoDocumentoIdentidad")
    protected String tipoDocumentoIdentidad;
    @XmlElement(name = "Moneda")
    protected String moneda;
    @XmlElement(name = "ClienteDireccion")
    protected String clienteDireccion;
    @XmlElement(name = "OpcionBuscar")
    protected String opcionBuscar;
    @XmlElement(name = "TotalImporteIncImpuesto", required = true)
    protected BigDecimal totalImporteIncImpuesto;
    @XmlElement(name = "FecEmisionDesde")
    protected String fecEmisionDesde;
    @XmlElement(name = "FecEmisionHasta")
    protected String fecEmisionHasta;
    @XmlElement(name = "FechaEmisionDesde", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEmisionDesde;
    @XmlElement(name = "FechaEmisionHasta", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEmisionHasta;
    @XmlElement(name = "Fecha", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "FiltroFechas")
    protected boolean filtroFechas;
    @XmlElement(name = "TipoDocumentoReferenciaGuia")
    protected String tipoDocumentoReferenciaGuia;
    @XmlElement(name = "CodigoDocumentoReferenciaGuia")
    protected String codigoDocumentoReferenciaGuia;
    @XmlElement(name = "TipoDocumentoReferenciaOtroDocumento")
    protected String tipoDocumentoReferenciaOtroDocumento;
    @XmlElement(name = "CodigoDocumentoReferenciaOtroDocumento")
    protected String codigoDocumentoReferenciaOtroDocumento;
    @XmlElement(name = "ConceptoDetraccion")
    protected String conceptoDetraccion;
    @XmlElement(name = "ComprobanteGuia")
    protected ArrayOfENComprobanteGuia comprobanteGuia;
    @XmlElement(name = "Detraccion")
    protected ArrayOfENDetraccion detraccion;
    @XmlElement(name = "ComprobanteImpuestos")
    protected ArrayOfENComprobanteImpuestos comprobanteImpuestos;
    @XmlElement(name = "ComprobanteDetalle")
    protected ArrayOfENComprobanteDetalle comprobanteDetalle;
    @XmlElement(name = "DescuentoCargoCabecera")
    protected ArrayOfENDescuentoCargoCabecera descuentoCargoCabecera;
    @XmlElement(name = "ComprobanteNotaCreditoDocRef")
    protected ArrayOfENComprobanteNotaDocRef comprobanteNotaCreditoDocRef;
    @XmlElement(name = "ComprobanteOtrosDocumentos")
    protected ArrayOfENComprobantesOtrosDocumentos comprobanteOtrosDocumentos;
    @XmlElement(name = "ComprobanteMotivosDocumentos")
    protected ArrayOfENComprobanteMotivoDocumento comprobanteMotivosDocumentos;
    @XmlElement(name = "Comprobante_MontosAdicionalesGeneral")
    protected ArrayOfENComprobanteMontosAdicionales comprobanteMontosAdicionalesGeneral;
    @XmlElement(name = "ComprobantePropiedadesAdicionales")
    protected ArrayOfENComprobantePropiedadesAdicionales comprobantePropiedadesAdicionales;
    @XmlElement(name = "ComprobanteMontosAdicionalesObligatorios")
    protected ArrayOfENComprobanteMontosAdicionalesObligatorios comprobanteMontosAdicionalesObligatorios;
    @XmlElement(name = "ComprobanteMontosAdicionalesOtros")
    protected ArrayOfENComprobanteMontosAdicionalesOtros comprobanteMontosAdicionalesOtros;
    @XmlElement(name = "ComprobanteMontosAdicionalesPercepcion")
    protected ArrayOfENComprobanteMontosAdicionalesPercepcion comprobanteMontosAdicionalesPercepcion;
    @XmlElement(name = "ComprobantePropiedadesAdicionalesInvoice")
    protected ArrayOfENComprobantePropiedadesAdicionalesInvoice comprobantePropiedadesAdicionalesInvoice;
    protected ENComprobante.Dtvehiculos dtvehiculos;
    protected ENComprobante.DtComprobante dtComprobante;
    protected ENComprobante.DtComprobanteDetalle dtComprobanteDetalle;
    protected ENComprobante.DtComprobanteMotivoDocumento dtComprobanteMotivoDocumento;
    protected ENComprobante.DtComprobanteMotivoDocumentoSustento dtComprobanteMotivoDocumentoSustento;
    protected ENComprobante.DtComprobanteDescuentoCargo dtComprobanteDescuentoCargo;
    protected ENComprobante.DtComprobanteGuia dtComprobanteGuia;
    protected ENComprobante.DtComprobanteOtrosDocumentos dtComprobanteOtrosDocumentos;
    protected ENComprobante.DtComprobanteImpuestos dtComprobanteImpuestos;
    protected ENComprobante.DtComprobanteDetalleDescuentoCargo dtComprobanteDetalleDescuentoCargo;
    protected ENComprobante.DtComprobanteDetalleImpuesto dtComprobanteDetalleImpuesto;
    protected ENComprobante.DtComprobanteNotaCreditoDocRef dtComprobanteNotaCreditoDocRef;
    protected ENComprobante.DtComprobanteNotaCreditoDocRefDetalle dtComprobanteNotaCreditoDocRefDetalle;
    protected ENComprobante.DtComprobanteNotaCreditoDocRefDetalleDescuentoCargo dtComprobanteNotaCreditoDocRefDetalleDescuentoCargo;
    protected ENComprobante.DtComprobanteNotaCreditoDetalleDocRef dtComprobanteNotaCreditoDetalleDocRef;
    protected ENComprobante.DtComprobanteNotaCreditoDetalleDocRefDetalle dtComprobanteNotaCreditoDetalleDocRefDetalle;
    protected ENComprobante.DtComprobanteNotaCreditoDetalleDocRefDetalleDescuentoCargo dtComprobanteNotaCreditoDetalleDocRefDetalleDescuentoCargo;
    protected ENComprobante.DtComprobanteDescuentoCargoCabecera dtComprobanteDescuentoCargoCabecera;
    protected ENComprobante.DtComprobanteDescuentoCargoDetalle dtComprobanteDescuentoCargoDetalle;
    protected ENComprobante.DtComprobanteMontosAdicionales dtComprobanteMontosAdicionales;
    protected ENComprobante.DtComprobantePropiedadesAdicionales dtComprobantePropiedadesAdicionales;
    protected ENComprobante.DtComprobantePropiedadesAdicionalesInvoice dtComprobantePropiedadesAdicionalesInvoice;
    protected ENComprobante.DtComprobanteHospedaje dtComprobanteHospedaje;
    protected ENComprobante.DtComprobanteDetraccion dtComprobanteDetraccion;
    @XmlElement(name = "ArchivoXML")
    protected byte[] archivoXML;
    @XmlElement(name = "ArchivoXML_No_encriptado")
    protected byte[] archivoXMLNoEncriptado;
    @XmlElement(name = "CodigodeBarras")
    protected String codigodeBarras;
    @XmlElement(name = "ValorHash")
    protected String valorHash;
    @XmlElement(name = "NombreArchivoXML")
    protected String nombreArchivoXML;
    @XmlElement(name = "NumeroPagina")
    protected int numeroPagina;
    @XmlElement(name = "CantidadRegistros")
    protected int cantidadRegistros;
    @XmlElement(name = "CodMediosPago")
    protected String codMediosPago;
    @XmlElement(name = "CorreoElectronico")
    protected String correoElectronico;
    @XmlElement(name = "Hospedaje")
    protected ENHospedaje hospedaje;
    @XmlElement(name = "Anticipo")
    protected ArrayOfENAnticipo anticipo;
    @XmlElement(name = "Multiglosa")
    protected ArrayOfString multiglosa;
    @XmlElement(name = "Sucursal")
    protected ArrayOfENSucursal sucursal;
    @XmlElement(name = "Prepago")
    protected ArrayOfENPrepago prepago;
    @XmlElement(name = "FondoGarantia")
    protected ArrayOfENFondoGarantia fondoGarantia;
    @XmlElement(name = "Texto")
    protected ArrayOfENTexto texto;
    @XmlElement(name = "ComprobanteRefActivos")
    protected ArrayOfENComprobanteNotaDocRefActivos comprobanteRefActivos;
    @XmlElement(name = "DireccionEntregaBienServicio")
    protected ArrayOfENDireccionEntregaBienServicio direccionEntregaBienServicio;
    @XmlElement(name = "TipoPago")
    protected String tipoPago;
    @XmlElement(name = "ComercioExterior")
    protected ArrayOfENComercioExterior comercioExterior;
    protected ENComprobante.DtComercioExterior dtComercioExterior;
    protected ENComprobante.DtComercioExteriorDetalle dtComercioExteriorDetalle;
    @XmlElement(name = "Receptor")
    protected ArrayOfENReceptor receptor;
    protected ENComprobante.DtReceptor dtReceptor;
    @XmlElement(name = "Notificacion")
    protected ArrayOfENNotificacion notificacion;
    protected ENComprobante.DtNotificacion dtNotificacion;
    @XmlElement(name = "AgenteCarga")
    protected ArrayOfENAgenteCarga agenteCarga;
    protected ENComprobante.DtAgenteCarga dtAgenteCarga;
    @XmlElement(name = "FormaPago")
    protected ArrayOfENFormaPago formaPago;
    protected ENComprobante.DtFormaPago dtFormaPago;
    protected ENComprobante.DtTerminosFormaPago dtTerminosFormaPago;
    protected ArrayOfENRedondeo redondeo;
    @XmlElement(name = "TotalPrepago")
    protected double totalPrepago;
    protected int flagAdjunto;
    @XmlElement(name = "InformacionGuia")
    protected ENInformacionGuia informacionGuia;
    @XmlElement(name = "Proveedor")
    protected ArrayOfENProveedor proveedor;
    @XmlElement(name = "Comercializacion")
    protected ArrayOfENComercializacion comercializacion;
    @XmlElement(name = "TipoOperacion")
    protected String tipoOperacion;
    @XmlElement(name = "Integracion")
    protected ENIntegracion integracion;
    @XmlElement(name = "IdCorreoRecepcion")
    protected long idCorreoRecepcion;
    @XmlElement(name = "IdComprobanteCabecera")
    protected long idComprobanteCabecera;
    @XmlElement(name = "IdComp")
    protected long idComp;
    @XmlElement(name = "IdTipoOrigen")
    protected long idTipoOrigen;
    @XmlElement(name = "TablaAdjuntos")
    protected ENComprobante.TablaAdjuntos tablaAdjuntos;
    @XmlElement(name = "TipoCambio")
    protected ArrayOfENTipoCambio tipoCambio;
    @XmlElement(name = "Vendedor")
    protected ArrayOfENVendedor vendedor;
    @XmlElement(name = "Consignatario")
    protected ArrayOfENConsignatario consignatario;
    @XmlElement(name = "Remitente")
    protected ArrayOfENRemitente remitente;
    @XmlElement(name = "IdPuntoVenta")
    protected int idPuntoVenta;
    @XmlElement(name = "MontoIGV")
    protected double montoIGV;
    @XmlElement(name = "MontoISC")
    protected double montoISC;
    @XmlElement(name = "MontoGratuito")
    protected double montoGratuito;
    @XmlElement(name = "MontoExonerado")
    protected double montoExonerado;
    @XmlElement(name = "MontoInafecto")
    protected double montoInafecto;
    @XmlElement(name = "Grabadas")
    protected double grabadas;
    @XmlElement(name = "Network")
    protected String network;
    @XmlElement(name = "CorreoTerceros")
    protected ArrayOfENCorreoTerceros correoTerceros;
    @XmlElement(name = "CorreoJsonTercero")
    protected String correoJsonTercero;
    @XmlElement(name = "TipoPlantillaCorreo")
    protected String tipoPlantillaCorreo;
    @XmlElement(name = "CorreoEmisorMascara")
    protected String correoEmisorMascara;
    @XmlElement(name = "SucursalEmision")
    protected String sucursalEmision;
    @XmlElement(name = "SistemaEmision")
    protected String sistemaEmision;
    @XmlElement(name = "ComprobanteGrilla")
    protected ArrayOfENComprobanteGrilla comprobanteGrilla;
    @XmlElement(name = "Salud")
    protected ENSalud salud;
    @XmlElement(name = "CamposComerciales")
    protected ENCamposComerciales camposComerciales;
    @XmlElement(name = "ComprobanteGrillaCuenta")
    protected ArrayOfENComprobanteGrillaCuenta comprobanteGrillaCuenta;
    @XmlElement(name = "Idioma")
    protected String idioma;
    @XmlElement(name = "GlosaDescuentos")
    protected ArrayOfString glosaDescuentos;
    @XmlElement(name = "Educacion")
    protected ENEducacion educacion;
    @XmlElement(name = "MontoLetrasAdicional")
    protected String montoLetrasAdicional;
    @XmlElement(name = "NrodePedido")
    protected String nrodePedido;
    @XmlElement(name = "HoraEmision")
    protected String horaEmision;
    @XmlElement(name = "FechaPedido", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaPedido;
    @XmlElement(name = "Supervisor")
    protected ENSupervisor supervisor;
    @XmlElement(name = "OtroConceptoPago")
    protected double otroConceptoPago;
    @XmlElement(name = "EstadoTransmision")
    protected String estadoTransmision;
    @XmlElement(name = "IdcomprobanteCliente")
    protected String idcomprobanteCliente;
    @XmlElement(name = "CasoNegocio")
    protected EnCasoNegocio casoNegocio;
    @XmlElement(name = "GlosaAgenteRetencion")
    protected String glosaAgenteRetencion;
    @XmlElement(name = "AutenticacionCorreo")
    protected ENAutenticacionCorreo autenticacionCorreo;
    @XmlElement(name = "TotalImpuesto")
    protected double totalImpuesto;
    @XmlElement(name = "TotalValorVenta")
    protected double totalValorVenta;
    @XmlElement(name = "TotalPrecioVenta")
    protected double totalPrecioVenta;
    @XmlElement(name = "VersionUbl")
    protected String versionUbl;
    @XmlElement(name = "Fise")
    protected ArrayOfENFise fise;
    @XmlElement(name = "AgenteVenta")
    protected ENAgenteVenta agenteVenta;
    @XmlElement(name = "MontosTotales")
    protected ENMontosTotales montosTotales;

    /**
     * Obtiene el valor de la propiedad codigoLogo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoLogo() {
        return codigoLogo;
    }

    /**
     * Define el valor de la propiedad codigoLogo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoLogo(String value) {
        this.codigoLogo = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobanteAlias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComprobanteAlias() {
        return comprobanteAlias;
    }

    /**
     * Define el valor de la propiedad comprobanteAlias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComprobanteAlias(String value) {
        this.comprobanteAlias = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Define el valor de la propiedad codigoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCliente(String value) {
        this.codigoCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad nroOrdenCompra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroOrdenCompra() {
        return nroOrdenCompra;
    }

    /**
     * Define el valor de la propiedad nroOrdenCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroOrdenCompra(String value) {
        this.nroOrdenCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrepd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrepd() {
        return nombrepd;
    }

    /**
     * Define el valor de la propiedad nombrepd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrepd(String value) {
        this.nombrepd = value;
    }

    /**
     * Obtiene el valor de la propiedad archivopdf.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getArchivopdf() {
        return archivopdf;
    }

    /**
     * Define el valor de la propiedad archivopdf.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setArchivopdf(byte[] value) {
        this.archivopdf = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoSubida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoSubida() {
        return tipoSubida;
    }

    /**
     * Define el valor de la propiedad tipoSubida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoSubida(String value) {
        this.tipoSubida = value;
    }

    /**
     * Obtiene el valor de la propiedad dtAdicionales.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtAdicionales }
     *     
     */
    public ENComprobante.DtAdicionales getDtAdicionales() {
        return dtAdicionales;
    }

    /**
     * Define el valor de la propiedad dtAdicionales.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtAdicionales }
     *     
     */
    public void setDtAdicionales(ENComprobante.DtAdicionales value) {
        this.dtAdicionales = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaObtencion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaObtencion() {
        return fechaObtencion;
    }

    /**
     * Define el valor de la propiedad fechaObtencion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaObtencion(XMLGregorianCalendar value) {
        this.fechaObtencion = value;
    }

    /**
     * Obtiene el valor de la propiedad nrodocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrodocumento() {
        return nrodocumento;
    }

    /**
     * Define el valor de la propiedad nrodocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrodocumento(String value) {
        this.nrodocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad campoAImagenCode128.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoAImagenCode128() {
        return campoAImagenCode128;
    }

    /**
     * Define el valor de la propiedad campoAImagenCode128.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoAImagenCode128(String value) {
        this.campoAImagenCode128 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPlantilla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPlantilla() {
        return tipoPlantilla;
    }

    /**
     * Define el valor de la propiedad tipoPlantilla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPlantilla(String value) {
        this.tipoPlantilla = value;
    }

    /**
     * Obtiene el valor de la propiedad dtvendedor.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.Dtvendedor }
     *     
     */
    public ENComprobante.Dtvendedor getDtvendedor() {
        return dtvendedor;
    }

    /**
     * Define el valor de la propiedad dtvendedor.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.Dtvendedor }
     *     
     */
    public void setDtvendedor(ENComprobante.Dtvendedor value) {
        this.dtvendedor = value;
    }

    /**
     * Obtiene el valor de la propiedad vehiculo.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENVehiculo }
     *     
     */
    public ArrayOfENVehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Define el valor de la propiedad vehiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENVehiculo }
     *     
     */
    public void setVehiculo(ArrayOfENVehiculo value) {
        this.vehiculo = value;
    }

    /**
     * Obtiene el valor de la propiedad idComprobante.
     * 
     */
    public int getIdComprobante() {
        return idComprobante;
    }

    /**
     * Define el valor de la propiedad idComprobante.
     * 
     */
    public void setIdComprobante(int value) {
        this.idComprobante = value;
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
     * Obtiene el valor de la propiedad idSeguimiento.
     * 
     */
    public int getIdSeguimiento() {
        return idSeguimiento;
    }

    /**
     * Define el valor de la propiedad idSeguimiento.
     * 
     */
    public void setIdSeguimiento(int value) {
        this.idSeguimiento = value;
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
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDesde() {
        return numeroDesde;
    }

    /**
     * Define el valor de la propiedad numeroDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDesde(String value) {
        this.numeroDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoCE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCE() {
        return estadoCE;
    }

    /**
     * Define el valor de la propiedad estadoCE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCE(String value) {
        this.estadoCE = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoSunat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoSunat() {
        return estadoSunat;
    }

    /**
     * Define el valor de la propiedad estadoSunat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoSunat(String value) {
        this.estadoSunat = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroHasta() {
        return numeroHasta;
    }

    /**
     * Define el valor de la propiedad numeroHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroHasta(String value) {
        this.numeroHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmision.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Define el valor de la propiedad fechaEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEmision(XMLGregorianCalendar value) {
        this.fechaEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad idTransaccion.
     * 
     */
    public int getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * Define el valor de la propiedad idTransaccion.
     * 
     */
    public void setIdTransaccion(int value) {
        this.idTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad descuentoGlobal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDescuentoGlobal() {
        return descuentoGlobal;
    }

    /**
     * Define el valor de la propiedad descuentoGlobal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDescuentoGlobal(BigDecimal value) {
        this.descuentoGlobal = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCargo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCargo() {
        return totalCargo;
    }

    /**
     * Define el valor de la propiedad totalCargo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCargo(BigDecimal value) {
        this.totalCargo = value;
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
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoComprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoComprobante() {
        return tipoComprobante;
    }

    /**
     * Define el valor de la propiedad tipoComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoComprobante(String value) {
        this.tipoComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad glosa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlosa() {
        return glosa;
    }

    /**
     * Define el valor de la propiedad glosa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlosa(String value) {
        this.glosa = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumentoIdentidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumentoIdentidad() {
        return tipoDocumentoIdentidad;
    }

    /**
     * Define el valor de la propiedad tipoDocumentoIdentidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumentoIdentidad(String value) {
        this.tipoDocumentoIdentidad = value;
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
     * Obtiene el valor de la propiedad clienteDireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteDireccion() {
        return clienteDireccion;
    }

    /**
     * Define el valor de la propiedad clienteDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteDireccion(String value) {
        this.clienteDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad opcionBuscar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcionBuscar() {
        return opcionBuscar;
    }

    /**
     * Define el valor de la propiedad opcionBuscar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcionBuscar(String value) {
        this.opcionBuscar = value;
    }

    /**
     * Obtiene el valor de la propiedad totalImporteIncImpuesto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalImporteIncImpuesto() {
        return totalImporteIncImpuesto;
    }

    /**
     * Define el valor de la propiedad totalImporteIncImpuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalImporteIncImpuesto(BigDecimal value) {
        this.totalImporteIncImpuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad fecEmisionDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecEmisionDesde() {
        return fecEmisionDesde;
    }

    /**
     * Define el valor de la propiedad fecEmisionDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecEmisionDesde(String value) {
        this.fecEmisionDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fecEmisionHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecEmisionHasta() {
        return fecEmisionHasta;
    }

    /**
     * Define el valor de la propiedad fecEmisionHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecEmisionHasta(String value) {
        this.fecEmisionHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmisionDesde.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEmisionDesde() {
        return fechaEmisionDesde;
    }

    /**
     * Define el valor de la propiedad fechaEmisionDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEmisionDesde(XMLGregorianCalendar value) {
        this.fechaEmisionDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmisionHasta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEmisionHasta() {
        return fechaEmisionHasta;
    }

    /**
     * Define el valor de la propiedad fechaEmisionHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEmisionHasta(XMLGregorianCalendar value) {
        this.fechaEmisionHasta = value;
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
     * Obtiene el valor de la propiedad filtroFechas.
     * 
     */
    public boolean isFiltroFechas() {
        return filtroFechas;
    }

    /**
     * Define el valor de la propiedad filtroFechas.
     * 
     */
    public void setFiltroFechas(boolean value) {
        this.filtroFechas = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumentoReferenciaGuia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumentoReferenciaGuia() {
        return tipoDocumentoReferenciaGuia;
    }

    /**
     * Define el valor de la propiedad tipoDocumentoReferenciaGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumentoReferenciaGuia(String value) {
        this.tipoDocumentoReferenciaGuia = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoDocumentoReferenciaGuia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDocumentoReferenciaGuia() {
        return codigoDocumentoReferenciaGuia;
    }

    /**
     * Define el valor de la propiedad codigoDocumentoReferenciaGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDocumentoReferenciaGuia(String value) {
        this.codigoDocumentoReferenciaGuia = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumentoReferenciaOtroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumentoReferenciaOtroDocumento() {
        return tipoDocumentoReferenciaOtroDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumentoReferenciaOtroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumentoReferenciaOtroDocumento(String value) {
        this.tipoDocumentoReferenciaOtroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoDocumentoReferenciaOtroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDocumentoReferenciaOtroDocumento() {
        return codigoDocumentoReferenciaOtroDocumento;
    }

    /**
     * Define el valor de la propiedad codigoDocumentoReferenciaOtroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDocumentoReferenciaOtroDocumento(String value) {
        this.codigoDocumentoReferenciaOtroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptoDetraccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptoDetraccion() {
        return conceptoDetraccion;
    }

    /**
     * Define el valor de la propiedad conceptoDetraccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptoDetraccion(String value) {
        this.conceptoDetraccion = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobanteGuia.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComprobanteGuia }
     *     
     */
    public ArrayOfENComprobanteGuia getComprobanteGuia() {
        return comprobanteGuia;
    }

    /**
     * Define el valor de la propiedad comprobanteGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComprobanteGuia }
     *     
     */
    public void setComprobanteGuia(ArrayOfENComprobanteGuia value) {
        this.comprobanteGuia = value;
    }

    /**
     * Obtiene el valor de la propiedad detraccion.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENDetraccion }
     *     
     */
    public ArrayOfENDetraccion getDetraccion() {
        return detraccion;
    }

    /**
     * Define el valor de la propiedad detraccion.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENDetraccion }
     *     
     */
    public void setDetraccion(ArrayOfENDetraccion value) {
        this.detraccion = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobanteImpuestos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComprobanteImpuestos }
     *     
     */
    public ArrayOfENComprobanteImpuestos getComprobanteImpuestos() {
        return comprobanteImpuestos;
    }

    /**
     * Define el valor de la propiedad comprobanteImpuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComprobanteImpuestos }
     *     
     */
    public void setComprobanteImpuestos(ArrayOfENComprobanteImpuestos value) {
        this.comprobanteImpuestos = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobanteDetalle.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComprobanteDetalle }
     *     
     */
    public ArrayOfENComprobanteDetalle getComprobanteDetalle() {
        return comprobanteDetalle;
    }

    /**
     * Define el valor de la propiedad comprobanteDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComprobanteDetalle }
     *     
     */
    public void setComprobanteDetalle(ArrayOfENComprobanteDetalle value) {
        this.comprobanteDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad descuentoCargoCabecera.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENDescuentoCargoCabecera }
     *     
     */
    public ArrayOfENDescuentoCargoCabecera getDescuentoCargoCabecera() {
        return descuentoCargoCabecera;
    }

    /**
     * Define el valor de la propiedad descuentoCargoCabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENDescuentoCargoCabecera }
     *     
     */
    public void setDescuentoCargoCabecera(ArrayOfENDescuentoCargoCabecera value) {
        this.descuentoCargoCabecera = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobanteNotaCreditoDocRef.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComprobanteNotaDocRef }
     *     
     */
    public ArrayOfENComprobanteNotaDocRef getComprobanteNotaCreditoDocRef() {
        return comprobanteNotaCreditoDocRef;
    }

    /**
     * Define el valor de la propiedad comprobanteNotaCreditoDocRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComprobanteNotaDocRef }
     *     
     */
    public void setComprobanteNotaCreditoDocRef(ArrayOfENComprobanteNotaDocRef value) {
        this.comprobanteNotaCreditoDocRef = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobanteOtrosDocumentos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComprobantesOtrosDocumentos }
     *     
     */
    public ArrayOfENComprobantesOtrosDocumentos getComprobanteOtrosDocumentos() {
        return comprobanteOtrosDocumentos;
    }

    /**
     * Define el valor de la propiedad comprobanteOtrosDocumentos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComprobantesOtrosDocumentos }
     *     
     */
    public void setComprobanteOtrosDocumentos(ArrayOfENComprobantesOtrosDocumentos value) {
        this.comprobanteOtrosDocumentos = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobanteMotivosDocumentos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComprobanteMotivoDocumento }
     *     
     */
    public ArrayOfENComprobanteMotivoDocumento getComprobanteMotivosDocumentos() {
        return comprobanteMotivosDocumentos;
    }

    /**
     * Define el valor de la propiedad comprobanteMotivosDocumentos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComprobanteMotivoDocumento }
     *     
     */
    public void setComprobanteMotivosDocumentos(ArrayOfENComprobanteMotivoDocumento value) {
        this.comprobanteMotivosDocumentos = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobanteMontosAdicionalesGeneral.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComprobanteMontosAdicionales }
     *     
     */
    public ArrayOfENComprobanteMontosAdicionales getComprobanteMontosAdicionalesGeneral() {
        return comprobanteMontosAdicionalesGeneral;
    }

    /**
     * Define el valor de la propiedad comprobanteMontosAdicionalesGeneral.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComprobanteMontosAdicionales }
     *     
     */
    public void setComprobanteMontosAdicionalesGeneral(ArrayOfENComprobanteMontosAdicionales value) {
        this.comprobanteMontosAdicionalesGeneral = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobantePropiedadesAdicionales.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComprobantePropiedadesAdicionales }
     *     
     */
    public ArrayOfENComprobantePropiedadesAdicionales getComprobantePropiedadesAdicionales() {
        return comprobantePropiedadesAdicionales;
    }

    /**
     * Define el valor de la propiedad comprobantePropiedadesAdicionales.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComprobantePropiedadesAdicionales }
     *     
     */
    public void setComprobantePropiedadesAdicionales(ArrayOfENComprobantePropiedadesAdicionales value) {
        this.comprobantePropiedadesAdicionales = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobanteMontosAdicionalesObligatorios.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComprobanteMontosAdicionalesObligatorios }
     *     
     */
    public ArrayOfENComprobanteMontosAdicionalesObligatorios getComprobanteMontosAdicionalesObligatorios() {
        return comprobanteMontosAdicionalesObligatorios;
    }

    /**
     * Define el valor de la propiedad comprobanteMontosAdicionalesObligatorios.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComprobanteMontosAdicionalesObligatorios }
     *     
     */
    public void setComprobanteMontosAdicionalesObligatorios(ArrayOfENComprobanteMontosAdicionalesObligatorios value) {
        this.comprobanteMontosAdicionalesObligatorios = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobanteMontosAdicionalesOtros.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComprobanteMontosAdicionalesOtros }
     *     
     */
    public ArrayOfENComprobanteMontosAdicionalesOtros getComprobanteMontosAdicionalesOtros() {
        return comprobanteMontosAdicionalesOtros;
    }

    /**
     * Define el valor de la propiedad comprobanteMontosAdicionalesOtros.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComprobanteMontosAdicionalesOtros }
     *     
     */
    public void setComprobanteMontosAdicionalesOtros(ArrayOfENComprobanteMontosAdicionalesOtros value) {
        this.comprobanteMontosAdicionalesOtros = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobanteMontosAdicionalesPercepcion.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComprobanteMontosAdicionalesPercepcion }
     *     
     */
    public ArrayOfENComprobanteMontosAdicionalesPercepcion getComprobanteMontosAdicionalesPercepcion() {
        return comprobanteMontosAdicionalesPercepcion;
    }

    /**
     * Define el valor de la propiedad comprobanteMontosAdicionalesPercepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComprobanteMontosAdicionalesPercepcion }
     *     
     */
    public void setComprobanteMontosAdicionalesPercepcion(ArrayOfENComprobanteMontosAdicionalesPercepcion value) {
        this.comprobanteMontosAdicionalesPercepcion = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobantePropiedadesAdicionalesInvoice.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComprobantePropiedadesAdicionalesInvoice }
     *     
     */
    public ArrayOfENComprobantePropiedadesAdicionalesInvoice getComprobantePropiedadesAdicionalesInvoice() {
        return comprobantePropiedadesAdicionalesInvoice;
    }

    /**
     * Define el valor de la propiedad comprobantePropiedadesAdicionalesInvoice.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComprobantePropiedadesAdicionalesInvoice }
     *     
     */
    public void setComprobantePropiedadesAdicionalesInvoice(ArrayOfENComprobantePropiedadesAdicionalesInvoice value) {
        this.comprobantePropiedadesAdicionalesInvoice = value;
    }

    /**
     * Obtiene el valor de la propiedad dtvehiculos.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.Dtvehiculos }
     *     
     */
    public ENComprobante.Dtvehiculos getDtvehiculos() {
        return dtvehiculos;
    }

    /**
     * Define el valor de la propiedad dtvehiculos.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.Dtvehiculos }
     *     
     */
    public void setDtvehiculos(ENComprobante.Dtvehiculos value) {
        this.dtvehiculos = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobante.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobante }
     *     
     */
    public ENComprobante.DtComprobante getDtComprobante() {
        return dtComprobante;
    }

    /**
     * Define el valor de la propiedad dtComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobante }
     *     
     */
    public void setDtComprobante(ENComprobante.DtComprobante value) {
        this.dtComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobanteDetalle.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobanteDetalle }
     *     
     */
    public ENComprobante.DtComprobanteDetalle getDtComprobanteDetalle() {
        return dtComprobanteDetalle;
    }

    /**
     * Define el valor de la propiedad dtComprobanteDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobanteDetalle }
     *     
     */
    public void setDtComprobanteDetalle(ENComprobante.DtComprobanteDetalle value) {
        this.dtComprobanteDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobanteMotivoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobanteMotivoDocumento }
     *     
     */
    public ENComprobante.DtComprobanteMotivoDocumento getDtComprobanteMotivoDocumento() {
        return dtComprobanteMotivoDocumento;
    }

    /**
     * Define el valor de la propiedad dtComprobanteMotivoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobanteMotivoDocumento }
     *     
     */
    public void setDtComprobanteMotivoDocumento(ENComprobante.DtComprobanteMotivoDocumento value) {
        this.dtComprobanteMotivoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobanteMotivoDocumentoSustento.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobanteMotivoDocumentoSustento }
     *     
     */
    public ENComprobante.DtComprobanteMotivoDocumentoSustento getDtComprobanteMotivoDocumentoSustento() {
        return dtComprobanteMotivoDocumentoSustento;
    }

    /**
     * Define el valor de la propiedad dtComprobanteMotivoDocumentoSustento.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobanteMotivoDocumentoSustento }
     *     
     */
    public void setDtComprobanteMotivoDocumentoSustento(ENComprobante.DtComprobanteMotivoDocumentoSustento value) {
        this.dtComprobanteMotivoDocumentoSustento = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobanteDescuentoCargo.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobanteDescuentoCargo }
     *     
     */
    public ENComprobante.DtComprobanteDescuentoCargo getDtComprobanteDescuentoCargo() {
        return dtComprobanteDescuentoCargo;
    }

    /**
     * Define el valor de la propiedad dtComprobanteDescuentoCargo.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobanteDescuentoCargo }
     *     
     */
    public void setDtComprobanteDescuentoCargo(ENComprobante.DtComprobanteDescuentoCargo value) {
        this.dtComprobanteDescuentoCargo = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobanteGuia.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobanteGuia }
     *     
     */
    public ENComprobante.DtComprobanteGuia getDtComprobanteGuia() {
        return dtComprobanteGuia;
    }

    /**
     * Define el valor de la propiedad dtComprobanteGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobanteGuia }
     *     
     */
    public void setDtComprobanteGuia(ENComprobante.DtComprobanteGuia value) {
        this.dtComprobanteGuia = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobanteOtrosDocumentos.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobanteOtrosDocumentos }
     *     
     */
    public ENComprobante.DtComprobanteOtrosDocumentos getDtComprobanteOtrosDocumentos() {
        return dtComprobanteOtrosDocumentos;
    }

    /**
     * Define el valor de la propiedad dtComprobanteOtrosDocumentos.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobanteOtrosDocumentos }
     *     
     */
    public void setDtComprobanteOtrosDocumentos(ENComprobante.DtComprobanteOtrosDocumentos value) {
        this.dtComprobanteOtrosDocumentos = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobanteImpuestos.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobanteImpuestos }
     *     
     */
    public ENComprobante.DtComprobanteImpuestos getDtComprobanteImpuestos() {
        return dtComprobanteImpuestos;
    }

    /**
     * Define el valor de la propiedad dtComprobanteImpuestos.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobanteImpuestos }
     *     
     */
    public void setDtComprobanteImpuestos(ENComprobante.DtComprobanteImpuestos value) {
        this.dtComprobanteImpuestos = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobanteDetalleDescuentoCargo.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobanteDetalleDescuentoCargo }
     *     
     */
    public ENComprobante.DtComprobanteDetalleDescuentoCargo getDtComprobanteDetalleDescuentoCargo() {
        return dtComprobanteDetalleDescuentoCargo;
    }

    /**
     * Define el valor de la propiedad dtComprobanteDetalleDescuentoCargo.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobanteDetalleDescuentoCargo }
     *     
     */
    public void setDtComprobanteDetalleDescuentoCargo(ENComprobante.DtComprobanteDetalleDescuentoCargo value) {
        this.dtComprobanteDetalleDescuentoCargo = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobanteDetalleImpuesto.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobanteDetalleImpuesto }
     *     
     */
    public ENComprobante.DtComprobanteDetalleImpuesto getDtComprobanteDetalleImpuesto() {
        return dtComprobanteDetalleImpuesto;
    }

    /**
     * Define el valor de la propiedad dtComprobanteDetalleImpuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobanteDetalleImpuesto }
     *     
     */
    public void setDtComprobanteDetalleImpuesto(ENComprobante.DtComprobanteDetalleImpuesto value) {
        this.dtComprobanteDetalleImpuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobanteNotaCreditoDocRef.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobanteNotaCreditoDocRef }
     *     
     */
    public ENComprobante.DtComprobanteNotaCreditoDocRef getDtComprobanteNotaCreditoDocRef() {
        return dtComprobanteNotaCreditoDocRef;
    }

    /**
     * Define el valor de la propiedad dtComprobanteNotaCreditoDocRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobanteNotaCreditoDocRef }
     *     
     */
    public void setDtComprobanteNotaCreditoDocRef(ENComprobante.DtComprobanteNotaCreditoDocRef value) {
        this.dtComprobanteNotaCreditoDocRef = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobanteNotaCreditoDocRefDetalle.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobanteNotaCreditoDocRefDetalle }
     *     
     */
    public ENComprobante.DtComprobanteNotaCreditoDocRefDetalle getDtComprobanteNotaCreditoDocRefDetalle() {
        return dtComprobanteNotaCreditoDocRefDetalle;
    }

    /**
     * Define el valor de la propiedad dtComprobanteNotaCreditoDocRefDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobanteNotaCreditoDocRefDetalle }
     *     
     */
    public void setDtComprobanteNotaCreditoDocRefDetalle(ENComprobante.DtComprobanteNotaCreditoDocRefDetalle value) {
        this.dtComprobanteNotaCreditoDocRefDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobanteNotaCreditoDocRefDetalleDescuentoCargo.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobanteNotaCreditoDocRefDetalleDescuentoCargo }
     *     
     */
    public ENComprobante.DtComprobanteNotaCreditoDocRefDetalleDescuentoCargo getDtComprobanteNotaCreditoDocRefDetalleDescuentoCargo() {
        return dtComprobanteNotaCreditoDocRefDetalleDescuentoCargo;
    }

    /**
     * Define el valor de la propiedad dtComprobanteNotaCreditoDocRefDetalleDescuentoCargo.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobanteNotaCreditoDocRefDetalleDescuentoCargo }
     *     
     */
    public void setDtComprobanteNotaCreditoDocRefDetalleDescuentoCargo(ENComprobante.DtComprobanteNotaCreditoDocRefDetalleDescuentoCargo value) {
        this.dtComprobanteNotaCreditoDocRefDetalleDescuentoCargo = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobanteNotaCreditoDetalleDocRef.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobanteNotaCreditoDetalleDocRef }
     *     
     */
    public ENComprobante.DtComprobanteNotaCreditoDetalleDocRef getDtComprobanteNotaCreditoDetalleDocRef() {
        return dtComprobanteNotaCreditoDetalleDocRef;
    }

    /**
     * Define el valor de la propiedad dtComprobanteNotaCreditoDetalleDocRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobanteNotaCreditoDetalleDocRef }
     *     
     */
    public void setDtComprobanteNotaCreditoDetalleDocRef(ENComprobante.DtComprobanteNotaCreditoDetalleDocRef value) {
        this.dtComprobanteNotaCreditoDetalleDocRef = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobanteNotaCreditoDetalleDocRefDetalle.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobanteNotaCreditoDetalleDocRefDetalle }
     *     
     */
    public ENComprobante.DtComprobanteNotaCreditoDetalleDocRefDetalle getDtComprobanteNotaCreditoDetalleDocRefDetalle() {
        return dtComprobanteNotaCreditoDetalleDocRefDetalle;
    }

    /**
     * Define el valor de la propiedad dtComprobanteNotaCreditoDetalleDocRefDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobanteNotaCreditoDetalleDocRefDetalle }
     *     
     */
    public void setDtComprobanteNotaCreditoDetalleDocRefDetalle(ENComprobante.DtComprobanteNotaCreditoDetalleDocRefDetalle value) {
        this.dtComprobanteNotaCreditoDetalleDocRefDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobanteNotaCreditoDetalleDocRefDetalleDescuentoCargo.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobanteNotaCreditoDetalleDocRefDetalleDescuentoCargo }
     *     
     */
    public ENComprobante.DtComprobanteNotaCreditoDetalleDocRefDetalleDescuentoCargo getDtComprobanteNotaCreditoDetalleDocRefDetalleDescuentoCargo() {
        return dtComprobanteNotaCreditoDetalleDocRefDetalleDescuentoCargo;
    }

    /**
     * Define el valor de la propiedad dtComprobanteNotaCreditoDetalleDocRefDetalleDescuentoCargo.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobanteNotaCreditoDetalleDocRefDetalleDescuentoCargo }
     *     
     */
    public void setDtComprobanteNotaCreditoDetalleDocRefDetalleDescuentoCargo(ENComprobante.DtComprobanteNotaCreditoDetalleDocRefDetalleDescuentoCargo value) {
        this.dtComprobanteNotaCreditoDetalleDocRefDetalleDescuentoCargo = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobanteDescuentoCargoCabecera.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobanteDescuentoCargoCabecera }
     *     
     */
    public ENComprobante.DtComprobanteDescuentoCargoCabecera getDtComprobanteDescuentoCargoCabecera() {
        return dtComprobanteDescuentoCargoCabecera;
    }

    /**
     * Define el valor de la propiedad dtComprobanteDescuentoCargoCabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobanteDescuentoCargoCabecera }
     *     
     */
    public void setDtComprobanteDescuentoCargoCabecera(ENComprobante.DtComprobanteDescuentoCargoCabecera value) {
        this.dtComprobanteDescuentoCargoCabecera = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobanteDescuentoCargoDetalle.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobanteDescuentoCargoDetalle }
     *     
     */
    public ENComprobante.DtComprobanteDescuentoCargoDetalle getDtComprobanteDescuentoCargoDetalle() {
        return dtComprobanteDescuentoCargoDetalle;
    }

    /**
     * Define el valor de la propiedad dtComprobanteDescuentoCargoDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobanteDescuentoCargoDetalle }
     *     
     */
    public void setDtComprobanteDescuentoCargoDetalle(ENComprobante.DtComprobanteDescuentoCargoDetalle value) {
        this.dtComprobanteDescuentoCargoDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobanteMontosAdicionales.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobanteMontosAdicionales }
     *     
     */
    public ENComprobante.DtComprobanteMontosAdicionales getDtComprobanteMontosAdicionales() {
        return dtComprobanteMontosAdicionales;
    }

    /**
     * Define el valor de la propiedad dtComprobanteMontosAdicionales.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobanteMontosAdicionales }
     *     
     */
    public void setDtComprobanteMontosAdicionales(ENComprobante.DtComprobanteMontosAdicionales value) {
        this.dtComprobanteMontosAdicionales = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobantePropiedadesAdicionales.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobantePropiedadesAdicionales }
     *     
     */
    public ENComprobante.DtComprobantePropiedadesAdicionales getDtComprobantePropiedadesAdicionales() {
        return dtComprobantePropiedadesAdicionales;
    }

    /**
     * Define el valor de la propiedad dtComprobantePropiedadesAdicionales.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobantePropiedadesAdicionales }
     *     
     */
    public void setDtComprobantePropiedadesAdicionales(ENComprobante.DtComprobantePropiedadesAdicionales value) {
        this.dtComprobantePropiedadesAdicionales = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobantePropiedadesAdicionalesInvoice.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobantePropiedadesAdicionalesInvoice }
     *     
     */
    public ENComprobante.DtComprobantePropiedadesAdicionalesInvoice getDtComprobantePropiedadesAdicionalesInvoice() {
        return dtComprobantePropiedadesAdicionalesInvoice;
    }

    /**
     * Define el valor de la propiedad dtComprobantePropiedadesAdicionalesInvoice.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobantePropiedadesAdicionalesInvoice }
     *     
     */
    public void setDtComprobantePropiedadesAdicionalesInvoice(ENComprobante.DtComprobantePropiedadesAdicionalesInvoice value) {
        this.dtComprobantePropiedadesAdicionalesInvoice = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobanteHospedaje.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobanteHospedaje }
     *     
     */
    public ENComprobante.DtComprobanteHospedaje getDtComprobanteHospedaje() {
        return dtComprobanteHospedaje;
    }

    /**
     * Define el valor de la propiedad dtComprobanteHospedaje.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobanteHospedaje }
     *     
     */
    public void setDtComprobanteHospedaje(ENComprobante.DtComprobanteHospedaje value) {
        this.dtComprobanteHospedaje = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComprobanteDetraccion.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComprobanteDetraccion }
     *     
     */
    public ENComprobante.DtComprobanteDetraccion getDtComprobanteDetraccion() {
        return dtComprobanteDetraccion;
    }

    /**
     * Define el valor de la propiedad dtComprobanteDetraccion.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComprobanteDetraccion }
     *     
     */
    public void setDtComprobanteDetraccion(ENComprobante.DtComprobanteDetraccion value) {
        this.dtComprobanteDetraccion = value;
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
     * Obtiene el valor de la propiedad archivoXMLNoEncriptado.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getArchivoXMLNoEncriptado() {
        return archivoXMLNoEncriptado;
    }

    /**
     * Define el valor de la propiedad archivoXMLNoEncriptado.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setArchivoXMLNoEncriptado(byte[] value) {
        this.archivoXMLNoEncriptado = value;
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
     * Obtiene el valor de la propiedad numeroPagina.
     * 
     */
    public int getNumeroPagina() {
        return numeroPagina;
    }

    /**
     * Define el valor de la propiedad numeroPagina.
     * 
     */
    public void setNumeroPagina(int value) {
        this.numeroPagina = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadRegistros.
     * 
     */
    public int getCantidadRegistros() {
        return cantidadRegistros;
    }

    /**
     * Define el valor de la propiedad cantidadRegistros.
     * 
     */
    public void setCantidadRegistros(int value) {
        this.cantidadRegistros = value;
    }

    /**
     * Obtiene el valor de la propiedad codMediosPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMediosPago() {
        return codMediosPago;
    }

    /**
     * Define el valor de la propiedad codMediosPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMediosPago(String value) {
        this.codMediosPago = value;
    }

    /**
     * Obtiene el valor de la propiedad correoElectronico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Define el valor de la propiedad correoElectronico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoElectronico(String value) {
        this.correoElectronico = value;
    }

    /**
     * Obtiene el valor de la propiedad hospedaje.
     * 
     * @return
     *     possible object is
     *     {@link ENHospedaje }
     *     
     */
    public ENHospedaje getHospedaje() {
        return hospedaje;
    }

    /**
     * Define el valor de la propiedad hospedaje.
     * 
     * @param value
     *     allowed object is
     *     {@link ENHospedaje }
     *     
     */
    public void setHospedaje(ENHospedaje value) {
        this.hospedaje = value;
    }

    /**
     * Obtiene el valor de la propiedad anticipo.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENAnticipo }
     *     
     */
    public ArrayOfENAnticipo getAnticipo() {
        return anticipo;
    }

    /**
     * Define el valor de la propiedad anticipo.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENAnticipo }
     *     
     */
    public void setAnticipo(ArrayOfENAnticipo value) {
        this.anticipo = value;
    }

    /**
     * Obtiene el valor de la propiedad multiglosa.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getMultiglosa() {
        return multiglosa;
    }

    /**
     * Define el valor de la propiedad multiglosa.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setMultiglosa(ArrayOfString value) {
        this.multiglosa = value;
    }

    /**
     * Obtiene el valor de la propiedad sucursal.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENSucursal }
     *     
     */
    public ArrayOfENSucursal getSucursal() {
        return sucursal;
    }

    /**
     * Define el valor de la propiedad sucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENSucursal }
     *     
     */
    public void setSucursal(ArrayOfENSucursal value) {
        this.sucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad prepago.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENPrepago }
     *     
     */
    public ArrayOfENPrepago getPrepago() {
        return prepago;
    }

    /**
     * Define el valor de la propiedad prepago.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENPrepago }
     *     
     */
    public void setPrepago(ArrayOfENPrepago value) {
        this.prepago = value;
    }

    /**
     * Obtiene el valor de la propiedad fondoGarantia.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENFondoGarantia }
     *     
     */
    public ArrayOfENFondoGarantia getFondoGarantia() {
        return fondoGarantia;
    }

    /**
     * Define el valor de la propiedad fondoGarantia.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENFondoGarantia }
     *     
     */
    public void setFondoGarantia(ArrayOfENFondoGarantia value) {
        this.fondoGarantia = value;
    }

    /**
     * Obtiene el valor de la propiedad texto.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENTexto }
     *     
     */
    public ArrayOfENTexto getTexto() {
        return texto;
    }

    /**
     * Define el valor de la propiedad texto.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENTexto }
     *     
     */
    public void setTexto(ArrayOfENTexto value) {
        this.texto = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobanteRefActivos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComprobanteNotaDocRefActivos }
     *     
     */
    public ArrayOfENComprobanteNotaDocRefActivos getComprobanteRefActivos() {
        return comprobanteRefActivos;
    }

    /**
     * Define el valor de la propiedad comprobanteRefActivos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComprobanteNotaDocRefActivos }
     *     
     */
    public void setComprobanteRefActivos(ArrayOfENComprobanteNotaDocRefActivos value) {
        this.comprobanteRefActivos = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionEntregaBienServicio.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENDireccionEntregaBienServicio }
     *     
     */
    public ArrayOfENDireccionEntregaBienServicio getDireccionEntregaBienServicio() {
        return direccionEntregaBienServicio;
    }

    /**
     * Define el valor de la propiedad direccionEntregaBienServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENDireccionEntregaBienServicio }
     *     
     */
    public void setDireccionEntregaBienServicio(ArrayOfENDireccionEntregaBienServicio value) {
        this.direccionEntregaBienServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPago() {
        return tipoPago;
    }

    /**
     * Define el valor de la propiedad tipoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPago(String value) {
        this.tipoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad comercioExterior.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComercioExterior }
     *     
     */
    public ArrayOfENComercioExterior getComercioExterior() {
        return comercioExterior;
    }

    /**
     * Define el valor de la propiedad comercioExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComercioExterior }
     *     
     */
    public void setComercioExterior(ArrayOfENComercioExterior value) {
        this.comercioExterior = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComercioExterior.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComercioExterior }
     *     
     */
    public ENComprobante.DtComercioExterior getDtComercioExterior() {
        return dtComercioExterior;
    }

    /**
     * Define el valor de la propiedad dtComercioExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComercioExterior }
     *     
     */
    public void setDtComercioExterior(ENComprobante.DtComercioExterior value) {
        this.dtComercioExterior = value;
    }

    /**
     * Obtiene el valor de la propiedad dtComercioExteriorDetalle.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtComercioExteriorDetalle }
     *     
     */
    public ENComprobante.DtComercioExteriorDetalle getDtComercioExteriorDetalle() {
        return dtComercioExteriorDetalle;
    }

    /**
     * Define el valor de la propiedad dtComercioExteriorDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtComercioExteriorDetalle }
     *     
     */
    public void setDtComercioExteriorDetalle(ENComprobante.DtComercioExteriorDetalle value) {
        this.dtComercioExteriorDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad receptor.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENReceptor }
     *     
     */
    public ArrayOfENReceptor getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENReceptor }
     *     
     */
    public void setReceptor(ArrayOfENReceptor value) {
        this.receptor = value;
    }

    /**
     * Obtiene el valor de la propiedad dtReceptor.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtReceptor }
     *     
     */
    public ENComprobante.DtReceptor getDtReceptor() {
        return dtReceptor;
    }

    /**
     * Define el valor de la propiedad dtReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtReceptor }
     *     
     */
    public void setDtReceptor(ENComprobante.DtReceptor value) {
        this.dtReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad notificacion.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENNotificacion }
     *     
     */
    public ArrayOfENNotificacion getNotificacion() {
        return notificacion;
    }

    /**
     * Define el valor de la propiedad notificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENNotificacion }
     *     
     */
    public void setNotificacion(ArrayOfENNotificacion value) {
        this.notificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad dtNotificacion.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtNotificacion }
     *     
     */
    public ENComprobante.DtNotificacion getDtNotificacion() {
        return dtNotificacion;
    }

    /**
     * Define el valor de la propiedad dtNotificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtNotificacion }
     *     
     */
    public void setDtNotificacion(ENComprobante.DtNotificacion value) {
        this.dtNotificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad agenteCarga.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENAgenteCarga }
     *     
     */
    public ArrayOfENAgenteCarga getAgenteCarga() {
        return agenteCarga;
    }

    /**
     * Define el valor de la propiedad agenteCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENAgenteCarga }
     *     
     */
    public void setAgenteCarga(ArrayOfENAgenteCarga value) {
        this.agenteCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad dtAgenteCarga.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtAgenteCarga }
     *     
     */
    public ENComprobante.DtAgenteCarga getDtAgenteCarga() {
        return dtAgenteCarga;
    }

    /**
     * Define el valor de la propiedad dtAgenteCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtAgenteCarga }
     *     
     */
    public void setDtAgenteCarga(ENComprobante.DtAgenteCarga value) {
        this.dtAgenteCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad formaPago.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENFormaPago }
     *     
     */
    public ArrayOfENFormaPago getFormaPago() {
        return formaPago;
    }

    /**
     * Define el valor de la propiedad formaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENFormaPago }
     *     
     */
    public void setFormaPago(ArrayOfENFormaPago value) {
        this.formaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad dtFormaPago.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtFormaPago }
     *     
     */
    public ENComprobante.DtFormaPago getDtFormaPago() {
        return dtFormaPago;
    }

    /**
     * Define el valor de la propiedad dtFormaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtFormaPago }
     *     
     */
    public void setDtFormaPago(ENComprobante.DtFormaPago value) {
        this.dtFormaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad dtTerminosFormaPago.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.DtTerminosFormaPago }
     *     
     */
    public ENComprobante.DtTerminosFormaPago getDtTerminosFormaPago() {
        return dtTerminosFormaPago;
    }

    /**
     * Define el valor de la propiedad dtTerminosFormaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.DtTerminosFormaPago }
     *     
     */
    public void setDtTerminosFormaPago(ENComprobante.DtTerminosFormaPago value) {
        this.dtTerminosFormaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad redondeo.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENRedondeo }
     *     
     */
    public ArrayOfENRedondeo getRedondeo() {
        return redondeo;
    }

    /**
     * Define el valor de la propiedad redondeo.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENRedondeo }
     *     
     */
    public void setRedondeo(ArrayOfENRedondeo value) {
        this.redondeo = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPrepago.
     * 
     */
    public double getTotalPrepago() {
        return totalPrepago;
    }

    /**
     * Define el valor de la propiedad totalPrepago.
     * 
     */
    public void setTotalPrepago(double value) {
        this.totalPrepago = value;
    }

    /**
     * Obtiene el valor de la propiedad flagAdjunto.
     * 
     */
    public int getFlagAdjunto() {
        return flagAdjunto;
    }

    /**
     * Define el valor de la propiedad flagAdjunto.
     * 
     */
    public void setFlagAdjunto(int value) {
        this.flagAdjunto = value;
    }

    /**
     * Obtiene el valor de la propiedad informacionGuia.
     * 
     * @return
     *     possible object is
     *     {@link ENInformacionGuia }
     *     
     */
    public ENInformacionGuia getInformacionGuia() {
        return informacionGuia;
    }

    /**
     * Define el valor de la propiedad informacionGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link ENInformacionGuia }
     *     
     */
    public void setInformacionGuia(ENInformacionGuia value) {
        this.informacionGuia = value;
    }

    /**
     * Obtiene el valor de la propiedad proveedor.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENProveedor }
     *     
     */
    public ArrayOfENProveedor getProveedor() {
        return proveedor;
    }

    /**
     * Define el valor de la propiedad proveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENProveedor }
     *     
     */
    public void setProveedor(ArrayOfENProveedor value) {
        this.proveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad comercializacion.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComercializacion }
     *     
     */
    public ArrayOfENComercializacion getComercializacion() {
        return comercializacion;
    }

    /**
     * Define el valor de la propiedad comercializacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComercializacion }
     *     
     */
    public void setComercializacion(ArrayOfENComercializacion value) {
        this.comercializacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Define el valor de la propiedad tipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOperacion(String value) {
        this.tipoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad integracion.
     * 
     * @return
     *     possible object is
     *     {@link ENIntegracion }
     *     
     */
    public ENIntegracion getIntegracion() {
        return integracion;
    }

    /**
     * Define el valor de la propiedad integracion.
     * 
     * @param value
     *     allowed object is
     *     {@link ENIntegracion }
     *     
     */
    public void setIntegracion(ENIntegracion value) {
        this.integracion = value;
    }

    /**
     * Obtiene el valor de la propiedad idCorreoRecepcion.
     * 
     */
    public long getIdCorreoRecepcion() {
        return idCorreoRecepcion;
    }

    /**
     * Define el valor de la propiedad idCorreoRecepcion.
     * 
     */
    public void setIdCorreoRecepcion(long value) {
        this.idCorreoRecepcion = value;
    }

    /**
     * Obtiene el valor de la propiedad idComprobanteCabecera.
     * 
     */
    public long getIdComprobanteCabecera() {
        return idComprobanteCabecera;
    }

    /**
     * Define el valor de la propiedad idComprobanteCabecera.
     * 
     */
    public void setIdComprobanteCabecera(long value) {
        this.idComprobanteCabecera = value;
    }

    /**
     * Obtiene el valor de la propiedad idComp.
     * 
     */
    public long getIdComp() {
        return idComp;
    }

    /**
     * Define el valor de la propiedad idComp.
     * 
     */
    public void setIdComp(long value) {
        this.idComp = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoOrigen.
     * 
     */
    public long getIdTipoOrigen() {
        return idTipoOrigen;
    }

    /**
     * Define el valor de la propiedad idTipoOrigen.
     * 
     */
    public void setIdTipoOrigen(long value) {
        this.idTipoOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad tablaAdjuntos.
     * 
     * @return
     *     possible object is
     *     {@link ENComprobante.TablaAdjuntos }
     *     
     */
    public ENComprobante.TablaAdjuntos getTablaAdjuntos() {
        return tablaAdjuntos;
    }

    /**
     * Define el valor de la propiedad tablaAdjuntos.
     * 
     * @param value
     *     allowed object is
     *     {@link ENComprobante.TablaAdjuntos }
     *     
     */
    public void setTablaAdjuntos(ENComprobante.TablaAdjuntos value) {
        this.tablaAdjuntos = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambio.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENTipoCambio }
     *     
     */
    public ArrayOfENTipoCambio getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Define el valor de la propiedad tipoCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENTipoCambio }
     *     
     */
    public void setTipoCambio(ArrayOfENTipoCambio value) {
        this.tipoCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad vendedor.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENVendedor }
     *     
     */
    public ArrayOfENVendedor getVendedor() {
        return vendedor;
    }

    /**
     * Define el valor de la propiedad vendedor.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENVendedor }
     *     
     */
    public void setVendedor(ArrayOfENVendedor value) {
        this.vendedor = value;
    }

    /**
     * Obtiene el valor de la propiedad consignatario.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENConsignatario }
     *     
     */
    public ArrayOfENConsignatario getConsignatario() {
        return consignatario;
    }

    /**
     * Define el valor de la propiedad consignatario.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENConsignatario }
     *     
     */
    public void setConsignatario(ArrayOfENConsignatario value) {
        this.consignatario = value;
    }

    /**
     * Obtiene el valor de la propiedad remitente.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENRemitente }
     *     
     */
    public ArrayOfENRemitente getRemitente() {
        return remitente;
    }

    /**
     * Define el valor de la propiedad remitente.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENRemitente }
     *     
     */
    public void setRemitente(ArrayOfENRemitente value) {
        this.remitente = value;
    }

    /**
     * Obtiene el valor de la propiedad idPuntoVenta.
     * 
     */
    public int getIdPuntoVenta() {
        return idPuntoVenta;
    }

    /**
     * Define el valor de la propiedad idPuntoVenta.
     * 
     */
    public void setIdPuntoVenta(int value) {
        this.idPuntoVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad montoIGV.
     * 
     */
    public double getMontoIGV() {
        return montoIGV;
    }

    /**
     * Define el valor de la propiedad montoIGV.
     * 
     */
    public void setMontoIGV(double value) {
        this.montoIGV = value;
    }

    /**
     * Obtiene el valor de la propiedad montoISC.
     * 
     */
    public double getMontoISC() {
        return montoISC;
    }

    /**
     * Define el valor de la propiedad montoISC.
     * 
     */
    public void setMontoISC(double value) {
        this.montoISC = value;
    }

    /**
     * Obtiene el valor de la propiedad montoGratuito.
     * 
     */
    public double getMontoGratuito() {
        return montoGratuito;
    }

    /**
     * Define el valor de la propiedad montoGratuito.
     * 
     */
    public void setMontoGratuito(double value) {
        this.montoGratuito = value;
    }

    /**
     * Obtiene el valor de la propiedad montoExonerado.
     * 
     */
    public double getMontoExonerado() {
        return montoExonerado;
    }

    /**
     * Define el valor de la propiedad montoExonerado.
     * 
     */
    public void setMontoExonerado(double value) {
        this.montoExonerado = value;
    }

    /**
     * Obtiene el valor de la propiedad montoInafecto.
     * 
     */
    public double getMontoInafecto() {
        return montoInafecto;
    }

    /**
     * Define el valor de la propiedad montoInafecto.
     * 
     */
    public void setMontoInafecto(double value) {
        this.montoInafecto = value;
    }

    /**
     * Obtiene el valor de la propiedad grabadas.
     * 
     */
    public double getGrabadas() {
        return grabadas;
    }

    /**
     * Define el valor de la propiedad grabadas.
     * 
     */
    public void setGrabadas(double value) {
        this.grabadas = value;
    }

    /**
     * Obtiene el valor de la propiedad network.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetwork() {
        return network;
    }

    /**
     * Define el valor de la propiedad network.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetwork(String value) {
        this.network = value;
    }

    /**
     * Obtiene el valor de la propiedad correoTerceros.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENCorreoTerceros }
     *     
     */
    public ArrayOfENCorreoTerceros getCorreoTerceros() {
        return correoTerceros;
    }

    /**
     * Define el valor de la propiedad correoTerceros.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENCorreoTerceros }
     *     
     */
    public void setCorreoTerceros(ArrayOfENCorreoTerceros value) {
        this.correoTerceros = value;
    }

    /**
     * Obtiene el valor de la propiedad correoJsonTercero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoJsonTercero() {
        return correoJsonTercero;
    }

    /**
     * Define el valor de la propiedad correoJsonTercero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoJsonTercero(String value) {
        this.correoJsonTercero = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPlantillaCorreo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPlantillaCorreo() {
        return tipoPlantillaCorreo;
    }

    /**
     * Define el valor de la propiedad tipoPlantillaCorreo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPlantillaCorreo(String value) {
        this.tipoPlantillaCorreo = value;
    }

    /**
     * Obtiene el valor de la propiedad correoEmisorMascara.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoEmisorMascara() {
        return correoEmisorMascara;
    }

    /**
     * Define el valor de la propiedad correoEmisorMascara.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoEmisorMascara(String value) {
        this.correoEmisorMascara = value;
    }

    /**
     * Obtiene el valor de la propiedad sucursalEmision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSucursalEmision() {
        return sucursalEmision;
    }

    /**
     * Define el valor de la propiedad sucursalEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSucursalEmision(String value) {
        this.sucursalEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad sistemaEmision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemaEmision() {
        return sistemaEmision;
    }

    /**
     * Define el valor de la propiedad sistemaEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaEmision(String value) {
        this.sistemaEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobanteGrilla.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComprobanteGrilla }
     *     
     */
    public ArrayOfENComprobanteGrilla getComprobanteGrilla() {
        return comprobanteGrilla;
    }

    /**
     * Define el valor de la propiedad comprobanteGrilla.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComprobanteGrilla }
     *     
     */
    public void setComprobanteGrilla(ArrayOfENComprobanteGrilla value) {
        this.comprobanteGrilla = value;
    }

    /**
     * Obtiene el valor de la propiedad salud.
     * 
     * @return
     *     possible object is
     *     {@link ENSalud }
     *     
     */
    public ENSalud getSalud() {
        return salud;
    }

    /**
     * Define el valor de la propiedad salud.
     * 
     * @param value
     *     allowed object is
     *     {@link ENSalud }
     *     
     */
    public void setSalud(ENSalud value) {
        this.salud = value;
    }

    /**
     * Obtiene el valor de la propiedad camposComerciales.
     * 
     * @return
     *     possible object is
     *     {@link ENCamposComerciales }
     *     
     */
    public ENCamposComerciales getCamposComerciales() {
        return camposComerciales;
    }

    /**
     * Define el valor de la propiedad camposComerciales.
     * 
     * @param value
     *     allowed object is
     *     {@link ENCamposComerciales }
     *     
     */
    public void setCamposComerciales(ENCamposComerciales value) {
        this.camposComerciales = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobanteGrillaCuenta.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENComprobanteGrillaCuenta }
     *     
     */
    public ArrayOfENComprobanteGrillaCuenta getComprobanteGrillaCuenta() {
        return comprobanteGrillaCuenta;
    }

    /**
     * Define el valor de la propiedad comprobanteGrillaCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENComprobanteGrillaCuenta }
     *     
     */
    public void setComprobanteGrillaCuenta(ArrayOfENComprobanteGrillaCuenta value) {
        this.comprobanteGrillaCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad idioma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * Define el valor de la propiedad idioma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdioma(String value) {
        this.idioma = value;
    }

    /**
     * Obtiene el valor de la propiedad glosaDescuentos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGlosaDescuentos() {
        return glosaDescuentos;
    }

    /**
     * Define el valor de la propiedad glosaDescuentos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGlosaDescuentos(ArrayOfString value) {
        this.glosaDescuentos = value;
    }

    /**
     * Obtiene el valor de la propiedad educacion.
     * 
     * @return
     *     possible object is
     *     {@link ENEducacion }
     *     
     */
    public ENEducacion getEducacion() {
        return educacion;
    }

    /**
     * Define el valor de la propiedad educacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ENEducacion }
     *     
     */
    public void setEducacion(ENEducacion value) {
        this.educacion = value;
    }

    /**
     * Obtiene el valor de la propiedad montoLetrasAdicional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoLetrasAdicional() {
        return montoLetrasAdicional;
    }

    /**
     * Define el valor de la propiedad montoLetrasAdicional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoLetrasAdicional(String value) {
        this.montoLetrasAdicional = value;
    }

    /**
     * Obtiene el valor de la propiedad nrodePedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrodePedido() {
        return nrodePedido;
    }

    /**
     * Define el valor de la propiedad nrodePedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrodePedido(String value) {
        this.nrodePedido = value;
    }

    /**
     * Obtiene el valor de la propiedad horaEmision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraEmision() {
        return horaEmision;
    }

    /**
     * Define el valor de la propiedad horaEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraEmision(String value) {
        this.horaEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPedido.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaPedido() {
        return fechaPedido;
    }

    /**
     * Define el valor de la propiedad fechaPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaPedido(XMLGregorianCalendar value) {
        this.fechaPedido = value;
    }

    /**
     * Obtiene el valor de la propiedad supervisor.
     * 
     * @return
     *     possible object is
     *     {@link ENSupervisor }
     *     
     */
    public ENSupervisor getSupervisor() {
        return supervisor;
    }

    /**
     * Define el valor de la propiedad supervisor.
     * 
     * @param value
     *     allowed object is
     *     {@link ENSupervisor }
     *     
     */
    public void setSupervisor(ENSupervisor value) {
        this.supervisor = value;
    }

    /**
     * Obtiene el valor de la propiedad otroConceptoPago.
     * 
     */
    public double getOtroConceptoPago() {
        return otroConceptoPago;
    }

    /**
     * Define el valor de la propiedad otroConceptoPago.
     * 
     */
    public void setOtroConceptoPago(double value) {
        this.otroConceptoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoTransmision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoTransmision() {
        return estadoTransmision;
    }

    /**
     * Define el valor de la propiedad estadoTransmision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoTransmision(String value) {
        this.estadoTransmision = value;
    }

    /**
     * Obtiene el valor de la propiedad idcomprobanteCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcomprobanteCliente() {
        return idcomprobanteCliente;
    }

    /**
     * Define el valor de la propiedad idcomprobanteCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcomprobanteCliente(String value) {
        this.idcomprobanteCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad casoNegocio.
     * 
     * @return
     *     possible object is
     *     {@link EnCasoNegocio }
     *     
     */
    public EnCasoNegocio getCasoNegocio() {
        return casoNegocio;
    }

    /**
     * Define el valor de la propiedad casoNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link EnCasoNegocio }
     *     
     */
    public void setCasoNegocio(EnCasoNegocio value) {
        this.casoNegocio = value;
    }

    /**
     * Obtiene el valor de la propiedad glosaAgenteRetencion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlosaAgenteRetencion() {
        return glosaAgenteRetencion;
    }

    /**
     * Define el valor de la propiedad glosaAgenteRetencion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlosaAgenteRetencion(String value) {
        this.glosaAgenteRetencion = value;
    }

    /**
     * Obtiene el valor de la propiedad autenticacionCorreo.
     * 
     * @return
     *     possible object is
     *     {@link ENAutenticacionCorreo }
     *     
     */
    public ENAutenticacionCorreo getAutenticacionCorreo() {
        return autenticacionCorreo;
    }

    /**
     * Define el valor de la propiedad autenticacionCorreo.
     * 
     * @param value
     *     allowed object is
     *     {@link ENAutenticacionCorreo }
     *     
     */
    public void setAutenticacionCorreo(ENAutenticacionCorreo value) {
        this.autenticacionCorreo = value;
    }

    /**
     * Obtiene el valor de la propiedad totalImpuesto.
     * 
     */
    public double getTotalImpuesto() {
        return totalImpuesto;
    }

    /**
     * Define el valor de la propiedad totalImpuesto.
     * 
     */
    public void setTotalImpuesto(double value) {
        this.totalImpuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad totalValorVenta.
     * 
     */
    public double getTotalValorVenta() {
        return totalValorVenta;
    }

    /**
     * Define el valor de la propiedad totalValorVenta.
     * 
     */
    public void setTotalValorVenta(double value) {
        this.totalValorVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPrecioVenta.
     * 
     */
    public double getTotalPrecioVenta() {
        return totalPrecioVenta;
    }

    /**
     * Define el valor de la propiedad totalPrecioVenta.
     * 
     */
    public void setTotalPrecioVenta(double value) {
        this.totalPrecioVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad versionUbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionUbl() {
        return versionUbl;
    }

    /**
     * Define el valor de la propiedad versionUbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionUbl(String value) {
        this.versionUbl = value;
    }

    /**
     * Obtiene el valor de la propiedad fise.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfENFise }
     *     
     */
    public ArrayOfENFise getFise() {
        return fise;
    }

    /**
     * Define el valor de la propiedad fise.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfENFise }
     *     
     */
    public void setFise(ArrayOfENFise value) {
        this.fise = value;
    }

    /**
     * Obtiene el valor de la propiedad agenteVenta.
     * 
     * @return
     *     possible object is
     *     {@link ENAgenteVenta }
     *     
     */
    public ENAgenteVenta getAgenteVenta() {
        return agenteVenta;
    }

    /**
     * Define el valor de la propiedad agenteVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link ENAgenteVenta }
     *     
     */
    public void setAgenteVenta(ENAgenteVenta value) {
        this.agenteVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad montosTotales.
     * 
     * @return
     *     possible object is
     *     {@link ENMontosTotales }
     *     
     */
    public ENMontosTotales getMontosTotales() {
        return montosTotales;
    }

    /**
     * Define el valor de la propiedad montosTotales.
     * 
     * @param value
     *     allowed object is
     *     {@link ENMontosTotales }
     *     
     */
    public void setMontosTotales(ENMontosTotales value) {
        this.montosTotales = value;
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
    public static class DtAdicionales {

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
    public static class DtAgenteCarga {

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
    public static class DtComercioExterior {

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
    public static class DtComercioExteriorDetalle {

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
    public static class DtComprobante {

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
    public static class DtComprobanteDescuentoCargo {

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
    public static class DtComprobanteDescuentoCargoCabecera {

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
    public static class DtComprobanteDescuentoCargoDetalle {

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
    public static class DtComprobanteDetalle {

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
    public static class DtComprobanteDetalleDescuentoCargo {

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
    public static class DtComprobanteDetalleImpuesto {

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
    public static class DtComprobanteDetraccion {

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
    public static class DtComprobanteGuia {

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
    public static class DtComprobanteHospedaje {

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
    public static class DtComprobanteImpuestos {

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
    public static class DtComprobanteMontosAdicionales {

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
    public static class DtComprobanteMotivoDocumento {

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
    public static class DtComprobanteMotivoDocumentoSustento {

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
    public static class DtComprobanteNotaCreditoDetalleDocRef {

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
    public static class DtComprobanteNotaCreditoDetalleDocRefDetalle {

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
    public static class DtComprobanteNotaCreditoDetalleDocRefDetalleDescuentoCargo {

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
    public static class DtComprobanteNotaCreditoDocRef {

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
    public static class DtComprobanteNotaCreditoDocRefDetalle {

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
    public static class DtComprobanteNotaCreditoDocRefDetalleDescuentoCargo {

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
    public static class DtComprobanteOtrosDocumentos {

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
    public static class DtComprobantePropiedadesAdicionales {

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
    public static class DtComprobantePropiedadesAdicionalesInvoice {

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
    public static class DtFormaPago {

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
    public static class DtNotificacion {

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
    public static class DtReceptor {

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
    public static class DtTerminosFormaPago {

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
    public static class Dtvehiculos {

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
    public static class Dtvendedor {

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
    public static class TablaAdjuntos {

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
