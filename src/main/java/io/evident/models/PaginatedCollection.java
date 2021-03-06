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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * A Paginated Collection of Objects
 */
@ApiModel(description = "A Paginated Collection of Objects")

public class PaginatedCollection {
  @SerializedName("data")
  private List<Object> data = new ArrayList<Object>();

  @SerializedName("included")
  private List<Object> included = new ArrayList<Object>();

  @SerializedName("links")
  private Object links = null;

  public PaginatedCollection data(List<Object> data) {
    this.data = data;
    return this;
  }

  public PaginatedCollection addDataItem(Object dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Array of objects
   * @return data
  **/
  @ApiModelProperty(example = "null", required = true, value = "Array of objects")
  public List<Object> getData() {
    return data;
  }

  public void setData(List<Object> data) {
    this.data = data;
  }

  public PaginatedCollection included(List<Object> included) {
    this.included = included;
    return this;
  }

  public PaginatedCollection addIncludedItem(Object includedItem) {
    this.included.add(includedItem);
    return this;
  }

   /**
   * Array of related objects returned using the 'include' query parameter.
   * @return included
  **/
  @ApiModelProperty(example = "null", value = "Array of related objects returned using the 'include' query parameter.")
  public List<Object> getIncluded() {
    return included;
  }

  public void setIncluded(List<Object> included) {
    this.included = included;
  }

  public PaginatedCollection links(Object links) {
    this.links = links;
    return this;
  }

   /**
   * Pagination Links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "Pagination Links")
  public Object getLinks() {
    return links;
  }

  public void setLinks(Object links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedCollection paginatedCollection = (PaginatedCollection) o;
    return Objects.equals(this.data, paginatedCollection.data) &&
        Objects.equals(this.included, paginatedCollection.included) &&
        Objects.equals(this.links, paginatedCollection.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedCollection {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

