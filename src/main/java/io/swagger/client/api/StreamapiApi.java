package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.EventStreamBatch;
import io.swagger.client.model.Problem;
import java.math.BigDecimal;
import io.swagger.client.model.Event;
import io.swagger.client.model.BatchItemResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-15T20:45:01.680+01:00")
public class StreamapiApi {
  private ApiClient apiClient;

  public StreamapiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StreamapiApi(ApiClient apiClient) {
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
   * Publishes a batch of `Event`s of this `EventType`. All items must be of the EventType\nidentified by `name`.\n\nReception of Events will always respect the configuration of its `EventType` with respect to\nvalidation, enrichment and partition. The steps performed on reception of incoming message\nare:\n\n1. Every validation rule specified for the `EventType` will be checked in order against the\nincoming Events. Validation rules are evaluated in the order they are defined and the Event\nis **rejected** in the first case of failure. If the offending validation rule provides\ninformation about the violation it will be included in the `BatchItemResponse`.  If the\n`EventType` defines schema validation it will be performed at this moment.\n\n1. Once the validation succeeded, the content of the Event is updated according to the\nenrichment rules in the order the rules are defined in the `EventType`.  No preexisting\nvalue might be changed (even if added by an enrichment rule). Violations on this will force\nthe immediate **rejection** of the Event. The invalid overwrite attempt will be included in\nthe item&#39;s `BatchItemResponse` object.\n\n1. The incoming Event&#39;s relative ordering is evaluated according to the rule on the\n`EventType`. Failure to evaluate the rule will **reject** the Event.\n\nGiven the batched nature of this operation, any violation on validation or failures on\nenrichment or partitioning will cause the whole batch to be rejected, i.e. none of its\nelements are pushed to the underlying broker.\n\nFailures on writing of specific partitions to the broker might influence other\npartitions. Failures at this stage will fail only the affected partitions.\n
   * @param name Name of the EventType (required)
   * @param event The Event being published (required)
   * @param xFlowId The flow id of the request, which is written into the logs and passed to called\nservices. Helpful for operational troubleshooting and log analysis.\n (optional)
   * @throws ApiException if fails to make API call
   */
  public void eventTypesNameEventsPost(String name, List<Event> event, String xFlowId) throws ApiException {
    Object localVarPostBody = event;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling eventTypesNameEventsPost");
    }
    
    // verify the required parameter 'event' is set
    if (event == null) {
      throw new ApiException(400, "Missing the required parameter 'event' when calling eventTypesNameEventsPost");
    }
    
    // create path and map variables
    String localVarPath = "/event-types/{name}/events".replaceAll("\\{format\\}","json")
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

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
}
