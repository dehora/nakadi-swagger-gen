package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.EventTypeStatistics;
import java.util.ArrayList;
import java.util.List;



/**
 * An event type defines the schema and its runtime properties.
 **/

@ApiModel(description = "An event type defines the schema and its runtime properties.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-15T20:45:01.680+01:00")
public class EventType   {
  
  private String name = null;
  private String owningApplication = null;


  public enum CategoryEnum {
    UNDEFINED("undefined"),
    DATA("data"),
    BUSINESS("business");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CategoryEnum category = null;


  public enum EnrichmentStrategiesEnum {
    ENRICHMENT("metadata_enrichment");

    private String value;

    EnrichmentStrategiesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<EnrichmentStrategiesEnum> enrichmentStrategies = new ArrayList<EnrichmentStrategiesEnum>();
  private String partitionStrategy = "random";
  private Object schema = null;
  private List<String> partitionKeyFields = new ArrayList<String>();
  private EventTypeStatistics defaultStatistics = null;

  
  /**
   * Name of this EventType. Encodes the owner/responsible for this EventType.\n\nThe name for the EventType SHOULD follow the pattern, but is not enforced\n'stups_owning_application.event-type', for example 'gizig.price-change'.\n\nThe components of the name are:\n\n* Organization: the organizational unit where the team is located; can be omitted.\n\n* Team name: name of the team responsible for owning application; can be omitted.\n\n* Owning application: SHOULD match the field owning_application; indicates\n\n* EventType name: name of this EventType; SHOULD end in ChangeEvent for DataChangeEvents;\nMUST be in the past tense for BusinessEvents.\n\n(TBD: how to deal with organizational changes? Should be reflected on the name of the\nEventType?  Isn't it better to omit [organization:team] completely?)\n
   **/
  public EventType name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "order.ORDER_CANCELLED", required = true, value = "Name of this EventType. Encodes the owner/responsible for this EventType.\n\nThe name for the EventType SHOULD follow the pattern, but is not enforced\n'stups_owning_application.event-type', for example 'gizig.price-change'.\n\nThe components of the name are:\n\n* Organization: the organizational unit where the team is located; can be omitted.\n\n* Team name: name of the team responsible for owning application; can be omitted.\n\n* Owning application: SHOULD match the field owning_application; indicates\n\n* EventType name: name of this EventType; SHOULD end in ChangeEvent for DataChangeEvents;\nMUST be in the past tense for BusinessEvents.\n\n(TBD: how to deal with organizational changes? Should be reflected on the name of the\nEventType?  Isn't it better to omit [organization:team] completely?)\n")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Indicator of the (Stups) Application owning this `EventType`.\n
   **/
  public EventType owningApplication(String owningApplication) {
    this.owningApplication = owningApplication;
    return this;
  }
  
