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
import io.evident.models.Organization;
import io.evident.models.Team;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * A(n) SubOrganization object
 */
@ApiModel(description = "A(n) SubOrganization object")

public class SubOrganization {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  @SerializedName("external_accounts")
  private List<ExternalAccount> externalAccounts = new ArrayList<ExternalAccount>();

  @SerializedName("external_account_ids")
  private List<Integer> externalAccountIds = new ArrayList<Integer>();

  @SerializedName("organization")
  private Organization organization = null;

  @SerializedName("organization_id")
  private Integer organizationId = null;

  @SerializedName("teams")
  private List<Team> teams = new ArrayList<Team>();

  @SerializedName("team_ids")
  private List<Integer> teamIds = new ArrayList<Integer>();

  public SubOrganization id(Integer id) {
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

  public SubOrganization name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the sub organization
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Name of the sub organization")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubOrganization createdAt(DateTime createdAt) {
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

  public SubOrganization updatedAt(DateTime updatedAt) {
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

  public SubOrganization externalAccounts(List<ExternalAccount> externalAccounts) {
    this.externalAccounts = externalAccounts;
    return this;
  }

  public SubOrganization addExternalAccountsItem(ExternalAccount externalAccountsItem) {
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

  public SubOrganization externalAccountIds(List<Integer> externalAccountIds) {
    this.externalAccountIds = externalAccountIds;
    return this;
  }

  public SubOrganization addExternalAccountIdsItem(Integer externalAccountIdsItem) {
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

  public SubOrganization organization(Organization organization) {
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

  public SubOrganization organizationId(Integer organizationId) {
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

  public SubOrganization teams(List<Team> teams) {
    this.teams = teams;
    return this;
  }

  public SubOrganization addTeamsItem(Team teamsItem) {
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

  public SubOrganization teamIds(List<Integer> teamIds) {
    this.teamIds = teamIds;
    return this;
  }

  public SubOrganization addTeamIdsItem(Integer teamIdsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubOrganization subOrganization = (SubOrganization) o;
    return Objects.equals(this.id, subOrganization.id) &&
        Objects.equals(this.name, subOrganization.name) &&
        Objects.equals(this.createdAt, subOrganization.createdAt) &&
        Objects.equals(this.updatedAt, subOrganization.updatedAt) &&
        Objects.equals(this.externalAccounts, subOrganization.externalAccounts) &&
        Objects.equals(this.externalAccountIds, subOrganization.externalAccountIds) &&
        Objects.equals(this.organization, subOrganization.organization) &&
        Objects.equals(this.organizationId, subOrganization.organizationId) &&
        Objects.equals(this.teams, subOrganization.teams) &&
        Objects.equals(this.teamIds, subOrganization.teamIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdAt, updatedAt, externalAccounts, externalAccountIds, organization, organizationId, teams, teamIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubOrganization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    externalAccounts: ").append(toIndentedString(externalAccounts)).append("\n");
    sb.append("    externalAccountIds: ").append(toIndentedString(externalAccountIds)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    teamIds: ").append(toIndentedString(teamIds)).append("\n");
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

