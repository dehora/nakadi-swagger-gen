package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Partition information. Can be helpful when trying to start a stream using an unmanaged API.\n\nThis information is not related to the state of the consumer clients.\n
 **/

@ApiModel(description = "Partition information. Can be helpful when trying to start a stream using an unmanaged API.\n\nThis information is not related to the state of the consumer clients.\n")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-15T20:45:01.680+01:00")
public class Partition   {
  
  private String partition = null;
  private String oldestAvailableOffset = null;
  private String newestAvailableOffset = null;

  
  /**
   **/
  public Partition partition(String partition) {
    this.partition = partition;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("partition")
  public String getPartition() {
    return partition;
  }
  public void setPartition(String partition) {
    this.partition = partition;
  }

  
  /**
   * An offset of the oldest available Event in that partition. This value will be changing\nupon removal of Events from the partition by the background archiving/cleanup mechanism.\n
   **/
  public Partition oldestAvailableOffset(String oldestAvailableOffset) {
    this.oldestAvailableOffset = oldestAvailableOffset;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An offset of the oldest available Event in that partition. This value will be changing\nupon removal of Events from the partition by the background archiving/cleanup mechanism.\n")
  @JsonProperty("oldest_available_offset")
  public String getOldestAvailableOffset() {
    return oldestAvailableOffset;
  }
  public void setOldestAvailableOffset(String oldestAvailableOffset) {
    this.oldestAvailableOffset = oldestAvailableOffset;
  }

  
  /**
   * An offset of the newest available Event in that partition. This value will be changing\nupon reception of new events for this partition by Nakadi.\n\nThis value can be used to construct a cursor when opening streams (see\n`GET /event-type/{name}/events` for details).\n\nMight assume the special name BEGIN, meaning a pointer to the offset of the oldest\navailable event in the partition.\n
   **/
  public Partition newestAvailableOffset(String newestAvailableOffset) {
    this.newestAvailableOffset = newestAvailableOffset;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An offset of the newest available Event in that partition. This value will be changing\nupon reception of new events for this partition by Nakadi.\n\nThis value can be used to construct a cursor when opening streams (see\n`GET /event-type/{name}/events` for details).\n\nMight assume the special name BEGIN, meaning a pointer to the offset of the oldest\navailable event in the partition.\n")
  @JsonProperty("newest_available_offset")
  public String getNewestAvailableOffset() {
    return newestAvailableOffset;
  }
  public void setNewestAvailableOffset(String newestAvailableOffset) {
    this.newestAvailableOffset = newestAvailableOffset;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Partition partition = (Partition) o;
    return Objects.equals(this.partition, partition.partition) &&
        Objects.equals(this.oldestAvailableOffset, partition.oldestAvailableOffset) &&
        Objects.equals(this.newestAvailableOffset, partition.newestAvailableOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partition, oldestAvailableOffset, newestAvailableOffset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Partition {\n");
    
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    oldestAvailableOffset: ").append(toIndentedString(oldestAvailableOffset)).append("\n");
    sb.append("    newestAvailableOffset: ").append(toIndentedString(newestAvailableOffset)).append("\n");
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

