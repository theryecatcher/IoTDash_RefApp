//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 02:16:43 AM PST 
//


package com.ge.dsp.pm.ext.entity.osa.dmrealseries;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.osa.dmrealseries package. 
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

    private final static QName _DmRealSeries_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/osa/dmRealSeries", "dmRealSeries");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.osa.dmrealseries
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DMRealSeries }
     * 
     */
    public DMRealSeries createDMRealSeries() {
        return new DMRealSeries();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DMRealSeries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/osa/dmRealSeries", name = "dmRealSeries")
    public JAXBElement<DMRealSeries> createDmRealSeries(DMRealSeries value) {
        return new JAXBElement<DMRealSeries>(_DmRealSeries_QNAME, DMRealSeries.class, null, value);
    }

}
