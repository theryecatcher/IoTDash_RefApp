//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 02:16:50 AM PST 
//


package com.ge.dsp.pm.solution.service.entity.fieldchanged;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.solution.service.entity.fieldchanged package. 
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

    private final static QName _FieldChangedList_QNAME = new QName("http://dsp.ge.com/pm/solution/service/entity/fieldchanged", "fieldChangedList");
    private final static QName _FieldChanged_QNAME = new QName("http://dsp.ge.com/pm/solution/service/entity/fieldchanged", "fieldChanged");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.solution.service.entity.fieldchanged
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FieldChangedList }
     * 
     */
    public FieldChangedList createFieldChangedList() {
        return new FieldChangedList();
    }

    /**
     * Create an instance of {@link FieldChanged }
     * 
     */
    public FieldChanged createFieldChanged() {
        return new FieldChanged();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldChangedList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/solution/service/entity/fieldchanged", name = "fieldChangedList")
    public JAXBElement<FieldChangedList> createFieldChangedList(FieldChangedList value) {
        return new JAXBElement<FieldChangedList>(_FieldChangedList_QNAME, FieldChangedList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldChanged }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/solution/service/entity/fieldchanged", name = "fieldChanged")
    public JAXBElement<FieldChanged> createFieldChanged(FieldChanged value) {
        return new JAXBElement<FieldChanged>(_FieldChanged_QNAME, FieldChanged.class, null, value);
    }

}
