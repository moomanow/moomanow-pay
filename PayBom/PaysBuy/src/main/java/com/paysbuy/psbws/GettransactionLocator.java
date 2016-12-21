/**
 * GettransactionLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paysbuy.psbws;

public class GettransactionLocator extends org.apache.axis.client.Service implements com.paysbuy.psbws.Gettransaction {

    public GettransactionLocator() {
    }


    public GettransactionLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GettransactionLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for gettransactionSoap
    private java.lang.String gettransactionSoap_address = "http://www.paysbuy.com/psb_ws/getTransaction.asmx";

    public java.lang.String getgettransactionSoapAddress() {
        return gettransactionSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String gettransactionSoapWSDDServiceName = "gettransactionSoap";

    public java.lang.String getgettransactionSoapWSDDServiceName() {
        return gettransactionSoapWSDDServiceName;
    }

    public void setgettransactionSoapWSDDServiceName(java.lang.String name) {
        gettransactionSoapWSDDServiceName = name;
    }

    public com.paysbuy.psbws.GettransactionSoap getgettransactionSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(gettransactionSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getgettransactionSoap(endpoint);
    }

    public com.paysbuy.psbws.GettransactionSoap getgettransactionSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.paysbuy.psbws.GettransactionSoapStub _stub = new com.paysbuy.psbws.GettransactionSoapStub(portAddress, this);
            _stub.setPortName(getgettransactionSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setgettransactionSoapEndpointAddress(java.lang.String address) {
        gettransactionSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.paysbuy.psbws.GettransactionSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.paysbuy.psbws.GettransactionSoapStub _stub = new com.paysbuy.psbws.GettransactionSoapStub(new java.net.URL(gettransactionSoap_address), this);
                _stub.setPortName(getgettransactionSoapWSDDServiceName());
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
        if ("gettransactionSoap".equals(inputPortName)) {
            return getgettransactionSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "gettransaction");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "gettransactionSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("gettransactionSoap".equals(portName)) {
            setgettransactionSoapEndpointAddress(address);
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
