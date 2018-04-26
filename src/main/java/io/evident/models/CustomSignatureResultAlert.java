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
import io.evident.models.CustomSignature;
import io.evident.models.ExternalAccount;
import io.evident.models.Region;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * A(n) CustomSignatureResultAlert object
 */
@ApiModel(description = "A(n) CustomSignatureResultAlert object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-25T13:00:36.864-05:00")
public class CustomSignatureResultAlert {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("resource")
  private String resource = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("tags")
  private List<Object> tags = new ArrayList<Object>();

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  @SerializedName("external_account")
  private ExternalAccount externalAccount = null;

  @SerializedName("external_account_id")
  private Integer externalAccountId = null;

  @SerializedName("region")
  private Region region = null;

  @SerializedName("region_id")
  private Integer regionId = null;

  @SerializedName("custom_signature")
  private CustomSignature customSignature = null;

  @SerializedName("custom_signature_id")
  private Integer customSignatureId = null;

  public CustomSignatureResultAlert id(Integer id) {
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

  public CustomSignatureResultAlert createdAt(DateTime createdAt) {
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

  public CustomSignatureResultAlert status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the alert. Valid values are fail, warn, error, pass, info
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Status of the alert. Valid values are fail, warn, error, pass, info")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CustomSignatureResultAlert resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Resource identifier in Amazon
   * @return resource
  **/
  @ApiModelProperty(example = "null", value = "Resource identifier in Amazon")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public CustomSignatureResultAlert metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Metadata associated with the result
   * @return metadata
  **/
  @ApiModelProperty(example = "null", value = "Metadata associated with the result")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public CustomSignatureResultAlert tags(List<Object> tags) {
    this.tags = tags;
    return this;
  }

  public CustomSignatureResultAlert addTagsItem(Object tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags associated with the result
   * @return tags
  **/
  @ApiModelProperty(example = "null", value = "Tags associated with the result")
  public List<Object> getTags() {
    return tags;
  }

  public void setTags(List<Object> tags) {
    this.tags = tags;
  }

  public CustomSignatureResultAlert updatedAt(DateTime updatedAt) {
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

  public CustomSignatureResultAlert externalAccount(ExternalAccount externalAccount) {
    this.externalAccount = externalAccount;
    return this;
  }

   /**
   * Associated External Account
   * @return externalAccount
  **/
  @ApiModelProperty(example = "null", value = "Associated External Account")
  public ExternalAccount getExternalAccount() {
    return externalAccount;
  }

  public void setExternalAccount(ExternalAccount externalAccount) {
    this.externalAccount = externalAccount;
  }

  public CustomSignatureResultAlert externalAccountId(Integer externalAccountId) {
    this.externalAccountId = externalAccountId;
    return this;
  }

   /**
   * Associated External Account ID
   * @return externalAccountId
  **/
  @ApiModelProperty(example = "null", value = "Associated External Account ID")
  public Integer getExternalAccountId() {
    return externalAccountId;
  }

  public void setExternalAccountId(Integer externalAccountId) {
    this.externalAccountId = externalAccountId;
  }

  public CustomSignatureResultAlert region(Region region) {
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

  public CustomSignatureResultAlert regionId(Integer regionId) {
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

  public CustomSignatureResultAlert customSignature(CustomSignature customSignature) {
    this.customSignature = customSignature;
    return this;
  }

   /**
   * Associated Custom Signature
   * @return customSignature
  **/
  @ApiModelProperty(example = "null", value = "Associated Custom Signature")
  public CustomSignature getCustomSignature() {
    return customSignature;
  }

  public void setCustomSignature(CustomSignature customSignature) {
    this.customSignature = customSignature;
  }

  public CustomSignatureResultAlert customSignatureId(Integer customSignatureId) {
    this.customSignatureId = customSignatureId;
    return this;
  }

   /**
   * Associated Custom Signature ID
   * @return customSignatureId
  **/
  @ApiModelProperty(example = "null", value = "Associated Custom Signature ID")
  public Integer getCustomSignatureId() {
    return customSignatureId;
  }

  public void setCustomSignatureId(Integer customSignatureId) {
    this.customSignatureId = customSignatureId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomSignatureResultAlert customSignatureResultAlert = (CustomSignatureResultAlert) o;
    return Objects.equals(this.id, customSignatureResultAlert.id) &&
        Objects.equals(this.createdAt, customSignatureResultAlert.createdAt) &&
        Objects.equals(this.status, customSignatureResultAlert.status) &&
        Objects.equals(this.resource, customSignatureResultAlert.resource) &&
        Objects.equals(this.metadata, customSignatureResultAlert.metadata) &&
        Objects.equals(this.tags, customSignatureResultAlert.tags) &&
        Objects.equals(this.updatedAt, customSignatureResultAlert.updatedAt) &&
        Objects.equals(this.externalAccount, customSignatureResultAlert.externalAccount) &&
        Objects.equals(this.externalAccountId, customSignatureResultAlert.externalAccountId) &&
        Objects.equals(this.region, customSignatureResultAlert.region) &&
        Objects.equals(this.regionId, customSignatureResultAlert.regionId) &&
        Objects.equals(this.customSignature, customSignatureResultAlert.customSignature) &&
        Objects.equals(this.customSignatureId, customSignatureResultAlert.customSignatureId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, status, resource, metadata, tags, updatedAt, externalAccount, externalAccountId, region, regionId, customSignature, customSignatureId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomSignatureResultAlert {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    externalAccount: ").append(toIndentedString(externalAccount)).append("\n");
    sb.append("    externalAccountId: ").append(toIndentedString(externalAccountId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    customSignature: ").append(toIndentedString(customSignature)).append("\n");
    sb.append("    customSignatureId: ").append(toIndentedString(customSignatureId)).append("\n");
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

