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
import io.evident.models.Alert;
import io.evident.models.ExternalAccount;
import io.evident.models.Organization;
import io.evident.models.Stat;
import io.evident.models.SubOrganization;
import io.evident.models.Team;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * A(n) Report object
 */
@ApiModel(description = "A(n) Report object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-13T15:00:39.690-05:00")
public class Report {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  @SerializedName("organization")
  private Organization organization = null;

  @SerializedName("organization_id")
  private Integer organizationId = null;

  @SerializedName("sub_organization")
  private SubOrganization subOrganization = null;

  @SerializedName("sub_organization_id")
  private Integer subOrganizationId = null;

  @SerializedName("team")
  private Team team = null;

  @SerializedName("team_id")
  private Integer teamId = null;

  @SerializedName("external_account")
  private ExternalAccount externalAccount = null;

  @SerializedName("external_account_id")
  private Integer externalAccountId = null;

  @SerializedName("alerts")
  private List<Alert> alerts = new ArrayList<Alert>();

  @SerializedName("alert_ids")
  private List<Integer> alertIds = new ArrayList<Integer>();

  @SerializedName("stat")
  private Stat stat = null;

  @SerializedName("stat_id")
  private Integer statId = null;

  public Report id(Integer id) {
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

  public Report createdAt(DateTime createdAt) {
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

  public Report status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the report. Valid values are queued, processing, partial, complete, failed
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Status of the report. Valid values are queued, processing, partial, complete, failed")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Report updatedAt(DateTime updatedAt) {
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

  public Report organization(Organization organization) {
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

  public Report organizationId(Integer organizationId) {
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

  public Report subOrganization(SubOrganization subOrganization) {
    this.subOrganization = subOrganization;
    return this;
  }

   /**
   * Associated Sub Organization
   * @return subOrganization
  **/
  @ApiModelProperty(example = "null", value = "Associated Sub Organization")
  public SubOrganization getSubOrganization() {
    return subOrganization;
  }

  public void setSubOrganization(SubOrganization subOrganization) {
    this.subOrganization = subOrganization;
  }

  public Report subOrganizationId(Integer subOrganizationId) {
    this.subOrganizationId = subOrganizationId;
    return this;
  }

   /**
   * Associated Sub Organization ID
   * @return subOrganizationId
  **/
  @ApiModelProperty(example = "null", value = "Associated Sub Organization ID")
  public Integer getSubOrganizationId() {
    return subOrganizationId;
  }

  public void setSubOrganizationId(Integer subOrganizationId) {
    this.subOrganizationId = subOrganizationId;
  }

  public Report team(Team team) {
    this.team = team;
    return this;
  }

   /**
   * Associated Team
   * @return team
  **/
  @ApiModelProperty(example = "null", value = "Associated Team")
  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }

  public Report teamId(Integer teamId) {
    this.teamId = teamId;
    return this;
  }

   /**
   * Associated Team ID
   * @return teamId
  **/
  @ApiModelProperty(example = "null", value = "Associated Team ID")
  public Integer getTeamId() {
    return teamId;
  }

  public void setTeamId(Integer teamId) {
    this.teamId = teamId;
  }

  public Report externalAccount(ExternalAccount externalAccount) {
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

  public Report externalAccountId(Integer externalAccountId) {
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

  public Report alerts(List<Alert> alerts) {
    this.alerts = alerts;
    return this;
  }

  public Report addAlertsItem(Alert alertsItem) {
    this.alerts.add(alertsItem);
    return this;
  }

   /**
   * Associated Alerts
   * @return alerts
  **/
  @ApiModelProperty(example = "null", value = "Associated Alerts")
  public List<Alert> getAlerts() {
    return alerts;
  }

  public void setAlerts(List<Alert> alerts) {
    this.alerts = alerts;
  }

  public Report alertIds(List<Integer> alertIds) {
    this.alertIds = alertIds;
    return this;
  }

  public Report addAlertIdsItem(Integer alertIdsItem) {
    this.alertIds.add(alertIdsItem);
    return this;
  }

   /**
   * Associated Alerts IDs
   * @return alertIds
  **/
  @ApiModelProperty(example = "null", value = "Associated Alerts IDs")
  public List<Integer> getAlertIds() {
    return alertIds;
  }

  public void setAlertIds(List<Integer> alertIds) {
    this.alertIds = alertIds;
  }

  public Report stat(Stat stat) {
    this.stat = stat;
    return this;
  }

   /**
   * Associated Stat
   * @return stat
  **/
  @ApiModelProperty(example = "null", value = "Associated Stat")
  public Stat getStat() {
    return stat;
  }

  public void setStat(Stat stat) {
    this.stat = stat;
  }

  public Report statId(Integer statId) {
    this.statId = statId;
    return this;
  }

   /**
   * Associated Stat ID
   * @return statId
  **/
  @ApiModelProperty(example = "null", value = "Associated Stat ID")
  public Integer getStatId() {
    return statId;
  }

  public void setStatId(Integer statId) {
    this.statId = statId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Report report = (Report) o;
    return Objects.equals(this.id, report.id) &&
        Objects.equals(this.createdAt, report.createdAt) &&
        Objects.equals(this.status, report.status) &&
        Objects.equals(this.updatedAt, report.updatedAt) &&
        Objects.equals(this.organization, report.organization) &&
        Objects.equals(this.organizationId, report.organizationId) &&
        Objects.equals(this.subOrganization, report.subOrganization) &&
        Objects.equals(this.subOrganizationId, report.subOrganizationId) &&
        Objects.equals(this.team, report.team) &&
        Objects.equals(this.teamId, report.teamId) &&
        Objects.equals(this.externalAccount, report.externalAccount) &&
        Objects.equals(this.externalAccountId, report.externalAccountId) &&
        Objects.equals(this.alerts, report.alerts) &&
        Objects.equals(this.alertIds, report.alertIds) &&
        Objects.equals(this.stat, report.stat) &&
        Objects.equals(this.statId, report.statId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, status, updatedAt, organization, organizationId, subOrganization, subOrganizationId, team, teamId, externalAccount, externalAccountId, alerts, alertIds, stat, statId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Report {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    subOrganization: ").append(toIndentedString(subOrganization)).append("\n");
    sb.append("    subOrganizationId: ").append(toIndentedString(subOrganizationId)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    externalAccount: ").append(toIndentedString(externalAccount)).append("\n");
    sb.append("    externalAccountId: ").append(toIndentedString(externalAccountId)).append("\n");
    sb.append("    alerts: ").append(toIndentedString(alerts)).append("\n");
    sb.append("    alertIds: ").append(toIndentedString(alertIds)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
    sb.append("    statId: ").append(toIndentedString(statId)).append("\n");
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
