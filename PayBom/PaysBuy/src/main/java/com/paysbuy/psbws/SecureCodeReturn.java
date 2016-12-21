/**
 * SecureCodeReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paysbuy.psbws;

public class SecureCodeReturn  implements java.io.Serializable {
    private boolean authen;

    private java.lang.String msg;

    private java.lang.String secureCode;

    private java.lang.String shopname;

    public SecureCodeReturn() {
    }

    public SecureCodeReturn(
           boolean authen,
           java.lang.String msg,
           java.lang.String secureCode,
           java.lang.String shopname) {
           this.authen = authen;
           this.msg = msg;
           this.secureCode = secureCode;
           this.shopname = shopname;
    }


    /**
     * Gets the authen value for this SecureCodeReturn.
     * 
     * @return authen
     */
    public boolean isAuthen() {
        return authen;
    }


    /**
     * Sets the authen value for this SecureCodeReturn.
     * 
     * @param authen
     */
    public void setAuthen(boolean authen) {
        this.authen = authen;
    }


    /**
     * Gets the msg value for this SecureCodeReturn.
     * 
     * @return msg
     */
    public java.lang.String getMsg() {
        return msg;
    }


    /**
     * Sets the msg value for this SecureCodeReturn.
     * 
     * @param msg
     */
    public void setMsg(java.lang.String msg) {
        this.msg = msg;
    }


    /**
     * Gets the secureCode value for this SecureCodeReturn.
     * 
     * @return secureCode
     */
    public java.lang.String getSecureCode() {
        return secureCode;
    }


    /**
     * Sets the secureCode value for this SecureCodeReturn.
     * 
     * @param secureCode
     */
    public void setSecureCode(java.lang.String secureCode) {
        this.secureCode = secureCode;
    }


    /**
     * Gets the shopname value for this SecureCodeReturn.
     * 
     * @return shopname
     */
    public java.lang.String getShopname() {
        return shopname;
    }


    /**
     * Sets the shopname value for this SecureCodeReturn.
     * 
     * @param shopname
     */
    public void setShopname(java.lang.String shopname) {
        this.shopname = shopname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecureCodeReturn)) return false;
        SecureCodeReturn other = (SecureCodeReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.authen == other.isAuthen() &&
            ((this.msg==null && other.getMsg()==null) || 
             (this.msg!=null &&
              this.msg.equals(other.getMsg()))) &&
            ((this.secureCode==null && other.getSecureCode()==null) || 
             (this.secureCode!=null &&
              this.secureCode.equals(other.getSecureCode()))) &&
            ((this.shopname==null && other.getShopname()==null) || 
             (this.shopname!=null &&
              this.shopname.equals(other.getShopname())));
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
        _hashCode += (isAuthen() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMsg() != null) {
            _hashCode += getMsg().hashCode();
        }
        if (getSecureCode() != null) {
            _hashCode += getSecureCode().hashCode();
        }
        if (getShopname() != null) {
            _hashCode += getShopname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecureCodeReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "secureCodeReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "authen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "msg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secureCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "secureCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "shopname"));
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
