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
import com.appscode.voyager.client.models.ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec;
import com.appscode.voyager.client.models.ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1ObjectMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Custom Ingress type for Voyager.
 */
@ApiModel(description = "Custom Ingress type for Voyager.")

public class ComGithubAppscodeVoyagerApisVoyagerV1beta1Ingress {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("spec")
  private ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec spec = null;

  @SerializedName("status")
  private ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressStatus status = null;

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1Ingress apiVersion(String apiVersion) {
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

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1Ingress kind(String kind) {
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

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1Ingress metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard object&#39;s metadata. More info: http://releases.k8s.io/release-1.2/docs/devel/api-conventions.md#metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "Standard object's metadata. More info: http://releases.k8s.io/release-1.2/docs/devel/api-conventions.md#metadata")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1Ingress spec(ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Spec is the desired state of the Ingress. More info: http://releases.k8s.io/release-1.2/docs/devel/api-conventions.md#spec-and-status
   * @return spec
  **/
  @ApiModelProperty(value = "Spec is the desired state of the Ingress. More info: http://releases.k8s.io/release-1.2/docs/devel/api-conventions.md#spec-and-status")
  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec getSpec() {
    return spec;
  }

  public void setSpec(ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec spec) {
    this.spec = spec;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1Ingress status(ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Status is the current state of the Ingress. More info: http://releases.k8s.io/release-1.2/docs/devel/api-conventions.md#spec-and-status
   * @return status
  **/
  @ApiModelProperty(value = "Status is the current state of the Ingress. More info: http://releases.k8s.io/release-1.2/docs/devel/api-conventions.md#spec-and-status")
  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressStatus getStatus() {
    return status;
  }

  public void setStatus(ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubAppscodeVoyagerApisVoyagerV1beta1Ingress comGithubAppscodeVoyagerApisVoyagerV1beta1Ingress = (ComGithubAppscodeVoyagerApisVoyagerV1beta1Ingress) o;
    return Objects.equals(this.apiVersion, comGithubAppscodeVoyagerApisVoyagerV1beta1Ingress.apiVersion) &&
        Objects.equals(this.kind, comGithubAppscodeVoyagerApisVoyagerV1beta1Ingress.kind) &&
        Objects.equals(this.metadata, comGithubAppscodeVoyagerApisVoyagerV1beta1Ingress.metadata) &&
        Objects.equals(this.spec, comGithubAppscodeVoyagerApisVoyagerV1beta1Ingress.spec) &&
        Objects.equals(this.status, comGithubAppscodeVoyagerApisVoyagerV1beta1Ingress.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubAppscodeVoyagerApisVoyagerV1beta1Ingress {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

