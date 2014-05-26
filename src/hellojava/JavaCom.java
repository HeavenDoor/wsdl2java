/**
 * JavaCom.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package hellojava;

public interface JavaCom extends javax.xml.rpc.Service {
    public java.lang.String getJavaComSoap12Address();

    public hellojava.JavaComSoap_PortType getJavaComSoap12() throws javax.xml.rpc.ServiceException;

    public hellojava.JavaComSoap_PortType getJavaComSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getJavaComSoapAddress();

    public hellojava.JavaComSoap_PortType getJavaComSoap() throws javax.xml.rpc.ServiceException;

    public hellojava.JavaComSoap_PortType getJavaComSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
