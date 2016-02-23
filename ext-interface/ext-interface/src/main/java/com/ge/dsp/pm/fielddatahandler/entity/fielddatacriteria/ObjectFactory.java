
package com.ge.dsp.pm.fielddatahandler.entity.fielddatacriteria;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.fielddatahandler.entity.fielddatacriteria package. 
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

    private final static QName _FieldDataCriteriaList_QNAME = new QName("http://dsp.ge.com/pm/fielddatahandler/entity/fielddatacriteria", "fieldDataCriteriaList");
    private final static QName _FieldDataCriteria_QNAME = new QName("http://dsp.ge.com/pm/fielddatahandler/entity/fielddatacriteria", "fieldDataCriteria");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.fielddatahandler.entity.fielddatacriteria
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FieldDataCriteria }
     * 
     */
    public FieldDataCriteria createFieldDataCriteria() {
        return new FieldDataCriteria();
    }

    /**
     * Create an instance of {@link FieldDataCriteriaList }
     * 
     */
    public FieldDataCriteriaList createFieldDataCriteriaList() {
        return new FieldDataCriteriaList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldDataCriteriaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/fielddatahandler/entity/fielddatacriteria", name = "fieldDataCriteriaList")
    public JAXBElement<FieldDataCriteriaList> createFieldDataCriteriaList(FieldDataCriteriaList value) {
        return new JAXBElement<FieldDataCriteriaList>(_FieldDataCriteriaList_QNAME, FieldDataCriteriaList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldDataCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/fielddatahandler/entity/fielddatacriteria", name = "fieldDataCriteria")
    public JAXBElement<FieldDataCriteria> createFieldDataCriteria(FieldDataCriteria value) {
        return new JAXBElement<FieldDataCriteria>(_FieldDataCriteria_QNAME, FieldDataCriteria.class, null, value);
    }

}
