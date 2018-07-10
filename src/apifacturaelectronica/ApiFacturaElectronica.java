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
        //registrarFactura();
        //registrarNotaCredito();
        //registrarTipoCambio();
        //confirmarRespuestaComprobante();
        obtenerXML();
    }
    
    private static void registrarFactura() throws ParseException, DatatypeConfigurationException {
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
        oENEmpresa.setCodigoEstablecimientoSUNAT("0000");
        
        oGeneral.setOENEmpresa(oENEmpresa);
       
        //Comprobante(G2)
        System.out.println("a");
        org.tempuri.ENComprobante oENComprobante = objFactory.createENComprobante();                
        oENComprobante.setTipoComprobante("01"); // 01:FACTURA, 07:NOTA_CREDITO
        oENComprobante.setSerie("F005");
        oENComprobante.setNumero("00009901");        
        
        java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = format.parse("2018-07-06");
        java.util.GregorianCalendar cal = new java.util.GregorianCalendar();
        cal.setTime(date);
        javax.xml.datatype.XMLGregorianCalendar xmlGregCal = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        System.out.println(xmlGregCal);
        
        oENComprobante.setFechaEmisionDesde(xmlGregCal);
        oENComprobante.setFechaEmision(xmlGregCal); //agregado
        
        oENComprobante.setMoneda("PEN");
        oENComprobante.setCorreoElectronico("raul.valladares@confianza.pe");
        oENComprobante.setComprobanteAlias("0460501400024180621");
        oENComprobante.setTipoPlantilla("EST");
        oENComprobante.setNroOrdenCompra("");        
        oENComprobante.setCodigoCliente("3880132");
        oENComprobante.setTipoOperacion("0112");
        oENComprobante.setTipoPlantillaCorreo("EST");
        oENComprobante.setTipoDocumentoIdentidad("1");
        oENComprobante.setRuc("01915960");
        oENComprobante.setRazonSocial("JOSIMAR YOTUN");
        oENComprobante.setHoraEmision("16:10:34");
        oENComprobante.setVersionUbl("2.1");                
        //Agregados RVP 2018-06-20
        oENComprobante.setImporteTotal(java.math.BigDecimal.valueOf(250.00));
        oENComprobante.setTotalImpuesto(Double.parseDouble("0.00"));
        oENComprobante.setTotalValorVenta(Double.parseDouble("250.00"));
        oENComprobante.setTotalPrecioVenta(Double.parseDouble("250.00"));
        oENComprobante.setCodigoLogo("");
        
        org.tempuri.ArrayOfString oArrayOfString2 = objFactory.createArrayOfString();
        oArrayOfString2.getString().add("SaldoCapital 2000.00 nrocuota 12 prox vcto 04/08/2018");
        oENComprobante.setMultiglosa(oArrayOfString2);
        
        System.out.println("b");
        //Comprobante Integracion
        org.tempuri.ENIntegracion oENIntegracion = objFactory.createENIntegracion();
        oENIntegracion.setTipoIntegracion("WS");                
        
        oENComprobante.setIntegracion(oENIntegracion);        
        
        //Falta campos para NOTAS DE CREDITO G3, G4 y G5        

        //Comprobante Receptor(G6)
        org.tempuri.ArrayOfENReceptor oArrayOfENReceptor = objFactory.createArrayOfENReceptor();
        org.tempuri.ENReceptor oENReceptor = objFactory.createENReceptor();
        oENReceptor.setCodigo("PE");
        oENReceptor.setCalle("LAS ARTES NORTE");
        oENReceptor.setUrbanizacion("SAN BORJA");
        oENReceptor.setDepartamento("LIMA");
        oENReceptor.setProvincia("LIMA");
        oENReceptor.setDistrito("SAN BORJA");
        
        oArrayOfENReceptor.getENReceptor().add(oENReceptor);                
        oENComprobante.setReceptor(oArrayOfENReceptor);
                
        //Comprobante ComprobanteDetalle(G7)
        org.tempuri.ENComprobanteDetalle oENComprobanteDetalle = objFactory.createENComprobanteDetalle();
        oENComprobanteDetalle.setItem(1);
        oENComprobanteDetalle.setUnidadComercial("ZZ");
        oENComprobanteDetalle.setCantidad(java.math.BigDecimal.valueOf(1));
        oENComprobanteDetalle.setTotal(java.math.BigDecimal.valueOf(250.00));
        oENComprobanteDetalle.setDeterminante("1");
        oENComprobanteDetalle.setCodigoTipoPrecio("01");
        oENComprobanteDetalle.setValorVentaUnitario(java.math.BigDecimal.valueOf(250.00));
        oENComprobanteDetalle.setValorVentaUnitarioIncIgv(java.math.BigDecimal.valueOf(250.00));
        oENComprobanteDetalle.setDescripcion("INTERES PAGADO INAFECTO");
        //MultiDescripcion G7.10
        oENComprobanteDetalle.setCodigo("104007241713000002");
        oENComprobanteDetalle.setPrecioVentaItem(Double.parseDouble("250.00"));
        oENComprobanteDetalle.setUnidadMedidaEmisor("NIU");
        oENComprobanteDetalle.setCodigoProductoSunat("84121901");
        //oENComprobanteDetalle.setCodigoProductoGS1("104007241713000002");
        oENComprobanteDetalle.setImpuestoTotal(Double.parseDouble("0.0"));
        
        org.tempuri.ArrayOfString oArrayOfString = objFactory.createArrayOfString();
        oArrayOfString.getString().add("Capital 150.00 Comision 20.00 Seguros 10.00 Interes 70.00");
        oENComprobanteDetalle.setMultiDescripcion(oArrayOfString);
        
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
        oENComprobanteDetalleImpuestos.setImporteTributo(java.math.BigDecimal.valueOf(0.0));
        oENComprobanteDetalleImpuestos.setImporteExplicito(java.math.BigDecimal.valueOf(0.0));
        oENComprobanteDetalleImpuestos.setAfectacionIGV("30"); //Solo se puede mandar uno de ellos AfectacionIGV o SistemaISC 
        //oENComprobanteDetalleImpuestos.setSistemaISC("1"); //revisar valor
        oENComprobanteDetalleImpuestos.setCodigoTributo("9998"); //revisar valor
        oENComprobanteDetalleImpuestos.setDesTributo("INA"); //revisar valor
        oENComprobanteDetalleImpuestos.setCodigoUN("FRE");//revisar valor
        oENComprobanteDetalleImpuestos.setMontoBase(Double.parseDouble("250.00"));
        oENComprobanteDetalleImpuestos.setTasaAplicada(Double.parseDouble("0.0"));
        
        org.tempuri.ArrayOfENComprobanteDetalleImpuestos oArrayOfENComprobanteDetalleImpuestos = objFactory.createArrayOfENComprobanteDetalleImpuestos();
        oArrayOfENComprobanteDetalleImpuestos.getENComprobanteDetalleImpuestos().add(oENComprobanteDetalleImpuestos);        
        oENComprobanteDetalle.setComprobanteDetalleImpuestos(oArrayOfENComprobanteDetalleImpuestos);
        
        //Comprobante ComprobantePropiedadesAdicionales(G13)        
        org.tempuri.ENComprobantePropiedadesAdicionales oENComprobantePropiedadesAdicionales = objFactory.createENComprobantePropiedadesAdicionales();
        oENComprobantePropiedadesAdicionales.setCodigo("1000"); //reviar valor
        oENComprobantePropiedadesAdicionales.setValor("DOSCIENTOS CINCUENTA CON 00/100 SOLES"); //reviar valor
        
        org.tempuri.ArrayOfENComprobantePropiedadesAdicionales oArrayOfENComprobantePropiedadesAdicionales = objFactory.createArrayOfENComprobantePropiedadesAdicionales();
        oArrayOfENComprobantePropiedadesAdicionales.getENComprobantePropiedadesAdicionales().add(oENComprobantePropiedadesAdicionales);
        oENComprobante.setComprobantePropiedadesAdicionales(oArrayOfENComprobantePropiedadesAdicionales);
        
        System.out.println("c");
        
        //Comprobante Texto(G14)        
        org.tempuri.ENTexto oENTexto = objFactory.createENTexto();
        oENTexto.setTexto1("1");
        oENTexto.setTexto2("2");
        oENTexto.setTexto3("3015501400011");
        oENTexto.setTexto4("108-FC-Mi Vivienda 1/3 No Concesi.");
        
        org.tempuri.ArrayOfENTexto oArrayOfENTexto =  objFactory.createArrayOfENTexto();
        oArrayOfENTexto.getENTexto().add(oENTexto);               
        oENComprobante.setTexto(oArrayOfENTexto);
        
        //Comprobante Sucursal(G33)
        org.tempuri.ENSucursal oENSucursal = objFactory.createENSucursal();
        oENSucursal.setNombre("AG CENTENARIO");
        
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
        oENGastosHipotecario.setCodigoTipoPrestamo("0");
        oENGastosHipotecario.setCodigoIndicador("0");
        oENGastosHipotecario.setNumeroPartidaRegistral("0011013807");
        oENGastosHipotecario.setNumeroContrato("103006465343");
        oENGastosHipotecario.setFechaOtorgaCredito("2018-06-12");
        oENGastosHipotecario.setCodigoUbigeo("040112");
        oENGastosHipotecario.setDireccion("AA.HH SANTA TERESA DE JESUS Mz. A Lot. 1");
        oENGastosHipotecario.setUrbanizacion("AREQUIPA");
        oENGastosHipotecario.setProvincia("AREQUIPA");
        oENGastosHipotecario.setDistrito("Paucarpata");
        oENGastosHipotecario.setDepartamento("AREQUIPA");
                
        oENComprobanteDetalle.setGastosHipotecario(oENGastosHipotecario);
        
        org.tempuri.ArrayOfENComprobanteDetalle oArrayOfENComprobanteDetalle = objFactory.createArrayOfENComprobanteDetalle();
        oArrayOfENComprobanteDetalle.getENComprobanteDetalle().add(oENComprobanteDetalle);
        oENComprobante.setComprobanteDetalle(oArrayOfENComprobanteDetalle);
        
        System.out.println("d");
        //Comprobante MontosTotales Gravado(G79)
        
        org.tempuri.ENGravado oENGravado = objFactory.createENGravado();        
        oENGravado.setTotal(Double.parseDouble("250.00"));  
        
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
        oENInafecto.setTotal(Double.parseDouble("250.00"));
        
        oENMontosTotales.setInafecto(oENInafecto);        
        
        //Comprobante MontosTotales Gratuito GratuitoImpuesto
        
        org.tempuri.ENGratuitoImpuesto oENGratuitoImpuesto = objFactory.createENGratuitoImpuesto();        
        oENGratuitoImpuesto.setBase(Double.parseDouble("0.00"));
        oENGratuitoImpuesto.setValorImpuesto(Double.parseDouble("0.00"));
        
        org.tempuri.ENGratuito oENGratuito = objFactory.createENGratuito();
        oENGratuito.setGratuitoImpuesto(oENGratuitoImpuesto);        
        oENGratuito.setTotal(Double.parseDouble("0.00"));
        oENMontosTotales.setGratuito(oENGratuito);
      
        oENComprobante.setMontosTotales(oENMontosTotales);
        
        oGeneral.setOENComprobante(oENComprobante);
        
        System.out.println("consumiendo servicio registrar Factura");              
        org.tempuri.WSComprobante service = new org.tempuri.WSComprobante();
        org.tempuri.WSComprobanteSoap port = service.getWSComprobanteSoap();
        System.out.println("oGeneral: " + oGeneral.toString());
        port.registrar(oGeneral, oTipoComprobante.FACTURA, cadena, tipoCodigo, codigoBarras, codigoHash, listaError, idComprobanteCliente, otorgar, registrarResult);
        System.out.println("registrarResult: " + registrarResult.value);
        System.out.println("cadena Registar: " + cadena.value);
    }
    
    private static void registrarNotaCredito() throws ParseException, DatatypeConfigurationException {
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
        oENEmpresa.setCodigoEstablecimientoSUNAT("0000");
        
        oGeneral.setOENEmpresa(oENEmpresa);
       
        //Comprobante(G2)
        System.out.println("a");
        org.tempuri.ENComprobante oENComprobante = objFactory.createENComprobante();                
        oENComprobante.setTipoComprobante("07"); // 01:FACTURA, 07:NOTA_CREDITO
        oENComprobante.setSerie("F005");
        oENComprobante.setNumero("00009906");        
        
        java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = format.parse("2018-07-06");
        java.util.GregorianCalendar cal = new java.util.GregorianCalendar();
        cal.setTime(date);
        javax.xml.datatype.XMLGregorianCalendar xmlGregCal = javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        System.out.println(xmlGregCal);
        
        oENComprobante.setFechaEmisionDesde(xmlGregCal);
        oENComprobante.setFechaEmision(xmlGregCal); //agregado
        
        oENComprobante.setMoneda("PEN");
        oENComprobante.setCorreoElectronico("raul.valladares@confianza.pe");
        oENComprobante.setComprobanteAlias("0460501400024180621");
        oENComprobante.setTipoPlantilla("EST");
        oENComprobante.setNroOrdenCompra("");        
        oENComprobante.setCodigoCliente("3880132");
        oENComprobante.setTipoOperacion("0112");
        oENComprobante.setTipoPlantillaCorreo("EST");
        oENComprobante.setTipoDocumentoIdentidad("1");
        oENComprobante.setRuc("01915960");
        oENComprobante.setRazonSocial("JOSIMAR YOTUN");
        oENComprobante.setHoraEmision("16:10:34");
        oENComprobante.setVersionUbl("2.1");                
        //Agregados RVP 2018-06-20
        oENComprobante.setImporteTotal(java.math.BigDecimal.valueOf(250.00));
        oENComprobante.setTotalImpuesto(Double.parseDouble("0.00"));
        oENComprobante.setTotalValorVenta(Double.parseDouble("250.00"));
        oENComprobante.setTotalPrecioVenta(Double.parseDouble("250.00"));
        oENComprobante.setCodigoLogo("");
        
        org.tempuri.ArrayOfString oArrayOfString2 = objFactory.createArrayOfString();
        oArrayOfString2.getString().add("SaldoCapital 2000.00 nrocuota 12 prox vcto 04/08/2018");
        oENComprobante.setMultiglosa(oArrayOfString2);
        
        System.out.println("b");
        //Comprobante Integracion
        org.tempuri.ENIntegracion oENIntegracion = objFactory.createENIntegracion();
        oENIntegracion.setTipoIntegracion("WS");                
        
        oENComprobante.setIntegracion(oENIntegracion);        
        
	//Comprobante ComprobanteMotivoDocumento(G3) 
        org.tempuri.ENComprobanteMotivoDocumento oENComprobanteMotivoDocumento = objFactory.createENComprobanteMotivoDocumento();
        oENComprobanteMotivoDocumento.setSerieDocRef("F005");
        oENComprobanteMotivoDocumento.setNumeroDocRef("81");
        oENComprobanteMotivoDocumento.setCodigoMotivoEmision("01"); 
		
	//Comprobante ComprobanteMotivoDocumento ComprobanteMotivoDocumentoSustento(G4)       
        org.tempuri.ENComprobanteMotivoDocumentoSustento oENComprobanteMotivoDocumentoSustento = objFactory.createENComprobanteMotivoDocumentoSustento();
        oENComprobanteMotivoDocumentoSustento.setSustento("Monto Incorrecto");
        
        org.tempuri.ArrayOfENComprobanteMotivoDocumentoSustento oArrayOfENComprobanteMotivoDocumentoSustento =  objFactory.createArrayOfENComprobanteMotivoDocumentoSustento();
        oArrayOfENComprobanteMotivoDocumentoSustento.getENComprobanteMotivoDocumentoSustento().add(oENComprobanteMotivoDocumentoSustento);
        oENComprobanteMotivoDocumento.setSustentos(oArrayOfENComprobanteMotivoDocumentoSustento);
        
        org.tempuri.ArrayOfENComprobanteMotivoDocumento oArrayOfENComprobanteMotivoDocumento = objFactory.createArrayOfENComprobanteMotivoDocumento();
        oArrayOfENComprobanteMotivoDocumento.getENComprobanteMotivoDocumento().add(oENComprobanteMotivoDocumento);
        oENComprobante.setComprobanteMotivosDocumentos(oArrayOfENComprobanteMotivoDocumento);        
		
        //Comprobante ComprobanteNotaDocRef(G5)    
        org.tempuri.ENComprobanteNotaDocRef oENComprobanteNotaDocRef = objFactory.createENComprobanteNotaDocRef();
        oENComprobanteNotaDocRef.setSerie("F005");
        oENComprobanteNotaDocRef.setNumero("81");
        oENComprobanteNotaDocRef.setTipoComprobante("01");
        oENComprobanteNotaDocRef.setFechaDocRef("2018-07-04");
        
        org.tempuri.ArrayOfENComprobanteNotaDocRef oArrayOfENComprobanteNotaDocRef = objFactory.createArrayOfENComprobanteNotaDocRef();
        oArrayOfENComprobanteNotaDocRef.getENComprobanteNotaDocRef().add(oENComprobanteNotaDocRef);
        oENComprobante.setComprobanteNotaCreditoDocRef(oArrayOfENComprobanteNotaDocRef);
                                     
        //Comprobante Receptor(G6)
        org.tempuri.ArrayOfENReceptor oArrayOfENReceptor = objFactory.createArrayOfENReceptor();
        org.tempuri.ENReceptor oENReceptor = objFactory.createENReceptor();
        oENReceptor.setCodigo("PE");
        oENReceptor.setCalle("LAS ARTES NORTE");
        oENReceptor.setUrbanizacion("SAN BORJA");
        oENReceptor.setDepartamento("LIMA");
        oENReceptor.setProvincia("LIMA");
        oENReceptor.setDistrito("SAN BORJA");
        
        oArrayOfENReceptor.getENReceptor().add(oENReceptor);                
        oENComprobante.setReceptor(oArrayOfENReceptor);
                
        //Comprobante ComprobanteDetalle(G7)
        org.tempuri.ENComprobanteDetalle oENComprobanteDetalle = objFactory.createENComprobanteDetalle();
        oENComprobanteDetalle.setItem(1);
        oENComprobanteDetalle.setUnidadComercial("ZZ");
        oENComprobanteDetalle.setCantidad(java.math.BigDecimal.valueOf(1));
        oENComprobanteDetalle.setTotal(java.math.BigDecimal.valueOf(250.00));
        oENComprobanteDetalle.setDeterminante("1");
        oENComprobanteDetalle.setCodigoTipoPrecio("01");
        oENComprobanteDetalle.setValorVentaUnitario(java.math.BigDecimal.valueOf(250.00));
        oENComprobanteDetalle.setValorVentaUnitarioIncIgv(java.math.BigDecimal.valueOf(250.00));
        oENComprobanteDetalle.setDescripcion("INTERES PAGADO INAFECTO");
        oENComprobanteDetalle.setCodigo("104007241713000002");
        oENComprobanteDetalle.setPrecioVentaItem(Double.parseDouble("250.00"));
        oENComprobanteDetalle.setUnidadMedidaEmisor("NIU");
        oENComprobanteDetalle.setCodigoProductoSunat("84121901");
        //oENComprobanteDetalle.setCodigoProductoGS1("104007241713000002");
        oENComprobanteDetalle.setImpuestoTotal(Double.parseDouble("0.0"));
        
        org.tempuri.ArrayOfString oArrayOfString = objFactory.createArrayOfString();
        oArrayOfString.getString().add("Capital 150.00 Comision 20.00 Seguros 10.00 Interes 70.00");
        oENComprobanteDetalle.setMultiDescripcion(oArrayOfString);        
                        
        //Comprobante ComprobanteDetalle ComprobanteDetalleImpuesto(G10)
        org.tempuri.ENComprobanteDetalleImpuestos oENComprobanteDetalleImpuestos = objFactory.createENComprobanteDetalleImpuestos();
        oENComprobanteDetalleImpuestos.setImporteTributo(java.math.BigDecimal.valueOf(0.0));
        oENComprobanteDetalleImpuestos.setImporteExplicito(java.math.BigDecimal.valueOf(0.0));
        oENComprobanteDetalleImpuestos.setAfectacionIGV("30"); //Solo se puede mandar uno de ellos AfectacionIGV o SistemaISC 
        //oENComprobanteDetalleImpuestos.setSistemaISC("1"); //revisar valor
        oENComprobanteDetalleImpuestos.setCodigoTributo("9998"); //revisar valor
        oENComprobanteDetalleImpuestos.setDesTributo("INA"); //revisar valor
        oENComprobanteDetalleImpuestos.setCodigoUN("FRE");//revisar valor
        oENComprobanteDetalleImpuestos.setMontoBase(Double.parseDouble("250.00"));
        oENComprobanteDetalleImpuestos.setTasaAplicada(Double.parseDouble("0.0"));
        
        org.tempuri.ArrayOfENComprobanteDetalleImpuestos oArrayOfENComprobanteDetalleImpuestos = objFactory.createArrayOfENComprobanteDetalleImpuestos();
        oArrayOfENComprobanteDetalleImpuestos.getENComprobanteDetalleImpuestos().add(oENComprobanteDetalleImpuestos);        
        oENComprobanteDetalle.setComprobanteDetalleImpuestos(oArrayOfENComprobanteDetalleImpuestos);
        
        //Comprobante ComprobantePropiedadesAdicionales(G13)        
        org.tempuri.ENComprobantePropiedadesAdicionales oENComprobantePropiedadesAdicionales = objFactory.createENComprobantePropiedadesAdicionales();
        oENComprobantePropiedadesAdicionales.setCodigo("1000"); //reviar valor
        oENComprobantePropiedadesAdicionales.setValor("DOSCIENTOS CINCUENTA CON 00/100 SOLES"); //reviar valor
        
        org.tempuri.ArrayOfENComprobantePropiedadesAdicionales oArrayOfENComprobantePropiedadesAdicionales = objFactory.createArrayOfENComprobantePropiedadesAdicionales();
        oArrayOfENComprobantePropiedadesAdicionales.getENComprobantePropiedadesAdicionales().add(oENComprobantePropiedadesAdicionales);
        oENComprobante.setComprobantePropiedadesAdicionales(oArrayOfENComprobantePropiedadesAdicionales);
        
        System.out.println("c");
        
        //Comprobante Texto(G14)        
        org.tempuri.ENTexto oENTexto = objFactory.createENTexto();
        oENTexto.setTexto1("1");
        oENTexto.setTexto2("2");
        oENTexto.setTexto3("3015501400011");
        oENTexto.setTexto4("108-FC-Mi Vivienda 1/3 No Concesi.");
        
        org.tempuri.ArrayOfENTexto oArrayOfENTexto =  objFactory.createArrayOfENTexto();
        oArrayOfENTexto.getENTexto().add(oENTexto);               
        oENComprobante.setTexto(oArrayOfENTexto);
        
        //Comprobante Sucursal(G33)
        org.tempuri.ENSucursal oENSucursal = objFactory.createENSucursal();
        oENSucursal.setNombre("AG CENTENARIO");
        
        org.tempuri.ArrayOfENSucursal oArrayOfENSucursal = objFactory.createArrayOfENSucursal();
        oArrayOfENSucursal.getENSucursal().add(oENSucursal);
        oENComprobante.setSucursal(oArrayOfENSucursal);        
        
        // Comprobante ComprobanteDetalle GastosHipotecarios(G74)
        org.tempuri.ENGastosHipotecario oENGastosHipotecario = objFactory.createENGastosHipotecario();
        oENGastosHipotecario.setCodigoTipoPrestamo("0");
        oENGastosHipotecario.setCodigoIndicador("0");
        oENGastosHipotecario.setNumeroPartidaRegistral("0011013807");
        oENGastosHipotecario.setNumeroContrato("103006465343");
        oENGastosHipotecario.setFechaOtorgaCredito("2018-06-12");
        oENGastosHipotecario.setCodigoUbigeo("040112");
        oENGastosHipotecario.setDireccion("AA.HH SANTA TERESA DE JESUS Mz. A Lot. 1");
        oENGastosHipotecario.setUrbanizacion("AREQUIPA");
        oENGastosHipotecario.setProvincia("AREQUIPA");
        oENGastosHipotecario.setDistrito("Paucarpata");
        oENGastosHipotecario.setDepartamento("AREQUIPA");
                
        oENComprobanteDetalle.setGastosHipotecario(oENGastosHipotecario);
        
        org.tempuri.ArrayOfENComprobanteDetalle oArrayOfENComprobanteDetalle = objFactory.createArrayOfENComprobanteDetalle();
        oArrayOfENComprobanteDetalle.getENComprobanteDetalle().add(oENComprobanteDetalle);
        oENComprobante.setComprobanteDetalle(oArrayOfENComprobanteDetalle);       
        
        //Comprobante MontosTotales
        org.tempuri.ENMontosTotales oENMontosTotales = objFactory.createENMontosTotales();                               
        
        //Comprobante MontosTotales Inafecto
        org.tempuri.ENInafecto oENInafecto = objFactory.createENInafecto();
        oENInafecto.setTotal(Double.parseDouble("250.00"));        
        oENMontosTotales.setInafecto(oENInafecto);        
      
        oENComprobante.setMontosTotales(oENMontosTotales);
        
        oGeneral.setOENComprobante(oENComprobante);
        
        System.out.println("consumiendo servicio registrar NotaCredito ");              
        org.tempuri.WSComprobante service = new org.tempuri.WSComprobante();
        org.tempuri.WSComprobanteSoap port = service.getWSComprobanteSoap();        
        port.registrar(oGeneral, oTipoComprobante.NOTA_CREDITO, cadena, tipoCodigo, codigoBarras, codigoHash, listaError, idComprobanteCliente, otorgar, registrarResult);
        System.out.println("registrarResult: " + registrarResult.value);
        System.out.println("cadena Registar: " + cadena.value);
    }

    private static void registrarTipoCambio() throws ParseException, DatatypeConfigurationException {
        System.out.println("INiciando tipo de cambio");
        org.tempuri.ENEnvioTipoCambio oENEnvioTipoCambio = new org.tempuri.ENEnvioTipoCambio();
        javax.xml.ws.Holder<java.lang.String> cadena = new javax.xml.ws.Holder(); 
        javax.xml.ws.Holder<Boolean> registrarTipoCambioResult = new javax.xml.ws.Holder();
       
        java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = format.parse("2018-07-06");
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

    private static void confirmarRespuestaComprobante() {               
        System.out.println("CONFIRMAR RESPUESTA COMPROBANTE");
        org.tempuri.ENDetalleComprobante oENDetalleComprobante = new org.tempuri.ENDetalleComprobante();        
        oENDetalleComprobante.setSerie("F005");
        oENDetalleComprobante.setNumero(81);
        oENDetalleComprobante.setTipoComprobante("01");
        
        org.tempuri.ArrayOfENDetalleComprobante oArrayofENDetalleComprobante = new org.tempuri.ArrayOfENDetalleComprobante();
        oArrayofENDetalleComprobante.getENDetalleComprobante().add(oENDetalleComprobante);
                
        org.tempuri.ENSConfirmarRespuestaComprobante oENSConfirmarRptaCpb = new org.tempuri.ENSConfirmarRespuestaComprobante();
        oENSConfirmarRptaCpb.setDetalleComprobante(oArrayofENDetalleComprobante);
        oENSConfirmarRptaCpb.setRucEmisor("20228319768");
                
        org.tempuri.WSComprobante service = new org.tempuri.WSComprobante();
        org.tempuri.WSComprobanteSoap port = service.getWSComprobanteSoap();
        
        org.tempuri.ENRConfirmarRespuestaComprobante oENRConfirmarRptaCpb = port.confirmarRespuestaComprobante(oENSConfirmarRptaCpb);
        System.out.println("codigoResultado: " +oENRConfirmarRptaCpb.getCodigoResultado());
        System.out.println("Descripcion: " +oENRConfirmarRptaCpb.getDescripcion());
        
        org.tempuri.ArrayOfENDetalleComprobanteError ArrayOfENDetCpbError =  oENRConfirmarRptaCpb.getDetalleRespuestaError();
        
        org.tempuri.ENDetalleComprobanteError oENDetCpbError = ArrayOfENDetCpbError.getENDetalleComprobanteError().get(0);
        
        System.out.println("Descripcion Error: " + oENDetCpbError.getDescripcionError());
        System.out.println("Serie: " + oENDetCpbError.getSerie());
        System.out.println("Numero: " + oENDetCpbError.getNumero());
    }

    private static void obtenerXML() {
        
        javax.xml.ws.Holder<java.lang.String> cadena = new javax.xml.ws.Holder<>();
        javax.xml.ws.Holder<org.tempuri.ENRespuestaXML> obtenerXMLResult = new javax.xml.ws.Holder<>();
        
        org.tempuri.ENPeticion oENPeticion = new org.tempuri.ENPeticion();
        oENPeticion.setRuc("20228319768");
        oENPeticion.setSerie("F301");
        oENPeticion.setNumero("49");
        oENPeticion.setTipoComprobante("01");
        oENPeticion.setIndicadorComprobante(1);                        
                
        org.tempuri.WSComprobante service = new org.tempuri.WSComprobante();
        org.tempuri.WSComprobanteSoap port = service.getWSComprobanteSoap();
        port.obtenerXML(oENPeticion, cadena, obtenerXMLResult);
        
        System.out.println("cadena: " + cadena.value);
        System.out.println("obtenerXMLResult: " + obtenerXMLResult.value.getNombreXML());
        System.out.println("obtenerXMLResult: " + obtenerXMLResult.value.getArchivoXML());
        String nameFile = obtenerXMLResult.value.getNombreXML();
        
        try{
            byte[] fileArray = obtenerXMLResult.value.getArchivoXML();            
            java.io.FileOutputStream fileOuputStream = new java.io.FileOutputStream("d:\\" + nameFile);
            fileOuputStream.write(fileArray);
            fileOuputStream.close();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }


    
}
