
package com.ge.dsp.pm.ext.entity.strategy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.strategy package. 
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

    private final static QName _StrategyTypeList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/strategy", "strategyTypeList");
    private final static QName _StrategyType_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/strategy", "strategyType");
    private final static QName _Strategy_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/strategy", "strategy");
    private final static QName _StrategyList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/strategy", "strategyList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.strategy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StrategyList }
     * 
     */
    public StrategyList createStrategyList() {
        return new StrategyList();
    }

    /**
     * Create an instance of {@link Strategy }
     * 
     */
    public Strategy createStrategy() {
        return new Strategy();
    }

    /**
     * Create an instance of {@link StrategyType }
     * 
     */
    public StrategyType createStrategyType() {
        return new StrategyType();
    }

    /**
     * Create an instance of {@link StrategyTypeList }
     * 
     */
    public StrategyTypeList createStrategyTypeList() {
        return new StrategyTypeList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrategyTypeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/strategy", name = "strategyTypeList")
    public JAXBElement<StrategyTypeList> createStrategyTypeList(StrategyTypeList value) {
        return new JAXBElement<StrategyTypeList>(_StrategyTypeList_QNAME, StrategyTypeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrategyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/strategy", name = "strategyType")
    public JAXBElement<StrategyType> createStrategyType(StrategyType value) {
        return new JAXBElement<StrategyType>(_StrategyType_QNAME, StrategyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Strategy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/strategy", name = "strategy")
    public JAXBElement<Strategy> createStrategy(Strategy value) {
        return new JAXBElement<Strategy>(_Strategy_QNAME, Strategy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrategyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/strategy", name = "strategyList")
    public JAXBElement<StrategyList> createStrategyList(StrategyList value) {
        return new JAXBElement<StrategyList>(_StrategyList_QNAME, StrategyList.class, null, value);
    }

}
