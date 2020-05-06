/**
 * HelloMsgService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vcs.service;

public interface HelloMsgService extends javax.xml.rpc.Service {
    public java.lang.String getHelloMsgPortAddress();

    public com.vcs.service.HelloMsgDelegate getHelloMsgPort() throws javax.xml.rpc.ServiceException;

    public com.vcs.service.HelloMsgDelegate getHelloMsgPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
