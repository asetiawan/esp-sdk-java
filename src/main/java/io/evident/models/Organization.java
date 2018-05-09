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
import io.evident.models.ComplianceStandard;
import io.evident.models.CustomSignature;
import io.evident.models.ExternalAccount;
import io.evident.models.Integration;
import io.evident.models.SubOrganization;
import io.evident.models.Subscription;
import io.evident.models.Team;
import io.evident.models.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * A(n) Organization object
 */
@ApiModel(description = "A(n) Organization object")

public class Organization {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("require_mfa")
  private Boolean requireMfa = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  @SerializedName("subscription")
  private Subscription subscription = null;

  @SerializedName("subscription_id")
  private Integer subscriptionId = null;

  @SerializedName("custom_signatures")
  private List<CustomSignature> customSignatures = new ArrayList<CustomSignature>();

  @SerializedName("custom_signature_ids")
  private List<Integer> customSignatureIds = new ArrayList<Integer>();

  @SerializedName("external_accounts")
  private List<ExternalAccount> externalAccounts = new ArrayList<ExternalAccount>();

  @SerializedName("external_account_ids")
  private List<Integer> externalAccountIds = new ArrayList<Integer>();

  @SerializedName("sub_organizations")
  private List<SubOrganization> subOrganizations = new ArrayList<SubOrganization>();

  @SerializedName("sub_organization_ids")
  private List<Integer> subOrganizationIds = new ArrayList<Integer>();

  @SerializedName("teams")
  private List<Team> teams = new ArrayList<Team>();

  @SerializedName("team_ids")
  private List<Integer> teamIds = new ArrayList<Integer>();

  @SerializedName("users")
  private List<User> users = new ArrayList<User>();

  @SerializedName("user_ids")
  private List<Integer> userIds = new ArrayList<Integer>();

  @SerializedName("compliance_standards")
  private List<ComplianceStandard> complianceStandards = new ArrayList<ComplianceStandard>();

  @SerializedName("compliance_standard_ids")
  private List<Integer> complianceStandardIds = new ArrayList<Integer>();

  @SerializedName("integrations")
  private List<Integration> integrations = new ArrayList<Integration>();

  @SerializedName("integration_ids")
  private List<Integer> integrationIds = new ArrayList<Integer>();

