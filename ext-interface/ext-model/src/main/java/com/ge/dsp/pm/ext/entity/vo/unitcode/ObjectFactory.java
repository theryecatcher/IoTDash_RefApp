//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 02:16:43 AM PST 
//


package com.ge.dsp.pm.ext.entity.vo.unitcode;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.vo.unitcode package. 
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

    private final static QName _UnitCodeVO_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/vo/unitcode", "unitCodeVO");
    private final static QName _UnitCodeVOMap_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/vo/unitcode", "unitCodeVOMap");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.vo.unitcode
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UnitCodesVO }
     * 
     */
    public UnitCodesVO createUnitCodesVO() {
        return new UnitCodesVO();
    }

    /**
     * Create an instance of {@link UnitCodeVO }
     * 
     */
    public UnitCodeVO createUnitCodeVO() {
        return new UnitCodeVO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitCodeVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/vo/unitcode", name = "unitCodeVO")
    public JAXBElement<UnitCodeVO> createUnitCodeVO(UnitCodeVO value) {
        return new JAXBElement<UnitCodeVO>(_UnitCodeVO_QNAME, UnitCodeVO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitCodesVO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/vo/unitcode", name = "unitCodeVOMap")
    public JAXBElement<UnitCodesVO> createUnitCodeVOMap(UnitCodesVO value) {
        return new JAXBElement<UnitCodesVO>(_UnitCodeVOMap_QNAME, UnitCodesVO.class, null, value);
    }

}
