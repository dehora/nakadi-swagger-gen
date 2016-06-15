package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;



/**
 * **Note** The Event definition will be externalized in future versions of this document.\n\nA basic payload of an Event. The actual schema is dependent on the information configured for\nthe EventType, as is its enforcement (see POST /event-types). Setting of metadata properties\nare dependent on the configured enrichment as well.\n\nFor explanation on default configurations of validation and enrichment, see documentation of\n`EventType.category`.\n\nFor concrete examples of what will be enforced by Nakadi see the objects BusinessEvent and\nDataChangeEvent below.\n
 **/

@ApiModel(description = "**Note** The Event definition will be externalized in future versions of this document.\n\nA basic payload of an Event. The actual schema is dependent on the information configured for\nthe EventType, as is its enforcement (see POST /event-types). Setting of metadata properties\nare dependent on the configured enrichment as well.\n\nFor explanation on default configurations of validation and enrichment, see documentation of\n`EventType.category`.\n\nFor concrete examples of what will be enforced by Nakadi see the objects BusinessEvent and\nDataChangeEvent below.\n")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-15T21:24:42.545+01:00")
public class Event   {
  

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
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

