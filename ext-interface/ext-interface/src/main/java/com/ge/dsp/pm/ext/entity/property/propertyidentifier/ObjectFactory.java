
package com.ge.dsp.pm.ext.entity.property.propertyidentifier;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.property.propertyidentifier package. 
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

    private final static QName _PropertyIdentifier_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/property/propertyidentifier", "propertyIdentifier");
    private final static QName _PropertyIdentifierList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/property/propertyidentifier", "propertyIdentifierList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.property.propertyidentifier
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PropertyIdentifierList }
     * 
     */
    public PropertyIdentifierList createPropertyIdentifierList() {
        return new PropertyIdentifierList();
    }

    /**
     * Create an instance of {@link PropertyIdentifier }
     * 
     */
    public PropertyIdentifier createPropertyIdentifier() {
        return new PropertyIdentifier();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/property/propertyidentifier", name = "propertyIdentifier")
    public JAXBElement<PropertyIdentifier> createPropertyIdentifier(PropertyIdentifier value) {
        return new JAXBElement<PropertyIdentifier>(_PropertyIdentifier_QNAME, PropertyIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyIdentifierList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/property/propertyidentifier", name = "propertyIdentifierList")
    public JAXBElement<PropertyIdentifierList> createPropertyIdentifierList(PropertyIdentifierList value) {
        return new JAXBElement<PropertyIdentifierList>(_PropertyIdentifierList_QNAME, PropertyIdentifierList.class, null, value);
    }

}
