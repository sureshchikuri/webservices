package com.vcs.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Msg extends Remote {

	String getMsg(String msg) throws RemoteException;
}
