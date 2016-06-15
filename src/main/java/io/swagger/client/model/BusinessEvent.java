package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Event;
import io.swagger.client.model.EventMetadata;



/**
 * A Business Event.\n\nUsually represents a status transition in a Business process.    \n
 **/

@ApiModel(description = "A Business Event.\n\nUsually represents a status transition in a Business process.    \n")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-15T20:45:01.680+01:00")
public class BusinessEvent extends Event  {
  
  private EventMetadata metadata = null;

  
  /**
   **/
  public BusinessEvent metadata(EventMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("metadata")
  public EventMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(EventMetadata metadata) {
    this.metadata = metadata;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessEvent businessEvent = (BusinessEvent) o;
    return Objects.equals(this.metadata, businessEvent.metadata) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

