
package com.ge.dsp.pm.ext.entity.strategydetail.identifier.strategydetailidentifier;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.strategydetail.identifier.strategydetailidentifier package. 
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

    private final static QName _StrategydetailIdentifierList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/strategydetail/identifier/strategydetailidentifier", "strategydetailIdentifierList");
    private final static QName _StrategydetailIdentifier_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/strategydetail/identifier/strategydetailidentifier", "strategydetailIdentifier");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.strategydetail.identifier.strategydetailidentifier
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StrategyDetailIdentifier }
     * 
     */
    public StrategyDetailIdentifier createStrategyDetailIdentifier() {
        return new StrategyDetailIdentifier();
    }

    /**
     * Create an instance of {@link StrategyDetailIdentifierList }
     * 
     */
    public StrategyDetailIdentifierList createStrategyDetailIdentifierList() {
        return new StrategyDetailIdentifierList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrategyDetailIdentifierList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/strategydetail/identifier/strategydetailidentifier", name = "strategydetailIdentifierList")
    public JAXBElement<StrategyDetailIdentifierList> createStrategydetailIdentifierList(StrategyDetailIdentifierList value) {
        return new JAXBElement<StrategyDetailIdentifierList>(_StrategydetailIdentifierList_QNAME, StrategyDetailIdentifierList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrategyDetailIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/strategydetail/identifier/strategydetailidentifier", name = "strategydetailIdentifier")
    public JAXBElement<StrategyDetailIdentifier> createStrategydetailIdentifier(StrategyDetailIdentifier value) {
        return new JAXBElement<StrategyDetailIdentifier>(_StrategydetailIdentifier_QNAME, StrategyDetailIdentifier.class, null, value);
    }

}
