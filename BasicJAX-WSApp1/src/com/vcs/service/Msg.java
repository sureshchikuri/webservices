package com.vcs.service;

import java.rmi.RemoteException;

public interface Msg {

	String getMsg(String msg) throws RemoteException;
}
