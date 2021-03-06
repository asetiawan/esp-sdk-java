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

/**
 * A(n) IntegrationHipchat object
 */
@ApiModel(description = "A(n) IntegrationHipchat object")

public class IntegrationHipchat {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("room")
  private String room = null;

  @SerializedName("integration")
  private Integration integration = null;

  @SerializedName("integration_id")
  private Integer integrationId = null;

  public IntegrationHipchat id(Integer id) {
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

  public IntegrationHipchat token(String token) {
    this.token = token;
    return this;
  }

   /**
   * The Hipchat token
   * @return token
  **/
  @ApiModelProperty(example = "null", value = "The Hipchat token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public IntegrationHipchat room(String room) {
    this.room = room;
    return this;
  }

   /**
   * The Hipchat room
   * @return room
  **/
  @ApiModelProperty(example = "null", value = "The Hipchat room")
  public String getRoom() {
    return room;
  }

  public void setRoom(String room) {
    this.room = room;
  }

  public IntegrationHipchat integration(Integration integration) {
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

  public IntegrationHipchat integrationId(Integer integrationId) {
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
    IntegrationHipchat integrationHipchat = (IntegrationHipchat) o;
    return Objects.equals(this.id, integrationHipchat.id) &&
        Objects.equals(this.token, integrationHipchat.token) &&
        Objects.equals(this.room, integrationHipchat.room) &&
        Objects.equals(this.integration, integrationHipchat.integration) &&
        Objects.equals(this.integrationId, integrationHipchat.integrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, token, room, integration, integrationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationHipchat {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    room: ").append(toIndentedString(room)).append("\n");
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

