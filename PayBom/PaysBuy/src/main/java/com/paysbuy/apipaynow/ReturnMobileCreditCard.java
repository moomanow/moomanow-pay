/**
 * ReturnMobileCreditCard.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paysbuy.apipaynow;

public class ReturnMobileCreditCard  implements java.io.Serializable {
    private java.lang.String respCode;

    private java.lang.String respMessage;

    private java.lang.String bankTrxId;

    private java.lang.String inv;

    public ReturnMobileCreditCard() {
    }

    public ReturnMobileCreditCard(
           java.lang.String respCode,
           java.lang.String respMessage,
           java.lang.String bankTrxId,
           java.lang.String inv) {
           this.respCode = respCode;
           this.respMessage = respMessage;
           this.bankTrxId = bankTrxId;
           this.inv = inv;
    }


    /**
     * Gets the respCode value for this ReturnMobileCreditCard.
     * 
     * @return respCode
     */
    public java.lang.String getRespCode() {
        return respCode;
    }


    /**
     * Sets the respCode value for this ReturnMobileCreditCard.
     * 
     * @param respCode
     */
    public void setRespCode(java.lang.String respCode) {
        this.respCode = respCode;
    }


    /**
     * Gets the respMessage value for this ReturnMobileCreditCard.
     * 
     * @return respMessage
     */
    public java.lang.String getRespMessage() {
        return respMessage;
    }


    /**
     * Sets the respMessage value for this ReturnMobileCreditCard.
     * 
     * @param respMessage
     */
    public void setRespMessage(java.lang.String respMessage) {
        this.respMessage = respMessage;
    }


    /**
     * Gets the bankTrxId value for this ReturnMobileCreditCard.
     * 
     * @return bankTrxId
     */
    public java.lang.String getBankTrxId() {
        return bankTrxId;
    }


    /**
     * Sets the bankTrxId value for this ReturnMobileCreditCard.
     * 
     * @param bankTrxId
     */
    public void setBankTrxId(java.lang.String bankTrxId) {
        this.bankTrxId = bankTrxId;
    }


    /**
     * Gets the inv value for this ReturnMobileCreditCard.
     * 
     * @return inv
     */
    public java.lang.String getInv() {
        return inv;
    }


    /**
     * Sets the inv value for this ReturnMobileCreditCard.
     * 
     * @param inv
     */
    public void setInv(java.lang.String inv) {
        this.inv = inv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReturnMobileCreditCard)) return false;
        ReturnMobileCreditCard other = (ReturnMobileCreditCard) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.respCode==null && other.getRespCode()==null) || 
             (this.respCode!=null &&
              this.respCode.equals(other.getRespCode()))) &&
            ((this.respMessage==null && other.getRespMessage()==null) || 
             (this.respMessage!=null &&
              this.respMessage.equals(other.getRespMessage()))) &&
            ((this.bankTrxId==null && other.getBankTrxId()==null) || 
             (this.bankTrxId!=null &&
              this.bankTrxId.equals(other.getBankTrxId()))) &&
            ((this.inv==null && other.getInv()==null) || 
             (this.inv!=null &&
              this.inv.equals(other.getInv())));
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
        if (getRespCode() != null) {
            _hashCode += getRespCode().hashCode();
        }
        if (getRespMessage() != null) {
            _hashCode += getRespMessage().hashCode();
        }
        if (getBankTrxId() != null) {
            _hashCode += getBankTrxId().hashCode();
        }
        if (getInv() != null) {
            _hashCode += getInv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReturnMobileCreditCard.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnMobileCreditCard"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "respCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "respMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankTrxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "bankTrxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "inv"));
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
