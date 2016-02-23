
package com.ge.dsp.aaas.entity.identifier;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.aaas.entity.identifier package. 
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

    private final static QName _IdentifierList_QNAME = new QName("http://dsp.ge.com/aaas/entity/identifier", "identifierList");
    private final static QName _Identifier_QNAME = new QName("http://dsp.ge.com/aaas/entity/identifier", "identifier");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.aaas.entity.identifier
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Identifier }
     * 
     */
    public Identifier createIdentifier() {
        return new Identifier();
    }

    /**
     * Create an instance of {@link IdentifierList }
     * 
     */
    public IdentifierList createIdentifierList() {
        return new IdentifierList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifierList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/aaas/entity/identifier", name = "identifierList")
    public JAXBElement<IdentifierList> createIdentifierList(IdentifierList value) {
        return new JAXBElement<IdentifierList>(_IdentifierList_QNAME, IdentifierList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Identifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/aaas/entity/identifier", name = "identifier")
    public JAXBElement<Identifier> createIdentifier(Identifier value) {
        return new JAXBElement<Identifier>(_Identifier_QNAME, Identifier.class, null, value);
    }

}
