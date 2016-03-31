package com.ge.predix.solsvc.machinedata.simulator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 
 * @author predix -
 */
@Component
public class ApplicationProperties
        implements EnvironmentAware
{
    @Value("${dataingestion.service.host:#{null}}")
    private String diServiceHost;
    @Value("${dataingestion.service.port:#{null}}")
    private String diServicePort;
    @Value("${dataingestion.service.proxyHost:#{null}}")
    private String diServiceProxyHost;
    @Value("${dataingestion.service.proxyPort:#{null}}")
    private String diServiceProxyPort;
    @Value("${dataingestion.tenantId:#{null}}")
    private String tenantId;
    @Value("${dataingestion.sleepTimeMillis:1000}")
    private long sleepTimeMillis;

    private String machineControllerId;
    private String predixDataIngestionURL;
    private String envTenantId;

    /**
     * @return -
     */
    public String getDiServiceHost()
    {
        return this.diServiceHost;
    }

    /**
     * @param diServiceHost -
     */
    public void setDiServiceHost(String diServiceHost)
    {
        this.diServiceHost = diServiceHost;
    }

    /**
     * @return -
     */
    public String getDiServicePort()
    {
        return this.diServicePort;
    }

    /**
     * @param diServicePort -
     */
    public void setDiServicePort(String diServicePort)
    {
        this.diServicePort = diServicePort;
    }

    /**
     * @return -
     */
    public String getDiServiceProxyHost()
    {
        return this.diServiceProxyHost;
    }

    /**
     * @param diServiceProxyHost -
     */
    public void setDiServiceProxyHost(String diServiceProxyHost)
    {
        this.diServiceProxyHost = diServiceProxyHost;
    }

    /**
     * @return -
     */
    public String getDiServiceProxyPort()
    {
        return this.diServiceProxyPort;
    }

    /**
     * @param diServiceProxyPort -
     */
    public void setDiServiceProxyPort(String diServiceProxyPort)
    {
        this.diServiceProxyPort = diServiceProxyPort;
    }

    /**
     * @return -
     */
    public String getPredixDataIngestionURL()
    {
        return this.predixDataIngestionURL;
    }

    /**
     * @param predixDataIngestionURL -
     */
    public void setPredixDataIngestionURL(String predixDataIngestionURL)
    {
        this.predixDataIngestionURL = predixDataIngestionURL;
    }

    /**
     * @return -
     */
    public String getMachineControllerId()
    {
        return this.machineControllerId;
    }

    /**
     * @param machineControllerId -
     */
    public void setMachineControllerId(String machineControllerId)
    {
        this.machineControllerId = machineControllerId;
    }

    /**
     * @return -
     */
    public String getTenantId()
    {
        if ( this.envTenantId != null )
        {
            setTenantId(this.envTenantId);
        }
        return this.tenantId;
    }

    /**
     * @param tenantId -
     */
    public void setTenantId(String tenantId)
    {
        this.tenantId = tenantId;
    }

    @SuppressWarnings("nls")
    @Override
    public void setEnvironment(Environment env)
    {
        this.machineControllerId = env.getProperty("machineControllerId");
        if ( this.machineControllerId == null )
        {
            this.machineControllerId = "1";
        }
        this.predixDataIngestionURL = env.getProperty("predix_dataingestion_service_uri");
        this.envTenantId = env.getProperty("predix_tenantId");
    }

    /**
     * @return -
     */
    public long getSleepTimeMillis()
    {
        return this.sleepTimeMillis;
    }

}
