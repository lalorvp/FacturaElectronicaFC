
package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSComprobante", targetNamespace = "http://tempuri.org/", wsdlLocation = "file:/D:/Raul/Projectos/Factura%20Electronica/R04.%20T\u00e9cnica/service_asmx.wsdl")
public class WSComprobante
    extends Service
{

    private final static URL WSCOMPROBANTE_WSDL_LOCATION;
    private final static WebServiceException WSCOMPROBANTE_EXCEPTION;
    private final static QName WSCOMPROBANTE_QNAME = new QName("http://tempuri.org/", "WSComprobante");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/Raul/Projectos/Factura%20Electronica/R04.%20T\u00e9cnica/service_asmx.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSCOMPROBANTE_WSDL_LOCATION = url;
        WSCOMPROBANTE_EXCEPTION = e;
    }

    public WSComprobante() {
        super(__getWsdlLocation(), WSCOMPROBANTE_QNAME);
    }

    public WSComprobante(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSCOMPROBANTE_QNAME, features);
    }

    public WSComprobante(URL wsdlLocation) {
        super(wsdlLocation, WSCOMPROBANTE_QNAME);
    }

    public WSComprobante(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSCOMPROBANTE_QNAME, features);
    }

    public WSComprobante(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSComprobante(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSComprobanteSoap
     */
    @WebEndpoint(name = "WSComprobanteSoap")
    public WSComprobanteSoap getWSComprobanteSoap() {
        return super.getPort(new QName("http://tempuri.org/", "WSComprobanteSoap"), WSComprobanteSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSComprobanteSoap
     */
    @WebEndpoint(name = "WSComprobanteSoap")
    public WSComprobanteSoap getWSComprobanteSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "WSComprobanteSoap"), WSComprobanteSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns WSComprobanteSoap
     */
    @WebEndpoint(name = "WSComprobanteSoap12")
    public WSComprobanteSoap getWSComprobanteSoap12() {
        return super.getPort(new QName("http://tempuri.org/", "WSComprobanteSoap12"), WSComprobanteSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSComprobanteSoap
     */
    @WebEndpoint(name = "WSComprobanteSoap12")
    public WSComprobanteSoap getWSComprobanteSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "WSComprobanteSoap12"), WSComprobanteSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSCOMPROBANTE_EXCEPTION!= null) {
            throw WSCOMPROBANTE_EXCEPTION;
        }
        return WSCOMPROBANTE_WSDL_LOCATION;
    }

}