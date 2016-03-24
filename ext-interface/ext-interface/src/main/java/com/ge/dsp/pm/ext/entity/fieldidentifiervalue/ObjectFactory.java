
package com.ge.dsp.pm.ext.entity.fieldidentifiervalue;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.fieldidentifiervalue package. 
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

    private final static QName _FieldIdentifierValue_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/fieldidentifiervalue", "fieldIdentifierValue");
    private final static QName _FieldIdentifierObject_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/fieldidentifiervalue", "fieldIdentifierObject");
    private final static QName _FieldIdentifierValueList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/fieldidentifiervalue", "fieldIdentifierValueList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.fieldidentifiervalue
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FieldIdentifierValueList }
     * 
     */
    public FieldIdentifierValueList createFieldIdentifierValueList() {
        return new FieldIdentifierValueList();
    }

    /**
     * Create an instance of {@link FieldIdentifierObject }
     * 
     */
    public FieldIdentifierObject createFieldIdentifierObject() {
        return new FieldIdentifierObject();
    }

    /**
     * Create an instance of {@link FieldIdentifierValue }
     * 
     */
    public FieldIdentifierValue createFieldIdentifierValue() {
        return new FieldIdentifierValue();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldIdentifierValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/fieldidentifiervalue", name = "fieldIdentifierValue")
    public JAXBElement<FieldIdentifierValue> createFieldIdentifierValue(FieldIdentifierValue value) {
        return new JAXBElement<FieldIdentifierValue>(_FieldIdentifierValue_QNAME, FieldIdentifierValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldIdentifierObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/fieldidentifiervalue", name = "fieldIdentifierObject")
    public JAXBElement<FieldIdentifierObject> createFieldIdentifierObject(FieldIdentifierObject value) {
        return new JAXBElement<FieldIdentifierObject>(_FieldIdentifierObject_QNAME, FieldIdentifierObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldIdentifierValueList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/fieldidentifiervalue", name = "fieldIdentifierValueList")
    public JAXBElement<FieldIdentifierValueList> createFieldIdentifierValueList(FieldIdentifierValueList value) {
        return new JAXBElement<FieldIdentifierValueList>(_FieldIdentifierValueList_QNAME, FieldIdentifierValueList.class, null, value);
    }

}
