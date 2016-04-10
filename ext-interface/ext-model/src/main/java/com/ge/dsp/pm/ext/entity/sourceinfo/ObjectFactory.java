//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.07 at 07:40:43 PM IST 
//


package com.ge.dsp.pm.ext.entity.sourceinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.sourceinfo package. 
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

    private final static QName _SourceInfo_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/sourceinfo", "sourceInfo");
    private final static QName _SourceInfoList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/sourceinfo", "sourceInfoList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.sourceinfo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SourceInfo }
     * 
     */
    public SourceInfo createSourceInfo() {
        return new SourceInfo();
    }

    /**
     * Create an instance of {@link SourceInfoList }
     * 
     */
    public SourceInfoList createSourceInfoList() {
        return new SourceInfoList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/sourceinfo", name = "sourceInfo")
    public JAXBElement<SourceInfo> createSourceInfo(SourceInfo value) {
        return new JAXBElement<SourceInfo>(_SourceInfo_QNAME, SourceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/sourceinfo", name = "sourceInfoList")
    public JAXBElement<SourceInfoList> createSourceInfoList(SourceInfoList value) {
        return new JAXBElement<SourceInfoList>(_SourceInfoList_QNAME, SourceInfoList.class, null, value);
    }

}
