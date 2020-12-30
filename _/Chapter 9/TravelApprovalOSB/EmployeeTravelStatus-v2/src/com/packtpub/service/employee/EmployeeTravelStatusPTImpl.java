package com.packtpub.service.employee;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

@WebService(name = "EmployeeTravelStatusPT", targetNamespace = "http://packtpub.com/service/employee/", serviceName = "EmployeeTravelStatusService-v2", portName = "EmployeeTravelStatusPTPort", wsdlLocation = "/WEB-INF/wsdl/EmployeeTravelStatusService_v2.wsdl")
@XmlSeeAlso( { ObjectFactory.class })
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class EmployeeTravelStatusPTImpl {
    public EmployeeTravelStatusPTImpl() {
    }

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "http://packtpub.com/service/employee//EmployeeTravelStatus", output = "http://packtpub.com/service/employee/EmployeeTravelStatusPT/EmployeeTravelStatusResponse")
    @WebMethod(operationName = "EmployeeTravelStatus", action = "http://packtpub.com/service/employee//EmployeeTravelStatus")
    @WebResult(name = "travelClass", targetNamespace = "http://packtpub.com/service/employee/", partName = "travelClass")
    public TravelClassType employeeTravelStatus(@WebParam(name = "employee", partName = "employee", targetNamespace = "http://packtpub.com/service/employee/")
        EmployeeType employee) {
      if(employee.getName().equals("Marcel")) return TravelClassType.FIRST;
      else if(employee.getName().equals("Marko")) return TravelClassType.BUSINESS;
      else return TravelClassType.ECONOMY;
    }
}
