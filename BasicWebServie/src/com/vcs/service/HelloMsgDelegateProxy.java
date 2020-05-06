package com.vcs.service;

public class HelloMsgDelegateProxy implements com.vcs.service.HelloMsgDelegate {
  private String _endpoint = null;
  private com.vcs.service.HelloMsgDelegate helloMsgDelegate = null;
  
  public HelloMsgDelegateProxy() {
    _initHelloMsgDelegateProxy();
  }
  
  public HelloMsgDelegateProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloMsgDelegateProxy();
  }
  
  private void _initHelloMsgDelegateProxy() {
    try {
      helloMsgDelegate = (new com.vcs.service.HelloMsgServiceLocator()).getHelloMsgPort();
      if (helloMsgDelegate != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloMsgDelegate)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloMsgDelegate)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloMsgDelegate != null)
      ((javax.xml.rpc.Stub)helloMsgDelegate)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.vcs.service.HelloMsgDelegate getHelloMsgDelegate() {
    if (helloMsgDelegate == null)
      _initHelloMsgDelegateProxy();
    return helloMsgDelegate;
  }
  
  public java.lang.String getMsg(java.lang.String arg0) throws java.rmi.RemoteException{
    if (helloMsgDelegate == null)
      _initHelloMsgDelegateProxy();
    return helloMsgDelegate.getMsg(arg0);
  }
  
  
}