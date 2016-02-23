
package com.ge.dsp.pm.ext.entity.asset.assetidentifier;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.asset.assetidentifier package. 
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

    private final static QName _AssetIdentifierList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/asset/assetidentifier", "assetIdentifierList");
    private final static QName _AssetIdentifier_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/asset/assetidentifier", "assetIdentifier");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.asset.assetidentifier
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AssetIdentifier }
     * 
     */
    public AssetIdentifier createAssetIdentifier() {
        return new AssetIdentifier();
    }

    /**
     * Create an instance of {@link AssetIdentifierList }
     * 
     */
    public AssetIdentifierList createAssetIdentifierList() {
        return new AssetIdentifierList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetIdentifierList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/asset/assetidentifier", name = "assetIdentifierList")
    public JAXBElement<AssetIdentifierList> createAssetIdentifierList(AssetIdentifierList value) {
        return new JAXBElement<AssetIdentifierList>(_AssetIdentifierList_QNAME, AssetIdentifierList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/asset/assetidentifier", name = "assetIdentifier")
    public JAXBElement<AssetIdentifier> createAssetIdentifier(AssetIdentifier value) {
        return new JAXBElement<AssetIdentifier>(_AssetIdentifier_QNAME, AssetIdentifier.class, null, value);
    }

}
