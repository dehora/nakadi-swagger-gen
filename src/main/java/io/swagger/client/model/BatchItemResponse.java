package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;



/**
 * A status corresponding to one individual Event&#39;s publishing attempt.\n
 **/

@ApiModel(description = "A status corresponding to one individual Event's publishing attempt.\n")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-15T20:45:01.680+01:00")
public class BatchItemResponse   {
  
  private UUID eid = null;


  public enum PublishingStatusEnum {
    SUBMITTED("submitted"),
    FAILED("failed"),
    ABORTED("aborted");

    private String value;

    PublishingStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private PublishingStatusEnum publishingStatus = null;


  public enum StepEnum {
    NONE("none"),
    VALIDATING("validating"),
    ENRICHING("enriching"),
    PARTITIONING("partitioning"),
    PUBLISHING("publishing");

    private String value;

    StepEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StepEnum step = null;
  private String detail = null;

  
  /**
   * eid of the corresponding item. Will be absent if missing on the incoming Event.\n
   **/
  public BatchItemResponse eid(UUID eid) {
    this.eid = eid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "eid of the corresponding item. Will be absent if missing on the incoming Event.\n")
  @JsonProperty("eid")
  public UUID getEid() {
    return eid;
  }
  public void setEid(UUID eid) {
    this.eid = eid;
  }

  
  /**
   * Indicator of the submission of the Event within a Batch.\n\n- \"submitted\" indicates successful submission, including commit on he underlying broker.\n\n- \"failed\" indicates the message submission was not possible and can be resubmitted if so\n  desired.\n\n- \"aborted\" indicates that the submission of this item was not attempted any further due\n  to a failure on another item in the batch.\n
   **/
  public BatchItemResponse publishingStatus(PublishingStatusEnum publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicator of the submission of the Event within a Batch.\n\n- \"submitted\" indicates successful submission, including commit on he underlying broker.\n\n- \"failed\" indicates the message submission was not possible and can be resubmitted if so\n  desired.\n\n- \"aborted\" indicates that the submission of this item was not attempted any further due\n  to a failure on another item in the batch.\n")
  @JsonProperty("publishing_status")
  public PublishingStatusEnum getPublishingStatus() {
    return publishingStatus;
  }
  public void setPublishingStatus(PublishingStatusEnum publishingStatus) {
    this.publishingStatus = publishingStatus;
  }

  
  /**
   * Indicator of the step in the publishing process this Event reached.\n\nIn Items that \"failed\" means the step of the failure.\n\n- \"none\" indicates that nothing was yet attempted for the publishing of this Event. Should\n  be present only in the case of aborting the publishing during the validation of another\n  (previous) Event.\n\n- \"validating\", \"enriching\", \"partitioning\" and \"publishing\" indicate all the\n  corresponding steps of the publishing process.\n
   **/
  public BatchItemResponse step(StepEnum step) {
    this.step = step;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicator of the step in the publishing process this Event reached.\n\nIn Items that \"failed\" means the step of the failure.\n\n- \"none\" indicates that nothing was yet attempted for the publishing of this Event. Should\n  be present only in the case of aborting the publishing during the validation of another\n  (previous) Event.\n\n- \"validating\", \"enriching\", \"partitioning\" and \"publishing\" indicate all the\n  corresponding steps of the publishing process.\n")
  @JsonProperty("step")
  public StepEnum getStep() {
    return step;
  }
  public void setStep(StepEnum step) {
    this.step = step;
  }

  
  /**
   * Human readable information about the failure on this item. Items that are not \"submitted\"\nshould have a description.\n
   **/
  public BatchItemResponse detail(String detail) {
    this.detail = detail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Human readable information about the failure on this item. Items that are not \"submitted\"\nshould have a description.\n")
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }
  public void setDetail(String detail) {
    this.detail = detail;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchItemResponse batchItemResponse = (BatchItemResponse) o;
    return Objects.equals(this.eid, batchItemResponse.eid) &&
        Objects.equals(this.publishingStatus, batchItemResponse.publishingStatus) &&
        Objects.equals(this.step, batchItemResponse.step) &&
        Objects.equals(this.detail, batchItemResponse.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eid, publishingStatus, step, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchItemResponse {\n");
    
    sb.append("    eid: ").append(toIndentedString(eid)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

