package com.ge.dsp.pm.fielddatahandler.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2016-04-07T19:41:05.961+05:30
 * Generated source version: 2.7.3
 * 
 */
@WebServiceClient(name = "fielddatahandler", 
                  wsdlLocation = "file:/mnt/Mustang/Work/Workspace/Predix/InfyIoTDash_RefApp/ext-interface/ext-interface/src/main/resources/META-INF/schemas/pm/service/wsdl/fielddatahandler.wsdl",
                  targetNamespace = "http://dsp.ge.com/pm/fielddatahandler/service") 
public class Fielddatahandler_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://dsp.ge.com/pm/fielddatahandler/service", "fielddatahandler");
    public final static QName FielddatahandlerSOAP = new QName("http://dsp.ge.com/pm/fielddatahandler/service", "fielddatahandlerSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/mnt/Mustang/Work/Workspace/Predix/InfyIoTDash_RefApp/ext-interface/ext-interface/src/main/resources/META-INF/schemas/pm/service/wsdl/fielddatahandler.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Fielddatahandler_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/mnt/Mustang/Work/Workspace/Predix/InfyIoTDash_RefApp/ext-interface/ext-interface/src/main/resources/META-INF/schemas/pm/service/wsdl/fielddatahandler.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Fielddatahandler_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Fielddatahandler_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Fielddatahandler_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Fielddatahandler_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Fielddatahandler_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Fielddatahandler_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns Fielddatahandler
     */
    @WebEndpoint(name = "fielddatahandlerSOAP")
    public Fielddatahandler getFielddatahandlerSOAP() {
        return super.getPort(FielddatahandlerSOAP, Fielddatahandler.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Fielddatahandler
     */
    @WebEndpoint(name = "fielddatahandlerSOAP")
    public Fielddatahandler getFielddatahandlerSOAP(WebServiceFeature... features) {
        return super.getPort(FielddatahandlerSOAP, Fielddatahandler.class, features);
    }

}
