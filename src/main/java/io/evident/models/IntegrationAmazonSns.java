/*
 * ESP Documentation
 * The Evident Security Platform API (version 2.0) is designed to allow users granular control over their Amazon Web Service security experience by allowing them to review alerts, monitor signatures, and create custom signatures.
 *
 * OpenAPI spec version: v2_sdk
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.evident.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.evident.models.Integration;
import io.evident.models.Region;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * A(n) IntegrationAmazonSns object
 */
@ApiModel(description = "A(n) IntegrationAmazonSns object")

public class IntegrationAmazonSns {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("topic")
  private String topic = null;

  @SerializedName("region_id")
  private Integer regionId = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  @SerializedName("arn")
  private String arn = null;

  @SerializedName("external_id")
  private String externalId = null;

  @SerializedName("region")
  private Region region = null;

  @SerializedName("integration")
  private Integration integration = null;

  @SerializedName("integration_id")
  private Integer integrationId = null;

  public IntegrationAmazonSns id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Unique ID
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Unique ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public IntegrationAmazonSns topic(String topic) {
    this.topic = topic;
    return this;
  }

   /**
   * The SNS topic arn
   * @return topic
  **/
  @ApiModelProperty(example = "null", value = "The SNS topic arn")
  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public IntegrationAmazonSns regionId(Integer regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Associated Region ID
   * @return regionId
  **/
  @ApiModelProperty(example = "null", value = "Associated Region ID")
  public Integer getRegionId() {
    return regionId;
  }

  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }

  public IntegrationAmazonSns createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 timestamp when the resource was created
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "ISO 8601 timestamp when the resource was created")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public IntegrationAmazonSns updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO 8601 timestamp when the resource was updated
   * @return updatedAt
  **/
  @ApiModelProperty(example = "null", value = "ISO 8601 timestamp when the resource was updated")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public IntegrationAmazonSns arn(String arn) {
    this.arn = arn;
    return this;
  }

   /**
   * The role arn for accessing the SNS topic
   * @return arn
  **/
  @ApiModelProperty(example = "null", value = "The role arn for accessing the SNS topic")
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }

  public IntegrationAmazonSns externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * The external ID for the IAM role
   * @return externalId
  **/
  @ApiModelProperty(example = "null", value = "The external ID for the IAM role")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public IntegrationAmazonSns region(Region region) {
    this.region = region;
    return this;
  }

   /**
   * Associated Region
   * @return region
  **/
  @ApiModelProperty(example = "null", value = "Associated Region")
  public Region getRegion() {
    return region;
  }

  public void setRegion(Region region) {
    this.region = region;
  }

  public IntegrationAmazonSns integration(Integration integration) {
    this.integration = integration;
    return this;
  }

   /**
   * Associated Integration
   * @return integration
  **/
  @ApiModelProperty(example = "null", value = "Associated Integration")
  public Integration getIntegration() {
    return integration;
  }

  public void setIntegration(Integration integration) {
    this.integration = integration;
  }

  public IntegrationAmazonSns integrationId(Integer integrationId) {
    this.integrationId = integrationId;
    return this;
  }

   /**
   * Associated Integration ID
   * @return integrationId
  **/
  @ApiModelProperty(example = "null", value = "Associated Integration ID")
  public Integer getIntegrationId() {
    return integrationId;
  }

  public void setIntegrationId(Integer integrationId) {
    this.integrationId = integrationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationAmazonSns integrationAmazonSns = (IntegrationAmazonSns) o;
    return Objects.equals(this.id, integrationAmazonSns.id) &&
        Objects.equals(this.topic, integrationAmazonSns.topic) &&
        Objects.equals(this.regionId, integrationAmazonSns.regionId) &&
        Objects.equals(this.createdAt, integrationAmazonSns.createdAt) &&
        Objects.equals(this.updatedAt, integrationAmazonSns.updatedAt) &&
        Objects.equals(this.arn, integrationAmazonSns.arn) &&
        Objects.equals(this.externalId, integrationAmazonSns.externalId) &&
        Objects.equals(this.region, integrationAmazonSns.region) &&
        Objects.equals(this.integration, integrationAmazonSns.integration) &&
        Objects.equals(this.integrationId, integrationAmazonSns.integrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, topic, regionId, createdAt, updatedAt, arn, externalId, region, integration, integrationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationAmazonSns {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
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

