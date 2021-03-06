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
 * A(n) IntegrationSlack object
 */
@ApiModel(description = "A(n) IntegrationSlack object")

public class IntegrationSlack {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  @SerializedName("integration")
  private Integration integration = null;

  @SerializedName("integration_id")
  private Integer integrationId = null;

  public IntegrationSlack id(Integer id) {
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

  public IntegrationSlack url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL for the Slack integration
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "The URL for the Slack integration")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public IntegrationSlack createdAt(DateTime createdAt) {
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

  public IntegrationSlack updatedAt(DateTime updatedAt) {
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

  public IntegrationSlack integration(Integration integration) {
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

  public IntegrationSlack integrationId(Integer integrationId) {
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
    IntegrationSlack integrationSlack = (IntegrationSlack) o;
    return Objects.equals(this.id, integrationSlack.id) &&
        Objects.equals(this.url, integrationSlack.url) &&
        Objects.equals(this.createdAt, integrationSlack.createdAt) &&
        Objects.equals(this.updatedAt, integrationSlack.updatedAt) &&
        Objects.equals(this.integration, integrationSlack.integration) &&
        Objects.equals(this.integrationId, integrationSlack.integrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, createdAt, updatedAt, integration, integrationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationSlack {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

