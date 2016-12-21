/**
 * Api_paynowSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paysbuy.apipaynow;

public interface Api_paynowSoap extends java.rmi.Remote {
    public java.lang.String api_paynow_authentication(java.lang.String psbID, java.lang.String username, java.lang.String password, java.lang.String secureCode, java.lang.String inv, java.lang.String itm, double atm, java.lang.String curr_type, java.lang.String com, java.lang.String method, java.lang.String language, java.lang.String resp_front_url, java.lang.String resp_back_url) throws java.rmi.RemoteException;

    /**
     * API PAYNOW Authentication AdditionalOption
     */
    public java.lang.String api_paynow_authentication_new(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String inv, java.lang.String itm, double amt, java.lang.String paypal_amt, java.lang.String curr_type, java.lang.String com, java.lang.String method, java.lang.String language, java.lang.String resp_front_url, java.lang.String resp_back_url, java.lang.String opt_fix_redirect, java.lang.String opt_fix_method, java.lang.String opt_name, java.lang.String opt_email, java.lang.String opt_mobile, java.lang.String opt_address, java.lang.String opt_detail) throws java.rmi.RemoteException;
    public java.lang.String ws_check_apCode(java.lang.String refid, java.lang.String apCode, java.lang.String inv) throws java.rmi.RemoteException;

    /**
     * API PAYNOW ONLINE BANKING
     */
    public java.lang.String api_paynow_ob(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String bank, java.lang.String inv, java.lang.String itm, double amt, java.lang.String language, java.lang.String resp_front_url, java.lang.String resp_back_url, java.lang.String opt_name, java.lang.String opt_email, java.lang.String opt_mobile, java.lang.String opt_address, java.lang.String opt_detail) throws java.rmi.RemoteException;

    /**
     * API PAYNOW ADDTIONAL PARAMETERS
     */
    public java.lang.String api_paynow_authentication_v3(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String inv, java.lang.String itm, double amt, java.lang.String paypal_amt, java.lang.String curr_type, java.lang.String com, java.lang.String method, java.lang.String language, java.lang.String resp_front_url, java.lang.String resp_back_url, java.lang.String opt_fix_redirect, java.lang.String opt_fix_method, java.lang.String opt_name, java.lang.String opt_email, java.lang.String opt_mobile, java.lang.String opt_address, java.lang.String opt_detail, java.lang.String opt_param) throws java.rmi.RemoteException;

    /**
     * API PAYNOW Mobile Credit Card
     */
    public com.paysbuy.apipaynow.ReturnMobileCreditCard[] api_paynow_mobile_creditcard(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String inv, java.lang.String itm, double amt, java.lang.String mobileNo, java.lang.String resp_front_url, java.lang.String resp_back_url, java.lang.String opt_name, java.lang.String opt_email, java.lang.String opt_detail, java.lang.String opt_param) throws java.rmi.RemoteException;
}
