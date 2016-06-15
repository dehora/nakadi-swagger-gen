package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Event;
import io.swagger.client.model.EventMetadata;



/**
 * A Data change Event.\n\nRepresents a change on a resource. Also contains indicators for the data \ntype and the type of operation performed.\n
 **/

@ApiModel(description = "A Data change Event.\n\nRepresents a change on a resource. Also contains indicators for the data \ntype and the type of operation performed.\n")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-15T20:45:01.680+01:00")
public class DataChangeEvent extends Event  {
  
  private String dataType = null;


  public enum DataOpEnum {
    C("C"),
    U("U"),
    D("D"),
    S("S");

    private String value;

    DataOpEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private DataOpEnum dataOp = null;
  private EventMetadata metadata = null;
  private Object data = null;

  
  /**
   **/
  public DataChangeEvent dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }
  
  @ApiModelProperty(example = "pennybags:order", required = true, value = "")
  @JsonProperty("data_type")
  public String getDataType() {
    return dataType;
  }
  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  
  /**
   * The type of operation executed on the entity.\n* C: Creation\n* U: Update\n* D: Deletion\n* S: Snapshot\n
   **/
  public DataChangeEvent dataOp(DataOpEnum dataOp) {
    this.dataOp = dataOp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of operation executed on the entity.\n* C: Creation\n* U: Update\n* D: Deletion\n* S: Snapshot\n")
  @JsonProperty("data_op")
  public DataOpEnum getDataOp() {
    return dataOp;
  }
  public void setDataOp(DataOpEnum dataOp) {
    this.dataOp = dataOp;
  }

  
  /**
   **/
  public DataChangeEvent metadata(EventMetadata metadata) {
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

  
  /**
   * The payload of the type\n
   **/
  public DataChangeEvent data(Object data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The payload of the type\n")
  @JsonProperty("data")
  public Object getData() {
    return data;
  }
  public void setData(Object data) {
    this.data = data;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataChangeEvent dataChangeEvent = (DataChangeEvent) o;
    return Objects.equals(this.dataType, dataChangeEvent.dataType) &&
        Objects.equals(this.dataOp, dataChangeEvent.dataOp) &&
        Objects.equals(this.metadata, dataChangeEvent.metadata) &&
        Objects.equals(this.data, dataChangeEvent.data) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, dataOp, metadata, data, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataChangeEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    dataOp: ").append(toIndentedString(dataOp)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

