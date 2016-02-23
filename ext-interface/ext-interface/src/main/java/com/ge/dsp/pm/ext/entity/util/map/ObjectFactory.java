
package com.ge.dsp.pm.ext.entity.util.map;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.util.map package. 
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

    private final static QName _AttributeMap_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/util/map", "attributeMap");
    private final static QName _ExternalAttributeMap_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/util/map", "externalAttributeMap");
    private final static QName _Entry_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/util/map", "entry");
    private final static QName _Map_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/util/map", "map");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.util.map
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SimpleMap }
     * 
     */
    public SimpleMap createSimpleMap() {
        return new SimpleMap();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     */
    public Entry createEntry() {
        return new Entry();
    }

    /**
     * Create an instance of {@link Map }
     * 
     */
    public Map createMap() {
        return new Map();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Map }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/util/map", name = "attributeMap")
    public JAXBElement<Map> createAttributeMap(Map value) {
        return new JAXBElement<Map>(_AttributeMap_QNAME, Map.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Map }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/util/map", name = "externalAttributeMap")
    public JAXBElement<Map> createExternalAttributeMap(Map value) {
        return new JAXBElement<Map>(_ExternalAttributeMap_QNAME, Map.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/util/map", name = "entry")
    public JAXBElement<Entry> createEntry(Entry value) {
        return new JAXBElement<Entry>(_Entry_QNAME, Entry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Map }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/util/map", name = "map")
    public JAXBElement<Map> createMap(Map value) {
        return new JAXBElement<Map>(_Map_QNAME, Map.class, null, value);
    }

}
