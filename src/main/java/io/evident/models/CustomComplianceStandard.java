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
import io.evident.models.CustomComplianceControl;
import io.evident.models.CustomComplianceDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * A(n) CustomComplianceStandard object
 */
@ApiModel(description = "A(n) CustomComplianceStandard object")

public class CustomComplianceStandard {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("organization_id")
  private Integer organizationId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  @SerializedName("max_accounts")
  private Integer maxAccounts = null;

  @SerializedName("max_domains")
  private Integer maxDomains = null;

  @SerializedName("max_controls")
  private Integer maxControls = null;

  @SerializedName("custom_compliance_domains")
  private List<CustomComplianceDomain> customComplianceDomains = new ArrayList<CustomComplianceDomain>();

  @SerializedName("custom_compliance_domain_ids")
  private List<Integer> customComplianceDomainIds = new ArrayList<Integer>();

  @SerializedName("custom_compliance_controls")
  private List<CustomComplianceControl> customComplianceControls = new ArrayList<CustomComplianceControl>();

  @SerializedName("custom_compliance_control_ids")
  private List<Integer> customComplianceControlIds = new ArrayList<Integer>();

  public CustomComplianceStandard id(Integer id) {
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

  public CustomComplianceStandard organizationId(Integer organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * The ID of the organization this custom compliance standard belongs to
   * @return organizationId
  **/
  @ApiModelProperty(example = "null", value = "The ID of the organization this custom compliance standard belongs to")
  public Integer getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(Integer organizationId) {
    this.organizationId = organizationId;
  }

  public CustomComplianceStandard name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomComplianceStandard createdAt(DateTime createdAt) {
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

  public CustomComplianceStandard description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description for this Compliance Standard
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "The description for this Compliance Standard")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CustomComplianceStandard updatedAt(DateTime updatedAt) {
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

  public CustomComplianceStandard maxAccounts(Integer maxAccounts) {
    this.maxAccounts = maxAccounts;
    return this;
  }

   /**
   * The maximum number of external accounts that can be added to the custom compliance standard
   * @return maxAccounts
  **/
  @ApiModelProperty(example = "null", value = "The maximum number of external accounts that can be added to the custom compliance standard")
  public Integer getMaxAccounts() {
    return maxAccounts;
  }

  public void setMaxAccounts(Integer maxAccounts) {
    this.maxAccounts = maxAccounts;
  }

  public CustomComplianceStandard maxDomains(Integer maxDomains) {
    this.maxDomains = maxDomains;
    return this;
  }

   /**
   * The maximum number of custom compliance domains that can be added to the custom compliance standard
   * @return maxDomains
  **/
  @ApiModelProperty(example = "null", value = "The maximum number of custom compliance domains that can be added to the custom compliance standard")
  public Integer getMaxDomains() {
    return maxDomains;
  }

  public void setMaxDomains(Integer maxDomains) {
    this.maxDomains = maxDomains;
  }

  public CustomComplianceStandard maxControls(Integer maxControls) {
    this.maxControls = maxControls;
    return this;
  }

   /**
   * The maximum number of custom compliance controls that can be added to the custom compliance standard
   * @return maxControls
  **/
  @ApiModelProperty(example = "null", value = "The maximum number of custom compliance controls that can be added to the custom compliance standard")
  public Integer getMaxControls() {
    return maxControls;
  }

  public void setMaxControls(Integer maxControls) {
    this.maxControls = maxControls;
  }

  public CustomComplianceStandard customComplianceDomains(List<CustomComplianceDomain> customComplianceDomains) {
    this.customComplianceDomains = customComplianceDomains;
    return this;
  }

  public CustomComplianceStandard addCustomComplianceDomainsItem(CustomComplianceDomain customComplianceDomainsItem) {
    this.customComplianceDomains.add(customComplianceDomainsItem);
    return this;
  }

   /**
   * Associated Custom Compliance Domains
   * @return customComplianceDomains
  **/
  @ApiModelProperty(example = "null", value = "Associated Custom Compliance Domains")
  public List<CustomComplianceDomain> getCustomComplianceDomains() {
    return customComplianceDomains;
  }

  public void setCustomComplianceDomains(List<CustomComplianceDomain> customComplianceDomains) {
    this.customComplianceDomains = customComplianceDomains;
  }

  public CustomComplianceStandard customComplianceDomainIds(List<Integer> customComplianceDomainIds) {
    this.customComplianceDomainIds = customComplianceDomainIds;
    return this;
  }

  public CustomComplianceStandard addCustomComplianceDomainIdsItem(Integer customComplianceDomainIdsItem) {
    this.customComplianceDomainIds.add(customComplianceDomainIdsItem);
    return this;
  }

   /**
   * Associated Custom Compliance Domains IDs
   * @return customComplianceDomainIds
  **/
  @ApiModelProperty(example = "null", value = "Associated Custom Compliance Domains IDs")
  public List<Integer> getCustomComplianceDomainIds() {
    return customComplianceDomainIds;
  }

  public void setCustomComplianceDomainIds(List<Integer> customComplianceDomainIds) {
    this.customComplianceDomainIds = customComplianceDomainIds;
  }

  public CustomComplianceStandard customComplianceControls(List<CustomComplianceControl> customComplianceControls) {
    this.customComplianceControls = customComplianceControls;
    return this;
  }

  public CustomComplianceStandard addCustomComplianceControlsItem(CustomComplianceControl customComplianceControlsItem) {
    this.customComplianceControls.add(customComplianceControlsItem);
    return this;
  }

   /**
   * Associated Custom Compliance Controls
   * @return customComplianceControls
  **/
  @ApiModelProperty(example = "null", value = "Associated Custom Compliance Controls")
  public List<CustomComplianceControl> getCustomComplianceControls() {
    return customComplianceControls;
  }

  public void setCustomComplianceControls(List<CustomComplianceControl> customComplianceControls) {
    this.customComplianceControls = customComplianceControls;
  }

  public CustomComplianceStandard customComplianceControlIds(List<Integer> customComplianceControlIds) {
    this.customComplianceControlIds = customComplianceControlIds;
    return this;
  }

  public CustomComplianceStandard addCustomComplianceControlIdsItem(Integer customComplianceControlIdsItem) {
    this.customComplianceControlIds.add(customComplianceControlIdsItem);
    return this;
  }

   /**
   * Associated Custom Compliance Controls IDs
   * @return customComplianceControlIds
  **/
  @ApiModelProperty(example = "null", value = "Associated Custom Compliance Controls IDs")
  public List<Integer> getCustomComplianceControlIds() {
    return customComplianceControlIds;
  }

  public void setCustomComplianceControlIds(List<Integer> customComplianceControlIds) {
    this.customComplianceControlIds = customComplianceControlIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomComplianceStandard customComplianceStandard = (CustomComplianceStandard) o;
    return Objects.equals(this.id, customComplianceStandard.id) &&
        Objects.equals(this.organizationId, customComplianceStandard.organizationId) &&
        Objects.equals(this.name, customComplianceStandard.name) &&
        Objects.equals(this.createdAt, customComplianceStandard.createdAt) &&
        Objects.equals(this.description, customComplianceStandard.description) &&
        Objects.equals(this.updatedAt, customComplianceStandard.updatedAt) &&
        Objects.equals(this.maxAccounts, customComplianceStandard.maxAccounts) &&
        Objects.equals(this.maxDomains, customComplianceStandard.maxDomains) &&
        Objects.equals(this.maxControls, customComplianceStandard.maxControls) &&
        Objects.equals(this.customComplianceDomains, customComplianceStandard.customComplianceDomains) &&
        Objects.equals(this.customComplianceDomainIds, customComplianceStandard.customComplianceDomainIds) &&
        Objects.equals(this.customComplianceControls, customComplianceStandard.customComplianceControls) &&
        Objects.equals(this.customComplianceControlIds, customComplianceStandard.customComplianceControlIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organizationId, name, createdAt, description, updatedAt, maxAccounts, maxDomains, maxControls, customComplianceDomains, customComplianceDomainIds, customComplianceControls, customComplianceControlIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomComplianceStandard {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    maxAccounts: ").append(toIndentedString(maxAccounts)).append("\n");
    sb.append("    maxDomains: ").append(toIndentedString(maxDomains)).append("\n");
    sb.append("    maxControls: ").append(toIndentedString(maxControls)).append("\n");
    sb.append("    customComplianceDomains: ").append(toIndentedString(customComplianceDomains)).append("\n");
    sb.append("    customComplianceDomainIds: ").append(toIndentedString(customComplianceDomainIds)).append("\n");
    sb.append("    customComplianceControls: ").append(toIndentedString(customComplianceControls)).append("\n");
    sb.append("    customComplianceControlIds: ").append(toIndentedString(customComplianceControlIds)).append("\n");
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

