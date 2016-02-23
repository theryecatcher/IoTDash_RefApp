package com.ge.predix.solsvc.dataseed.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.ge.predix.solsvc.dataseed.response.ErrorResponse;

/**
 * 
 * @author predix -
 */
@RestController
public class CustomErrorController
        implements ErrorController
{

    private static final String PATH = "/error"; //$NON-NLS-1$

    @Autowired
    private ErrorAttributes     errorAttributes;

    /**
     * @param request -
     * @param response -
     * @return -
     */
    @SuppressWarnings("nls")
    @RequestMapping(value = PATH)
    ErrorResponse error(HttpServletRequest request, HttpServletResponse response)
    {
        RequestAttributes requestAttributes = new ServletRequestAttributes(request);
        Map<String, Object> errAttr = this.errorAttributes.getErrorAttributes(requestAttributes, false);
        return new ErrorResponse(response.getStatus(), (String) errAttr.get("error"), (String) errAttr.get("message"));
    }

    @Override
    public String getErrorPath()
    {
        return PATH;
    }

}
