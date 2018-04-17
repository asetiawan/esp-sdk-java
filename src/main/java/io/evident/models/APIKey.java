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
import io.evident.models.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * A(n) APIKey object
 */
@ApiModel(description = "A(n) APIKey object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-13T15:00:39.690-05:00")
public class APIKey {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("access_id")
  private String accessId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("last_used_at")
  private DateTime lastUsedAt = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  @SerializedName("secret_key")
  private String secretKey = null;

  @SerializedName("user")
  private User user = null;

  @SerializedName("user_id")
  private Integer userId = null;

  public APIKey id(Integer id) {
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

  public APIKey accessId(String accessId) {
    this.accessId = accessId;
    return this;
  }

   /**
   * Access ID
   * @return accessId
  **/
  @ApiModelProperty(example = "null", value = "Access ID")
  public String getAccessId() {
    return accessId;
  }

  public void setAccessId(String accessId) {
    this.accessId = accessId;
  }

  public APIKey name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the API Key
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the API Key")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public APIKey lastUsedAt(DateTime lastUsedAt) {
    this.lastUsedAt = lastUsedAt;
    return this;
  }

   /**
   * ISO 8601 timestamp when the key was last used
   * @return lastUsedAt
  **/
  @ApiModelProperty(example = "null", value = "ISO 8601 timestamp when the key was last used")
  public DateTime getLastUsedAt() {
    return lastUsedAt;
  }

  public void setLastUsedAt(DateTime lastUsedAt) {
    this.lastUsedAt = lastUsedAt;
  }

  public APIKey createdAt(DateTime createdAt) {
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

  public APIKey updatedAt(DateTime updatedAt) {
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

  public APIKey secretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Secret Key - This will only be returned once when the key is first created.
   * @return secretKey
  **/
  @ApiModelProperty(example = "null", value = "Secret Key - This will only be returned once when the key is first created.")
  public String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }

  public APIKey user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Associated User
   * @return user
  **/
  @ApiModelProperty(example = "null", value = "Associated User")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public APIKey userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Associated User ID
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "Associated User ID")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIKey apIKey = (APIKey) o;
    return Objects.equals(this.id, apIKey.id) &&
        Objects.equals(this.accessId, apIKey.accessId) &&
        Objects.equals(this.name, apIKey.name) &&
        Objects.equals(this.lastUsedAt, apIKey.lastUsedAt) &&
        Objects.equals(this.createdAt, apIKey.createdAt) &&
        Objects.equals(this.updatedAt, apIKey.updatedAt) &&
        Objects.equals(this.secretKey, apIKey.secretKey) &&
        Objects.equals(this.user, apIKey.user) &&
        Objects.equals(this.userId, apIKey.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accessId, name, lastUsedAt, createdAt, updatedAt, secretKey, user, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIKey {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accessId: ").append(toIndentedString(accessId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastUsedAt: ").append(toIndentedString(lastUsedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
