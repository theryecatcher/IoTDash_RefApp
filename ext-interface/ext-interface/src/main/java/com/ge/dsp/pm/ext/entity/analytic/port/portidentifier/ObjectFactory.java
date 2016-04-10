
package com.ge.dsp.pm.ext.entity.analytic.port.portidentifier;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.analytic.port.portidentifier package. 
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

    private final static QName _PortIdentifier_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/analytic/port/portidentifier", "portIdentifier");
    private final static QName _PortIdentifierList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/analytic/port/portidentifier", "portIdentifierList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.analytic.port.portidentifier
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PortIdentifierList }
     * 
     */
    public PortIdentifierList createPortIdentifierList() {
        return new PortIdentifierList();
    }

    /**
     * Create an instance of {@link PortIdentifier }
     * 
     */
    public PortIdentifier createPortIdentifier() {
        return new PortIdentifier();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/analytic/port/portidentifier", name = "portIdentifier")
    public JAXBElement<PortIdentifier> createPortIdentifier(PortIdentifier value) {
        return new JAXBElement<PortIdentifier>(_PortIdentifier_QNAME, PortIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortIdentifierList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/analytic/port/portidentifier", name = "portIdentifierList")
    public JAXBElement<PortIdentifierList> createPortIdentifierList(PortIdentifierList value) {
        return new JAXBElement<PortIdentifierList>(_PortIdentifierList_QNAME, PortIdentifierList.class, null, value);
    }

}
