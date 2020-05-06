/**
 * HelloMsgServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vcs.service;

public class HelloMsgServiceLocator extends org.apache.axis.client.Service implements com.vcs.service.HelloMsgService {

    public HelloMsgServiceLocator() {
    }


    public HelloMsgServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HelloMsgServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HelloMsgPort
    private java.lang.String HelloMsgPort_address = "http://localhost:8080/BasicJAX-WSApp1/HelloMsgPort";

    public java.lang.String getHelloMsgPortAddress() {
        return HelloMsgPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HelloMsgPortWSDDServiceName = "HelloMsgPort";

    public java.lang.String getHelloMsgPortWSDDServiceName() {
        return HelloMsgPortWSDDServiceName;
    }

    public void setHelloMsgPortWSDDServiceName(java.lang.String name) {
        HelloMsgPortWSDDServiceName = name;
    }

    public com.vcs.service.HelloMsgDelegate getHelloMsgPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HelloMsgPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHelloMsgPort(endpoint);
    }

    public com.vcs.service.HelloMsgDelegate getHelloMsgPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.vcs.service.HelloMsgPortBindingStub _stub = new com.vcs.service.HelloMsgPortBindingStub(portAddress, this);
            _stub.setPortName(getHelloMsgPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHelloMsgPortEndpointAddress(java.lang.String address) {
        HelloMsgPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.vcs.service.HelloMsgDelegate.class.isAssignableFrom(serviceEndpointInterface)) {
                com.vcs.service.HelloMsgPortBindingStub _stub = new com.vcs.service.HelloMsgPortBindingStub(new java.net.URL(HelloMsgPort_address), this);
                _stub.setPortName(getHelloMsgPortWSDDServiceName());
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
        if ("HelloMsgPort".equals(inputPortName)) {
            return getHelloMsgPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.vcs.com/", "HelloMsgService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.vcs.com/", "HelloMsgPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HelloMsgPort".equals(portName)) {
            setHelloMsgPortEndpointAddress(address);
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
