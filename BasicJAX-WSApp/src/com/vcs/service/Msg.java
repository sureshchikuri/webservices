package com.vcs.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="HelloMsgService",targetNamespace="http://vcs.com/msg/wsdl")
public interface Msg {
	
	@WebMethod(operationName="getMsg",action="http://vcs.com/msg/wsdl#getMsg")
	@WebResult(name="return",targetNamespace="http://vcs.com/msg/wsdl/types")
	String getMsg(@WebParam(name="msg",targetNamespace="http://vcs.com/msg/wsdl/types") String msg);

}
