package com.vcs.service;

import java.rmi.RemoteException;

public class HelloMsg implements Msg {

	@Override
	public String getMsg(String msg) throws RemoteException {
		return "Hello:"+msg;
	}

}
