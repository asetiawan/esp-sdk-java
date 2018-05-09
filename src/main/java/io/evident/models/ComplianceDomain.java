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
import io.evident.models.ComplianceControl;
import io.evident.models.ComplianceStandard;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * A(n) ComplianceDomain object
 */
@ApiModel(description = "A(n) ComplianceDomain object")

public class ComplianceDomain {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  @SerializedName("position")
  private Integer position = null;

  @SerializedName("compliance_standard")
  private ComplianceStandard complianceStandard = null;

  @SerializedName("compliance_standard_id")
  private Integer complianceStandardId = null;

  @SerializedName("compliance_controls")
  private List<ComplianceControl> complianceControls = new ArrayList<ComplianceControl>();

  @SerializedName("compliance_control_ids")
  private List<Integer> complianceControlIds = new ArrayList<Integer>();

  public ComplianceDomain id(Integer id) {
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

  public ComplianceDomain identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * The identifier of this domain
   * @return identifier
  **/
  @ApiModelProperty(example = "null", value = "The identifier of this domain")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public ComplianceDomain name(String name) {
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

  public ComplianceDomain createdAt(DateTime createdAt) {
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

  public ComplianceDomain updatedAt(DateTime updatedAt) {
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

  public ComplianceDomain position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * The position of this domain within the Standard
   * @return position
  **/
  @ApiModelProperty(example = "null", value = "The position of this domain within the Standard")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public ComplianceDomain complianceStandard(ComplianceStandard complianceStandard) {
    this.complianceStandard = complianceStandard;
    return this;
  }

   /**
   * Associated Compliance Standard
   * @return complianceStandard
  **/
  @ApiModelProperty(example = "null", value = "Associated Compliance Standard")
  public ComplianceStandard getComplianceStandard() {
    return complianceStandard;
  }

  public void setComplianceStandard(ComplianceStandard complianceStandard) {
    this.complianceStandard = complianceStandard;
  }

  public ComplianceDomain complianceStandardId(Integer complianceStandardId) {
    this.complianceStandardId = complianceStandardId;
    return this;
  }

   /**
   * Associated Compliance Standard ID
   * @return complianceStandardId
  **/
  @ApiModelProperty(example = "null", value = "Associated Compliance Standard ID")
  public Integer getComplianceStandardId() {
    return complianceStandardId;
  }

  public void setComplianceStandardId(Integer complianceStandardId) {
    this.complianceStandardId = complianceStandardId;
  }

  public ComplianceDomain complianceControls(List<ComplianceControl> complianceControls) {
    this.complianceControls = complianceControls;
    return this;
  }

  public ComplianceDomain addComplianceControlsItem(ComplianceControl complianceControlsItem) {
    this.complianceControls.add(complianceControlsItem);
    return this;
  }

   /**
   * Associated Compliance Controls
   * @return complianceControls
  **/
  @ApiModelProperty(example = "null", value = "Associated Compliance Controls")
  public List<ComplianceControl> getComplianceControls() {
    return complianceControls;
  }

  public void setComplianceControls(List<ComplianceControl> complianceControls) {
    this.complianceControls = complianceControls;
  }

  public ComplianceDomain complianceControlIds(List<Integer> complianceControlIds) {
    this.complianceControlIds = complianceControlIds;
    return this;
  }

  public ComplianceDomain addComplianceControlIdsItem(Integer complianceControlIdsItem) {
    this.complianceControlIds.add(complianceControlIdsItem);
    return this;
  }

   /**
   * Associated Compliance Controls IDs
   * @return complianceControlIds
  **/
  @ApiModelProperty(example = "null", value = "Associated Compliance Controls IDs")
  public List<Integer> getComplianceControlIds() {
    return complianceControlIds;
  }

  public void setComplianceControlIds(List<Integer> complianceControlIds) {
    this.complianceControlIds = complianceControlIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComplianceDomain complianceDomain = (ComplianceDomain) o;
    return Objects.equals(this.id, complianceDomain.id) &&
        Objects.equals(this.identifier, complianceDomain.identifier) &&
        Objects.equals(this.name, complianceDomain.name) &&
        Objects.equals(this.createdAt, complianceDomain.createdAt) &&
        Objects.equals(this.updatedAt, complianceDomain.updatedAt) &&
        Objects.equals(this.position, complianceDomain.position) &&
        Objects.equals(this.complianceStandard, complianceDomain.complianceStandard) &&
        Objects.equals(this.complianceStandardId, complianceDomain.complianceStandardId) &&
        Objects.equals(this.complianceControls, complianceDomain.complianceControls) &&
        Objects.equals(this.complianceControlIds, complianceDomain.complianceControlIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, identifier, name, createdAt, updatedAt, position, complianceStandard, complianceStandardId, complianceControls, complianceControlIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComplianceDomain {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    complianceStandard: ").append(toIndentedString(complianceStandard)).append("\n");
    sb.append("    complianceStandardId: ").append(toIndentedString(complianceStandardId)).append("\n");
    sb.append("    complianceControls: ").append(toIndentedString(complianceControls)).append("\n");
    sb.append("    complianceControlIds: ").append(toIndentedString(complianceControlIds)).append("\n");
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

