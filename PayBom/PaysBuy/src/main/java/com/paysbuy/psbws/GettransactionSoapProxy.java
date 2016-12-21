package com.paysbuy.psbws;

public class GettransactionSoapProxy implements com.paysbuy.psbws.GettransactionSoap {
  private String _endpoint = null;
  private com.paysbuy.psbws.GettransactionSoap gettransactionSoap = null;
  
  public GettransactionSoapProxy() {
    _initGettransactionSoapProxy();
  }
  
  public GettransactionSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initGettransactionSoapProxy();
  }
  
  private void _initGettransactionSoapProxy() {
    try {
      gettransactionSoap = (new com.paysbuy.psbws.GettransactionLocator()).getgettransactionSoap();
      if (gettransactionSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)gettransactionSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)gettransactionSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (gettransactionSoap != null)
      ((javax.xml.rpc.Stub)gettransactionSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.paysbuy.psbws.GettransactionSoap getGettransactionSoap() {
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap;
  }
  
  public com.paysbuy.psbws.SecureCodeReturn[] getSecureCode(java.lang.String username, java.lang.String password, java.lang.String language) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getSecureCode(username, password, language);
  }
  
  public com.paysbuy.psbws.SendMoneyReturn[] getSendMoneyMethodAll(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String language, java.lang.String sendFromEmail, java.lang.String pincode, java.lang.String sendToEmail, java.lang.String amount, java.lang.String subject, java.lang.String note) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getSendMoneyMethodAll(psbID, username, secureCode, language, sendFromEmail, pincode, sendToEmail, amount, subject, note);
  }
  
  public com.paysbuy.psbws.SendMoneyReturn[] getSendMoneyMethod(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String language, java.lang.String sendToEmail, java.lang.String amount, java.lang.String subject, java.lang.String note, java.lang.String pincode) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getSendMoneyMethod(psbID, username, secureCode, language, sendToEmail, amount, subject, note, pincode);
  }
  
  public com.paysbuy.psbws.RequestMoneyReturn[] getRequestMoneyMethod(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String language, java.lang.String requestToEmail, java.lang.String amount, java.lang.String subject, java.lang.String note) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getRequestMoneyMethod(psbID, username, secureCode, language, requestToEmail, amount, subject, note);
  }
  
  public com.paysbuy.psbws.RequestMoneyReturn[] getRequestMoneyMethodAll(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String language, java.lang.String requestFromEmail, java.lang.String requestToEmail, java.lang.String amount, java.lang.String subject, java.lang.String note) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getRequestMoneyMethodAll(psbID, username, secureCode, language, requestFromEmail, requestToEmail, amount, subject, note);
  }
  
  public com.paysbuy.psbws.RequestMoneyReturn[] getRequestMoneyMethod_addInvoice(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String language, java.lang.String requestToEmail, java.lang.String invoice, java.lang.String amount, java.lang.String subject, java.lang.String note) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getRequestMoneyMethod_addInvoice(psbID, username, secureCode, language, requestToEmail, invoice, amount, subject, note);
  }
  
  public com.paysbuy.psbws.BalanceReturn[] getPSBBalance(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String useremail, java.lang.String language) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getPSBBalance(psbID, username, secureCode, useremail, language);
  }
  
  public com.paysbuy.psbws.UpdateStatusReturn[] updateStatusDelivery(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String transactionID) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.updateStatusDelivery(psbID, biz, secureCode, transactionID);
  }
  
  public com.paysbuy.psbws.GetTransactionByInvoiceReturn[] getTransactionByInvoice(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String invoice) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getTransactionByInvoice(psbID, biz, secureCode, invoice);
  }
  
  public com.paysbuy.psbws.IsCreditcardReturn[] isCreditCard(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String cardNumber) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.isCreditCard(psbID, biz, secureCode, cardNumber);
  }
  
  public com.paysbuy.psbws.IsPaySbuyReturn[] isPaySbuy(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String email) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.isPaySbuy(psbID, biz, secureCode, email);
  }
  
  public com.paysbuy.psbws.Sw_getTransactionByInvoiceReturn[] sw_getTransactionByInvoice(java.lang.String secureCode, java.lang.String biz, java.lang.String invoice, java.lang.String type) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.sw_getTransactionByInvoice(secureCode, biz, invoice, type);
  }
  
  public com.paysbuy.psbws.GetCurrencyReturn[] getCurrencyRate(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String currency) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getCurrencyRate(psbID, biz, secureCode, currency);
  }
  
  public com.paysbuy.psbws.Paynowresult[] getPaynow(java.lang.String psbID, java.lang.String payee, java.lang.String secureCode, java.lang.String payer, double amount, java.lang.String invoice, java.lang.String description, java.lang.String language) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getPaynow(psbID, payee, secureCode, payer, amount, invoice, description, language);
  }
  
  public com.paysbuy.psbws.ClientTransaction[] getAllTransaction(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String searchEmail, java.lang.String type, java.lang.String dateFrom, java.lang.String dateTo, java.lang.String start, java.lang.String limit, java.lang.String method, java.lang.String language) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getAllTransaction(psbID, username, secureCode, searchEmail, type, dateFrom, dateTo, start, limit, method, language);
  }
  
  public com.paysbuy.psbws.GetTransactionByTranlogIDReturn[] getTransactionByTranlogID(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String tranlogID) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getTransactionByTranlogID(psbID, biz, secureCode, tranlogID);
  }
  
  public com.paysbuy.psbws.GetTransactionByPaycodeReturn[] getTransactionByPaycode(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String paycode) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getTransactionByPaycode(psbID, biz, secureCode, paycode);
  }
  
  public com.paysbuy.psbws.GetTransactionBySlipDetailReturn[] getTransactionBySlipDetail(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String reference, java.lang.String amt) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getTransactionBySlipDetail(psbID, biz, secureCode, reference, amt);
  }
  
  public com.paysbuy.psbws.GetPostTranCountReturn[] getPostTranCount(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getPostTranCount(psbID, biz, secureCode);
  }
  
  public com.paysbuy.psbws.GetTransactionByInvoiceReturn[] getTransactionByInvoiceCheckPost(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String invoice, java.lang.String flag) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getTransactionByInvoiceCheckPost(psbID, biz, secureCode, invoice, flag);
  }
  
  public com.paysbuy.psbws.CheckPaysbuyEmailReturn[] checkPaysbuyEmail(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String email, java.lang.String TID) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.checkPaysbuyEmail(psbID, biz, secureCode, email, TID);
  }
  
  public com.paysbuy.psbws.GetTransactionDetailByInvoiceReturn[] getTransactionDetailByInvoice(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String invoice) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getTransactionDetailByInvoice(psbID, biz, secureCode, invoice);
  }
  
  public com.paysbuy.psbws.GetCCnoReturn[] getCCNO(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String user_login, java.lang.String language) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getCCNO(psbID, username, secureCode, user_login, language);
  }
  
  public com.paysbuy.psbws.ClientBankaccountReturn[] getBankaccount(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String user_login, java.lang.String language) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getBankaccount(psbID, username, secureCode, user_login, language);
  }
  
  public com.paysbuy.psbws.ClientWithdrawBalanceReturn[] getWithdrawBalance(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String user_login) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getWithdrawBalance(psbID, username, secureCode, user_login);
  }
  
  public com.paysbuy.psbws.ClientWithdrawReturn[] getWithdraw(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String user_login, java.lang.String user_pin, java.lang.String bankaccount, java.lang.String total_amount, java.lang.String language) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getWithdraw(psbID, username, secureCode, user_login, user_pin, bankaccount, total_amount, language);
  }
  
  public com.paysbuy.psbws.AddFundBYCCIDReturn addFundBYCCID(java.lang.String psbID, java.lang.String biz, java.lang.String secureCode, java.lang.String CCID, java.lang.String userPSBID, java.lang.String amount) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.addFundBYCCID(psbID, biz, secureCode, CCID, userPSBID, amount);
  }
  
  public com.paysbuy.psbws.ClientaddfundbankReturn[] addFundBankAuto(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String user_login, java.lang.String user_psbID, java.lang.String bank_id, java.lang.String amt, java.lang.String language) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.addFundBankAuto(psbID, username, secureCode, user_login, user_psbID, bank_id, amt, language);
  }
  
  public com.paysbuy.psbws.ClientaddfundbankWalletReturn[] addFundBankAutoWallet(java.lang.String psbID, java.lang.String username, java.lang.String secureCode, java.lang.String user_login, java.lang.String user_psbID, java.lang.String bank_id, java.lang.String amt, java.lang.String language) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.addFundBankAutoWallet(psbID, username, secureCode, user_login, user_psbID, bank_id, amt, language);
  }
  
  public com.paysbuy.psbws.Paynowvpcresult[] getPaynow_vpc(java.lang.String psbID, java.lang.String payee, java.lang.String secureCode, java.lang.String payer, double amount, java.lang.String invoice, java.lang.String description, java.lang.String language) throws java.rmi.RemoteException{
    if (gettransactionSoap == null)
      _initGettransactionSoapProxy();
    return gettransactionSoap.getPaynow_vpc(psbID, payee, secureCode, payer, amount, invoice, description, language);
  }
  
  
}