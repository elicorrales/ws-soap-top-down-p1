package com.eli.calc.shape.service.ws;

import javax.annotation.Generated;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-09-21T11:54:57.350-04:00
 * Generated source version: 3.1.7
 * 
 */
@WebService(targetNamespace = "http://ws.service.shape.calc.eli.com/", name = "ShapeCalculatorWebService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-09-21T11:54:57.350-04:00", comments = "Apache CXF 3.1.7")
public interface ShapeCalculatorWebService {

    @WebMethod
    @Oneway
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-09-21T11:54:57.350-04:00")
    public void runAllPendingRequestsNoStopOnError();
}