  @ApiModelProperty(example = "price-service", required = true, value = "Indicator of the (Stups) Application owning this `EventType`.\n")
  @JsonProperty("owning_application")
  public String getOwningApplication() {
    return owningApplication;
  }
  public void setOwningApplication(String owningApplication) {
    this.owningApplication = owningApplication;
  }

  
  /**
   * Defines the category of this EventType.\n\nThe value set will influence, if not set otherwise, the default set of\nvalidations, enrichment-strategies, and the effective schema for validation in\nthe following way:\n\n- `undefined`: No predefined changes apply. The effective schema for the validation is\n  exactly the same as the `EventTypeSchema`.\n\n- `data`: Events of this category will be DataChangeEvents. The effective schema during\n  the validation contains `metadata`, and adds fields `data_op` and `data_type`. The\n  passed EventTypeSchema defines the schema of `data`.\n\n- `business`: Events of this category will be BusinessEvents. The effective schema for\n  validation contains `metadata` and any additionally defined properties passed in the\n  `EventTypeSchema` directly on top level of the Event. If name conflicts arise, creation\n  of this EventType will be rejected. \n
   **/
  public EventType category(CategoryEnum category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Defines the category of this EventType.\n\nThe value set will influence, if not set otherwise, the default set of\nvalidations, enrichment-strategies, and the effective schema for validation in\nthe following way:\n\n- `undefined`: No predefined changes apply. The effective schema for the validation is\n  exactly the same as the `EventTypeSchema`.\n\n- `data`: Events of this category will be DataChangeEvents. The effective schema during\n  the validation contains `metadata`, and adds fields `data_op` and `data_type`. The\n  passed EventTypeSchema defines the schema of `data`.\n\n- `business`: Events of this category will be BusinessEvents. The effective schema for\n  validation contains `metadata` and any additionally defined properties passed in the\n  `EventTypeSchema` directly on top level of the Event. If name conflicts arise, creation\n  of this EventType will be rejected. \n")
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  
  /**
   * Determines the enrichment to be performed on an Event upon reception. Enrichment is\nperformed once upon reception (and after validation) of an Event and is only possible on\nfields that are not defined on the incoming Event.\n\nFor event types in categories 'business' or 'data' it's mandatory to use\nmetadata_enrichment strategy. For 'undefined' event types it's not possible to use this\nstrategy, since metadata field is not required.\n\nSee documentation for the write operation for details on behaviour in case of unsuccessful\nenrichment.\n
   **/
  public EventType enrichmentStrategies(List<EnrichmentStrategiesEnum> enrichmentStrategies) {
    this.enrichmentStrategies = enrichmentStrategies;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Determines the enrichment to be performed on an Event upon reception. Enrichment is\nperformed once upon reception (and after validation) of an Event and is only possible on\nfields that are not defined on the incoming Event.\n\nFor event types in categories 'business' or 'data' it's mandatory to use\nmetadata_enrichment strategy. For 'undefined' event types it's not possible to use this\nstrategy, since metadata field is not required.\n\nSee documentation for the write operation for details on behaviour in case of unsuccessful\nenrichment.\n")
  @JsonProperty("enrichment_strategies")
  public List<EnrichmentStrategiesEnum> getEnrichmentStrategies() {
    return enrichmentStrategies;
  }
  public void setEnrichmentStrategies(List<EnrichmentStrategiesEnum> enrichmentStrategies) {
    this.enrichmentStrategies = enrichmentStrategies;
  }

  
  /**
   * Determines how the assignment of the event to a partition should be handled.\n\nFor details of possible values, see GET /registry/partition-strategies.\n
   **/
  public EventType partitionStrategy(String partitionStrategy) {
    this.partitionStrategy = partitionStrategy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Determines how the assignment of the event to a partition should be handled.\n\nFor details of possible values, see GET /registry/partition-strategies.\n")
  @JsonProperty("partition_strategy")
  public String getPartitionStrategy() {
    return partitionStrategy;
  }
  public void setPartitionStrategy(String partitionStrategy) {
    this.partitionStrategy = partitionStrategy;
  }

  
  /**
   * The schema for this EventType. Submitted events will be validated against it.\n
   **/
  public EventType schema(Object schema) {
    this.schema = schema;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schema for this EventType. Submitted events will be validated against it.\n")
  @JsonProperty("schema")
  public Object getSchema() {
    return schema;
  }
  public void setSchema(Object schema) {
    this.schema = schema;
  }

  
  /**
   * Required when 'partition_resolution_strategy' is set to 'hash'. Must be absent otherwise.\nIndicates the fields used for evaluatiion the partition of Events of this type.\n\nIf set it MUST be a valid required field as defined in the schema.\n
   **/
  public EventType partitionKeyFields(List<String> partitionKeyFields) {
    this.partitionKeyFields = partitionKeyFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required when 'partition_resolution_strategy' is set to 'hash'. Must be absent otherwise.\nIndicates the fields used for evaluatiion the partition of Events of this type.\n\nIf set it MUST be a valid required field as defined in the schema.\n")
  @JsonProperty("partition_key_fields")
  public List<String> getPartitionKeyFields() {
    return partitionKeyFields;
  }
  public void setPartitionKeyFields(List<String> partitionKeyFields) {
    this.partitionKeyFields = partitionKeyFields;
  }

  
  /**
   * Statistics of this EventType used for optimization purposes. Internal use of these values\nmight change over time.\n(TBD: measured statistics)\n
   **/
  public EventType defaultStatistics(EventTypeStatistics defaultStatistics) {
    this.defaultStatistics = defaultStatistics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Statistics of this EventType used for optimization purposes. Internal use of these values\nmight change over time.\n(TBD: measured statistics)\n")
  @JsonProperty("default_statistics")
  public EventTypeStatistics getDefaultStatistics() {
    return defaultStatistics;
  }
  public void setDefaultStatistics(EventTypeStatistics defaultStatistics) {
    this.defaultStatistics = defaultStatistics;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventType eventType = (EventType) o;
    return Objects.equals(this.name, eventType.name) &&
        Objects.equals(this.owningApplication, eventType.owningApplication) &&
        Objects.equals(this.category, eventType.category) &&
        Objects.equals(this.enrichmentStrategies, eventType.enrichmentStrategies) &&
        Objects.equals(this.partitionStrategy, eventType.partitionStrategy) &&
        Objects.equals(this.schema, eventType.schema) &&
        Objects.equals(this.partitionKeyFields, eventType.partitionKeyFields) &&
        Objects.equals(this.defaultStatistics, eventType.defaultStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, owningApplication, category, enrichmentStrategies, partitionStrategy, schema, partitionKeyFields, defaultStatistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owningApplication: ").append(toIndentedString(owningApplication)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    enrichmentStrategies: ").append(toIndentedString(enrichmentStrategies)).append("\n");
    sb.append("    partitionStrategy: ").append(toIndentedString(partitionStrategy)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    partitionKeyFields: ").append(toIndentedString(partitionKeyFields)).append("\n");
    sb.append("    defaultStatistics: ").append(toIndentedString(defaultStatistics)).append("\n");
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

