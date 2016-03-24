
package com.ge.dsp.pm.ext.entity.field;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.field package. 
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

    private final static QName _SearchType_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/field", "searchType");
    private final static QName _FieldType_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/field", "fieldType");
    private final static QName _FieldList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/field", "fieldList");
    private final static QName _Parents_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/field", "parents");
    private final static QName _FieldTypeList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/field", "fieldTypeList");
    private final static QName _Field_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/field", "field");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.field
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FieldList }
     * 
     */
    public FieldList createFieldList() {
        return new FieldList();
    }

    /**
     * Create an instance of {@link FieldType }
     * 
     */
    public FieldType createFieldType() {
        return new FieldType();
    }

    /**
     * Create an instance of {@link FieldTypeList }
     * 
     */
    public FieldTypeList createFieldTypeList() {
        return new FieldTypeList();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link SearchType }
     * 
     */
    public SearchType createSearchType() {
        return new SearchType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/field", name = "searchType")
    public JAXBElement<SearchType> createSearchType(SearchType value) {
        return new JAXBElement<SearchType>(_SearchType_QNAME, SearchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/field", name = "fieldType")
    public JAXBElement<FieldType> createFieldType(FieldType value) {
        return new JAXBElement<FieldType>(_FieldType_QNAME, FieldType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/field", name = "fieldList")
    public JAXBElement<FieldList> createFieldList(FieldList value) {
        return new JAXBElement<FieldList>(_FieldList_QNAME, FieldList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Field }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/field", name = "parents")
    public JAXBElement<Field> createParents(Field value) {
        return new JAXBElement<Field>(_Parents_QNAME, Field.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldTypeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/field", name = "fieldTypeList")
    public JAXBElement<FieldTypeList> createFieldTypeList(FieldTypeList value) {
        return new JAXBElement<FieldTypeList>(_FieldTypeList_QNAME, FieldTypeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Field }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/field", name = "field")
    public JAXBElement<Field> createField(Field value) {
        return new JAXBElement<Field>(_Field_QNAME, Field.class, null, value);
    }

}
