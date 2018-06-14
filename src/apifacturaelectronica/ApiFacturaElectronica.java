package apifacturaelectronica;

import java.text.ParseException;
import javax.xml.datatype.DatatypeConfigurationException;

/**
 *
 * @author rvalladares
 */
public class ApiFacturaElectronica {

    public static void main(String[] args) throws DatatypeConfigurationException, ParseException {
        // TODO code application logic here
        System.out.println("Iniciando");
        registrar();
        registrarTipoCambio();
    }
    
    private static void registrar() throws ParseException, DatatypeConfigurationException {
        org.tempuri.General oGeneral = new org.tempuri.General();
        org.tempuri.TipoDocumento oTipoComprobante = null;
        
        javax.xml.ws.Holder<java.lang.String> cadena = new javax.xml.ws.Holder<>();
        int tipoCodigo = 0;
        javax.xml.ws.Holder<byte[]> codigoBarras = new javax.xml.ws.Holder<>();
        javax.xml.ws.Holder<java.lang.String> codigoHash = new javax.xml.ws.Holder<>();
        javax.xml.ws.Holder<org.tempuri.ArrayOfENErrorComunicacion> listaError = new javax.xml.ws.Holder<>();
        int idComprobanteCliente = 0;
        java.lang.String otorgar = "1";
        javax.xml.ws.Holder<Boolean> registrarResult = new javax.xml.ws.Holder<>();
                
        System.out.println("a-1");
        org.tempuri.ObjectFactory objFactory = new org.tempuri.ObjectFactory();
                        
        //Empresa(G1)
        org.tempuri.ENEmpresa oENEmpresa = objFactory.createENEmpresa();
        oENEmpresa.setCodigoTipoDocumento("6");
        oENEmpresa.setRuc("20228319768");
        oENEmpresa.setRazonSocial("FINANCIERA CONFIANZA S.A.A.");
        oENEmpresa.setCodDistrito("150115");
        oENEmpresa.setNombreComercial("FINANCIERA CONFIANZA");
        oENEmpresa.setCalle("AV. JOSE GALVEZ BARRENECHEA");
        oENEmpresa.setUrbanizacion("SANTA CATALINA");
        oENEmpresa.setDepartamento("LIMA");
        oENEmpresa.setProvincia("LIMA");
        oENEmpresa.setDistrito("LA VICTORIA");
        oENEmpresa.setTelefono("(51) 01-2116100");
        oENEmpresa.setFax("(51) 01-2248383");
        oENEmpresa.setWeb("https://www.confianza.pe/");
        oENEmpresa.setCodPais("PE");
        oENEmpresa.setCodigoEstablecimientoSUNAT("0136");
        
        oGeneral.setOENEmpresa(oENEmpresa);
       
        //Comprobante(G2)
        System.out.println("a");
        org.tempuri.ENComprobante oENComprobante = objFactory.createENComprobante();                
        oENComprobante.setTipoComprobante("Factura");
        oENComprobante.setSerie("F005");
        oENComprobante.setNumero("123456");        
        
        java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = format.parse("2018-06-13");
        java.util.GregorianCalendar cal = new java.util.GregorianCalendar();
        cal.setTime(date);
        javax.xml.datatype.XMLGregorianCalendar xmlGregCal = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        System.out.println(xmlGregCal);
        
        oENComprobante.setFechaEmisionDesde(xmlGregCal);
        oENComprobante.setFechaEmision(xmlGregCal); //agregado
        
        oENComprobante.setTipoComprobante("01");
        oENComprobante.setMoneda("PEN");
        oENComprobante.setCorreoElectronico("raul.valladares@confianza.pe");
        // objFactory.createENComprobanteMultiglosa(prueba);
        oENComprobante.setComprobanteAlias("0050501400096180606");
        oENComprobante.setTipoPlantilla("EST");
        oENComprobante.setNroOrdenCompra("");        
        oENComprobante.setCodigoCliente("334455");
        oENComprobante.setTipoOperacion("0101");
        oENComprobante.setTipoPlantillaCorreo("EST");
        oENComprobante.setTipoDocumentoIdentidad("6");
        oENComprobante.setRuc("20228319768");
        oENComprobante.setRazonSocial("Che Carlitos Morales");
        //falta importe total
        oENComprobante.setHoraEmision("21:45:34");
        //falta total impuesto
        //falta total total valor de venta
        //falta total total precio de venta
        oENComprobante.setVersionUbl("2.1");
        
        System.out.println("b");
        //Comprobante Integracion
        org.tempuri.ENIntegracion oENIntegracion = objFactory.createENIntegracion();
        oENIntegracion.setTipoIntegracion("WS");                
        
        oENComprobante.setIntegracion(oENIntegracion);        
        
        //Falta campos para NOTAS DE CREDITO G3, G4 y G5        

        //Comprobante Receptor(G6)
        org.tempuri.ArrayOfENReceptor oArrayOfENReceptor = objFactory.createArrayOfENReceptor();
        org.tempuri.ENReceptor oENReceptor = objFactory.createENReceptor();
        oENReceptor.setCodigo("120401");
        oENReceptor.setCalle("LAS ARTES NORTE");
        oENReceptor.setUrbanizacion("SAN BORJA");
        oENReceptor.setDepartamento("LIMA");
        oENReceptor.setProvincia("LIMA");
        oENReceptor.setDistrito("SAN BORJA");
        oENReceptor.setCodigo("PE");
        
        oArrayOfENReceptor.getENReceptor().add(oENReceptor);                
        oENComprobante.setReceptor(oArrayOfENReceptor);
                
        //Comprobante ComprobanteDetalle(G7)
        org.tempuri.ENComprobanteDetalle oENComprobanteDetalle = objFactory.createENComprobanteDetalle();
        oENComprobanteDetalle.setItem(1);
        oENComprobanteDetalle.setUnidadComercial("ZZ");
        oENComprobanteDetalle.setCantidad(java.math.BigDecimal.valueOf(1));
        oENComprobanteDetalle.setTotal(java.math.BigDecimal.valueOf(172.11));
        oENComprobanteDetalle.setDeterminante("1");
        oENComprobanteDetalle.setCodigoTipoPrecio("01");
        oENComprobanteDetalle.setValorVentaUnitario(java.math.BigDecimal.valueOf(172.11));
        oENComprobanteDetalle.setValorVentaUnitarioIncIgv(java.math.BigDecimal.valueOf(172.11));
        oENComprobanteDetalle.setDescripcion("INTERES PAGADO INAFECTO");
        //MultiDescripcion G7.10
        oENComprobanteDetalle.setCodigo("104007241713000002");
        oENComprobanteDetalle.setPrecioVentaItem(Double.parseDouble("172.11"));
        oENComprobanteDetalle.setUnidadMedidaEmisor("NIU");
        oENComprobanteDetalle.setCodigoProductoSunat("93151501");
        //oENComprobanteDetalle.setCodigoProductoGS1("104007241713000002");
        oENComprobanteDetalle.setImpuestoTotal(Double.parseDouble("0"));                        
        
        //Comprobante ComprobanteDetalle DescuentoCargoDetalle(G9)
        org.tempuri.ENDescuentoCargoDetalle oENDescuentoCargoDetalle = objFactory.createENDescuentoCargoDetalle();
        oENDescuentoCargoDetalle.setIndicador(1);
        oENDescuentoCargoDetalle.setMonto(java.math.BigDecimal.valueOf(0));
        oENDescuentoCargoDetalle.setDescripcion("algo");
        oENDescuentoCargoDetalle.setPorcentaje(java.math.BigDecimal.valueOf(12.34));
        oENDescuentoCargoDetalle.setCodigoAplicado("01");
        oENDescuentoCargoDetalle.setMontoBase(Double.parseDouble("0"));
        
        org.tempuri.ArrayOfENDescuentoCargoDetalle oArrayOfENDescuentoCargoDetalle = objFactory.createArrayOfENDescuentoCargoDetalle();
        oArrayOfENDescuentoCargoDetalle.getENDescuentoCargoDetalle().add(oENDescuentoCargoDetalle);         
        oENComprobanteDetalle.setDescuentoCargoDetalle(oArrayOfENDescuentoCargoDetalle);
                        
        //Comprobante ComprobanteDetalle ComprobanteDetalleImpuesto(G10)
        org.tempuri.ENComprobanteDetalleImpuestos oENComprobanteDetalleImpuestos = objFactory.createENComprobanteDetalleImpuestos();
        oENComprobanteDetalleImpuestos.setImporteTributo(java.math.BigDecimal.valueOf(0));
        oENComprobanteDetalleImpuestos.setImporteExplicito(java.math.BigDecimal.valueOf(0));
        oENComprobanteDetalleImpuestos.setAfectacionIGV("1"); //Solo se puede mandar uno de ellos AfectacionIGV o SistemaISC 
        //oENComprobanteDetalleImpuestos.setSistemaISC("1"); //revisar valor
        oENComprobanteDetalleImpuestos.setCodigoTributo("1"); //revisar valor
        oENComprobanteDetalleImpuestos.setDesTributo("algo"); //revisar valor
        oENComprobanteDetalleImpuestos.setCodigoUN("1");//revisar valor
        oENComprobanteDetalleImpuestos.setMontoBase(Double.parseDouble("0"));
        oENComprobanteDetalleImpuestos.setTasaAplicada(Double.parseDouble("0"));
        
        org.tempuri.ArrayOfENComprobanteDetalleImpuestos oArrayOfENComprobanteDetalleImpuestos = objFactory.createArrayOfENComprobanteDetalleImpuestos();
        oArrayOfENComprobanteDetalleImpuestos.getENComprobanteDetalleImpuestos().add(oENComprobanteDetalleImpuestos);        
        oENComprobanteDetalle.setComprobanteDetalleImpuestos(oArrayOfENComprobanteDetalleImpuestos);
        
        //Comprobante ComprobantePropiedadesAdicionales(G13)        
        org.tempuri.ENComprobantePropiedadesAdicionales oENComprobantePropiedadesAdicionales = objFactory.createENComprobantePropiedadesAdicionales();
        oENComprobantePropiedadesAdicionales.setCodigo("1"); //reviar valor
        oENComprobantePropiedadesAdicionales.setValor("1"); //reviar valor
        
        org.tempuri.ArrayOfENComprobantePropiedadesAdicionales oArrayOfENComprobantePropiedadesAdicionales = objFactory.createArrayOfENComprobantePropiedadesAdicionales();
        oArrayOfENComprobantePropiedadesAdicionales.getENComprobantePropiedadesAdicionales().add(oENComprobantePropiedadesAdicionales);
        oENComprobante.setComprobantePropiedadesAdicionales(oArrayOfENComprobantePropiedadesAdicionales);
        
        System.out.println("c");
        
        //Comprobante Texto(G14)        
        org.tempuri.ENTexto oENTexto = objFactory.createENTexto();
        oENTexto.setTexto1("1");
        oENTexto.setTexto2("2");
        oENTexto.setTexto3("3");
        oENTexto.setTexto4("4");
        
        org.tempuri.ArrayOfENTexto oArrayOfENTexto =  objFactory.createArrayOfENTexto();
        oArrayOfENTexto.getENTexto().add(oENTexto);               
        oENComprobante.setTexto(oArrayOfENTexto);
        
        //Comprobante Sucursal(G33)
        org.tempuri.ENSucursal oENSucursal = objFactory.createENSucursal();
        oENSucursal.setNombre("PROCERES");
        
        org.tempuri.ArrayOfENSucursal oArrayOfENSucursal = objFactory.createArrayOfENSucursal();
        oArrayOfENSucursal.getENSucursal().add(oENSucursal);
        oENComprobante.setSucursal(oArrayOfENSucursal);
        
        //Comprobante ComprobanteMontosAdicionalesOtros(G36)
        org.tempuri.ENComprobanteMontosAdicionalesOtros oENComprobanteMontosAdicionalesOtros = objFactory.createENComprobanteMontosAdicionalesOtros();
        oENComprobanteMontosAdicionalesOtros.setCodigo("1");
        oENComprobanteMontosAdicionalesOtros.setMonto(java.math.BigDecimal.valueOf(1));
        
        org.tempuri.ArrayOfENComprobanteMontosAdicionalesOtros oArrayOfENComprobanteMontosAdicionalesOtros = objFactory.createArrayOfENComprobanteMontosAdicionalesOtros();
        oArrayOfENComprobanteMontosAdicionalesOtros.getENComprobanteMontosAdicionalesOtros().add(oENComprobanteMontosAdicionalesOtros);
        oENComprobante.setComprobanteMontosAdicionalesOtros(oArrayOfENComprobanteMontosAdicionalesOtros);
        
        // Comprobante ComprobanteDetalle GastosHipotecarios(G74)
        org.tempuri.ENGastosHipotecario oENGastosHipotecario = objFactory.createENGastosHipotecario();
        oENGastosHipotecario.setCodigoTipoPrestamo("1");
        oENGastosHipotecario.setCodigoIndicador("1");
        oENGastosHipotecario.setNumeroPartidaRegistral("123456");
        oENGastosHipotecario.setNumeroContrato("654321");
        oENGastosHipotecario.setFechaOtorgaCredito("2018-06-12");
        oENGastosHipotecario.setCodigoUbigeo("010101");
        oENGastosHipotecario.setDireccion("las begonias");
        oENGastosHipotecario.setUrbanizacion("san isidro");
        oENGastosHipotecario.setProvincia("LIMA");
        oENGastosHipotecario.setDistrito("SAN ISIDRO");
        oENGastosHipotecario.setDepartamento("LIMA");
                
        oENComprobanteDetalle.setGastosHipotecario(oENGastosHipotecario);
        
        org.tempuri.ArrayOfENComprobanteDetalle oArrayOfENComprobanteDetalle = objFactory.createArrayOfENComprobanteDetalle();
        oArrayOfENComprobanteDetalle.getENComprobanteDetalle().add(oENComprobanteDetalle);
        oENComprobante.setComprobanteDetalle(oArrayOfENComprobanteDetalle);
        
        System.out.println("d");
        //Comprobante MontosTotales Gravado(G79)
        org.tempuri.ENGravado oENGravado = objFactory.createENGravado();        
        oENGravado.setTotal(Double.parseDouble("172.11"));  
        
        org.tempuri.ENMontosTotales oENMontosTotales = objFactory.createENMontosTotales(); 
        
        //Comprobante MontosTotales Gravado GravadoIGV(G80)
        org.tempuri.ENGravadoIGV oENGravadoIGV = objFactory.createENGravadoIGV();
        oENGravadoIGV.setBase(Double.parseDouble("0.00"));
        oENGravadoIGV.setValorImpuesto(Double.parseDouble("0.00"));
        oENGravadoIGV.setPorcentaje(Double.parseDouble("0.00"));
        
        oENGravado.setGravadoIGV(oENGravadoIGV);                
        
        //Comprobante MontosTotales Gravado GravadoOtros
        org.tempuri.ENGravadoOTROS oENGravadoOTROS = objFactory.createENGravadoOTROS();
        oENGravadoOTROS.setBase(Double.parseDouble("0.00"));
        oENGravadoOTROS.setValorImpuesto(Double.valueOf("0.00"));
        
        oENGravado.setGravadoOTROS(oENGravadoOTROS);
        oENMontosTotales.setGravado(oENGravado);
        
        //Comprobante MontosTotales Inafecto
        org.tempuri.ENInafecto oENInafecto = objFactory.createENInafecto();
        oENInafecto.setTotal(Double.parseDouble("0.00"));
        
        oENMontosTotales.setInafecto(oENInafecto);
        
        //Comprobante MontosTotales Gratuito GratuitoImpuesto
        org.tempuri.ENGratuitoImpuesto oENGratuitoImpuesto = objFactory.createENGratuitoImpuesto();        
        oENGratuitoImpuesto.setBase(Double.parseDouble("0.00"));
        oENGratuitoImpuesto.setValorImpuesto(Double.parseDouble("0.00"));
        
        org.tempuri.ENGratuito oENGratuito = objFactory.createENGratuito();
        oENGratuito.setGratuitoImpuesto(oENGratuitoImpuesto);        
        oENMontosTotales.setGratuito(oENGratuito);
        
        oENComprobante.setMontosTotales(oENMontosTotales);
        
        oGeneral.setOENComprobante(oENComprobante);
        
        System.out.println("consumiendo servicio registrar");              
        org.tempuri.WSComprobante service = new org.tempuri.WSComprobante();
        org.tempuri.WSComprobanteSoap port = service.getWSComprobanteSoap();
        port.registrar(oGeneral, oTipoComprobante.FACTURA, cadena, tipoCodigo, codigoBarras, codigoHash, listaError, idComprobanteCliente, otorgar, registrarResult);
        System.out.println("registrarResult: " + registrarResult.value);
        System.out.println("cadena Registar: " + cadena.value);
    }

