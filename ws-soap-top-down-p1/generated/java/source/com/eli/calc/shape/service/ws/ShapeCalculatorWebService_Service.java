package com.eli.calc.shape.service.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.Generated;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-09-21T01:26:09.012-04:00
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "ShapeCalculatorWebService", 
                  wsdlLocation = "file:/C:/_dzone-article-sandbox/eclipse-workspace/ws-soap-top-down-p1/WebContent/wsdl/ShapeCalcWebService.wsdl",
                  targetNamespace = "http://ws.service.shape.calc.eli.com/") 
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-09-21T01:26:09.012-04:00", comments = "Apache CXF 3.1.7")
public class ShapeCalculatorWebService_Service extends Service {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-09-21T01:26:09.012-04:00")
    public final static URL WSDL_LOCATION;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-09-21T01:26:09.012-04:00")
    public final static QName SERVICE = new QName("http://ws.service.shape.calc.eli.com/", "ShapeCalculatorWebService");
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-09-21T01:26:09.012-04:00")
    public final static QName ShapeCalculatorWebServicePort = new QName("http://ws.service.shape.calc.eli.com/", "ShapeCalculatorWebServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/_dzone-article-sandbox/eclipse-workspace/ws-soap-top-down-p1/WebContent/wsdl/ShapeCalcWebService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ShapeCalculatorWebService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/_dzone-article-sandbox/eclipse-workspace/ws-soap-top-down-p1/WebContent/wsdl/ShapeCalcWebService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-09-21T01:26:09.012-04:00")
    public ShapeCalculatorWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-09-21T01:26:09.012-04:00")
    public ShapeCalculatorWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-09-21T01:26:09.012-04:00")
    public ShapeCalculatorWebService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-09-21T01:26:09.012-04:00")
    public ShapeCalculatorWebService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-09-21T01:26:09.012-04:00")
    public ShapeCalculatorWebService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-09-21T01:26:09.012-04:00")
    public ShapeCalculatorWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ShapeCalculatorWebService
     */
    @WebEndpoint(name = "ShapeCalculatorWebServicePort")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-09-21T01:26:09.012-04:00")
    public ShapeCalculatorWebService getShapeCalculatorWebServicePort() {
        return super.getPort(ShapeCalculatorWebServicePort, ShapeCalculatorWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ShapeCalculatorWebService
     */
    @WebEndpoint(name = "ShapeCalculatorWebServicePort")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-09-21T01:26:09.012-04:00")
    public ShapeCalculatorWebService getShapeCalculatorWebServicePort(WebServiceFeature... features) {
        return super.getPort(ShapeCalculatorWebServicePort, ShapeCalculatorWebService.class, features);
    }

}
