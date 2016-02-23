
package com.ge.dsp.pm.ext.entity.engunit;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.engunit package. 
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

    private final static QName _EngUnit_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/engunit", "engUnit");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.engunit
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EngUnit }
     * 
     */
    public EngUnit createEngUnit() {
        return new EngUnit();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EngUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/engunit", name = "engUnit")
    public JAXBElement<EngUnit> createEngUnit(EngUnit value) {
        return new JAXBElement<EngUnit>(_EngUnit_QNAME, EngUnit.class, null, value);
    }

}
