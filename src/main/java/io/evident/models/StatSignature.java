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
import io.evident.models.Signature;
import io.evident.models.Stat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A(n) StatSignature object
 */
@ApiModel(description = "A(n) StatSignature object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-25T13:00:36.864-05:00")
public class StatSignature {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("new_1h_pass")
  private Integer new1hPass = null;

  @SerializedName("new_1d_pass")
  private Integer new1dPass = null;

  @SerializedName("new_1w_pass")
  private Integer new1wPass = null;

  @SerializedName("old_pass")
  private Integer oldPass = null;

  @SerializedName("new_1h_fail")
  private Integer new1hFail = null;

  @SerializedName("new_1d_fail")
  private Integer new1dFail = null;

  @SerializedName("new_1w_fail")
  private Integer new1wFail = null;

  @SerializedName("old_fail")
  private Integer oldFail = null;

  @SerializedName("new_1h_warn")
  private Integer new1hWarn = null;

  @SerializedName("new_1d_warn")
  private Integer new1dWarn = null;

  @SerializedName("new_1w_warn")
  private Integer new1wWarn = null;

  @SerializedName("old_warn")
  private Integer oldWarn = null;

  @SerializedName("new_1h_error")
  private Integer new1hError = null;

  @SerializedName("new_1d_error")
  private Integer new1dError = null;

  @SerializedName("new_1w_error")
  private Integer new1wError = null;

  @SerializedName("old_error")
  private Integer oldError = null;

  @SerializedName("suppressed_pass")
  private Integer suppressedPass = null;

  @SerializedName("suppressed_fail")
  private Integer suppressedFail = null;

  @SerializedName("suppressed_warn")
  private Integer suppressedWarn = null;

  @SerializedName("suppressed_error")
  private Integer suppressedError = null;

  @SerializedName("new_1h_info")
  private Integer new1hInfo = null;

  @SerializedName("new_1d_info")
  private Integer new1dInfo = null;

  @SerializedName("new_1w_info")
  private Integer new1wInfo = null;

  @SerializedName("old_info")
  private Integer oldInfo = null;

  @SerializedName("suppressed_info")
  private Integer suppressedInfo = null;

  @SerializedName("signature")
  private Signature signature = null;

  @SerializedName("signature_id")
  private Integer signatureId = null;

  @SerializedName("stat")
  private Stat stat = null;

  @SerializedName("stat_id")
  private Integer statId = null;

