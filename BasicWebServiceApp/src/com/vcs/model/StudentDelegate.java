package com.vcs.model;

@javax.jws.WebService(targetNamespace = "http://model.vcs.com/", serviceName = "StudentService", portName = "StudentPort", wsdlLocation = "WEB-INF/wsdl/StudentService.wsdl")
public class StudentDelegate {

	com.vcs.model.Student student = new com.vcs.model.Student();

	public String getMsg(String msg) {
		return student.getMsg(msg);
	}

}