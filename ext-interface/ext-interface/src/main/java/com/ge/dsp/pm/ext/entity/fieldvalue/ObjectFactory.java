
package com.ge.dsp.pm.ext.entity.fieldvalue;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.fieldvalue package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FieldValue_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/fieldvalue", "fieldValue");
    private final static QName _FieldValueList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/fieldvalue", "fieldValueList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.fieldvalue
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FieldValueList }
     * 
     */
    public FieldValueList createFieldValueList() {
        return new FieldValueList();
    }

    /**
     * Create an instance of {@link FieldValue }
     * 
     */
    public FieldValue createFieldValue() {
        return new FieldValue();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/fieldvalue", name = "fieldValue")
    public JAXBElement<FieldValue> createFieldValue(FieldValue value) {
        return new JAXBElement<FieldValue>(_FieldValue_QNAME, FieldValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldValueList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/fieldvalue", name = "fieldValueList")
    public JAXBElement<FieldValueList> createFieldValueList(FieldValueList value) {
        return new JAXBElement<FieldValueList>(_FieldValueList_QNAME, FieldValueList.class, null, value);
    }

}
