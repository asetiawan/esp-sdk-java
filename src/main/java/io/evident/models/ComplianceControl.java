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
import io.evident.models.ComplianceDomain;
import io.evident.models.ComplianceStandard;
import io.evident.models.Signature;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * A(n) ComplianceControl object
 */
@ApiModel(description = "A(n) ComplianceControl object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-25T13:00:36.864-05:00")
public class ComplianceControl {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  @SerializedName("position")
  private Integer position = null;

  @SerializedName("compliance_standard")
  private ComplianceStandard complianceStandard = null;

  @SerializedName("compliance_standard_id")
  private Integer complianceStandardId = null;

  @SerializedName("compliance_domain")
  private ComplianceDomain complianceDomain = null;

  @SerializedName("compliance_domain_id")
  private Integer complianceDomainId = null;

  @SerializedName("signatures")
  private List<Signature> signatures = new ArrayList<Signature>();

  @SerializedName("signature_ids")
  private List<Integer> signatureIds = new ArrayList<Integer>();

  public ComplianceControl id(Integer id) {
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

  public ComplianceControl createdAt(DateTime createdAt) {
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

  public ComplianceControl name(String name) {
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

  public ComplianceControl identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * The identifier of this control
   * @return identifier
  **/
  @ApiModelProperty(example = "null", value = "The identifier of this control")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public ComplianceControl description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description for this control
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "The description for this control")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ComplianceControl updatedAt(DateTime updatedAt) {
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

  public ComplianceControl position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * The position of this control within the Domain
   * @return position
  **/
  @ApiModelProperty(example = "null", value = "The position of this control within the Domain")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public ComplianceControl complianceStandard(ComplianceStandard complianceStandard) {
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

  public ComplianceControl complianceStandardId(Integer complianceStandardId) {
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

  public ComplianceControl complianceDomain(ComplianceDomain complianceDomain) {
    this.complianceDomain = complianceDomain;
    return this;
  }

   /**
   * Associated Compliance Domain
   * @return complianceDomain
  **/
  @ApiModelProperty(example = "null", value = "Associated Compliance Domain")
  public ComplianceDomain getComplianceDomain() {
    return complianceDomain;
  }

  public void setComplianceDomain(ComplianceDomain complianceDomain) {
    this.complianceDomain = complianceDomain;
  }

  public ComplianceControl complianceDomainId(Integer complianceDomainId) {
    this.complianceDomainId = complianceDomainId;
    return this;
  }

   /**
   * Associated Compliance Domain ID
   * @return complianceDomainId
  **/
  @ApiModelProperty(example = "null", value = "Associated Compliance Domain ID")
  public Integer getComplianceDomainId() {
    return complianceDomainId;
  }

  public void setComplianceDomainId(Integer complianceDomainId) {
    this.complianceDomainId = complianceDomainId;
  }

  public ComplianceControl signatures(List<Signature> signatures) {
    this.signatures = signatures;
    return this;
  }

  public ComplianceControl addSignaturesItem(Signature signaturesItem) {
    this.signatures.add(signaturesItem);
    return this;
  }

   /**
   * Associated Signatures
   * @return signatures
  **/
  @ApiModelProperty(example = "null", value = "Associated Signatures")
  public List<Signature> getSignatures() {
    return signatures;
  }

  public void setSignatures(List<Signature> signatures) {
    this.signatures = signatures;
  }

  public ComplianceControl signatureIds(List<Integer> signatureIds) {
    this.signatureIds = signatureIds;
    return this;
  }

  public ComplianceControl addSignatureIdsItem(Integer signatureIdsItem) {
    this.signatureIds.add(signatureIdsItem);
    return this;
  }

   /**
   * Associated Signatures IDs
   * @return signatureIds
  **/
  @ApiModelProperty(example = "null", value = "Associated Signatures IDs")
  public List<Integer> getSignatureIds() {
    return signatureIds;
  }

  public void setSignatureIds(List<Integer> signatureIds) {
    this.signatureIds = signatureIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComplianceControl complianceControl = (ComplianceControl) o;
    return Objects.equals(this.id, complianceControl.id) &&
        Objects.equals(this.createdAt, complianceControl.createdAt) &&
        Objects.equals(this.name, complianceControl.name) &&
        Objects.equals(this.identifier, complianceControl.identifier) &&
        Objects.equals(this.description, complianceControl.description) &&
        Objects.equals(this.updatedAt, complianceControl.updatedAt) &&
        Objects.equals(this.position, complianceControl.position) &&
        Objects.equals(this.complianceStandard, complianceControl.complianceStandard) &&
        Objects.equals(this.complianceStandardId, complianceControl.complianceStandardId) &&
        Objects.equals(this.complianceDomain, complianceControl.complianceDomain) &&
        Objects.equals(this.complianceDomainId, complianceControl.complianceDomainId) &&
        Objects.equals(this.signatures, complianceControl.signatures) &&
        Objects.equals(this.signatureIds, complianceControl.signatureIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, name, identifier, description, updatedAt, position, complianceStandard, complianceStandardId, complianceDomain, complianceDomainId, signatures, signatureIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComplianceControl {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    complianceStandard: ").append(toIndentedString(complianceStandard)).append("\n");
    sb.append("    complianceStandardId: ").append(toIndentedString(complianceStandardId)).append("\n");
    sb.append("    complianceDomain: ").append(toIndentedString(complianceDomain)).append("\n");
    sb.append("    complianceDomainId: ").append(toIndentedString(complianceDomainId)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
    sb.append("    signatureIds: ").append(toIndentedString(signatureIds)).append("\n");
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

