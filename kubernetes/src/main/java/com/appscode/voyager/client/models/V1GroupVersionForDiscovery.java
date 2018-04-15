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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GroupVersion contains the \&quot;group/version\&quot; and \&quot;version\&quot; string of a version. It is made a struct to keep extensibility.
 */
@ApiModel(description = "GroupVersion contains the \"group/version\" and \"version\" string of a version. It is made a struct to keep extensibility.")

public class V1GroupVersionForDiscovery {
  @SerializedName("groupVersion")
  private String groupVersion = null;

  @SerializedName("version")
  private String version = null;

  public V1GroupVersionForDiscovery groupVersion(String groupVersion) {
    this.groupVersion = groupVersion;
    return this;
  }

   /**
   * groupVersion specifies the API group and version in the form \&quot;group/version\&quot;
   * @return groupVersion
  **/
  @ApiModelProperty(required = true, value = "groupVersion specifies the API group and version in the form \"group/version\"")
  public String getGroupVersion() {
    return groupVersion;
  }

  public void setGroupVersion(String groupVersion) {
    this.groupVersion = groupVersion;
  }

  public V1GroupVersionForDiscovery version(String version) {
    this.version = version;
    return this;
  }

   /**
   * version specifies the version in the form of \&quot;version\&quot;. This is to save the clients the trouble of splitting the GroupVersion.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "version specifies the version in the form of \"version\". This is to save the clients the trouble of splitting the GroupVersion.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GroupVersionForDiscovery v1GroupVersionForDiscovery = (V1GroupVersionForDiscovery) o;
    return Objects.equals(this.groupVersion, v1GroupVersionForDiscovery.groupVersion) &&
        Objects.equals(this.version, v1GroupVersionForDiscovery.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupVersion, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GroupVersionForDiscovery {\n");
    
    sb.append("    groupVersion: ").append(toIndentedString(groupVersion)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
