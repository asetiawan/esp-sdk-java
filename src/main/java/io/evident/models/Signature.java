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
import io.evident.models.ExternalAccount;
import io.evident.models.Service;
import io.evident.models.Suppression;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * A(n) Signature object
 */
@ApiModel(description = "A(n) Signature object")

public class Signature {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("resolution")
  private String resolution = null;

  @SerializedName("risk_level")
  private String riskLevel = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  @SerializedName("custom_risk_level")
  private String customRiskLevel = null;

  @SerializedName("service")
  private Service service = null;

  @SerializedName("service_id")
  private Integer serviceId = null;

  @SerializedName("disabled_external_accounts")
  private ExternalAccount disabledExternalAccounts = null;

  @SerializedName("suppressions")
  private List<Suppression> suppressions = new ArrayList<Suppression>();

  @SerializedName("suppression_ids")
  private List<Integer> suppressionIds = new ArrayList<Integer>();

  public Signature id(Integer id) {
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

  public Signature createdAt(DateTime createdAt) {
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

  public Signature description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the signature
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "The description of the signature")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Signature identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * The identifier of the signature
   * @return identifier
  **/
  @ApiModelProperty(example = "null", value = "The identifier of the signature")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Signature name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the signature
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the signature")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Signature resolution(String resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * Details for how to resolve this signature
   * @return resolution
  **/
  @ApiModelProperty(example = "null", value = "Details for how to resolve this signature")
  public String getResolution() {
    return resolution;
  }

  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  public Signature riskLevel(String riskLevel) {
    this.riskLevel = riskLevel;
    return this;
  }

   /**
   * The risk-level of the problem identified by the signature. Valid values are low, medium, high
   * @return riskLevel
  **/
  @ApiModelProperty(example = "null", value = "The risk-level of the problem identified by the signature. Valid values are low, medium, high")
  public String getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(String riskLevel) {
    this.riskLevel = riskLevel;
  }

  public Signature updatedAt(DateTime updatedAt) {
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

  public Signature customRiskLevel(String customRiskLevel) {
    this.customRiskLevel = customRiskLevel;
    return this;
  }

   /**
   * The custom risk-level of the problem identified by the signature for this external_account. Valid values are low, medium, high
   * @return customRiskLevel
  **/
  @ApiModelProperty(example = "null", value = "The custom risk-level of the problem identified by the signature for this external_account. Valid values are low, medium, high")
  public String getCustomRiskLevel() {
    return customRiskLevel;
  }

  public void setCustomRiskLevel(String customRiskLevel) {
    this.customRiskLevel = customRiskLevel;
  }

  public Signature service(Service service) {
    this.service = service;
    return this;
  }

   /**
   * Associated Service
   * @return service
  **/
  @ApiModelProperty(example = "null", value = "Associated Service")
  public Service getService() {
    return service;
  }

  public void setService(Service service) {
    this.service = service;
  }

  public Signature serviceId(Integer serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Associated Service ID
   * @return serviceId
  **/
  @ApiModelProperty(example = "null", value = "Associated Service ID")
  public Integer getServiceId() {
    return serviceId;
  }

  public void setServiceId(Integer serviceId) {
    this.serviceId = serviceId;
  }

  public Signature disabledExternalAccounts(ExternalAccount disabledExternalAccounts) {
    this.disabledExternalAccounts = disabledExternalAccounts;
    return this;
  }

   /**
   * Associated Disabled External Accounts
   * @return disabledExternalAccounts
  **/
  @ApiModelProperty(example = "null", value = "Associated Disabled External Accounts")
  public ExternalAccount getDisabledExternalAccounts() {
    return disabledExternalAccounts;
  }

  public void setDisabledExternalAccounts(ExternalAccount disabledExternalAccounts) {
    this.disabledExternalAccounts = disabledExternalAccounts;
  }

  public Signature suppressions(List<Suppression> suppressions) {
    this.suppressions = suppressions;
    return this;
  }

  public Signature addSuppressionsItem(Suppression suppressionsItem) {
    this.suppressions.add(suppressionsItem);
    return this;
  }

   /**
   * Associated Suppressions
   * @return suppressions
  **/
  @ApiModelProperty(example = "null", value = "Associated Suppressions")
  public List<Suppression> getSuppressions() {
    return suppressions;
  }

  public void setSuppressions(List<Suppression> suppressions) {
    this.suppressions = suppressions;
  }

  public Signature suppressionIds(List<Integer> suppressionIds) {
    this.suppressionIds = suppressionIds;
    return this;
  }

  public Signature addSuppressionIdsItem(Integer suppressionIdsItem) {
    this.suppressionIds.add(suppressionIdsItem);
    return this;
  }

   /**
   * Associated Suppressions IDs
   * @return suppressionIds
  **/
  @ApiModelProperty(example = "null", value = "Associated Suppressions IDs")
  public List<Integer> getSuppressionIds() {
    return suppressionIds;
  }

  public void setSuppressionIds(List<Integer> suppressionIds) {
    this.suppressionIds = suppressionIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Signature signature = (Signature) o;
    return Objects.equals(this.id, signature.id) &&
        Objects.equals(this.createdAt, signature.createdAt) &&
        Objects.equals(this.description, signature.description) &&
        Objects.equals(this.identifier, signature.identifier) &&
        Objects.equals(this.name, signature.name) &&
        Objects.equals(this.resolution, signature.resolution) &&
        Objects.equals(this.riskLevel, signature.riskLevel) &&
        Objects.equals(this.updatedAt, signature.updatedAt) &&
        Objects.equals(this.customRiskLevel, signature.customRiskLevel) &&
        Objects.equals(this.service, signature.service) &&
        Objects.equals(this.serviceId, signature.serviceId) &&
        Objects.equals(this.disabledExternalAccounts, signature.disabledExternalAccounts) &&
        Objects.equals(this.suppressions, signature.suppressions) &&
        Objects.equals(this.suppressionIds, signature.suppressionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, description, identifier, name, resolution, riskLevel, updatedAt, customRiskLevel, service, serviceId, disabledExternalAccounts, suppressions, suppressionIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Signature {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    customRiskLevel: ").append(toIndentedString(customRiskLevel)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    disabledExternalAccounts: ").append(toIndentedString(disabledExternalAccounts)).append("\n");
    sb.append("    suppressions: ").append(toIndentedString(suppressions)).append("\n");
    sb.append("    suppressionIds: ").append(toIndentedString(suppressionIds)).append("\n");
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

