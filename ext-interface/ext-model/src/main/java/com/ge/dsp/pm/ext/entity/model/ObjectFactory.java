//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.07 at 07:40:43 PM IST 
//


package com.ge.dsp.pm.ext.entity.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.model package. 
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

    private final static QName _ModelList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/model", "modelList");
    private final static QName _Model_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/model", "model");
    private final static QName _SampleEngine_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/model", "sampleEngine");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModelList }
     * 
     */
    public ModelList createModelList() {
        return new ModelList();
    }

    /**
     * Create an instance of {@link SampleEngine }
     * 
     */
    public SampleEngine createSampleEngine() {
        return new SampleEngine();
    }

    /**
     * Create an instance of {@link Model }
     * 
     */
    public Model createModel() {
        return new Model();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     */
    public Entry createEntry() {
        return new Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/model", name = "modelList")
    public JAXBElement<ModelList> createModelList(ModelList value) {
        return new JAXBElement<ModelList>(_ModelList_QNAME, ModelList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Model }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/model", name = "model")
    public JAXBElement<Model> createModel(Model value) {
        return new JAXBElement<Model>(_Model_QNAME, Model.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SampleEngine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/model", name = "sampleEngine")
    public JAXBElement<SampleEngine> createSampleEngine(SampleEngine value) {
        return new JAXBElement<SampleEngine>(_SampleEngine_QNAME, SampleEngine.class, null, value);
    }

}
