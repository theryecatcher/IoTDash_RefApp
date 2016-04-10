
package com.ge.dsp.pm.ext.entity.context;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.context package. 
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

    private final static QName _OrchestrationDesignContext_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/context", "orchestrationDesignContext");
    private final static QName _ServiceIdentifier_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/context", "serviceIdentifier");
    private final static QName _OrchestrationContext_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/context", "orchestrationContext");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.context
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrchestrationDesignContext }
     * 
     */
    public OrchestrationDesignContext createOrchestrationDesignContext() {
        return new OrchestrationDesignContext();
    }

    /**
     * Create an instance of {@link OrchestrationContext }
     * 
     */
    public OrchestrationContext createOrchestrationContext() {
        return new OrchestrationContext();
    }

    /**
     * Create an instance of {@link AnalyticContext }
     * 
     */
    public AnalyticContext createAnalyticContext() {
        return new AnalyticContext();
    }

    /**
     * Create an instance of {@link ServiceIdentifier }
     * 
     */
    public ServiceIdentifier createServiceIdentifier() {
        return new ServiceIdentifier();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrchestrationDesignContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/context", name = "orchestrationDesignContext")
    public JAXBElement<OrchestrationDesignContext> createOrchestrationDesignContext(OrchestrationDesignContext value) {
        return new JAXBElement<OrchestrationDesignContext>(_OrchestrationDesignContext_QNAME, OrchestrationDesignContext.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/context", name = "serviceIdentifier")
    public JAXBElement<ServiceIdentifier> createServiceIdentifier(ServiceIdentifier value) {
        return new JAXBElement<ServiceIdentifier>(_ServiceIdentifier_QNAME, ServiceIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrchestrationContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/context", name = "orchestrationContext")
    public JAXBElement<OrchestrationContext> createOrchestrationContext(OrchestrationContext value) {
        return new JAXBElement<OrchestrationContext>(_OrchestrationContext_QNAME, OrchestrationContext.class, null, value);
    }

}
