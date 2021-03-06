
package com.ge.dsp.pm.ext.entity.asset;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.asset package. 
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

    private final static QName _AssetList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/asset", "assetList");
    private final static QName _Asset_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/asset", "asset");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.asset
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AssetList }
     * 
     */
    public AssetList createAssetList() {
        return new AssetList();
    }

    /**
     * Create an instance of {@link Asset }
     * 
     */
    public Asset createAsset() {
        return new Asset();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/asset", name = "assetList")
    public JAXBElement<AssetList> createAssetList(AssetList value) {
        return new JAXBElement<AssetList>(_AssetList_QNAME, AssetList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Asset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/asset", name = "asset")
    public JAXBElement<Asset> createAsset(Asset value) {
        return new JAXBElement<Asset>(_Asset_QNAME, Asset.class, null, value);
    }

}
