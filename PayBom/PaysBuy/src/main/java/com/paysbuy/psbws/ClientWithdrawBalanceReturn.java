/**
 * ClientWithdrawBalanceReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paysbuy.psbws;

public class ClientWithdrawBalanceReturn  implements java.io.Serializable {
    private java.lang.String withdrawBalance;

    public ClientWithdrawBalanceReturn() {
    }

    public ClientWithdrawBalanceReturn(
           java.lang.String withdrawBalance) {
           this.withdrawBalance = withdrawBalance;
    }


    /**
     * Gets the withdrawBalance value for this ClientWithdrawBalanceReturn.
     * 
     * @return withdrawBalance
     */
    public java.lang.String getWithdrawBalance() {
        return withdrawBalance;
    }


    /**
     * Sets the withdrawBalance value for this ClientWithdrawBalanceReturn.
     * 
     * @param withdrawBalance
     */
    public void setWithdrawBalance(java.lang.String withdrawBalance) {
        this.withdrawBalance = withdrawBalance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClientWithdrawBalanceReturn)) return false;
        ClientWithdrawBalanceReturn other = (ClientWithdrawBalanceReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.withdrawBalance==null && other.getWithdrawBalance()==null) || 
             (this.withdrawBalance!=null &&
              this.withdrawBalance.equals(other.getWithdrawBalance())));
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
        if (getWithdrawBalance() != null) {
            _hashCode += getWithdrawBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClientWithdrawBalanceReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ClientWithdrawBalanceReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("withdrawBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "withdrawBalance"));
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
