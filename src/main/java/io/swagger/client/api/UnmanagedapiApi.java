package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.EventStreamBatch;
import io.swagger.client.model.Problem;
import java.math.BigDecimal;
import io.swagger.client.model.Partition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-15T20:45:01.680+01:00")
public class UnmanagedapiApi {
  private ApiClient apiClient;

  public UnmanagedapiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UnmanagedapiApi(ApiClient apiClient) {
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
   * Starts a stream delivery for the specified partitions of the given EventType.\n\nThe event stream is formatted as a sequence of `EventStreamBatch`es separated by `\\n`. Each\n`EventStreamBatch` contains a chunk of Events and a `Cursor` pointing to the **end** of the\nchunk (i.e. last delivered Event). The cursor might specify the offset with the symbolic\nvalue `BEGIN`, which will open the stream starting from the oldest available offset in the\npartition.  Currently this format is the only one supported by the system, but in the future\nother MIME types will be supported (like `application/event-stream`).\n\nIf streaming for several distinct partitions, each one is an independent `EventStreamBatch`.\n\nThe initialization of a stream can be parameterized in terms of size of each chunk, timeout\nfor flushing each chunk, total amount of delivered Events and total time for the duration of\nthe stream.\n\nNakadi will keep a streaming connection open even if there are no events to be delivered. In\nthis case the timeout for the flushing of each chunk will still apply and the\n`EventStreamBatch` will contain only the Cursor pointing to the same offset. This can be\ntreated as a keep-alive control for some load balancers.\n\nThe tracking of the current offset in the partitions and of which partitions is being read\nis in the responsibility of the client. No commits are needed.\n
   * @param name EventType name to get events about (required)
   * @param xNakadiCursors Cursors indicating the partitions to read from and respective starting offsets.\n\nAssumes the offset on each cursor is not inclusive (i.e., first delivered Event is the\n**first one after** the one pointed to in the cursor).\n\nIf the header is not present, the stream for all partitions defined for the EventType\nwill start from the newest event available in the system at the moment of making this\ncall.\n\n**Note:** we are not using query parameters for passing the cursors only because of the\nlength limitations on the HTTP query. Another way to initiate this call would be the\nPOST method with cursors passed in the method body. This approach can implemented in the\nfuture versions of this API.\n (optional)
   * @param batchLimit Maximum number of `Event`s in each chunk (and therefore per partition) of the stream.\n\n* If 0 or unspecified will buffer Events indefinitely and flush on reaching of\n`batch_flush_timeout`.\n (optional, default to 1)
   * @param streamLimit Maximum number of `Event`s in this stream (over all partitions being streamed in this\nconnection).\n\n* If 0 or undefined, will stream batches indefinitely.\n\n* Stream initialization will fail if `stream_limit` is lower than `batch_limit`.\n (optional, default to 0)
   * @param batchFlushTimeout Maximum time in seconds to wait for the flushing of each chunk (per partition).\n\n* If the amount of buffered Events reaches `batch_limit` before this\n`batch_flush_timeout` is reached, the messages are immediately flushed to the client and\nbatch flush timer is reset.\n\n* If 0 or undefined, will assume 30 seconds.\n (optional, default to 30)
   * @param streamTimeout Maximum time in seconds a stream will live before being interrupted.\nIf value is zero, streams indefinitely.\n\nIf this timeout is reached, any pending messages (in the sense of `stream_limit`) will\nbe flushed to the client.\n\nStream initialization will fail if `stream_timeout` is lower than `batch_flush_timeout`.\n (optional, default to 60)
   * @param streamKeepAliveLimit Maximum number of keep-alive messages to get in a row before closing the connection.\n\nIf 0 or undefined will send keep alive messages indefinitely.\n (optional, default to 0)
   * @param xFlowId The flow id of the request, which is written into the logs and passed to called\nservices. Helpful for operational troubleshooting and log analysis.\n (optional)
   * @return EventStreamBatch
   * @throws ApiException if fails to make API call
   */
  public EventStreamBatch eventTypesNameEventsGet(String name, String xNakadiCursors, Integer batchLimit, Integer streamLimit, BigDecimal batchFlushTimeout, BigDecimal streamTimeout, Integer streamKeepAliveLimit, String xFlowId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling eventTypesNameEventsGet");
    }
    
    // create path and map variables
    String localVarPath = "/event-types/{name}/events".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "batch_limit", batchLimit));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stream_limit", streamLimit));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "batch_flush_timeout", batchFlushTimeout));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stream_timeout", streamTimeout));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stream_keep_alive_limit", streamKeepAliveLimit));
    

    if (xNakadiCursors != null)
      localVarHeaderParams.put("X-nakadi-cursors", apiClient.parameterToString(xNakadiCursors));
    if (xFlowId != null)
      localVarHeaderParams.put("X-Flow-Id", apiClient.parameterToString(xFlowId));
    

    

    final String[] localVarAccepts = {
      "application/x-json-stream"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    
    GenericType<EventStreamBatch> localVarReturnType = new GenericType<EventStreamBatch>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
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
