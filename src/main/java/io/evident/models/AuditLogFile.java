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
import io.evident.models.Organization;
import io.evident.models.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * A(n) AuditLogFile object
 */
@ApiModel(description = "A(n) AuditLogFile object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-25T13:00:36.864-05:00")
public class AuditLogFile {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("file_name")
  private String fileName = null;

  @SerializedName("format")
  private String format = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("organization")
  private Organization organization = null;

  @SerializedName("organization_id")
  private Integer organizationId = null;

  @SerializedName("user")
  private User user = null;

  @SerializedName("user_id")
  private Integer userId = null;

  public AuditLogFile id(Integer id) {
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

  public AuditLogFile fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * File Name
   * @return fileName
  **/
  @ApiModelProperty(example = "null", value = "File Name")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public AuditLogFile format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Format of the file
   * @return format
  **/
  @ApiModelProperty(example = "null", value = "Format of the file")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public AuditLogFile createdAt(DateTime createdAt) {
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

  public AuditLogFile updatedAt(DateTime updatedAt) {
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

  public AuditLogFile url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The expiring URL to download this file from
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "The expiring URL to download this file from")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public AuditLogFile organization(Organization organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Associated Organization
   * @return organization
  **/
  @ApiModelProperty(example = "null", value = "Associated Organization")
  public Organization getOrganization() {
    return organization;
  }

  public void setOrganization(Organization organization) {
    this.organization = organization;
  }

  public AuditLogFile organizationId(Integer organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Associated Organization ID
   * @return organizationId
  **/
  @ApiModelProperty(example = "null", value = "Associated Organization ID")
  public Integer getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(Integer organizationId) {
    this.organizationId = organizationId;
  }

  public AuditLogFile user(User user) {
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

  public AuditLogFile userId(Integer userId) {
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
    AuditLogFile auditLogFile = (AuditLogFile) o;
    return Objects.equals(this.id, auditLogFile.id) &&
        Objects.equals(this.fileName, auditLogFile.fileName) &&
        Objects.equals(this.format, auditLogFile.format) &&
        Objects.equals(this.createdAt, auditLogFile.createdAt) &&
        Objects.equals(this.updatedAt, auditLogFile.updatedAt) &&
        Objects.equals(this.url, auditLogFile.url) &&
        Objects.equals(this.organization, auditLogFile.organization) &&
        Objects.equals(this.organizationId, auditLogFile.organizationId) &&
        Objects.equals(this.user, auditLogFile.user) &&
        Objects.equals(this.userId, auditLogFile.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fileName, format, createdAt, updatedAt, url, organization, organizationId, user, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogFile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
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

