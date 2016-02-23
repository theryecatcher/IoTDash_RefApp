
package com.ge.dsp.pm.ext.entity.assetselector;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.assetselector package. 
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

    private final static QName _AssetSelector_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/assetselector", "assetSelector");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.assetselector
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AssetSelector }
     * 
     */
    public AssetSelector createAssetSelector() {
        return new AssetSelector();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetSelector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/assetselector", name = "assetSelector")
    public JAXBElement<AssetSelector> createAssetSelector(AssetSelector value) {
        return new JAXBElement<AssetSelector>(_AssetSelector_QNAME, AssetSelector.class, null, value);
    }

}
