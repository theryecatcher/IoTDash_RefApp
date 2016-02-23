
package com.ge.dsp.pm.ext.entity.action;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ge.dsp.pm.ext.entity.action package. 
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

    private final static QName _ActionList_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/action", "actionList");
    private final static QName _Action_QNAME = new QName("http://dsp.ge.com/pm/ext/entity/action", "action");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ge.dsp.pm.ext.entity.action
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Action }
     * 
     */
    public Action createAction() {
        return new Action();
    }

    /**
     * Create an instance of {@link ActionList }
     * 
     */
    public ActionList createActionList() {
        return new ActionList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/action", name = "actionList")
    public JAXBElement<ActionList> createActionList(ActionList value) {
        return new JAXBElement<ActionList>(_ActionList_QNAME, ActionList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Action }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dsp.ge.com/pm/ext/entity/action", name = "action")
    public JAXBElement<Action> createAction(Action value) {
        return new JAXBElement<Action>(_Action_QNAME, Action.class, null, value);
    }

}