  public StatSignature id(Integer id) {
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

  public StatSignature new1hPass(Integer new1hPass) {
    this.new1hPass = new1hPass;
    return this;
  }

   /**
   * new_1h_pass
   * @return new1hPass
  **/
  @ApiModelProperty(example = "null", value = "new_1h_pass")
  public Integer getNew1hPass() {
    return new1hPass;
  }

  public void setNew1hPass(Integer new1hPass) {
    this.new1hPass = new1hPass;
  }

  public StatSignature new1dPass(Integer new1dPass) {
    this.new1dPass = new1dPass;
    return this;
  }

   /**
   * new_1d_pass
   * @return new1dPass
  **/
  @ApiModelProperty(example = "null", value = "new_1d_pass")
  public Integer getNew1dPass() {
    return new1dPass;
  }

  public void setNew1dPass(Integer new1dPass) {
    this.new1dPass = new1dPass;
  }

  public StatSignature new1wPass(Integer new1wPass) {
    this.new1wPass = new1wPass;
    return this;
  }

   /**
   * new_1w_pass
   * @return new1wPass
  **/
  @ApiModelProperty(example = "null", value = "new_1w_pass")
  public Integer getNew1wPass() {
    return new1wPass;
  }

  public void setNew1wPass(Integer new1wPass) {
    this.new1wPass = new1wPass;
  }

  public StatSignature oldPass(Integer oldPass) {
    this.oldPass = oldPass;
    return this;
  }

   /**
   * old_pass
   * @return oldPass
  **/
  @ApiModelProperty(example = "null", value = "old_pass")
  public Integer getOldPass() {
    return oldPass;
  }

  public void setOldPass(Integer oldPass) {
    this.oldPass = oldPass;
  }

  public StatSignature new1hFail(Integer new1hFail) {
    this.new1hFail = new1hFail;
    return this;
  }

   /**
   * new_1h_fail
   * @return new1hFail
  **/
  @ApiModelProperty(example = "null", value = "new_1h_fail")
  public Integer getNew1hFail() {
    return new1hFail;
  }

  public void setNew1hFail(Integer new1hFail) {
    this.new1hFail = new1hFail;
  }

  public StatSignature new1dFail(Integer new1dFail) {
    this.new1dFail = new1dFail;
    return this;
  }

   /**
   * new_1d_fail
   * @return new1dFail
  **/
  @ApiModelProperty(example = "null", value = "new_1d_fail")
  public Integer getNew1dFail() {
    return new1dFail;
  }

  public void setNew1dFail(Integer new1dFail) {
    this.new1dFail = new1dFail;
  }

  public StatSignature new1wFail(Integer new1wFail) {
    this.new1wFail = new1wFail;
    return this;
  }

   /**
   * new_1w_fail
   * @return new1wFail
  **/
  @ApiModelProperty(example = "null", value = "new_1w_fail")
  public Integer getNew1wFail() {
    return new1wFail;
  }

  public void setNew1wFail(Integer new1wFail) {
    this.new1wFail = new1wFail;
  }

  public StatSignature oldFail(Integer oldFail) {
    this.oldFail = oldFail;
    return this;
  }

   /**
   * old_fail
   * @return oldFail
  **/
  @ApiModelProperty(example = "null", value = "old_fail")
  public Integer getOldFail() {
    return oldFail;
  }

  public void setOldFail(Integer oldFail) {
    this.oldFail = oldFail;
  }

  public StatSignature new1hWarn(Integer new1hWarn) {
    this.new1hWarn = new1hWarn;
    return this;
  }

   /**
   * new_1h_warn
   * @return new1hWarn
  **/
  @ApiModelProperty(example = "null", value = "new_1h_warn")
  public Integer getNew1hWarn() {
    return new1hWarn;
  }

  public void setNew1hWarn(Integer new1hWarn) {
    this.new1hWarn = new1hWarn;
  }

  public StatSignature new1dWarn(Integer new1dWarn) {
    this.new1dWarn = new1dWarn;
    return this;
  }

   /**
   * new_1d_warn
   * @return new1dWarn
  **/
  @ApiModelProperty(example = "null", value = "new_1d_warn")
  public Integer getNew1dWarn() {
    return new1dWarn;
  }

  public void setNew1dWarn(Integer new1dWarn) {
    this.new1dWarn = new1dWarn;
  }

  public StatSignature new1wWarn(Integer new1wWarn) {
    this.new1wWarn = new1wWarn;
    return this;
  }

   /**
   * new_1w_warn
   * @return new1wWarn
  **/
  @ApiModelProperty(example = "null", value = "new_1w_warn")
  public Integer getNew1wWarn() {
    return new1wWarn;
  }

  public void setNew1wWarn(Integer new1wWarn) {
    this.new1wWarn = new1wWarn;
  }

  public StatSignature oldWarn(Integer oldWarn) {
    this.oldWarn = oldWarn;
    return this;
  }

   /**
   * old_warn
   * @return oldWarn
  **/
  @ApiModelProperty(example = "null", value = "old_warn")
  public Integer getOldWarn() {
    return oldWarn;
  }

  public void setOldWarn(Integer oldWarn) {
    this.oldWarn = oldWarn;
  }

  public StatSignature new1hError(Integer new1hError) {
    this.new1hError = new1hError;
    return this;
  }

   /**
   * new_1h_error
   * @return new1hError
  **/
  @ApiModelProperty(example = "null", value = "new_1h_error")
  public Integer getNew1hError() {
    return new1hError;
  }

  public void setNew1hError(Integer new1hError) {
    this.new1hError = new1hError;
  }

  public StatSignature new1dError(Integer new1dError) {
    this.new1dError = new1dError;
    return this;
  }

   /**
   * new_1d_error
   * @return new1dError
  **/
  @ApiModelProperty(example = "null", value = "new_1d_error")
  public Integer getNew1dError() {
    return new1dError;
  }

  public void setNew1dError(Integer new1dError) {
    this.new1dError = new1dError;
  }

  public StatSignature new1wError(Integer new1wError) {
    this.new1wError = new1wError;
    return this;
  }

   /**
   * new_1w_error
   * @return new1wError
  **/
  @ApiModelProperty(example = "null", value = "new_1w_error")
  public Integer getNew1wError() {
    return new1wError;
  }

  public void setNew1wError(Integer new1wError) {
    this.new1wError = new1wError;
  }

  public StatSignature oldError(Integer oldError) {
    this.oldError = oldError;
    return this;
  }

   /**
   * old_error
   * @return oldError
  **/
  @ApiModelProperty(example = "null", value = "old_error")
  public Integer getOldError() {
    return oldError;
  }

  public void setOldError(Integer oldError) {
    this.oldError = oldError;
  }

  public StatSignature suppressedPass(Integer suppressedPass) {
    this.suppressedPass = suppressedPass;
    return this;
  }

   /**
   * suppressed_pass
   * @return suppressedPass
  **/
  @ApiModelProperty(example = "null", value = "suppressed_pass")
  public Integer getSuppressedPass() {
    return suppressedPass;
  }

  public void setSuppressedPass(Integer suppressedPass) {
    this.suppressedPass = suppressedPass;
  }

  public StatSignature suppressedFail(Integer suppressedFail) {
    this.suppressedFail = suppressedFail;
    return this;
  }

   /**
   * suppressed_fail
   * @return suppressedFail
  **/
  @ApiModelProperty(example = "null", value = "suppressed_fail")
  public Integer getSuppressedFail() {
    return suppressedFail;
  }

  public void setSuppressedFail(Integer suppressedFail) {
    this.suppressedFail = suppressedFail;
  }

  public StatSignature suppressedWarn(Integer suppressedWarn) {
    this.suppressedWarn = suppressedWarn;
    return this;
  }

   /**
   * suppressed_warn
   * @return suppressedWarn
  **/
  @ApiModelProperty(example = "null", value = "suppressed_warn")
  public Integer getSuppressedWarn() {
    return suppressedWarn;
  }

  public void setSuppressedWarn(Integer suppressedWarn) {
    this.suppressedWarn = suppressedWarn;
  }

  public StatSignature suppressedError(Integer suppressedError) {
    this.suppressedError = suppressedError;
    return this;
  }

   /**
   * suppressed_error
   * @return suppressedError
  **/
  @ApiModelProperty(example = "null", value = "suppressed_error")
  public Integer getSuppressedError() {
    return suppressedError;
  }

  public void setSuppressedError(Integer suppressedError) {
    this.suppressedError = suppressedError;
  }

  public StatSignature new1hInfo(Integer new1hInfo) {
    this.new1hInfo = new1hInfo;
    return this;
  }

   /**
   * new_1h_info
   * @return new1hInfo
  **/
  @ApiModelProperty(example = "null", value = "new_1h_info")
  public Integer getNew1hInfo() {
    return new1hInfo;
  }

  public void setNew1hInfo(Integer new1hInfo) {
    this.new1hInfo = new1hInfo;
  }

  public StatSignature new1dInfo(Integer new1dInfo) {
    this.new1dInfo = new1dInfo;
    return this;
  }

   /**
   * new_1d_info
   * @return new1dInfo
  **/
  @ApiModelProperty(example = "null", value = "new_1d_info")
  public Integer getNew1dInfo() {
    return new1dInfo;
  }

  public void setNew1dInfo(Integer new1dInfo) {
    this.new1dInfo = new1dInfo;
  }

  public StatSignature new1wInfo(Integer new1wInfo) {
    this.new1wInfo = new1wInfo;
    return this;
  }

   /**
   * new_1w_info
   * @return new1wInfo
  **/
  @ApiModelProperty(example = "null", value = "new_1w_info")
  public Integer getNew1wInfo() {
    return new1wInfo;
  }

  public void setNew1wInfo(Integer new1wInfo) {
    this.new1wInfo = new1wInfo;
  }

  public StatSignature oldInfo(Integer oldInfo) {
    this.oldInfo = oldInfo;
    return this;
  }

   /**
   * old_info
   * @return oldInfo
  **/
  @ApiModelProperty(example = "null", value = "old_info")
  public Integer getOldInfo() {
    return oldInfo;
  }

  public void setOldInfo(Integer oldInfo) {
    this.oldInfo = oldInfo;
  }

  public StatSignature suppressedInfo(Integer suppressedInfo) {
    this.suppressedInfo = suppressedInfo;
    return this;
  }

   /**
   * suppressed_info
   * @return suppressedInfo
  **/
  @ApiModelProperty(example = "null", value = "suppressed_info")
  public Integer getSuppressedInfo() {
    return suppressedInfo;
  }

  public void setSuppressedInfo(Integer suppressedInfo) {
    this.suppressedInfo = suppressedInfo;
  }

  public StatSignature signature(Signature signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Associated Signature
   * @return signature
  **/
  @ApiModelProperty(example = "null", value = "Associated Signature")
  public Signature getSignature() {
    return signature;
  }

  public void setSignature(Signature signature) {
    this.signature = signature;
  }

  public StatSignature signatureId(Integer signatureId) {
    this.signatureId = signatureId;
    return this;
  }

   /**
   * Associated Signature ID
   * @return signatureId
  **/
  @ApiModelProperty(example = "null", value = "Associated Signature ID")
  public Integer getSignatureId() {
    return signatureId;
  }

  public void setSignatureId(Integer signatureId) {
    this.signatureId = signatureId;
  }

  public StatSignature stat(Stat stat) {
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

  public StatSignature statId(Integer statId) {
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
    StatSignature statSignature = (StatSignature) o;
    return Objects.equals(this.id, statSignature.id) &&
        Objects.equals(this.new1hPass, statSignature.new1hPass) &&
        Objects.equals(this.new1dPass, statSignature.new1dPass) &&
        Objects.equals(this.new1wPass, statSignature.new1wPass) &&
        Objects.equals(this.oldPass, statSignature.oldPass) &&
        Objects.equals(this.new1hFail, statSignature.new1hFail) &&
        Objects.equals(this.new1dFail, statSignature.new1dFail) &&
        Objects.equals(this.new1wFail, statSignature.new1wFail) &&
        Objects.equals(this.oldFail, statSignature.oldFail) &&
        Objects.equals(this.new1hWarn, statSignature.new1hWarn) &&
        Objects.equals(this.new1dWarn, statSignature.new1dWarn) &&
        Objects.equals(this.new1wWarn, statSignature.new1wWarn) &&
        Objects.equals(this.oldWarn, statSignature.oldWarn) &&
        Objects.equals(this.new1hError, statSignature.new1hError) &&
        Objects.equals(this.new1dError, statSignature.new1dError) &&
        Objects.equals(this.new1wError, statSignature.new1wError) &&
        Objects.equals(this.oldError, statSignature.oldError) &&
        Objects.equals(this.suppressedPass, statSignature.suppressedPass) &&
        Objects.equals(this.suppressedFail, statSignature.suppressedFail) &&
        Objects.equals(this.suppressedWarn, statSignature.suppressedWarn) &&
        Objects.equals(this.suppressedError, statSignature.suppressedError) &&
        Objects.equals(this.new1hInfo, statSignature.new1hInfo) &&
        Objects.equals(this.new1dInfo, statSignature.new1dInfo) &&
        Objects.equals(this.new1wInfo, statSignature.new1wInfo) &&
        Objects.equals(this.oldInfo, statSignature.oldInfo) &&
        Objects.equals(this.suppressedInfo, statSignature.suppressedInfo) &&
        Objects.equals(this.signature, statSignature.signature) &&
        Objects.equals(this.signatureId, statSignature.signatureId) &&
        Objects.equals(this.stat, statSignature.stat) &&
        Objects.equals(this.statId, statSignature.statId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, new1hPass, new1dPass, new1wPass, oldPass, new1hFail, new1dFail, new1wFail, oldFail, new1hWarn, new1dWarn, new1wWarn, oldWarn, new1hError, new1dError, new1wError, oldError, suppressedPass, suppressedFail, suppressedWarn, suppressedError, new1hInfo, new1dInfo, new1wInfo, oldInfo, suppressedInfo, signature, signatureId, stat, statId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatSignature {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    new1hPass: ").append(toIndentedString(new1hPass)).append("\n");
    sb.append("    new1dPass: ").append(toIndentedString(new1dPass)).append("\n");
    sb.append("    new1wPass: ").append(toIndentedString(new1wPass)).append("\n");
    sb.append("    oldPass: ").append(toIndentedString(oldPass)).append("\n");
    sb.append("    new1hFail: ").append(toIndentedString(new1hFail)).append("\n");
    sb.append("    new1dFail: ").append(toIndentedString(new1dFail)).append("\n");
    sb.append("    new1wFail: ").append(toIndentedString(new1wFail)).append("\n");
    sb.append("    oldFail: ").append(toIndentedString(oldFail)).append("\n");
    sb.append("    new1hWarn: ").append(toIndentedString(new1hWarn)).append("\n");
    sb.append("    new1dWarn: ").append(toIndentedString(new1dWarn)).append("\n");
    sb.append("    new1wWarn: ").append(toIndentedString(new1wWarn)).append("\n");
    sb.append("    oldWarn: ").append(toIndentedString(oldWarn)).append("\n");
    sb.append("    new1hError: ").append(toIndentedString(new1hError)).append("\n");
    sb.append("    new1dError: ").append(toIndentedString(new1dError)).append("\n");
    sb.append("    new1wError: ").append(toIndentedString(new1wError)).append("\n");
    sb.append("    oldError: ").append(toIndentedString(oldError)).append("\n");
    sb.append("    suppressedPass: ").append(toIndentedString(suppressedPass)).append("\n");
    sb.append("    suppressedFail: ").append(toIndentedString(suppressedFail)).append("\n");
    sb.append("    suppressedWarn: ").append(toIndentedString(suppressedWarn)).append("\n");
    sb.append("    suppressedError: ").append(toIndentedString(suppressedError)).append("\n");
    sb.append("    new1hInfo: ").append(toIndentedString(new1hInfo)).append("\n");
    sb.append("    new1dInfo: ").append(toIndentedString(new1dInfo)).append("\n");
    sb.append("    new1wInfo: ").append(toIndentedString(new1wInfo)).append("\n");
    sb.append("    oldInfo: ").append(toIndentedString(oldInfo)).append("\n");
    sb.append("    suppressedInfo: ").append(toIndentedString(suppressedInfo)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
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

