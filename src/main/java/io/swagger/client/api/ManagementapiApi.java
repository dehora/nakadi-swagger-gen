package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.Partition;
import io.swagger.client.model.Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-15T20:45:01.680+01:00")
public class ManagementapiApi {
  private ApiClient apiClient;

  public ManagementapiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ManagementapiApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * 
   * Lists the `Partition`s for the given event-type.\n\nThis endpoint is mostly interesting for monitoring purposes or in cases when consumer wants\nto start consuming older messages.\n
   * @param name EventType name (required)
   * @param xFlowId The flow id of the request, which is written into the logs and passed to called\nservices. Helpful for operational troubleshooting and log analysis.\n (optional)
   * @return List<Partition>
   * @throws ApiException if fails to make API call
   */
  public List<Partition> eventTypesNamePartitionsGet(String name, String xFlowId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling eventTypesNamePartitionsGet");
    }
    
    // create path and map variables
    String localVarPath = "/event-types/{name}/partitions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (xFlowId != null)
      localVarHeaderParams.put("X-Flow-Id", apiClient.parameterToString(xFlowId));
    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    
    GenericType<List<Partition>> localVarReturnType = new GenericType<List<Partition>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * 
   * Returns the given `Partition` of this EventType
   * @param name EventType name (required)
   * @param partition Partition id (required)
   * @param xFlowId The flow id of the request, which is written into the logs and passed to called\nservices. Helpful for operational troubleshooting and log analysis.\n (optional)
   * @return Partition
   * @throws ApiException if fails to make API call
   */
  public Partition eventTypesNamePartitionsPartitionGet(String name, String partition, String xFlowId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling eventTypesNamePartitionsPartitionGet");
    }
    
    // verify the required parameter 'partition' is set
    if (partition == null) {
      throw new ApiException(400, "Missing the required parameter 'partition' when calling eventTypesNamePartitionsPartitionGet");
    }
    
    // create path and map variables
    String localVarPath = "/event-types/{name}/partitions/{partition}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
      .replaceAll("\\{" + "partition" + "\\}", apiClient.escapeString(partition.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (xFlowId != null)
      localVarHeaderParams.put("X-Flow-Id", apiClient.parameterToString(xFlowId));
    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    
    GenericType<Partition> localVarReturnType = new GenericType<Partition>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
