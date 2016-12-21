/**
 * GetCCnoReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paysbuy.psbws;

public class GetCCnoReturn  implements java.io.Serializable {
    private java.lang.String desc;

    private java.lang.String CCNO1;

    private java.lang.String CCNO2;

    private java.lang.String CCNO3;

    private java.lang.String CCNO4;

    private java.lang.String CCNO5;

    public GetCCnoReturn() {
    }

    public GetCCnoReturn(
           java.lang.String desc,
           java.lang.String CCNO1,
           java.lang.String CCNO2,
           java.lang.String CCNO3,
           java.lang.String CCNO4,
           java.lang.String CCNO5) {
           this.desc = desc;
           this.CCNO1 = CCNO1;
           this.CCNO2 = CCNO2;
           this.CCNO3 = CCNO3;
           this.CCNO4 = CCNO4;
           this.CCNO5 = CCNO5;
    }


    /**
     * Gets the desc value for this GetCCnoReturn.
     * 
     * @return desc
     */
    public java.lang.String getDesc() {
        return desc;
    }


    /**
     * Sets the desc value for this GetCCnoReturn.
     * 
     * @param desc
     */
    public void setDesc(java.lang.String desc) {
        this.desc = desc;
    }


    /**
     * Gets the CCNO1 value for this GetCCnoReturn.
     * 
     * @return CCNO1
     */
    public java.lang.String getCCNO1() {
        return CCNO1;
    }


    /**
     * Sets the CCNO1 value for this GetCCnoReturn.
     * 
     * @param CCNO1
     */
    public void setCCNO1(java.lang.String CCNO1) {
        this.CCNO1 = CCNO1;
    }


    /**
     * Gets the CCNO2 value for this GetCCnoReturn.
     * 
     * @return CCNO2
     */
    public java.lang.String getCCNO2() {
        return CCNO2;
    }


    /**
     * Sets the CCNO2 value for this GetCCnoReturn.
     * 
     * @param CCNO2
     */
    public void setCCNO2(java.lang.String CCNO2) {
        this.CCNO2 = CCNO2;
    }


    /**
     * Gets the CCNO3 value for this GetCCnoReturn.
     * 
     * @return CCNO3
     */
    public java.lang.String getCCNO3() {
        return CCNO3;
    }


    /**
     * Sets the CCNO3 value for this GetCCnoReturn.
     * 
     * @param CCNO3
     */
    public void setCCNO3(java.lang.String CCNO3) {
        this.CCNO3 = CCNO3;
    }


    /**
     * Gets the CCNO4 value for this GetCCnoReturn.
     * 
     * @return CCNO4
     */
    public java.lang.String getCCNO4() {
        return CCNO4;
    }


    /**
     * Sets the CCNO4 value for this GetCCnoReturn.
     * 
     * @param CCNO4
     */
    public void setCCNO4(java.lang.String CCNO4) {
        this.CCNO4 = CCNO4;
    }


    /**
     * Gets the CCNO5 value for this GetCCnoReturn.
     * 
     * @return CCNO5
     */
    public java.lang.String getCCNO5() {
        return CCNO5;
    }


    /**
     * Sets the CCNO5 value for this GetCCnoReturn.
     * 
     * @param CCNO5
     */
    public void setCCNO5(java.lang.String CCNO5) {
        this.CCNO5 = CCNO5;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCCnoReturn)) return false;
        GetCCnoReturn other = (GetCCnoReturn) obj;
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
            ((this.CCNO1==null && other.getCCNO1()==null) || 
             (this.CCNO1!=null &&
              this.CCNO1.equals(other.getCCNO1()))) &&
            ((this.CCNO2==null && other.getCCNO2()==null) || 
             (this.CCNO2!=null &&
              this.CCNO2.equals(other.getCCNO2()))) &&
            ((this.CCNO3==null && other.getCCNO3()==null) || 
             (this.CCNO3!=null &&
              this.CCNO3.equals(other.getCCNO3()))) &&
            ((this.CCNO4==null && other.getCCNO4()==null) || 
             (this.CCNO4!=null &&
              this.CCNO4.equals(other.getCCNO4()))) &&
            ((this.CCNO5==null && other.getCCNO5()==null) || 
             (this.CCNO5!=null &&
              this.CCNO5.equals(other.getCCNO5())));
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
        if (getCCNO1() != null) {
            _hashCode += getCCNO1().hashCode();
        }
        if (getCCNO2() != null) {
            _hashCode += getCCNO2().hashCode();
        }
        if (getCCNO3() != null) {
            _hashCode += getCCNO3().hashCode();
        }
        if (getCCNO4() != null) {
            _hashCode += getCCNO4().hashCode();
        }
        if (getCCNO5() != null) {
            _hashCode += getCCNO5().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCCnoReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "getCCnoReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CCNO1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CCNO1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CCNO2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CCNO2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CCNO3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CCNO3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CCNO4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CCNO4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CCNO5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CCNO5"));
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
