package com.vcs.service;

import java.rmi.RemoteException;

@javax.jws.WebService(targetNamespace = "http://service.vcs.com/", serviceName = "HelloMsgService", portName = "HelloMsgPort", wsdlLocation = "WEB-INF/wsdl/HelloMsgService.wsdl")
public class HelloMsgDelegate {

	com.vcs.service.HelloMsg helloMsg = new com.vcs.service.HelloMsg();

	public String getMsg(String msg) throws RemoteException {
		return helloMsg.getMsg(msg);
	}

}