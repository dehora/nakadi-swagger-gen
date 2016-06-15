package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-15T20:45:01.680+01:00")
public class Problem   {
  
  private String type = null;
  private String title = null;
  private Integer status = null;
  private String detail = null;
  private String instance = null;

  
  /**
   * An absolute URI that identifies the problem type.  When dereferenced, it SHOULD provide\nhuman-readable API documentation for the problem type (e.g., using HTML).  This Problem\nobject is the same as provided by https://github.com/zalando/problem\n
   **/
  public Problem type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "http://httpstatus.es/503", required = true, value = "An absolute URI that identifies the problem type.  When dereferenced, it SHOULD provide\nhuman-readable API documentation for the problem type (e.g., using HTML).  This Problem\nobject is the same as provided by https://github.com/zalando/problem\n")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * A short, summary of the problem type. Written in English and readable for engineers\n(usually not suited for non technical stakeholders and not localized)\n
   **/
  public Problem title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "Service Unavailable", required = true, value = "A short, summary of the problem type. Written in English and readable for engineers\n(usually not suited for non technical stakeholders and not localized)\n")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * The HTTP status code generated by the origin server for this occurrence of the problem.\n
   **/
  public Problem status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "503", required = true, value = "The HTTP status code generated by the origin server for this occurrence of the problem.\n")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * A human readable explanation specific to this occurrence of the problem.\n
   **/
  public Problem detail(String detail) {
    this.detail = detail;
    return this;
  }
  
  @ApiModelProperty(example = "Connection to database timed out", value = "A human readable explanation specific to this occurrence of the problem.\n")
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }
  public void setDetail(String detail) {
    this.detail = detail;
  }

  
  /**
   * An absolute URI that identifies the specific occurrence of the problem.\nIt may or may not yield further information if dereferenced.\n
   **/
  public Problem instance(String instance) {
    this.instance = instance;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An absolute URI that identifies the specific occurrence of the problem.\nIt may or may not yield further information if dereferenced.\n")
  @JsonProperty("instance")
  public String getInstance() {
    return instance;
  }
  public void setInstance(String instance) {
    this.instance = instance;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Problem problem = (Problem) o;
    return Objects.equals(this.type, problem.type) &&
        Objects.equals(this.title, problem.title) &&
        Objects.equals(this.status, problem.status) &&
        Objects.equals(this.detail, problem.detail) &&
        Objects.equals(this.instance, problem.instance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, detail, instance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Problem {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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
