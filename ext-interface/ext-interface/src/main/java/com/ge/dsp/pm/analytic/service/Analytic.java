package com.ge.dsp.pm.analytic.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2016-02-17T02:16:57.091-08:00
 * Generated source version: 2.7.3
 * 
 */
@WebService(targetNamespace = "http://dsp.ge.com/pm/analytic/service", name = "analytic")
@XmlSeeAlso({com.ge.dsp.pm.ext.entity.asset.assetidentifier.ObjectFactory.class, com.ge.dsp.pm.ext.entity.engunit.ObjectFactory.class, com.ge.dsp.pm.ext.entity.context.ObjectFactory.class, com.ge.dsp.pm.ext.entity.assetselector.ObjectFactory.class, com.ge.dsp.pm.ext.entity.util.map.ObjectFactory.class, com.ge.dsp.pm.ext.entity.field.fieldidentifier.ObjectFactory.class, com.ge.dsp.pm.fielddatahandler.entity.fielddatacriteria.ObjectFactory.class, com.ge.dsp.pm.ext.entity.analytic.port.portidentifier.ObjectFactory.class, com.ge.dsp.pm.ext.entity.attributedef.ObjectFactory.class, com.ge.dsp.pm.ext.entity.fielddata.ObjectFactory.class, com.ge.dsp.pm.analytic.entity.runanalytic.ObjectFactory.class, com.ge.dsp.pm.ext.entity.fieldselection.ObjectFactory.class, org.mimosa.osacbmv3_3.ObjectFactory.class, com.ge.dsp.pm.ext.entity.field.ObjectFactory.class, com.ge.dsp.aaas.entity.identifier.ObjectFactory.class, com.ge.dsp.pm.ext.entity.osa.errordataevent.ObjectFactory.class, com.ge.dsp.pm.ext.entity.selectionfilter.ObjectFactory.class, com.ge.dsp.pm.ext.entity.fieldidentifiervalue.ObjectFactory.class, com.ge.dsp.pm.ext.entity.analytic.port.ObjectFactory.class, com.ge.dsp.pm.ext.entity.asset.ObjectFactory.class, com.ge.dsp.pm.ext.entity.fieldvalue.ObjectFactory.class, com.ge.dsp.pm.ext.entity.solution.identifier.solutionidentifier.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Analytic {

    @WebMethod(action = "http://dsp.ge.com/pm/service/analytic/RunAnalytic")
    @WebResult(name = "runAnalyticResult", targetNamespace = "http://dsp.ge.com/pm/analytic/entity/runanalytic", partName = "parameters")
    public com.ge.dsp.pm.analytic.entity.runanalytic.RunAnalyticResult runAnalytic(
        @WebParam(partName = "parameters", name = "runAnalyticRequest", targetNamespace = "http://dsp.ge.com/pm/analytic/entity/runanalytic")
        com.ge.dsp.pm.analytic.entity.runanalytic.RunAnalyticRequest parameters
    );
}
