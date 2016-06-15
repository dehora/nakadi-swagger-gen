package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.EventType;
import io.swagger.client.model.Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-15T20:45:01.680+01:00")
public class SchemaregistryapiApi {
  private ApiClient apiClient;

  public SchemaregistryapiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SchemaregistryapiApi(ApiClient apiClient) {
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
   * Returns a list of all registered `EventType`s
   * @param xFlowId The flow id of the request, which is written into the logs and passed to called\nservices. Helpful for operational troubleshooting and log analysis.\n (optional)
   * @return List<EventType>
   * @throws ApiException if fails to make API call
   */
  public List<EventType> eventTypesGet(String xFlowId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/event-types".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<EventType>> localVarReturnType = new GenericType<List<EventType>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * 
   * Deletes an `EventType` identified by its name. The underlying Kafka topic and all events of\nthis `EventType` will also be removed.  **Note**: Kafka&#39;s topic deletion happens\nasynchronously with respect to this DELETE call; therefore creation of an equally named\n`EventType` before the underlying topic deletion is complete will not succeed (failure is a\n409 Conflic).\n
   * @param name Name of the EventType to delete. (required)
   * @param xFlowId The flow id of the request, which is written into the logs and passed to called\nservices. Helpful for operational troubleshooting and log analysis.\n (optional)
   * @throws ApiException if fails to make API call
   */
  public void eventTypesNameDelete(String name, String xFlowId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling eventTypesNameDelete");
    }
    
    // create path and map variables
    String localVarPath = "/event-types/{name}".replaceAll("\\{format\\}","json")
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

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * 
   * Returns the `EventType` identified by its name.\n
   * @param name Name of the EventType to load. (required)
   * @param xFlowId The flow id of the request, which is written into the logs and passed to called\nservices. Helpful for operational troubleshooting and log analysis.\n (optional)
   * @return EventType
   * @throws ApiException if fails to make API call
   */
  public EventType eventTypesNameGet(String name, String xFlowId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling eventTypesNameGet");
    }
    
    // create path and map variables
    String localVarPath = "/event-types/{name}".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<EventType> localVarReturnType = new GenericType<EventType>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * 
   * Updates the `EventType` identified by its name. Behaviour is the same as creation of\n`EventType` (See POST /event-type) except where noted below.\n\nThe name field cannot be changed. Attempting to do so will result in a 422 failure.\n\nAt this moment changes in the schema are not supported and will produce a 422\nfailure. (TODO: define conditions for backwards compatible extensions in the schema)\n
   * @param name Name of the EventType to update. (required)
   * @param eventType EventType to be updated. (required)
   * @param xFlowId The flow id of the request, which is written into the logs and passed to called\nservices. Helpful for operational troubleshooting and log analysis.\n (optional)
   * @throws ApiException if fails to make API call
   */
  public void eventTypesNamePut(String name, EventType eventType, String xFlowId) throws ApiException {
    Object localVarPostBody = eventType;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling eventTypesNamePut");
    }
    
    // verify the required parameter 'eventType' is set
    if (eventType == null) {
      throw new ApiException(400, "Missing the required parameter 'eventType' when calling eventTypesNamePut");
    }
    
    // create path and map variables
    String localVarPath = "/event-types/{name}".replaceAll("\\{format\\}","json")
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

    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * 
   * Creates a new `EventType`.\n\n**Implementation note:** The creation of an EventType implicitly creates the structures in\nthe backing messaging implementation needed for the reception and persistence of the\nEvents. Considering that at this time only Kafka is used, this corresponds to the creation\nof a Topic. If so desired, clients can interact directly with the topic using the low level\nAPI (for existing restrictions see the corresponding methods on the topic-api).\n\nThe fields enrichment-strategies and partition-resolution-strategy\nhave all an effect on the incoming Event of this EventType. For its impacts on the reception\nof events please consult the Event submission API methods.\n\n* TBD Enrichment strategy\n\n* The schema of an `EventType` is defined as an `EventTypeSchema`. Currently only\njson-schema is supported.\n\nFollowing conditions are enforced. Not meeting them will fail the request with the indicated\nstatus (details are provided in the Problem object):\n\n* EventType name on creation must be unique (or attempting to update an `EventType` with\n  this method), otherwise the request is rejected with status 409 Conflict.\n\n* Using `EventTypeSchema.type` other than json-schema or passing a `EventTypeSchema.schema`\nthat is invalid with respect to the schema&#39;s type. Rejects with 422 Unprocessable entity.\n\n* Referring any Enrichment or Partition strategies that do not exist or\nwhose parametrization is deemed invalid. Rejects with 422 Unprocessable entity.\n\nNakadi MIGHT impose necessary schema, validation and enrichment minimal configurations that\nMUST be followed by all EventTypes (examples include: validation rules to match the schema;\nenriching every Event with the reception date-type; adhering to a set of schema fields that\nare mandatory for all EventTypes). **The mechanism to set and inspect such rules is not\ndefined at this time and might not be exposed in the API.**\n
   * @param eventType EventType to be created (required)
   * @throws ApiException if fails to make API call
   */
  public void eventTypesPost(EventType eventType) throws ApiException {
    Object localVarPostBody = eventType;
    
    // verify the required parameter 'eventType' is set
    if (eventType == null) {
      throw new ApiException(400, "Missing the required parameter 'eventType' when calling eventTypesPost");
    }
    
    // create path and map variables
    String localVarPath = "/event-types".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * 
   * Lists all of the enrichment strategies supported by this installation of Nakadi.\n\nIf the EventType creation is to have special enrichments (besides the default), one can\nconsult over this method the available possibilities.\n
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public List<String> registryEnrichmentStrategiesGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/registry/enrichment-strategies".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * 
   * Lists all of the partition resolution strategies supported by this installation of Nakadi.\n\nIf the EventType creation is to have a specific partition strategy (other than the default),\none can consult over this method the available possibilities.\n\nNakadi offers currently, out of the box, the following strategies:\n\n- `random`: Resolution of the target partition happens randomly (events are evenly\n  distributed on the topic&#39;s partitions).\n\n- `user_defined`: Target partition is defined by the client. As long as the indicated\n  partition exists, Event assignment will respect this value. Correctness of the relative\n  ordering of events is under the responsibility of the Producer.  Requires that the client\n  provides the target partition on `metadata.partition` (See `EventMetadata`). Failure to do\n  so will reject the publishing of the Event.\n\n- `hash`: Resolution of the partition follows the computation of a hash from the value of\n  the fields indicated in the EventType&#39;s `partition_key_fields`, guaranteeing that Events\n  with same values on those fields end in the same partition.\n
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public List<String> registryPartitionStrategiesGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/registry/partition-strategies".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
