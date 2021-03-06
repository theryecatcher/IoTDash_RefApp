
package com.ge.dsp.aaas.entity.resultinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.aaas.entity.resultinfo package. 
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

    private final static QName _ResultInfoList_QNAME = new QName("http://dsp.ge.com/aaas/entity/resultinfo", "resultInfoList");
    private final static QName _ResultInfo_QNAME = new QName("http://dsp.ge.com/aaas/entity/resultinfo", "resultInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.aaas.entity.resultinfo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResultInfoList }
     * 
     */
    public ResultInfoList createResultInfoList() {
        return new ResultInfoList();
    }

    /**
     * Create an instance of {@link ResultInfo }
     * 
     */
    public ResultInfo createResultInfo() {
        return new ResultInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/aaas/entity/resultinfo", name = "resultInfoList")
    public JAXBElement<ResultInfoList> createResultInfoList(ResultInfoList value) {
        return new JAXBElement<ResultInfoList>(_ResultInfoList_QNAME, ResultInfoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/aaas/entity/resultinfo", name = "resultInfo")
    public JAXBElement<ResultInfo> createResultInfo(ResultInfo value) {
        return new JAXBElement<ResultInfo>(_ResultInfo_QNAME, ResultInfo.class, null, value);
    }

}
