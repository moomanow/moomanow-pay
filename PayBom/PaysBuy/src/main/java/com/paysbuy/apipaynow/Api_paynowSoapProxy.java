package com.paysbuy.apipaynow;

public class Api_paynowSoapProxy implements com.paysbuy.apipaynow.Api_paynowSoap {
  private String _endpoint = null;
  private com.paysbuy.apipaynow.Api_paynowSoap api_paynowSoap = null;
  
  public Api_paynowSoapProxy() {
    _initApi_paynowSoapProxy();
  }
  
  public Api_paynowSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initApi_paynowSoapProxy();
  }
  
  private void _initApi_paynowSoapProxy() {
    try {
      api_paynowSoap = (new com.paysbuy.apipaynow.Api_paynowLocator()).getapi_paynowSoap();
      if (api_paynowSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)api_paynowSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)api_paynowSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (api_paynowSoap != null)
      ((javax.xml.rpc.Stub)api_paynowSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.paysbuy.apipaynow.Api_paynowSoap getApi_paynowSoap() {
    if (api_paynowSoap == null)
      _initApi_paynowSoapProxy();
    return api_paynowSoap;
  }
  
  public java.lang.String api_paynow_authentication(java.lang.String psbID, java.lang.String username, java.lang.String password, java.lang.String secureCode, java.lang.String inv, java.lang.String itm, double atm, java.lang.String curr_type, java.lang.String com, java.lang.String method, java.lang.String language, java.lang.String resp_front_url, java.lang.String resp_back_url) throws java.rmi.RemoteException{
    if (api_paynowSoap == null)
      _initApi_paynowSoapProxy();
    return api_paynowSoap.api_paynow_authentication(psbID, username, password, secureCode, inv, itm, atm, curr_type, com, method, language, resp_front_url, resp_back_url);
  }
  
  public java.lang.String api_paynow_authentication_new(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String inv, java.lang.String itm, double amt, java.lang.String paypal_amt, java.lang.String curr_type, java.lang.String com, java.lang.String method, java.lang.String language, java.lang.String resp_front_url, java.lang.String resp_back_url, java.lang.String opt_fix_redirect, java.lang.String opt_fix_method, java.lang.String opt_name, java.lang.String opt_email, java.lang.String opt_mobile, java.lang.String opt_address, java.lang.String opt_detail) throws java.rmi.RemoteException{
    if (api_paynowSoap == null)
      _initApi_paynowSoapProxy();
    return api_paynowSoap.api_paynow_authentication_new(psbID, username, secureCode, inv, itm, amt, paypal_amt, curr_type, com, method, language, resp_front_url, resp_back_url, opt_fix_redirect, opt_fix_method, opt_name, opt_email, opt_mobile, opt_address, opt_detail);
  }
  
  public java.lang.String ws_check_apCode(java.lang.String refid, java.lang.String apCode, java.lang.String inv) throws java.rmi.RemoteException{
    if (api_paynowSoap == null)
      _initApi_paynowSoapProxy();
    return api_paynowSoap.ws_check_apCode(refid, apCode, inv);
  }
  
  public java.lang.String api_paynow_ob(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String bank, java.lang.String inv, java.lang.String itm, double amt, java.lang.String language, java.lang.String resp_front_url, java.lang.String resp_back_url, java.lang.String opt_name, java.lang.String opt_email, java.lang.String opt_mobile, java.lang.String opt_address, java.lang.String opt_detail) throws java.rmi.RemoteException{
    if (api_paynowSoap == null)
      _initApi_paynowSoapProxy();
    return api_paynowSoap.api_paynow_ob(psbID, username, secureCode, bank, inv, itm, amt, language, resp_front_url, resp_back_url, opt_name, opt_email, opt_mobile, opt_address, opt_detail);
  }
  
  public java.lang.String api_paynow_authentication_v3(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String inv, java.lang.String itm, double amt, java.lang.String paypal_amt, java.lang.String curr_type, java.lang.String com, java.lang.String method, java.lang.String language, java.lang.String resp_front_url, java.lang.String resp_back_url, java.lang.String opt_fix_redirect, java.lang.String opt_fix_method, java.lang.String opt_name, java.lang.String opt_email, java.lang.String opt_mobile, java.lang.String opt_address, java.lang.String opt_detail, java.lang.String opt_param) throws java.rmi.RemoteException{
    if (api_paynowSoap == null)
      _initApi_paynowSoapProxy();
    return api_paynowSoap.api_paynow_authentication_v3(psbID, username, secureCode, inv, itm, amt, paypal_amt, curr_type, com, method, language, resp_front_url, resp_back_url, opt_fix_redirect, opt_fix_method, opt_name, opt_email, opt_mobile, opt_address, opt_detail, opt_param);
  }
  
  public com.paysbuy.apipaynow.ReturnMobileCreditCard[] api_paynow_mobile_creditcard(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String inv, java.lang.String itm, double amt, java.lang.String mobileNo, java.lang.String resp_front_url, java.lang.String resp_back_url, java.lang.String opt_name, java.lang.String opt_email, java.lang.String opt_detail, java.lang.String opt_param) throws java.rmi.RemoteException{
    if (api_paynowSoap == null)
      _initApi_paynowSoapProxy();
    return api_paynowSoap.api_paynow_mobile_creditcard(psbID, username, secureCode, inv, itm, amt, mobileNo, resp_front_url, resp_back_url, opt_name, opt_email, opt_detail, opt_param);
  }
  
  
}