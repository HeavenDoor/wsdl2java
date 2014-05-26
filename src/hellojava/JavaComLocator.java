/**
 * JavaComLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package hellojava;

public class JavaComLocator extends org.apache.axis.client.Service implements hellojava.JavaCom {

    public JavaComLocator() {
    }


    public JavaComLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public JavaComLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for JavaComSoap12
    private java.lang.String JavaComSoap12_address = "http://localhost/JavaCom/JavaCom.asmx";

    public java.lang.String getJavaComSoap12Address() {
        return JavaComSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String JavaComSoap12WSDDServiceName = "JavaComSoap12";

    public java.lang.String getJavaComSoap12WSDDServiceName() {
        return JavaComSoap12WSDDServiceName;
    }

    public void setJavaComSoap12WSDDServiceName(java.lang.String name) {
        JavaComSoap12WSDDServiceName = name;
    }

    public hellojava.JavaComSoap_PortType getJavaComSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(JavaComSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getJavaComSoap12(endpoint);
    }

    public hellojava.JavaComSoap_PortType getJavaComSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            hellojava.JavaComSoap12Stub _stub = new hellojava.JavaComSoap12Stub(portAddress, this);
            _stub.setPortName(getJavaComSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setJavaComSoap12EndpointAddress(java.lang.String address) {
        JavaComSoap12_address = address;
    }


    // Use to get a proxy class for JavaComSoap
    private java.lang.String JavaComSoap_address = "http://localhost/JavaCom/JavaCom.asmx";

    public java.lang.String getJavaComSoapAddress() {
        return JavaComSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String JavaComSoapWSDDServiceName = "JavaComSoap";

    public java.lang.String getJavaComSoapWSDDServiceName() {
        return JavaComSoapWSDDServiceName;
    }

    public void setJavaComSoapWSDDServiceName(java.lang.String name) {
        JavaComSoapWSDDServiceName = name;
    }

    public hellojava.JavaComSoap_PortType getJavaComSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(JavaComSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getJavaComSoap(endpoint);
    }

    public hellojava.JavaComSoap_PortType getJavaComSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            hellojava.JavaComSoap_BindingStub _stub = new hellojava.JavaComSoap_BindingStub(portAddress, this);
            _stub.setPortName(getJavaComSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setJavaComSoapEndpointAddress(java.lang.String address) {
        JavaComSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (hellojava.JavaComSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                hellojava.JavaComSoap12Stub _stub = new hellojava.JavaComSoap12Stub(new java.net.URL(JavaComSoap12_address), this);
                _stub.setPortName(getJavaComSoap12WSDDServiceName());
                return _stub;
            }
            if (hellojava.JavaComSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                hellojava.JavaComSoap_BindingStub _stub = new hellojava.JavaComSoap_BindingStub(new java.net.URL(JavaComSoap_address), this);
                _stub.setPortName(getJavaComSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("JavaComSoap12".equals(inputPortName)) {
            return getJavaComSoap12();
        }
        else if ("JavaComSoap".equals(inputPortName)) {
            return getJavaComSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "JavaCom");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "JavaComSoap12"));
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "JavaComSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("JavaComSoap12".equals(portName)) {
            setJavaComSoap12EndpointAddress(address);
        }
        else 
if ("JavaComSoap".equals(portName)) {
            setJavaComSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
