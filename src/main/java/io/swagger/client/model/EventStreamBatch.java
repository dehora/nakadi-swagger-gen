package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Cursor;
import io.swagger.client.model.Event;
import java.util.ArrayList;
import java.util.List;



/**
 * One chunk of events in a stream. A batch consists of an array of `Event`s plus a `Cursor`\npointing to the offset of the last Event in the stream.\n\nThe size of the array of Event is limited by the parameters used to initialize a Stream.\n\nIf acting as a keep alive message (see `GET /event-type/{name}/events`) the events array will\nbe omitted.\n\nSequential batches might present repeated cursors if no new events have arrived.\n
 **/

@ApiModel(description = "One chunk of events in a stream. A batch consists of an array of `Event`s plus a `Cursor`\npointing to the offset of the last Event in the stream.\n\nThe size of the array of Event is limited by the parameters used to initialize a Stream.\n\nIf acting as a keep alive message (see `GET /event-type/{name}/events`) the events array will\nbe omitted.\n\nSequential batches might present repeated cursors if no new events have arrived.\n")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-15T21:24:42.545+01:00")
public class EventStreamBatch   {
  
  private Cursor cursor = null;
  private List<Event> events = new ArrayList<Event>();

  
  /**
   **/
  public EventStreamBatch cursor(Cursor cursor) {
    this.cursor = cursor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("cursor")
  public Cursor getCursor() {
    return cursor;
  }
  public void setCursor(Cursor cursor) {
    this.cursor = cursor;
  }

  
  /**
   **/
  public EventStreamBatch events(List<Event> events) {
    this.events = events;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("events")
  public List<Event> getEvents() {
    return events;
  }
  public void setEvents(List<Event> events) {
    this.events = events;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventStreamBatch eventStreamBatch = (EventStreamBatch) o;
    return Objects.equals(this.cursor, eventStreamBatch.cursor) &&
        Objects.equals(this.events, eventStreamBatch.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventStreamBatch {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

