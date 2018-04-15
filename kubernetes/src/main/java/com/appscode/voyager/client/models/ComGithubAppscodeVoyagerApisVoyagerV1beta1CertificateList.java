/*
 * voyager-server
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * Contact: hello@appscode.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.appscode.voyager.client.models;

import java.util.Objects;
import com.appscode.voyager.client.models.ComGithubAppscodeVoyagerApisVoyagerV1beta1Certificate;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1ListMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateList
 */

public class ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateList {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("items")
  private List<ComGithubAppscodeVoyagerApisVoyagerV1beta1Certificate> items = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ListMeta metadata = null;

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateList items(List<ComGithubAppscodeVoyagerApisVoyagerV1beta1Certificate> items) {
    this.items = items;
    return this;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateList addItemsItem(ComGithubAppscodeVoyagerApisVoyagerV1beta1Certificate itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ComGithubAppscodeVoyagerApisVoyagerV1beta1Certificate>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<ComGithubAppscodeVoyagerApisVoyagerV1beta1Certificate> getItems() {
    return items;
  }

  public void setItems(List<ComGithubAppscodeVoyagerApisVoyagerV1beta1Certificate> items) {
    this.items = items;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateList kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateList metadata(V1ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public V1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ListMeta metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateList comGithubAppscodeVoyagerApisVoyagerV1beta1CertificateList = (ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateList) o;
    return Objects.equals(this.apiVersion, comGithubAppscodeVoyagerApisVoyagerV1beta1CertificateList.apiVersion) &&
        Objects.equals(this.items, comGithubAppscodeVoyagerApisVoyagerV1beta1CertificateList.items) &&
        Objects.equals(this.kind, comGithubAppscodeVoyagerApisVoyagerV1beta1CertificateList.kind) &&
        Objects.equals(this.metadata, comGithubAppscodeVoyagerApisVoyagerV1beta1CertificateList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubAppscodeVoyagerApisVoyagerV1beta1CertificateList {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

