/**
 * GetTransactionDetailByInvoiceReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paysbuy.psbws;

public class GetTransactionDetailByInvoiceReturn  implements java.io.Serializable {
    private java.lang.String result;

    private java.lang.String invoice;

    private java.lang.String apCode;

    private java.lang.String amt;

    private java.lang.String fee;

    private java.lang.String method;

    private java.lang.String desc;

    private java.lang.String create_date;

    private java.lang.String payment_date;

    private java.lang.String exchange_rate;

    public GetTransactionDetailByInvoiceReturn() {
    }

    public GetTransactionDetailByInvoiceReturn(
           java.lang.String result,
           java.lang.String invoice,
           java.lang.String apCode,
           java.lang.String amt,
           java.lang.String fee,
           java.lang.String method,
           java.lang.String desc,
           java.lang.String create_date,
           java.lang.String payment_date,
           java.lang.String exchange_rate) {
           this.result = result;
           this.invoice = invoice;
           this.apCode = apCode;
           this.amt = amt;
           this.fee = fee;
           this.method = method;
           this.desc = desc;
           this.create_date = create_date;
           this.payment_date = payment_date;
           this.exchange_rate = exchange_rate;
    }


    /**
     * Gets the result value for this GetTransactionDetailByInvoiceReturn.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this GetTransactionDetailByInvoiceReturn.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the invoice value for this GetTransactionDetailByInvoiceReturn.
     * 
     * @return invoice
     */
    public java.lang.String getInvoice() {
        return invoice;
    }


    /**
     * Sets the invoice value for this GetTransactionDetailByInvoiceReturn.
     * 
     * @param invoice
     */
    public void setInvoice(java.lang.String invoice) {
        this.invoice = invoice;
    }


    /**
     * Gets the apCode value for this GetTransactionDetailByInvoiceReturn.
     * 
     * @return apCode
     */
    public java.lang.String getApCode() {
        return apCode;
    }


    /**
     * Sets the apCode value for this GetTransactionDetailByInvoiceReturn.
     * 
     * @param apCode
     */
    public void setApCode(java.lang.String apCode) {
        this.apCode = apCode;
    }


    /**
     * Gets the amt value for this GetTransactionDetailByInvoiceReturn.
     * 
     * @return amt
     */
    public java.lang.String getAmt() {
        return amt;
    }


    /**
     * Sets the amt value for this GetTransactionDetailByInvoiceReturn.
     * 
     * @param amt
     */
    public void setAmt(java.lang.String amt) {
        this.amt = amt;
    }


    /**
     * Gets the fee value for this GetTransactionDetailByInvoiceReturn.
     * 
     * @return fee
     */
    public java.lang.String getFee() {
        return fee;
    }


    /**
     * Sets the fee value for this GetTransactionDetailByInvoiceReturn.
     * 
     * @param fee
     */
    public void setFee(java.lang.String fee) {
        this.fee = fee;
    }


    /**
     * Gets the method value for this GetTransactionDetailByInvoiceReturn.
     * 
     * @return method
     */
    public java.lang.String getMethod() {
        return method;
    }


    /**
     * Sets the method value for this GetTransactionDetailByInvoiceReturn.
     * 
     * @param method
     */
    public void setMethod(java.lang.String method) {
        this.method = method;
    }


    /**
     * Gets the desc value for this GetTransactionDetailByInvoiceReturn.
     * 
     * @return desc
     */
    public java.lang.String getDesc() {
        return desc;
    }


    /**
     * Sets the desc value for this GetTransactionDetailByInvoiceReturn.
     * 
     * @param desc
     */
    public void setDesc(java.lang.String desc) {
        this.desc = desc;
    }


    /**
     * Gets the create_date value for this GetTransactionDetailByInvoiceReturn.
     * 
     * @return create_date
     */
    public java.lang.String getCreate_date() {
        return create_date;
    }


    /**
     * Sets the create_date value for this GetTransactionDetailByInvoiceReturn.
     * 
     * @param create_date
     */
    public void setCreate_date(java.lang.String create_date) {
        this.create_date = create_date;
    }


    /**
     * Gets the payment_date value for this GetTransactionDetailByInvoiceReturn.
     * 
     * @return payment_date
     */
    public java.lang.String getPayment_date() {
        return payment_date;
    }


    /**
     * Sets the payment_date value for this GetTransactionDetailByInvoiceReturn.
     * 
     * @param payment_date
     */
    public void setPayment_date(java.lang.String payment_date) {
        this.payment_date = payment_date;
    }


    /**
     * Gets the exchange_rate value for this GetTransactionDetailByInvoiceReturn.
     * 
     * @return exchange_rate
     */
    public java.lang.String getExchange_rate() {
        return exchange_rate;
    }


    /**
     * Sets the exchange_rate value for this GetTransactionDetailByInvoiceReturn.
     * 
     * @param exchange_rate
     */
    public void setExchange_rate(java.lang.String exchange_rate) {
        this.exchange_rate = exchange_rate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTransactionDetailByInvoiceReturn)) return false;
        GetTransactionDetailByInvoiceReturn other = (GetTransactionDetailByInvoiceReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.invoice==null && other.getInvoice()==null) || 
             (this.invoice!=null &&
              this.invoice.equals(other.getInvoice()))) &&
            ((this.apCode==null && other.getApCode()==null) || 
             (this.apCode!=null &&
              this.apCode.equals(other.getApCode()))) &&
            ((this.amt==null && other.getAmt()==null) || 
             (this.amt!=null &&
              this.amt.equals(other.getAmt()))) &&
            ((this.fee==null && other.getFee()==null) || 
             (this.fee!=null &&
              this.fee.equals(other.getFee()))) &&
            ((this.method==null && other.getMethod()==null) || 
             (this.method!=null &&
              this.method.equals(other.getMethod()))) &&
            ((this.desc==null && other.getDesc()==null) || 
             (this.desc!=null &&
              this.desc.equals(other.getDesc()))) &&
            ((this.create_date==null && other.getCreate_date()==null) || 
             (this.create_date!=null &&
              this.create_date.equals(other.getCreate_date()))) &&
            ((this.payment_date==null && other.getPayment_date()==null) || 
             (this.payment_date!=null &&
              this.payment_date.equals(other.getPayment_date()))) &&
            ((this.exchange_rate==null && other.getExchange_rate()==null) || 
             (this.exchange_rate!=null &&
              this.exchange_rate.equals(other.getExchange_rate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getInvoice() != null) {
            _hashCode += getInvoice().hashCode();
        }
        if (getApCode() != null) {
            _hashCode += getApCode().hashCode();
        }
        if (getAmt() != null) {
            _hashCode += getAmt().hashCode();
        }
        if (getFee() != null) {
            _hashCode += getFee().hashCode();
        }
        if (getMethod() != null) {
            _hashCode += getMethod().hashCode();
        }
        if (getDesc() != null) {
            _hashCode += getDesc().hashCode();
        }
        if (getCreate_date() != null) {
            _hashCode += getCreate_date().hashCode();
        }
        if (getPayment_date() != null) {
            _hashCode += getPayment_date().hashCode();
        }
        if (getExchange_rate() != null) {
            _hashCode += getExchange_rate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTransactionDetailByInvoiceReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "getTransactionDetailByInvoiceReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Invoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "apCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "amt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("method");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "create_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "payment_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchange_rate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "exchange_rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
