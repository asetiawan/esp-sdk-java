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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * A(n) IntegrationPagerDuty object
 */
@ApiModel(description = "A(n) IntegrationPagerDuty object")

public class IntegrationPagerDuty {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("api_key")
  private String apiKey = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  @SerializedName("integration")
  private Integration integration = null;

  @SerializedName("integration_id")
  private Integer integrationId = null;

  public IntegrationPagerDuty id(Integer id) {
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

  public IntegrationPagerDuty apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * The API Key for the PagerDuty Integration
   * @return apiKey
  **/
  @ApiModelProperty(example = "null", value = "The API Key for the PagerDuty Integration")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public IntegrationPagerDuty createdAt(DateTime createdAt) {
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

  public IntegrationPagerDuty updatedAt(DateTime updatedAt) {
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

  public IntegrationPagerDuty integration(Integration integration) {
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

  public IntegrationPagerDuty integrationId(Integer integrationId) {
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
    IntegrationPagerDuty integrationPagerDuty = (IntegrationPagerDuty) o;
    return Objects.equals(this.id, integrationPagerDuty.id) &&
        Objects.equals(this.apiKey, integrationPagerDuty.apiKey) &&
        Objects.equals(this.createdAt, integrationPagerDuty.createdAt) &&
        Objects.equals(this.updatedAt, integrationPagerDuty.updatedAt) &&
        Objects.equals(this.integration, integrationPagerDuty.integration) &&
        Objects.equals(this.integrationId, integrationPagerDuty.integrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, apiKey, createdAt, updatedAt, integration, integrationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationPagerDuty {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

