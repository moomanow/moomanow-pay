/**
 * GettransactionSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paysbuy.psbws;

public interface GettransactionSoap extends java.rmi.Remote {

    /**
     * PAYSBUY Authentication get secureCode
     */
    public com.paysbuy.psbws.SecureCodeReturn[] getSecureCode(java.lang.String username, java.lang.String password, java.lang.String language) throws java.rmi.RemoteException;

    /**
     * Get SendMoney Transaction All
     */
    public com.paysbuy.psbws.SendMoneyReturn[] getSendMoneyMethodAll(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String language, java.lang.String sendFromEmail, java.lang.String pincode, java.lang.String sendToEmail, java.lang.String amount, java.lang.String subject, java.lang.String note) throws java.rmi.RemoteException;

    /**
     * Get SendMoney Transaction
     */
    public com.paysbuy.psbws.SendMoneyReturn[] getSendMoneyMethod(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String language, java.lang.String sendToEmail, java.lang.String amount, java.lang.String subject, java.lang.String note, java.lang.String pincode) throws java.rmi.RemoteException;

    /**
     * Get RequestMoney Transaction
     */
    public com.paysbuy.psbws.RequestMoneyReturn[] getRequestMoneyMethod(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String language, java.lang.String requestToEmail, java.lang.String amount, java.lang.String subject, java.lang.String note) throws java.rmi.RemoteException;

    /**
     * Get RequestMoney Transaction All
     */
    public com.paysbuy.psbws.RequestMoneyReturn[] getRequestMoneyMethodAll(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String language, java.lang.String requestFromEmail, java.lang.String requestToEmail, java.lang.String amount, java.lang.String subject, java.lang.String note) throws java.rmi.RemoteException;

    /**
     * Get RequestMoney Transaction Additional Invoice
     */
    public com.paysbuy.psbws.RequestMoneyReturn[] getRequestMoneyMethod_addInvoice(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String language, java.lang.String requestToEmail, java.lang.String invoice, java.lang.String amount, java.lang.String subject, java.lang.String note) throws java.rmi.RemoteException;

    /**
     * Get PAYSBUY Balance
     */
    public com.paysbuy.psbws.BalanceReturn[] getPSBBalance(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String useremail, java.lang.String language) throws java.rmi.RemoteException;

    /**
     * Get PAYSBUY UpdateStatusDelivery
     */
    public com.paysbuy.psbws.UpdateStatusReturn[] updateStatusDelivery(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String transactionID) throws java.rmi.RemoteException;

    /**
     * Get PAYSBUY getTransactionByInvoice
     */
    public com.paysbuy.psbws.GetTransactionByInvoiceReturn[] getTransactionByInvoice(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String invoice) throws java.rmi.RemoteException;

    /**
     * Get PAYSBUY CheckCreditcard
     */
    public com.paysbuy.psbws.IsCreditcardReturn[] isCreditCard(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String cardNumber) throws java.rmi.RemoteException;

    /**
     * Get PAYSBUY CheckIsPaySbuy
     */
    public com.paysbuy.psbws.IsPaySbuyReturn[] isPaySbuy(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String email) throws java.rmi.RemoteException;

    /**
     * Get SW getTransactionByInvoice
     */
    public com.paysbuy.psbws.Sw_getTransactionByInvoiceReturn[] sw_getTransactionByInvoice(java.lang.String secureCode, java.lang.String biz, java.lang.String invoice, java.lang.String type) throws java.rmi.RemoteException;

    /**
     * Get PAYSBUY Currency Rate
     */
    public com.paysbuy.psbws.GetCurrencyReturn[] getCurrencyRate(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String currency) throws java.rmi.RemoteException;

    /**
     * Get Paynow Transaction
     */
    public com.paysbuy.psbws.Paynowresult[] getPaynow(java.lang.String psbID, java.lang.String payee, java.lang.String secureCode, java.lang.String payer, double amount, java.lang.String invoice, java.lang.String description, java.lang.String language) throws java.rmi.RemoteException;

    /**
     * Get All Transaction
     */
    public com.paysbuy.psbws.ClientTransaction[] getAllTransaction(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String searchEmail, java.lang.String type, java.lang.String dateFrom, java.lang.String dateTo, java.lang.String start, java.lang.String limit, java.lang.String method, java.lang.String language) throws java.rmi.RemoteException;

    /**
     * Get PAYSBUY getTransactionByTranlogID
     */
    public com.paysbuy.psbws.GetTransactionByTranlogIDReturn[] getTransactionByTranlogID(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String tranlogID) throws java.rmi.RemoteException;

    /**
     * Get PAYSBUY getTransactionByPaycode
     */
    public com.paysbuy.psbws.GetTransactionByPaycodeReturn[] getTransactionByPaycode(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String paycode) throws java.rmi.RemoteException;

    /**
     * Get PAYSBUY getTransactionBySlipDetail
     */
    public com.paysbuy.psbws.GetTransactionBySlipDetailReturn[] getTransactionBySlipDetail(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String reference, java.lang.String amt) throws java.rmi.RemoteException;

    /**
     * Get PAYSBUY Post Transaction Count
     */
    public com.paysbuy.psbws.GetPostTranCountReturn[] getPostTranCount(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode) throws java.rmi.RemoteException;

    /**
     * Get PAYSBUY getTransactionByInvoiceCheckPost
     */
    public com.paysbuy.psbws.GetTransactionByInvoiceReturn[] getTransactionByInvoiceCheckPost(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String invoice, java.lang.String flag) throws java.rmi.RemoteException;

    /**
     * Get PAYSBUY CheckPaySbuyEmail
     */
    public com.paysbuy.psbws.CheckPaysbuyEmailReturn[] checkPaysbuyEmail(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String email, java.lang.String TID) throws java.rmi.RemoteException;

    /**
     * Get PAYSBUY getTransactionDetailByInvoice
     */
    public com.paysbuy.psbws.GetTransactionDetailByInvoiceReturn[] getTransactionDetailByInvoice(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String invoice) throws java.rmi.RemoteException;

    /**
     * Get Credit Card Number
     */
    public com.paysbuy.psbws.GetCCnoReturn[] getCCNO(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String user_login, java.lang.String language) throws java.rmi.RemoteException;

    /**
     * Get Bank Account
     */
    public com.paysbuy.psbws.ClientBankaccountReturn[] getBankaccount(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String user_login, java.lang.String language) throws java.rmi.RemoteException;

    /**
     * Get Withdraw Balance
     */
    public com.paysbuy.psbws.ClientWithdrawBalanceReturn[] getWithdrawBalance(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String user_login) throws java.rmi.RemoteException;

    /**
     * Withdraw Money
     */
    public com.paysbuy.psbws.ClientWithdrawReturn[] getWithdraw(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String user_login, java.lang.String user_pin, java.lang.String bankaccount, java.lang.String total_amount, java.lang.String language) throws java.rmi.RemoteException;

    /**
     * Addfund By Member CCID
     */
    public com.paysbuy.psbws.AddFundBYCCIDReturn addFundBYCCID(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String CCID, java.lang.String userPSBID, java.lang.String amount) throws java.rmi.RemoteException;

    /**
     * Addfund BY Bank Auto
     */
    public com.paysbuy.psbws.ClientaddfundbankReturn[] addFundBankAuto(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String user_login, java.lang.String user_psbID, java.lang.String bank_id, java.lang.String amt, java.lang.String language) throws java.rmi.RemoteException;

    /**
     * Addfund BY Bank Auto
     */
    public com.paysbuy.psbws.ClientaddfundbankWalletReturn[] addFundBankAutoWallet(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String user_login, java.lang.String user_psbID, java.lang.String bank_id, java.lang.String amt, java.lang.String language) throws java.rmi.RemoteException;

    /**
     * Get Paynow Transaction
     */
    public com.paysbuy.psbws.Paynowvpcresult[] getPaynow_vpc(java.lang.String psbID, java.lang.String payee, java.lang.String secureCode, java.lang.String payer, double amount, java.lang.String invoice, java.lang.String description, java.lang.String language) throws java.rmi.RemoteException;
}