  public Organization id(Integer id) {
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

  public Organization createdAt(DateTime createdAt) {
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

  public Organization name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the organization
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Name of the organization")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Organization requireMfa(Boolean requireMfa) {
    this.requireMfa = requireMfa;
    return this;
  }

   /**
   * Whether or not users for this organization are required to enable Multi Factor Authentication
   * @return requireMfa
  **/
  @ApiModelProperty(example = "null", value = "Whether or not users for this organization are required to enable Multi Factor Authentication")
  public Boolean getRequireMfa() {
    return requireMfa;
  }

  public void setRequireMfa(Boolean requireMfa) {
    this.requireMfa = requireMfa;
  }

  public Organization updatedAt(DateTime updatedAt) {
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

  public Organization subscription(Subscription subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * Associated Subscription
   * @return subscription
  **/
  @ApiModelProperty(example = "null", value = "Associated Subscription")
  public Subscription getSubscription() {
    return subscription;
  }

  public void setSubscription(Subscription subscription) {
    this.subscription = subscription;
  }

  public Organization subscriptionId(Integer subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Associated Subscription ID
   * @return subscriptionId
  **/
  @ApiModelProperty(example = "null", value = "Associated Subscription ID")
  public Integer getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(Integer subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public Organization customSignatures(List<CustomSignature> customSignatures) {
    this.customSignatures = customSignatures;
    return this;
  }

  public Organization addCustomSignaturesItem(CustomSignature customSignaturesItem) {
    this.customSignatures.add(customSignaturesItem);
    return this;
  }

   /**
   * Associated Custom Signatures
   * @return customSignatures
  **/
  @ApiModelProperty(example = "null", value = "Associated Custom Signatures")
  public List<CustomSignature> getCustomSignatures() {
    return customSignatures;
  }

  public void setCustomSignatures(List<CustomSignature> customSignatures) {
    this.customSignatures = customSignatures;
  }

  public Organization customSignatureIds(List<Integer> customSignatureIds) {
    this.customSignatureIds = customSignatureIds;
    return this;
  }

  public Organization addCustomSignatureIdsItem(Integer customSignatureIdsItem) {
    this.customSignatureIds.add(customSignatureIdsItem);
    return this;
  }

   /**
   * Associated Custom Signatures IDs
   * @return customSignatureIds
  **/
  @ApiModelProperty(example = "null", value = "Associated Custom Signatures IDs")
  public List<Integer> getCustomSignatureIds() {
    return customSignatureIds;
  }

  public void setCustomSignatureIds(List<Integer> customSignatureIds) {
    this.customSignatureIds = customSignatureIds;
  }

  public Organization externalAccounts(List<ExternalAccount> externalAccounts) {
    this.externalAccounts = externalAccounts;
    return this;
  }

  public Organization addExternalAccountsItem(ExternalAccount externalAccountsItem) {
    this.externalAccounts.add(externalAccountsItem);
    return this;
  }

   /**
   * Associated External Accounts
   * @return externalAccounts
  **/
  @ApiModelProperty(example = "null", value = "Associated External Accounts")
  public List<ExternalAccount> getExternalAccounts() {
    return externalAccounts;
  }

  public void setExternalAccounts(List<ExternalAccount> externalAccounts) {
    this.externalAccounts = externalAccounts;
  }

  public Organization externalAccountIds(List<Integer> externalAccountIds) {
    this.externalAccountIds = externalAccountIds;
    return this;
  }

  public Organization addExternalAccountIdsItem(Integer externalAccountIdsItem) {
    this.externalAccountIds.add(externalAccountIdsItem);
    return this;
  }

   /**
   * Associated External Accounts IDs
   * @return externalAccountIds
  **/
  @ApiModelProperty(example = "null", value = "Associated External Accounts IDs")
  public List<Integer> getExternalAccountIds() {
    return externalAccountIds;
  }

  public void setExternalAccountIds(List<Integer> externalAccountIds) {
    this.externalAccountIds = externalAccountIds;
  }

  public Organization subOrganizations(List<SubOrganization> subOrganizations) {
    this.subOrganizations = subOrganizations;
    return this;
  }

  public Organization addSubOrganizationsItem(SubOrganization subOrganizationsItem) {
    this.subOrganizations.add(subOrganizationsItem);
    return this;
  }

   /**
   * Associated Sub Organizations
   * @return subOrganizations
  **/
  @ApiModelProperty(example = "null", value = "Associated Sub Organizations")
  public List<SubOrganization> getSubOrganizations() {
    return subOrganizations;
  }

  public void setSubOrganizations(List<SubOrganization> subOrganizations) {
    this.subOrganizations = subOrganizations;
  }

  public Organization subOrganizationIds(List<Integer> subOrganizationIds) {
    this.subOrganizationIds = subOrganizationIds;
    return this;
  }

  public Organization addSubOrganizationIdsItem(Integer subOrganizationIdsItem) {
    this.subOrganizationIds.add(subOrganizationIdsItem);
    return this;
  }

   /**
   * Associated Sub Organizations IDs
   * @return subOrganizationIds
  **/
  @ApiModelProperty(example = "null", value = "Associated Sub Organizations IDs")
  public List<Integer> getSubOrganizationIds() {
    return subOrganizationIds;
  }

  public void setSubOrganizationIds(List<Integer> subOrganizationIds) {
    this.subOrganizationIds = subOrganizationIds;
  }

  public Organization teams(List<Team> teams) {
    this.teams = teams;
    return this;
  }

  public Organization addTeamsItem(Team teamsItem) {
    this.teams.add(teamsItem);
    return this;
  }

   /**
   * Associated Teams
   * @return teams
  **/
  @ApiModelProperty(example = "null", value = "Associated Teams")
  public List<Team> getTeams() {
    return teams;
  }

  public void setTeams(List<Team> teams) {
    this.teams = teams;
  }

  public Organization teamIds(List<Integer> teamIds) {
    this.teamIds = teamIds;
    return this;
  }

  public Organization addTeamIdsItem(Integer teamIdsItem) {
    this.teamIds.add(teamIdsItem);
    return this;
  }

   /**
   * Associated Teams IDs
   * @return teamIds
  **/
  @ApiModelProperty(example = "null", value = "Associated Teams IDs")
  public List<Integer> getTeamIds() {
    return teamIds;
  }

  public void setTeamIds(List<Integer> teamIds) {
    this.teamIds = teamIds;
  }

  public Organization users(List<User> users) {
    this.users = users;
    return this;
  }

  public Organization addUsersItem(User usersItem) {
    this.users.add(usersItem);
    return this;
  }

   /**
   * Associated Users
   * @return users
  **/
  @ApiModelProperty(example = "null", value = "Associated Users")
  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }

  public Organization userIds(List<Integer> userIds) {
    this.userIds = userIds;
    return this;
  }

  public Organization addUserIdsItem(Integer userIdsItem) {
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Associated Users IDs
   * @return userIds
  **/
  @ApiModelProperty(example = "null", value = "Associated Users IDs")
  public List<Integer> getUserIds() {
    return userIds;
  }

  public void setUserIds(List<Integer> userIds) {
    this.userIds = userIds;
  }

  public Organization complianceStandards(List<ComplianceStandard> complianceStandards) {
    this.complianceStandards = complianceStandards;
    return this;
  }

  public Organization addComplianceStandardsItem(ComplianceStandard complianceStandardsItem) {
    this.complianceStandards.add(complianceStandardsItem);
    return this;
  }

   /**
   * Associated Compliance Standards
   * @return complianceStandards
  **/
  @ApiModelProperty(example = "null", value = "Associated Compliance Standards")
  public List<ComplianceStandard> getComplianceStandards() {
    return complianceStandards;
  }

  public void setComplianceStandards(List<ComplianceStandard> complianceStandards) {
    this.complianceStandards = complianceStandards;
  }

  public Organization complianceStandardIds(List<Integer> complianceStandardIds) {
    this.complianceStandardIds = complianceStandardIds;
    return this;
  }

  public Organization addComplianceStandardIdsItem(Integer complianceStandardIdsItem) {
    this.complianceStandardIds.add(complianceStandardIdsItem);
    return this;
  }

   /**
   * Associated Compliance Standards IDs
   * @return complianceStandardIds
  **/
  @ApiModelProperty(example = "null", value = "Associated Compliance Standards IDs")
  public List<Integer> getComplianceStandardIds() {
    return complianceStandardIds;
  }

  public void setComplianceStandardIds(List<Integer> complianceStandardIds) {
    this.complianceStandardIds = complianceStandardIds;
  }

  public Organization integrations(List<Integration> integrations) {
    this.integrations = integrations;
    return this;
  }

  public Organization addIntegrationsItem(Integration integrationsItem) {
    this.integrations.add(integrationsItem);
    return this;
  }

   /**
   * Associated Integrations
   * @return integrations
  **/
  @ApiModelProperty(example = "null", value = "Associated Integrations")
  public List<Integration> getIntegrations() {
    return integrations;
  }

  public void setIntegrations(List<Integration> integrations) {
    this.integrations = integrations;
  }

  public Organization integrationIds(List<Integer> integrationIds) {
    this.integrationIds = integrationIds;
    return this;
  }

  public Organization addIntegrationIdsItem(Integer integrationIdsItem) {
    this.integrationIds.add(integrationIdsItem);
    return this;
  }

   /**
   * Associated Integrations IDs
   * @return integrationIds
  **/
  @ApiModelProperty(example = "null", value = "Associated Integrations IDs")
  public List<Integer> getIntegrationIds() {
    return integrationIds;
  }

  public void setIntegrationIds(List<Integer> integrationIds) {
    this.integrationIds = integrationIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.id, organization.id) &&
        Objects.equals(this.createdAt, organization.createdAt) &&
        Objects.equals(this.name, organization.name) &&
        Objects.equals(this.requireMfa, organization.requireMfa) &&
        Objects.equals(this.updatedAt, organization.updatedAt) &&
        Objects.equals(this.subscription, organization.subscription) &&
        Objects.equals(this.subscriptionId, organization.subscriptionId) &&
        Objects.equals(this.customSignatures, organization.customSignatures) &&
        Objects.equals(this.customSignatureIds, organization.customSignatureIds) &&
        Objects.equals(this.externalAccounts, organization.externalAccounts) &&
        Objects.equals(this.externalAccountIds, organization.externalAccountIds) &&
        Objects.equals(this.subOrganizations, organization.subOrganizations) &&
        Objects.equals(this.subOrganizationIds, organization.subOrganizationIds) &&
        Objects.equals(this.teams, organization.teams) &&
        Objects.equals(this.teamIds, organization.teamIds) &&
        Objects.equals(this.users, organization.users) &&
        Objects.equals(this.userIds, organization.userIds) &&
        Objects.equals(this.complianceStandards, organization.complianceStandards) &&
        Objects.equals(this.complianceStandardIds, organization.complianceStandardIds) &&
        Objects.equals(this.integrations, organization.integrations) &&
        Objects.equals(this.integrationIds, organization.integrationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, name, requireMfa, updatedAt, subscription, subscriptionId, customSignatures, customSignatureIds, externalAccounts, externalAccountIds, subOrganizations, subOrganizationIds, teams, teamIds, users, userIds, complianceStandards, complianceStandardIds, integrations, integrationIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    requireMfa: ").append(toIndentedString(requireMfa)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    customSignatures: ").append(toIndentedString(customSignatures)).append("\n");
    sb.append("    customSignatureIds: ").append(toIndentedString(customSignatureIds)).append("\n");
    sb.append("    externalAccounts: ").append(toIndentedString(externalAccounts)).append("\n");
    sb.append("    externalAccountIds: ").append(toIndentedString(externalAccountIds)).append("\n");
    sb.append("    subOrganizations: ").append(toIndentedString(subOrganizations)).append("\n");
    sb.append("    subOrganizationIds: ").append(toIndentedString(subOrganizationIds)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    teamIds: ").append(toIndentedString(teamIds)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    complianceStandards: ").append(toIndentedString(complianceStandards)).append("\n");
    sb.append("    complianceStandardIds: ").append(toIndentedString(complianceStandardIds)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    integrationIds: ").append(toIndentedString(integrationIds)).append("\n");
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

