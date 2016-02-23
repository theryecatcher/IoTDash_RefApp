package com.ge.predix.solsvc.bootstrap.tsb.factories;

import java.io.IOException;
import java.util.List;

import org.apache.http.Header;
import org.kairosdb.client.response.Response;

import com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.latest.request.DatapointsLatestQuery;
import com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request.DatapointsQuery;
import com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.response.DatapointsResponse;
import com.ge.predix.solsvc.bootstrap.tbs.entity.InjectionMetricBuilder;
import com.ge.predix.solsvc.bootstrap.tbs.entity.TimeseriesQueryBuilder;
import com.ge.predix.solsvc.bootstrap.tbs.response.entity.TimeseriesQueryResponse;

/**
 * 
 * @author 212421693
 *
 */
public interface TimeseriesFactory
{

    /**
     * 
     * @param metrics -
     * @return -
     */
    public Response create(InjectionMetricBuilder metrics);
   
    /**
     * @since Predix Timeseries API v1.0
     * @param uri
     * @param datapoints
     * @param headers
     * @return
     */
    public DatapointsResponse queryForDatapoints(String uri, DatapointsQuery datapoints, List<Header> headers);
    
    /**
     * @since Predix Timeseries API v1.0
     * @param uri
     * @param datapoints
     * @param headers
     * @return
     */

    public DatapointsResponse queryForLatestDatapoint(String baseUrl, DatapointsLatestQuery latestDatapoints, List<Header> headers);

    /**
     * 
     * @param headers - 
     * @return List<String>
     * @throws IOException e
     */
	@Deprecated
    public List<String> getAttributeNames(List<Header> headers);

    /**
     * 
     * @param headers -
     * @return List<String>
     */
	@Deprecated
    public List<String> getTagNames(List<Header> headers);

    /**
     * 
     * @param token String
     * @return List<String>
     * @throws IOException e
     */
	//@Deprecated
    // public List<String> getAttributeValues(MessageContext context, String token) throws IOException;
    /**
     * 
     * @param name String
     * @param headers -
     * @return Response
     * @throws IOException e
     */
	@Deprecated
    public Response deleteMetric(String name, List<Header> headers)
            throws IOException;

    /**
     * 
     * @param uri -
     * @param builder TimeseriesQueryBuilder
     * @param headers -
     * @param token String
     * @return token
     */
	@Deprecated
    public Response delete(TimeseriesQueryBuilder builder, List<Header> headers);

    /**
     * 
     * @param groupType String
     * @param dataPointValueClass Class
     * @param headers -
     * @param token String
     */
	//@Deprecated
//    public void registerCustomDataType(String groupType, @SuppressWarnings("rawtypes") Class dataPointValueClass,
//            List<Header> headers);

    /**
     * 
     * @param groupType String
     * @param headers -
     * @return Class
     */
	@Deprecated
    @SuppressWarnings("rawtypes")
    public Class getDataPointValueClass(String groupType);

    /**
     * @param headers -
     * @return -
     */
	@Deprecated
    public List<String> getVersion(List<Header> headers);

}
