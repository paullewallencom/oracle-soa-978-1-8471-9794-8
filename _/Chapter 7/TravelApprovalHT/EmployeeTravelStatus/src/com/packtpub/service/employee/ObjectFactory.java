
package com.packtpub.service.employee;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.packtpub.service.employee package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Employee_QNAME = new QName("http://packtpub.com/service/employee/", "employee");
    private final static QName _TravelClass_QNAME = new QName("http://packtpub.com/service/employee/", "travelClass");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.packtpub.service.employee
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmployeeType }
     * 
     */
    public EmployeeType createEmployeeType() {
        return new EmployeeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://packtpub.com/service/employee/", name = "employee")
    public JAXBElement<EmployeeType> createEmployee(EmployeeType value) {
        return new JAXBElement<EmployeeType>(_Employee_QNAME, EmployeeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelClassType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://packtpub.com/service/employee/", name = "travelClass")
    public JAXBElement<TravelClassType> createTravelClass(TravelClassType value) {
        return new JAXBElement<TravelClassType>(_TravelClass_QNAME, TravelClassType.class, null, value);
    }

}