    private static void registrarTipoCambio() throws ParseException, DatatypeConfigurationException {
        System.out.println("INiciando tipo de cambio");
        org.tempuri.ENEnvioTipoCambio oENEnvioTipoCambio = new org.tempuri.ENEnvioTipoCambio();
        javax.xml.ws.Holder<java.lang.String> cadena = new javax.xml.ws.Holder(); 
        javax.xml.ws.Holder<Boolean> registrarTipoCambioResult = new javax.xml.ws.Holder();
       
        java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = format.parse("2018-06-13");
        java.util.GregorianCalendar cal = new java.util.GregorianCalendar();
        cal.setTime(date);
        javax.xml.datatype.XMLGregorianCalendar xmlGregCal = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        System.out.println(xmlGregCal);
        
        java.math.BigDecimal tipoCambio = new java.math.BigDecimal("3.25");
        oENEnvioTipoCambio.setRuc("20228319768");
        oENEnvioTipoCambio.setCodigoMoneda("USD");
        oENEnvioTipoCambio.setFechaTipoCambio(xmlGregCal);
        oENEnvioTipoCambio.setTipoCambio(tipoCambio);        
        
        org.tempuri.WSComprobante service = new org.tempuri.WSComprobante();
        org.tempuri.WSComprobanteSoap port = service.getWSComprobanteSoap();
        System.out.println("Consumiendo servicio tipo de cambio");
        port.registrarTipoCambio(oENEnvioTipoCambio, cadena, registrarTipoCambioResult);
        System.out.println("result: "+ registrarTipoCambioResult.value);
    }             
    
}
