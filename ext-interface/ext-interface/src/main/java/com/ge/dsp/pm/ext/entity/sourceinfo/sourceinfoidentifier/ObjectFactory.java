
package com.ge.dsp.pm.ext.entity.sourceinfo.sourceinfoidentifier;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.sourceinfo.sourceinfoidentifier package. 
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

    private final static QName _SourceInfoIdentifier_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/sourceinfo/sourceinfoidentifier", "sourceInfoIdentifier");
    private final static QName _SourceInfoIdentifierList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/sourceinfo/sourceinfoidentifier", "sourceInfoIdentifierList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.sourceinfo.sourceinfoidentifier
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SourceInfoIdentifier }
     * 
     */
    public SourceInfoIdentifier createSourceInfoIdentifier() {
        return new SourceInfoIdentifier();
    }

    /**
     * Create an instance of {@link SourceInfoIdentifierList }
     * 
     */
    public SourceInfoIdentifierList createSourceInfoIdentifierList() {
        return new SourceInfoIdentifierList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceInfoIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/sourceinfo/sourceinfoidentifier", name = "sourceInfoIdentifier")
    public JAXBElement<SourceInfoIdentifier> createSourceInfoIdentifier(SourceInfoIdentifier value) {
        return new JAXBElement<SourceInfoIdentifier>(_SourceInfoIdentifier_QNAME, SourceInfoIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceInfoIdentifierList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/sourceinfo/sourceinfoidentifier", name = "sourceInfoIdentifierList")
    public JAXBElement<SourceInfoIdentifierList> createSourceInfoIdentifierList(SourceInfoIdentifierList value) {
        return new JAXBElement<SourceInfoIdentifierList>(_SourceInfoIdentifierList_QNAME, SourceInfoIdentifierList.class, null, value);
    }

}
