
package com.ge.dsp.pm.ext.entity.source;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.source package. 
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

    private final static QName _SourceType_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/source", "sourceType");
    private final static QName _SourceTypeList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/source", "sourceTypeList");
    private final static QName _Source_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/source", "source");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.source
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SourceTypeList }
     * 
     */
    public SourceTypeList createSourceTypeList() {
        return new SourceTypeList();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

    /**
     * Create an instance of {@link SourceType }
     * 
     */
    public SourceType createSourceType() {
        return new SourceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/source", name = "sourceType")
    public JAXBElement<SourceType> createSourceType(SourceType value) {
        return new JAXBElement<SourceType>(_SourceType_QNAME, SourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceTypeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/source", name = "sourceTypeList")
    public JAXBElement<SourceTypeList> createSourceTypeList(SourceTypeList value) {
        return new JAXBElement<SourceTypeList>(_SourceTypeList_QNAME, SourceTypeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Source }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/source", name = "source")
    public JAXBElement<Source> createSource(Source value) {
        return new JAXBElement<Source>(_Source_QNAME, Source.class, null, value);
    }

}
