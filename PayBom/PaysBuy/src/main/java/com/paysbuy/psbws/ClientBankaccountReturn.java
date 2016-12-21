/**
 * ClientBankaccountReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paysbuy.psbws;

public class ClientBankaccountReturn  implements java.io.Serializable {
    private java.lang.String desc;

    private java.lang.String ACCNO1;

    private java.lang.String ACCNO2;

    private java.lang.String ACCNO3;

    private java.lang.String ACCNO4;

    private java.lang.String ACCNO5;

    public ClientBankaccountReturn() {
    }

    public ClientBankaccountReturn(
           java.lang.String desc,
           java.lang.String ACCNO1,
           java.lang.String ACCNO2,
           java.lang.String ACCNO3,
           java.lang.String ACCNO4,
           java.lang.String ACCNO5) {
           this.desc = desc;
           this.ACCNO1 = ACCNO1;
           this.ACCNO2 = ACCNO2;
           this.ACCNO3 = ACCNO3;
           this.ACCNO4 = ACCNO4;
           this.ACCNO5 = ACCNO5;
    }


    /**
     * Gets the desc value for this ClientBankaccountReturn.
     * 
     * @return desc
     */
    public java.lang.String getDesc() {
        return desc;
    }


    /**
     * Sets the desc value for this ClientBankaccountReturn.
     * 
     * @param desc
     */
    public void setDesc(java.lang.String desc) {
        this.desc = desc;
    }


    /**
     * Gets the ACCNO1 value for this ClientBankaccountReturn.
     * 
     * @return ACCNO1
     */
    public java.lang.String getACCNO1() {
        return ACCNO1;
    }


    /**
     * Sets the ACCNO1 value for this ClientBankaccountReturn.
     * 
     * @param ACCNO1
     */
    public void setACCNO1(java.lang.String ACCNO1) {
        this.ACCNO1 = ACCNO1;
    }


    /**
     * Gets the ACCNO2 value for this ClientBankaccountReturn.
     * 
     * @return ACCNO2
     */
    public java.lang.String getACCNO2() {
        return ACCNO2;
    }


    /**
     * Sets the ACCNO2 value for this ClientBankaccountReturn.
     * 
     * @param ACCNO2
     */
    public void setACCNO2(java.lang.String ACCNO2) {
        this.ACCNO2 = ACCNO2;
    }


    /**
     * Gets the ACCNO3 value for this ClientBankaccountReturn.
     * 
     * @return ACCNO3
     */
    public java.lang.String getACCNO3() {
        return ACCNO3;
    }


    /**
     * Sets the ACCNO3 value for this ClientBankaccountReturn.
     * 
     * @param ACCNO3
     */
    public void setACCNO3(java.lang.String ACCNO3) {
        this.ACCNO3 = ACCNO3;
    }


    /**
     * Gets the ACCNO4 value for this ClientBankaccountReturn.
     * 
     * @return ACCNO4
     */
    public java.lang.String getACCNO4() {
        return ACCNO4;
    }


    /**
     * Sets the ACCNO4 value for this ClientBankaccountReturn.
     * 
     * @param ACCNO4
     */
    public void setACCNO4(java.lang.String ACCNO4) {
        this.ACCNO4 = ACCNO4;
    }


    /**
     * Gets the ACCNO5 value for this ClientBankaccountReturn.
     * 
     * @return ACCNO5
     */
    public java.lang.String getACCNO5() {
        return ACCNO5;
    }


    /**
     * Sets the ACCNO5 value for this ClientBankaccountReturn.
     * 
     * @param ACCNO5
     */
    public void setACCNO5(java.lang.String ACCNO5) {
        this.ACCNO5 = ACCNO5;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClientBankaccountReturn)) return false;
        ClientBankaccountReturn other = (ClientBankaccountReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.desc==null && other.getDesc()==null) || 
             (this.desc!=null &&
              this.desc.equals(other.getDesc()))) &&
            ((this.ACCNO1==null && other.getACCNO1()==null) || 
             (this.ACCNO1!=null &&
              this.ACCNO1.equals(other.getACCNO1()))) &&
            ((this.ACCNO2==null && other.getACCNO2()==null) || 
             (this.ACCNO2!=null &&
              this.ACCNO2.equals(other.getACCNO2()))) &&
            ((this.ACCNO3==null && other.getACCNO3()==null) || 
             (this.ACCNO3!=null &&
              this.ACCNO3.equals(other.getACCNO3()))) &&
            ((this.ACCNO4==null && other.getACCNO4()==null) || 
             (this.ACCNO4!=null &&
              this.ACCNO4.equals(other.getACCNO4()))) &&
            ((this.ACCNO5==null && other.getACCNO5()==null) || 
             (this.ACCNO5!=null &&
              this.ACCNO5.equals(other.getACCNO5())));
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
        if (getDesc() != null) {
            _hashCode += getDesc().hashCode();
        }
        if (getACCNO1() != null) {
            _hashCode += getACCNO1().hashCode();
        }
        if (getACCNO2() != null) {
            _hashCode += getACCNO2().hashCode();
        }
        if (getACCNO3() != null) {
            _hashCode += getACCNO3().hashCode();
        }
        if (getACCNO4() != null) {
            _hashCode += getACCNO4().hashCode();
        }
        if (getACCNO5() != null) {
            _hashCode += getACCNO5().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClientBankaccountReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ClientBankaccountReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCNO1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ACCNO1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCNO2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ACCNO2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCNO3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ACCNO3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCNO4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ACCNO4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCNO5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ACCNO5"));
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
