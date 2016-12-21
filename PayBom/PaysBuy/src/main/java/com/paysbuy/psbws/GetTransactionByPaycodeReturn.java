/**
 * GetTransactionByPaycodeReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paysbuy.psbws;

public class GetTransactionByPaycodeReturn  implements java.io.Serializable {
    private java.lang.String result;

    private java.lang.String invoice;

    private java.lang.String apCode;

    private java.lang.String amt;

    private java.lang.String fee;

    private java.lang.String method;

    private java.lang.String date;

    private java.lang.String payCode;

    public GetTransactionByPaycodeReturn() {
    }

    public GetTransactionByPaycodeReturn(
           java.lang.String result,
           java.lang.String invoice,
           java.lang.String apCode,
           java.lang.String amt,
           java.lang.String fee,
           java.lang.String method,
           java.lang.String date,
           java.lang.String payCode) {
           this.result = result;
           this.invoice = invoice;
           this.apCode = apCode;
           this.amt = amt;
           this.fee = fee;
           this.method = method;
           this.date = date;
           this.payCode = payCode;
    }


    /**
     * Gets the result value for this GetTransactionByPaycodeReturn.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this GetTransactionByPaycodeReturn.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the invoice value for this GetTransactionByPaycodeReturn.
     * 
     * @return invoice
     */
    public java.lang.String getInvoice() {
        return invoice;
    }


    /**
     * Sets the invoice value for this GetTransactionByPaycodeReturn.
     * 
     * @param invoice
     */
    public void setInvoice(java.lang.String invoice) {
        this.invoice = invoice;
    }


    /**
     * Gets the apCode value for this GetTransactionByPaycodeReturn.
     * 
     * @return apCode
     */
    public java.lang.String getApCode() {
        return apCode;
    }


    /**
     * Sets the apCode value for this GetTransactionByPaycodeReturn.
     * 
     * @param apCode
     */
    public void setApCode(java.lang.String apCode) {
        this.apCode = apCode;
    }


    /**
     * Gets the amt value for this GetTransactionByPaycodeReturn.
     * 
     * @return amt
     */
    public java.lang.String getAmt() {
        return amt;
    }


    /**
     * Sets the amt value for this GetTransactionByPaycodeReturn.
     * 
     * @param amt
     */
    public void setAmt(java.lang.String amt) {
        this.amt = amt;
    }


    /**
     * Gets the fee value for this GetTransactionByPaycodeReturn.
     * 
     * @return fee
     */
    public java.lang.String getFee() {
        return fee;
    }


    /**
     * Sets the fee value for this GetTransactionByPaycodeReturn.
     * 
     * @param fee
     */
    public void setFee(java.lang.String fee) {
        this.fee = fee;
    }


    /**
     * Gets the method value for this GetTransactionByPaycodeReturn.
     * 
     * @return method
     */
    public java.lang.String getMethod() {
        return method;
    }


    /**
     * Sets the method value for this GetTransactionByPaycodeReturn.
     * 
     * @param method
     */
    public void setMethod(java.lang.String method) {
        this.method = method;
    }


    /**
     * Gets the date value for this GetTransactionByPaycodeReturn.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this GetTransactionByPaycodeReturn.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the payCode value for this GetTransactionByPaycodeReturn.
     * 
     * @return payCode
     */
    public java.lang.String getPayCode() {
        return payCode;
    }


    /**
     * Sets the payCode value for this GetTransactionByPaycodeReturn.
     * 
     * @param payCode
     */
    public void setPayCode(java.lang.String payCode) {
        this.payCode = payCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTransactionByPaycodeReturn)) return false;
        GetTransactionByPaycodeReturn other = (GetTransactionByPaycodeReturn) obj;
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
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.payCode==null && other.getPayCode()==null) || 
             (this.payCode!=null &&
              this.payCode.equals(other.getPayCode())));
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getPayCode() != null) {
            _hashCode += getPayCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTransactionByPaycodeReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "getTransactionByPaycodeReturn"));
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
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "payCode"));
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
