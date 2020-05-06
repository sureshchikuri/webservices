package com.vcs.service;

import javax.jws.WebService;

@WebService(endpointInterface="com.vcs.service.Msg")
public class HelloMsg implements Msg {

	public String getMsg(String msg) {
		
		return "Hello:"+msg;
	}

}
