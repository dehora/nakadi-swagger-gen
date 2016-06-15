package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-15T21:24:42.545+01:00")
public class Cursor   {
  
  private String partition = null;
  private String offset = null;

  
  /**
   * Id of the partition pointed to by this cursor.\n
   **/
  public Cursor partition(String partition) {
    this.partition = partition;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id of the partition pointed to by this cursor.\n")
  @JsonProperty("partition")
  public String getPartition() {
    return partition;
  }
  public void setPartition(String partition) {
    this.partition = partition;
  }

  
  /**
   * Offset of the event being pointed to.\n
   **/
  public Cursor offset(String offset) {
    this.offset = offset;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Offset of the event being pointed to.\n")
  @JsonProperty("offset")
  public String getOffset() {
    return offset;
  }
  public void setOffset(String offset) {
    this.offset = offset;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cursor cursor = (Cursor) o;
    return Objects.equals(this.partition, cursor.partition) &&
        Objects.equals(this.offset, cursor.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partition, offset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cursor {\n");
    
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

