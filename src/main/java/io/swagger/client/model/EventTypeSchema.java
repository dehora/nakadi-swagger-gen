package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.EventTypeSchema;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-15T21:24:42.545+01:00")
public class EventTypeSchema   {
  


  public enum TypeEnum {
    SCHEMA("json_schema");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type = null;
  private EventTypeSchema schema = null;

  
  /**
   * The type of schema definition. Currently only json_schema (JSON Schema v04) is supported, but in the\nfuture there could be others.\n
   **/
  public EventTypeSchema type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of schema definition. Currently only json_schema (JSON Schema v04) is supported, but in the\nfuture there could be others.\n")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * The schema as string in the syntax defined in the field type. Failure to respect the\nsyntax will fail any operation on an EventType.\n\nTo have a generic, undefined schema it is possible to define the schema as `\"schema\":\n\"{\\\"additionalProperties\\\": true}\"`.\n
   **/
  public EventTypeSchema schema(EventTypeSchema schema) {
    this.schema = schema;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schema as string in the syntax defined in the field type. Failure to respect the\nsyntax will fail any operation on an EventType.\n\nTo have a generic, undefined schema it is possible to define the schema as `\"schema\":\n\"{\\\"additionalProperties\\\": true}\"`.\n")
  @JsonProperty("schema")
  public EventTypeSchema getSchema() {
    return schema;
  }
  public void setSchema(EventTypeSchema schema) {
    this.schema = schema;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventTypeSchema eventTypeSchema = (EventTypeSchema) o;
    return Objects.equals(this.type, eventTypeSchema.type) &&
        Objects.equals(this.schema, eventTypeSchema.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventTypeSchema {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

