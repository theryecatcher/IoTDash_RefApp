//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.07 at 07:40:43 PM IST 
//


package com.ge.dsp.pm.ext.entity.timeselectionfilter;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.timeselectionfilter package. 
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

    private final static QName _Tags_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/timeselectionfilter", "Tags");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.timeselectionfilter
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Tags }
     * 
     */
    public Tags createTags() {
        return new Tags();
    }

    /**
     * Create an instance of {@link ValueGroupBy }
     * 
     */
    public ValueGroupBy createValueGroupBy() {
        return new ValueGroupBy();
    }

    /**
     * Create an instance of {@link IngestBody }
     * 
     */
    public IngestBody createIngestBody() {
        return new IngestBody();
    }

    /**
     * Create an instance of {@link GroupBy }
     * 
     */
    public GroupBy createGroupBy() {
        return new GroupBy();
    }

    /**
     * Create an instance of {@link PredixTimeSelection }
     * 
     */
    public PredixTimeSelection createPredixTimeSelection() {
        return new PredixTimeSelection();
    }

    /**
     * Create an instance of {@link Aggregator }
     * 
     */
    public Aggregator createAggregator() {
        return new Aggregator();
    }

    /**
     * Create an instance of {@link PredixTimeseriesIngestion }
     * 
     */
    public PredixTimeseriesIngestion createPredixTimeseriesIngestion() {
        return new PredixTimeseriesIngestion();
    }

    /**
     * Create an instance of {@link TagGroupBy }
     * 
     */
    public TagGroupBy createTagGroupBy() {
        return new TagGroupBy();
    }

    /**
     * Create an instance of {@link RelativeTime }
     * 
     */
    public RelativeTime createRelativeTime() {
        return new RelativeTime();
    }

    /**
     * Create an instance of {@link PredixTimeSelectionFilter }
     * 
     */
    public PredixTimeSelectionFilter createPredixTimeSelectionFilter() {
        return new PredixTimeSelectionFilter();
    }

    /**
     * Create an instance of {@link TimeGroupBy }
     * 
     */
    public TimeGroupBy createTimeGroupBy() {
        return new TimeGroupBy();
    }

    /**
     * Create an instance of {@link Datapoint }
     * 
     */
    public Datapoint createDatapoint() {
        return new Datapoint();
    }

    /**
     * Create an instance of {@link RangeSize }
     * 
     */
    public RangeSize createRangeSize() {
        return new RangeSize();
    }

    /**
     * Create an instance of {@link Sampling }
     * 
     */
    public Sampling createSampling() {
        return new Sampling();
    }

    /**
     * Create an instance of {@link PredixEventTimeSelectionFilter }
     * 
     */
    public PredixEventTimeSelectionFilter createPredixEventTimeSelectionFilter() {
        return new PredixEventTimeSelectionFilter();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tags }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/timeselectionfilter", name = "Tags")
    public JAXBElement<Tags> createTags(Tags value) {
        return new JAXBElement<Tags>(_Tags_QNAME, Tags.class, null, value);
    }

}
